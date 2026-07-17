# Quan Java fresh-rerun handoff

Date: 2026-07-17

## Scope and provenance

- Evaluated exactly 25 Java units from `experiment/dataset-manifest.csv`.
- Python main artifacts (25 directories) and Java pilot artifacts (5 directories) were preserved.
- Generated-test model: `gpt-4o-mini`; provider: `codex-session`.
- Each unit has raw request, response, metadata, prompt hash, generated Java test, and a SHA-256 over the actual file bytes.
- The initial GPT-4o-mini API attempt returned `429 insufficient_quota` before producing content. No response ID or token usage was fabricated.
- Raw generated tests were not repaired after generation.

## Pinned toolchain

- Java/Javac 17.0.12; Maven 3.9.16.
- JUnit Jupiter 5.11.4; JaCoCo 0.8.13; PIT 1.19.1.
- Randoop 4.3.4; seed 20260621; 60 seconds per unit.
- Randoop JAR SHA-256: `bc134dca4a0df20a4787148923a2f6f4d0ecf8d40d7bba16b906e8cf0bdf8baf`.

## Results

- GPT executability: 24/25 executable; `JAVA_016_parseCsvLine` is the retained first-attempt compile error.
- GPT branch coverage: 24 measured rows and 1 justified `NA`; median 95.45%.
- GPT mutation: 24 measured rows and 1 justified `NA`; median 86.61%.
- Randoop: 25/25 successful result rows; median mutation score 15.38%.
- Randoop target isolation: 0 violations across 25 suites.
- RQ2 paired units: 24; median GPT-minus-Randoop mutation difference 62.14 percentage points; one-sided Wilcoxon p=6.58135e-05.
- No integrated Java/Python conclusion is made.

## Reproduction commands

```powershell
$env:PYTEST_DISABLE_PLUGIN_AUTOLOAD='1'
.venv\Scripts\python.exe -m pytest evaluation\tests -q
mvn -f evaluation\java_fixture\pom.xml -o -B "-Dmaven.repo.local=<workspace>\evaluation\java_fixture\.m2\repository" -DskipTests compile
.venv\Scripts\python.exe -m evaluation.java_evaluation executability
.venv\Scripts\python.exe -m evaluation.java_evaluation metrics
.venv\Scripts\python.exe -m evaluation.java_evaluation randoop
.venv\Scripts\python.exe -m evaluation.java_statistics
.venv\Scripts\python.exe -m evaluation.java_evaluation audit --stage repository
```

Primary CSVs are `results/java_executability.csv`, `results/java_coverage.csv`, `results/java_mutation.csv`, and `results/randoop_java_results.csv`. The RQ2 output is `results/java_rq2_analysis.csv`; the generated narrative is `team-synthesis/quan-java-results-rbl4.md`.

The GitHub publication keeps the complete 79-file Randoop Java source set and all 25 omit-methods files. Raw execution logs, JaCoCo/PIT XML, downloaded JARs, build output, caches, and `docs/superpowers` are intentionally excluded.
