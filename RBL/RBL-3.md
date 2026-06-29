RBL-3: Experiment Design → Research Proposal

Đầu vào:
SLR/gap-analysis.md
+
experiment/design-rationale.md
+
experiment/hypotheses-draft.md
từ RBL-2

Đầu ra:
- team-synthesis/proposal.md — hợp đồng nghiên cứu, chốt trước khi chạy experiment
- presentation/slides_proposal_defense.pptx — slide bảo vệ đề cương Tuần 6 (gate, 5–7 phút)

Thời gian:
~6–8 giờ viết proposal + ~2 giờ làm slides (Tuần 5–6) — thực nghiệm trong Tuần 7–8 (xem RBL-4)

Quy tắc xuyên suốt:
Proposal là viết lại có liên kết — không phải copy-paste từ các file cũ. Mỗi quyết định ở §5 phải reference được §3; §6 phải nhất quán với §4. Sau khi GV phê duyệt, RQ / metric / threshold không được thay đổi.

Quan hệ với RBL-2:
RBL-3 không tạo file per-member. Toàn bộ output là 1 file nhóm team-synthesis/proposal.md — tổng hợp và liên kết tất cả output từ RBL-1 + RBL-2 thành một tài liệu mạch lạc.
BƯỚC 1 — Kiểm tra đầu vào (15 phút)

Mở 3 file từ RBL-2 của team-synthesis. Pass tất cả 5 gate mới tiếp tục:

Gate | Pass nếu... | Fail → làm gì

G1: gap-analysis.md
Pass nếu: Có bảng kiểm tra phản chứng, GAP primary đã xác định
Fail → Quay lại RBL-2.1 Bước 2B

G2: gap-analysis.md
Pass nếu: GAP primary đã qua feasibility check (RBL-2 Bước 2C) — không có ❌, ≤ 2 ⚠️
Fail → Chạy lại bảng feasibility; downscope nếu cần

G3: design-rationale.md
Pass nếu: Mỗi dòng bảng quyết định có nguồn từ evidence table
Fail → Điền nguồn còn thiếu

G4: hypotheses-draft.md
Pass nếu: H0/H1 có ngưỡng cụ thể + ghi rõ Case 1/2/3
Fail → Xác định threshold trước khi tiếp tục

G5: hypotheses-draft.md
Pass nếu: Statistical test đã chọn, không phải TBD
Fail → Xem bảng RBL-2 Bước 5B
BƯỚC 2 — Cấu trúc proposal (8 section)

Section | Nội dung | Nguồn chính | Lưu ý

§1 Tiêu đề & Nhóm
Nội dung: Tên đề tài, thành viên, version, ngày
Nguồn chính: Mới

§2 Problem Statement
Nội dung: Bối cảnh → State of the art → GAP → Motivation
Nguồn chính: gap-analysis.md
Lưu ý: ≥ 3 paper cụ thể theo tên — không ghi "nhiều nghiên cứu"

§3 Related Work
Nội dung: Bảng tóm tắt + pattern analysis + GAP mapping
Nguồn chính: evidence-table-merged.md
Lưu ý: Tổng hợp theo pattern, không mô tả riêng lẻ từng paper

§4 Research Questions
Nội dung: RQ + H0/H1 + threshold + statistical test
Nguồn chính: hypotheses-draft.md
Lưu ý: Chốt tại đây — không thay đổi sau khi GV duyệt

§5 Experiment Protocol
Nội dung: Pipeline + dataset + LLM config + measurement + stat plan
Nguồn chính: design-rationale.md mở rộng
Lưu ý: Model version chính xác, hyperparameter đầy đủ, prompt nguyên văn
§6 Evaluation Plan
Nội dung: RQ → metric → ngưỡng → điều kiện reject H0 + diễn giải âm tính
Nguồn chính: §4 + §5
Lưu ý: Sub-group analysis phải định nghĩa TRƯỚC khi chạy

§7 Threats to Validity
Nội dung: 4 loại: Internal / External / Construct / Conclusion
Nguồn chính: Phân tích mới
Lưu ý: Mỗi threat có mitigation là hành động, không phải ý định

§8 Timeline & Resources
Nội dung: Tài nguyên, chi phí API, lịch tuần, contingency
Nguồn chính: Mới
Lưu ý: Dataset phải verify accessible trước khi nộp
# Research Proposal: [Tên topic ngắn gọn, súc tích]

**Nhóm:** [Tên hoặc mã nhóm]  
**Thành viên:** [Họ tên (MSSV), ...]  
**Topic code:** [RT-SWT-00X]  
**Ngày nộp:** [YYYY-MM-DD]  
**Version:** 1.0  
**Trạng thái:** Đang chờ phê duyệt
## 2. Research Problem Statement

### 2.1 Bối cảnh & Tầm quan trọng
[2–3 câu. Quan trọng với ai? Tại sao? Phải có ≥ 1 trích dẫn từ evidence table.]

### 2.2 State of the Art
[3–5 câu. Nêu tên paper cụ thể theo dạng Author + năm. Không viết chung chung như “nhiều nghiên cứu đã...”]

### 2.3 GAP
[Copy từ gap-analysis.md phần “Phát biểu GAP”. Bổ sung: loại GAP-T/M/D/S và N=? paper trong evidence.]

### 2.4 Motivation
[1–2 câu. Nếu không giải quyết GAP này, hệ quả thực tế là gì? Phải cụ thể.]
## 3. Related Work

### 3.1 Overview
[Bảng tóm tắt, gồm các cột:
Paper | Tool/LLM | Dataset size | Metric | Best result | Limitation]

[Tối đa 10 paper. Không copy nguyên evidence table.]

### 3.2 Pattern Analysis
[3–4 nhận xét tổng hợp dạng:
“Nhìn chung, [pattern X] thể hiện qua [paper A, paper B, paper C].”]

### 3.3 GAP Mapping
[Bảng gồm:
GAP-T/M/D/S | Evidence | Number of supporting papers | Status: Confirmed / Confirmed-Deferred]
## 4. Research Questions

> Chốt tại đây. Sau khi GV phê duyệt, không được thay đổi RQ, metric, hay threshold.

### RQ1
**RQ1:** [P: dataset cụ thể] + [I: LLM + version + strategy] có đạt [O: metric ≥ threshold] không?

**Loại claim:** [absolute threshold / comparative / human-level]  
**H0:** [I] KHÔNG đạt [metric] ≥ [threshold]  
**H1:** [I] ĐẠT [metric] ≥ [threshold]  
**Metric:** [tên cụ thể + library/tool]  
**Ngưỡng:** [giá trị] — Case [1/2/3]: [lý do và trích dẫn]  
**Statistical test:** [tên test] (α = 0.05)
Chọn statistical test:
Nhìn vào PICO.O — điểm số thập phân → Wilcoxon; tỉ lệ pass/fail → Binomial; so sánh 2 hệ thống → Mann-Whitney U. Xem bảng đầy đủ tại RBL-0 “Statistical Test Chuẩn”.

§4 ghi tên test + α. §5.6 ghi chi tiết: one/two-tailed, power analysis, effect size. Hai section bổ sung nhau, không copy giống nhau.
## 5. Experiment Protocol

### 5.1 Pipeline tổng quan
[Danh sách ≥ 5 bước theo thứ tự — đủ cụ thể để người khác chạy lại]

### 5.2 Dataset
Tên dataset:  
Nguồn (URL):  
Quy mô (N):  
Domain:  
Preprocessing:  
Sampling strategy:  
Lý do chọn: [reference GAP-D hoặc design-rationale.md]

### 5.3 LLM/Tool Configuration
Model: [tên + version chính xác — ví dụ: gpt-4o-2024-08-06]  
Hyperparameters: [temperature=?, top_p=?, max_tokens=?, ...]  
Prompting strategy: [zero-shot / few-shot (<k=?>) / CoT]  
Prompt template: [ghi nguyên văn — không paraphrase]
Lý do cấu hình: [reference design-rationale.md]

### 5.4 Measurement
Metric:  
Tool + version:  
Ground truth source:  
IAA method + threshold: [nếu có human annotation]

### 5.5 Baseline
[chỉ cần nếu có comparative claim]

Tên + version + source:  
Cấu hình đủ để reproduce:  

### 5.6 Statistical Analysis Plan
Test: [tên] — [one/two-tailed] — α = 0.05  
Lý do chọn test: [điều kiện có được đáp ứng không?]  
Effect size: [tên chỉ số — ví dụ: Cliff's delta, Cohen's d]  
N và power: [N = ? — power ≥ 0.80 theo power analysis bằng statsmodels/G*Power]
## 6. Evaluation Plan

### 6.1 Bảng tiêu chí đánh giá

| RQ | Metric | Ngưỡng | Test | H0 bị reject khi... | Kết quả âm tính có ý nghĩa? |
|----|--------|--------|------|----------------------|------------------------------|
| RQ1 | | | | | |
| RQ2 | | | | | |

### 6.2 Diễn giải tổ hợp kết quả
[Ghi rõ ≥ 3 tình huống: double positive / mixed / double negative → conclusion tương ứng]

### 6.3 Sub-group analysis (nếu có)
[Điều kiện: n_group ≥ ? để chạy sub-group — quyết định TRƯỚC khi có data]
Không được: Kế hoạch thay metric nếu kết quả không như ý = HARKing
(Hypothesizing After Results are Known), vi phạm tính toàn vẹn khoa học.
## 7. Threats to Validity

4 loại bắt buộc:

| Loại | Câu hỏi cốt lõi | Ví dụ threat cần kiểm tra |
|---|---|---|
| Internal | Kết quả có thực sự do intervention không? | Model version drift (cloud LLM), annotation bias |
| External | Kết quả có generalize ra ngoài dataset không? | Single domain, dataset không đại diện |
| Construct | Metric có đo đúng cái muốn đo không? | BLEU không đo semantic meaning |
| Conclusion | Statistical power có đủ không? | N nhỏ, sub-group thiếu power |
## 7. Threats to Validity

### 7.1 Internal Validity
**Threat:** [Mô tả cụ thể — ví dụ: OpenAI có thể silent-update model]  
**Mitigation:** [Hành động — ví dụ: pin version = "gpt-4o-2024-08-06", log version trong mỗi run]

[Liệt kê ≥ 2 threats Internal]

### 7.2 External Validity
**Threat:** [...]
### 7.3 Construct Validity
**Threat:** [...]  
**Mitigation:** [...]

### 7.4 Conclusion Validity
**Threat:** [...]  
**Mitigation:** [...]
"Chúng tôi sẽ cố minimize bias" không phải mitigation — phải là hành động cụ thể và có thể kiểm chứng.
## 8. Timeline & Resources

Mỗi thành viên phải có ít nhất 1 deliverable cụ thể mỗi tuần.

"Cùng làm" không được chấp nhận — phải ghi rõ ai chịu trách nhiệm gì.

Dùng role code PL / DG / LR / MS / RW thay vì tên trong timeline để dễ đọc.
PL / DG / LR / MS / RW
Không gộp LR + MS vào 1 người
ROLES CHUẨN — TRÁCH NHIỆM THEO TUẦN

5 roles trong nhóm thực nghiệm:

Ký hiệu | Tên đầy đủ | Làm gì trong nhóm | Không làm gì

PL | Project Lead
Làm gì: Điều phối tiến độ, review, nhất quán proposal, submit GV, xử lý blockers
Không làm gì: Không viết toàn bộ sections một mình; không chạy experiment

DG | Data & Ground Truth
Làm gì: Tìm + download dataset, tạo ground truth, tính IAA, viết §3 Related Work
Không làm gì: Không chạy LLM; không tính metric thống kê

LR | LLM Runner
Làm gì: Setup API, viết script chạy experiment, batch-process toàn bộ input, log chi phí
Không làm gì: Không phân tích kết quả; không chọn/chạy statistical test

MS | Metrics & Stats
Làm gì: Implement metric, chạy statistical tests, tính effect size, diễn giải kết quả
Không làm gì: Không thu thập dữ liệu; không chạy LLM

RW | Report Writer
Làm gì: Viết intro, conclusion, threats, tạo figures, format document cuối, hỗ trợ DG viết §3
Không làm gì: Không tự sửa §4–§6 mà không có LR/MS review
 
Quy tắc bất biến:
LR và MS không được gộp vào 1 người — người chạy experiment không được tự verify kết quả của chính mình.

Nhóm < 5 người:
1 thành viên giữ 2 roles, nhưng không gộp LR + MS.
Trách nhiệm theo tuần:

Role | Tuần 3–4 (RBL-1) | Tuần 5–6 (RBL-2/3) | Tuần 7 (Pilot) | Tuần 8 (Full)

PL
Tuần 3–4: Điều phối SLR, merge team output
Tuần 5–6: Submit proposal, theo dõi GV duyệt
Tuần 7: Pilot meeting note + amendment
Tuần 8: Verify §4–§6 nhất quán

DG
Tuần 3–4: SLR + evidence table
Tuần 5–6: Verify dataset, prep annotation
Tuần 7: pilot_ground_truth.csv + IAA
Tuần 8: full_ground_truth.csv + IAALR
Tuần 3–4: SLR + experiment design
Tuần 5–6: Setup API + test 1 sample
Tuần 7: pilot_llm_output.csv + log
Tuần 8: full_llm_output.csv + cost

MS
Tuần 3–4: SLR + stat plan
Tuần 5–6: Implement metric script
Tuần 7: pilot_analysis.ipynb + phân phối
Tuần 8: full_analysis.ipynb + p-value

RW
Tuần 3–4: SLR + threats draft
Tuần 5–6: Draft §7 Threats + format proposal
Tuần 7: —
Tuần 8: figures/
NGUYÊN TẮC XUYÊN SUỐT (áp dụng toàn bộ Tuần 3–10)

# | Nguyên tắc | Vi phạm trông như thế nào

1 | Evidence-based — mọi quyết định trỏ về cột cụ thể trong evidence table
Vi phạm: "Tôi chọn GPT-4o vì nó tốt" → không có nguồn

2 | No HARKing — RQ/metric/threshold chốt trong proposal, không đổi sau khi có data
Vi phạm: "RQ1 fail nên tôi thêm RQ3 vào"

3 | Reproducibility — model version chính xác + hyperparameter + prompt nguyên văn
Vi phạm: "Dùng GPT-4o, temperature phù hợp"

4 | Pilot bắt buộc — Tuần 7 pilot trước khi scale full Tuần 8
Vi phạm: Nhảy thẳng sang full experiment

5 | Empty response = invalid — không tự điền lại
Vi phạm: "Điền kết quả hợp lý nhất"
## 8. Timeline & Resources

### 8.0 Phân công vai trò

| Role | Thành viên | Trách nhiệm trong experiment |
|---|---|---|
| PL | [Họ tên] | Coordinate tiến độ, review nhất quán toàn proposal |
| DG | [Họ tên] | Thu thập + clean dataset, tạo ground truth, tính IAA |
| LR | [Họ tên] | Cấu hình API, script chạy experiment, batch processing |
| MS | [Họ tên] | Implement metrics, chạy statistical tests, tính effect size |
| RW | [Họ tên] | Viết §1, §7, intro, conclusion; hỗ trợ DG viết §3; tạo figures |

### 8.1 Resource Inventory

| Tài nguyên | Trạng thái | Owner | Ghi chú |
|---|---|---|---|
| Dataset | ✅ / ⚠️ | DG | URL + đã tải thử |
| API key | ✅ / ⚠️ | LR | Free tier: X calls/day |
| Compute | ✅ / ⚠️ | LR | Colab T4 / Kaggle P100 / local |
| Ground truth | ✅ / ⚠️ | DG | Ước tính: X giờ × Y người |

### 8.2 Chi phí ước tính

[Bảng: Item | Số lượng | Đơn giá | Tổng. Tính cụ thể — không phải “sẽ không tốn nhiều”]

### 8.3 Timeline chi tiết (Tuần 5–10)

> **Tuần 5–6:** Song song viết proposal + chuẩn bị tài nguyên  
> **Tuần 7–8:** Thực nghiệm — xem chi tiết **RBL-4**  
> **Tuần 9–10:** Viết paper + present — xem **RBL-5**
| Tuần | Hoạt động | Owner | Checkpoint – output cụ thể |
|---|---|---|---|
| **5** | Viết proposal §2–§7 (RBL-2.1 → RBL-3.1 Bước 3) | DG + RW + PL | Draft §2–§7 trong `proposal.md` |
| **5** | Verify + download dataset, kiểm tra format | DG | `data/raw/` folder + README mô tả dataset |
| **5** | Setup API, test 1 sample call, xác nhận budget | LR | `test_api.py` chạy được + API log |
| **5** | Implement metric script sơ bộ, test data giả | MS | `compute_metric.py` draft |
| **6** | Hoàn thiện §8 + resource inventory + nộp GV | PL | `proposal.md` v1.0 — nộp GV |
| **6** | GV phê duyệt | GV | `proposal.md` → trạng thái approved |
| **7** | Annotate ground truth pilot (10–20% sample) | DG | `data/pilot_ground_truth.csv` |
| **7** | Chạy LLM trên pilot sample | LR | `results/pilot_llm_output.csv` + API log |
| **7** | Tính metric pilot, kiểm tra phân phối | MS | `results/pilot_analysis.ipynb` |
| **7** | A11: Họp review pilot | PL | Meeting note + amendment nếu cần |
| **8** | Annotate full ground truth | DG | `data/full_ground_truth.csv` — N đầy đủ, IAA ≥ threshold nếu có |
| **8** | Full experiment batch run | LR | `results/full_llm_output.csv` + cost log |
| **8** | Tính metric toàn bộ + statistical tests | MS | `results/full_analysis.ipynb` |
| **8** | Tạo figures ≥ 2 plots | RW | `figures/` — boxplot + distribution |
| **9–10** | Viết paper + present | Tất cả | Xem RBL-5 |
### 8.4 Contingency Plan

**Nếu proposal chưa duyệt cuối Tuần 6:**  
Chỉ làm RQ1, bỏ RQ2 — báo GV ngay.

**Nếu API rate limit:**  
Chia batch, chạy qua đêm, hoặc dùng model nhỏ hơn nếu có amendment.

**Nếu dataset inaccessible:**  
Dùng dataset thay thế đã xác định trong §8.1 — tên + URL.

**Nếu pilot Tuần 7 phát hiện vấn đề kỹ thuật:**  
Xem §8.6 Amendment — nộp GV trong 24 giờ.

**Nếu thành viên không kịp deadline:**  
PL escalate sau 48 giờ trễ; redistribute task.
### 8.5 Checkpoint per member (Tuần 5–10)

| Role | Tuần 5 | Tuần 6 | Tuần 7 | Tuần 8 | Tuần 9–10 |
|---|---|---|---|---|---|
| **PL** | Draft §2–§7 review | Submit proposal + theo dõi GV | Pilot meeting note | Verify consistency | Final review |
| **DG** | `data/raw/` + README | Confirm §8.1 resource | `data/pilot_ground_truth.csv` | `data/full_ground_truth.csv` | Verify data traceability |
| **LR** | `test_api.py` pass | Confirm API budget | `results/pilot_llm_output.csv` | `results/full_llm_output.csv` | Archive prompts/responses |
| **MS** | `compute_metric.py` draft | Confirm stat test plan | `results/pilot_analysis.ipynb` | `results/full_analysis.ipynb` | Final statistics report |
| **RW** | Draft §7 Threats | Format + proofread §1–§7 | — | `figures/` folder | Draft final narrative |
### 8.6 Quy trình Amendment 
(khi pilot Tuần 7 phát hiện vấn đề kỹ thuật)

**Khi nào cần amendment — khi nào không:**

| Phát hiện từ pilot | Cần amendment? | Lý do |
|---|---|---|
| Phân phối data khác loại dự kiến, ví dụ bimodal hoặc heavy-tail | ✅ Đổi statistical test | Lý do kỹ thuật/statistical assumption |
| Metric không tính được do lỗi implementation hoặc data format | ✅ Đổi implementation hoặc measurement procedure | Cần sửa pipeline để đo được |
| N thực tế nhỏ hơn N trong proposal do dataset thiếu rows | ✅ Cập nhật §5.2 + power analysis | Ảnh hưởng đến thiết kế và power |
| Kết quả pilot thấp hơn threshold | ❌ Không amendment | Đây là kết quả, không phải lỗi kỹ thuật |
| Muốn thêm metric vì thấy kết quả thú vị | ❌ Không amendment | HARKing — vi phạm khoa học |
# Proposal Amendment [v1.0 → v1.1] – [Topic]

**Nhóm:**  
**Ngày:**  
**Lý do:** Phát hiện từ pilot Tuần 7

## Vấn đề phát hiện

[Mô tả kỹ thuật cụ thể — ví dụ: “Phân phối cosine similarity bimodal, có cluster dưới 0.3...”]

## Thay đổi đề xuất

| Mục | Proposal v1.0 | Đề xuất v1.1 | Lý do kỹ thuật |
|---|---|---|---|
| §5.6 Test | Wilcoxon | Mann-Whitney U | Distribution bimodal |
| §6.1 Reject condition | median ≥ 0.85 | ... | ... |

## Sections bị ảnh hưởng

- [ ] §4: H0/H1 cập nhật
- [ ] §5.6: Statistical test plan cập nhật
- [ ] §6.1: Reject condition cập nhật

**Đính kèm:** `results/pilot_analysis.ipynb` — bằng chứng kỹ thuật

**Xin phê duyệt GV:** [ ] Approved — Ngày: ____
Thời hạn:
Nộp amendment trong 24 giờ sau pilot meeting.
Nếu GV chưa phản hồi sau 48 giờ → PL escalate hoặc proceed với option bảo thủ hơn.
Thời hạn:
Nộp amendment trong 24 giờ sau pilot meeting. Nếu GV chưa phản hồi sau 48 giờ → PL escalate hoặc proceed với option bảo thủ hơn.

❌ Không được:
Thay đổi RQ chính hoặc thay metric sau khi thấy kết quả — amendment chỉ cho lý do kỹ thuật, không phải vì “kết quả không như ý”.
---

## BƯỚC 4 — Kiểm tra nhất quán cross-section 
(30 phút, trước khi nộp)

| Kiểm tra | Pass nếu... |
|---|---|
| §2 ↔ §4 | RQ address trực tiếp GAP primary trong §2, không rộng hơn scope GAP |
| §4 ↔ §5 | Tên metric + library trong §4 = §5.4, khớp chính xác |
| §4 ↔ §5 | Claim type trong §4 → baseline type trong §5.5 nhất quán |
| §4 ↔ §6 | Điều kiện “H0 bị reject” trong §6.1 nhất quán với test + ngưỡng trong §4 |
| §5 ↔ §7 | Mỗi threat trong §7 có mitigation action nằm trong protocol §5 |
| §5 ↔ §8 | Timeline §8.3 bao gồm tất cả hoạt động trong pipeline §5.1 |

## CHECKLIST TRƯỚC KHI NỘP

**§2 Problem Statement:**
- [ ] ≥ 3 paper theo tên cụ thể, không viết “nhiều nghiên cứu”
- [ ] GAP ghi loại T/M/D/S + N paper từ evidence table
- [ ] Reference đến gap-analysis.md, phần phản chứng đã thực hiện
- [ ] Motivation nêu hệ quả thực tế, không chỉ “topic thú vị”

**§3 Related Work:**
- [ ] Pattern analysis là nhận xét tổng hợp, không mô tả từng paper
- [ ] GAP mapping có số paper support từng GAP

**§4 Research Questions:**
- [ ] Mỗi RQ đủ P, I, O và C nếu là comparative
- [ ] Threshold có Case 1/2/3 + trích dẫn nguồn *(xem RBL-2 Bước 3B để chọn Case)*
- [ ] Statistical test đã chỉ định — không phải TBD

**§5 Protocol:**
- [ ] Model version chính xác, ví dụ `gpt-4o-2024-08-06`, không phải chỉ ghi “GPT-4o”
- [ ] Tất cả hyperparameter ghi đủ: temperature, top_p, max_tokens, ...
- [ ] Prompt template ghi nguyên văn
- [ ] Ground truth source rõ ràng + IAA nếu có human annotation

**§6 Evaluation Plan:**
- [ ] Điều kiện reject H0 cụ thể cho mỗi RQ
- [ ] Kết quả âm tính có diễn giải có ý nghĩa
- [ ] Không có kế hoạch thay metric sau khi thấy data, tránh HARKing

**§7 Threats to Validity:**
- [ ] Đủ 4 loại: Internal, External, Construct, Conclusion
- [ ] Mỗi mitigation là hành động kiểm chứng được, không phải ý định
- [ ] Model version drift đề cập nếu dùng cloud LLM
- [ ] Expert annotation bias đề cập nếu có human ground truth

**§8 Timeline & Resources:**
- [ ] §8.0 phân công đủ roles — mỗi thành viên gắn với 1 role hoặc ghi rõ ai giữ 2 roles
- [ ] Không gộp LR + MS vào 1 người
- [ ] Mỗi thành viên có ≥ 1 deliverable cụ thể mỗi tuần trong §8.5
- [ ] Pilot experiment là tuần riêng biệt, không nhảy thẳng vào full run
- [ ] Chi phí API tính cụ thể theo token
- [ ] Dataset đã verify accessible, tức là đã tải thử, không phải “sẽ tìm”
- [ ] Contingency cho ≥ 2 risks

---

## LỖI PHỔ BIẾN

| Lỗi | Nhận biết | Sửa |
|---|---|---|
| Copy-paste từ file cũ | §2 giống y chang `gap-analysis.md` | Viết lại — proposal phải liên kết, không copy nguyên |
| RQ quá rộng | “GPT-4o có tốt cho SE tasks không?” | Thu hẹp: task cụ thể + dataset + metric cụ thể |
| Threshold không có nguồn | “0.85 vì ngưỡng phổ biến” | Áp dụng Case 1/2/3 từ RBL-2 |
| Protocol vague | “Dùng GPT-4o để sinh output” | Ghi model version, temperature, prompt nguyên văn |
| Statistical test TBD | “Sẽ chọn sau khi xem data” | Chọn ngay từ loại output/pilot assumption |
| Threats to Validity thiếu | Chỉ có External validity | Phải đủ 4 loại, mỗi loại ≥ 1 threat |
| Mitigation là ý định | “Sẽ cố minimize bias” | Ghi hành động cụ thể, ví dụ IAA Kappa ≥ 0.7 được tính trước |
| Không có pilot | Setup → full run, không có bước trung gian | Pilot 10–20% sample là bắt buộc |
| HARKing ẩn | “Nếu RQ1 fail, sẽ thử metric khác” | 1 metric per RQ; thay đổi sau khi thấy data là không được |
| Dataset chưa verify | “Sẽ tìm dataset phù hợp” | Link cụ thể + đã tải thử trước khi nộp |
## BƯỚC 5 — Làm slide bảo vệ đề cương (2 giờ)

> **Mục đích:** Slide là bản trình bày ngắn gọn của proposal để GV hỏi và phê duyệt — không phải đọc nguyên proposal.

### 5A. Cấu trúc slide (9–11 slides)

| Slide | Nội dung | Thời gian | Ghi chú |
|---|---|---|---|
| **S1** | Tiêu đề + nhóm + ngày | 30 giây | Không đọc — nói ngắn gọn topic |
| **S2** | Problem — bối cảnh → GAP | 60 giây | 1 bullet/dòng; kết bằng câu GAP |
| **S3** | Evidence — bảng tóm tắt ≤ 5 dòng | 45 giây | Chỉ giữ cột Tool, Metric, Kết quả |
| **S4** | RQ + H0/H1 + threshold | 60 giây | **Slide quan trọng nhất** — GV sẽ hỏi nhiều |
| **S5** | Pipeline — sơ đồ flow hoặc danh sách ≥ 5 bước | 45 giây | Phải thấy rõ Input → Process → Output |
| **S6** | Dataset + Baseline | 30 giây | Tên cụ thể, N, accessible status ✅ / ⚠️ |
| **S7** | Statistical plan — 1 bảng nhỏ | 30 giây | Test + α + effect size — không giải thích dài |
| **S8** | Threats to Validity — top 2–3 | 30 giây | Format: Threat → Mitigation action |
| **S9** | Timeline Tuần 5–8 + phân công role | 30 giây | Dùng role code PL/DG/LR/MS/RW |
| **S10** | Tóm tắt đóng góp dự kiến | 20 giây | 1–2 bullet: “Đề tài đóng góp X vào Y” |
| **S11** | Q&A | — | Trang trống hoặc backup slides |

> **Tổng:** khoảng 5 phút 30 giây — đủ thời gian cho Q&A 1–2 phút.
### 5B. Slide S4 — chi tiết 
(slide quan trọng nhất)

Slide title: Research Questions

RQ1:
[P] + [I] có đạt [O ≥ threshold] không?

H0: [I] KHÔNG đạt [metric] ≥ [threshold]  
H1: [I] ĐẠT [metric] ≥ [threshold]  
Metric: [tên]  
Threshold: [giá trị] (Case X)  
Test: [tên], α = 0.05

[RQ2 nếu có — cùng format]
GV thường hỏi: “Threshold lấy từ đâu?”
→ Phải trả lời ngay được: “Case X, từ paper [tên paper].”
### 5C. Quy tắc làm slide

### 5C. Quy tắc làm slide

| Làm | Không làm |
|---|---|
| Mỗi slide 1 ý chính, tối đa 5 bullet | Copy-paste đoạn văn từ proposal |
| Highlight số liệu quan trọng: threshold, N, p-value | Font < 18pt |
| Sơ đồ flow cho pipeline, không viết dạng chữ | Đọc slide — GV sẽ interrupt |
| Backup slide: evidence table đầy đủ, không trình bày, dùng khi bị hỏi | Bullet quá dài |
| Export PDF trước khi nộp — test trên máy khác | Dùng animation phức tạp |
### 5D. Checklist trước khi trình bày

- [ ] Slide PPTX — kiểm tra font, hình không bị vỡ
- [ ] S4 ghi đầy đủ: RQ + H0/H1 + metric + threshold với Case + test + α
- [ ] S5 pipeline có sơ đồ flow, không chỉ chữ
- [ ] S6 dataset: tên + N + accessible status
- [ ] Slide không có bullet dài hơn 1 dòng
- [ ] Backup slide: evidence table đầy đủ, thêm vào sau S11
- [ ] Thời gian trình bày: ≤ 6 phút, không kể Q&A

Sau khi GV phê duyệt proposal:
Không được thay đổi RQ, metric, hay threshold. Mọi thay đổi phải qua amendment.

Bước tiếp theo:
Chạy thực nghiệm theo đúng protocol đã chốt trong §5.
