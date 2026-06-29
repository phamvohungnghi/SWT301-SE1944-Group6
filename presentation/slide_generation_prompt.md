# Bộ Prompt Tạo Slide Thuyết Trình RBL-3 Proposal Defense

Tài liệu này cung cấp các prompt được tối ưu hóa để bạn có thể sử dụng các công cụ AI khác nhau nhằm tạo slide thuyết trình tự động một cách đẹp mắt và chuyên nghiệp.

---

## 1. Prompt Dành Cho Công Cụ Tạo Slide AI (Gamma.app, Tome, Mindshow, ChatGPT PPTX Plugin)

*Copy toàn bộ phần bên dưới và dán vào ô nhập liệu của Gamma, Tome, hoặc ChatGPT để AI tự động thiết kế slide:*

```text
Hãy tạo một slide thuyết trình PowerPoint chuyên nghiệp theo phong cách Dark Mode (nền tối màu xanh đen/dark navy #0d1117, chữ trắng, nhấn màu Cyan #00bcd4, Amber #ffc107 và Emerald Green #00e676). 

Nội dung thuyết trình là báo cáo "RBL-3 Proposal Defense: Đánh giá chất lượng sinh unit test của GPT-4o". Slide cần trình bày súc tích dưới dạng thẻ (cards), bảng biểu (tables), bullet points có khoảng trống lớn, không viết thành đoạn văn dài.

Dưới đây là cấu trúc chi tiết của 11 slide:

---

### Slide 1: Title & Scope
- **Tiêu đề lớn:** Empirical Evaluation of GPT-4o's First-Response Unit Test Quality
- **Mục tiêu:** Đánh giá chất lượng unit test sinh ra từ lần phản hồi đầu tiên (first-response) của GPT-4o.
- **Phạm vi nghiên cứu (Scope):** 
  * 50 units (25 Java, 25 Python).
  * Độ phức tạp Cyclomatic Complexity (CC) từ 5 đến 15.
  * Controlled empirical study (không khái quát cho mọi model hay mọi mã nguồn).
- **Thành viên nhóm:** Nhóm 6 - SWT301 (SE1944).

---

### Slide 2: Vấn Đề Nghiên Cứu & Khoảng Trống (Problem & GAP)
- **Vấn đề (Problem):** Các nghiên cứu trước không thể so sánh trực tiếp vì khác biệt về: dataset, model, prompt, metric, repair mechanism.
- **Dẫn chứng mâu thuẫn số liệu:**
  * TestPilot (Schäfer 2024): median branch coverage 52.8% (JS/Python function-level, zero-shot).
  * AgoneTest (Lops 2025): highest branch coverage 79.8% (Java class-level, multi-model/prompt), nhưng compilation chỉ đạt 36%.
  -> Hai con số này không cùng estimand!
- **Khoảng trống xác định (Bounded GAP):** Chưa có nghiên cứu nào đánh giá đồng thời trên tập mẫu cân bằng Java–Python được lọc trước theo độ phức tạp CC (5-15) dưới dạng controlled protocol.

---

### Slide 3: Bảng Bằng Chứng Liên Quan (Key Evidence Table)
- **Bảng so sánh 5 nghiên cứu liên quan nhất:**
| Nghiên cứu | Ngữ cảnh | Branch Coverage | Mutation Score | Ghi chú |
|---|---|---|---|---|
| **TestPilot** (Schäfer 2024, TSE) | JS/Python, Function | 52.8% (Median) | NR (Không báo) | Zero-shot, không repair |
| **AgoneTest** (Lops 2025, ASE) | Java, Class-level | 79.8% (Highest) | 89.2% (Highest) | Compile 36% (Max score) |
| **GEM** (Celik 2026, CIbSE) | Java, Class-level | 84.30% -> 88.81% | 72.71% -> 81.85% | Kết quả sau repair |
| **ASTER** (Pan 2024, ICSE-SEIP) | Đa ngôn ngữ | 77.2% | NR | Dùng error remediation |
| **ChatTester** (Yuan 2024, FSE) | Java, Class-level | >82.0% (Average) | >65.0% (Average) | Multi-turn repair |
- **Kết luận:** Số liệu chỉ làm bối cảnh, nhóm không gộp meta-analysis và không suy ra threshold chung.

---

### Slide 4: Câu Hỏi Nghiên Cứu & Kiểm Định Thống Kê (RQ & Statistical Plan)
- **RQ1: Branch Coverage**
  * *Nội dung:* Median branch coverage của từng ngôn ngữ có > 75% (practical target)?
  * *Kiểm định:* Exact sign test một phía, hiệu chỉnh Holm (mẫu Java/Python độc lập).
- **RQ2: So Sánh Với Baseline**
  * *Nội dung:* Mutation score của GPT-4o có cao hơn Randoop 4.3.4 trên Java?
  * *Kiểm định:* Paired one-sided Wilcoxon signed-rank (25 Java units).
- **RQ3: Ảnh Hưởng Của Độ Phức Tạp (Exploratory)**
  * *Nội dung:* Tương quan âm giữa độ phức tạp CC và chất lượng test?
  * *Kiểm định:* One-sided Spearman correlation, Holm correction cho 4 cặp (Language x Outcome). Family alpha = 0.05.

---

### Slide 5: Pipeline Nghiên Cứu & Model Specification
- **Quy trình xử lý (Pipeline):** Lizard (đo CC 5-15) -> GPT-4o API -> Thu thập test -> Chạy JaCoCo/coverage.py & PIT/pytest-mutagen -> Phân tích thống kê.
- **Cấu hình Model GPT-4o:**
  * **Model version:** `gpt-4o-2024-08-06`
  * **Endpoint:** `POST /v1/responses` (OpenAI Python SDK 2.43.0).
  * **Hyperparameters:** Temperature = 0.2, Top_p = 1, Max_output_tokens = 2048.
  * **Chế độ sinh:** Một lần phản hồi duy nhất (Single-turn), không regeneration, không repair.
- **Log lưu trữ:** Raw request, response, token usage, UTC time, hash.

---

### Slide 6: Tập Dữ Liệu & Baseline (Dataset & Baseline)
- **Cơ cấu Dataset (50 Units):**
  * 25 Java units (Kế thừa từ CLASSES2TEST - Lops 2025).
  * 25 Python units (Kế thừa phương pháp luận từ TestPilot & ASTER).
  * Yêu cầu bắt buộc: CC từ 5 đến 15 (đo bằng Lizard 1.23.0).
- **Baseline (Randoop):**
  * Randoop version 4.3.4 (chỉ áp dụng cho 25 Java units, chạy 60 giây/unit).
  * Tham số seed cố định: `randomseed=20260621`.
- **Provenance Gate (Bộ lọc đầu vào):** Kiểm tra source, license, commit SHA và khả năng build độc lập trước khi đưa vào tập mẫu freeze.

---

### Slide 7: Phân Chia Công Việc (Work Packages)
- **Nguyên tắc phân công:** Một work package - Một owner chính chịu trách nhiệm.
- **Bản đồ trách nhiệm:**
  * **Vinh:** Dataset preparation & Preflight checks (50 units).
  * **Thái:** API generation & Raw response logs.
  * **Quân:** Java unit execution, Randoop baseline & Statistical tests.
  * **Văn:** Python unit execution, Figures & Validity observations.
  * **Nghi:** Protocol compliance, Reproducibility gate & Integration.

---

### Slide 8: Kế Hoạch Đánh Giá (Evaluation Plan)
- **Metric đo lường chất lượng:**
  * **Branch Coverage:** Đo bằng JaCoCo (Java) & coverage.py (Python).
  * **Mutation Score:** Đo bằng PIT (Java) & pytest-mutagen (Python).
  * **Executability:** Tỉ lệ phần trăm test case chạy thành công không có lỗi biên dịch/runtime trên môi trường chuẩn.
- **Môi trường đo lường chuẩn:**
  * Python 3.10, Java OpenJDK 17.
  * Môi trường thực thi độc lập (sandbox) để tránh tác động chéo.

---

### Slide 9: Các Mối Đe Dọa Đến Tính Hợp Lệ (Threats to Validity)
- **Độ tin cậy của mã nguồn (Construct Validity):** Test suite sinh ra có thể đạt coverage cao nhưng vẫn bỏ sót lỗi logic thực tế (sử dụng Mutation Testing để giảm thiểu mối đe dọa này).
- **Tính khái quát hóa (External Validity):** Nghiên cứu bị giới hạn trong 50 units (CC 5-15) của Java và Python. Không khái quát cho các ngôn ngữ khác hoặc các hệ thống lớn.
- **Sự phụ thuộc vào Prompt (Internal Validity):** Kết quả phụ thuộc vào prompt cố định. Nhóm giảm thiểu bằng cách đóng băng prompt mẫu (frozen prompt) và ghi chép lại đầy đủ log.

---

### Slide 10: Lộ Trình & Tài Nguyên (Timeline & Resources)
- **Lộ trình thực hiện (4 tuần):**
  * **Tuần 1:** Chuẩn bị Dataset & Thiết lập môi trường đo lường JaCoCo/PIT.
  * **Tuần 2:** Chạy API Generation với GPT-4o, chạy Randoop Baseline và ghi nhận log.
  * **Tuần 3:** Phân tích dữ liệu & thực hiện các phép kiểm định thống kê (Sign Test, Wilcoxon, Spearman).
  * **Tuần 4:** Viết báo cáo hoàn chỉnh & Review tính tái bản (reproducibility).
- **Tài nguyên cần dùng:** API Key OpenAI (GPT-4o), Máy chủ chạy Randoop & các công cụ đo coverage.

---

### Slide 11: Đóng Góp & Q&A (Contribution & Q&A)
- **Đóng góp chính:**
  1. Quy trình thực nghiệm có kiểm soát (Controlled Protocol) đánh giá GPT-4o.
  2. Bộ dữ liệu mở đóng băng gồm log sinh test của 50 units Java/Python.
  3. Đánh giá thực nghiệm so sánh chi tiết với Randoop baseline.
- **Lời cảm ơn & Q&A:** Nhóm xin chân thành cảm ơn Hội đồng. Xin mời thầy cô đặt câu hỏi.
```
---

## 2. Prompt Yêu Cầu LLM (Claude, GPT-4o) Viết Code Python-PPTX Để Tạo Slide Tự Động

*Nếu bạn muốn nhờ một LLM viết code Python tự động tạo slide đẹp có bố cục tùy chỉnh, hãy gửi prompt dưới đây:*

```text
Hãy viết một script Python hoàn chỉnh sử dụng thư viện `python-pptx` để tạo slide thuyết trình PowerPoint cho đề tài "RBL-3 Proposal Defense".

Yêu cầu về mặt thẩm mỹ & kỹ thuật:
1. Kích thước Slide: Chuẩn widescreen 16:9 (`prs.slide_width = Inches(13.333)`, `prs.slide_height = Inches(7.5)`).
2. Tông màu chủ đạo (Dark Theme):
   - Nền (Background): Xanh tối/Đen (#0d1117).
   - Chữ chính (Text): Trắng (#ffffff).
   - Màu nhấn (Accent colors): Cyan (#00bcd4), Amber/Vàng (#ffc107), Green/Xanh lá (#00e676).
3. Thiết kế:
   - Sử dụng các hình vẽ hình chữ nhật bo góc (Rounded Rectangles) hoặc thẻ (Cards) làm nền cho các khối thông tin để tạo chiều sâu.
   - Tránh việc nhét quá nhiều văn bản. Chia thông tin thành các cột (2 cột hoặc 3 cột) khi cần so sánh hoặc phân loại.
   - Thêm tiêu đề trang (Slide Title) bằng chữ lớn, màu Cyan hoặc Trắng, có đường gạch chân mỏng để định hình slide.
4. Cấu trúc 11 slide bao gồm:
   - Slide 1: Title (Đặt chính giữa, phong cách ấn tượng).
   - Slide 2: Problem & GAP (Chia 2 khối: Problem trái, GAP phải).
   - Slide 3: Key Evidence (Chứa bảng thông tin so sánh 5 bài báo).
   - Slide 4: RQ & Statistical Plan (Chia thành 3 khối tương ứng RQ1, RQ2, RQ3).
   - Slide 5: Pipeline & Model Spec (Bố cục pipeline và cấu hình model).
   - Slide 6: Dataset & Baseline (Chia 2 khối: Dataset bên trái, Randoop Baseline bên phải).
   - Slide 7: Work Packages (Chia thành 5 cột hoặc 5 khối cho 5 thành viên).
   - Slide 8: Evaluation Plan (Trình bày các metric: Branch Coverage, Mutation Score, Executability).
   - Slide 9: Threats to Validity (3 khối: Construct, External, Internal Validity).
   - Slide 10: Timeline (Vẽ một sơ đồ tiến độ hoặc 4 hộp đại diện cho 4 tuần).
   - Slide 11: Contribution & Q&A (Lời cảm ơn và 3 điểm đóng góp chính).

Mã nguồn cần định nghĩa màu sắc rõ ràng (RGBColor) và điều chỉnh font chữ (font.name = 'Arial' hoặc 'Segoe UI', font.color, font.bold) để đảm bảo hiển thị tiếng Việt chính xác và đẹp mắt.
```

---

## 3. Mã Nguồn Cấu Trúc Slide Bằng MARP (Markdown Presentation)

*Marp là công cụ chuyển Markdown thành Slide cực kỳ nhanh chóng. Bạn có thể cài extension "Marp for VS Code" hoặc dùng CLI để build trực tiếp.*

```markdown
---
marp: true
theme: gaia
_class: lead
paginate: true
backgroundColor: #0d1117
color: #ffffff
style: |
  section {
    font-family: 'Segoe UI', sans-serif;
    padding: 40px;
  }
  h1 {
    color: #00bcd4;
  }
  h2 {
    color: #ffc107;
  }
  footer {
    color: #888;
  }
  table {
    border-collapse: collapse;
    width: 100%;
    margin-top: 10px;
  }
  th {
    background-color: #1f2937;
    color: #00bcd4;
  }
  td, th {
    border: 1px solid #374151;
    padding: 8px;
  }
---

# RBL-3 Proposal Defense
## Empirical Evaluation of GPT-4o's First-Response Unit Test Quality

**Nhóm 6 - SWT301 (SE1944)**
*Thành viên:* Nghi, Vinh, Quân, Thái, Văn

---

# S2: Problem & Bounded GAP

* **Vấn đề (Problem):** Kết quả nghiên cứu trước khó so sánh trực tiếp vì khác biệt dataset, model, prompt, metric.
* **Số liệu mâu thuẫn:**
  * **TestPilot (2024):** Median branch coverage **52.8%** (JS/Python, function-level).
  * **AgoneTest (2025):** Highest branch coverage **79.8%** (Java class-level), compile rate **36%**.
* **GAP:** Chưa có nghiên cứu nào đánh giá trên tập mẫu cân bằng Java-Python được lọc trước theo CC từ 5-15 dưới dạng controlled protocol.

---

# S3: Key Evidence Table

| Nghiên cứu | Ngữ cảnh | Branch Coverage | Mutation Score | Ghi chú |
|---|---|---|---|---|
| **TestPilot** (2024, TSE) | JS/Python, Function | 52.8% (Median) | NR | Zero-shot, no repair |
| **AgoneTest** (2025, ASE) | Java, Class-level | 79.8% (Highest) | 89.2% (Highest) | Compile 36% (Max) |
| **GEM** (2026, CIbSE) | Java, Class-level | 84.30% -> 88.81% | 72.71% -> 81.85% | Có repair/strengthening |
| **ASTER** (2024, ICSE-SEIP) | Đa ngôn ngữ | 77.2% | NR | Có error remediation |
| **ChatTester** (2024, FSE) | Java, Class-level | >82.0% (Average) | >65.0% (Average) | Multi-turn repair |

---

# S4: Research Questions & Statistical Plan

* **RQ1 (Branch Coverage):** GPT-4o median branch coverage > **75%**?
  * *Kiểm định:* Exact sign test một phía, hiệu chỉnh Holm.
* **RQ2 (vs Baseline):** Mutation score GPT-4o > Randoop 4.3.4 (Java)?
  * *Kiểm định:* Paired one-sided Wilcoxon signed-rank (25 Java units).
* **RQ3 (CC Influence - Exploratory):** Tương quan âm giữa CC và chất lượng?
  * *Kiểm định:* One-sided Spearman correlation, Holm correction cho 4 cặp. Family alpha = 0.05.

---

# S5: Pipeline & Model Specification

* **Model version:** `gpt-4o-2024-08-06` qua endpoint `POST /v1/responses` (OpenAI Python SDK 2.43.0).
* **Hyperparameters:** Temperature = 0.2, Top_p = 1, Max_output_tokens = 2048.
* **Protocol:** Sinh test một lần phản hồi duy nhất (Single-turn), không regeneration, không repair.
* **Công cụ đo lường:** JaCoCo & PIT (Java) | coverage.py & pytest-mutagen (Python).

---

# S6: Dataset & Baseline

* **Dataset (50 units):** 25 Java (CLASSES2TEST) + 25 Python (phương pháp luận từ TestPilot & ASTER). CC từ 5 đến 15 (đo bằng Lizard 1.23.0).
* **Baseline (Randoop 4.3.4):** Chạy 60s/Java unit với seed cố định `randomseed=20260621` (chỉ áp dụng cho Java).
* **Provenance Gate:** Lọc chặt chẽ source, license, commit SHA, build độc lập trước khi đưa vào mẫu.

---

# S7: Work Packages & Responsibilities

* **Vinh:** Dataset preparation & Preflight checks (50 units).
* **Thái:** API generation & Raw response logs.
* **Quân:** Java unit execution, Randoop baseline & Statistical tests.
* **Văn:** Python unit execution, Figures & Validity observations.
* **Nghi:** Protocol compliance, Reproducibility gate & Integration.

---

# S8: Evaluation Plan

* **Metrics:**
  1. **Branch Coverage:** Đo bởi JaCoCo & coverage.py.
  2. **Mutation Score:** Đo bởi PIT & pytest-mutagen.
  3. **Executability:** Tỉ lệ test case biên dịch & chạy thành công trên môi trường sạch.
* **Môi trường thực thi:** Python 3.10, Java OpenJDK 17 độc lập.

---

# S9: Threats to Validity

* **Construct Validity:** Test suite coverage cao nhưng thiếu logic (Sử dụng Mutation testing để giảm thiểu).
* **External Validity:** Bị giới hạn trong 50 units (CC 5-15) Java/Python. Không đại diện cho toàn bộ các hệ thống mã nguồn khác.
* **Internal Validity:** Phụ thuộc vào prompt mẫu. Nhóm đóng băng prompt mẫu (frozen prompt) và ghi log mọi tham số API.

---

# S10: Timeline & Resources

* **Tuần 1:** Dataset & Thiết lập môi trường đo lường.
* **Tuần 2:** Chạy API Generation & Randoop Baseline.
* **Tuần 3:** Phân tích dữ liệu & Kiểm định thống kê.
* **Tuần 4:** Viết báo cáo & Nghiệm thu tính tái bản.
* **Tài nguyên:** OpenAI API Key, Server chạy Randoop.

---

# S11: Contributions & Q&A

* **Đóng góp:**
  1. Quy trình thực nghiệm có kiểm soát (Controlled Protocol).
  2. Bộ dữ liệu mở đóng băng gồm log sinh test đầy đủ.
  3. Thực nghiệm đối sánh với Randoop baseline.
* **Q&A:** Xin chân thành cảm ơn Hội đồng. Rất mong nhận được câu hỏi góp ý.
```
