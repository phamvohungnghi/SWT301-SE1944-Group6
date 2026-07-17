import importlib.util
import sys
import xml.etree.ElementTree as ET

import pytest

from pathlib import Path


def test_java_evaluation_module_exists():
    assert importlib.util.find_spec("evaluation.java_evaluation") is not None


def test_fixture_supports_randoop_junit4_on_junit_platform():
    pom = Path(__file__).resolve().parents[1] / "java_fixture" / "pom.xml"
    root = ET.parse(pom).getroot()
    namespace = {"m": "http://maven.apache.org/POM/4.0.0"}
    artifacts = {
        node.text for node in root.findall(".//m:dependencies/m:dependency/m:artifactId", namespace)
    }
    assert "junit-vintage-engine" in artifacts


def test_load_java_units_returns_manifest_order_and_artifacts():
    from evaluation.java_evaluation import load_java_units

    repo_root = Path(__file__).resolve().parents[2]
    units = load_java_units(repo_root)

    assert len(units) == 25
    assert units[0].unit_id == "JAVA_001_bubbleSort"
    assert units[0].symbol == "bubbleSort"
    assert units[0].cc == 6
    assert units[0].generated_test.name == "generated_test.java"
    assert units[-1].unit_id == "JAVA_025_isMatch"


def test_extract_test_class_name_handles_public_and_package_private_classes():
    from evaluation.java_evaluation import extract_test_class_name

    assert extract_test_class_name("public class PublicTest {}") == "PublicTest"
    assert extract_test_class_name("class PackagePrivateTest {}") == "PackagePrivateTest"


def test_stage_unit_preserves_raw_test_bytes_and_renames_only_the_file(tmp_path):
    from evaluation.java_evaluation import load_java_units, stage_unit

    repo_root = Path(__file__).resolve().parents[2]
    fixture_root = tmp_path / "fixture"
    (fixture_root / "src" / "main" / "java").mkdir(parents=True)
    (fixture_root / "pom.xml").write_text("<project/>", encoding="utf-8")
    (fixture_root / "src" / "main" / "java" / "JavaAlgorithms.java").write_text(
        "public class JavaAlgorithms {}", encoding="utf-8"
    )

    unit = load_java_units(repo_root)[0]
    staged = stage_unit(fixture_root, unit)

    assert staged.test_class == "JAVA_001_bubbleSortTest"
    assert staged.test_file.name == "JAVA_001_bubbleSortTest.java"
    assert staged.test_file.read_bytes() == unit.generated_test.read_bytes()
    assert staged.raw_sha256 == staged.staged_sha256


def test_classify_maven_result_distinguishes_compile_and_test_failures():
    from evaluation.java_evaluation import classify_maven_result

    compile_result = classify_maven_result(
        1, "[ERROR] COMPILATION ERROR\ncannot find symbol JAVA_001_bubbleSort"
    )
    test_result = classify_maven_result(
        1, "[ERROR] Tests run: 3, Failures: 1, Errors: 0"
    )
    success = classify_maven_result(0, "BUILD SUCCESS")

    assert compile_result == ("COMPILE_ERROR", "CANNOT_FIND_SYMBOL")
    assert test_result == ("TEST_RUNTIME_ERROR", "JUNIT_FAILURE")
    assert success == ("EXECUTABLE", "")


def test_run_logged_process_captures_output_and_exit_code(tmp_path):
    from evaluation.java_evaluation import run_logged_process

    log_path = tmp_path / "command.log"
    result = run_logged_process(
        [sys.executable, "-c", "print('captured-output')"], tmp_path, log_path
    )

    assert result.returncode == 0
    assert "captured-output" in result.output
    assert log_path.read_text(encoding="utf-8") == result.output


def test_run_logged_process_resolves_maven_cmd_on_windows(tmp_path):
    from evaluation.java_evaluation import run_logged_process

    result = run_logged_process(["mvn", "-version"], tmp_path, tmp_path / "mvn.log")

    assert result.returncode == 0
    assert "Apache Maven 3.9.16" in result.output


def test_make_executability_record_keeps_failure_and_integrity_details(tmp_path):
    from evaluation.java_evaluation import (
        CommandResult,
        JavaUnit,
        StagedUnit,
        make_executability_record,
    )

    raw = tmp_path / "generated_test.java"
    raw.write_text("class BrokenTest {}", encoding="utf-8")
    unit = JavaUnit("JAVA_999_demo", "demo", 7, raw)
    staged = StagedUnit(tmp_path, "BrokenTest", raw, "samehash", "samehash")
    result = CommandResult(
        1, "[ERROR] COMPILATION ERROR\n[ERROR] cannot find symbol JAVA_999_demo"
    )

    record = make_executability_record(unit, staged, result)

    assert record["status"] == "COMPILE_ERROR"
    assert record["error_type"] == "CANNOT_FIND_SYMBOL"
    assert "cannot find symbol" in record["error_message"]
    assert record["notes"] == "raw_sha256=samehash; staged_sha256=samehash"


def test_evaluate_executability_stages_each_unit_and_returns_one_record(tmp_path):
    from evaluation.java_evaluation import (
        CommandResult,
        evaluate_executability,
        load_java_units,
    )

    repo_root = Path(__file__).resolve().parents[2]
    fixture_root = tmp_path / "fixture"
    (fixture_root / "src" / "main" / "java").mkdir(parents=True)
    (fixture_root / "pom.xml").write_text("<project/>", encoding="utf-8")
    (fixture_root / "src" / "main" / "java" / "JavaAlgorithms.java").write_text(
        "public class JavaAlgorithms {}", encoding="utf-8"
    )
    unit = load_java_units(repo_root)[0]

    def successful_runner(command, cwd, log_path):
        assert command == [
            "mvn",
            "-o",
            "-B",
            f"-Dmaven.repo.local={fixture_root / '.m2' / 'repository'}",
            "-Dtest=JAVA_001_bubbleSortTest",
            "test",
        ]
        assert cwd.name == unit.unit_id
        return CommandResult(0, "BUILD SUCCESS")

    records = evaluate_executability(
        fixture_root, [unit], runner=successful_runner
    )

    assert len(records) == 1
    assert records[0]["unit_id"] == unit.unit_id
    assert records[0]["status"] == "EXECUTABLE"


def test_write_executability_csv_uses_protocol_column_order(tmp_path):
    from evaluation.java_evaluation import write_executability_csv

    output = tmp_path / "java_executability.csv"
    record = {
        "unit_id": "JAVA_001_bubbleSort",
        "symbol": "bubbleSort",
        "cc": 6,
        "status": "COMPILE_ERROR",
        "error_type": "CANNOT_FIND_SYMBOL",
        "error_message": "cannot find symbol",
        "generated_test_path": "results/full_requests/JAVA_001_bubbleSort/generated_test.java",
        "notes": "raw preserved",
    }

    write_executability_csv(output, [record])

    lines = output.read_text(encoding="utf-8").splitlines()
    assert lines[0] == (
        "unit_id,symbol,cc,status,error_type,error_message,generated_test_path,notes"
    )
    assert lines[1].startswith("JAVA_001_bubbleSort,bubbleSort,6,COMPILE_ERROR")


def test_non_executable_units_produce_na_coverage_and_mutation_rows():
    from evaluation.java_evaluation import JavaUnit, make_primary_metric_records

    unit = JavaUnit(
        "JAVA_001_bubbleSort", "bubbleSort", 6, Path("generated_test.java")
    )
    executability = [{"unit_id": unit.unit_id, "status": "COMPILE_ERROR"}]

    coverage, mutation = make_primary_metric_records([unit], executability)

    assert coverage == [
        {
            "unit_id": unit.unit_id,
            "symbol": "bubbleSort",
            "cc": 6,
            "executability": "COMPILE_ERROR",
            "total_branches": "NA",
            "covered_branches": "NA",
            "branch_coverage": "NA",
            "status": "NOT_RUN_NON_EXECUTABLE",
            "notes": "Primary protocol: JaCoCo not run for non-executable raw test",
        }
    ]
    assert mutation[0]["mutation_score"] == "NA"
    assert mutation[0]["status"] == "NOT_RUN_NON_EXECUTABLE"


def test_write_metric_csvs_use_protocol_headers(tmp_path):
    from evaluation.java_evaluation import write_coverage_csv, write_mutation_csv

    coverage_path = tmp_path / "java_coverage.csv"
    mutation_path = tmp_path / "java_mutation.csv"
    write_coverage_csv(coverage_path, [])
    write_mutation_csv(mutation_path, [])

    assert coverage_path.read_text(encoding="utf-8").strip() == (
        "unit_id,symbol,cc,executability,total_branches,covered_branches,"
        "branch_coverage,status,notes"
    )
    assert mutation_path.read_text(encoding="utf-8").strip() == (
        "unit_id,symbol,cc,executability,mutants_generated,mutants_killed,"
        "mutants_invalid,mutation_score,status,notes"
    )


def test_evaluate_gpt_metrics_runs_reports_only_for_executable_units(tmp_path):
    from evaluation.java_evaluation import CommandResult, JavaUnit, evaluate_gpt_metrics

    fixture = tmp_path / "fixture"
    (fixture / "src" / "main" / "java").mkdir(parents=True)
    source_pom = Path(__file__).resolve().parents[1] / "java_fixture" / "pom.xml"
    (fixture / "pom.xml").write_bytes(source_pom.read_bytes())
    (fixture / "src" / "main" / "java" / "JavaAlgorithms.java").write_text(
        "public class JavaAlgorithms { public static int[] bubbleSort(int[] a){ return a; } }",
        encoding="utf-8",
    )
    raw = tmp_path / "generated_test.java"
    raw.write_text("class BubbleSortTest {}", encoding="utf-8")
    unit = JavaUnit("JAVA_001_bubbleSort", "bubbleSort", 6, raw)

    def runner(command, cwd, log_path):
        if "test" in command and "mutationCoverage" not in " ".join(command):
            report = cwd / "target" / "site" / "jacoco" / "jacoco.xml"
            report.parent.mkdir(parents=True, exist_ok=True)
            report.write_text(
                '<report><package><class name="JavaAlgorithms"><method name="bubbleSort">'
                '<counter type="BRANCH" missed="2" covered="6"/>'
                "</method></class></package></report>",
                encoding="utf-8",
            )
        else:
            report = cwd / "target" / "pit-reports" / "mutations.xml"
            report.parent.mkdir(parents=True, exist_ok=True)
            report.write_text(
                '<mutations><mutation status="KILLED"><mutatedClass>JavaAlgorithms</mutatedClass>'
                '<mutatedMethod>bubbleSort</mutatedMethod></mutation>'
                '<mutation status="SURVIVED"><mutatedClass>JavaAlgorithms</mutatedClass>'
                '<mutatedMethod>bubbleSort</mutatedMethod></mutation></mutations>',
                encoding="utf-8",
            )
        return CommandResult(0, "BUILD SUCCESS")

    coverage, mutation = evaluate_gpt_metrics(
        fixture, [unit], [{"unit_id": unit.unit_id, "status": "EXECUTABLE"}], runner
    )

    assert coverage[0]["branch_coverage"] == 75.0
    assert mutation[0]["mutation_score"] == 50.0
    assert (fixture / "artifacts" / unit.unit_id / "jacoco.xml").is_file()
    assert (fixture / "artifacts" / unit.unit_id / "mutations.xml").is_file()


def test_build_omit_patterns_excludes_every_non_target_method():
    from evaluation.java_evaluation import JavaUnit, build_omit_patterns

    units = [
        JavaUnit("JAVA_001_a", "alpha", 5, Path("a.java")),
        JavaUnit("JAVA_002_b", "beta", 6, Path("b.java")),
        JavaUnit("JAVA_003_c", "gamma", 7, Path("c.java")),
    ]

    patterns = build_omit_patterns(units, "beta")

    assert patterns == [r"^JavaAlgorithms\.alpha\(.*\)$", r"^JavaAlgorithms\.gamma\(.*\)$"]


def test_parse_jacoco_method_coverage_uses_only_target_method(tmp_path):
    from evaluation.java_evaluation import parse_jacoco_method_coverage

    report = tmp_path / "jacoco.xml"
    report.write_text(
        """<report><package name=""><class name="JavaAlgorithms">
        <method name="bubbleSort" desc="([I)[I" line="1">
          <counter type="BRANCH" missed="2" covered="6"/>
        </method>
        <method name="other" desc="()V" line="2">
          <counter type="BRANCH" missed="10" covered="0"/>
        </method>
        </class></package></report>""",
        encoding="utf-8",
    )

    result = parse_jacoco_method_coverage(report, "bubbleSort")

    assert result == {"total_branches": 8, "covered_branches": 6, "branch_coverage": 75.0}


def test_parse_pit_method_mutations_treats_timeout_as_survived(tmp_path):
    from evaluation.java_evaluation import parse_pit_method_mutations

    report = tmp_path / "mutations.xml"
    report.write_text(
        """<mutations>
        <mutation status="KILLED"><mutatedMethod>bubbleSort</mutatedMethod></mutation>
        <mutation status="SURVIVED"><mutatedMethod>bubbleSort</mutatedMethod></mutation>
        <mutation status="TIMED_OUT"><mutatedMethod>bubbleSort</mutatedMethod></mutation>
        <mutation status="RUN_ERROR"><mutatedMethod>bubbleSort</mutatedMethod></mutation>
        <mutation status="KILLED"><mutatedMethod>other</mutatedMethod></mutation>
        </mutations>""",
        encoding="utf-8",
    )

    result = parse_pit_method_mutations(report, "bubbleSort")

    assert result["mutants_generated"] == 4
    assert result["mutants_killed"] == 1
    assert result["mutants_invalid"] == 1
    assert result["mutation_score"] == pytest.approx(100 / 3)


def test_build_randoop_command_pins_seed_time_and_target_class(tmp_path):
    from evaluation.java_evaluation import build_randoop_command

    command = build_randoop_command(
        randoop_jar=tmp_path / "randoop-all-4.3.4.jar",
        classes_dir=tmp_path / "classes",
        output_dir=tmp_path / "generated",
        omit_file=tmp_path / "omit-methods.txt",
    )

    assert command[0] == "java"
    assert "randoop.main.Main" in command
    assert "--testclass=JavaAlgorithms" in command
    assert "--time-limit=60" in command
    assert "--randomseed=20260621" in command
    assert f"--omit-methods-file={tmp_path / 'omit-methods.txt'}" in command
    assert f"--junit-output-dir={tmp_path / 'generated'}" in command
    assert "--no-error-revealing-tests=true" in command


def test_configure_pit_exclusions_adds_every_non_target_method(tmp_path):
    from evaluation.java_evaluation import configure_pit_exclusions

    source_pom = Path(__file__).resolve().parents[1] / "java_fixture" / "pom.xml"
    pom = tmp_path / "pom.xml"
    pom.write_bytes(source_pom.read_bytes())

    configure_pit_exclusions(pom, ["alpha", "gamma"])

    root = ET.parse(pom).getroot()
    namespace = {"m": "http://maven.apache.org/POM/4.0.0"}
    values = [
        node.text
        for node in root.findall(
            ".//m:plugin[m:artifactId='pitest-maven']/m:configuration/"
            "m:excludedMethods/m:param",
            namespace,
        )
    ]
    assert values == ["alpha", "gamma"]


def test_stage_randoop_tests_copies_generated_sources_and_pit_exclusions(tmp_path):
    from evaluation.java_evaluation import JavaUnit, stage_randoop_tests

    fixture_root = Path(__file__).resolve().parents[1] / "java_fixture"
    generated = tmp_path / "generated"
    generated.mkdir()
    (generated / "RandoopRegression.java").write_text(
        "public class RandoopRegression {}", encoding="utf-8"
    )
    (generated / "RandoopRegression0.java").write_text(
        "public class RandoopRegression0 {}", encoding="utf-8"
    )
    units = [
        JavaUnit("JAVA_001_a", "alpha", 5, Path("a.java")),
        JavaUnit("JAVA_002_b", "beta", 6, Path("b.java")),
    ]

    staged = stage_randoop_tests(
        fixture_root, tmp_path / "randoop", units[0], units, generated
    )

    assert staged.work_dir.name == "JAVA_001_a"
    assert (staged.work_dir / "src/test/java/RandoopRegression.java").exists()
    root = ET.parse(staged.work_dir / "pom.xml").getroot()
    namespace = {"m": "http://maven.apache.org/POM/4.0.0"}
    exclusions = [
        node.text
        for node in root.findall(
            ".//m:plugin[m:artifactId='pitest-maven']/m:configuration/"
            "m:excludedMethods/m:param",
            namespace,
        )
    ]
    assert exclusions == ["beta"]


def test_write_randoop_csv_uses_handoff_header(tmp_path):
    from evaluation.java_evaluation import write_randoop_csv

    output = tmp_path / "randoop_java_results.csv"
    write_randoop_csv(output, [])

    assert output.read_text(encoding="utf-8").strip() == (
        "unit_id,symbol,randoop_status,randoop_branch_coverage,"
        "randoop_mutation_score,notes"
    )


def test_evaluate_randoop_reports_empty_regression_suite(tmp_path):
    from evaluation.java_evaluation import CommandResult, JavaUnit, evaluate_randoop

    fixture_root = Path(__file__).resolve().parents[1] / "java_fixture"
    randoop_root = tmp_path / "randoop"
    jar = tmp_path / "randoop.jar"
    jar.write_bytes(b"placeholder")
    unit = JavaUnit("JAVA_001_alpha", "alpha", 5, Path("unused.java"))
    commands = []

    def successful_runner(command, cwd, log_path):
        commands.append(command)
        log_path.parent.mkdir(parents=True, exist_ok=True)
        log_path.write_text("ok", encoding="utf-8")
        return CommandResult(0, "ok")

    records = evaluate_randoop(
        fixture_root, randoop_root, jar, [unit], runner=successful_runner
    )

    assert records[0]["randoop_status"] == "NO_REGRESSION_TESTS"
    assert records[0]["randoop_branch_coverage"] == 0.0
    assert records[0]["randoop_mutation_score"] == 0.0
    assert commands[0][0] == "javac"
    assert "--randomseed=20260621" in commands[1]
    assert (randoop_root / unit.unit_id / "omit-methods.txt").exists()


def test_audit_java_artifacts_accepts_repository_evidence_without_metric_xml():
    from evaluation.java_evaluation import audit_java_artifacts

    repo_root = Path(__file__).resolve().parents[2]
    summary = audit_java_artifacts(repo_root, require_raw_metrics=False)

    assert summary["java_units"] == 25
    assert summary["metadata_hashes_verified"] == 25
    assert summary["result_csvs_verified"] == 4
    assert summary["randoop_units_verified"] == 25
    assert summary["randoop_java_sources_verified"] == 79
    assert summary["randoop_omit_files_verified"] == 25
    assert summary["target_isolation_violations"] == 0
    assert summary["python_full_requests_preserved"] == 25
    assert summary["java_pilot_requests_preserved"] == 5
