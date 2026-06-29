# Hướng dẫn Sử dụng Tập Dữ liệu Thực nghiệm (25 Java + 25 Python)
===========================================================

Thư mục này chứa tập dữ liệu thực nghiệm chuẩn gồm **50 hàm độc lập (standalone)** có độ phức tạp trung bình (Cyclomatic Complexity - CC từ 5 đến 15), được thiết kế đối xứng hoàn toàn giữa hai ngôn ngữ: **Java** và **Python**.

---

## I. CẤU TRÚC THƯ MỤC
*   `java_dataset/JavaAlgorithms.java`: Chứa 25 hàm Java.
*   `python_dataset/python_functions.py`: Chứa 25 hàm Python đối xứng.
*   `README.md`: Hướng dẫn sử dụng tập dữ liệu và chạy thực nghiệm (file này).

---

## II. DANH SÁCH 25 HÀM ĐỐI XỨNG & ĐỘ PHỨC TẠP (CC)
Dưới đây là bảng đối chiếu danh sách các bài toán và độ phức tạp Cyclomatic Complexity tương ứng của mỗi hàm (được đo bởi Lizard):

| STT | Tên hàm (Python / Java) | Mô tả thuật toán | Độ phức tạp CC | Nguồn gốc / Phương pháp luận |
| :--- | :--- | :--- | :---: | :--- |
| 1 | `bubble_sort` / `bubbleSort` | Sắp xếp nổi bọt tối ưu (có gắn cờ swapped) | **5** | SOTA Algorithms |
| 2 | `binary_search` / `binarySearch` | Tìm kiếm nhị phân có kiểm tra biên | **5** | SOTA Algorithms |
| 3 | `is_valid_email` / `isValidEmail` | Kiểm tra cú pháp Email thủ công không dùng Regex | **11** | Utility Verification |
| 4 | `merge_intervals` / `mergeIntervals` | Trộn các khoảng trùng lặp | **7** | CLASSES2TEST / TestPilot |
| 5 | `calculate_tax` / `calculateTax` | Tính thuế thu nhập lũy tiến nhiều trường hợp | **8** | Utility Verification |
| 6 | `validate_password` / `validatePassword` | Kiểm tra độ mạnh của mật khẩu theo chuẩn | **10** | Utility Verification |
| 7 | `evaluate_rpn` / `evaluateRPN` | Máy tính giá trị biểu thức Ba Lan ngược | **12** | CLASSES2TEST / TestPilot |
| 8 | `knapsack_01` / `knapsack01` | Quy hoạch động bài toán Cái Balo 0/1 | **8** | SOTA Algorithms |
| 9 | `json_path_lookup` / `jsonPathLookup` | Truy vấn dữ liệu JSON đa cấp (dict/list) | **10** | CLASSES2TEST / TestPilot |
| 10 | `run_length_encoding` / `runLengthEncoding` | Nén chuỗi ký tự bằng mã hóa độ dài | **6** | Utility Verification |
| 11 | `run_length_decoding` / `runLengthDecoding` | Giải nén chuỗi ký tự mã hóa độ dài | **7** | Utility Verification |
| 12 | `check_sudoku_board` / `checkSudokuBoard` | Xác thực tính hợp lệ của bảng Sudoku 9x9 | **11** | SOTA Algorithms |
| 13 | `roman_to_int` / `romanToInt` | Chuyển đổi ký số La Mã sang số nguyên | **6** | CLASSES2TEST / TestPilot |
| 14 | `int_to_roman` / `intToRoman` | Chuyển đổi số nguyên sang ký số La Mã | **5** | CLASSES2TEST / TestPilot |
| 15 | `longest_palindrome_substring` / `longestPalindromeSubstring` | Tìm chuỗi con đối xứng dài nhất (Odd/Even) | **11** | SOTA Algorithms |
| 16 | `parse_csv_line` / `parseCsvLine` | Phân tích một dòng CSV (xử lý dấu ngoặc kép) | **8** | Utility Verification |
| 17 | `levenshtein_distance` / `levenshteinDistance` | Tính khoảng cách sửa đổi giữa 2 chuỗi | **8** | SOTA Algorithms |
| 18 | `find_prime_factors` / `findPrimeFactors` | Phân tích số nguyên ra các thừa số nguyên tố | **6** | SOTA Algorithms |
| 19 | `luhn_check` / `luhnCheck` | Xác thực số thẻ tín dụng bằng thuật toán Luhn | **6** | Utility Verification |
| 20 | `simple_html_tokenizer` / `simpleHtmlTokenizer` | Phân tích mã HTML thành thẻ TAG và TEXT | **7** | CLASSES2TEST / TestPilot |
| 21 | `dijkstra` / `dijkstra` | Tìm đường đi ngắn nhất trên đồ thị ma trận | **15** | SOTA Algorithms |
| 22 | `parse_query_string` / `parseQueryString` | Phân tích URL Query String thành Map/Dict | **8** | Utility Verification |
| 23 | `date_difference` / `dateDifference` | Tính khoảng cách ngày thủ công không dùng thư viện | **15** | Utility Verification |
| 24 | `is_valid_bst` / `isValidBST` | Kiểm tra cây nhị phân tìm kiếm hợp lệ (DFS) | **13** | SOTA Algorithms |
| 25 | `is_match` / `isMatch` | Bộ so khớp chuỗi Regex cơ bản (hỗ trợ `.` và `*`) | **8** | SOTA Algorithms |

---

## III. HƯỚNG DẪN CHẠY THỰC NGHIỆM

### Bước 1: Cài đặt thư viện phân tích tĩnh
Đảm bảo bạn đã cài đặt `lizard` để chạy phân tích độ phức tạp:
```bash
pip install lizard
```

### Bước 2: Chạy kiểm tra bộ lọc và sinh prompt tự động
Chạy script chính ở thư mục gốc của dự án:
```bash
python3 experiment/run_pipeline.py
```
**Kết quả mong đợi:**
*   Pipeline sẽ tự động phát hiện cả hai tệp `JavaAlgorithms.java` và `python_functions.py`.
*   Nó sẽ duyệt qua **50 hàm** này và tính toán CC. Do tất cả các hàm đều nằm trong khoảng CC từ 5 đến 15, chúng sẽ được giữ lại hoàn toàn.
*   **50 tệp prompt** zero-shot chuẩn hóa sẽ được tự động tạo và lưu trữ tại thư mục: `experiment/output_pipeline/`.

### Bước 3: Sinh mã kiểm thử (Unit Test Case Generation)
Bạn có hai tùy chọn để kích hoạt pha gọi LLM tự động (Stage 3):
1.  **Sử dụng OpenAI API (GPT-4o):**
    *   Tạo file `.env` ở thư mục gốc dự án.
    *   Thêm dòng cấu hình: `OPENAI_API_KEY=your_key_here`.
    *   Chạy lại lệnh ở Bước 2.
2.  **Sử dụng mô hình local chạy offline miễn phí (Ollama):**
    *   Tải và cài đặt [Ollama](https://ollama.com).
    *   Chạy lệnh: `ollama run qwen2.5-coder` (hoặc bất kỳ mô hình coding nào khác).
    *   Giữ Ollama chạy ngầm và chạy lại script ở Bước 2. Pipeline sẽ tự phát hiện Ollama và sinh mã kiểm thử offline hoàn toàn miễn phí.

Mã nguồn kiểm thử tự động sinh ra sẽ được lưu tại: `experiment/output_pipeline/generated_tests/`.

---

## IV. CÁC PHÉP ĐO CHẤT LƯỢNG (METRICS)
Sau khi sinh xong các file test, bạn tiến hành nạp vào các framework kiểm thử tương ứng để đo đạc và chạy thống kê:
*   **Java:** Chạy bộ test bằng công cụ **JaCoCo** để đo Branch Coverage và **PIT Testing** để đo Mutation Score.
*   **Python:** Chạy bộ test bằng công cụ **Coverage.py** để đo Branch Coverage và **pytest-mutagen** để đo Mutation Score.
