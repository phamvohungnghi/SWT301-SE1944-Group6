# Câu hỏi nghiên cứu và giả thuyết đăng ký trước

**Alpha family-wise:** 0,05  
**Đơn vị phân tích:** một production unit  
**Treatment:** một zero-shot response từ `gpt-4o-2024-08-06`

## RQ1 — First-attempt branch coverage

**RQ1 (PICO):** Với các Java/Python unit có `5 ≤ CC ≤ 15` và đủ điều kiện isolation (P), unit test được sinh bởi một zero-shot response của GPT-4o (I), so với practical target 75% (C), có median branch coverage lớn hơn 75% hay không (O)?

Do Java và Python dùng toolchain khác nhau, confirmatory analysis được tách theo ngôn ngữ:

- **RQ1-Java:** `H0: median(coverage_java) ≤ 75%`; `H1: median(coverage_java) > 75%`.
- **RQ1-Python:** `H0: median(coverage_python) ≤ 75%`; `H1: median(coverage_python) > 75%`.
- Test: one-sided exact sign test, right-tailed; ties tại đúng 75% bị loại khỏi số trial.
- Multiplicity: Holm correction cho hai p-value, `α_family=0,05`.
- Threshold source: **Case 3 — pre-registered practical target**. S3 báo 52,8% median branch coverage và S4 báo 79,8% highest branch coverage trên thiết kế khác; chúng là bối cảnh, không phải nguồn trực tiếp của mốc 75%.
- Pooled Java+Python chỉ được báo cáo mô tả, không dùng làm confirmatory test.

## RQ2 — Paired Java comparison với Randoop

**RQ2 (PICO):** Trên cùng 25 Java unit có `5 ≤ CC ≤ 15` (P), test từ một zero-shot GPT-4o response (I), so với Randoop 4.3.4 với 60 giây/unit và seed cố định (C), có mutation score cao hơn hay không (O)?

- `d_i = mutation_GPT_i − mutation_Randoop_i`.
- `H0: median(d) ≤ 0`.
- `H1: median(d) > 0`.
- Primary test: paired one-sided Wilcoxon signed-rank, right-tailed, `zero_method="wilcox"`, `method="auto"`, α=0,05.
- Sensitivity test: paired sign test khi difference có nhiều zero/ties hoặc đối xứng không hợp lý.
- Báo cáo paired n, missing pairs, median/IQR của `d`, p-value và paired effect estimate/CI khi tính được.

## RQ3 — Complexity–quality association

RQ3 là câu hỏi **PECO/correlational**, không phải PICO: population là eligible units; exposure là CC; outcomes là branch coverage và mutation score.

**RQ3:** Trong từng ngôn ngữ, CC cao hơn trong phạm vi 5–15 có liên hệ đơn điệu nghịch với quality của first-attempt GPT-4o tests hay không?

Với mỗi language × outcome:

- `H0: ρ ≥ 0`.
- `H1: ρ < 0`.
- Test: one-sided Spearman rank correlation, left-tailed.
- Bốn test: Java×coverage, Java×mutation, Python×coverage, Python×mutation.
- Holm correction cho bốn p-value, `α_family=0,05`.
- Báo cáo `ρ`, bootstrap 95% CI, raw/adjusted p-value và n hợp lệ.
- RQ3 là secondary/exploratory vì n=25 mỗi ngôn ngữ và CC bị range-restricted; không diễn giải correlation thành causation.

## Quy tắc quyết định

- Reject H0 chỉ khi adjusted p-value <0,05 và effect đúng hướng đã đăng ký.
- Nếu điều kiện không đạt: “fail to reject H0”; không viết “accept H0”.
- Không thay threshold, tail, outcome, exclusion hoặc correction sau khi xem result.
- Non-executable response vẫn nằm trong executability denominator; coverage/mutation được xử lý theo primary và sensitivity rules trong design-rationale.

## Citation keys

- S3: Schäfer et al. (2024), TestPilot, IEEE TSE.
- S4: Lops et al. (2025), AgoneTest, ASE.
