# TÀI LIỆU HƯỚNG DẪN DÀNH CHO NHÓM TRƯỞNG (PROJECT LEAD - NGHI)
## Báo Cáo Tình Hình Dự Án & Giải Trình Bài Báo Nghiên Cứu RBL-5 Với Giảng Viên

---

## 📌 PHẦN 1: TỔNG QUAN ĐỀ TÀI (Dành cho Nhóm trưởng nắm cốt lõi)

- **Tên đề tài:** Đánh giá khả năng sinh Unit Test tự động lần đầu (*First-Attempt Zero-Shot*) của model `gpt-4o-mini-2024-07-18` trên các hàm Java và Python có độ phức tạp vòng (Cyclomatic Complexity - CC) từ 5 đến 15.
- **Mục tiêu nghiên cứu:** 
  1. Đo xem nếu chỉ cho AI 1 prompt duy nhất (không cho tự sửa lỗi / no self-repair), test do AI sinh ra đạt Branch Coverage có vượt mốc target **75%** hay không.
  2. So sánh trực tiếp chất lượng test của GPT với công cụ sinh test ngẫu nhiên truyền thống **Randoop 4.3.4** trên Java xem AI có thực sự đè bẹp công cụ truyền thống về chỉ số Mutation Score (khả năng phát hiện lỗi ngầm) hay không.
  3. Kiểm tra xem độ phức tạp code (CC) tăng lên thì chất lượng test do AI sinh ra có bị giảm đi hay không.
- **Mẫu thực nghiệm:** **50 hàm độc lập** (25 hàm Java + 25 hàm Python) được lọc từ kho mã nguồn mở và freeze (đóng băng hash SHA-256) trước khi chạy API.

---

## 👥 PHẦN 2: PHÂN CÔNG NHIỆM VỤ CỦA CÁC THÀNH VIÊN (Báo cáo với Giảng viên)

Khi cô/thầy hỏi: *"Nhóm phân công công việc thế nào và ai làm gì?"*, bạn Nghi (Project Lead) trả lời theo đúng bảng phân công chuẩn này:

| Thành viên | Vai trò chịu trách nhiệm | Công việc cụ thể đã hoàn thành |
|---|---|---|
| **Phạm Võ Hùng Nghi** *(Project Lead - Bạn)* | Quản lý dự án, Điều phối & Duyệt Protocol | - Lên kế hoạch nghiên cứu, kiểm soát tiến độ nhóm.<br>- Duyệt các điều chỉnh protocol (Protocol Amendments).<br>- Viết phần Abstract, Discussion, Conclusion.<br>- Đóng gói bài báo LaTeX và Replication Package public trên GitHub. |
| **Nguyễn Tuấn Vinh** *(Dataset Lead)* | Xây dựng & Kiểm soát Dataset | - Dùng công cụ Lizard 1.23.0 quét và lọc 50 hàm có `5 <= CC <= 15`.<br>- Kiểm tra tính độc lập (Isolation check) của từng hàm (không dính DB, Network).<br>- Tạo file `dataset-manifest.csv` và freeze mã hash SHA-256. |
| **Nguyễn Hoàng Gia Thái** *(Model & API Lead)* | Tích hợp AI & API Pipeline | - Thiết kế Prompt Engineering & Context Injection (nạp 200 dòng source code).<br>- Thiết lập tham số API (`temperature=0.0`, `max_tokens=2048`).<br>- Chạy batch API calls, theo dõi log usage token và chi phí thực tế ($0.0789 USD). |
| **Vương Minh Quân** *(Metrics & Stats Lead)* | Đo đạc Metric & Phân tích Thống kê | - Cấu hình bộ công cụ đo: JaCoCo (Java), coverage.py (Python), PIT (Java Mutation), pytest-mutagen (Python).<br>- Chạy baseline Randoop 4.3.4 (budget 60s/unit).<br>- Chạy script phân tích thống kê phi tham số (Sign test, Wilcoxon signed-rank, Spearman correlation, Holm-Bonferroni). |
| **Nguyễn Tường Văn** *(Reporting & Evidence Lead)* | Tổng hợp Evidence & Thuyết trình | - Rà soát 10 bài báo liên quan (SLR / Evidence Table).<br>- Viết phần Introduction, Related Work, Threats to Validity.<br>- Thiết kế Slide thuyết trình 9 slide cho buổi báo cáo cuối kỳ. |

---

## 📊 PHẦN 3: KẾT QUẢ NGHIÊN CỨU CHI TIẾT (3 Câu hỏi RQ)

### 1. RQ1: Branch Coverage so với mốc 75%
- **Java (24/25 hàm chạy thành công - 96%):** Median Branch Coverage đạt **95.5%** (23/24 hàm vượt mốc 75%). Kiểm định Sign test cho $p = 1.49 \times 10^{-6}$ (Holm-adjusted $p = 2.98 \times 10^{-6}$).
- **Python (22/25 hàm chạy thành công - 88%):** Median Branch Coverage đạt **100%** (19/22 hàm vượt mốc 75%). Kiểm định Sign test cho $p = 4.28 \times 10^{-4}$.
- **Kết luận:** **Bác bỏ H0**. Cả Java và Python đều vượt xa mốc 75% chỉ với 1 lần nhắc duy nhất (zero-shot).

### 2. RQ2: So sánh GPT vs Randoop trên Java (Mutation Score)
- **GPT-4o-mini:** Median Mutation Score đạt **86.6%**.
- **Randoop 4.3.4:** Median Mutation Score chỉ đạt **14.8%**.
- **Mức chênh lệch:** GPT hơn Randoop **+62.1%** ($p = 6.58 \times 10^{-5}$, Cliff's $\delta = 0.79$ — *Large effect size*).
- **Kết luận:** GPT đè bẹp Randoop trên **tất cả 24 cặp hàm** (không có hàm nào Randoop thắng GPT). 
- **Giải thích lý do:** Randoop sinh chuỗi ngẫu nhiên nên không thể tạo ra input đúng cú pháp cho các hàm nghiệp vụ (ví dụ: email hợp lệ `isValidEmail`, biểu thức hậu tố `evaluateRPN`, JSON path `jsonPathLookup`). Ngược lại, GPT có sự hiểu biết ngữ nghĩa (semantic understanding) nên sinh ra input rất thông minh và diệt được hầu hết các mutant.

### 3. RQ3: Tương quan giữa độ phức tạp code (CC) và chất lượng test
- Có tương quan nghịch vừa phải giữa độ phức tạp CC và Branch Coverage (Java $\rho = -0.517, p = 0.0195$; Python $\rho = -0.512, p = 0.0223$).
- **Ý nghĩa:** Code càng phức tạp (nhiều nhánh rẽ) thì branch coverage của test AI sinh ra có xu hướng giảm nhẹ.

---

## 🎙️ PHẦN 4: KỊCH BẢN NÓI TRỰC TIẾP VỚI GIẢNG VIÊN (Script 2 phút dành cho bạn Nghi)

> **Nhóm trưởng Nghi có thể nói với cô/thầy như sau:**
>
> *"Thưa cô, em xin đại diện nhóm 6 báo cáo tình hình làm việc và kết quả nghiên cứu RBL-5 của nhóm:*
>
> *Về mặt quản lý và phân công:*
> *Nhóm em làm việc theo đúng 5 vai trò đã đăng ký từ đầu:*
> *- Bạn **Vinh** phụ trách Dataset: đã lọc và đóng băng 50 hàm Java & Python có độ phức tạp CC từ 5 đến 15 bằng công cụ Lizard.*
> *- Bạn **Thái** phụ trách API: đã thiết kế prompt inject 200 dòng context source code và chạy 60 request trên OpenAI API thật (`gpt-4o-mini-2024-07-18`) với chi phí rất tiết kiệm là 0.078 USD.*
> *- Bạn **Quân** phụ trách Metrics: đã dựng pipeline đo JaCoCo, coverage.py, PIT mutation và chạy công cụ đối chứng Randoop 4.3.4.*
> *- Bạn **Văn** phụ trách tổng hợp tổng quan tài liệu (SLR), viết phần Related Work và thiết kế slide.*
> *- Em là **Nghi (Project Lead)**: em điều phối chung, duyệt các điều chỉnh protocol, viết phần Abstract, Discussion, Conclusion, tổng hợp bài báo IEEE và đưa toàn bộ Replication Package công khai lên GitHub.*
>
> *Về mặt kết quả nghiên cứu chính của bài báo:*
> *Nhóm em đạt được 2 phát hiện quan trọng nhất:*
> 1. *Với các hàm có độ phức tạp trung bình (CC 5-15), chỉ cần 1 prompt zero-shot kèm đủ context nguồn, GPT-4o-mini đã đạt median branch coverage rất cao: **95.5% trên Java** và **100% trên Python**, vượt xa mốc 75% ban đầu với ý nghĩa thống kê $p < 0.001$.*
> 2. *Khi so sánh trực diện với công cụ sinh test ngẫu nhiên Randoop trên Java, GPT vượt trội hoàn toàn về Mutation Score (**86.6% vs 14.8%**, chênh lệch 62.1%, Cliff's $\delta = 0.79$). Nguyên nhân là Randoop không hiểu ngữ nghĩa nên không tạo được input chuẩn cho các hàm logic như email hay JSON, trong khi AI hiểu ngữ nghĩa nên tạo test case rất sâu.*
>
> *Hiện tại nhóm em đã hoàn thiện bài báo LaTeX chuẩn IEEE 9 trang, xuất file PDF `paper_final.pdf`, kiểm tra AI detector đạt chuẩn và đã push toàn bộ lên GitHub ạ."*

---

## ❓ PHẦN 5: CÁC CÂU HỎI GIẢNG VIÊN THƯỜNG HỎI & CÁCH TRẢ LỜI (Q&A)

### Q1: *"Tại sao nhóm lại chọn mốc độ phức tạp CC từ 5 đến 15 mà không chọn hàm đơn giản hơn hoặc khó hơn?"*
- **Trả lời:** "Thưa cô, nếu chọn hàm có CC < 5 (các hàm getter/setter đơn giản) thì công cụ nào cũng đạt 100% coverage, không thấy được sự khác biệt. Nếu chọn CC > 15 thì hàm thường phụ thuộc vào Database hoặc service bên ngoài (không còn standalone). Mốc CC 5–15 là khoảng độ phức tạp vừa đủ để hàm có logic rẽ nhánh thực sự nhưng vẫn độc lập để đo đạc chính xác."

### Q2: *"Tại sao nhóm lại dùng mốc Target là 75% Branch Coverage cho RQ1?"*
- **Trả lời:** "Thưa cô, mốc 75% được nhóm đăng ký trước (*pre-registered*) trong proposal dựa trên tham khảo từ các nghiên cứu trước như TestPilot (median 52.8%) và AgoneTest (79.8%). Mốc 75% đại diện cho một ngưỡng chất lượng kiểm thử thực tiễn (*practical target*) trong công nghiệp."

### Q3: *"Bài báo của nhóm có điểm mới (Contribution) gì nổi bật so với các nghiên cứu trước?"*
- **Trả lời:** "Thưa cô, các nghiên cứu trước thường trộn lẫn nhiều model, hoặc cho AI tự sửa lỗi nhiều vòng (self-repair) nên không đo được năng lực thực sự ở lần đầu. Đóng góp của nhóm em là **nghiên cứu đầu tiên** kết hợp đồng thời 3 yếu tố: (1) Kiểm soát độ phức tạp CC 5-15, (2) Đánh giá chất lượng 1 lần duy nhất (*first-attempt zero-shot*), và (3) So sánh đối chứng trực tiếp với Randoop theo kế hoạch thống kê đăng ký trước."

### Q4: *"Tại sao nhóm lại dùng các phép kiểm định Sign test và Wilcoxon chứ không dùng T-test?"*
- **Trả lời:** "Thưa cô, dữ liệu độ phủ (coverage) và mutation score không tuân theo phân phối chuẩn (non-normal distribution) và có kích thước mẫu N=24, 22. Vì vậy theo chuẩn nghiên cứu Thực nghiệm Kiểm thử Phần mềm (SE Empirical Guidelines), bắt buộc phải dùng các phép kiểm định phi tham số (*non-parametric tests*) như Sign test và Wilcoxon signed-rank test để đảm bảo độ tin cậy thống kê ạ."
