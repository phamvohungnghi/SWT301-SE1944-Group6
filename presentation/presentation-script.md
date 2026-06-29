# Script thuyết trình RBL-3 — bản Revised

Deck sử dụng: `GPT-4o_RBL3_Proposal_Defense_Visual_Revised.pptx`

## Phân công và thời lượng

| Slide | Nội dung | Người nói | Thời lượng |
|---|---|---:|---:|
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

**Tổng mục tiêu:** khoảng 7 phút 10 giây.

---

## S1 — Nghi: Title & Scope

“Nhóm em nghiên cứu chất lượng unit test được sinh ở lần phản hồi đầu tiên của GPT-4o. Phạm vi gồm 50 units Java và Python có Cyclomatic Complexity từ 5 đến 15. Đây là controlled empirical study; nhóm không khái quát kết quả cho mọi model hoặc mọi loại mã nguồn.”

**Chuyển:** “Vinh sẽ trình bày vấn đề nghiên cứu và khoảng trống mà nhóm xác định.”

## S2 — Vinh: Problem → GAP

“Các kết quả trong tài liệu trước không thể so sánh trực tiếp vì **dataset, model, prompt, metric và repair mechanism** khác nhau. Ví dụ: TestPilot báo **median branch coverage 52,8%** trên JavaScript/Python function-level (Schäfer 2024, IEEE TSE); AgoneTest báo **highest branch coverage 79,8%** trên Java class-level với nhiều model và nhiều prompt — compilation chỉ đạt **36%** (Lops 2025, ASE). Hai con số này không cùng estimand. Trong **10 papers** nhóm đã rà soát, chưa ghi nhận nghiên cứu nào đánh giá đồng thời mẫu cân bằng Java–Python được lọc trước theo CC từ 5 đến 15. Đây là **bounded GAP trong tập tài liệu đã rà soát** — không phải khẳng định cho toàn bộ literature. Vì vậy nhóm cần một protocol có kiểm soát.”

## S3 — Vinh: Key Evidence

“Bảng này giữ lại **5 paper liên quan trực tiếp nhất**:

- **TestPilot** (Schäfer 2024, IEEE TSE CORE A\*): median branch coverage **52,8%**, dùng gpt-3.5-turbo, function-level JS/Python, zero-shot.
- **AgoneTest** (Lops 2025, ASE CORE A\*): highest branch coverage **79,8%**, mutation score highest **89,2%**, nhưng compilation chỉ **36%** — kết quả là maximum nhiều model/prompt.
- **GEM** (Celik 2026, CIbSE): branch **84,30%→88,81%**, mutation **72,71%→81,85%** — kết quả **sau** repair và strengthening.
- **ASTER** (Pan 2024, ICSE-SEIP CORE A\*): branch **77,2%** với static analysis và error remediation.
- **ChatTester** (Yuan 2024, FSE CORE A\*): branch **>82%**, mutation **>65%** — Java class-level, multi-turn repair.

Vì treatment và cách tổng hợp khác nhau, nhóm **chỉ dùng các số này làm bối cảnh**; không gộp meta-analysis và không suy ra universal threshold.”

**Chuyển:** “Từ GAP và evidence này, Quân sẽ trình bày ba câu hỏi nghiên cứu đã được khóa.”

## S4 — Quân: RQ & Statistical Tests

“**RQ1** kiểm tra median branch coverage của từng ngôn ngữ có lớn hơn **practical target 75%** hay không. Nhóm dùng **exact sign test một phía** và **Holm correction** cho hai phép kiểm định Java–Python. Mốc **75%** là **Case 3 — pre-registered practical target**: TestPilot 52,8% và AgoneTest 79,8% chỉ tạo bối cảnh; không gọi là industry standard hay published floor.

**RQ2** so sánh mutation score của GPT-4o với **Randoop 4.3.4** trên cùng **25 Java units** bằng **paired one-sided Wilcoxon signed-rank**.

**RQ3** kiểm tra tương quan âm giữa CC và quality bằng **one-sided Spearman**, với Holm correction cho **bốn cặp** language×outcome. Family alpha là **0,05**. RQ3 được xác định là **exploratory**.”

**Chuyển:** “Thái sẽ trình bày pipeline và cấu hình model được cố định trước khi chạy.”

## S5 — Thái: Pipeline & Model Specification

“Mỗi unit đi qua cùng một pipeline. Dataset 50 units được đo CC bằng **Lizard 1.23.0** và chỉ giữ CC từ 5 đến 15. Nhóm gửi fixed prompt tới model **`gpt-4o-2024-08-06`** qua endpoint **`POST /v1/responses`**, sử dụng **OpenAI Python SDK 2.43.0**. Các tham số: **temperature=0.2**, **top_p=1**, **max_output_tokens=2048**. Mỗi unit chỉ nhận **một response, không content regeneration**.

Generated tests được đo coverage bằng **JaCoCo 0.8.13** (Java) / **coverage.py 7.14.2** (Python) và mutation score bằng **PIT 1.19.1** (Java) / **pytest-mutagen 1.3** (Python), sau đó đưa vào statistical analysis.

Nhóm lưu raw request, raw response, model/response ID, token usage, UTC time và hash. Infrastructure retry chỉ được phép **trước** khi API trả nội dung; response đã nhận không được gọi lại để sửa test.”

**Chuyển:** “Vinh sẽ trình bày cấu trúc dataset và baseline.”

## S6 — Vinh: Dataset & Baseline

“Dataset gồm **50 units: 25 Java + 25 Python**. Tất cả nằm trong khoảng **CC từ 5 đến 15**, đo bằng Lizard 1.23.0. Phân khúc Java kế thừa từ benchmark **CLASSES2TEST** (Lops 2025, ASE CORE A\*); phân khúc Python kế thừa phương pháp luận từ **TestPilot** (Schäfer 2024, IEEE TSE CORE A\*) và **ASTER** (Pan 2024, ICSE CORE A\*).

**Randoop 4.3.4** chạy **60 giây/Java unit** với seed cố định `randomseed=20260621` — chỉ là baseline cho **25 Java units**; Python không có baseline tương ứng. Trước full run, mỗi unit phải có source, license, commit SHA và hash. Unit không đạt **provenance gate** hoặc không build/import độc lập sẽ không vào mẫu freeze.”

**Chuyển:** “Văn sẽ trình bày cách nhóm phân công theo work package.”

## S7 — Văn: Work Packages

“Nhóm áp dụng nguyên tắc một work package có một owner chính. Vinh phụ trách dataset và preflight cho cả 50 units. Thái phụ trách 50 API generations và raw logs. Quân phụ trách 25 Java units, Randoop và statistical analysis. Em phụ trách 25 Python units, figures và validity observations. Nghi quản lý protocol, reproducibility gate và final integration. Mỗi thành viên tự viết subsection tương ứng với phần mình thực hiện; không giao một người viết thay toàn bộ nhóm.”

**Chuyển:** “Quân sẽ trình bày cách nhóm diễn giải mọi khả năng kết quả.”

## S8 — Quân: Evaluation Plan

Ở slide này, nhóm trình bày kế hoạch đánh giá chất lượng unit test do GPT-4o sinh ra. Nhóm dùng ba metric chính.

Thứ nhất là Branch Coverage, dùng để đo test bao phủ được bao nhiêu nhánh điều kiện trong code. Java sẽ đo bằng JaCoCo, còn Python đo bằng coverage.py.

Thứ hai là Mutation Score, dùng để kiểm tra test có phát hiện được lỗi logic giả lập hay không. Java dùng PIT, Python dùng pytest-mutagen.

Thứ ba là Executability, tức là tỉ lệ test case chạy thành công, không bị lỗi compile hoặc runtime.

Các thí nghiệm sẽ chạy trong môi trường chuẩn gồm Python 3.10, Java OpenJDK 17 và sandbox độc lập để đảm bảo kết quả không bị ảnh hưởng chéo giữa các unit.

**Chuyển:** “Văn sẽ trình bày threats to validity và mitigation tương ứng.”

## S9 — Văn: Threats to Validity

“Internal validity có nguy cơ model drift, nên nhóm pin exact snapshot và lưu raw logs. External validity bị giới hạn bởi 50 units, nên claim chỉ nằm trong sample và phạm vi CC đã chọn. Construct validity: coverage không đồng nghĩa khả năng phát hiện fault, nên nhóm bổ sung Mutation Score và executability. Conclusion validity: mẫu nhỏ và range restriction có thể làm estimate không ổn định, nên nhóm báo effect và confidence interval, đồng thời giữ RQ3 ở mức exploratory. Protocol được freeze trước full run để giảm researcher degrees of freedom.”

Note: Slide này trình bày các mối đe dọa đến tính hợp lệ của nghiên cứu và cách nhóm giảm thiểu.

Thứ nhất là Construct Validity. Coverage cao không có nghĩa là test bắt được lỗi logic thật. Vì vậy nhóm không chỉ dùng Branch Coverage mà còn bổ sung Mutation Score và Executability để đánh giá test toàn diện hơn.

Thứ hai là External Validity. Nghiên cứu chỉ thực hiện trên 50 units, gồm Java và Python, với độ phức tạp CC từ 5 đến 15. Vì vậy kết luận của nhóm chỉ giới hạn trong phạm vi mẫu này, không khái quát cho mọi ngôn ngữ hoặc hệ thống lớn.

Thứ ba là Internal Validity. Kết quả có thể phụ thuộc vào prompt và cấu hình model. Để giảm rủi ro này, nhóm dùng frozen prompt, cố định phiên bản model và lưu đầy đủ raw logs cùng các tham số API.

Ngoài ra, do cỡ mẫu không lớn, nhóm sẽ báo cáo thêm effect size và confidence interval để tránh kết luận quá mạnh từ p-value.

**Chuyển:** “Nghi sẽ trình bày timeline, tài nguyên và contingency.”

## S10 — Nghi: Timeline & Resources

“**Tuần 7**: nhóm chạy **pilot 5 Java + 5 Python** để kiểm tra fixture, commands, logging và runtime; pilot không dùng để đổi threshold hoặc hypotheses. Sau **freeze gate**, **Tuần 8** mới chạy full dataset và baseline. **Tuần 9** thực hiện analysis đã đăng ký trước và chuẩn bị defense.

Tài nguyên: API budget, CPU environment và Git repository lưu artifacts. Chi phí full run ước lượng **~$1.14 USD** (50 requests tổng cộng ≈ 87.500 tokens, đơn giá $5/M input + $15/M output token). Nếu model snapshot không còn khả dụng, nhóm dừng và lập amendment. Nếu toolchain lỗi, sửa và chạy lại pilot trước khi full run.”

## S11 — Nghi: Contribution & Q&A

“Đóng góp dự kiến gồm ba phần: một protocol kiểm soát CC từ 5 đến 15; paired Java comparison với Randoop; và reproducibility package có traceability cho đủ 50 units. Nhóm không tuyên bố GPT-4o tốt hơn trong mọi trường hợp. Nhóm em xin nhận câu hỏi.”

---

## Phân công trả lời Q&A

| Chủ đề | Người trả lời chính | Người bổ sung |
|---|---|---|
| Evidence, GAP, dataset, provenance | Vinh | Nghi |
| Model, API, SDK, prompt, token và retry | Thái | Nghi |
| RQ, H0/H1, statistical tests, Randoop | Quân | Nghi |
| Python toolchain, figures, threats | Văn | Quân |
| Timeline, resources, amendment, contribution | Nghi | Owner liên quan |

## Câu trả lời ngắn cho câu hỏi dễ bị hỏi

### “Tại sao chọn 75%?”

“75% là Case 3 — practical target được đăng ký trước. TestPilot 52,8% median branch coverage và AgoneTest 79,8% maximum branch coverage chỉ cung cấp bối cảnh. Nhóm không gọi 75% là industry standard hoặc published floor.”

### “Tại sao chỉ chạy một response?”

“Mục tiêu là đo first-attempt zero-shot capability. Regeneration hoặc repair sẽ tạo treatment khác và làm mất khả năng cô lập kết quả lần đầu.”

### “Tại sao Python không có baseline?”

“Randoop 4.3.4 là baseline dành cho Java trong protocol đã duyệt. Nghiên cứu không tự thêm một Python baseline mới sau phê duyệt.”

### “Coverage cao có nghĩa test tốt không?”

“Không. Vì vậy nghiên cứu dùng thêm mutation score và executability. Coverage và mutation được báo riêng, không thay thế cho nhau.”

### “Có thể khái quát cho toàn bộ source code không?”

“Không. Claim bị giới hạn trong 50 units đủ điều kiện, hai ngôn ngữ và khoảng CC từ 5 đến 15.”

### "AgoneTest báo 79,8% sao nhóm không lấy làm threshold?"

"79,8% là **highest** trong ma trận nhiều model và nhiều prompt (gpt-4o-mini, gemini-1.5-pro, llama3.1:70b), không phải median zero-shot của GPT-4o. Ngoài ra, compilation rate của AgoneTest chỉ đạt **36%** — không phải baseline đại diện cho first-attempt performance."

### "ChatTester đạt >82% branch coverage sao nhóm không dùng threshold đó?"

"ChatTester dùng **multi-turn repair** ở Java class-level (Yuan 2024, FSE), không phải single zero-shot response. Treatment khác hoàn toàn; không thể dùng làm threshold cho nghiên cứu này."

### "TestPilot dùng model gì?"

"TestPilot (Schäfer 2024) dùng **gpt-3.5-turbo, code-cushman-002 và StarCoder** — không dùng GPT-4o. Số 52,8% median branch coverage là của các model đó, không phải GPT-4o. Nghiên cứu này là first-attempt GPT-4o trên balanced Java/Python filtered CC 5–15 — khác hoàn toàn với TestPilot."

### "Chi phí thực nghiệm có đắt không?"

"Chi phí ước tính **~$1.14 USD** cho 50 units (60 API calls ≈ 87.500 tokens tổng). Đây hoàn toàn nằm trong ngân sách an toàn dưới $5 USD."

## Quy tắc tập nói

- Không đọc bảng hoặc sơ đồ; chỉ giải thích quan hệ và ý nghĩa.
- Dùng “nghiên cứu sẽ đo” khi chưa có kết quả full run.
- Không nói 75% là standard; gọi đúng là `pre-registered practical target`.
- Không nói GAP tồn tại trong toàn bộ literature; giới hạn trong 10 papers đã rà soát.
- Không tự thêm model, baseline, metric hoặc statistical test khi trả lời.
- Người tiếp theo đứng sẵn trước câu chuyển giao.
