import argparse
import csv
import json
from pathlib import Path


def format_log_line(
    timestamp, unit_id, language, model, response_id, status,
    prompt_sha256, source_sha256, error_message
):
    fields = [
        timestamp,
        unit_id,
        language,
        model,
        response_id,
        status,
        prompt_sha256,
        source_sha256,
    ]
    if error_message:
        fields.append(error_message)
    return " | ".join(str(value) for value in fields)


def main():
    parser = argparse.ArgumentParser(description="Generate logs and CSV summary for pilot/full LLM run.")
    parser.add_argument("--manifest", type=Path, default=Path("experiment/dataset-manifest.csv"), help="Path to main manifest CSV")
    parser.add_argument("--output-dir", type=Path, required=True, help="Directory containing generated unit folders (e.g., results/pilot_requests)")
    args = parser.parse_args()

    if not args.manifest.is_file():
        raise FileNotFoundError(f"Manifest not found: {args.manifest}")
    if not args.output_dir.is_dir():
        raise FileNotFoundError(f"Output directory not found: {args.output_dir}")

    # Read manifest info
    manifest_info = {}
    with args.manifest.open("r", encoding="utf-8-sig") as f:
        reader = csv.DictReader(f)
        for row in reader:
            unit_id = row["unit_id"].strip()
            manifest_info[unit_id] = {
                "language": row["language"].strip(),
                "symbol": row["symbol"].strip(),
                "source_sha256": row["source_sha256"].strip(),
            }

    # Determine pilot vs full based on output-dir name
    dir_name = args.output_dir.name.lower()
    prefix = "pilot" if "pilot" in dir_name else "full"
    
    parent_dir = args.output_dir.parent
    csv_path = parent_dir / f"{prefix}_llm_output.csv"
    log_path = parent_dir / f"{prefix}_api_log.txt"

    # Scan output directories
    unit_dirs = sorted([d for d in args.output_dir.iterdir() if d.is_dir()])
    
    csv_rows = []
    log_lines = []

    for unit_dir in unit_dirs:
        unit_id = unit_dir.name
        info = manifest_info.get(unit_id, {"language": "unknown", "symbol": "unknown", "source_sha256": ""})
        
        metadata_file = unit_dir / "metadata.json"
        response_file = unit_dir / "response.json"
        
        # Check if tests exist
        suffix = ".java" if info["language"].lower() == "java" else ".py"
        test_file = unit_dir / f"generated_test{suffix}"
        
        status = "ERROR"
        error_msg = ""
        started_at = ""
        finished_at = ""
        response_id = "NONE"
        response_model = ""
        prompt_sha256 = ""
        source_sha256 = info["source_sha256"]
        
        if metadata_file.is_file():
            try:
                metadata = json.loads(metadata_file.read_text(encoding="utf-8"))
                started_at = metadata.get("started_at_utc", "")
                finished_at = metadata.get("finished_at_utc", "")
                response_id = metadata.get("response_id", "NONE")
                response_model = metadata.get("response_model", metadata.get("model", ""))
                prompt_sha256 = metadata.get("prompt_sha256", "")
                source_sha256 = metadata.get("source_sha256", source_sha256)
                if test_file.is_file() and test_file.stat().st_size > 0:
                    status = "OK"
            except Exception as e:
                error_msg = f"Failed to parse metadata: {str(e)}"
        else:
            error_msg = "metadata.json missing"

        # If test_file is missing but metadata exists
        if status == "ERROR" and not error_msg:
            error_msg = "generated_test file missing or empty"

        # CSV format: unit_id,language,symbol,status,response_model,response_id,generated_test_path,metadata_path,error_message
        rel_test_path = test_file.relative_to(parent_dir.parent).as_posix() if test_file.is_file() else ""
        rel_meta_path = metadata_file.relative_to(parent_dir.parent).as_posix() if metadata_file.is_file() else ""
        
        csv_rows.append({
            "unit_id": unit_id,
            "language": info["language"],
            "symbol": info["symbol"],
            "status": status,
            "response_model": response_model,
            "response_id": response_id,
            "generated_test_path": rel_test_path,
            "metadata_path": rel_meta_path,
            "error_message": error_msg
        })

        # TXT format: timestamp_utc | unit_id | language | model | response_id | status | prompt_sha256 | source_sha256 | error_message
        timestamp = finished_at if finished_at else "NONE"
        log_lines.append(
            format_log_line(
                timestamp,
                unit_id,
                info["language"],
                response_model,
                response_id,
                status,
                prompt_sha256,
                source_sha256,
                error_msg,
            )
        )

    # Write CSV
    csv_headers = ["unit_id", "language", "symbol", "status", "response_model", "response_id", "generated_test_path", "metadata_path", "error_message"]
    with csv_path.open("w", encoding="utf-8", newline="") as f:
        writer = csv.DictWriter(f, fieldnames=csv_headers)
        writer.writeheader()
        writer.writerows(csv_rows)
    print(f"Wrote CSV summary to: {csv_path}")

    # Write TXT log
    with log_path.open("w", encoding="utf-8") as f:
        for line in log_lines:
            f.write(line + "\n")
    print(f"Wrote API log to: {log_path}")

if __name__ == "__main__":
    main()
