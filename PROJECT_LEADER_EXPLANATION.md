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
| **Nguyễn Tường Văn** *(Python Pipeline & Literature Lead)* | Thực thi Pipeline Python & Thuyết trình | - Chạy toàn bộ thực nghiệm test trên 25 hàm Python (coverage.py & pytest-mutagen).<br>- Rà soát 10 bài báo liên quan (SLR / Evidence Table).<br>- Viết phần Introduction, Related Work, Threats to Validity.<br>- Thiết kế Slide thuyết trình 9 slide cho buổi báo cáo cuối kỳ. |

---

## 💡 PHẦN 3: GIẢI THÍCH CHI TIẾT Ý NGHĨA TẤT CẢ CÁC CON SỐ THỰC NGHIỆM

Nếu cô hỏi: *"Các con số này có ý nghĩa thực tế gì?"*, bạn giải thích theo đúng ý nghĩa từng con số dưới đây:

### 1. Số liệu mẫu & Khả năng chạy được (Executability)
- **50 hàm (25 Java, 25 Python):** Quy mô mẫu cân bằng giữa 2 ngôn ngữ phổ biến nhất trong công nghiệp.
- **CC 5 đến 15:** Độ phức tạp vòng (Cyclomatic Complexity). Hàm CC < 5 là hàm quá dễ (getter/setter); hàm CC > 15 thường dính Database/Network. Mốc 5–15 là các hàm có logic nghiệp vụ rẽ nhánh thực tế (validate email, tính thuế, thuật toán sắp xếp...).
- **Java 24/25 hàm chạy được (96.0%):** 96% các bài test Java do GPT sinh ra **biên dịch và chạy 100% không bị crash**. Chỉ đúng 1 hàm bị lỗi biên dịch do đặt sai tên class import.
- **Python 22/25 hàm chạy được (88.0%):** 88% bài test Python chạy thành công. 3 hàm bị lỗi là do AI tạo dữ liệu giả quá dài làm **vượt trần token (max_tokens = 2048)** làm đứt đoạn chuỗi chứ không phải AI hiểu sai logic.

### 2. Số liệu RQ1 — Độ phủ nhánh (Branch Coverage vs mốc 75%)
- **Java Median Branch Coverage: 95.5% (IQR: 89.6% – 100%):** Test do AI sinh ra phủ tới **95.5% tổng số nhánh rẽ (`if/else`)** trong hàm. Tức là hầu như không bỏ sót đường đi logic nào! Dải IQR từ 89.6% đến 100% cho thấy phong độ AI rất ổn định.
- **Python Median Branch Coverage: 100.0% (IQR: 87.9% – 100%):** Trên Python, bài test do AI sinh ra phủ **tuyệt đối 100% các nhánh rẽ** đối với đa số các hàm.
- **23/24 hàm Java và 19/22 hàm Python vượt mốc 75%:** Hầu như toàn bộ các hàm đều vượt qua mốc 75% nhóm đăng ký trước.
- **$p = 1.49 \times 10^{-6}$ (Java) và $p = 4.28 \times 10^{-4}$ (Python):** Con số $p$-value siêu nhỏ (nhỏ hơn $0.001$ rất nhiều so với mốc $0.05$). Khẳng định việc AI đạt độ phủ trên 75% **là do năng lực thực sự của AI chứ hoàn toàn không phải do ăn may**.

### 3. Số liệu RQ2 — Khả năng diệt lỗi ngầm (GPT-4o-mini vs Randoop 4.3.4)
- **GPT-4o-mini Median Mutation Score: 86.6%:** Khi cố tình tiêm các lỗi ngầm (*mutants*) vào code Java, các bài test của GPT **phát hiện và diệt được 86.6% số lỗi đó**. Bài test rất chất lượng và có chiều sâu.
- **Randoop 4.3.4 Median Mutation Score: 14.8%:** Công cụ sinh test ngẫu nhiên truyền thống Randoop **chỉ phát hiện được 14.8% số lỗi** (bỏ sót tới 85.2% lỗi ngầm!).
- **Chênh lệch Median: +62.1% (95% CI: 31.6% – 84.6%):** Trung bình mỗi hàm, test của GPT diệt lỗi hơn Randoop **tới 62.1%**. Khoảng tin cậy 95% khẳng định chắc chắn chênh lệch ít nhất là 31.6% và có thể lên tới 84.6%.
- **Wilcoxon $p = 6.58 \times 10^{-5}$ và Cliff's $\delta = 0.79$:** $p < 0.001$ chứng minh GPT thắng Randoop có ý nghĩa thống kê tuyệt đối. Cliff's $\delta = 0.79$ (ngưỡng Large Effect là $>0.474$) chứng minh đây là **sự đè bẹp/áp đảo hoàn toàn về hiệu năng** chứ không phải thắng suýt soát.
- **24/24 cặp hàm GPT không thua Randoop trận nào:** Randoop bị khuất phục trên 100% các hàm thử nghiệm (19 hàm GPT thắng đậm, 5 hàm hòa).

### 4. Số liệu về Chi phí & Token
- **323,246 Input Tokens, 50,688 Output Tokens (tổng 60 requests):** Lượng dữ liệu nạp vào AI rất lớn do nhóm đã inject tới 200 dòng source code ngữ cảnh (*context injection*).
- **Tổng chi phí: $0.0789 USD (khoảng 2.000 VNĐ):** Sinh toàn bộ bộ test cho 50 hàm chỉ tốn chưa tới **2.000 Đồng Việt Nam**! Cho thấy giải pháp dùng AI cực kỳ hiệu quả và kinh tế cho các doanh nghiệp phần mềm.

---

## 📖 PHẦN 4: BẢNG GIẢI THÍCH TỪ NGHỮ KĨ THUẬT (Dành cho Nhóm trưởng tra cứu)

1. **Branch Coverage (Độ phủ nhánh):** Tỷ lệ % các nhánh điều kiện (`if/else`, `switch/case`, `for/while`) trong code được bài test chạy qua.
2. **Mutation Score (Điểm đột biến / Khả năng diệt lỗi ngầm):** Tỷ lệ % các mã lỗi ngầm giả lập (*mutants*) bị bộ test phát hiện và tiêu diệt. Đo độ "sâu" và độ tin cậy của test case.
3. **Mutant (Mã đột biến):** Bản sao code cố tình bị tiêm lỗi (đổi `+` thành `-`, đổi `>` thành `>=`) để thử xem bài test có bắt được lỗi không.
4. **Randoop:** Công cụ tự động sinh unit test truyền thống phổ biến trên Java dựa trên thuật toán thử chuỗi ngẫu nhiên (*Random-based testing*).
5. **Zero-Shot:** Đưa prompt cho AI sinh ra mã test đúng 1 lần duy nhất, không qua các bước cho AI tự sửa lỗi nhiều vòng (*self-repair*).
6. **Cyclomatic Complexity (CC - Độ phức tạp vòng):** Chỉ số đo độ phức tạp cấu trúc của hàm dựa trên số lượng nhánh rẽ độc lập trong code (`if`, `while`, `for`).
7. **Sign Test & Wilcoxon Test:** Các phép kiểm định thống kê phi tham số (*non-parametric tests*) dùng cho dữ liệu không tuân theo phân phối chuẩn.
8. **Cliff's $\delta$ (Effect Size):** Chỉ số đo mức độ chênh lệch thực tế giữa 2 phương pháp ($\delta \ge 0.474$ là chênh lệch rất lớn).
9. **$p$-value:** Xác suất kết quả xảy ra do ngẫu nhiên ($p < 0.05$ là đáng tin cậy).

---

## 🎙️ PHẦN 5: KỊCH BẢN NÓI TRỰC TIẾP VỚI GIẢNG VIÊN (Script 2 phút dành cho bạn Nghi)

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

## ❓ PHẦN 6: CÁC CÂU HỎI GIẢNG VIÊN THƯỜNG HỎI & CÁCH TRẢ LỜI (Q&A)

### Q1: *"Tại sao nhóm lại chọn mốc độ phức tạp CC từ 5 đến 15 mà không chọn hàm đơn giản hơn hoặc khó hơn?"*
- **Trả lời:** "Thưa cô, nếu chọn hàm có CC < 5 (các hàm getter/setter đơn giản) thì công cụ nào cũng đạt 100% coverage, không thấy được sự khác biệt. Nếu chọn CC > 15 thì hàm thường phụ thuộc vào Database hoặc service bên ngoài (không còn standalone). Mốc CC 5–15 là khoảng độ phức tạp vừa đủ để hàm có logic rẽ nhánh thực sự nhưng vẫn độc lập để đo đạc chính xác."

### Q2: *"Tại sao nhóm lại dùng mốc Target là 75% Branch Coverage cho RQ1?"*
- **Trả lời:** "Thưa cô, mốc 75% được nhóm đăng ký trước (*pre-registered*) trong proposal dựa trên tham khảo từ các nghiên cứu trước như TestPilot (median 52.8%) và AgoneTest (79.8%). Mốc 75% đại diện cho một ngưỡng chất lượng kiểm thử thực tiễn (*practical target*) trong công nghiệp."

### Q3: *"Bài báo của nhóm có điểm mới (Contribution) gì nổi bật so với các nghiên cứu trước?"*
- **Trả lời:** "Thưa cô, các nghiên cứu trước thường trộn lẫn nhiều model, hoặc cho AI tự sửa lỗi nhiều vòng (self-repair) nên không đo được năng lực thực sự ở lần đầu. Đóng góp của nhóm em là **nghiên cứu đầu tiên** kết hợp đồng thời 3 yếu tố: (1) Kiểm soát độ phức tạp CC 5-15, (2) Đánh giá chất lượng 1 lần duy nhất (*first-attempt zero-shot*), và (3) So sánh đối chứng trực tiếp với Randoop theo kế hoạch thống kê đăng ký trước."

### Q4: *"Tại sao nhóm lại dùng các phép kiểm định Sign test và Wilcoxon chứ không dùng T-test?"*
- **Trả lời:** "Thưa cô, dữ liệu độ phủ (coverage) và mutation score không tuân theo phân phối chuẩn (non-normal distribution) và có kích thước mẫu N=24, 22. Vì vậy theo chuẩn nghiên cứu Thực nghiệm Kiểm thử Phần mềm (SE Empirical Guidelines), bắt buộc phải dùng các phép kiểm định phi tham số (*non-parametric tests*) như Sign test và Wilcoxon signed-rank test để đảm bảo độ tin cậy thống kê ạ."

---

## 🎯 PHẦN 7: TỔNG HỢP 3 RQ — DÙNG HÀM NÀO, RA KẾT QUẢ GÌ, TÁC DỤNG GÌ

### 🔹 RQ1: ĐÁNH GIÁ ĐỘ PHỦ NHÁNH (BRANCH COVERAGE) SO VỚI MỐC 75%
- **RQ1 hỏi câu gì:** *Năng lực viết test của GPT-4o-mini lần đầu tiên (zero-shot) có đạt độ phủ nhánh cao hơn mốc chuẩn 75% hay không?*
- **Dùng công cụ / Phép kiểm định nào:**
  - Công cụ đo: **JaCoCo 0.8.13** (cho Java) và **coverage.py 7.14.2** (cho Python).
  - Phép toán: $\text{Branch Coverage} = \frac{\text{Số nhánh được phủ}}{\text{Tổng số nhánh}} \times 100\%$.
  - Phép kiểm định thống kê: **One-sided exact Sign test** (Kiểm định dấu 1 phía) + **Holm-Bonferroni correction**.
- **Kết quả ra cái gì:**
  - Java đạt median **95.5%** (23/24 hàm vượt mốc 75%, $p = 1.49 \times 10^{-6}$).
  - Python đạt median **100.0%** (19/22 hàm vượt mốc 75%, $p = 4.28 \times 10^{-4}$).
- **Tác dụng / Ý nghĩa thực tế:** Chứng minh AI có khả năng tự động viết unit test bao phủ gần như toàn bộ các trường hợp rẽ nhánh điều kiện (`if/else`) cho hàm có độ phức tạp trung bình mà không cần con người can thiệp hay sửa lỗi.

---

### 🔹 RQ2: SO SÁNH KHẢ NĂNG DIỆT LỖI NGẦM (MUTATION SCORE) GIỮA GPT VS RANDOOP (JAVA)
- **RQ2 hỏi câu gì:** *Bài test do GPT-4o-mini sinh ra hay bài test do công cụ ngẫu nhiên truyền thống Randoop 4.3.4 sinh ra phát hiện lỗi ngầm (mutants) tốt hơn?*
- **Dùng công cụ / Phép kiểm định nào:**
  - Công cụ đo: **PIT 1.19.1** (cho Java) và chạy công cụ **Randoop 4.3.4** (budget 60 giây/hàm).
  - Phép toán: $\text{Mutation Score} = \frac{\text{Số lỗi ngầm bị diệt}}{\text{Tổng số lỗi ngầm giả lập - lỗi không hợp lệ}} \times 100\%$.
  - Phép kiểm định thống kê: **Paired Wilcoxon signed-rank test** + **Cliff's $\delta$** (Effect size) + **Bootstrap 95% CI**.
- **Kết quả ra cái gì:**
  - GPT-4o-mini đạt median **86.6%** vs Randoop chỉ đạt **14.8%**.
  - GPT vượt Randoop **+62.1%** ($p = 6.58 \times 10^{-5}$, Cliff's $\delta = 0.79$ - *Large Effect*). Randoop thua trên toàn bộ 24/24 cặp hàm.
- **Tác dụng / Ý nghĩa thực tế:** Chứng minh sinh test bằng AI vượt trội hoàn toàn so với công cụ thử ngẫu nhiên truyền thống. AI biết đọc hiểu ngữ nghĩa (semantic understanding) để tạo ra các giá trị đầu vào thông minh (như email đúng cú pháp, biểu thức toán hợp lệ), giúp phát hiện ra các lỗi ngầm ẩn sâu trong code.

---

### 🔹 RQ3: MỐI TƯƠNG QUAN GIỮA ĐỘ PHỨC TẠP CODE (CC) VÀ CHẤT LƯỢNG TEST
- **RQ3 hỏi câu gì:** *Khi code càng phức tạp (nhiều nhánh rẽ CC cao) thì độ phủ Branch Coverage và điểm diệt lỗi Mutation Score có bị giảm xuống hay không?*
- **Dùng công cụ / Phép kiểm định nào:**
  - Công cụ đo độ phức tạp: **Lizard 1.23.0** đo chỉ số Cyclomatic Complexity (CC).
  - Phép kiểm định thống kê: **Spearman Rank Correlation ($\rho$)** (Hệ số tương quan thứ hạng Spearman 1 phía).
- **Kết quả ra cái gì:**
  - Java (Branch Coverage vs CC): $\rho = -0.517, p = 0.0195$ (Tương quan nghịch vừa phải).
  - Python (Branch Coverage vs CC): $\rho = -0.512, p = 0.0223$ (Tương quan nghịch vừa phải).
  - Java (Mutation Score vs CC): $\rho = +0.109, p = 1.0$ (Không có ý nghĩa thống kê).
- **Tác dụng / Ý nghĩa thực tế:** Cho thấy khi hàm càng phức tạp (nhiều nhánh rẽ rắc rối), độ phủ nhánh của test AI sinh ra có xu hướng giảm nhẹ. Điều này giúp các lập trình viên biết được những hàm phức tạp sẽ cần được rà soát thủ công kỹ hơn.
