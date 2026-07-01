"""Prepare prompts and make one reproducible OpenAI response per frozen unit.

This script deliberately does not pretend to run JaCoCo/PIT/Randoop. Metric
execution belongs to language-specific build fixtures whose commands/configs
must be committed before the full run.
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



MODEL = "gpt-4o-2024-08-06"
TEMPERATURE = 0.2
TOP_P = 1.0
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


def sha256_text(text: str) -> str:
    return hashlib.sha256(text.encode("utf-8")).hexdigest()


def read_manifest(path: Path, require_full: bool) -> list[dict[str, str]]:
    with path.open("r", encoding="utf-8-sig", newline="") as handle:
        reader = csv.DictReader(handle)
        columns = set(reader.fieldnames or [])
        missing = REQUIRED_COLUMNS - columns
        if missing:
            raise ValueError(f"Manifest thiếu cột: {sorted(missing)}")
        rows = list(reader)

    ids = [row["unit_id"].strip() for row in rows]
    if len(ids) != len(set(ids)):
        raise ValueError("unit_id bị trùng")
    if any(not unit_id for unit_id in ids):
        raise ValueError("unit_id không được để trống")

    included = [row for row in rows if row["isolation_status"].strip().lower() == "include"]
    if require_full:
        counts = {
            lang: sum(row["language"].strip().lower() == lang for row in included)
            for lang in ("java", "python")
        }
        if counts != {"java": 25, "python": 25}:
            raise ValueError(f"Full run cần đúng 25 Java + 25 Python; hiện có {counts}")
    return included


def extract_unit(row: dict[str, str], sources_root: Path) -> tuple[Path, str]:
    source_path = (sources_root / row["relative_path"]).resolve()
    if not source_path.is_file():
        raise FileNotFoundError(f"Không tìm thấy source: {source_path}")
    text = source_path.read_text(encoding="utf-8")
    lines = text.splitlines(keepends=True)
    start, end = int(row["start_line"]), int(row["end_line"])
    if start < 1 or end < start or end > len(lines):
        raise ValueError(f"Line range không hợp lệ cho {row['unit_id']}: {start}-{end}")
    unit_source = "".join(lines[start - 1:end])
    actual_hash = sha256_text(unit_source)
    expected_hash = row["source_sha256"].strip().lower()
    if expected_hash and actual_hash != expected_hash:
        raise ValueError(f"SHA-256 mismatch cho {row['unit_id']}")
    return source_path, unit_source


def validate_cc(row: dict[str, str], source_path: Path) -> None:
    expected_symbol = row["symbol"].strip()
    expected_cc = int(row["cc_lizard_1_23_0"])
    analysis = lizard.analyze_file(str(source_path))
    candidates = [
        func for func in analysis.function_list
        if func.name == expected_symbol or func.name.endswith("::" + expected_symbol)
    ]
    if not candidates:
        raise ValueError(f"Lizard không tìm thấy symbol {expected_symbol} trong {source_path}")
    if not any(func.cyclomatic_complexity == expected_cc for func in candidates):
        observed = [func.cyclomatic_complexity for func in candidates]
        raise ValueError(f"CC mismatch cho {row['unit_id']}: expected={expected_cc}, observed={observed}")
    if not 5 <= expected_cc <= 15:
        raise ValueError(f"CC ngoài phạm vi cho {row['unit_id']}: {expected_cc}")


def build_user_prompt(row: dict[str, str], unit_source: str, sources_root: Path) -> str:
    context = "(none)"
    context_path = row.get("minimal_context_path", "").strip()
    if context_path:
        context = (sources_root / context_path).read_text(encoding="utf-8")
    return f"""Language: {row['language']}
Test framework: {row['framework']}
Production unit identifier: {row['unit_id']}

Task: Write a comprehensive unit test suite for the production unit below.
Requirements:
1. The test file must compile/run with the pinned project fixture.
2. Maximize branch coverage of the target unit.
3. Include assertions that can detect logical faults, including boundary and exceptional cases supported by the code.
4. Do not change the production unit.
5. Return only the complete test source file, without Markdown fences or explanation.

Production context required to compile the unit:
{context}

Target production unit:
{unit_source}"""


def redacted_request(user_prompt: str) -> dict[str, Any]:
    return {
        "model": MODEL,
        "input": [
            {"role": "system", "content": SYSTEM_PROMPT},
            {"role": "user", "content": user_prompt},
        ],
        "temperature": TEMPERATURE,
        "top_p": TOP_P,
        "max_output_tokens": MAX_OUTPUT_TOKENS,
    }


class MockResponse:
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
            "object": "response",
            "model": self.model,
            "output": [
                {
                    "type": "message",
                    "content": [
                        {
                            "type": "output_text",
                            "text": self._output_text
                        }
                    ]
                }
            ]
        }


def call_alternative_api(
    provider: str,
    model: str,
    system_prompt: str,
    user_prompt: str,
    temperature: float,
    top_p: float,
    max_tokens: int
) -> str:
    if provider == "gemini":
        api_key = os.environ.get("GEMINI_API_KEY")
        if not api_key:
            raise ValueError("GEMINI_API_KEY environment variable not set")
        url = f"https://generativelanguage.googleapis.com/v1beta/models/{model}:generateContent?key={api_key}"
        headers = {"Content-Type": "application/json"}
        payload = {
            "systemInstruction": {
                "parts": [{"text": system_prompt}]
            },
            "contents": [
                {"role": "user", "parts": [{"text": user_prompt}]}
            ],
            "generationConfig": {
                "temperature": temperature,
                "topP": top_p,
                "maxOutputTokens": max_tokens,
            }
        }
        res = httpx.post(url, json=payload, headers=headers, timeout=120.0)
        res.raise_for_status()
        data = res.json()
        try:
            return data["candidates"][0]["content"]["parts"][0]["text"]
        except (KeyError, IndexError) as e:
            raise ValueError(f"Unexpected response structure from Gemini API: {data}") from e

    elif provider == "openrouter":
        api_key = os.environ.get("OPENROUTER_API_KEY")
        if not api_key:
            raise ValueError("OPENROUTER_API_KEY environment variable not set")
        url = "https://openrouter.ai/api/v1/chat/completions"
        headers = {
            "Authorization": f"Bearer {api_key}",
            "Content-Type": "application/json"
        }
        payload = {
            "model": model,
            "messages": [
                {"role": "system", "content": system_prompt},
                {"role": "user", "content": user_prompt}
            ],
            "temperature": temperature,
            "top_p": top_p,
            "max_tokens": max_tokens
        }
        res = httpx.post(url, json=payload, headers=headers, timeout=120.0)
        res.raise_for_status()
        data = res.json()
        try:
            return data["choices"][0]["message"]["content"]
        except (KeyError, IndexError) as e:
            raise ValueError(f"Unexpected response structure from OpenRouter: {data}") from e

    elif provider == "github":
        api_key = os.environ.get("GITHUB_TOKEN")
        if not api_key:
            raise ValueError("GITHUB_TOKEN environment variable not set. Please set your GitHub Personal Access Token (PAT) to access GitHub Models for free.")
        url = "https://models.inference.ai.azure.com/chat/completions"
        headers = {
            "Authorization": f"Bearer {api_key}",
            "Content-Type": "application/json"
        }
        payload = {
            "model": model,
            "messages": [
                {"role": "system", "content": system_prompt},
                {"role": "user", "content": user_prompt}
            ],
            "temperature": temperature,
            "top_p": top_p,
            "max_tokens": max_tokens
        }
        res = httpx.post(url, json=payload, headers=headers, timeout=120.0)
        res.raise_for_status()
        data = res.json()
        try:
            return data["choices"][0]["message"]["content"]
        except (KeyError, IndexError) as e:
            raise ValueError(f"Unexpected response structure from GitHub Models: {data}") from e

    elif provider == "ollama":
        url = "http://localhost:11434/api/chat"
        payload = {
            "model": model,
            "messages": [
                {"role": "system", "content": system_prompt},
                {"role": "user", "content": user_prompt}
            ],
            "options": {
                "temperature": temperature,
                "top_p": top_p,
                "num_predict": max_tokens
            },
            "stream": False
        }
        res = httpx.post(url, json=payload, timeout=120.0)
        res.raise_for_status()
        data = res.json()
        try:
            return data["message"]["content"]
        except (KeyError, IndexError) as e:
            raise ValueError(f"Unexpected response structure from Ollama: {data}") from e

    else:
        raise ValueError(f"Unsupported provider: {provider}")


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("--manifest", type=Path, default=Path("experiment/dataset-manifest.csv"))
    parser.add_argument("--sources-root", type=Path, required=True)
    parser.add_argument("--output-dir", type=Path, default=Path("experiment/results"))
    parser.add_argument("--mode", choices=("prepare", "generate"), default="prepare")
    parser.add_argument("--require-full", action="store_true")
    parser.add_argument("--provider", choices=("openai", "gemini", "openrouter", "github", "ollama"), default=None)
    parser.add_argument("--model", type=str, default=None)
    args = parser.parse_args()

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
        elif args.mode == "generate":
            provider = "gemini"
        else:
            provider = "openai"

    if args.mode == "generate":
        if provider == "openai" and "OPENAI_API_KEY" not in os.environ:
            raise SystemExit("Missing OPENAI_API_KEY for openai provider.")
        elif provider == "gemini" and "GEMINI_API_KEY" not in os.environ:
            raise SystemExit("Missing GEMINI_API_KEY for gemini provider. Get a free API key at https://aistudio.google.com/")
        elif provider == "openrouter" and "OPENROUTER_API_KEY" not in os.environ:
            raise SystemExit("Missing OPENROUTER_API_KEY for openrouter provider. Get a free API key at https://openrouter.ai/")
        elif provider == "github" and "GITHUB_TOKEN" not in os.environ:
            raise SystemExit("Missing GITHUB_TOKEN for github provider. Please set your GitHub Personal Access Token (PAT).")

    rows = read_manifest(args.manifest, args.require_full)
    args.output_dir.mkdir(parents=True, exist_ok=True)

    client = None
    if args.mode == "generate":
        if provider == "openai":
            client = OpenAI(max_retries=2, timeout=120.0)
        else:
            client = "alternative"

    for row in rows:
        source_path, unit_source = extract_unit(row, args.sources_root)
        validate_cc(row, source_path)
        user_prompt = build_user_prompt(row, unit_source, args.sources_root)
        request = redacted_request(user_prompt)

        # Assign correct model based on provider and choices
        if args.model:
            request["model"] = args.model
        elif provider == "gemini":
            if request["model"].startswith("gpt-"):
                request["model"] = "gemini-1.5-flash"
        elif provider == "openrouter":
            if request["model"].startswith("gpt-"):
                request["model"] = "google/gemini-2.5-flash:free"
        elif provider == "github":
            if request["model"].startswith("gpt-"):
                request["model"] = "gpt-4o"
        elif provider == "ollama":
            if request["model"].startswith("gpt-"):
                request["model"] = "qwen2.5:7b"

        unit_dir = args.output_dir / row["unit_id"]
        unit_dir.mkdir(parents=True, exist_ok=True)
        (unit_dir / "request.json").write_text(
            json.dumps(request, ensure_ascii=False, indent=2), encoding="utf-8"
        )
        (unit_dir / "prompt.sha256").write_text(
            sha256_text(SYSTEM_PROMPT + "\n" + user_prompt) + "\n", encoding="ascii"
        )

        if client is None:
            continue

        started_at = datetime.now(timezone.utc).isoformat()
        print(f"[{provider.upper()}] Generating test for {row['unit_id']}...", end="", flush=True)
        try:
            if provider == "openai":
                response = client.responses.create(**request)
            else:
                resp_text = call_alternative_api(
                    provider=provider,
                    model=request["model"],
                    system_prompt=SYSTEM_PROMPT,
                    user_prompt=user_prompt,
                    temperature=TEMPERATURE,
                    top_p=TOP_P,
                    max_tokens=MAX_OUTPUT_TOKENS
                )
                response = MockResponse(
                    response_id=f"mock-{provider}-{uuid.uuid4().hex[:8]}",
                    model=request["model"],
                    output_text=resp_text
                )
        except Exception as e:
            print(" Failed!")
            print(f"\n[{provider.upper()} API Error] Failed for unit {row['unit_id']}: {e}")
            if hasattr(e, "response") and e.response is not None:
                try:
                    print(f"API Response: {e.response.text}")
                except Exception:
                    pass
            raise e
        finished_at = datetime.now(timezone.utc).isoformat()
        (unit_dir / "response.json").write_text(
            json.dumps(response.model_dump(), ensure_ascii=False, indent=2), encoding="utf-8"
        )
        suffix = ".java" if row["language"].strip().lower() == "java" else ".py"
        (unit_dir / f"generated_test{suffix}").write_text(response.output_text, encoding="utf-8")
        metadata = {
            "unit_id": row["unit_id"],
            "started_at_utc": started_at,
            "finished_at_utc": finished_at,
            "response_id": response.id,
            "response_model": response.model,
            "prompt_sha256": sha256_text(SYSTEM_PROMPT + "\n" + user_prompt),
            "source_sha256": sha256_text(unit_source),
            "sdk_version": "2.43.0",
        }
        (unit_dir / "metadata.json").write_text(
            json.dumps(metadata, ensure_ascii=False, indent=2), encoding="utf-8"
        )
        print(" Done!")



if __name__ == "__main__":
    main()
