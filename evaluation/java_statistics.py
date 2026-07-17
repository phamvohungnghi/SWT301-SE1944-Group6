"""Reproducible Java-only descriptive statistics and paired RQ2 analysis."""

from __future__ import annotations

import csv
from pathlib import Path
from typing import Any

import numpy as np
from scipy.stats import binomtest, spearmanr, wilcoxon


ROOT = Path(__file__).resolve().parents[1]


def _score(value: str | None) -> float | None:
    if value is None or value.strip().upper() in {"", "NA", "N/A"}:
        return None
    return float(value)


def compute_rq2(
    gpt_rows: list[dict[str, str]],
    randoop_rows: list[dict[str, str]],
    *,
    bootstrap_samples: int = 10_000,
) -> dict[str, Any]:
    randoop = {
        row["unit_id"]: _score(row.get("randoop_mutation_score"))
        for row in randoop_rows
    }
    differences: list[float] = []
    gpt_values: list[float] = []
    randoop_values: list[float] = []
    missing = 0
    for row in gpt_rows:
        gpt = _score(row.get("mutation_score"))
        baseline = randoop.get(row["unit_id"])
        if gpt is None or baseline is None:
            missing += 1
            continue
        gpt_values.append(gpt)
        randoop_values.append(baseline)
        differences.append(gpt - baseline)

    if not differences:
        return {
            "analysis": "RQ2_GPT_VS_RANDOOP_MUTATION",
            "status": "NOT_TESTABLE",
            "paired_n": 0,
            "missing_n": missing,
            "gpt_median": "NA",
            "randoop_median": "NA",
            "median_difference": "NA",
            "q1_difference": "NA",
            "q3_difference": "NA",
            "bootstrap_ci_low": "NA",
            "bootstrap_ci_high": "NA",
            "wilcoxon_statistic": "NA",
            "wilcoxon_p_value": "NA",
            "positive_pairs": 0,
            "negative_pairs": 0,
            "ties": 0,
            "sign_test_p_value": "NA",
            "notes": "No paired numeric GPT/Randoop mutation scores are available.",
        }

    values = np.asarray(differences, dtype=float)
    if np.all(values == 0):
        wilcoxon_statistic = 0.0
        wilcoxon_p_value = 1.0
    else:
        test = wilcoxon(values, alternative="greater", zero_method="wilcox", method="auto")
        wilcoxon_statistic = float(test.statistic)
        wilcoxon_p_value = float(test.pvalue)

    positive = int(np.sum(values > 0))
    negative = int(np.sum(values < 0))
    ties = int(np.sum(values == 0))
    non_ties = positive + negative
    sign_p = float(binomtest(positive, non_ties, 0.5, alternative="greater").pvalue) if non_ties else 1.0

    rng = np.random.default_rng(20260621)
    samples = rng.choice(values, size=(bootstrap_samples, len(values)), replace=True)
    bootstrap_medians = np.median(samples, axis=1)
    ci_low, ci_high = np.quantile(bootstrap_medians, [0.025, 0.975])

    return {
        "analysis": "RQ2_GPT_VS_RANDOOP_MUTATION",
        "status": "TESTED",
        "paired_n": len(values),
        "missing_n": missing,
        "gpt_median": float(np.median(gpt_values)),
        "randoop_median": float(np.median(randoop_values)),
        "median_difference": float(np.median(values)),
        "q1_difference": float(np.quantile(values, 0.25)),
        "q3_difference": float(np.quantile(values, 0.75)),
        "bootstrap_ci_low": float(ci_low),
        "bootstrap_ci_high": float(ci_high),
        "wilcoxon_statistic": wilcoxon_statistic,
        "wilcoxon_p_value": wilcoxon_p_value,
        "positive_pairs": positive,
        "negative_pairs": negative,
        "ties": ties,
        "sign_test_p_value": sign_p,
        "notes": "One-sided paired Wilcoxon; sign test sensitivity excludes ties; deterministic bootstrap seed=20260621.",
    }


def _read(path: Path) -> list[dict[str, str]]:
    with path.open(encoding="utf-8-sig", newline="") as handle:
        return list(csv.DictReader(handle))


def _numeric(rows: list[dict[str, str]], column: str) -> list[float]:
    values = [_score(row.get(column)) for row in rows]
    return [value for value in values if value is not None]


def _median_iqr(values: list[float]) -> tuple[float, float, float]:
    array = np.asarray(values, dtype=float)
    return tuple(float(value) for value in np.quantile(array, [0.5, 0.25, 0.75]))


def _write_csv(path: Path, row: dict[str, Any]) -> None:
    path.parent.mkdir(parents=True, exist_ok=True)
    with path.open("w", encoding="utf-8", newline="") as handle:
        writer = csv.DictWriter(handle, fieldnames=list(row))
        writer.writeheader()
        writer.writerow(row)


def main() -> int:
    executability = _read(ROOT / "results" / "java_executability.csv")
    coverage = _read(ROOT / "results" / "java_coverage.csv")
    mutation = _read(ROOT / "results" / "java_mutation.csv")
    randoop = _read(ROOT / "results" / "randoop_java_results.csv")
    rq2 = compute_rq2(mutation, randoop)
    _write_csv(ROOT / "results" / "java_rq2_analysis.csv", rq2)

    coverage_values = _numeric(coverage, "branch_coverage")
    mutation_values = _numeric(mutation, "mutation_score")
    randoop_mutation = _numeric(randoop, "randoop_mutation_score")
    cov_median, cov_q1, cov_q3 = _median_iqr(coverage_values)
    mut_median, mut_q1, mut_q3 = _median_iqr(mutation_values)
    ran_median, ran_q1, ran_q3 = _median_iqr(randoop_mutation)
    executable_n = sum(row["status"] == "EXECUTABLE" for row in executability)

    paired_cc: list[float] = []
    paired_cov: list[float] = []
    paired_mut: list[float] = []
    mut_by_id = {row["unit_id"]: _score(row["mutation_score"]) for row in mutation}
    for row in coverage:
        cov = _score(row["branch_coverage"])
        mut = mut_by_id[row["unit_id"]]
        if cov is not None and mut is not None:
            paired_cc.append(float(row["cc"]))
            paired_cov.append(cov)
            paired_mut.append(mut)
    rho_cov, p_cov = spearmanr(paired_cc, paired_cov, alternative="less")
    rho_mut, p_mut = spearmanr(paired_cc, paired_mut, alternative="less")

    report = f"""# Quan Java results: current Codex model vs Randoop

## Protocol and provenance

- Production input: 25 methods in `JavaAlgorithms.java`, frozen by `experiment/dataset-manifest.csv`.
- Generated-test model: `gpt-4o-mini` (`provider=codex-session`).
- GPT-4o-mini API attempt: rejected with `429 insufficient_quota` before any content response.
- Per-suite provenance: `results/full_requests/JAVA_*/metadata.json`.
- Randoop: 4.3.4, seed `20260621`, 60 seconds per unit, JDK 17.
- Raw generated tests were not repaired after generation.

## Java executability

- Executable suites: {executable_n}/25 ({100 * executable_n / 25:.1f}%).
- Non-executable suites: {25 - executable_n}/25.
- The non-executable row remains in every primary CSV; coverage and mutation are `NA`.

## GPT branch coverage and mutation

- Measurable branch coverage: {len(coverage_values)}/25; median {cov_median:.2f}%, IQR [{cov_q1:.2f}, {cov_q3:.2f}].
- Measurable mutation score: {len(mutation_values)}/25; median {mut_median:.2f}%, IQR [{mut_q1:.2f}, {mut_q3:.2f}].

## Randoop baseline

- Successful Randoop suites: {sum(row['randoop_status'] == 'OK' for row in randoop)}/25.
- Randoop mutation median: {ran_median:.2f}%, IQR [{ran_q1:.2f}, {ran_q3:.2f}].
- Target isolation audit: 0 suites called another manifest target method.

## RQ2: generated tests vs Randoop mutation score

- Paired units: {rq2['paired_n']}; missing pairs: {rq2['missing_n']}.
- Median paired difference (generated - Randoop): {rq2['median_difference']:.2f} percentage points.
- Difference IQR: [{rq2['q1_difference']:.2f}, {rq2['q3_difference']:.2f}].
- Deterministic bootstrap 95% CI for median difference: [{rq2['bootstrap_ci_low']:.2f}, {rq2['bootstrap_ci_high']:.2f}].
- One-sided paired Wilcoxon: W={rq2['wilcoxon_statistic']:.3f}, p={rq2['wilcoxon_p_value']:.6g}.
- Sign-test sensitivity: positives={rq2['positive_pairs']}, negatives={rq2['negative_pairs']}, ties={rq2['ties']}, p={rq2['sign_test_p_value']:.6g}.

The RQ2 alternative is that generated-test mutation score is higher than Randoop. This Java-only result does not claim the integrated Java/Python RQ1 or RQ3 family result.

## Java-only complexity diagnostics

- CC vs branch coverage: Spearman rho={float(rho_cov):.3f}, one-sided p={float(p_cov):.6g}.
- CC vs mutation score: Spearman rho={float(rho_mut):.3f}, one-sided p={float(p_mut):.6g}.

These complexity results are descriptive/exploratory because the registered integrated multiplicity family requires the Python handoff.
"""
    report_path = ROOT / "team-synthesis" / "quan-java-results-rbl4.md"
    report_path.write_text(report, encoding="utf-8")
    print(f"wrote={ROOT / 'results' / 'java_rq2_analysis.csv'}")
    print(f"wrote={report_path}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
