import math


def test_compute_rq2_joins_by_unit_id_and_preserves_missing_pairs():
    from evaluation.java_statistics import compute_rq2

    gpt = [
        {"unit_id": "A", "mutation_score": "80"},
        {"unit_id": "B", "mutation_score": "40"},
        {"unit_id": "C", "mutation_score": "NA"},
    ]
    randoop = [
        {"unit_id": "B", "randoop_mutation_score": "50"},
        {"unit_id": "C", "randoop_mutation_score": "90"},
        {"unit_id": "A", "randoop_mutation_score": "60"},
    ]

    result = compute_rq2(gpt, randoop, bootstrap_samples=200)

    assert result["status"] == "TESTED"
    assert result["paired_n"] == 2
    assert result["missing_n"] == 1
    assert result["median_difference"] == 5.0
    assert result["positive_pairs"] == 1
    assert result["negative_pairs"] == 1
    assert 0.0 <= result["wilcoxon_p_value"] <= 1.0
    assert 0.0 <= result["sign_test_p_value"] <= 1.0
    assert not math.isnan(result["bootstrap_ci_low"])
    assert not math.isnan(result["bootstrap_ci_high"])


def test_compute_rq2_reports_not_testable_without_numeric_gpt_pairs():
    from evaluation.java_statistics import compute_rq2

    result = compute_rq2(
        [{"unit_id": "A", "mutation_score": "NA"}],
        [{"unit_id": "A", "randoop_mutation_score": "75"}],
    )

    assert result["status"] == "NOT_TESTABLE"
    assert result["paired_n"] == 0
    assert result["missing_n"] == 1
    assert "No paired numeric" in result["notes"]
