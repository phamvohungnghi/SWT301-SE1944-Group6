"""Prepare prompts and make one reproducible LLM response per frozen unit.

This script deliberately does not pretend to run JaCoCo/PIT/Randoop. Metric
execution belongs to language-specific build fixtures whose commands/configs
must be committed before the full run.

Usage examples:
  # Prepare mode (validate manifest, hash, CC, write request.json) -- no API call
  python experiment/run_pipeline.py --manifest experiment/dataset-manifest.csv --sources-root . --output-dir results/pilot_prepare --mode prepare

  # Generate mode (call API, save responses)
  python experiment/run_pipeline.py --manifest experiment/dataset-manifest.csv --sources-root . --output-dir results/pilot_requests --mode generate

  # Full run (require exactly 25 Java + 25 Python)
  python experiment/run_pipeline.py --manifest experiment/dataset-manifest.csv --sources-root . --output-dir results/full_requests --mode generate --require-full
"""

from __future__ import annotations

import argparse
import csv
import hashlib
import json
import os
import uuid
from datetime import datetime, timezone
from pathlib import Path
from typing import Any

import httpx
import lizard
from openai import OpenAI

# ---------------------------------------------------------------------------
# Load environment variables from .env if it exists (never commit .env!)
# ---------------------------------------------------------------------------
_env_candidates = [
    ".env",
    Path(__file__).parent.parent / ".env",
    Path(__file__).parent / ".env",
]
for _env_path in _env_candidates:
    _env_path = Path(_env_path)
    if _env_path.exists():
        with open(_env_path, "r", encoding="utf-8") as _f:
            for _line in _f:
                _line = _line.strip()
                if not _line or _line.startswith("#"):
                    continue
                if "=" in _line:
                    _key, _val = _line.split("=", 1)
                    os.environ.setdefault(_key.strip(), _val.strip().strip("'\""))
        break

# ---------------------------------------------------------------------------
# Constants
# ---------------------------------------------------------------------------
MODEL = "gpt-4o-mini-2024-07-18"
TEMPERATURE = 0.0
MAX_OUTPUT_TOKENS = 2048

SYSTEM_PROMPT = """You are a software-testing specialist. Follow the requested test framework exactly.
Return only one complete executable test source file. Do not use Markdown fences.
Do not modify the production code and do not access the network, file system,
clock, environment variables, or external services unless the supplied unit explicitly requires it."""

REQUIRED_COLUMNS = {
    "unit_id", "language", "framework", "repository_url", "commit_sha",
    "license", "relative_path", "start_line", "end_line", "symbol",
    "cc_lizard_1_23_0", "isolation_status", "source_sha256",
    "reviewer_1", "reviewer_2",
}

# ---------------------------------------------------------------------------
# Helpers
# ---------------------------------------------------------------------------

def sha256_text(text: str) -> str:
    return hashlib.sha256(text.encode("utf-8")).hexdigest()


def read_manifest(path: Path, require_full: bool) -> list[dict[str, str]]:
    with path.open("r", encoding="utf-8-sig", newline="") as handle:
        reader = csv.DictReader(handle)
        columns = set(reader.fieldnames or [])
        missing = REQUIRED_COLUMNS - columns
        if missing:
            raise ValueError(f"Manifest missing columns: {sorted(missing)}")
        rows = list(reader)

    ids = [row["unit_id"].strip() for row in rows]
    if len(ids) != len(set(ids)):
        raise ValueError("Duplicate unit_id found in manifest")
    if any(not unit_id for unit_id in ids):
        raise ValueError("Empty unit_id found in manifest")

    included = [row for row in rows if row["isolation_status"].strip().lower() == "include"]
    if require_full:
        counts = {
            lang: sum(row["language"].strip().lower() == lang for row in included)
            for lang in ("java", "python")
        }
        if counts != {"java": 25, "python": 25}:
            raise ValueError(f"Full run requires exactly 25 Java + 25 Python; got {counts}")
    return included


def extract_unit(row: dict[str, str], sources_root: Path) -> tuple[Path, str]:
    source_path = (sources_root / row["relative_path"]).resolve()
    if not source_path.is_file():
        raise FileNotFoundError(f"Source file not found: {source_path}")
    text = source_path.read_text(encoding="utf-8")
    lines = text.splitlines(keepends=True)
    start, end = int(row["start_line"]), int(row["end_line"])
    if start < 1 or end < start or end > len(lines):
        raise ValueError(f"Invalid line range for {row['unit_id']}: {start}-{end} (file has {len(lines)} lines)")
    unit_source = "".join(lines[start - 1:end])
    actual_hash = sha256_text(unit_source)
    expected_hash = row["source_sha256"].strip().lower()
    if expected_hash and actual_hash != expected_hash:
        raise ValueError(
            f"SHA-256 mismatch for {row['unit_id']}:\n"
            f"  expected: {expected_hash}\n"
            f"  actual  : {actual_hash}\n"
            f"The source file was modified after manifest freeze. Do not edit source files."
        )
    return source_path, unit_source


def validate_cc(row: dict[str, str], source_path: Path) -> None:
    expected_symbol = row["symbol"].strip()
    expected_cc = int(row["cc_lizard_1_23_0"])
    analysis = lizard.analyze_file(str(source_path))

    # Lizard may return "ClassName::methodName" format for Java
    candidates = [
        func for func in analysis.function_list
        if func.name == expected_symbol
        or func.name.endswith("::" + expected_symbol)
        or func.long_name.endswith("::" + expected_symbol)
    ]
    if not candidates:
        all_names = [f.name for f in analysis.function_list]
        raise ValueError(
            f"Lizard could not find symbol '{expected_symbol}' in {source_path}\n"
            f"Available symbols: {all_names}"
        )
    if not any(func.cyclomatic_complexity == expected_cc for func in candidates):
        observed = [func.cyclomatic_complexity for func in candidates]
        raise ValueError(
            f"CC mismatch for {row['unit_id']}: expected={expected_cc}, observed={observed}"
        )
    if not 5 <= expected_cc <= 15:
        raise ValueError(f"CC out of range for {row['unit_id']}: {expected_cc}")


def get_context_for_unit(row: dict[str, str], sources_root: Path) -> str:
    """Return context so the LLM knows which class/module the function belongs to.

    Priority:
    1. minimal_context_path column (if present in manifest)
    2. Full source file (if <= 50KB)
    3. First 200 lines of source file (if > 50KB)
    4. Minimal stub fallback
    """
    # Priority 1: minimal_context_path column (if present in manifest)
    context_path = row.get("minimal_context_path", "").strip()
    if context_path:
        full_path = sources_root / context_path
        if full_path.is_file():
            return full_path.read_text(encoding="utf-8")

    # Priority 2: full source file (helps LLM know class name, imports, structure)
    source_path = sources_root / row["relative_path"]
    if source_path.is_file():
        content = source_path.read_text(encoding="utf-8")
        if len(content) <= 50_000:
            return content
        # File too large: take first 200 lines (usually contains class header + imports)
        head_lines = content.splitlines()[:200]
        return "\n".join(head_lines) + "\n// ... (truncated for brevity)"

    # Fallback: minimal stub
    lang = row["language"].strip().lower()
    if lang == "java":
        return (
            "import java.util.*;\n"
            "public class JavaAlgorithms {\n"
            "    // The target method is a public static method of this class.\n"
            "}"
        )
    elif lang == "python":
        return "# The target function is a standalone function in a module named 'python_functions'."
    return "(none)"


def build_user_prompt(row: dict[str, str], unit_source: str, sources_root: Path) -> str:
    context = get_context_for_unit(row, sources_root)
    lang = row["language"].strip()
    framework = row["framework"].strip()

    # Hướng dẫn cụ thể theo ngôn ngữ để test compile được ngay
    if lang.lower() == "java":
        extra_instructions = (
            "6. The test class must import JavaAlgorithms (or be in the same package) "
            "and call methods as JavaAlgorithms.methodName(...).\n"
            "7. Use JUnit 5 annotations (@Test, @BeforeEach, etc.).\n"
            "8. Do NOT create a separate class named after the unit_id."
        )
    elif lang.lower() == "python":
        extra_instructions = (
            "6. Import the function directly: "
            "from python_functions import <function_name>\n"
            "7. Use pytest-style test functions (def test_...).\n"
            "8. Do NOT redefine or copy the production function inside the test file."
        )
    else:
        extra_instructions = ""

    return f"""Language: {lang}
Test framework: {framework}
Production unit identifier: {row['unit_id']}

Task: Write a comprehensive unit test suite for the production unit below.
Requirements:
1. The test file must compile/run with the pinned project fixture.
2. Maximize branch coverage of the target unit.
3. Include assertions that can detect logical faults, including boundary and exceptional cases supported by the code.
4. Do not change the production unit.
5. Return only the complete test source file, without Markdown fences or explanation.
{extra_instructions}

Production context (full source file containing the target unit):
{context}

Target production unit (the specific function/method to test):
{unit_source}"""


# ---------------------------------------------------------------------------
# API call helpers
# ---------------------------------------------------------------------------

def build_chat_messages(user_prompt: str) -> list[dict[str, str]]:
    return [
        {"role": "system", "content": SYSTEM_PROMPT},
        {"role": "user", "content": user_prompt},
    ]


def call_openai_api(client: OpenAI, model: str, user_prompt: str) -> str:
    """Gọi OpenAI Chat Completions API (openai>=1.x)."""
    response = client.chat.completions.create(
        model=model,
        messages=build_chat_messages(user_prompt),
        temperature=TEMPERATURE,
        max_tokens=MAX_OUTPUT_TOKENS,
    )
    return response.choices[0].message.content or ""


def call_alternative_api(
    provider: str,
    model: str,
    user_prompt: str,
    temperature: float,
    max_tokens: int,
) -> str:
    """Gọi các API thay thế (Gemini, OpenRouter, GitHub Models, Ollama)."""
    messages = build_chat_messages(user_prompt)

    if provider == "gemini":
        api_key = os.environ.get("GEMINI_API_KEY")
        if not api_key:
            raise ValueError("GEMINI_API_KEY environment variable not set")
        url = f"https://generativelanguage.googleapis.com/v1beta/models/{model}:generateContent?key={api_key}"
        payload = {
            "systemInstruction": {"parts": [{"text": SYSTEM_PROMPT}]},
            "contents": [{"role": "user", "parts": [{"text": user_prompt}]}],
            "generationConfig": {"temperature": temperature, "maxOutputTokens": max_tokens},
        }
        res = httpx.post(url, json=payload, headers={"Content-Type": "application/json"}, timeout=120.0)
        res.raise_for_status()
        data = res.json()
        try:
            return data["candidates"][0]["content"]["parts"][0]["text"]
        except (KeyError, IndexError) as e:
            raise ValueError(f"Unexpected Gemini response: {data}") from e

    elif provider in ("openrouter", "github"):
        if provider == "openrouter":
            api_key = os.environ.get("OPENROUTER_API_KEY")
            if not api_key:
                raise ValueError("OPENROUTER_API_KEY environment variable not set")
            url = "https://openrouter.ai/api/v1/chat/completions"
        else:  # github
            api_key = os.environ.get("GITHUB_TOKEN")
            if not api_key:
                raise ValueError(
                    "GITHUB_TOKEN environment variable not set. "
                    "Set your GitHub Personal Access Token (PAT) to access GitHub Models."
                )
            url = "https://models.inference.ai.azure.com/chat/completions"

        payload = {
            "model": model,
            "messages": messages,
            "temperature": temperature,
            "max_tokens": max_tokens,
        }
        res = httpx.post(
            url,
            json=payload,
            headers={"Authorization": f"Bearer {api_key}", "Content-Type": "application/json"},
            timeout=120.0,
        )
        res.raise_for_status()
        data = res.json()
        try:
            return data["choices"][0]["message"]["content"]
        except (KeyError, IndexError) as e:
            raise ValueError(f"Unexpected {provider} response: {data}") from e

    elif provider == "ollama":
        payload = {
            "model": model,
            "messages": messages,
            "options": {"temperature": temperature, "num_predict": max_tokens},
            "stream": False,
        }
        res = httpx.post("http://localhost:11434/api/chat", json=payload, timeout=120.0)
        res.raise_for_status()
        data = res.json()
        try:
            return data["message"]["content"]
        except (KeyError, IndexError) as e:
            raise ValueError(f"Unexpected Ollama response: {data}") from e

    else:
        raise ValueError(f"Unsupported provider: {provider}")


def pick_model(provider: str, user_model: str | None) -> str:
    """Chọn model mặc định phù hợp với provider."""
    if user_model:
        return user_model
    defaults = {
        "openai": "gpt-4o-mini-2024-07-18",
        "gemini": "gemini-1.5-flash",
        "openrouter": "google/gemini-2.5-flash:free",
        "github": "gpt-4o",
        "ollama": "qwen2.5:7b",
    }
    return defaults.get(provider, MODEL)


# ---------------------------------------------------------------------------
# Response wrapper
# ---------------------------------------------------------------------------

class GeneratedResponse:
    """Wrapper thống nhất cho cả OpenAI SDK response và alternative API response."""

    def __init__(self, response_id: str, model: str, output_text: str):
        self.id = response_id
        self.model = model
        self._output_text = output_text

    @property
    def output_text(self) -> str:
        return self._output_text

    def model_dump(self) -> dict[str, Any]:
        return {
            "id": self.id,
            "object": "chat.completion",
            "model": self.model,
            "choices": [
                {
                    "message": {
                        "role": "assistant",
                        "content": self._output_text,
                    }
                }
            ],
        }


# ---------------------------------------------------------------------------
# Main
# ---------------------------------------------------------------------------

def main() -> None:
    parser = argparse.ArgumentParser(description="Run LLM pipeline for unit test generation.")
    parser.add_argument(
        "--manifest", type=Path, default=Path("experiment/dataset-manifest.csv"),
        help="Path to dataset-manifest.csv (default: experiment/dataset-manifest.csv)",
    )
    parser.add_argument(
        "--sources-root", type=Path, required=True,
        help="Root directory of source files (usually '.' = repo root)",
    )
    parser.add_argument(
        "--output-dir", type=Path, default=Path("results/pipeline_output"),
        help="Directory to save results (default: results/pipeline_output)",
    )
    parser.add_argument(
        "--mode", choices=("prepare", "generate"), default="prepare",
        help="prepare = validate manifest + write request.json (no API call). "
             "generate = call API and save responses.",
    )
    parser.add_argument(
        "--require-full", action="store_true",
        help="Require exactly 25 Java + 25 Python in manifest (use for full run).",
    )
    parser.add_argument(
        "--provider",
        choices=("openai", "gemini", "openrouter", "github", "ollama"),
        default=None,
        help="API provider. Auto-detected from environment variables if not specified.",
    )
    parser.add_argument("--model", type=str, default=None, help="Override model name.")
    args = parser.parse_args()

    # ---- Detect provider ----
    provider = args.provider
    if provider is None:
        if "OPENAI_API_KEY" in os.environ:
            provider = "openai"
        elif "GEMINI_API_KEY" in os.environ:
            provider = "gemini"
        elif "OPENROUTER_API_KEY" in os.environ:
            provider = "openrouter"
        elif "GITHUB_TOKEN" in os.environ:
            provider = "github"
        else:
            # Default: openai (sẽ báo lỗi ở bước validate nếu key thiếu)
            provider = "openai"

    # ---- Validate API key nếu mode = generate ----
    if args.mode == "generate":
        key_checks = {
            "openai": ("OPENAI_API_KEY", "https://platform.openai.com/api-keys"),
            "gemini": ("GEMINI_API_KEY", "https://aistudio.google.com/"),
            "openrouter": ("OPENROUTER_API_KEY", "https://openrouter.ai/"),
            "github": ("GITHUB_TOKEN", "GitHub Settings > Developer settings > Personal access tokens"),
        }
        if provider in key_checks:
            env_var, signup_url = key_checks[provider]
            if env_var not in os.environ:
                raise SystemExit(
                    f"ERROR: Missing {env_var} for provider '{provider}'.\n"
                    f"Get your API key at: {signup_url}\n"
                    f"Set it in PowerShell: $env:{env_var}='your-key-here'"
                )

    # ---- Resolve model ----
    model = pick_model(provider, args.model)
    print(f"[INFO] Provider: {provider} | Model: {model} | Mode: {args.mode}")

    # ---- Read manifest ----
    rows = read_manifest(args.manifest, args.require_full)
    print(f"[INFO] Loaded {len(rows)} units from {args.manifest}")
    args.output_dir.mkdir(parents=True, exist_ok=True)

    # ---- Init API client ----
    client: OpenAI | None = None
    if args.mode == "generate":
        if provider == "openai":
            client = OpenAI(max_retries=2, timeout=120.0)

    # ---- Process each unit ----
    errors: list[str] = []
    for idx, row in enumerate(rows, 1):
        unit_id = row["unit_id"]
        print(f"[{idx}/{len(rows)}] Processing {unit_id}...", end="", flush=True)

        try:
            source_path, unit_source = extract_unit(row, args.sources_root)
            validate_cc(row, source_path)
            user_prompt = build_user_prompt(row, unit_source, args.sources_root)
        except Exception as e:
            print(f" PREPARE ERROR: {e}")
            errors.append(f"{unit_id}: PREPARE_ERROR: {e}")
            continue

        # Save request.json + prompt.sha256 (always, even in prepare mode)
        request_payload = {
            "model": model,
            "messages": build_chat_messages(user_prompt),
            "temperature": TEMPERATURE,
            "max_output_tokens": MAX_OUTPUT_TOKENS,
        }
        unit_dir = args.output_dir / unit_id
        unit_dir.mkdir(parents=True, exist_ok=True)
        (unit_dir / "request.json").write_text(
            json.dumps(request_payload, ensure_ascii=False, indent=2), encoding="utf-8"
        )
        (unit_dir / "prompt.sha256").write_text(
            sha256_text(SYSTEM_PROMPT + "\n" + user_prompt) + "\n", encoding="ascii"
        )

        if args.mode == "prepare":
            print(" OK (prepare)")
            continue

        # ---- Generate mode: call API ----
        started_at = datetime.now(timezone.utc).isoformat()
        try:
            if provider == "openai" and client is not None:
                text = call_openai_api(client, model, user_prompt)
            else:
                text = call_alternative_api(
                    provider=provider,
                    model=model,
                    user_prompt=user_prompt,
                    temperature=TEMPERATURE,
                    max_tokens=MAX_OUTPUT_TOKENS,
                )
            response = GeneratedResponse(
                response_id=f"{provider}-{uuid.uuid4().hex[:12]}",
                model=model,
                output_text=text,
            )
        except Exception as e:
            print(f" API ERROR: {e}")
            if hasattr(e, "response") and e.response is not None:
                try:
                    print(f"  API body: {e.response.text}")
                except Exception:
                    pass
            errors.append(f"{unit_id}: API_ERROR: {e}")
            continue

        finished_at = datetime.now(timezone.utc).isoformat()

        # Save response
        (unit_dir / "response.json").write_text(
            json.dumps(response.model_dump(), ensure_ascii=False, indent=2), encoding="utf-8"
        )
        suffix = ".java" if row["language"].strip().lower() == "java" else ".py"
        (unit_dir / f"generated_test{suffix}").write_text(response.output_text, encoding="utf-8")

        metadata = {
            "unit_id": unit_id,
            "provider": provider,
            "model": model,
            "started_at_utc": started_at,
            "finished_at_utc": finished_at,
            "response_id": response.id,
            "prompt_sha256": sha256_text(SYSTEM_PROMPT + "\n" + user_prompt),
            "source_sha256": sha256_text(unit_source),
        }
        (unit_dir / "metadata.json").write_text(
            json.dumps(metadata, ensure_ascii=False, indent=2), encoding="utf-8"
        )
        print(" Done!")

    # ---- Summary ----
    print(f"\n[DONE] Processed {len(rows)} units. Errors: {len(errors)}")
    if errors:
        print("[ERRORS]")
        for err in errors:
            print(f"  - {err}")


if __name__ == "__main__":
    main()
