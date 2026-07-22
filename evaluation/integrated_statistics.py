"""Integrated statistics for RBL-4: Java + Python combined analysis.

Answers RQ1, RQ2, RQ3 from the registered statistical plan in proposal.md.

Usage:
    python evaluation/integrated_statistics.py

Outputs:
    results/summary.csv
"""

from __future__ import annotations

import csv
import json
from pathlib import Path
from typing import Any

import numpy as np
from scipy.stats import binomtest, spearmanr

ROOT = Path(__file__).resolve().parents[1]
RESULTS = ROOT / "results"


# ---------------------------------------------------------------------------
# I/O helpers
# ---------------------------------------------------------------------------

def _read(path: Path) -> list[dict[str, str]]:
    with path.open(encoding="utf-8-sig", newline="") as fh:
        return list(csv.DictReader(fh))


def _score(value: str | None) -> float | None:
    if value is None or str(value).strip().upper() in {"", "NA", "N/A"}:
        return None
    return float(value)


def _numeric(rows: list[dict[str, str]], col: str) -> list[float]:
    return [v for v in (_score(r.get(col)) for r in rows) if v is not None]


def _median_iqr(values: list[float]) -> tuple[float, float, float]:
    a = np.asarray(values, dtype=float)
    return tuple(float(v) for v in np.quantile(a, [0.5, 0.25, 0.75]))  # type: ignore[return-value]


def _holm(raw_p: list[float]) -> list[float]:
    """Holm–Bonferroni correction; returns adjusted p-values in original order."""
    n = len(raw_p)
    order = sorted(range(n), key=lambda i: raw_p[i])
    adjusted = [0.0] * n
    running_max = 0.0
    for rank, idx in enumerate(order):
        adj = raw_p[idx] * (n - rank)
        running_max = max(running_max, adj)
        adjusted[idx] = min(running_max, 1.0)
    return adjusted


# ---------------------------------------------------------------------------
# RQ1 — branch coverage sign test
# ---------------------------------------------------------------------------

def rq1_sign_test(
    coverage_rows: list[dict[str, str]],
    language: str,
    threshold: float = 75.0,
) -> dict[str, Any]:
    """Exact right-tailed sign test: H0 median ≤ threshold, H1 median > threshold."""
    values = _numeric(coverage_rows, "branch_coverage")
    n_total = len(coverage_rows)
    n_valid = len(values)

    # Remove ties (exactly at threshold)
    above = [v for v in values if v > threshold]
    below = [v for v in values if v < threshold]
    ties = [v for v in values if v == threshold]
    n_non_tie = len(above) + len(below)

    if n_non_tie == 0:
        raw_p = 1.0
        stat = "sign_test"
    else:
        result = binomtest(len(above), n_non_tie, 0.5, alternative="greater")
        raw_p = float(result.pvalue)
        stat = f"sign_test k={len(above)}/{n_non_tie}"

    median_val, q1, q3 = _median_iqr(values) if values else (float("nan"), float("nan"), float("nan"))

    # Worst-case: count non-executable as 0
    n_non_executable = n_total - n_valid
    wc_values = values + [0.0] * n_non_executable
    above_wc = [v for v in wc_values if v > threshold]
    below_wc = [v for v in wc_values if v < threshold]
    n_non_tie_wc = len(above_wc) + len(below_wc)
    if n_non_tie_wc == 0:
        wc_p = 1.0
    else:
        wc_result = binomtest(len(above_wc), n_non_tie_wc, 0.5, alternative="greater")
        wc_p = float(wc_result.pvalue)

    return {
        "rq": "RQ1",
        "analysis_label": f"RQ1_{language.upper()}_branch_coverage_vs_75pct",
        "language": language,
        "n_total": n_total,
        "n_valid": n_valid,
        "n_non_executable": n_non_executable,
        "median": round(median_val, 4),
        "iqr_q1": round(q1, 4),
        "iqr_q3": round(q3, 4),
        "threshold": threshold,
        "n_above_threshold": len(above),
        "n_below_threshold": len(below),
        "n_ties_at_threshold": len(ties),
        "raw_stat": stat,
        "raw_p_value": round(raw_p, 8),
        "adjusted_p_value": "PENDING_HOLM",  # filled after Holm
        "worstcase_p_value": round(wc_p, 8),
        "effect_estimate": "NA",
        "ci_low": "NA",
        "ci_high": "NA",
        "decision": "PENDING_HOLM",
        "notes": (
            f"Exact right-tailed sign test; threshold={threshold}%; "
            f"ties excluded; worst-case counts {n_non_executable} non-executable as 0%."
        ),
    }


# ---------------------------------------------------------------------------
# RQ2 — load pre-computed Java Wilcoxon result
# ---------------------------------------------------------------------------

def rq2_load(rq2_path: Path) -> dict[str, Any]:
    rows = _read(rq2_path)
    if not rows:
        return {
            "rq": "RQ2",
            "analysis_label": "RQ2_GPT_VS_RANDOOP_MUTATION_JAVA",
            "language": "java",
            "status": "NOT_FOUND",
            "notes": f"Could not load {rq2_path}",
        }
    r = rows[0]
    raw_p = _score(r.get("wilcoxon_p_value"))
    decision = "reject_H0" if (raw_p is not None and raw_p < 0.05) else "fail_to_reject_H0"
    med_diff = _score(r.get("median_difference"))
    return {
        "rq": "RQ2",
        "analysis_label": "RQ2_GPT_VS_RANDOOP_MUTATION_JAVA",
        "language": "java",
        "n_total": 25,
        "n_valid": int(r.get("paired_n", 0)),
        "n_non_executable": int(r.get("missing_n", 0)),
        "median": _score(r.get("gpt_median")),
        "iqr_q1": "NA",
        "iqr_q3": "NA",
        "threshold": "NA",
        "n_above_threshold": r.get("positive_pairs", "NA"),
        "n_below_threshold": r.get("negative_pairs", "NA"),
        "n_ties_at_threshold": r.get("ties", "NA"),
        "raw_stat": f"Wilcoxon_W={r.get('wilcoxon_statistic', 'NA')}",
        "raw_p_value": raw_p,
        "adjusted_p_value": raw_p,  # single primary test, no multiplicity correction
        "worstcase_p_value": "NA",
        "effect_estimate": round(med_diff, 4) if med_diff is not None else "NA",
        "ci_low": _score(r.get("bootstrap_ci_low")),
        "ci_high": _score(r.get("bootstrap_ci_high")),
        "decision": decision,
        "notes": (
            "Paired one-sided Wilcoxon H1: GPT mutation > Randoop mutation; "
            "single primary test, no Holm needed; "
            "sign-test sensitivity: "
            f"pos={r.get('positive_pairs')}, neg={r.get('negative_pairs')}, ties={r.get('ties')}, "
            f"sign_p={_score(r.get('sign_test_p_value')):.6g}."
        ),
    }


# ---------------------------------------------------------------------------
# RQ3 — Spearman correlation: CC vs branch_coverage/mutation_score
# ---------------------------------------------------------------------------

def rq3_spearman(
    coverage_rows: list[dict[str, str]],
    mutation_rows: list[dict[str, str]],
    language: str,
) -> list[dict[str, Any]]:
    """One-sided left-tailed Spearman; H1: rho < 0 (higher CC → lower quality)."""
    results = []

    # Build paired data for branch coverage
    cov_cc, cov_vals = [], []
    for row in coverage_rows:
        cc = _score(row.get("cc"))
        cov = _score(row.get("branch_coverage"))
        if cc is not None and cov is not None:
            cov_cc.append(cc)
            cov_vals.append(cov)

    # Build paired data for mutation score
    mut_by_id = {r["unit_id"]: _score(r.get("mutation_score")) for r in mutation_rows}
    mut_cc, mut_vals = [], []
    for row in coverage_rows:
        cc = _score(row.get("cc"))
        uid = row["unit_id"]
        mut = mut_by_id.get(uid)
        if cc is not None and mut is not None:
            mut_cc.append(cc)
            mut_vals.append(mut)

    for outcome, cc_list, val_list in [
        ("branch_coverage", cov_cc, cov_vals),
        ("mutation_score", mut_cc, mut_vals),
    ]:
        label = f"RQ3_{language.upper()}_CC_vs_{outcome}"
        if len(cc_list) < 3:
            results.append({
                "rq": "RQ3",
                "analysis_label": label,
                "language": language,
                "n_total": 25,
                "n_valid": len(cc_list),
                "n_non_executable": "NA",
                "median": "NA",
                "iqr_q1": "NA",
                "iqr_q3": "NA",
                "threshold": "NA",
                "n_above_threshold": "NA",
                "n_below_threshold": "NA",
                "n_ties_at_threshold": "NA",
                "raw_stat": "NOT_TESTABLE",
                "raw_p_value": "NA",
                "adjusted_p_value": "EXCLUDED_FROM_HOLM",
                "worstcase_p_value": "NA",
                "effect_estimate": "NA",
                "ci_low": "NA",
                "ci_high": "NA",
                "decision": "NOT_TESTABLE",
                "notes": (
                    f"Insufficient numeric pairs (n={len(cc_list)}); "
                    f"{language} {outcome} not available (likely all NA from pytest-mutagen)."
                ),
            })
            continue

        rho, p_one_sided = spearmanr(cc_list, val_list, alternative="less")
        results.append({
            "rq": "RQ3",
            "analysis_label": label,
            "language": language,
            "n_total": 25,
            "n_valid": len(cc_list),
            "n_non_executable": "NA",
            "median": "NA",
            "iqr_q1": "NA",
            "iqr_q3": "NA",
            "threshold": "NA",
            "n_above_threshold": "NA",
            "n_below_threshold": "NA",
            "n_ties_at_threshold": "NA",
            "raw_stat": f"Spearman_rho={float(rho):.4f}",
            "raw_p_value": round(float(p_one_sided), 8),
            "adjusted_p_value": "PENDING_HOLM",
            "worstcase_p_value": "NA",
            "effect_estimate": round(float(rho), 4),
            "ci_low": "NA",
            "ci_high": "NA",
            "decision": "PENDING_HOLM",
            "notes": "One-sided Spearman, H1: rho<0; Holm correction applied across 3 testable RQ3 pairs.",
        })

    return results


# ---------------------------------------------------------------------------
# Write summary CSV
# ---------------------------------------------------------------------------

FIELDNAMES = [
    "rq", "analysis_label", "language",
    "n_total", "n_valid", "n_non_executable",
    "median", "iqr_q1", "iqr_q3",
    "threshold",
    "n_above_threshold", "n_below_threshold", "n_ties_at_threshold",
    "raw_stat", "raw_p_value", "adjusted_p_value", "worstcase_p_value",
    "effect_estimate", "ci_low", "ci_high",
    "decision", "notes",
]


def _write_summary(path: Path, rows: list[dict[str, Any]]) -> None:
    path.parent.mkdir(parents=True, exist_ok=True)
    with path.open("w", encoding="utf-8", newline="") as fh:
        writer = csv.DictWriter(fh, fieldnames=FIELDNAMES, extrasaction="ignore")
        writer.writeheader()
        writer.writerows(rows)


# ---------------------------------------------------------------------------
# Main
# ---------------------------------------------------------------------------

def main() -> int:
    # --- Load all data ---
    java_cov = _read(RESULTS / "java_coverage.csv")
    java_mut = _read(RESULTS / "java_mutation.csv")
    py_cov = _read(RESULTS / "python_coverage.csv")
    py_mut = _read(RESULTS / "python_mutation.csv")
    rq2_path = RESULTS / "java_rq2_analysis.csv"

    print("=" * 60)
    print("RBL-4 Integrated Statistics")
    print("=" * 60)

    # -----------------------------------------------------------------------
    # RQ1: branch coverage sign test (Java + Python)
    # -----------------------------------------------------------------------
    rq1_java = rq1_sign_test(java_cov, "java", threshold=75.0)
    rq1_python = rq1_sign_test(py_cov, "python", threshold=75.0)

    # Holm correction for RQ1 (2 tests)
    rq1_raw_ps = [rq1_java["raw_p_value"], rq1_python["raw_p_value"]]
    rq1_adj_ps = _holm(rq1_raw_ps)
    rq1_java["adjusted_p_value"] = round(rq1_adj_ps[0], 8)
    rq1_python["adjusted_p_value"] = round(rq1_adj_ps[1], 8)
    rq1_java["decision"] = "reject_H0" if rq1_adj_ps[0] < 0.05 else "fail_to_reject_H0"
    rq1_python["decision"] = "reject_H0" if rq1_adj_ps[1] < 0.05 else "fail_to_reject_H0"

    print(f"\n[RQ1] Java branch coverage")
    print(f"  n_valid={rq1_java['n_valid']}/25, median={rq1_java['median']:.2f}%")
    print(f"  above 75%: {rq1_java['n_above_threshold']}, below: {rq1_java['n_below_threshold']}, ties: {rq1_java['n_ties_at_threshold']}")
    print(f"  raw_p={rq1_java['raw_p_value']:.6g}, holm_adj_p={rq1_java['adjusted_p_value']:.6g}")
    print(f"  Decision: {rq1_java['decision']}")

    print(f"\n[RQ1] Python branch coverage")
    print(f"  n_valid={rq1_python['n_valid']}/25, median={rq1_python['median']:.2f}%")
    print(f"  above 75%: {rq1_python['n_above_threshold']}, below: {rq1_python['n_below_threshold']}, ties: {rq1_python['n_ties_at_threshold']}")
    print(f"  raw_p={rq1_python['raw_p_value']:.6g}, holm_adj_p={rq1_python['adjusted_p_value']:.6g}")
    print(f"  Decision: {rq1_python['decision']}")

    # -----------------------------------------------------------------------
    # RQ2: load pre-computed Wilcoxon result
    # -----------------------------------------------------------------------
    rq2 = rq2_load(rq2_path)
    print(f"\n[RQ2] GPT-4o vs Randoop mutation score (Java)")
    print(f"  paired_n={rq2['n_valid']}, median_GPT={rq2['median']:.2f}%")
    print(f"  effect (median diff)={rq2['effect_estimate']}pp, CI=[{rq2['ci_low']:.2f}, {rq2['ci_high']:.2f}]")
    print(f"  {rq2['raw_stat']}, p={rq2['raw_p_value']:.6g}")
    print(f"  Decision: {rq2['decision']}")

    # -----------------------------------------------------------------------
    # RQ3: Spearman correlation (4 planned pairs; Python mutation NOT_TESTABLE)
    # -----------------------------------------------------------------------
    rq3_java = rq3_spearman(java_cov, java_mut, "java")
    rq3_python = rq3_spearman(py_cov, py_mut, "python")
    all_rq3 = rq3_java + rq3_python

    # Holm correction only on testable pairs
    testable_idx = [i for i, r in enumerate(all_rq3) if r["raw_p_value"] not in ("NA", "NOT_TESTABLE")]
    testable_ps = [all_rq3[i]["raw_p_value"] for i in testable_idx]
    if testable_ps:
        adj_ps = _holm(testable_ps)
        for rank, idx in enumerate(testable_idx):
            all_rq3[idx]["adjusted_p_value"] = round(adj_ps[rank], 8)
            rho_val = all_rq3[idx]["effect_estimate"]
            adj_p = adj_ps[rank]
            all_rq3[idx]["decision"] = (
                "reject_H0" if (adj_p < 0.05 and isinstance(rho_val, float) and rho_val < 0)
                else "fail_to_reject_H0"
            )
    for rq3 in all_rq3:
        if rq3["decision"] == "PENDING_HOLM":
            rq3["decision"] = "fail_to_reject_H0"

    print(f"\n[RQ3] Spearman CC vs test quality (Holm on {len(testable_ps)} testable pairs)")
    for rq3 in all_rq3:
        print(f"  {rq3['analysis_label']}")
        print(f"    rho={rq3['effect_estimate']}, raw_p={rq3['raw_p_value']}, adj_p={rq3['adjusted_p_value']}, decision={rq3['decision']}")

    # -----------------------------------------------------------------------
    # Write summary.csv
    # -----------------------------------------------------------------------
    all_rows = [rq1_java, rq1_python, rq2] + all_rq3
    summary_path = RESULTS / "summary.csv"
    _write_summary(summary_path, all_rows)
    print(f"\n[DONE] Wrote {summary_path}")
    print(f"       Total rows in summary.csv: {len(all_rows)}")

    # -----------------------------------------------------------------------
    # Also write a JSON snapshot for easy notebook loading
    # -----------------------------------------------------------------------
    json_path = RESULTS / "summary_snapshot.json"

    def _safe(v: Any) -> Any:
        if isinstance(v, float) and (v != v):  # nan
            return "NA"
        return v

    with json_path.open("w", encoding="utf-8") as jf:
        json.dump([{k: _safe(v) for k, v in row.items()} for row in all_rows], jf, indent=2)
    print(f"       Wrote {json_path}")

    return 0


if __name__ == "__main__":
    raise SystemExit(main())
