import csv
from pathlib import Path

def main():
    repo_root = Path(__file__).resolve().parent.parent
    pilot_sample_path = repo_root / "data" / "pilot_sample.csv"
    manifest_path = repo_root / "experiment" / "dataset-manifest.csv"
    output_dir = repo_root / "results"
    output_manifest_path = output_dir / "pilot_manifest.csv"

    # Read pilot unit IDs
    pilot_ids = []
    with pilot_sample_path.open("r", encoding="utf-8-sig", newline="") as f:
        reader = csv.DictReader(f)
        for row in reader:
            pilot_ids.append(row["unit_id"].strip())

    print(f"Loaded {len(pilot_ids)} pilot unit IDs: {pilot_ids}")

    # Read the dataset manifest
    selected_rows = []
    headers = []
    with manifest_path.open("r", encoding="utf-8-sig", newline="") as f:
        reader = csv.DictReader(f)
        headers = reader.fieldnames
        for row in reader:
            if row["unit_id"].strip() in pilot_ids:
                selected_rows.append(row)

    print(f"Selected {len(selected_rows)} rows matching pilot IDs.")

    # Create output directory
    output_dir.mkdir(parents=True, exist_ok=True)

    # Write pilot manifest
    with output_manifest_path.open("w", encoding="utf-8-sig", newline="") as f:
        writer = csv.DictWriter(f, fieldnames=headers)
        writer.writeheader()
        writer.writerows(selected_rows)

    print(f"Successfully wrote pilot manifest to: {output_manifest_path}")

if __name__ == "__main__":
    main()
