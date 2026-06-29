# Bảng bằng chứng — LLM cho sinh unit test

**Phạm vi:** 10 nghiên cứu được chọn trong SLR  
**Ngày chuẩn hóa:** 2026-06-21

## Quy ước trích xuất

- `NR` (*not reported/not extracted*): bài báo hoặc bản trích xuất hiện tại chưa cung cấp đủ số liệu để ghi một kết quả định lượng có thể kiểm tra.
- Không quy đổi `statement`, `line`, `method` và `branch coverage` thành cùng một chỉ số.
- Không so sánh trực tiếp `mean`, `median`, `maximum` và `improvement` nếu chưa cùng dataset, đơn vị phân tích và cách tổng hợp.
- “Có tên metric” chưa đồng nghĩa “có thể tái lập”. Muốn tái lập phải có công cụ/phiên bản, mẫu số, đơn vị phân tích và quy tắc xử lý test lỗi.

## Bảng trích xuất chính

| ID | Nghiên cứu | Tool/LLM được báo cáo | Dataset/đối tượng | Metric được báo cáo | Kết quả định lượng đã trích xuất | Threat/limitation tự nêu hoặc suy ra trực tiếp từ thiết kế | Mức liên quan |
|---|---|---|---|---|---|---|---|
| S1 | Guilherme & Vincenzi (2023), SAST — *An initial investigation of ChatGPT unit test generation capability* | `gpt-3.5-turbo` qua OpenAI API | 33 chương trình Java | Code coverage, mutation score, build/execution success | Coverage trung bình 90,2%; mutation score trung bình 70,5%; prompt cải tiến đạt success rate 64,6% ở temperature 0,2 | Dataset nhỏ; prompt đơn giản; chưa đánh giá sâu tính đúng của oracle nghiệp vụ | Trực tiếp: unit-test generation |
| S2 | Baskaran et al. (2025), JUCCT — *LLM Driven Unit Test Case Generation Using Agentic AI* | OpenAI LLM qua AutoGen; exact model NR | Một ứng dụng quản lý bảo hiểm bằng Python | Branch coverage, mutation score | Branch coverage 98% → 99%; mutation score 83,9% → 95,8% | Chỉ một ứng dụng; khó khái quát; chi phí agent/repair không tách riêng | Trực tiếp nhưng external validity thấp |
| S3 | Schäfer et al. (2024), IEEE TSE — *An Empirical Evaluation of Using LLMs for Automated Unit Test Generation* / TestPilot | `gpt-3.5-turbo`, `code-cushman-002`, StarCoder | JavaScript/TypeScript và Python, chủ yếu function/API-level | Statement coverage, branch coverage, executability | Median statement coverage 70,2%; median branch coverage 52,8% | Phụ thuộc context/dependency; lỗi cú pháp ở lượt đầu; có iterative repair | Trực tiếp |
| S4 | Lops et al. (2025), ASE — *AgoneTest* | `gpt-4o-mini`, `gemini-1.5-pro`, `llama3.1:70b` | CLASSES2TEST, Java class-level | Line/method/branch coverage, mutation score, test smells, compilability | Compilation cao nhất 36,0%; line coverage cao nhất 89,8%; method coverage cao nhất 92,9%; branch coverage cao nhất 79,8%; mutation score cao nhất 89,2% | Kết quả là maximum giữa nhiều model/prompt; nhạy với prompt; compilation rate thấp | Trực tiếp nhưng khác đơn vị phân tích |
| S5 | Celik & Mahmoud (2026), CIbSE — *GEM* | Codex, Sonnet, Qwen, Llama; model deployment cụ thể theo paper | Java, Python, C++; function/class-level | Success rate, branch coverage, mutation score, executability | Ví dụ Codex trên ULT(100): success 73,00%; mutation 72,71%→81,85%; branch 84,30%→88,81%. Kết quả thay đổi mạnh theo model/dataset | Hiệu quả phụ thuộc model/ngôn ngữ; import failures làm giảm effective sample; khoảng cách coverage–mutation còn lớn | Trực tiếp nhưng treatment gồm repair/strengthening |
| S6 | Lu et al. (2026), PACMPL — *Beyond Coverage* | DeepSeek-V3 | 1.035 Java methods, standalone và non-standalone | Mutation score, code coverage, pass@k | Mutation score tăng trung bình 16,04 điểm/% theo cách bài báo báo cáo cho standalone và 8,11 cho non-standalone | Là augmentation từ survived mutants, không phải zero-shot generation thuần; phụ thuộc test suite ban đầu | Liên quan gián tiếp |
| S7 | Pan et al. (2024/2025), ICSE-SEIP — *ASTER* | GPT-4, Llama 3, CodeLlama, Granite | Java/Python, method/module-level | Line/branch/method coverage, test naturalness | Với Python benchmark được paper báo cáo, ASTER+GPT-4 đạt 78,0% line, 77,2% branch và 86,7% method coverage; 161 lập trình viên tham gia user study | Cần static analysis và cấu hình mocking; kết quả phụ thuộc context extraction | Trực tiếp nhưng có static-analysis/error-remediation treatment |
| S8 | Bruches et al. (2026), SANER-C — *TAM-Eval* | Nhiều SOTA LLM; GPT-5 là model tốt nhất được báo cáo | 1.539 kịch bản bảo trì test, Python/Java/Go | Attempt@k success, coverage delta, mutation delta | GPT-5 đạt 42,3% success ở Attempt@3 | Bài toán test maintenance ở file-level, không phải generation cho function độc lập | Counter/context evidence, không dùng làm bằng chứng trực tiếp cho generation |
| S9 | Yuan et al. (2024), FSE — *ChatTester* | ChatGPT/`gpt-3.5-turbo`, CodeLlama-Instruct, CodeFuse | 79 Java classes | Branch coverage, mutation score, compilability, correct assertions | Branch coverage >82%; mutation score >65%; compilable tests tăng 34,3%; correct assertions tăng 18,7% | Multi-turn repair làm tăng chi phí/độ trễ; kết quả ở class-level | Trực tiếp nhưng treatment khác zero-shot một lượt |
| S10 | Straubinger et al. (2025), ICSTW — *Mutation Testing via Iterative LLM-Driven Scientific Debugging* | `gpt-4o-mini-2024-07-18` | Python benchmark, mutant-level | Branch/line coverage, mutation score, success, cost | Paper báo xấp xỉ 55% branch coverage cho baseline và gần 80% cho các scientific-debugging variants; mutation score xấp xỉ 60% cho baseline và khoảng 80% cho các variants | Iterative scientific debugging khác zero-shot; nhiều API token; nguy cơ equivalent mutants | Liên quan trực tiếp đến mutation-guided testing, không hoàn toàn tương đương |

## Kiểm tra chất lượng evidence table

| Tiêu chí | Kết quả | Trạng thái | Hành động bắt buộc |
|---|---:|---|---|
| Số paper ≥5 | 10/10 | PASS | Không |
| Tool/LLM không để trống ≥90% | 10/10 | PASS | Giữ `NR` ở nơi paper không công bố exact model; không tự suy đoán |
| Metric có tên cụ thể | 10/10 | PASS | Không đồng nhất các loại coverage |
| Metric đủ thông tin để tái lập từ evidence table | 0/10 | FAIL | Khi dùng một kết quả làm threshold/baseline phải đọc phương pháp gốc và ghi tool/version/aggregation |
| Result có ít nhất một outcome định lượng | 10/10 | PASS | Giữ đúng nhãn mean/median/highest/approximate và treatment tương ứng |
| Threat/limitation được trích xuất | 10/10 | PASS | Phân biệt limitation của paper với suy luận của nhóm |

## Bằng chứng dùng trực tiếp cho thiết kế

| Quyết định | Bằng chứng được phép dùng | Cách dùng đúng |
|---|---|---|
| Chọn branch coverage và mutation score | S1–S7, S9–S10 | Chứng minh đây là hai metric phổ biến; không chứng minh một ngưỡng chất lượng phổ quát |
| Giữ executability/compilability | S1, S4, S5, S9 | Metric phụ; mẫu số là toàn bộ response, kể cả test không biên dịch/chạy |
| Một response, không repair | Đối chiếu S3, S5, S9, S10 | Cô lập năng lực zero-shot ban đầu; không tuyên bố giải quyết GAP về self-repair |
| Randoop cho Java | Các paper có traditional baseline; protocol của nghiên cứu hiện tại | Baseline theo cặp trên cùng Java unit; không áp dụng cho Python |
| CC 5–15 | Không paper nào trong tập SLR được ghi nhận lọc đúng khoảng này | Đây là phạm vi do nhóm lựa chọn để kiểm soát độ phức tạp, không phải “khoảng tốt nhất” đã được literature xác nhận |
| Ngưỡng 75% | S3 (52,8% median branch) và S4 (79,8% highest branch) chỉ cung cấp bối cảnh | **Case 3:** practical target đăng ký trước; không gọi là floor hoặc threshold trích nguyên từ paper |

## Tài liệu tham khảo

1. Guilherme, V. & Vincenzi, A. (2023). SAST. https://dl.acm.org/doi/10.1145/3624032.3624035
2. Baskaran, S., Mishara, P., & Agarwal, R. (2025). JUCCT. https://irojournals.com/jucct/article/view/1818
3. Schäfer, M. et al. (2024). IEEE TSE. https://doi.org/10.1109/TSE.2023.3328406
4. Lops, A. et al. (2025). ASE. https://ieeexplore.ieee.org/document/11334272/
5. Celik, A. & Mahmoud, Q. H. (2026). CIbSE. https://sol.sbc.org.br/index.php/cibse/article/view/42441
6. Lu, Z. et al. (2026). PACMPL. https://dl.acm.org/doi/10.1145/3798251
7. Pan, R. et al. (2024). arXiv:2409.03093. https://arxiv.org/abs/2409.03093
8. Bruches, E. et al. (2026). SANER-C. https://ieeexplore.ieee.org/document/11500203/
9. Yuan, Z. et al. (2024). FSE. https://doi.org/10.1145/3660783
10. Straubinger, P. et al. (2025). ICSTW. https://ieeexplore.ieee.org/document/10962485/
