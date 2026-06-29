Experiment Design Rationale — LLM for Unit Test Case Generation
Ngày: 2026-06-05 | GAP source: SLR/gap-analysis.md
===============================================================

Bảng Quyết Định
---------------

| Quyết định | Giá trị | Nguồn gốc |
| :--- | :--- | :--- |
| LLM/Tool | GPT-4o (phiên bản gpt-4o) | GAP-T: cột Tool/LLM (Paper 9, Paper 10) |
| Dataset | 50 hàm độc lập (25 Java + 25 Python) có độ phức tạp cyclomatic CC từ 5 đến 15. Phân khúc Java kế thừa từ benchmark CLASSES2TEST của Lops 2025 (ASE). Phân khúc Python kế thừa từ phương pháp luận của Schäfer 2024 (TSE) và Pan 2024 (ICSE). | GAP-D / Kế thừa từ các nghiên cứu CORE A* |
| Metric chính | Branch Coverage (JaCoCo cho Java, Coverage.py cho Python); Mutation Score (PIT cho Java, pytest-mutagen cho Python). | GAP-M: cột Metric (Paper 1, Paper 4, Paper 9, Paper 10) |
| Metric phụ | Khả năng thực thi / Tỷ lệ biên dịch (Executability / Compilability Rate) | Kế thừa từ Celik 2026 (GEM) và Lops 2025 (AgoneTest) |
| Baseline type | Comparative (so sánh với hệ thống tự động Randoop) + Absolute threshold (so sánh với ngưỡng tuyệt đối) | Claim type của RQ |
| Threshold RQ1 | 75% (độ phủ nhánh - Branch Coverage) | Case 2: Floor value từ Schäfer 2024 |
| Threshold RQ2 | 65% (năng lực phát hiện lỗi - Mutation Score) | Case 2: Floor value từ Yuan 2024 |
| Pipeline base | Yuan 2024 (ChatTester - Mã nguồn: https://github.com/ZJU-ACES-ISE/ChatTester) | Thích nghi với hướng tiếp cận đánh giá chất lượng bộ test của LLM trên cả Java và Python. |


Minh chứng nguồn gốc Dataset từ các nghiên cứu SOTA
--------------------------------------------------
Để đảm bảo tính chuẩn mực khoa học và độ tin cậy cao cho dữ liệu thực nghiệm, tập dữ liệu 50 hàm (25 Java + 25 Python) được xây dựng trực tiếp dựa trên phương pháp luận và nguồn dữ liệu từ các công bố khoa học đỉnh cao (đều thuộc hạng CORE A/A*) trong danh sách nghiên cứu tổng quan (SLR):

1. **Đối với phân khúc Java (25 hàm):**
   * **Nguồn gốc:** Trích xuất từ bộ benchmark **CLASSES2TEST** - bộ dữ liệu được công bố và sử dụng bởi **Lops 2025 (AgoneTest)** tại hội thảo hàng đầu thế giới **IEEE/ACM ASE 2025 (CORE A*)**.
   * **Đặc điểm khoa học:** CLASSES2TEST thu thập các dự án thực tế từ GitHub có đầy đủ cấu trúc build (Maven/Gradle) và test suite viết tay của lập trình viên. Đề tài kế thừa bộ benchmark này và sử dụng công cụ phân tích tĩnh Lizard để cô lập và lọc ra các hàm độc lập có độ phức tạp Cyclomatic Complexity (CC) nằm trong khoảng 5-15.

2. **Đối với phân khúc Python (25 hàm):**
   * **Nguồn gốc:** Trích xuất từ các thư viện mã nguồn mở Python trên GitHub, kế thừa trực tiếp phương pháp luận thu thập và bộ lọc tĩnh của **Schäfer 2024 (TestPilot)** trên tạp chí số 1 về kỹ thuật phần mềm **IEEE TSE (CORE A*)** và **Pan 2024 (ASTER)** tại **ICSE-SEIP 2025 (CORE A*)**.
   * **Đặc điểm khoa học:** Các hàm Python được lọc để loại bỏ các hàm phụ thuộc bên ngoài phức tạp (non-standalone), đảm bảo khả năng cô lập (isolation) để kiểm thử đơn vị giống như phương pháp trích xuất API của TestPilot và ASTER.

### Bảng đối chiếu nguồn gốc Dataset thực nghiệm:
| Thành phần | Số lượng hàm | Phương pháp lọc tĩnh (CC 5-15) | Nguồn Benchmark gốc | Bài báo tham chiếu (Citations) | Phân hạng Hội thảo/Tạp chí |
| :--- | :---: | :--- | :--- | :--- | :---: |
| **Java Sub-dataset** | 25 | Lizard Analyzer (Lọc CC 5-15) | CLASSES2TEST Benchmark | Lops 2025 (*AgoneTest*) | **CORE A\*** (IEEE/ACM ASE) |
| **Python Sub-dataset** | 25 | Lizard Analyzer (Lọc CC 5-15) | Standard Python APIs | Schäfer 2024 (*TestPilot*) <br> Pan 2024 (*ASTER*) | **CORE A\*** (IEEE TSE) <br> **CORE A\*** (ICSE-SEIP) |

Sự kết hợp này đảm bảo tập dữ liệu thực nghiệm vừa mang tính kế thừa các nghiên cứu uy tín hàng đầu, vừa có tính mới (novelty) khi áp dụng thêm bộ lọc Cyclomatic Complexity (CC 5-15) để giải quyết khoảng trống nghiên cứu (GAP-D) đã xác định.


Lý giải threshold
-----------------

Threshold Branch Coverage 75% (RQ1) — Case 2
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
- Nguồn: Trích từ kết quả thực nghiệm của bài báo Schäfer 2024 (TestPilot), cụ thể tại Trang 10: "Overall, the median statement coverage per function for a given project ranges from 0.0%–100.0%, with a median of 77.1%" và đối với dự án zip-a-folder, độ bao phủ tối thiểu của các hàm là 75% ("minimum per function coverage is 75%").
- Lý luận: Mốc 75% được chọn làm ngưỡng (threshold) bảo thủ vì nó đại diện cho hiệu năng tối thiểu đạt được ở các dự án thành công của TestPilot và sát với mức trung vị tổng thể (77.1%). Ta sử dụng mốc này để kiểm định xem GPT-4o có đạt được mức bao phủ nhánh tối thiểu này trên tập dữ liệu hàm độc lập có độ phức tạp trung bình (CC 5-15) hay không.

Threshold Mutation Score 65% (RQ2) — Case 2
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
- Nguồn: Trích từ kết quả thực nghiệm của bài báo Lops 2025 (AgoneTest), cụ thể tại Table IV (Trang 9): Điểm mutation score trung bình của mô hình gpt-4o-mini ở chế độ few-shot là 61.0%, của gemini-1.5-pro few-shot là 72.0% và llama3.1:70b few-shot là 89.2%.
- Lý luận: Năng lực phát hiện lỗi thực tế của bộ test được đánh giá qua mutation score. Ngưỡng 65% là một mốc trung vị thực tế (floor value strategy) nằm trong khoảng hiệu năng từ 61% (gpt-4o-mini) đến 72% (gemini) của các mô hình tiên tiến thế giới khi sinh test ở chế độ few-shot. Ta dùng mốc này để kiểm chứng xem chất lượng assertions của GPT-4o sinh ra có vượt qua mức sàn này hay không.

----------------------------------------------------

Quy trình thực nghiệm (Pipeline) dựa trên GAP-D
-----------------------------------------------
Quy trình được tự động hóa thông qua mã nguồn Python (đã cài đặt tại experiment/run_pipeline.py) gồm 4 giai đoạn chính:

Giai đoạn 1: Trích xuất và Phân tích tĩnh (Static Analysis)
- Input: Các file mã nguồn Java và Python từ tập dữ liệu CLASSES2TEST và các thư viện GitHub.
- Công cụ: Sử dụng thư viện Lizard để đo độ phức tạp Cyclomatic Complexity (CC) cho từng hàm riêng lẻ.
- Điều kiện lọc: Chỉ giữ lại các hàm độc lập có độ phức tạp CC nằm trong khoảng từ 5 đến 15.

Giai đoạn 2: Tạo Prompt và Sinh Test tự động
- Input: Mã nguồn của các hàm đã được lọc.
- Thiết lập: Đưa mã nguồn vào Prompt mẫu zero-shot (định hình cấu hình API GPT-4o với temperature=0.2).
- Output: Gọi API của OpenAI để nhận về tệp mã nguồn test tương ứng.

Giai đoạn 3: Thực thi kiểm thử (Execution)
- Java: Biên dịch và chạy bộ test case bằng JaCoCo (đo branch coverage) và PIT Testing (đo mutation score).
- Python: Chạy bằng Coverage.py (đo branch coverage) và pytest-mutagen (đo mutation score).

Giai đoạn 4: Thu thập chỉ số và Kiểm định giả thuyết
- Tổng hợp toàn bộ số liệu đo được về độ phủ nhánh (%) và điểm đột biến (%) của GPT-4o và Randoop.
- Thực hiện kiểm định thống kê phi tham số (Wilcoxon, Mann-Whitney U, Spearman) qua thư viện scipy.stats để rút ra kết luận khoa học có ý nghĩa thống kê (p < 0.05).


Ước lượng Token & Chi phí (Token/Cost Estimation)
-------------------------------------------------
Để chứng minh tính khả thi tài chính và hiệu quả kinh tế cho đề tài nghiên cứu thực nghiệm với 50 hàm độc lập (25 Java + 25 Python) sử dụng OpenAI API (GPT-4o), dưới đây là bảng ước lượng chi phí chi tiết dựa trên dữ liệu cấu trúc prompt và phản hồi:

### 1. Thông số kỹ thuật & Đơn giá API (GPT-4o)
*   **Model sử dụng:** `gpt-4o 2024-08-06` (phiên bản chuẩn qua OpenAI API).
*   **Đơn giá Input Token:** $5.00 / 1,000,000 tokens (tương đương $0.005 / 1,000 tokens).
*   **Đơn giá Output Token:** $15.00 / 1,000,000 tokens (tương đương $0.015 / 1,000 tokens).
*   **Quy mô mẫu:** 50 hàm độc lập có độ phức tạp trung bình (CC 5-15).
*   **Độ dài trung bình mỗi hàm:** ~50 dòng code (~150 tokens).
*   **Kích thước Prompt mẫu (Zero-shot + instructions):** ~300 tokens.
*   **Mã nguồn Test case kỳ vọng sinh ra:** ~80 dòng code (~700 tokens).

### 2. Vòng lặp sửa lỗi tự động (Self-Repair Loop)
*   Theo tỷ lệ thực tế từ các bài báo SOTA (như ChatTester và GEM), khoảng **20% số hàm (10 hàm)** sẽ phát sinh lỗi biên dịch hoặc lỗi runtime trong lần sinh đầu tiên và cần đi qua tối đa 1 vòng tự sửa lỗi (Self-Repair).
*   **Prompt sửa lỗi (Repair Prompt):** Đính kèm code gốc + test case bị lỗi + stack trace lỗi = ~1,400 tokens.
*   **Test case sửa lại (Repair Response):** ~700 tokens.

### 3. Bảng tính toán chi tiết
| Quy trình | Số lượng request | Avg Input Tokens/Req | Avg Output Tokens/Req | Tổng Input Tokens | Tổng Output Tokens | Chi phí ước lượng (USD) |
| :--- | :---: | :---: | :---: | :---: | :---: | :--- |
| **Sinh test lần đầu (Initial Gen)** | 50 | 450 | 850 | 22,500 | 42,500 | $0.1125 + $0.6375 = **$0.7500** |
| **Sửa lỗi tự động (Self-Repair)** | 10 | 1,400 | 850 | 14,000 | 8,500 | $0.0700 + $0.1275 = **$0.1975** |
| **Tổng cộng (Dự toán trung bình)** | **60 requests** | - | - | **36,500** | **51,000** | **$0.9475** (~24,000 VNĐ) |
| **Dự phòng rủi ro (+20% Buffer)** | - | - | - | **43,800** | **61,200** | **$1.1370** (~28,500 VNĐ) |

**Kết luận:** Tổng chi phí ước lượng cho toàn bộ thực nghiệm sinh test tự động của 50 hàm là **~$1.14 USD** (tương đương khoảng **28.500 VNĐ**), hoàn toàn nằm trong mức an toàn tài chính (Blocker = 0, ngân sách đề xuất ban đầu là < $5 USD).



