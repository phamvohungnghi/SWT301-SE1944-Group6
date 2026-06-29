# Presentation Script – RBL-3 Proposal Defense

**Total time:** ~7 phút 10 giây | **Deck:** `GPT-4o_RBL3_Proposal_Defense_Visual_Revised.pptx`

---

## Phân công và thời lượng

| Slide | Nội dung | Người nói | Thời lượng |
|---|---|:---:|:---:|
| S1 | Title & Scope | Nghi | 20 giây |
| S2 | Problem → GAP | Vinh | 35 giây |
| S3 | Key Evidence | Vinh | 45 giây |
| S4 | RQ & Statistical Tests | Quân | 50 giây |
| S5 | Pipeline & Model Specification | Thái | 50 giây |
| S6 | Dataset & Baseline | Vinh | 40 giây |
| S7 | Work Packages | Văn | 40 giây |
| S8 | Evaluation Plan | Quân | 45 giây |
| S9 | Threats to Validity | Văn | 40 giây |
| S10 | Timeline & Resources | Nghi | 40 giây |
| S11 | Contribution & Q&A | Nghi | 25 giây |

---

## 🎤 S1 — Nghi: Title & Scope (20 giây)

"Nhóm em nghiên cứu chất lượng unit test được sinh ở **lần phản hồi đầu tiên** của **GPT-4o**. Phạm vi gồm **50 units Java và Python** có Cyclomatic Complexity từ 5 đến 15. Đây là controlled empirical study; nhóm không khái quát kết quả cho mọi model hoặc mọi loại mã nguồn."

**Chuyển:** "Vinh sẽ trình bày vấn đề nghiên cứu và khoảng trống nhóm xác định."

---

## 🎤 S2 — Vinh: Problem → GAP (35 giây)

"Các kết quả trong tài liệu trước không thể so sánh trực tiếp vì **dataset, model, prompt, metric và repair mechanism** khác nhau. Ví dụ: TestPilot báo **median branch coverage 52,8%** trên JavaScript/Python function-level; AgoneTest báo **highest branch coverage 79,8%** trên Java class-level nhưng dùng nhiều model và nhiều prompt. Hai con số này **không cùng estimand**.

Trong **10 papers** nhóm đã rà soát, chưa ghi nhận nghiên cứu nào đánh giá đồng thời mẫu cân bằng Java–Python được lọc trước theo CC từ 5 đến 15. Đây là **bounded GAP trong tập tài liệu đã rà soát** — không phải khẳng định cho toàn bộ literature. Vì vậy nhóm cần một protocol có kiểm soát."

---

## 🎤 S3 — Vinh: Key Evidence (45 giây)

"Bảng này giữ lại **5 paper liên quan trực tiếp nhất** từ 10 nghiên cứu trong SLR."

| Paper | Branch Coverage | Mutation Score | Ghi chú quan trọng |
|---|---|---|---|
| **TestPilot** (Schäfer 2024, IEEE TSE) | Median **52,8%** | NR cho GPT-4o | JS/Python, function-level, zero-shot |
| **AgoneTest** (Lops 2025, ASE) | Highest **79,8%** | Highest **89,2%** | Java class-level, compilation chỉ đạt **36%** |
| **GEM** (Celik 2026, CIbSE) | **84,30%→88,81%** | **72,71%→81,85%** | Kết quả **sau** repair/strengthening |
| **ASTER** (Pan 2024, ICSE-SEIP) | **77,2%** | NR | Có static analysis + error remediation |
| **ChatTester** (Yuan 2024, FSE) | **>82%** | **>65%** | Java class-level, multi-turn repair |

"Vì treatment và cách tổng hợp khác nhau, nhóm **chỉ dùng các số này làm bối cảnh**; không gộp meta-analysis và không suy ra universal threshold."

**Chuyển:** "Từ GAP và evidence này, Quân sẽ trình bày ba câu hỏi nghiên cứu đã được khóa."

---

## 🎤 S4 — Quân: RQ & Statistical Tests (50 giây)

"**RQ1** kiểm tra median branch coverage của từng ngôn ngữ có lớn hơn **practical target 75%** hay không. Nhóm dùng **exact sign test một phía** và **Holm correction** cho hai phép kiểm định Java–Python.

Mốc **75%** là **Case 3 — pre-registered practical target**: TestPilot 52,8% và AgoneTest 79,8% chỉ tạo bối cảnh; không gọi là industry standard hay published floor.

**RQ2** so sánh mutation score của GPT-4o với **Randoop 4.3.4** trên cùng **25 Java units** bằng **paired one-sided Wilcoxon signed-rank**.

**RQ3** kiểm tra tương quan âm giữa CC và quality bằng **one-sided Spearman**, với Holm correction cho **bốn cặp** language×outcome. RQ3 được xác định là **exploratory**. Family alpha là **0,05**."

**Chuyển:** "Thái sẽ trình bày pipeline và cấu hình model được cố định trước khi chạy."

---

## 🎤 S5 — Thái: Pipeline & Model Specification (50 giây)

"Mỗi unit đi qua cùng một pipeline. Dataset 50 units được đo CC bằng **Lizard 1.23.0** và chỉ giữ CC từ 5 đến 15. Nhóm gửi fixed prompt tới model **`gpt-4o-2024-08-06`** qua endpoint **`POST /v1/responses`**, sử dụng **OpenAI Python SDK 2.43.0**. Các tham số: **temperature=0.2**, **top_p=1**, **max_output_tokens=2048**. Mỗi unit chỉ nhận **một response, không content regeneration**.

Generated tests được đo coverage bằng **JaCoCo 0.8.13** (Java) / **coverage.py 7.14.2** (Python) và mutation score bằng **PIT 1.19.1** (Java) / **pytest-mutagen 1.3** (Python), sau đó đưa vào statistical analysis.

Nhóm lưu raw request, raw response, model/response ID, token usage, UTC time và hash. Infrastructure retry chỉ được phép **trước** khi API trả nội dung; response đã nhận không được gọi lại để sửa test."

**Chuyển:** "Vinh sẽ trình bày cấu trúc dataset và baseline."

---

## 🎤 S6 — Vinh: Dataset & Baseline (40 giây)

"Dataset gồm **50 units: 25 Java + 25 Python**. Tất cả nằm trong khoảng **CC từ 5 đến 15**, đo bằng Lizard 1.23.0. Phân khúc Java kế thừa từ benchmark **CLASSES2TEST** (Lops 2025, ASE CORE A*); phân khúc Python kế thừa phương pháp luận thu thập từ **TestPilot** (Schäfer 2024, IEEE TSE CORE A*) và **ASTER** (Pan 2024, ICSE CORE A*).

**Randoop 4.3.4** chạy **60 giây/Java unit** với seed cố định `randomseed=20260621` — chỉ là baseline cho **25 Java units**; Python không có baseline tương ứng. Trước full run, mỗi unit phải có source, license, commit SHA và hash. Unit không đạt **provenance gate** hoặc không build/import độc lập sẽ không vào mẫu freeze."

**Chuyển:** "Văn sẽ trình bày cách nhóm phân công theo work package."

---

## 🎤 S7 — Văn: Work Packages (40 giây)

"Nhóm áp dụng nguyên tắc **một work package — một owner chính**.

- **Vinh** phụ trách dataset và preflight cho cả 50 units.
- **Thái** phụ trách 50 API generations và raw logs.
- **Quân** phụ trách 25 Java units, Randoop và statistical analysis.
- **Em** phụ trách 25 Python units, figures và validity observations.
- **Nghi** quản lý protocol, reproducibility gate và final integration.

Mỗi thành viên **tự viết subsection** tương ứng với phần mình thực hiện; không giao một người viết thay toàn bộ nhóm."

**Chuyển:** "Quân sẽ trình bày cách nhóm diễn giải mọi khả năng kết quả."

---

## 🎤 S8 — Quân: Evaluation Plan (45 giây)

"Với **RQ1**: nếu cả Java và Python đều vượt **75%** thì evidence ổn định hơn giữa hai ngôn ngữ. Nếu chỉ một vượt, kết luận phải ghi rõ **language-specific**. Nếu cả hai không vượt, kết luận là target không được hỗ trợ — **không thay threshold sau khi xem kết quả**.

Với **RQ2**: nhóm báo **paired mutation difference** dù GPT-4o tốt hơn hay không tốt hơn Randoop. Mọi bảng kết quả phải có: số mẫu hợp lệ và missing, median/IQR, effect estimate, **95% confidence interval**, raw p-value và adjusted p-value khi áp dụng."

**Chuyển:** "Văn sẽ trình bày threats to validity và mitigation tương ứng."

---

## 🎤 S9 — Văn: Threats to Validity (40 giây)

"**Internal validity**: nguy cơ model drift → pin exact snapshot **`gpt-4o-2024-08-06`** và lưu raw logs.

**External validity**: 50 units là mẫu nhỏ → claim chỉ nằm trong sample và phạm vi **CC 5–15** đã chọn.

**Construct validity**: coverage không đồng nghĩa phát hiện fault → bổ sung **Mutation Score** và **Executability**.

**Conclusion validity**: mẫu nhỏ và range restriction → báo **effect size**, **95% CI**, giữ **RQ3 ở mức exploratory**.

Protocol được **freeze trước full run** để giảm researcher degrees of freedom."

**Chuyển:** "Nghi sẽ trình bày timeline, tài nguyên và contingency."

---

## 🎤 S10 — Nghi: Timeline & Resources (40 giây)

"**Tuần 7**: nhóm chạy **pilot 5 Java + 5 Python** để kiểm tra fixture, commands, logging và runtime; pilot không dùng để đổi threshold hoặc hypotheses. Sau **freeze gate**, **Tuần 8** mới chạy full dataset và baseline. **Tuần 9** thực hiện analysis đã đăng ký trước và chuẩn bị defense.

Tài nguyên: API budget, CPU environment và Git repository lưu artifacts. Chi phí full run ước lượng **~$1.14 USD** (tổng 60 requests ≈ 87.500 tokens). Nếu model snapshot không còn khả dụng, nhóm dừng và lập amendment. Nếu toolchain lỗi, sửa và chạy lại pilot trước khi full run."

---

## 🎤 S11 — Nghi: Contribution & Q&A (25 giây)

"Đóng góp dự kiến gồm ba phần:
1. Protocol kiểm soát CC từ 5 đến 15.
2. Paired Java comparison với Randoop.
3. Reproducibility package có traceability cho đủ 50 units.

Nhóm **không** tuyên bố GPT-4o tốt hơn trong mọi trường hợp. Nhóm em xin nhận câu hỏi."

---

## Phân công trả lời Q&A

| Chủ đề | Người trả lời chính | Người bổ sung |
|---|---|---|
| Evidence, GAP, dataset, provenance | Vinh | Nghi |
| Model, API, SDK, prompt, token và retry | Thái | Nghi |
| RQ, H0/H1, statistical tests, Randoop | Quân | Nghi |
| Python toolchain, figures, threats | Văn | Quân |
| Timeline, resources, amendment, contribution | Nghi | Owner liên quan |

---

## Câu trả lời ngắn cho câu hỏi thường gặp

### "Tại sao chọn 75%?"

"75% là **Case 3 — practical target được đăng ký trước**. TestPilot 52,8% median branch coverage và AgoneTest 79,8% maximum branch coverage chỉ cung cấp bối cảnh. Nhóm không gọi 75% là industry standard hoặc published floor."

### "AgoneTest báo 79,8% sao nhóm không lấy làm baseline?"

"79,8% là **highest** trong ma trận nhiều model và nhiều prompt, không phải median zero-shot GPT-4o. Ngoài ra, compilation rate của AgoneTest chỉ đạt **36%** — không phải baseline đại diện cho first-attempt performance."

### "ChatTester đạt >82% sao nhóm không dùng threshold đó?"

"ChatTester dùng **multi-turn repair** ở Java class-level, không phải single zero-shot response. Treatment khác hoàn toàn với nghiên cứu này."

### "Tại sao chỉ chạy một response?"

"Mục tiêu là đo **first-attempt zero-shot capability**. Regeneration hoặc repair sẽ tạo treatment khác và làm mất khả năng cô lập kết quả lần đầu."

### "Tại sao Python không có baseline?"

"Randoop 4.3.4 là baseline dành cho Java trong protocol đã duyệt. Nghiên cứu không tự thêm một Python baseline mới sau phê duyệt."

### "Coverage cao có nghĩa test tốt không?"

"Không. Vì vậy nghiên cứu dùng thêm **mutation score** và **executability**. Coverage và mutation được báo riêng, không thay thế cho nhau."

### "Có thể khái quát cho toàn bộ source code không?"

"Không. Claim bị giới hạn trong **50 units đủ điều kiện**, hai ngôn ngữ và khoảng **CC từ 5 đến 15**."

### "TestPilot dùng GPT-3.5 hay GPT-4o?"

"TestPilot (Schäfer 2024) dùng **gpt-3.5-turbo**, **code-cushman-002** và **StarCoder** — không dùng GPT-4o. Số 52,8% là median branch coverage của model đó, không phải GPT-4o. Nghiên cứu này là **nghiên cứu đầu tiên** đánh giá GPT-4o trên mẫu Java/Python cân bằng lọc theo CC 5–15."

---

## Quy tắc tập nói

- Không đọc bảng hoặc sơ đồ; chỉ giải thích **quan hệ và ý nghĩa**.
- Dùng "nghiên cứu sẽ đo" khi chưa có kết quả full run.
- Không nói 75% là standard; gọi đúng là **pre-registered practical target**.
- Không nói GAP tồn tại trong toàn bộ literature; giới hạn trong **10 papers đã rà soát**.
- Không tự thêm model, baseline, metric hoặc statistical test khi trả lời.
- Người tiếp theo đứng sẵn **trước** câu chuyển giao.
- Khi nêu số liệu phải kèm **paper + loại aggregation** (median/highest/maximum).
