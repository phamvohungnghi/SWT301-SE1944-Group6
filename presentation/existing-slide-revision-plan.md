# Kế hoạch chỉnh deck hiện có — RBL-3

Phạm vi: chỉ chỉnh `GPT-4o_RBL3_Proposal_Defense_Visual.pptx`. Không chỉnh proposal, RQ, H0/H1, threshold, metric, dataset, model, statistical test hoặc research claim.

## S1 — Title & Scope

- **Keep:** tên nghiên cứu, first attempt, Java + Python, 50 units, CC 5–15, thành viên.
- **Remove:** không có.
- **Replace with figure:** scope card 50 → 25 Java + 25 Python.
- **Suggested layout:** title trái; scope card phải; nhóm ở chân slide.
- **Exact revised content:** `GPT-4o sinh unit test trên mã CC 5–15`; `First attempt • Java + Python`; `50`; `25 JAVA + 25 PYTHON`.

## S2 — Problem → GAP

- **Keep:** khác biệt dataset/model/prompt/metric/repair và GAP trong 10 paper đã rà soát.
- **Remove:** giải thích dài.
- **Replace with figure:** `Prior work → Confounders → Bounded GAP`.
- **Suggested layout:** ba box ngang, hai arrow, một protocol callout.
- **Exact revised content:** `Dataset khác nhau`; `Model • Prompt • Metric • Repair`; `Trong 10 papers: chưa có mẫu cân bằng Java/Python lọc trước CC 5–15`; `Controlled protocol`.

## S3 — Evidence

- **Keep:** các paper và con số đã có trong evidence table.
- **Remove:** sơ đồ pattern không chứa kết quả định lượng.
- **Replace with figure:** comparison table tối đa 5 paper.
- **Suggested layout:** bốn cột `Paper | Coverage | Mutation | Main finding`, năm dòng xen kẽ màu.
- **Exact revised content:** TestPilot `Branch median 52.8%`, mutation `NR`; AgoneTest `Branch max 79.8%`, `Max 89.2%`; GEM `84.30→88.81%`, `72.71→81.85%`; ASTER `Branch 77.2%`, mutation `NR`; ChatTester `Branch >82%`, `>65%`.

## S4 — RQ & Statistical Tests

- **Keep:** toàn bộ RQ1–RQ3, threshold, test direction, alpha và Holm correction.
- **Remove:** ba callout rời khó so sánh.
- **Replace with figure:** comparison table.
- **Suggested layout:** `RQ | Metric | Threshold | Statistical Test`; hai highlight dưới bảng.
- **Exact revised content:** RQ1 `Branch Coverage | 75% | Exact Sign Test • right-tailed`; RQ2 `Mutation Score | Randoop | Paired Wilcoxon • right-tailed`; RQ3 `CC vs Quality | — | Spearman • left-tailed`; `αfamily = 0.05`; `HOLM CORRECTION`.

## S5 — Pipeline + Model Specification

- **Keep:** model snapshot, endpoint, SDK, prompt strategy, hyperparameters, one response và no regeneration.
- **Remove:** các nhãn chung chung `INPUT/RUN/MEASURE`.
- **Replace with figure:** academic flowchart sáu bước và specification box.
- **Suggested layout:** flowchart trên; compact specification box dưới.
- **Exact revised content:** `Dataset N=50 → Lizard 1.23.0 / CC Filter → GPT-4o snapshot → Generated Tests → Coverage + Mutation → Statistical Analysis`; model `gpt-4o-2024-08-06`; API `POST /v1/responses`; SDK `2.43.0`; `temperature=0.2`; `top_p=1`; `max_output_tokens=2048`; `fixed prompt`; `one response/unit`; `no content regeneration`.

## S6 — Dataset & Baseline

- **Keep:** 50 units, 25 Java, 25 Python, CC 5–15, Lizard 1.23.0, Randoop 4.3.4 chỉ trên Java, provenance gate.
- **Remove:** cụm “25 cặp hàm” vì proposal mô tả 50 units, không dùng nó làm research claim.
- **Replace with figure:** dataset tree.
- **Suggested layout:** Dataset ở gốc; hai nhánh Java/Python; CC band và provenance gate ở đáy.
- **Exact revised content:** `Dataset • N=50`; `Java • 25`; `Randoop 4.3.4 baseline`; `Python • 25`; `No traditional baseline`; `5 ≤ CC ≤ 15 • Lizard 1.23.0`; `source • license • commit SHA • hash`.

## S7 — Work Packages

- **Keep:** Vinh Data 50; Thái LLM 50; Quân Java 25; Văn Python 25; Nghi Gate all; người làm phần nào viết phần đó.
- **Remove:** không có.
- **Replace with figure:** handoff flow năm owner.
- **Suggested layout:** năm box ngang có arrow; report ownership banner ở dưới.
- **Exact revised content:** `VINH / DATA / 50 → THÁI / LLM / 50 → QUÂN / JAVA / 25 → VĂN / PYTHON / 25 → NGHI / GATE / ALL`; `Ai làm phần nào → viết phần đó`.

## S8 — Evaluation Plan

- **Keep:** positive/mixed/negative interpretation, paired Java comparison, effect, 95% CI, adjusted p và missing n.
- **Remove:** giải thích đoạn văn.
- **Replace with figure:** interpretation matrix + RQ2 branch.
- **Suggested layout:** ba outcome box; paired comparison line; reporting strip.
- **Exact revised content:** `Both pass → Robust`; `One pass → Language-specific`; `None → Target not met`; `GPT > Randoop`; `No difference`; `effect • 95% CI • adjusted p • missing n`.

## S9 — Threats to Validity

- **Keep:** Model drift, 50 units, Coverage ≠ fault, Small n và các mitigation tương ứng.
- **Remove:** quadrant text layout.
- **Replace with figure:** bốn cột `Threat ↓ Mitigation`.
- **Suggested layout:** threat box trên, arrow xuống, mitigation box dưới.
- **Exact revised content:** `Model drift ↓ Pin exact snapshot`; `50 units ↓ Bounded claim`; `Coverage ≠ fault ↓ Add Mutation Score`; `Small n ↓ Report effect + CI`; `Protocol frozen before full run`.

## S10 — Timeline & Resources

- **Keep:** W7 pilot, freeze gate, W8 full run, W9 analysis, API/CPU/Git, cost rule và hai contingency.
- **Remove:** không có.
- **Replace with figure:** timeline có gate; resource/contingency boxes.
- **Suggested layout:** timeline ngang trên; resources và contingency dưới.
- **Exact revised content:** `W7 Pilot → Gate Freeze → W8 Full → W9 Analyze`; `API • CPU • Git`; `Cost = pilot mean × 5`; `Model unavailable → amendment`; `Tool failure → fix + re-pilot`.

## S11 — Contribution & Q&A

- **Keep:** controlled CC 5–15, paired Java baseline, traceability 50/50 và Q&A topics.
- **Remove:** không có.
- **Replace with figure:** contribution list + Q&A block.
- **Suggested layout:** ba contribution lines trái; Q&A panel phải.
- **Exact revised content:** `Controlled — CC 5–15`; `Paired — Java baseline`; `Traceable — 50/50`; `GAP • 75% • Randoop • Provenance`.
