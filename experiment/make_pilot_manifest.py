"""make_pilot_manifest.py — Tạo pilot_manifest.csv từ data/pilot_sample.csv.

Script này lọc 10 unit_id từ pilot_sample.csv ra khỏi dataset-manifest.csv
và lưu thành một manifest pilot đầy đủ để run_pipeline.py có thể đọc.

Chạy từ thư mục gốc repo:
    python experiment/make_pilot_manifest.py

Output: results/pilot_manifest.csv
"""

from __future__ import annotations

import csv
from pathlib import Path

PILOT_SAMPLE = Path("data/pilot_sample.csv")
FULL_MANIFEST = Path("experiment/dataset-manifest.csv")
OUTPUT = Path("results/pilot_manifest.csv")


def main() -> None:
    # Đọc danh sách unit_id từ pilot_sample.csv
    if not PILOT_SAMPLE.exists():
        raise FileNotFoundError(f"Không tìm thấy: {PILOT_SAMPLE}")
    if not FULL_MANIFEST.exists():
        raise FileNotFoundError(f"Không tìm thấy: {FULL_MANIFEST}")

    with PILOT_SAMPLE.open("r", encoding="utf-8-sig", newline="") as f:
        pilot_ids = {row["unit_id"].strip() for row in csv.DictReader(f)}

    print(f"[INFO] Pilot sample has {len(pilot_ids)} unit_id(s): {sorted(pilot_ids)}")

    # Lọc từ manifest đầy đủ
    matched: list[dict] = []
    with FULL_MANIFEST.open("r", encoding="utf-8-sig", newline="") as f:
        reader = csv.DictReader(f)
        fieldnames = reader.fieldnames
        for row in reader:
            if row["unit_id"].strip() in pilot_ids:
                matched.append(row)

    if len(matched) != len(pilot_ids):
        found_ids = {r["unit_id"].strip() for r in matched}
        missing = pilot_ids - found_ids
        print(f"[WARNING] Not found in manifest: {missing}")

    # Ghi output
    OUTPUT.parent.mkdir(parents=True, exist_ok=True)
    with OUTPUT.open("w", encoding="utf-8", newline="") as f:
        writer = csv.DictWriter(f, fieldnames=fieldnames)
        writer.writeheader()
        writer.writerows(matched)

    print(f"[OK] Created {OUTPUT} with {len(matched)} units:")
    for row in matched:
        print(f"  - {row['unit_id']} ({row['language']}, CC={row['cc_lizard_1_23_0']})")


if __name__ == "__main__":
    main()
