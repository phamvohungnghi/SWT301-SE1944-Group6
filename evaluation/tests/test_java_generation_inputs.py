import csv
import unittest
from pathlib import Path


ROOT = Path(__file__).resolve().parents[2]
SOURCE_MANIFEST = ROOT / "experiment" / "dataset-manifest.csv"
JAVA_MANIFEST = ROOT / "evaluation" / "java-manifest.csv"


def read_rows(path: Path) -> list[dict[str, str]]:
    with path.open(encoding="utf-8-sig", newline="") as handle:
        return list(csv.DictReader(handle))


class JavaGenerationInputTests(unittest.TestCase):
    def test_java_manifest_is_an_exact_25_row_projection(self) -> None:
        source_rows = read_rows(SOURCE_MANIFEST)
        expected = [row for row in source_rows if row["language"].lower() == "java"]
        actual = read_rows(JAVA_MANIFEST)

        self.assertEqual(25, len(actual))
        self.assertEqual(25, len({row["unit_id"] for row in actual}))
        self.assertEqual(expected, actual)
        self.assertTrue(all(row["isolation_status"] == "include" for row in actual))
        self.assertTrue(all(row["source_sha256"] for row in actual))


if __name__ == "__main__":
    unittest.main()
