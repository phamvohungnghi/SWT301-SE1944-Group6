Gap Statement - LLM for Unit Test Case Generation
Evidence table: N = 10 papers | Date: 2026-06-04

Các khoảng trống phát hiện

GAP-D (Dataset - Bộ dữ liệu và Độ phức tạp)
- Mô tả: Các nghiên cứu thường đánh giá trên bộ dữ liệu quy mô lớn (Defects4J, CLASSES2TEST, Pynguin benchmarks) ở cấp độ class hoặc phương thức độc lập (standalone) nói chung mà không phân loại sâu hay kiểm soát độ phức tạp tuần tự (Cyclomatic Complexity - CC). Chưa có nghiên cứu nào đánh giá chuyên sâu hiệu năng sinh test của các LLM SOTA đối với các hàm có độ phức tạp trung bình (CC từ 5 đến 15) - vùng mã nguồn thường gây khó khăn nhất cho cả LLM (dễ sinh test lỗi logic) và con người (dễ bỏ sót nhánh đi).
- Bằng chứng thực tế từ mã nguồn (Pipeline/Src) của các nghiên cứu liên quan:
  1. ChatTester (Yuan 2024 - FSE): [Mã nguồn](https://github.com/ZJU-ACES-ISE/ChatTester). Pipeline lọc dữ liệu (`Parser` module) không tích hợp bất kỳ công cụ nào để đo và lọc theo CC. Dữ liệu chứa hỗn hợp các method từ CC=1 đến CC > 20 một cách ngẫu nhiên.
  2. AgoneTest (Lops 2025 - ASE): [Mã nguồn](https://anonymous.4open.science/r/classes2test). Quy trình trích xuất dataset CLASSES2TEST hoạt động ở cấp độ Class, hoàn toàn bỏ qua việc đo lường độ phức tạp tĩnh của từng method bên trong class.
  3. TestPilot (Schäfer 2024 - TSE): [Mã nguồn](https://github.com/githubnext/testpilot). Pipeline sinh test duyệt qua AST để lấy tất cả các hàm xuất khẩu (exported functions) mà không lọc theo chỉ số CC.
  4. TAM-Eval (Bruches 2026 - SANER-C): [Mã nguồn](https://github.com/trndcenter/TAM-Eval). Pipeline thu thập dựa hoàn toàn vào git diff của lịch sử commit, không đo lường CC của các hàm mục tiêu.
  Kết luận: Pipeline của tất cả các nghiên cứu liên quan đều có "điểm mù" lớn là không kiểm soát chỉ số Cyclomatic Complexity khi thu thập và đánh giá.

GAP-M (Metric - Chỉ số và kiểm định thống kê)
- Mô tả: Mặc dù hầu hết nghiên cứu đều đo lường Branch Coverage và Mutation Score, việc so sánh hiệu quả giữa các mô hình hoặc các baselines thường chỉ dừng lại ở thống kê mô tả (tính trung bình cộng, tỷ lệ phần trăm cải thiện). Thiếu các nghiên cứu thực nghiệm áp dụng các phép kiểm định thống kê phi tham số kiểm soát chặt chẽ (như Wilcoxon signed-rank test hoặc Mann-Whitney U test) để chứng minh ý nghĩa thống kê (p < 0.05) của sự khác biệt về năng lực phát hiện lỗi (mutation score) và độ bao phủ.
- Bằng chứng: Các bài báo như Baskaran 2025, Guilherme 2023, và Pan 2024 báo cáo con số phần trăm trung bình nhưng không thực hiện kiểm định giả thuyết thống kê (Hypothesis testing) để chứng minh sự khác biệt có ý nghĩa khoa học.

---

Phát biểu GAP tổng hợp
Nghiên cứu thực nghiệm hiện nay chưa đánh giá chuyên sâu và so sánh hiệu năng sinh unit test của LLM (như GPT-4o) trên tập dữ liệu các hàm Java/Python có độ phức tạp cyclomatic trung bình (5-15), đồng thời thiếu việc sử dụng các phép kiểm định thống kê phi tham số (Wilcoxon signed-rank và Mann-Whitney U) để xác định ý nghĩa thực tế của sự khác biệt về độ bao phủ nhánh (branch coverage) và năng lực phát hiện lỗi (mutation score) giữa các kỹ thuật/baselines.

