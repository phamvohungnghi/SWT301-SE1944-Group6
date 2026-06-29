    GAP Analysis — LLM for Unit Test Case Generation
Evidence table: N = 10 papers | Ngày: 2026-06-05
===============================================Bảng GAP
--------

| Cột | Phát hiện | Loại GAP | Phản chứng |
| :--- | :--- | :--- | :--- |
| Dataset | Các nghiên cứu chủ yếu sử dụng các bộ benchmark lớn và đa dạng ở cấp độ class hoặc file mà chưa lọc và đánh giá chuyên sâu trên các hàm độc lập có độ phức tạp cyclomatic trung bình (CC từ 5 đến 15) - vùng mã nguồn nhạy cảm đối với cả LLM và con người. | GAP-D | Kiểm tra 10 paper |
| Metric | Việc đánh giá hiệu năng so sánh (LLM vs Human/Baselines) thường chỉ dùng thống kê mô tả (tỷ lệ %, trung bình cộng), thiếu các phép kiểm định thống kê phi tham số chặt chẽ (Wilcoxon signed-rank, Mann-Whitney U) để chứng minh sự khác biệt có ý nghĩa thống kê (p < 0.05). | GAP-M | Kiểm tra 10 paper |
| Hạn chế | Tỷ lệ lỗi cú pháp và lỗi biên dịch của test case sinh bởi LLM trong các vòng đầu tiên rất cao, đòi hỏi cơ chế tự sửa (self-repair) hoặc phân tích tĩnh chuyên sâu để cải thiện khả năng thực thi. | GAP-S | Kiểm tra 10 paper (5/10 paper thừa nhận) |


GAP Chính: GAP-D (Dataset / Đối tượng kiểm thử)
-----------------------------------------------
Nghiên cứu thực nghiệm hiện nay chủ yếu đánh giá trên các bộ benchmark tổng hợp hoặc toàn bộ dự án mà không phân nhóm rõ ràng hoặc đánh giá chuyên sâu trên phân khúc các hàm có độ phức tạp trung bình (Cyclomatic Complexity từ 5 đến 15). 

Lý do chọn: Việc đánh giá chung làm xuất hiện "điểm mù" trong nghiên cứu: các hàm quá đơn giản (CC < 5, như getters/setters) làm thổi phồng tỷ lệ bao phủ trung bình của LLM, trong khi các hàm quá phức tạp (CC > 15) lại kéo giảm hiệu năng do giới hạn ngữ cảnh. Khoảng CC từ 5 đến 15 chính là vùng thực tế nhất phản ánh chính xác năng lực viết unit test của LLM.

GAP Secondary: GAP-M (Metric / Kiểm định thống kê)
--------------------------------------------------
Thiếu việc áp dụng các phép kiểm định thống kê phi tham số (non-parametric tests như Wilcoxon signed-rank test và Mann-Whitney U test) để kiểm chứng ý nghĩa thống kê của các so sánh hiệu năng giữa LLM và các baselines, thay vì chỉ so sánh các con số trung bình mô tả thông thường.

---

Chi tiết kiểm tra phản chứng (GAP Chính - GAP-D)
------------------------------------------------

Với tuyên bố GAP chính: "Chưa có nghiên cứu nào tập trung đánh giá chuyên sâu và lọc riêng tập dữ liệu các hàm độc lập có độ phức tạp cyclomatic trung bình từ 5 đến 15 để làm benchmark".

| Paper | Đã làm không? | Ghi chú |
| :--- | :--- | :--- |
| Baskaran 2025 | Không | Đánh giá trên 1 ứng dụng bảo hiểm cụ thể, không phân loại hàm theo CC. |
| Straubinger 2025 | Không | Chạy trên Python benchmarks chung, không lọc và phân tích riêng cho khoảng CC 5-15. |
| Celik 2026 | Không | Chạy trên các repository mã nguồn mở tổng hợp cấp độ class/file, không cô lập hàm theo CC. |
| Lu 2026 | Không | Phân loại theo hàm standalone và non-standalone, không đánh giá theo độ phức tạp CC 5-15. |
| Lops 2025 | Không | Chạy trên toàn bộ bộ dữ liệu CLASSES2TEST cấp độ class mà không lọc riêng các hàm độc lập có CC 5-15. |
| Pan 2024 | Không | Sinh test đa ngôn ngữ trên benchmark chung, không lọc theo độ phức tạp CC. |
| Guilherme 2023 | Không | Đánh giá trên 33 chương trình Java nhỏ tổng hợp, không phân tích ảnh hưởng của CC. |
| Bruches 2026 | Không | Tập trung vào bài toán bảo trì test (TAM-Eval) ở cấp độ file, không lọc theo CC. |
| Yuan 2024 | Không | So sánh trên 79 classes Java chung, không lọc riêng hàm theo độ phức tạp CC 5-15. |
| Schäfer 2024 | Không | So sánh Pearson's correlation giữa coverage và kích thước hàm (size), nhưng không lọc và đánh giá chuyên sâu trên tập hàm có CC 5-15. |

Kết luận: XÁC NHẬN (Không có paper nào trong số 10 paper tập trung lọc và đánh giá thực nghiệm chuyên biệt trên tập dữ liệu các hàm có độ phức tạp CC từ 5 đến 15 làm đối tượng chính).


Chi tiết kiểm tra phản chứng (GAP Phụ - GAP-M)
---------------------------------------------

Tuyên bố GAP phụ: "Đa số các nghiên cứu thực nghiệm hiện nay chỉ so sánh các con số trung bình mô tả (descriptive averages) và thiếu việc áp dụng các phép kiểm định thống kê phi tham số (non-parametric tests như Wilcoxon signed-rank test hoặc Mann-Whitney U test) để chứng minh ý nghĩa thống kê của sự khác biệt".

| Paper | Có sử dụng kiểm định giả thuyết thống kê (Wilcoxon/Mann-Whitney U)? | Ghi chú |
| :--- | :--- | :--- |
| Baskaran 2025 | Không | Chỉ báo cáo phần trăm độ phủ tăng từ 98% lên 99% mà không kiểm định. |
| Straubinger 2025 | Không | Báo cáo điểm đột biến và tỷ lệ biên dịch thô, không dùng kiểm định giả thuyết. |
| Celik 2026 | Không | Chỉ so sánh trung bình cộng hiệu năng của framework GEM. |
| Lu 2026 | Có | Sử dụng Wilcoxon signed-rank test và A12 effect size (nhưng không áp dụng cho tập dữ liệu CC 5-15). |
| Lops 2025 | Không | Chỉ báo cáo compilability và green suites %, không dùng phép kiểm định. |
| Pan 2024 | Không | So sánh mô tả và khảo sát lập trình viên, không chạy kiểm định thống kê. |
| Guilherme 2023 | Không | So sánh trực quan và lấy trung bình các chỉ số giữa ChatGPT và EvoSuite. |
| Bruches 2026 | Không | Chỉ so sánh tỷ lệ bảo trì thành công qua các con số thống kê mô tả. |
| Yuan 2024 | Có | Sử dụng Wilcoxon signed-rank test (nhưng không áp dụng cho tập dữ liệu CC 5-15). |
| Schäfer 2024 | Không | Sử dụng tương quan Pearson cho kích thước hàm, không sử dụng Wilcoxon/Mann-Whitney U để so sánh với các ngưỡng chất lượng. |

Kết luận: XÁC NHẬN (Có tới 8/10 paper hoàn toàn không sử dụng bất kỳ phép kiểm định giả thuyết thống kê phi tham số nào để so sánh chất lượng kiểm thử. Việc áp dụng các phép kiểm định này là một khoảng trống lớn về mặt phương pháp luận).


---

Feasibility Check — GAP Chính (GAP-D)
-------------------------------------

Bảng đánh giá khả thi cho GAP chính kết hợp nghiên cứu thực nghiệm:

| Tiêu chí | Mức | Ghi chú |
| :--- | :--- | :--- |
| Dataset | An toàn | Lấy 50 hàm (25 Java, 25 Python) kế thừa từ các benchmark/phương pháp luận uy tín: Java lấy từ CLASSES2TEST của Lops 2025 (ASE - CORE A*), Python lấy từ Schäfer 2024 (TSE - CORE A*) và Pan 2024 (ICSE - CORE A*). Sử dụng Lizard để đo và lọc CC từ 5-15. |
| Tool/API | An toàn | Sử dụng mô hình gpt-4o thông qua OpenAI API với chi phí cực thấp (khoảng 0.95 USD - 1.14 USD cho toàn bộ 50 hàm, xem chi tiết bảng ước lượng tại: experiment/design-rationale.md). |
| Compute | An toàn | Việc chạy unit test và mutation testing cho 50 hàm độc lập (đã lọc standalone) tốn rất ít tài nguyên, có thể chạy hoàn toàn trên máy tính cá nhân (CPU) trong vài phút. |
| Ground truth | An toàn | Không cần bộ test case do con người viết tay. Nghiên cứu tập trung đánh giá hiệu năng của LLM so với công cụ sinh test tự động truyền thống (Randoop) và so sánh với các ngưỡng chất lượng (threshold) từ nghiên cứu SOTA. |
| Skills | An toàn | Sử dụng các thư viện kiểm thử chuẩn: JaCoCo và PIT cho Java; Coverage.py và pytest-mutagen cho Python. Các thư viện này đều quen thuộc và có tài liệu phong phú. |
| Thời gian | An toàn | Quy mô thực nghiệm nhỏ (50 hàm, zero-shot prompting) giúp hoàn thành toàn bộ pipeline trong vòng 1 tuần, đảm bảo có buffer dự phòng > 1 tuần trước hạn nộp. |
| Contribution | An toàn | Kết quả nghiên cứu làm rõ được ảnh hưởng của độ phức tạp mã nguồn (CC 5-15) lên hiệu năng của LLM, đóng góp thực tiễn cho việc áp dụng AI trong công nghiệp. |

Kết luận: 0 ❌ / 0 ⚠️ -> Hoàn toàn khả thi và an toàn để tiến hành thực nghiệm.



Phân tích Pipeline & Mã nguồn của các nghiên cứu liên quan (Minh chứng cho GAP-D)
---------------------------------------------------------------------------------

Để củng cố và minh chứng khoa học cho GAP-D, tôi đã tiến hành phân tích mã nguồn (source code) và quy trình xử lý dữ liệu đầu vào (dataset pipeline) từ các công cụ/framework thuộc các bài báo liên quan trong nghiên cứu tổng quan (SLR) có mã nguồn mở công khai:

1. ChatTester (Yuan 2024 - FSE)
*   Mã nguồn công bố: [GitHub - ChatTester](https://github.com/ZJU-ACES-ISE/ChatTester)
*   Phân tích Pipeline: Bộ lọc dữ liệu của ChatTester (`Parser` module sử dụng thư viện `JavaParser`) trích xuất các method từ các class Java dựa trên các tiêu chí: cú pháp hợp lệ, khả năng biên dịch, và sự tồn tại của unit test viết tay (ground-truth). Mã nguồn pipeline này hoàn toàn không tích hợp các thư viện đo độ phức tạp tĩnh (như PMD, Checkstyle hay lizard) để lọc hoặc phân nhóm theo Cyclomatic Complexity (CC). Điều này dẫn đến việc tập test case đầu vào chứa hỗn hợp nhiều mức độ phức tạp (từ CC=1 như getters/setters cho đến CC > 20) mà không có sự kiểm soát, gây sai lệch/nhiễu kết quả đánh giá năng lực thực tế của LLM.
*   Minh chứng từ bài báo: Trong phần thiết kế thực nghiệm (Section 3) và hạn chế nghiên cứu (Threats to Validity), nhóm tác giả xác nhận lựa chọn ngẫu nhiên 79 classes và toàn bộ các method bên trong chúng mà không phân tích ảnh hưởng của độ phức tạp mã nguồn (complexity metrics) đến khả năng tự sửa lỗi và sinh test của mô hình.

2. AgoneTest (Lops 2025 - ASE)
*   Mã nguồn công bố: [CLASSES2TEST Benchmark Repository](https://anonymous.4open.science/r/classes2test)
*   Phân tích Pipeline: Script thu thập dữ liệu của CLASSES2TEST hoạt động hoàn toàn ở cấp độ Class. Quy trình lọc chỉ quan tâm xem lớp đó có class kiểm thử tương ứng trên GitHub và có cấu trúc dependencies Maven/Gradle hoàn chỉnh để build hay không. Không có bất kỳ logic nào trong pipeline trích xuất để đo độ phức tạp tuần tự (CC) của các method riêng lẻ. Khi đưa toàn bộ class vào context của LLM, các method đơn giản (CC < 5) vô hình trung làm tăng tỷ lệ bao phủ trung bình (coverage inflation), che giấu điểm yếu của LLM tại các vùng mã phức tạp.
*   Minh chứng từ bài báo: Bài báo (Section 4.3) thừa nhận việc sinh unit test cấp Class gặp vấn đề lớn về giới hạn context window của LLM khi gặp các class dài và có độ phức tạp cao, nhưng chưa đề xuất giải pháp lọc hay đánh giá riêng biệt theo độ phức tạp ở cấp method.

3. TestPilot (Schäfer 2024 - IEEE TSE)
*   Mã nguồn công bố: [GitHub - githubnext/testpilot](https://github.com/githubnext/testpilot)
*   Phân tích Pipeline: TestPilot sử dụng AST Parser để duyệt qua toàn bộ các exportable functions của các package JavaScript/TypeScript và Python. Bộ sinh prompt của TestPilot trích xuất signature và body của hàm để gửi trực tiếp cho LLM. Pipeline không thực hiện đo CC để lọc hoặc phân chia độ phức tạp của hàm.
*   Minh chứng từ bài báo: Kết quả thực nghiệm của TestPilot ghi nhận độ bao phủ trung bình đạt 75% nhưng có sự chênh lệch lớn giữa các hàm. Tác giả thảo luận rằng độ dài hàm (LOC) có tương quan đến tỷ lệ lỗi sinh test, nhưng không thiết kế bộ lọc hoặc phân tích sâu cho nhóm CC 5-15.

 4. TAM-Eval (Bruches 2026 - SANER-C)
*   Mã nguồn công bố: [GitHub - TAM-Eval](https://github.com/trndcenter/TAM-Eval)
*   Phân tích Pipeline: Pipeline của TAM-Eval được thiết kế để đánh giá khả năng bảo trì unit test (test maintenance) dựa trên git commits. Nó sử dụng git diff để xác định các hàm bị thay đổi và yêu cầu LLM cập nhật bộ test tương ứng. Pipeline thu thập hoàn toàn dựa trên lịch sử commit và không sử dụng bất kỳ bộ lọc CC nào.

---

### Quy trình Nghiên cứu Đề xuất: Kế thừa và Phát triển dựa trên Pipeline chuẩn SOTA 

Để đảm bảo tính chuẩn hóa, độ tin cậy khoa học và tránh việc sử dụng các công cụ tự viết (custom/ad-hoc scripts) thiếu kiểm chứng, nghiên cứu của tôi thiết kế quy trình thực nghiệm dựa trên việc kế thừa và mở rộng trực tiếp mã nguồn của ChatUniTest (ZJU-ACES-ISE/chatunitest-core) - framework SOTA kế thừa trực tiếp từ ChatTester (Yuan 2024 - FSE).

Tích hợp thêm module phân tích tĩnh `lizard` trực tiếp vào pha tiền xử lý mã nguồn (data preprocessing) của ChatUniTest:
1.  Đo độ phức tạp tĩnh: Tự động tính toán Cyclomatic Complexity (CC) cho từng method độc lập trước khi đưa vào sinh prompt.
2.  Bộ lọc CC 5-15: Chỉ giữ lại các hàm nằm trong khoảng phức tạp trung bình, tự động loại bỏ các hàm quá đơn giản (như getters/setters, CC < 5) vốn gây nhiễu dữ liệu thực nghiệm, và các hàm quá phức tạp (CC > 15) đòi hỏi cấu hình môi trường mock sâu.
3.  Tích hợp vào Prompt Generator: Các hàm sau khi lọc được chuyển thẳng vào module prompt generator của ChatUniTest để sinh unit test bằng GPT-4o, sau đó chạy qua bộ kiểm thử tự sửa lỗi (repair loop) có sẵn của ChatUniTest.

Phương pháp kế thừa này giúp tận dụng tối đa hạ tầng chạy thử nghiệm và sửa lỗi đã được kiểm chứng của ChatUniTest, đồng thời giải quyết triệt để GAP-D một cách khoa học.

---

Nguồn dẫn chứng và tệp PDF gốc (Nguồn minh chứng khoa học)
---------------------------------------------------------

Toàn bộ các phân tích đối chứng và dữ liệu số liệu trên được trích xuất trực tiếp từ 10 bài báo gốc nằm trong thư mục SLR/papers/ của dự án này:

1. Baskaran 2025:
Tên tệp: SLR/papers/Baskaran_2025_AgenticAI.pdf
Dẫn chứng: Nghiên cứu về AutoGen Agentic AI trong kiểm thử phần mềm.

2. Straubinger 2025:
Tên tệp: SLR/papers/Straubinger_2025_ScientificDebugging.pdf
Dẫn chứng: Nghiên cứu về LLM-driven Scientific Debugging so với Pynguin.

3. Celik 2026:
Tên tệp: SLR/papers/Celik_2026_GEM.pdf
Dẫn chứng: Đánh giá framework GEM sử dụng phản hồi đột biến (mutation feedback).

4. Lu 2026:
Tên tệp: SLR/papers/Lu_2026_BeyondCoverage.pdf
Dẫn chứng: Nghiên cứu tăng cường test suite dựa trên các mutants sống sót.

5. Lops 2025 (AgoneTest):
Tên tệp: SLR/papers/Lops_2025_AgoneTest.pdf
Dẫn chứng: Sinh unit test class-level Java và đo chất lượng kiểm thử.
Link mã nguồn ẩn danh của tác giả: https://anonymous.4open.science/r/classes2test

6. Pan 2024 (ASTER):
Tên tệp: SLR/papers/Pan_2024_ASTER.pdf
Dẫn chứng: Đánh giá Test Naturalness và khả năng sinh test đa ngôn ngữ.

7. Guilherme 2023:
Tên tệp: SLR/papers/Guilherme_2023_ChatGPTCapability.pdf
Dẫn chứng: Đánh giá năng lực của ChatGPT trong kiểm thử so với EvoSuite.

8. Bruches 2026 (TAM-Eval):
Tên tệp: SLR/papers/Bruches_2026_TAMEval.pdf
Dẫn chứng: Bảo trì và sửa lỗi bộ test tự động sử dụng LLMs.
Link mã nguồn chính thức: https://github.com/trndcenter/TAM-Eval

9. Yuan 2024 (ChatTester):
Tên tệp: SLR/papers/Yuan_2024_NoMoreManual.pdf
Dẫn chứng: Đánh giá và cải thiện ChatGPT cho sinh unit test thông qua phản hồi thực thi.
Link mã nguồn chính thức: https://github.com/ZJU-ACES-ISE/ChatTester

10. Schäfer 2024 (TestPilot):
Tên tệp: SLR/papers/Schafer_2024_AdaptiveTest.pdf
Dẫn chứng: Đánh giá TestPilot trong sinh unit test JavaScript/TypeScript/Python.
Link mã nguồn chính thức: https://github.com/githubnext/testpilot
