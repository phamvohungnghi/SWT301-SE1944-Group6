# Java evaluation harness

This directory evaluates the 25 raw first-attempt Java test responses without editing their source text.

## Pinned environment

- Oracle JDK 17.0.12
- Maven 3.9.16
- JUnit Jupiter 5.11.4
- JUnit 4.13.2 for Randoop-generated suites
- JUnit Vintage 5.11.4 for executing Randoop JUnit 4 suites
- JaCoCo Maven plugin 0.8.13
- PIT Maven plugin 1.19.1
- PIT JUnit 5 plugin 1.2.1
- Randoop 4.3.4
- Generated-test model: `gpt-4o-mini` (`provider=codex-session`)

Randoop JAR SHA-256: `bc134dca4a0df20a4787148923a2f6f4d0ecf8d40d7bba16b906e8cf0bdf8baf`.
Official download URL: `https://github.com/randoop/randoop/releases/download/v4.3.4/randoop-all-4.3.4.jar`.

## Integrity rule

`java_evaluation.py` may rename a copied test file to match its declared Java class. It verifies SHA-256 before and after staging; it never edits the source content. Each unit is built in its own ignored `java_fixture/work/<unit_id>/` directory so one compile error cannot contaminate another unit.

## Harness tests

`pytest-mutagen==1.3` is incompatible with the locked `pytest==9.1.1` plugin API because it imports the removed `_pytest.python.Instance` symbol. Keep both protocol versions unchanged and disable unrelated plugin auto-loading when testing the Java harness:

```powershell
$env:PYTHONPATH='.'
$env:PYTEST_DISABLE_PLUGIN_AUTOLOAD='1'
.venv\Scripts\python.exe -m pytest evaluation\tests -q
```

## Fixture build

```powershell
mvn -f evaluation\java_fixture\pom.xml -DskipTests compile
```

## Re-running the phases

```powershell
.venv\Scripts\python.exe -m evaluation.java_evaluation executability
.venv\Scripts\python.exe -m evaluation.java_evaluation metrics
.venv\Scripts\python.exe -m evaluation.java_evaluation randoop
.venv\Scripts\python.exe -m evaluation.java_evaluation audit --stage repository
```

The Randoop phase runs each target method for 60 seconds with seed `20260621`. It stores the exact omit-methods file, generated sources, command logs, method-level JaCoCo XML, and method-filtered PIT XML under `evaluation/randoop/<unit_id>/`. Generated tests are never edited by hand. The repository keeps all 79 generated Java sources and all 25 omit-methods files; reproducible raw logs, XML reports, JARs, build directories, and caches remain local and ignored. Use `audit --stage all` when those complete local artifacts are present.

## Output contract

- `results/java_executability.csv`: one row for every Java response.
- `results/java_coverage.csv`: method-level JaCoCo branch counters; non-executable rows retain `NA`.
- `results/java_mutation.csv`: method-level PIT mutation counts; non-executable rows retain `NA`.
- `results/randoop_java_results.csv`: Randoop baseline status and metrics.
- `evaluation/java_fixture/logs/`: raw primary executability Maven/JUnit logs.
- `evaluation/randoop/<unit_id>/generated/`: the committed frozen Randoop Java suites.
- `evaluation/randoop/<unit_id>/omit-methods.txt`: the committed target-isolation rules.
- Ignored local-only evidence: Maven logs, JaCoCo XML, PIT XML, downloaded JARs, build directories, and caches.
