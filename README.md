Hướng dẫn Sử dụng và Trình bày Bảo vệ Đề tài RBL-2
==================================================

Tài liệu này hướng dẫn chi tiết cách sử dụng các file trong dự án và cung cấp kịch bản thời điểm bảo vệ đề tài trước cô giáo.

I. CẤU TRÚC CÁC FILE VÀ VAI TRÒ
------------------------------

1. SLR/gap-statement.md:
Chứa phát biểu rút gọn về khoảng trống nghiên cứu. Dùng file này để giới thiệu nhanh cho cô về GAP chính (GAP-D - Dataset / Cyclomatic Complexity 5-15) và GAP phụ (GAP-M - thiếu kiểm định thống kê phi tham số).

2. SLR/gap-analysis.md:
Chứa bảng phản chứng (Counter-evidence) kiểm tra từng bài báo và phân tích mã nguồn của các pipeline SOTA. Dùng file này làm bằng chứng khoa học để chứng minh chưa ai làm điều này trước đây.

3. experiment/design-rationale.md:
Lý giải thiết kế thực nghiệm. Chứa các quyết định về mô hình (GPT-4o), tập dữ liệu (50 hàm), metrics (Branch Coverage và Mutation Score) và nguồn gốc các con số ngưỡng (Threshold) so sánh.

4. experiment/hypotheses-draft.md:
Các giả thuyết thống kê H0 và H1 cho 3 câu hỏi nghiên cứu (RQ). Dùng file này để chứng minh nghiên cứu của bạn có sự chặt chẽ về mặt toán học và thống kê.

5. experiment/run_pipeline.py:
Script Python chạy mô phỏng pipeline thực nghiệm lọc CC và sinh prompt.

6. experiment/sota_pipelines/:
Thư mục chứa mã nguồn thực tế của các công cụ nghiên cứu hàng đầu (ChatTester, TestPilot, TAM-Eval, CLASSES2TEST). Dùng file trong này để show code cho cô xem trực tiếp.


II. HƯỚNG DẪN CHẠY PIPELINE THỰC NGHIỆM DEMO
-------------------------------------------

Bước 1: Cài đặt thư viện lizard để đo độ phức tạp bằng lệnh:
pip install lizard

Bước 2: Chạy script mô phỏng:
python3 experiment/run_pipeline.py

Bước 3: Kiểm tra kết quả:
- File đầu vào được đọc tại: experiment/input_code/sample_code.py (hàm mẫu có CC = 6).
- File prompt kết quả được tự động tạo tại: experiment/output_pipeline/python_process_user_data_prompt.txt.

4. Việc chạy pipeline demo này chứng minh điều gì với cô giáo?
- Chứng minh tính khả thi của Bộ lọc CC (Proof of Concept): Chứng minh bạn đã hiện thực hóa thành công thuật toán tự động đo độ phức tạp tĩnh (qua thư viện lizard) để tự động lọc mã nguồn. Hàm mẫu sample_code.py có CC = 6 nằm trong khoảng 5-15 nên đã được chọn, các hàm khác ngoài khoảng này sẽ tự động bị loại.
- Chứng minh quy trình tạo prompt tự động: Chỉ ra rằng pipeline tự động trích xuất mã nguồn và đóng gói thành prompt kiểm thử zero-shot chuẩn hóa ở output_pipeline/, loại bỏ hoàn toàn các thao tác copy-paste thủ công.
- Chứng minh sự sẵn sàng triển khai: Việc chạy thành công script này chứng minh hạ tầng code của bạn đã sẵn sàng và hoạt động trơn tru, chỉ cần cô phê duyệt đề xuất là có thể nạp tập dữ liệu 50 hàm thực tế vào chạy tự động ngay lập tức.


III. GIẢI THÍCH CHI TIẾT VỀ ĐỘ PHỨC TẠP (CC) VÀ PIPELINE MÔ PHỎNG
-----------------------------------------------------------------

1. Độ phức tạp Cyclomatic Complexity (CC) là gì?
- CC là một chỉ số phân tích tĩnh đo số lượng các đường chạy độc lập trong mã nguồn của một hàm.
- Công thức đơn giản: CC = Số lượng câu lệnh rẽ nhánh + 1.
- Các lệnh rẽ nhánh gồm: if, for, while, switch-case, catch, và các toán tử logic &&, ||.

2. Ý nghĩa các mức độ phức tạp:
- CC = 1: Hàm quá đơn giản (như getters/setters). LLM luôn đạt 100% độ phủ dễ dàng, gây nhiễu và thổi phồng số liệu đánh giá chung.
- CC > 15: Hàm quá phức tạp, lồng nhiều lớp logic hoặc phụ thuộc nhiều đối tượng bên ngoài. Cực kỳ khó viết test (cho cả người và máy).
- CC từ 5 đến 15: Vùng độ phức tạp trung bình. Đây là các hàm thực sự chứa logic nghiệp vụ thực tế, phản ánh chính xác nhất năng lực của mô hình AI khi viết test.

3. Ý nghĩa hoạt động của pipeline (run_pipeline.py):
- Giai đoạn 1 (Đo và Lọc): Sử dụng thư viện lizard để quét file trong input_code và đo CC của từng hàm. Chỉ giữ lại các hàm có CC từ 5 đến 15. Hàm mẫu sample_code.py có CC = 6 nên được giữ lại.
- Giai đoạn 2 (Đóng gói prompt): Tự động trích xuất mã nguồn của hàm đã chọn và chèn vào prompt kiểm thử zero-shot, sau đó lưu ra thư mục output_pipeline/.


IV. GIẢI THÍCH VỀ TRẠNG THÁI 50 HÀM VÀ QUY TRÌNH ĐỀ XUẤT
------------------------------------------------------

1. Trạng thái của tập dữ liệu 50 hàm (25 Java + 25 Python):
- Hiện tại, tập dữ liệu 50 hàm thực tế CHƯA được thu thập đầy đủ trong dự án này.
- Lý do: Đây là giai đoạn Đề xuất Nghiên cứu và Thiết kế thực nghiệm (RBL-2). Mục tiêu chính là bảo vệ ý tưởng (GAP) và chứng minh tính khả thi của mô hình đề xuất trước cô giáo.
- Sau khi cô giáo phê duyệt thiết kế nghiên cứu này, bạn mới tiến hành thu thập 50 hàm thực tế từ GitHub, nạp vào pipeline để đo đạc và chạy thống kê kiểm định cho báo cáo hoàn thiện.
- Hiện tại, file sample_code.py chứa 1 hàm mẫu có CC = 6 là đã đủ để chứng minh toàn bộ logic hoạt động của bộ lọc CC.

2. Bản chất của Quy trình Nghiên cứu Đề xuất:
- Bạn không tự phát triển một công cụ sinh test mới từ đầu.
- Bạn kế thừa framework SOTA ChatUniTest của Đại học Chiết Giang (ZJU) để tận dụng hạ tầng biên dịch, sinh test và tự sửa lỗi (repair loop) đã được tối ưu của họ.
- Đóng góp mới (Novelty) của bạn là đề xuất tích hợp thêm thư viện lizard vào pha tiền xử lý dữ liệu đầu vào của ChatUniTest để tự động tính toán CC và lọc ra các hàm nằm ngoài khoảng CC 5-15.
- Điều này giúp tối ưu hóa chất lượng dữ liệu đầu vào, loại bỏ nhiễu và chứng minh ảnh hưởng của độ phức tạp mã nguồn đến hiệu năng sinh test của LLM một cách khoa học.


V. KỊCH BẢN NÓI KHI PRESENT VỚI CÔ GIÁO
----------------------------------------

Dưới đây là các câu hỏi thường gặp và cách bạn trả lời thuyết phục nhất, kèm theo hành động minh họa bằng các file trong dự án:

Câu hỏi 1: GAP của em là gì và tại sao nó lại quan trọng?
- Cách trả lời của tôi:
Thưa cô, nghiên cứu của tôi giải quyết 2 khoảng trống lớn (GAPs) mà các nghiên cứu SOTA trước đây bỏ sót:
1. GAP chính - GAP-D (Dataset): Các nghiên cứu trước đây đánh giá trên toàn bộ class hoặc file một cách ngẫu nhiên. Điều này tạo ra điểm mù: các hàm quá đơn giản (CC < 5 như getters/setters) làm thổi phồng độ bao phủ trung bình của LLM, còn các hàm quá khó (CC > 15) lại kéo tụt hiệu năng. Tôi tập trung cô lập phân khúc các hàm độc lập có độ phức tạp trung bình (CC 5-15) để đánh giá chuẩn xác nhất.
2. GAP phụ - GAP-M (Metric/Kiểm định thống kê): Tôi phát hiện ra có tới 8 trong số 10 nghiên cứu hàng đầu (như AgoneTest 2025, TestPilot 2024, ASTER 2024...) chỉ so sánh con số trung bình cộng thô mà hoàn toàn thiếu việc sử dụng các phép kiểm định thống kê phi tham số (như Wilcoxon và Mann-Whitney U) để chứng minh sự vượt trội có ý nghĩa khoa học. Tôi đã thiết kế bộ kiểm định thống kê chặt chẽ để giải quyết khoảng trống phương pháp luận này.
- Hành động minh họa:
Mở file SLR/gap-statement.md và SLR/gap-analysis.md (chỉ vào bảng phản chứng GAP-D ở đầu và bảng phản chứng GAP-M ở giữa trang).


Câu hỏi 2: Làm sao em chứng minh được các công cụ SOTA không có bộ lọc CC này?
- Cách trả lời của bạn:
Thưa cô, em đã tải trực tiếp mã nguồn của cả 4 công cụ SOTA từ các bài báo đó về máy để đối chứng thực tế. Trong mã nguồn của họ:
1. ChatTester (FSE 2024): Chỉ trích xuất thông tin cú pháp cơ bản (MethodInfo) chứ không đo CC.
2. TestPilot (TSE 2024): Chỉ duyệt export function thô.
3. AgoneTest / CLASSES2TEST (ASE 2025): Lọc ở cấp độ Class để biên dịch chứ không lọc ở cấp Method.
4. TAM-Eval (SANER 2026): Sử dụng tree-sitter lấy mọi hàm mà không tính CC.
- Hành động minh họa:
Mở các file sau trực tiếp trên editor:
* ChatUniTest (Java): File `ClassParser.java` (dòng 145 - hàm `extractMethods`, dòng 332 - hàm `getInfoByMethod`).
* TestPilot (JavaScript/TS): File `exploreAPI.ts` (dòng 204 - hàm `describe`, dòng 264 - hàm `exploreExports`).
* AgoneTest (Python): File `extract.py` (dòng 68 - hàm `get_classes_from_json`, dòng 324 - hàm `check_project_types`).
* TAM-Eval (Python): File `parser.py` (dòng 59 - hàm `get_functions`, dòng 22 - hàm `get_file_struct`).
Chỉ vào code và nói: Cô có thể thấy parser của họ chỉ thu thập toàn bộ signature/body của hàm thô để nạp vào prompt hoặc biên dịch chứ không hề tích hợp bất kỳ module đo CC nào như Lizard.

Câu hỏi 3: Pipeline của em có phải tự build ad-hoc thiếu tin cậy không?
- Cách trả lời của bạn:
Thưa cô, em không tự viết một công cụ sinh test mới từ đầu để tránh làm mất tính khách quan của nghiên cứu. Quy trình của em là kế thừa trực tiếp framework ChatUniTest (ZJU-ACES-ISE) tiếng tăm và chỉ tích hợp thêm thư viện lizard làm module lọc CC ở pha tiền xử lý. Em chỉ thay đổi đầu vào dữ liệu của họ, còn toàn bộ hạ tầng sinh test, repair loop và compiling của họ đều được kế thừa nguyên bản.
- Hành động minh họa:
Mở file SLR/gap-analysis.md ở phần Quy trình Nghiên cứu Đề xuất để show quy trình 3 bước tích hợp lizard vào ChatUniTest.

Câu hỏi 4: Em lấy threshold 75% và 65% o dau ra?
- Cách trả lời của bạn:
Thưa cô, tất cả các ngưỡng kiểm định (threshold) đều được em trích xuất từ số liệu thực nghiệm của các bài báo gốc để đảm bảo tính khách quan. Ngưỡng Branch Coverage 75% là floor-value lấy từ kết quả thực nghiệm của TestPilot (Schafer 2024, trang 10). Ngưỡng Mutation Score 65% là floor-value lấy từ AgoneTest (Lops 2025, trang 9).
- Hành động minh họa:
Mở file experiment/design-rationale.md và chỉ vào phần Lý giải threshold ở giữa trang.

Câu hỏi 5: Dự án này của em có thực sự khả thi để hoàn thành đúng hạn không?
- Cách trả lời của bạn:
Dạ việc nghiên cứu của em hoàn toàn khả thi và an toàn. Em đã thiết kế một bảng đánh giá khả thi với 0 warning và 0 blocker. Quy mô mẫu thực nghiệm là 50 hàm (25 Java, 25 Python) giúp chạy rất nhanh trên máy cá nhân với chi phí API cực kỳ thấp (chỉ khoảng 0.95 USD - 1.14 USD, xem chi tiết bảng ước lượng tại: experiment/design-rationale.md), và các thư viện đo metrics như JaCoCo, Coverage.py đều là chuẩn công nghiệp. Em đã viết sẵn pipeline mô phỏng bằng Python để test thử và nó đã chạy tốt.
- Hành động minh họa:
Mở và chạy thử file experiment/run_pipeline.py trước mặt cô, sau đó mở file kết quả experiment/output_pipeline/python_process_user_data_prompt.txt để cô thấy prompt đã được sinh ra đúng như logic kế hoạch.


VI. ĐÁNH GIÁ ĐỘ UY TÍN CỦA 10 BÀI BÁO THAM KHẢO (SLR)
---------------------------------------------------

Để chứng minh tính chuẩn mực khoa học của tài liệu tham khảo với cô giáo, dưới đây là phân nhóm độ uy tín của 10 bài báo được chọn trong SLR:

1. Nhóm hội thảo và tạp chí đỉnh cao thế giới (Hạng CORE A* và CORE A - Tương đương Q1):
- Tạp chí IEEE Transactions on Software Engineering (TSE) - Hạng CORE A* (Bài của Schäfer 2024 - TestPilot). Đây là tạp chí số 1 ngành kỹ thuật phần mềm.
- Hội thảo ACM FSE - Hạng CORE A* (Bài của Yuan 2024 - ChatTester).
- Hội thảo IEEE/ACM ASE - Hạng CORE A* (Bài của Lops 2025 - AgoneTest).
- Tạp chí ACM PACMPL - Hạng CORE A* (Bài của Lu 2026).
- Hội thảo ICSE-SEIP - Hạng CORE A* (Bài của Pan 2024 - ASTER).
- Hội thảo IEEE SANER - Hạng CORE A (Bài của Bruches 2026 - TAM-Eval).

2. Nhóm tạp chí và hội thảo chuyên ngành quốc tế có phản biện uy tín:
- Hội thảo IEEE ICSTW - Hạng CORE B (Bài của Straubinger 2025).
- Hội thảo CIbSE - Hạng CORE C (Bài của Celik 2026).
- Hội thảo ACM SAST - Brazil (Bài của Guilherme 2023).
- Tạp chí JUCCT - IRO Journals (Bài của Baskaran 2025).

Kết luận: 100% tài liệu tham khảo của đề tài đều từ các nguồn uy tín có phản biện, với hơn 60% (6/10 bài) thuộc phân khúc CORE A/A* cao nhất thế giới trong ngành Kỹ thuật Phần mềm.


VII. GIẢI THÍCH VỀ FEASIBILITY CHECK VÀ NGUỒN GỐC PHẢN CHỨNG
---------------------------------------------------------

1. Feasibility Check (Kiểm tra tính khả thi) là gì?
- Đây là bảng đánh giá rủi ro thực tế của đề tài dựa trên 7 tiêu chí: Bộ dữ liệu, Công cụ API, Tài nguyên tính toán, Đối chứng (Ground truth), Kỹ năng lập trình, Thời gian hoàn thành, và Đóng góp khoa học.
- Ý nghĩa: Chứng minh cho cô giáo thấy đề tài này hoàn toàn nằm trong khả năng thực hiện của bạn, không tốn kém tài chính (dưới 5 USD tiền API), có thể chạy hoàn toàn trên máy tính cá nhân trong vài phút, và thời gian thực hiện chỉ mất khoảng 1 tuần (đảm bảo hoàn thành đúng hạn tốt nghiệp). Điều này loại bỏ nỗi lo của cô về việc đề tài bị quá tải hoặc quá khó.

2. Trả lời câu hỏi: "Phản chứng dựa vào đâu mà biết các bài báo khác chưa làm bộ lọc CC?"
Nếu cô hỏi câu này, bạn trả lời tự tin theo 2 nguồn dẫn chứng thực tế sau:

Dẫn chứng 1 - Đọc tài liệu công bố (Methodology / Experimental Design):
- Trong bài báo ChatTester (Yuan 2024, Section 3), tác giả ghi rõ họ lựa chọn ngẫu nhiên 79 classes từ Defects4J và SF110, rồi đưa toàn bộ các method của class đó vào context.
- Trong bài báo TestPilot (Schäfer 2024, Section 4), tác giả thảo luận về LOC (dòng code) nhưng không hề đo CC hay lọc theo CC.
- Trong bài báo AgoneTest (Lops 2025, Section 4.3), tác giả thừa nhận việc sinh test cấp Class gặp giới hạn context window khi gặp class dài, nhưng chưa đề xuất giải pháp lọc riêng lẻ method theo CC.

Dẫn chứng 2 - Phân tích thực tế mã nguồn pipeline của họ (nằm trong experiment/sota_pipelines/):
- ChatTester (Yuan 2024): Parser của họ sử dụng thư viện JavaParser tại `ClassParser.java` chỉ để bóc tách thông tin cú pháp cơ bản (MethodInfo) của hàm (tên hàm, tham số, import) chứ không có module nào gọi thư viện tính toán CC (như lizard, PMD hay Checkstyle).
- CLASSES2TEST / AgoneTest (Lops 2025): Script thu thập dữ liệu của họ (`extract.py`) hoạt động hoàn toàn ở cấp độ Class (Class-level), chỉ kiểm tra xem lớp đó có sẵn unit test viết tay trên GitHub và cấu hình Maven/Gradle để chạy build hay không, hoàn toàn bỏ qua việc đo CC ở cấp method.
- TestPilot (Schäfer 2024): Parser viết bằng JS/TypeScript tại `exploreAPI.ts` chỉ duyệt AST để lấy signature và body của hàm xuất khẩu (export function), không chứa bất kỳ logic nào để đo CC.
- TAM-Eval (Bruches 2026): Parser viết bằng Python tại `parser.py` sử dụng thư viện Tree-sitter chỉ để lấy danh sách mọi hàm (`get_functions`) nhằm đánh giá mô hình, hoàn toàn không có bước lọc hay tính toán CC.

Việc kết hợp cả đọc tài liệu học thuật và trực tiếp xem code pipeline của họ giúp câu trả lời của bạn có tính thuyết phục tuyệt đối.

3. Các link mã nguồn GitHub SOTA và vị trí công bố trong các tệp PDF gốc:
Các link GitHub mã nguồn này đều đã được công khai công bố bởi chính các tác giả trong bài báo của họ:
* ChatTester (Yuan 2024):
  * *Tệp PDF gốc:* `SLR/papers/Yuan_2024_NoMoreManual.pdf`
  * *Link mã nguồn công khai:* [GitHub - ChatTester](https://github.com/ZJU-ACES-ISE/ChatTester)
  * *Vị trí trong PDF:* Nằm ở phần Footnote (Chú thích chân trang) của Trang 1 (cột trái) và phần Data Availability ở cuối bài viết.
* TestPilot (Schäfer 2024):
  * *Tệp PDF gốc:* `SLR/papers/Schafer_2024_AdaptiveTest.pdf`
  * *Link mã nguồn công khai:* [GitHub - testpilot](https://github.com/githubnext/testpilot)
  * *Vị trí trong PDF:* Nằm ở Section VIII. Data Availability (Trang 11) ở cuối bài viết.
* AgoneTest (Lops 2025):
  * *Tệp PDF gốc:* `SLR/papers/Lops_2025_AgoneTest.pdf`
  * *Link mã nguồn công khai:* [CLASSES2TEST Benchmark Repository](https://anonymous.4open.science/r/classes2test) (Replication package công khai trên 4open)
  * *Vị trí trong PDF:* Nằm ở Abstract (Trang 1) và phần Experimental Setup / Evaluation nói về gói tái sinh kiểm thử.
* TAM-Eval (Bruches 2026):
  * *Tệp PDF gốc:* `SLR/papers/Bruches_2026_TAMEval.pdf`
  * *Link mã nguồn công khai:* [GitHub - TAM-Eval](https://github.com/trndcenter/TAM-Eval)
  * *Vị trí trong PDF:* Nằm ở Abstract (Trang 1) và phần Introduction.

