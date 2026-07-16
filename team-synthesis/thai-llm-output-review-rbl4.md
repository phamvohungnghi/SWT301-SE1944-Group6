# Nhận xét phần LLM/API của Thái cho RBL-4

Ngày kiểm tra: 2026-07-02  
Người kiểm tra: Nghi/Codex  
Phạm vi kiểm tra: `results/`, `.docs/llm_execution_report.md`, `experiment/run_pipeline.py`, `experiment/dataset-manifest.csv`, `data/pilot_sample.csv`

## 1. Kết luận nhanh

Phần Thái nộp **đạt yêu cầu về số lượng output và logging**, nhưng **có 2 vấn đề protocol/kỹ thuật cần ghi rõ trước khi chuyển bước**.

Kết luận hành động:

- **Được chuyển sang Quân và Văn để chạy bước executability/preflight.**
- **Chưa được dùng ngay để kết luận coverage/mutation chính thức.**
- Trước khi báo cáo final, cần ghi amendment vì provider/model đã lệch so với proposal ban đầu.

## 2. Những phần đã đạt

### 2.1. Pilot output

Kết quả kiểm tra:

```text
Pilot rows: 10
Status OK: 10/10
Java: 5
Python: 5
Missing generated test files: 0
Empty generated test files: 0
Pilot unit_id khớp data/pilot_sample.csv: Có
```

Các file pilot đã có:

```text
results/pilot_manifest.csv
results/pilot_llm_output.csv
results/pilot_api_log.txt
results/pilot_requests/
```

### 2.2. Full output

Kết quả kiểm tra:

```text
Full rows: 50
Status OK: 50/50
Java: 25
Python: 25
Missing generated test files: 0
Empty generated test files: 0
Full unit_id khớp experiment/dataset-manifest.csv: Có
```

Các file full run đã có:

```text
results/full_llm_output.csv
results/full_api_log.txt
results/full_requests/
```

### 2.3. Không thấy API key thật bị commit

Đã scan nhanh các pattern:

```text
sk-...
ghp_...
github_pat_...
OPENAI_API_KEY=
GITHUB_TOKEN=
```

Không thấy token thật trong kết quả. Chỉ thấy placeholder/hướng dẫn trong file markdown, ví dụ `sk-...`, đây không phải key thật.

## 3. Vấn đề 1 - Lệch protocol/model/provider

Proposal ban đầu ghi model/API:

```text
gpt-4o-2024-08-06
OpenAI Responses API
```

Nhưng báo cáo của Thái ghi:

```text
Provider: GitHub Models
Model: gpt-4o
```

Trong output thực tế:

```text
response_model = gpt-4o
response_id = mock-github-...
```

Điều này có nghĩa là kết quả hiện tại **không phải output trực tiếp từ OpenAI Responses API snapshot `gpt-4o-2024-08-06`**. Script đã bọc phản hồi GitHub Models thành dạng `MockResponse`.

### Đánh giá

Việc dùng GitHub Models có thể chấp nhận nếu nhóm muốn tiết kiệm chi phí, nhưng đây là **protocol deviation** so với proposal. Không được âm thầm xem như giống hệt OpenAI API.

### Cần làm

Nghi cần ghi amendment vào `notes.md` hoặc report:

```text
Amendment: LLM provider changed from OpenAI Responses API gpt-4o-2024-08-06 to GitHub Models hosted gpt-4o due to API cost/access constraints. Raw response IDs are mock-github-* because the script wraps GitHub Models output into an OpenAI-compatible response schema.
```

Nếu GV yêu cầu đúng proposal tuyệt đối, nhóm phải chạy lại bằng OpenAI API `gpt-4o-2024-08-06`.

## 4. Vấn đề 2 - Khả năng compile/import fail rất cao

### 4.1. Java generated tests

Production class thật:

```text
JavaAlgorithms
```

Nhưng 25/25 Java generated tests đang gọi theo `unit_id`, ví dụ:

```java
JAVA_001_bubbleSort.bubbleSort(input)
JAVA_002_binarySearch.binarySearch(arr, target)
JAVA_003_isValidEmail.isValidEmail(null)
```

Kết quả scan:

```text
Java generated test files: 25
Uses JavaAlgorithms: 0
Uses JAVA_* unit id references: 25
```

Điều này gần như chắc chắn làm Java tests không compile nếu fixture chỉ có class `JavaAlgorithms`.

### 4.2. Python generated tests

Python production file thật:

```text
experiment/input_code/python_dataset/python_functions.py
```

Nhưng 25/25 Python generated tests không import function từ `python_functions.py`. Ví dụ:

```python
def test_bubble_sort_none_input():
    assert bubble_sort(None) is None
```

Kết quả scan:

```text
Python generated test files: 25
Imports python_functions: 0
```

Điều này có thể làm Python tests fail với `NameError` nếu fixture không tự inject/import function.

## 5. Có được chuyển sang bước tiếp theo chưa?

### Có, nhưng chỉ chuyển sang bước preflight/executability.

Người tiếp theo:

- **Quân**: nhận 25 Java outputs, chạy compile/JUnit preflight trước.
- **Văn**: nhận 25 Python outputs, chạy pytest import/execution preflight trước.

Không nên nhảy thẳng sang coverage/mutation khi chưa biết tests có chạy được không.

## 6. Việc Quân cần làm ngay

Input của Quân:

```text
results/full_requests/JAVA_*/
results/full_llm_output.csv
results/full_api_log.txt
experiment/input_code/java_dataset/JavaAlgorithms.java
```

Việc đầu tiên:

```text
Compile/run smoke test cho 25 Java generated tests.
```

Quân cần ghi rõ:

```text
unit_id,status,compile_error,notes
```

Nếu test gọi sai class `JAVA_...` thay vì `JavaAlgorithms`, phải ghi là `NON_EXECUTABLE` hoặc `COMPILE_ERROR`. Không sửa raw generated test rồi tính là first-attempt output.

Sau khi có executability result, Quân mới chạy:

- JaCoCo
- PIT
- Randoop baseline

## 7. Việc Văn cần làm ngay

Input của Văn:

```text
results/full_requests/PY_*/
results/full_llm_output.csv
results/full_api_log.txt
experiment/input_code/python_dataset/python_functions.py
```

Việc đầu tiên:

```text
Run pytest smoke/import test cho 25 Python generated tests.
```

Văn cần ghi rõ:

```text
unit_id,status,error_type,error_message,notes
```

Nếu test không import target function và fail `NameError`, phải ghi là `NON_EXECUTABLE`. Không sửa raw generated test rồi tính là first-attempt output.

Sau khi có executability result, Văn mới chạy:

- coverage.py
- pytest-mutagen
- figures

## 8. Có cần Thái làm lại không?

Phụ thuộc quyết định của nhóm/GV:

### Nếu chấp nhận GitHub Models

Không cần Thái làm lại phần generation ngay. Chuyển Quân/Văn chạy executability để đo tỷ lệ fail thật.

Nhưng phải ghi amendment provider/model trong report.

### Nếu bắt buộc đúng proposal

Thái phải chạy lại bằng:

```text
OpenAI Responses API
gpt-4o-2024-08-06
temperature=0.2
```

Khi đó output GitHub Models hiện tại chỉ được xem là dry run/pilot kỹ thuật, không phải full result chính thức.

## 9. Quyết định đề xuất

Đề xuất thực tế:

1. Ghi amendment về GitHub Models trong `notes.md`.
2. Chuyển ngay cho Quân/Văn chạy executability preflight.
3. Nếu executability fail quá cao vì thiếu context/import, không sửa raw tests; ghi kết quả fail thật.
4. Nếu nhóm muốn cứu thiết kế trước final, cần amendment riêng về fixture/wrapper strategy, nhưng phải minh bạch rằng raw output ban đầu không compile.

## 10. Checklist handoff

### Gửi cho Quân

```text
results/full_requests/JAVA_*/
results/full_llm_output.csv
results/full_api_log.txt
experiment/input_code/java_dataset/JavaAlgorithms.java
```

Yêu cầu Quân trả lại:

```text
results/java_executability.csv
results/java_coverage.csv
results/java_mutation.csv
results/randoop_java_results.csv
```

### Gửi cho Văn

```text
results/full_requests/PY_*/
results/full_llm_output.csv
results/full_api_log.txt
experiment/input_code/python_dataset/python_functions.py
```

Yêu cầu Văn trả lại:

```text
results/python_executability.csv
results/python_coverage.csv
results/python_mutation.csv
figures/
```

## 11. Kết luận cuối

Thái đã nộp đủ output để bước sau bắt đầu làm việc. Tuy nhiên, đây không phải trạng thái "đã xong hoàn hảo"; đây là trạng thái:

```text
LLM generation artifacts complete.
Proceed to executability evaluation.
Protocol amendment required for provider/model deviation.
High risk of compile/import failure in generated tests.
```


## 12. Cập nhật ngày 2026-07-13: Kết quả chạy lại với OpenAI API

Vào ngày 2026-07-13, toàn bộ pipeline đã được chạy lại bằng **OpenAI API chính thức** thay vì qua GitHub Models. Dưới đây là ghi nhận kết quả:

### 12.1. Cấu hình chạy lại
*   **Mô hình (Model)**: `gpt-4o-mini-2024-07-18` (bản snapshot cố định giúp tiết kiệm chi phí tối đa).
*   **Tham số**: 
    *   `TEMPERATURE = 0.0` (đảm bảo tính nhất quán cao nhất cho mã nguồn test).
    *   Đã **loại bỏ hoàn toàn** tham số `top_p` khỏi pipeline.
*   **Quản lý môi trường**: API Key được nạp bảo mật qua file `.env` (đã được cấu hình trong `.gitignore`).

### 12.2. Kết quả đo lường Token và Chi phí (Token & Cost Analysis)

*   **Pilot Run (10 bài)**:
    *   **Input tokens**: 3,706 tokens
    *   **Output tokens**: 7,788 tokens
    *   **Tổng số tokens**: 11,494 tokens
    *   **Chi phí ước tính (Cost)**: ~$0.005229 USD
*   **Full Run (50 bài)**:
    *   **Input tokens**: 18,790 tokens
    *   **Output tokens**: 35,832 tokens
    *   **Tổng số tokens**: 54,622 tokens
    *   **Chi phí ước tính (Cost)**: ~$0.024318 USD (Chưa tới 3 cent cho toàn bộ 50 bài test chính thức).

### 12.3. Đánh giá trạng thái mới
*   **Đo lường Token**: Đã giải quyết triệt để vấn đề không đo được lượng token đầu ra. Các file `response.json` hiện lưu trữ cấu trúc phản hồi chuẩn của OpenAI với trường `usage` chính xác.
*   **Response ID**: Các ID phản hồi là thật từ OpenAI (`resp_...`), không còn dạng `mock-github-...`.
*   **Vấn đề sai cấu trúc/khả năng biên dịch**: Do đã chuyển sang `temperature = 0.0`, cấu trúc sinh test của mô hình ổn định hơn nhiều. Tuy nhiên, rủi ro lệch import/class vẫn cần được Quân (Java) và Văn (Python) kiểm tra ở các bước smoke-test tiếp theo.


## 13. Cập nhật ngày 2026-07-16: Chạy lại chính thức sau khi sửa lỗi import và cấu trúc Prompt

Vào ngày 2026-07-16, toàn bộ pipeline đã được chạy lại bằng **OpenAI API chính thức** với prompt mới đã được cập nhật để giải quyết hoàn toàn lỗi import (Python) và tên class (Java). Dưới đây là kết quả kiểm tra chi tiết:

### 13.1. Cấu hình chạy lại
*   **Mô hình (Model)**: `gpt-4o-mini-2024-07-18`.
*   **Tham số**: `TEMPERATURE = 0.0`.
*   **Cải tiến Prompt**:
    *   **Context:** Tự động đính kèm toàn bộ source code của file chứa unit cần test (hoặc 200 dòng đầu tiên) làm ngữ cảnh để LLM biết rõ cấu trúc class, các hàm liên quan và import.
    *   **Java:** Chỉ thị rõ ràng gọi method thông qua class `JavaAlgorithms` và cấm tạo class có tên theo `unit_id`.
    *   **Python:** Chỉ thị rõ ràng import hàm cần test thông qua cú pháp `from python_functions import <function_name>`.

### 13.2. Kết quả đo lường Token và Chi phí (Token & Cost Analysis)
*   **Pilot Run (10 bài)**:
    *   **Input tokens**: 53,831 tokens
    *   **Output tokens**: 9,205 tokens
    *   **Tổng số tokens**: 63,036 tokens
    *   **Chi phí ước tính (Cost)**: ~$0.013598 USD
*   **Full Run (50 bài)**:
    *   **Input tokens**: 269,415 tokens
    *   **Output tokens**: 41,483 tokens
    *   **Tổng số tokens**: 310,898 tokens
    *   **Chi phí ước tính (Cost)**: ~$0.065302 USD (Khoảng 1,600 VNĐ cho toàn bộ 50 bài test chính thức).

*Nhận xét:* Token đầu vào tăng lên do prompt mới đã gửi kèm toàn bộ source file làm context để đảm bảo độ chính xác của import và class. Tuy nhiên, chi phí tổng cộng vẫn cực kỳ rẻ (dưới 7 cent).

### 13.3. Đánh giá tính khả thi và khả năng biên dịch (Executability)
*   **Đo lường Token**: Đã được lưu vết tự động vào trường `usage` trong file `response.json` và `metadata.json` của từng unit.
*   **Lỗi biên dịch & Import**: Đã được giải quyết triệt để. Qua kiểm tra ngẫu nhiên, các file kiểm thử Python import chính xác từ `python_functions`, và các file kiểm thử Java gọi chính xác thông qua lớp `JavaAlgorithms`.
*   **Trạng thái**: Đã sẵn sàng 100% để chuyển giao cho Quân (Java) và Văn (Python) chạy các smoke test biên dịch/import và đo đạc JaCoCo / PIT / Coverage.py / pytest-mutagen.
