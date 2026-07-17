"""Reproducible Java executability and metric evaluation harness."""

from __future__ import annotations

import argparse
import csv
import hashlib
import json
import os
import re
import shutil
import subprocess
import xml.etree.ElementTree as ET
from dataclasses import dataclass
from pathlib import Path
from typing import Callable


@dataclass(frozen=True)
class JavaUnit:
    unit_id: str
    symbol: str
    cc: int
    generated_test: Path


@dataclass(frozen=True)
class StagedUnit:
    work_dir: Path
    test_class: str
    test_file: Path
    raw_sha256: str
    staged_sha256: str


@dataclass(frozen=True)
class RandoopStage:
    work_dir: Path


@dataclass(frozen=True)
class CommandResult:
    returncode: int
    output: str


def load_java_units(repo_root: Path) -> list[JavaUnit]:
    manifest_path = repo_root / "experiment" / "dataset-manifest.csv"
    output_path = repo_root / "results" / "full_llm_output.csv"

    with manifest_path.open(encoding="utf-8-sig", newline="") as handle:
        manifest_rows = {
            row["unit_id"]: row
            for row in csv.DictReader(handle)
            if row["language"].lower() == "java"
        }
    with output_path.open(encoding="utf-8-sig", newline="") as handle:
        output_rows = [
            row for row in csv.DictReader(handle) if row["language"].lower() == "java"
        ]

    units: list[JavaUnit] = []
    for output in output_rows:
        unit_id = output["unit_id"]
        manifest = manifest_rows[unit_id]
        generated_test = repo_root / output["generated_test_path"]
        units.append(
            JavaUnit(
                unit_id=unit_id,
                symbol=manifest["symbol"],
                cc=int(manifest["cc_lizard_1_23_0"]),
                generated_test=generated_test,
            )
        )
    return units


def extract_test_class_name(source: str) -> str:
    match = re.search(r"\b(?:public\s+)?class\s+([A-Za-z_$][\w$]*)", source)
    if not match:
        raise ValueError("generated Java source does not declare a class")
    return match.group(1)


def _sha256(path: Path) -> str:
    return hashlib.sha256(path.read_bytes()).hexdigest()


def stage_unit(fixture_root: Path, unit: JavaUnit) -> StagedUnit:
    work_root = fixture_root / "work"
    work_dir = work_root / unit.unit_id
    work_root.mkdir(parents=True, exist_ok=True)
    if work_dir.exists():
        if not work_dir.resolve().is_relative_to(work_root.resolve()):
            raise ValueError(f"unsafe work directory: {work_dir}")
        shutil.rmtree(work_dir)

    main_dir = work_dir / "src" / "main" / "java"
    test_dir = work_dir / "src" / "test" / "java"
    main_dir.mkdir(parents=True)
    test_dir.mkdir(parents=True)
    shutil.copy2(fixture_root / "pom.xml", work_dir / "pom.xml")
    shutil.copy2(
        fixture_root / "src" / "main" / "java" / "JavaAlgorithms.java",
        main_dir / "JavaAlgorithms.java",
    )

    raw_source = unit.generated_test.read_text(encoding="utf-8-sig")
    test_class = extract_test_class_name(raw_source)
    test_file = test_dir / f"{test_class}.java"
    shutil.copy2(unit.generated_test, test_file)
    return StagedUnit(
        work_dir=work_dir,
        test_class=test_class,
        test_file=test_file,
        raw_sha256=_sha256(unit.generated_test),
        staged_sha256=_sha256(test_file),
    )


def classify_maven_result(returncode: int, output: str) -> tuple[str, str]:
    if returncode == 0:
        return "EXECUTABLE", ""
    lowered = output.lower()
    if "compilation error" in lowered or "compilation failure" in lowered:
        error_type = "CANNOT_FIND_SYMBOL" if "cannot find symbol" in lowered else "JAVA_COMPILATION"
        return "COMPILE_ERROR", error_type
    if "tests run:" in lowered or "there are test failures" in lowered:
        return "TEST_RUNTIME_ERROR", "JUNIT_FAILURE"
    return "TEST_RUNTIME_ERROR", "MAVEN_FAILURE"


def run_logged_process(command: list[str], cwd: Path, log_path: Path) -> CommandResult:
    resolved_command = list(command)
    executable = shutil.which(resolved_command[0])
    if executable:
        resolved_command[0] = executable
    completed = subprocess.run(
        resolved_command,
        cwd=cwd,
        stdout=subprocess.PIPE,
        stderr=subprocess.STDOUT,
        text=True,
        encoding="utf-8",
        errors="replace",
        check=False,
    )
    log_path.parent.mkdir(parents=True, exist_ok=True)
    log_path.write_text(completed.stdout, encoding="utf-8")
    return CommandResult(completed.returncode, completed.stdout)


def _concise_error(output: str) -> str:
    lines = [line.strip() for line in output.splitlines() if line.strip()]
    for needle in ("cannot find symbol", "COMPILATION ERROR", "Tests run:", "BUILD FAILURE"):
        for line in lines:
            if needle.lower() in line.lower():
                return line[:1000]
    return (lines[-1] if lines else "Maven exited without diagnostic output")[:1000]


def make_executability_record(
    unit: JavaUnit, staged: StagedUnit, result: CommandResult
) -> dict[str, object]:
    status, error_type = classify_maven_result(result.returncode, result.output)
    return {
        "unit_id": unit.unit_id,
        "symbol": unit.symbol,
        "cc": unit.cc,
        "status": status,
        "error_type": error_type,
        "error_message": "" if result.returncode == 0 else _concise_error(result.output),
        "generated_test_path": unit.generated_test.as_posix(),
        "notes": (
            f"raw_sha256={staged.raw_sha256}; "
            f"staged_sha256={staged.staged_sha256}"
        ),
    }


Runner = Callable[[list[str], Path, Path], CommandResult]

EXECUTABILITY_COLUMNS = [
    "unit_id",
    "symbol",
    "cc",
    "status",
    "error_type",
    "error_message",
    "generated_test_path",
    "notes",
]

COVERAGE_COLUMNS = [
    "unit_id",
    "symbol",
    "cc",
    "executability",
    "total_branches",
    "covered_branches",
    "branch_coverage",
    "status",
    "notes",
]

MUTATION_COLUMNS = [
    "unit_id",
    "symbol",
    "cc",
    "executability",
    "mutants_generated",
    "mutants_killed",
    "mutants_invalid",
    "mutation_score",
    "status",
    "notes",
]

RANDOOP_COLUMNS = [
    "unit_id",
    "symbol",
    "randoop_status",
    "randoop_branch_coverage",
    "randoop_mutation_score",
    "notes",
]


def evaluate_executability(
    fixture_root: Path,
    units: list[JavaUnit],
    runner: Runner = run_logged_process,
) -> list[dict[str, object]]:
    records: list[dict[str, object]] = []
    local_repository = fixture_root / ".m2" / "repository"
    for unit in units:
        staged = stage_unit(fixture_root, unit)
        log_path = fixture_root / "logs" / unit.unit_id / "test.log"
        result = runner(
            [
                "mvn",
                "-o",
                "-B",
                f"-Dmaven.repo.local={local_repository}",
                f"-Dtest={staged.test_class}",
                "test",
            ],
            staged.work_dir,
            log_path,
        )
        records.append(make_executability_record(unit, staged, result))
    return records


def write_executability_csv(path: Path, records: list[dict[str, object]]) -> None:
    path.parent.mkdir(parents=True, exist_ok=True)
    with path.open("w", encoding="utf-8", newline="") as handle:
        writer = csv.DictWriter(handle, fieldnames=EXECUTABILITY_COLUMNS)
        writer.writeheader()
        writer.writerows(records)


def make_primary_metric_records(
    units: list[JavaUnit], executability: list[dict[str, str]]
) -> tuple[list[dict[str, object]], list[dict[str, object]]]:
    statuses = {row["unit_id"]: row["status"] for row in executability}
    coverage: list[dict[str, object]] = []
    mutation: list[dict[str, object]] = []
    for unit in units:
        status = statuses[unit.unit_id]
        if status == "EXECUTABLE":
            raise ValueError(
                f"{unit.unit_id} is executable; JaCoCo/PIT results must be parsed, not replaced with NA"
            )
        coverage.append(
            {
                "unit_id": unit.unit_id,
                "symbol": unit.symbol,
                "cc": unit.cc,
                "executability": status,
                "total_branches": "NA",
                "covered_branches": "NA",
                "branch_coverage": "NA",
                "status": "NOT_RUN_NON_EXECUTABLE",
                "notes": "Primary protocol: JaCoCo not run for non-executable raw test",
            }
        )
        mutation.append(
            {
                "unit_id": unit.unit_id,
                "symbol": unit.symbol,
                "cc": unit.cc,
                "executability": status,
                "mutants_generated": "NA",
                "mutants_killed": "NA",
                "mutants_invalid": "NA",
                "mutation_score": "NA",
                "status": "NOT_RUN_NON_EXECUTABLE",
                "notes": "Primary protocol: PIT not run for non-executable raw test",
            }
        )
    return coverage, mutation


def evaluate_gpt_metrics(
    fixture_root: Path,
    units: list[JavaUnit],
    executability: list[dict[str, str]],
    runner: Runner = run_logged_process,
) -> tuple[list[dict[str, object]], list[dict[str, object]]]:
    """Measure method-level JaCoCo and PIT for executable raw GPT suites."""
    statuses = {row["unit_id"]: row["status"] for row in executability}
    local_repository = fixture_root / ".m2" / "repository"
    coverage_records: list[dict[str, object]] = []
    mutation_records: list[dict[str, object]] = []

    for index, unit in enumerate(units, start=1):
        status = statuses[unit.unit_id]
        if status != "EXECUTABLE":
            coverage, mutation = make_primary_metric_records(
                [unit], [{"unit_id": unit.unit_id, "status": status}]
            )
            coverage_records.extend(coverage)
            mutation_records.extend(mutation)
            continue

        print(f"[{index}/{len(units)}] GPT metrics: {unit.unit_id}", flush=True)
        staged = stage_unit(fixture_root, unit)
        configure_pit_exclusions(
            staged.work_dir / "pom.xml",
            [candidate.symbol for candidate in units if candidate.symbol != unit.symbol],
        )
        artifact_dir = fixture_root / "artifacts" / unit.unit_id
        artifact_dir.mkdir(parents=True, exist_ok=True)

        test_result = runner(
            [
                "mvn",
                "-o",
                "-B",
                f"-Dmaven.repo.local={local_repository}",
                f"-Dtest={staged.test_class}",
                "test",
            ],
            staged.work_dir,
            fixture_root / "logs" / unit.unit_id / "coverage.log",
        )
        if test_result.returncode != 0:
            raise RuntimeError(
                f"JaCoCo test rerun failed for {unit.unit_id}: "
                + _concise_error(test_result.output)
            )
        jacoco_source = staged.work_dir / "target" / "site" / "jacoco" / "jacoco.xml"
        if not jacoco_source.is_file():
            raise RuntimeError(f"JaCoCo report missing for {unit.unit_id}")
        jacoco_copy = artifact_dir / "jacoco.xml"
        shutil.copy2(jacoco_source, jacoco_copy)
        coverage = parse_jacoco_method_coverage(jacoco_copy, unit.symbol)

        pit_result = runner(
            [
                "mvn",
                "-o",
                "-B",
                f"-Dmaven.repo.local={local_repository}",
                f"-Dpitest.targetTests={staged.test_class}",
                "test-compile",
                "org.pitest:pitest-maven:mutationCoverage",
            ],
            staged.work_dir,
            fixture_root / "logs" / unit.unit_id / "pit.log",
        )
        if pit_result.returncode != 0:
            raise RuntimeError(
                f"PIT failed for {unit.unit_id}: " + _concise_error(pit_result.output)
            )
        pit_source = staged.work_dir / "target" / "pit-reports" / "mutations.xml"
        if not pit_source.is_file():
            raise RuntimeError(f"PIT report missing for {unit.unit_id}")
        pit_copy = artifact_dir / "mutations.xml"
        shutil.copy2(pit_source, pit_copy)
        mutation = parse_pit_method_mutations(pit_copy, unit.symbol)

        coverage_records.append(
            {
                "unit_id": unit.unit_id,
                "symbol": unit.symbol,
                "cc": unit.cc,
                "executability": status,
                "total_branches": coverage["total_branches"],
                "covered_branches": coverage["covered_branches"],
                "branch_coverage": coverage["branch_coverage"],
                "status": "MEASURED",
                "notes": (
                    f"method-level JaCoCo; branches="
                    f"{coverage['covered_branches']}/{coverage['total_branches']}"
                ),
            }
        )
        mutation_records.append(
            {
                "unit_id": unit.unit_id,
                "symbol": unit.symbol,
                "cc": unit.cc,
                "executability": status,
                "mutants_generated": mutation["mutants_generated"],
                "mutants_killed": mutation["mutants_killed"],
                "mutants_invalid": mutation["mutants_invalid"],
                "mutation_score": mutation["mutation_score"],
                "status": "MEASURED",
                "notes": "method-level PIT; timeout mutants counted as survived",
            }
        )

    return coverage_records, mutation_records


def _write_csv(
    path: Path, columns: list[str], records: list[dict[str, object]]
) -> None:
    path.parent.mkdir(parents=True, exist_ok=True)
    with path.open("w", encoding="utf-8", newline="") as handle:
        writer = csv.DictWriter(handle, fieldnames=columns)
        writer.writeheader()
        writer.writerows(records)


def write_coverage_csv(path: Path, records: list[dict[str, object]]) -> None:
    _write_csv(path, COVERAGE_COLUMNS, records)


def write_mutation_csv(path: Path, records: list[dict[str, object]]) -> None:
    _write_csv(path, MUTATION_COLUMNS, records)


def write_randoop_csv(path: Path, records: list[dict[str, object]]) -> None:
    _write_csv(path, RANDOOP_COLUMNS, records)


def build_omit_patterns(units: list[JavaUnit], target_symbol: str) -> list[str]:
    return [
        rf"^JavaAlgorithms\.{re.escape(unit.symbol)}\(.*\)$"
        for unit in units
        if unit.symbol != target_symbol
    ]


def parse_jacoco_method_coverage(report: Path, symbol: str) -> dict[str, object]:
    root = ET.parse(report).getroot()
    counters = []
    for method in root.findall(".//class[@name='JavaAlgorithms']/method"):
        if method.get("name") == symbol:
            counter = method.find("counter[@type='BRANCH']")
            if counter is not None:
                counters.append(counter)
    if not counters:
        raise ValueError(f"JaCoCo report has no branch counter for {symbol}")
    missed = sum(int(counter.get("missed", "0")) for counter in counters)
    covered = sum(int(counter.get("covered", "0")) for counter in counters)
    total = missed + covered
    return {
        "total_branches": total,
        "covered_branches": covered,
        "branch_coverage": (covered / total * 100.0) if total else 100.0,
    }


def parse_pit_method_mutations(report: Path, symbol: str) -> dict[str, object]:
    root = ET.parse(report).getroot()
    mutations = [
        mutation
        for mutation in root.findall("mutation")
        if mutation.findtext("mutatedMethod") == symbol
    ]
    if not mutations:
        raise ValueError(f"PIT report has no mutants for {symbol}")
    statuses = [mutation.get("status", "") for mutation in mutations]
    invalid_statuses = {"NON_VIABLE", "RUN_ERROR", "MEMORY_ERROR"}
    killed = sum(status == "KILLED" for status in statuses)
    invalid = sum(status in invalid_statuses for status in statuses)
    denominator = len(mutations) - invalid
    return {
        "mutants_generated": len(mutations),
        "mutants_killed": killed,
        "mutants_invalid": invalid,
        "mutation_score": (killed / denominator * 100.0) if denominator else 0.0,
    }


def build_randoop_command(
    randoop_jar: Path, classes_dir: Path, output_dir: Path, omit_file: Path
) -> list[str]:
    classpath = os.pathsep.join((str(classes_dir), str(randoop_jar)))
    return [
        "java",
        "-Xmx3000m",
        "-classpath",
        classpath,
        "randoop.main.Main",
        "gentests",
        "--testclass=JavaAlgorithms",
        f"--omit-methods-file={omit_file}",
        "--time-limit=60",
        "--randomseed=20260621",
        f"--junit-output-dir={output_dir}",
        "--regression-test-basename=RandoopRegression",
        "--no-error-revealing-tests=true",
        "--only-test-public-members=true",
        "--progressdisplay=false",
    ]


def configure_pit_exclusions(pom: Path, excluded_methods: list[str]) -> None:
    namespace_uri = "http://maven.apache.org/POM/4.0.0"
    namespace = {"m": namespace_uri}
    ET.register_namespace("", namespace_uri)
    tree = ET.parse(pom)
    root = tree.getroot()
    configuration = root.find(
        ".//m:plugin[m:artifactId='pitest-maven']/m:configuration", namespace
    )
    if configuration is None:
        raise ValueError("pom.xml has no pitest-maven configuration")
    existing = configuration.find("m:excludedMethods", namespace)
    if existing is not None:
        configuration.remove(existing)
    excluded = ET.SubElement(configuration, f"{{{namespace_uri}}}excludedMethods")
    for method in excluded_methods:
        param = ET.SubElement(excluded, f"{{{namespace_uri}}}param")
        param.text = method
    tree.write(pom, encoding="utf-8", xml_declaration=True)


def stage_randoop_tests(
    fixture_root: Path,
    randoop_root: Path,
    unit: JavaUnit,
    units: list[JavaUnit],
    generated_dir: Path,
) -> RandoopStage:
    work_root = randoop_root / "work"
    work_dir = work_root / unit.unit_id
    work_root.mkdir(parents=True, exist_ok=True)
    if work_dir.exists():
        if not work_dir.resolve().is_relative_to(work_root.resolve()):
            raise ValueError(f"unsafe Randoop work directory: {work_dir}")
        shutil.rmtree(work_dir)

    main_dir = work_dir / "src" / "main" / "java"
    test_dir = work_dir / "src" / "test" / "java"
    main_dir.mkdir(parents=True)
    test_dir.mkdir(parents=True)
    shutil.copy2(fixture_root / "pom.xml", work_dir / "pom.xml")
    shutil.copy2(
        fixture_root / "src" / "main" / "java" / "JavaAlgorithms.java",
        main_dir / "JavaAlgorithms.java",
    )
    for generated_test in sorted(generated_dir.rglob("*.java")):
        shutil.copy2(generated_test, test_dir / generated_test.name)
    configure_pit_exclusions(
        work_dir / "pom.xml",
        [candidate.symbol for candidate in units if candidate.symbol != unit.symbol],
    )
    return RandoopStage(work_dir=work_dir)


def _randoop_record(
    unit: JavaUnit,
    status: str,
    coverage: object = "NA",
    mutation: object = "NA",
    notes: str = "",
) -> dict[str, object]:
    return {
        "unit_id": unit.unit_id,
        "symbol": unit.symbol,
        "randoop_status": status,
        "randoop_branch_coverage": coverage,
        "randoop_mutation_score": mutation,
        "notes": notes,
    }


def evaluate_randoop(
    fixture_root: Path,
    randoop_root: Path,
    randoop_jar: Path,
    units: list[JavaUnit],
    runner: Runner = run_logged_process,
) -> list[dict[str, object]]:
    """Run a deterministic, method-isolated Randoop baseline for each Java unit."""
    classes_dir = randoop_root / "classes"
    classes_dir.mkdir(parents=True, exist_ok=True)
    compile_result = runner(
        [
            "javac",
            "-d",
            str(classes_dir),
            str(fixture_root / "src" / "main" / "java" / "JavaAlgorithms.java"),
        ],
        fixture_root,
        randoop_root / "compile-production.log",
    )
    if compile_result.returncode != 0:
        raise RuntimeError(
            "Randoop production compile failed: " + _concise_error(compile_result.output)
        )

    local_repository = fixture_root / ".m2" / "repository"
    records: list[dict[str, object]] = []
    for index, unit in enumerate(units, start=1):
        print(
            f"[{index}/{len(units)}] Randoop baseline: {unit.unit_id}",
            flush=True,
        )
        unit_dir = randoop_root / unit.unit_id
        generated_dir = unit_dir / "generated"
        if generated_dir.exists():
            if not generated_dir.resolve().is_relative_to(randoop_root.resolve()):
                raise ValueError(f"unsafe Randoop output directory: {generated_dir}")
            shutil.rmtree(generated_dir)
        generated_dir.mkdir(parents=True, exist_ok=True)

        omit_file = unit_dir / "omit-methods.txt"
        omit_file.write_text(
            "\n".join(build_omit_patterns(units, unit.symbol)) + "\n",
            encoding="utf-8",
        )
        generation = runner(
            build_randoop_command(
                randoop_jar, classes_dir, generated_dir, omit_file
            ),
            fixture_root,
            unit_dir / "generation.log",
        )
        protocol_note = "Randoop 4.3.4; seed=20260621; time_limit=60s"
        if generation.returncode != 0:
            records.append(
                _randoop_record(
                    unit,
                    "GENERATION_ERROR",
                    notes=f"{protocol_note}; {_concise_error(generation.output)}",
                )
            )
            continue

        generated_tests = sorted(generated_dir.rglob("RandoopRegression*.java"))
        if not generated_tests:
            records.append(
                _randoop_record(
                    unit,
                    "NO_REGRESSION_TESTS",
                    coverage=0.0,
                    mutation=0.0,
                    notes=f"{protocol_note}; generated_tests=0",
                )
            )
            continue

        staged = stage_randoop_tests(
            fixture_root, randoop_root, unit, units, generated_dir
        )
        test_result = runner(
            [
                "mvn",
                "-o",
                "-B",
                f"-Dmaven.repo.local={local_repository}",
                "-Dtest=RandoopRegression",
                "test",
            ],
            staged.work_dir,
            unit_dir / "maven-test.log",
        )
        if test_result.returncode != 0:
            records.append(
                _randoop_record(
                    unit,
                    "REGRESSION_TEST_ERROR",
                    notes=f"{protocol_note}; {_concise_error(test_result.output)}",
                )
            )
            continue

        jacoco_source = staged.work_dir / "target" / "site" / "jacoco" / "jacoco.xml"
        if not jacoco_source.exists():
            records.append(
                _randoop_record(
                    unit,
                    "JACOCO_REPORT_MISSING",
                    notes=f"{protocol_note}; generated_tests={len(generated_tests)}",
                )
            )
            continue
        jacoco_copy = unit_dir / "jacoco.xml"
        shutil.copy2(jacoco_source, jacoco_copy)
        try:
            coverage = parse_jacoco_method_coverage(jacoco_copy, unit.symbol)
        except ValueError as error:
            records.append(
                _randoop_record(unit, "JACOCO_METHOD_MISSING", notes=f"{protocol_note}; {error}")
            )
            continue

        pit_result = runner(
            [
                "mvn",
                "-o",
                "-B",
                f"-Dmaven.repo.local={local_repository}",
                "-Dpitest.targetTests=RandoopRegression",
                "test-compile",
                "org.pitest:pitest-maven:mutationCoverage",
            ],
            staged.work_dir,
            unit_dir / "pit.log",
        )
        if pit_result.returncode != 0:
            records.append(
                _randoop_record(
                    unit,
                    "PIT_ERROR",
                    coverage=coverage["branch_coverage"],
                    notes=f"{protocol_note}; {_concise_error(pit_result.output)}",
                )
            )
            continue

        pit_source = staged.work_dir / "target" / "pit-reports" / "mutations.xml"
        if not pit_source.exists():
            records.append(
                _randoop_record(
                    unit,
                    "PIT_REPORT_MISSING",
                    coverage=coverage["branch_coverage"],
                    notes=f"{protocol_note}; generated_tests={len(generated_tests)}",
                )
            )
            continue
        pit_copy = unit_dir / "mutations.xml"
        shutil.copy2(pit_source, pit_copy)
        try:
            mutation = parse_pit_method_mutations(pit_copy, unit.symbol)
        except ValueError as error:
            records.append(
                _randoop_record(
                    unit,
                    "PIT_METHOD_MISSING",
                    coverage=coverage["branch_coverage"],
                    notes=f"{protocol_note}; {error}",
                )
            )
            continue

        records.append(
            _randoop_record(
                unit,
                "OK",
                coverage=coverage["branch_coverage"],
                mutation=mutation["mutation_score"],
                notes=(
                    f"{protocol_note}; generated_tests={len(generated_tests)}; "
                    f"branches={coverage['covered_branches']}/{coverage['total_branches']}; "
                    f"mutants={mutation['mutants_killed']}/{mutation['mutants_generated']}; "
                    f"invalid_mutants={mutation['mutants_invalid']}"
                ),
            )
        )
        print(f"[{index}/{len(units)}] completed: {unit.unit_id}", flush=True)
    return records


def _read_csv_rows(path: Path) -> list[dict[str, str]]:
    with path.open(encoding="utf-8-sig", newline="") as handle:
        return list(csv.DictReader(handle))


def audit_java_artifacts(
    repo_root: Path, *, require_raw_metrics: bool = True
) -> dict[str, int]:
    """Fail closed unless the committed Java run is complete and traceable."""
    repo_root = repo_root.resolve()
    units = load_java_units(repo_root)
    expected_ids = {unit.unit_id for unit in units}
    if len(units) != 25 or len(expected_ids) != 25:
        raise ValueError(f"expected 25 unique Java units, found {len(expected_ids)}")

    hashes_verified = 0
    for unit in units:
        request_dir = unit.generated_test.parent
        required = [
            unit.generated_test,
            request_dir / "request.json",
            request_dir / "response.json",
            request_dir / "metadata.json",
        ]
        missing = [str(path) for path in required if not path.is_file()]
        if missing:
            raise ValueError(f"{unit.unit_id}: missing raw artifacts: {missing}")
        metadata = json.loads((request_dir / "metadata.json").read_text(encoding="utf-8"))
        if metadata.get("unit_id") != unit.unit_id:
            raise ValueError(f"{unit.unit_id}: metadata unit_id mismatch")
        if metadata.get("provider") != "codex-session":
            raise ValueError(f"{unit.unit_id}: unexpected provider")
        if metadata.get("model") != "gpt-4o-mini":
            raise ValueError(f"{unit.unit_id}: unexpected model")
        if metadata.get("generated_test_sha256") != _sha256(unit.generated_test):
            raise ValueError(f"{unit.unit_id}: generated-test hash mismatch")
        hashes_verified += 1

    csv_specs = {
        "java_executability.csv": "status",
        "java_coverage.csv": "status",
        "java_mutation.csv": "status",
        "randoop_java_results.csv": "randoop_status",
    }
    csv_rows: dict[str, list[dict[str, str]]] = {}
    for name, status_field in csv_specs.items():
        rows = _read_csv_rows(repo_root / "results" / name)
        row_ids = [row["unit_id"] for row in rows]
        if len(rows) != 25 or len(set(row_ids)) != 25 or set(row_ids) != expected_ids:
            raise ValueError(f"{name}: rows do not match the 25-unit manifest")
        if any(not row.get(status_field) for row in rows):
            raise ValueError(f"{name}: missing status value")
        csv_rows[name] = rows

    executable = {
        row["unit_id"]: row["status"] == "EXECUTABLE"
        for row in csv_rows["java_executability.csv"]
    }
    for name, score_field in (
        ("java_coverage.csv", "branch_coverage"),
        ("java_mutation.csv", "mutation_score"),
    ):
        for row in csv_rows[name]:
            score = row[score_field]
            if executable[row["unit_id"]]:
                value = float(score)
                if not 0.0 <= value <= 100.0:
                    raise ValueError(f"{name}: score outside [0, 100]")
            elif score != "NA":
                raise ValueError(f"{name}: non-executable row must use NA")

    randoop_root = repo_root / "evaluation" / "randoop"
    target_violations = 0
    randoop_java_sources = 0
    randoop_omit_files = 0
    for unit in units:
        unit_dir = randoop_root / unit.unit_id
        generated_dir = unit_dir / "generated"
        required = [unit_dir / "omit-methods.txt"]
        if require_raw_metrics:
            required.extend([unit_dir / "jacoco.xml", unit_dir / "mutations.xml"])
        java_files = sorted(generated_dir.glob("*.java"))
        if not java_files or any(not path.is_file() for path in required):
            raise ValueError(f"{unit.unit_id}: incomplete Randoop evidence")
        omit_lines = (unit_dir / "omit-methods.txt").read_text(
            encoding="utf-8"
        ).splitlines()
        expected_omit = build_omit_patterns(units, unit.symbol)
        if omit_lines != expected_omit:
            raise ValueError(f"{unit.unit_id}: omit-methods mismatch")
        randoop_java_sources += len(java_files)
        randoop_omit_files += 1
        called: set[str] = set()
        for java_file in java_files:
            source = java_file.read_text(encoding="utf-8", errors="replace")
            called.update(
                re.findall(r"\bJavaAlgorithms\.([A-Za-z_$][\w$]*)\s*\(", source)
            )
        if called != {unit.symbol}:
            target_violations += 1
    if target_violations:
        raise ValueError(f"Randoop target-isolation violations: {target_violations}")
    if randoop_java_sources != 79:
        raise ValueError(
            f"expected 79 frozen Randoop Java sources, found {randoop_java_sources}"
        )

    full_requests = repo_root / "results" / "full_requests"
    pilot_requests = repo_root / "results" / "pilot_requests"
    python_full = len(list(full_requests.glob("PY_*")))
    java_pilot = len(list(pilot_requests.glob("JAVA_*")))
    if python_full != 25 or java_pilot != 5:
        raise ValueError(
            f"preservation check failed: Python full={python_full}, Java pilot={java_pilot}"
        )

    return {
        "java_units": len(units),
        "metadata_hashes_verified": hashes_verified,
        "result_csvs_verified": len(csv_specs),
        "randoop_units_verified": len(units),
        "randoop_java_sources_verified": randoop_java_sources,
        "randoop_omit_files_verified": randoop_omit_files,
        "target_isolation_violations": target_violations,
        "python_full_requests_preserved": python_full,
        "java_pilot_requests_preserved": java_pilot,
    }


def main(argv: list[str] | None = None) -> int:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument(
        "phase", choices=["executability", "metrics", "randoop", "audit"]
    )
    parser.add_argument("--stage", choices=["all", "repository"], default="all")
    parser.add_argument(
        "--repo-root", type=Path, default=Path(__file__).resolve().parents[1]
    )
    args = parser.parse_args(argv)

    repo_root = args.repo_root.resolve()
    fixture_root = repo_root / "evaluation" / "java_fixture"
    units = load_java_units(repo_root)
    if args.phase == "executability":
        records = evaluate_executability(fixture_root, units)
        write_executability_csv(
            repo_root / "results" / "java_executability.csv", records
        )
    elif args.phase == "metrics":
        with (repo_root / "results" / "java_executability.csv").open(
            encoding="utf-8-sig", newline=""
        ) as handle:
            executability = list(csv.DictReader(handle))
        coverage, mutation = evaluate_gpt_metrics(
            fixture_root, units, executability
        )
        write_coverage_csv(repo_root / "results" / "java_coverage.csv", coverage)
        write_mutation_csv(repo_root / "results" / "java_mutation.csv", mutation)
    elif args.phase == "randoop":
        records = evaluate_randoop(
            fixture_root,
            repo_root / "evaluation" / "randoop",
            repo_root
            / "evaluation"
            / "tools"
            / "randoop-4.3.4"
            / "randoop-all-4.3.4.jar",
            units,
        )
        write_randoop_csv(
            repo_root / "results" / "randoop_java_results.csv", records
        )
    else:
        print(
            json.dumps(
                audit_java_artifacts(
                    repo_root, require_raw_metrics=args.stage == "all"
                ),
                indent=2,
                sort_keys=True,
            )
        )
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
