# ĐỀ CƯƠNG NGHIÊN CỨU RBL-2

## Đánh giá first-attempt zero-shot GPT-4o unit-test generation trên các Java và Python unit có CC từ 5 đến 15

**Môn học:** SWT301 — Software Testing  
**Loại nghiên cứu:** Controlled empirical study / proposal defense  
**Thời điểm protocol:** 2026

### Thành viên và trách nhiệm

| Thành viên | Vai trò chịu trách nhiệm |
|---|---|
| Nghi — Project lead | Freeze protocol, điều phối, phê duyệt amendment và nộp bài |
| Vinh — Dataset lead | Sampling frame, manifest, license/commit/source hash, chạy Lizard |
| Thái — Model/API lead | Prompt hash, API calls, raw request/response log, token/cost log |
| Quân — Metrics/statistics lead | Toolchain, Randoop, coverage/mutation, analysis script |
| Văn — Reporting lead | Evidence traceability, threats, report và defense slides |

## 1. Vấn đề và động lực

Các nghiên cứu gần đây cho thấy LLM có thể sinh unit test đạt coverage và mutation score đáng kể. Tuy nhiên, các con số không thể so sánh trực tiếp vì khác model, prompt, dataset, đơn vị phân tích, loại coverage và cơ chế repair. Ví dụ, TestPilot báo median branch coverage 52,8%, còn AgoneTest báo highest branch coverage 79,8% trong một ma trận nhiều model/prompt. Hai số này không phải cùng estimand.

Nghiên cứu này không hỏi “GPT-4o có tốt nói chung hay không”. Câu hỏi được giới hạn: trong một protocol một lượt, với các unit có thể kiểm thử độc lập và CC 5–15, first response tạo test có quality như thế nào và trên Java có tốt hơn Randoop về mutation score hay không?

## 2. Evidence và research gap

### 2.1 Evidence summary

SLR gồm 10 nghiên cứu. Tất cả báo metric liên quan coverage/mutation/executability, nhưng chỉ 7 bản trích xuất hiện có outcome định lượng. Các paper dùng statement, line, method và branch coverage khác nhau; vì vậy nghiên cứu này chỉ dùng kết quả trước làm bối cảnh, không gộp thành meta-analysis và không suy ra một universal threshold.

### 2.2 GAP-D — gap chính

> Trong 10 nghiên cứu đã rà soát, chưa ghi nhận nghiên cứu nào đánh giá chính một mẫu cân bằng Java/Python gồm các unit có thể kiểm thử độc lập, được lọc trước theo `5 ≤ CC ≤ 15`.

Đây là statement giới hạn theo tập SLR, không phải tuyên bố về toàn bộ literature. CC 5–15 là phạm vi do nhóm chọn để kiểm soát complexity, không được mô tả là “khoảng tốt nhất” hay “đại diện toàn ngành”.

### 2.3 GAP-M — gap phụ

Lu (2026) và Yuan (2024) đã dùng Wilcoxon; do đó inferential statistics tự nó không phải novelty. Khoảng trống hẹp hơn là thiếu một kế hoạch đăng ký trước gồm estimand, direction, tie/zero handling và multiplicity cho complexity-controlled sample.

### 2.4 Những nội dung không claim là gap

- Exact model/API disclosure là yêu cầu reproducibility, không phải GAP-T mới.
- Self-repair đã được nghiên cứu. Nghiên cứu này cố ý không repair để đo first-attempt performance; GAP-S chỉ là threat/context.

## 3. Research questions và hypotheses

### RQ1 — Branch coverage so với practical target

**PICO:** Với eligible Java/Python units (P), test từ một zero-shot GPT-4o response (I), so với 75% practical target (C), có median branch coverage lớn hơn 75% hay không (O)?

Confirmatory analysis tách theo ngôn ngữ:

- Java: `H0: median ≤75%`; `H1: median >75%`.
- Python: `H0: median ≤75%`; `H1: median >75%`.
- Test: one-sided exact sign test; ties ở 75% bị loại; Holm correction cho hai p-value.

Mốc 75% là **Case 3 — pre-registered practical target**. TestPilot 52,8% median branch coverage và AgoneTest 79,8% highest branch coverage chỉ tạo bối cảnh; nghiên cứu không gọi 75% là published floor hoặc industry standard.

### RQ2 — GPT-4o so với Randoop trên Java

**PICO:** Trên cùng 25 Java units (P), GPT-4o tests (I), so với Randoop 4.3.4 (C), có mutation score cao hơn hay không (O)?

- `d_i = mutation_GPT_i − mutation_Randoop_i`.
- `H0: median(d) ≤0`; `H1: median(d) >0`.
- Test: paired one-sided Wilcoxon signed-rank; sign test là sensitivity analysis nếu nhiều ties/zero.

### RQ3 — Complexity và test quality

RQ3 dùng PECO/correlational framing, không phải PICO.

- Bốn cặp: Java/Python × branch coverage/mutation score.
- `H0: ρ≥0`; `H1: ρ<0`.
- One-sided Spearman; Holm correction cho bốn tests.
- Đây là secondary/exploratory analysis; không diễn giải correlation thành causation.

Toàn bộ family-wise α =0,05. Chỉ dùng “reject H0” hoặc “fail to reject H0”.

## 4. Experimental design

### 4.1 Dataset

| Thuộc tính | Đặc tả |
|---|---|
| Kích thước | 50 units: 25 Java + 25 Python |
| Complexity | Lizard 1.23.0; `5 ≤ CC ≤ 15` |
| Nguồn | Public repositories với license và commit SHA được ghi trong manifest |
| Đơn vị | Java method trong fixture tối thiểu hoặc Python function/method có thể gọi độc lập |
| Freeze artifact | `experiment/dataset-manifest.csv` |

Inclusion/exclusion:

1. Source công khai, có license, commit SHA và hash.
2. Fixture phải build/import thành công trước generated test.
3. Không cần network, DB, external service, wall clock hoặc uncontrolled global state.
4. Hai reviewer đánh giá isolation độc lập.
5. Loại duplicate hash/generated code/test code.
6. Eligible list được sort theo SHA-256 của `unit_id`; lấy 25 unit đầu mỗi ngôn ngữ để giảm cherry-picking.

Full run không bắt đầu trước khi manifest đủ 50 dòng và được freeze. Proposal hiện mô tả sampling protocol; manifest là deliverable bắt buộc của pilot.

### 4.2 Model và API

| Thành phần | Giá trị |
|---|---|
| Model | `gpt-4o-2024-08-06` |
| Endpoint | `POST /v1/responses` |
| SDK | OpenAI Python `2.43.0` |
| Temperature | 0,2 |
| top_p | 1,0 |
| max_output_tokens | 2.048 |
| Responses/unit | 1 |
| Content regeneration | Không |
| Timeout/retry | 120 giây; tối đa 2 infrastructure retries trước khi có response |

Nếu snapshot không còn truy cập được, nhóm dừng, lập amendment và xin phê duyệt trước khi thu dữ liệu; không trộn model versions trong confirmatory analysis.

### 4.3 Fixed prompt

```text
SYSTEM
You are a software-testing specialist. Follow the requested test framework exactly.
Return only one complete executable test source file. Do not use Markdown fences.
Do not modify the production code and do not access the network, file system,
clock, environment variables, or external services unless the supplied unit explicitly requires it.

USER
Language: {{LANGUAGE}}
Test framework: {{FRAMEWORK}}
Production unit identifier: {{UNIT_ID}}

Task: Write a comprehensive unit test suite for the production unit below.
Requirements:
1. The test file must compile/run with the pinned project fixture.
2. Maximize branch coverage of the target unit.
3. Include assertions that can detect logical faults, including boundary and exceptional cases supported by the code.
4. Do not change the production unit.
5. Return only the complete test source file, without Markdown fences or explanation.

Production context required to compile the unit:
{{MINIMAL_CONTEXT}}

Target production unit:
{{SOURCE_CODE}}
```

### 4.4 Toolchain

| Thành phần | Version |
|---|---:|
| Python | 3.14.6 |
| OpenAI SDK | 2.43.0 |
| Lizard | 1.23.0 |
| pytest | 9.1.1 |
| coverage.py | 7.14.2 |
| pytest-mutagen | 1.3 |
| JDK | 17 |
| JUnit | 5.11.4 |
| JaCoCo | 0.8.13 |
| PIT | 1.19.1 |
| Randoop | 4.3.4 |
| SciPy | 1.18.0 |
| pandas | 3.0.3 |

Lock file Python: `experiment/requirements-experiment.txt`. Java plugin/build files và container image digest phải được commit trước full run.

### 4.5 Metric definitions

- `branch_coverage = covered_branches / total_branches ×100` trên target unit.
- `mutation_score = killed / (generated − invalid) ×100`; timeout được tính survived trong primary analysis.
- Executability denominator gồm toàn bộ response.
- Non-executable response: executability=0; coverage/mutation=`NA` trong primary complete-case analysis và =0 trong worst-case sensitivity analysis.
- Không loại equivalent mutant bằng đánh giá thủ công sau khi thấy treatment.

### 4.6 Randoop baseline

Randoop 4.3.4 chạy 60 giây/Java unit với `randomseed=20260621`; cùng JDK, production revision và metric toolchain. Không sửa generated test bằng tay. Command, target class, excluded methods và output thô được lưu.

## 5. Pipeline và logging

1. Freeze manifest và environment.
2. Kiểm tra fixture build/import không có generated test.
3. Chạy Lizard và xác minh CC/hash.
4. Render fixed prompt; lưu prompt/source SHA-256.
5. Gọi exact snapshot một lần.
6. Lưu raw request/response, response ID/model, UTC time, token usage và request ID nếu có.
7. Compile/run generated test; phân loại failure.
8. Đo branch coverage, mutation score và executability.
9. Chạy Randoop trên 25 Java units.
10. Chạy analysis script đã đăng ký trước; xuất raw/adjusted p-values, effect sizes và CI.

Network retry không được xem là response mới. Sau khi API đã trả nội dung, không được gọi lại để “sửa” test.

## 6. Statistical plan

| RQ | Estimand | Primary test | Multiplicity | Decision |
|---|---|---|---|---|
| RQ1 | Median branch coverage theo ngôn ngữ so với 75% | Exact sign test, right-tailed | Holm, 2 tests | adjusted p<0,05 và effect đúng hướng |
| RQ2 | Median paired mutation difference | Paired Wilcoxon, right-tailed | Một primary test | p<0,05 và median difference >0 |
| RQ3 | Spearman ρ theo language×outcome | Spearman, left-tailed | Holm, 4 tests | adjusted p<0,05 và ρ<0 |

Báo cáo n hợp lệ/missing, median/IQR, raw/adjusted p-value, effect estimate và 95% CI. RQ3 được ghi rõ exploratory. Pilot chỉ kiểm tra pipeline, không dùng pilot outcome để đổi threshold/hypothesis.

## 7. Threats to Validity

| Threat                            | Mitigation                                                                                                                                                                                                                 |
| --------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **Selection / Cherry-picking**    | Áp dụng inclusion protocol cố định, hai reviewer đánh giá độc lập, deterministic hash ordering và frozen manifest trước full run.                                                                                          |
| **Tool / Language Heterogeneity** | Confirmatory RQ1 được phân tích tách riêng Java và Python; pooled result chỉ dùng để mô tả, không dùng để đưa ra kết luận confirmatory.                                                                                    |
| **Coverage ≠ Fault Detection**    | Sử dụng **co-primary Mutation Score** và **Executability** bên cạnh Branch Coverage để đánh giá chất lượng test toàn diện hơn.                                                                                             |
| **Non-executable Outputs**        | Giữ toàn bộ response trong denominator; thực hiện primary analysis và worst-case sensitivity analysis để tránh bias do loại bỏ output lỗi.                                                                                 |
| **Model Nondeterminism**          | Pin exact snapshot **gpt-4o-2024-08-06**, giữ fixed parameters (`temperature=0.2`, `top_p=1`, `max_output_tokens=2048`), one response per unit và lưu raw logs. Nghiên cứu không tuyên bố model hoàn toàn deterministic.   |
| **Small n / Range Restriction**   | Báo cáo **effect size**, **95% Confidence Interval**, đánh dấu **RQ3 là exploratory** và không overgeneralize kết quả ra ngoài phạm vi nghiên cứu. Chỉ claim trên **Java/Python units có CC từ 5–15** trong frozen sample. |
| **Multiple Testing**              | Áp dụng **Holm correction** cho từng family of tests để kiểm soát Family-wise Error Rate (FWER).                                                                                                                           |
| **Randoop Fairness**              | GPT-4o và Randoop sử dụng cùng Java source, cùng toolchain, cùng production revision; pin time budget, random seed và version (`Randoop 4.3.4`).                                                                           |
| **Infrastructure Failure**        | Thực hiện preflight fixture trước khi chạy; retry chỉ áp dụng cho lỗi transport/network; mọi failure được log và phân loại rõ ràng.                                                                                        |
| **Researcher Degrees of Freedom** | Freeze protocol và analysis script trước full run; mọi amendment phải được ghi vào amendment log trước khi xem kết quả experiment.                                                                                         |


## 8. Reproducibility package

Package phải chứa:

- frozen dataset manifest và source hashes;
- production fixtures;
- prompt template và prompt hashes;
- redacted request JSON + raw response JSON;
- dependency locks, Java build files và container digest;
- exact commands/config cho Lizard, JaCoCo, PIT, coverage.py, pytest-mutagen và Randoop;
- raw coverage/mutation/test logs;
- analysis script, synthetic preflight data và final result tables;
- amendment log.

Một researcher chưa thể chạy full experiment chỉ với manifest rỗng. Vì vậy completion của manifest là hard gate, không phải chi tiết được để sau khi đã gọi model.

## 9. Timeline và gates

| Tuần | Deliverable/gate |
|---|---|
| W5 | Freeze RQ, hypotheses, prompt và evidence wording |
| W6 | Instructor approval; dataset sampling protocol review |
| W7 | Pilot 5 Java + 5 Python; freeze manifest schema/toolchain/commands; record real runtime |
| W8 | Freeze 50-unit manifest; full API/Randoop/metrics run |
| W9 | Pre-registered analysis, interpretation và defense |

Không cam kết runtime “vài phút”. Lịch full run được điều chỉnh bằng upper-bound runtime đo từ pilot.

## 10. Expected contribution

1. Một reproducibility-first protocol cho first-attempt LLM unit-test generation.
2. Evidence được giới hạn đúng cho Java/Python units có CC 5–15 trong frozen sample.
3. Paired Java comparison với Randoop và statistical plan có tie/missing/multiplicity rules.

Không claim universal superiority của GPT-4o, không claim CC 5–15 là đại diện toàn bộ industry và không claim inferential statistics là chưa từng được dùng.

## Tài liệu tham khảo chính

1. Guilherme & Vincenzi (2023), SAST. https://dl.acm.org/doi/10.1145/3624032.3624035
2. Schäfer et al. (2024), IEEE TSE. https://doi.org/10.1109/TSE.2023.3328406
3. Lops et al. (2025), ASE. https://ieeexplore.ieee.org/document/11334272/
4. Lu et al. (2026), PACMPL. https://dl.acm.org/doi/10.1145/3798251
5. Yuan et al. (2024), FSE. https://doi.org/10.1145/3660783
6. OpenAI model/API documentation. https://platform.openai.com/docs/models/gpt-4o and https://platform.openai.com/docs/api-reference/responses/create
7. JaCoCo documentation. https://www.jacoco.org/jacoco/
8. PIT documentation. https://pitest.org/
9. Randoop manual. https://randoop.github.io/randoop/manual/
