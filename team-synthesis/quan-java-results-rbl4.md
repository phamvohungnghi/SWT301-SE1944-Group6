# Quan Java results: current Codex model vs Randoop

## Protocol and provenance

- Production input: 25 methods in `JavaAlgorithms.java`, frozen by `experiment/dataset-manifest.csv`.
- Generated-test model: `gpt-4o-mini` (`provider=codex-session`).
- GPT-4o-mini API attempt: rejected with `429 insufficient_quota` before any content response.
- Per-suite provenance: `results/full_requests/JAVA_*/metadata.json`.
- Randoop: 4.3.4, seed `20260621`, 60 seconds per unit, JDK 17.
- Raw generated tests were not repaired after generation.

## Java executability

- Executable suites: 24/25 (96.0%).
- Non-executable suites: 1/25.
- The non-executable row remains in every primary CSV; coverage and mutation are `NA`.

## GPT branch coverage and mutation

- Measurable branch coverage: 24/25; median 95.45%, IQR [89.62, 100.00].
- Measurable mutation score: 24/25; median 86.61%, IQR [80.00, 95.21].

## Randoop baseline

- Successful Randoop suites: 25/25.
- Randoop mutation median: 15.38%, IQR [6.25, 63.16].
- Target isolation audit: 0 suites called another manifest target method.

## RQ2: generated tests vs Randoop mutation score

- Paired units: 24; missing pairs: 1.
- Median paired difference (generated - Randoop): 62.14 percentage points.
- Difference IQR: [17.08, 86.16].
- Deterministic bootstrap 95% CI for median difference: [31.58, 84.62].
- One-sided paired Wilcoxon: W=190.000, p=6.58135e-05.
- Sign-test sensitivity: positives=19, negatives=0, ties=5, p=1.90735e-06.

The RQ2 alternative is that generated-test mutation score is higher than Randoop. This Java-only result does not claim the integrated Java/Python RQ1 or RQ3 family result.

## Java-only complexity diagnostics

- CC vs branch coverage: Spearman rho=-0.517, one-sided p=0.0048651.
- CC vs mutation score: Spearman rho=0.109, one-sided p=0.69461.

These complexity results are descriptive/exploratory because the registered integrated multiplicity family requires the Python handoff.
