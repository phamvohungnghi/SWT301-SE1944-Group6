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
from datetime import datetime, timezone
from pathlib import Path
from typing import Any

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
    candidates = [func for func in analysis.function_list if func.name == expected_symbol]
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


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("--manifest", type=Path, default=Path("experiment/dataset-manifest.csv"))
    parser.add_argument("--sources-root", type=Path, required=True)
    parser.add_argument("--output-dir", type=Path, default=Path("experiment/results"))
    parser.add_argument("--mode", choices=("prepare", "generate"), default="prepare")
    parser.add_argument("--require-full", action="store_true")
    args = parser.parse_args()

    if args.mode == "generate" and "OPENAI_API_KEY" not in os.environ:
        raise SystemExit("Thiếu OPENAI_API_KEY cho mode=generate")

    rows = read_manifest(args.manifest, args.require_full)
    args.output_dir.mkdir(parents=True, exist_ok=True)
    client = OpenAI(max_retries=2, timeout=120.0) if args.mode == "generate" else None

    for row in rows:
        source_path, unit_source = extract_unit(row, args.sources_root)
        validate_cc(row, source_path)
        user_prompt = build_user_prompt(row, unit_source, args.sources_root)
        request = redacted_request(user_prompt)
        unit_dir = args.output_dir / row["unit_id"]
        unit_dir.mkdir(parents=True, exist_ok=False)
        (unit_dir / "request.json").write_text(
            json.dumps(request, ensure_ascii=False, indent=2), encoding="utf-8"
        )
        (unit_dir / "prompt.sha256").write_text(
            sha256_text(SYSTEM_PROMPT + "\n" + user_prompt) + "\n", encoding="ascii"
        )

        if client is None:
            continue

        started_at = datetime.now(timezone.utc).isoformat()
        response = client.responses.create(**request)
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


if __name__ == "__main__":
    main()
