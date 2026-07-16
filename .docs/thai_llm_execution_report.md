# Báo cáo Chạy Mô hình sinh Test Suite (LLM/API Phase)
# Vai trò: Thái (LLM/API Lead - WP2)

Tài liệu này tổng hợp chi tiết quá trình thực hiện nhiệm vụ sinh test suite cho 50 hàm (25 Java + 25 Python) trong dự án RBL-5. Báo cáo ghi nhận toàn bộ thông số thiết lập kỹ thuật, quy trình prompt và phân tích chi phí tiêu thụ dựa trên dữ liệu thực tế kết xuất từ OpenAI API Dashboard.

---

## 1. Cấu hình chạy Mô hình (LLM Setup)

Sau các phiên thử nghiệm kỹ thuật ban đầu qua GitHub Models (dry-runs), toàn bộ dữ liệu chính thức đã được chạy lại và ghi nhận thông qua **OpenAI API chính thức** vào ngày 16/07/2026 nhằm đảm bảo đúng protocol và trích xuất dữ liệu token chính xác.

*   **Mô hình sử dụng (Model Snapshot):** `gpt-4o-mini-2024-07-18` (bản snapshot cố định giúp tối ưu chi phí và tính nhất quán).
*   **Tham số cấu hình (Hyperparameters):**
    *   `TEMPERATURE = 0.0` (đảm bảo tính nhất quán của mã nguồn kiểm thử sinh ra, giảm độ nhiễu).
    *   Loại bỏ tham số `top_p`.
    *   `MAX_OUTPUT_TOKENS = 2048` (giới hạn độ dài tránh phản hồi bị cắt cụt).
*   **Bảo mật:** API Key được lưu trữ cục bộ trong file `.env` (được cấu hình trong `.gitignore` để cấm đẩy lên GitHub).

---

## 2. Quy trình Prompt và Chèn ngữ cảnh (Context Injection)

Để giải quyết triệt để lỗi biên dịch (Java) và lỗi import (Python) do thiếu ngữ cảnh class/module, prompt đã được thiết kế lại và tự động chèn thêm ngữ cảnh mã nguồn:

1.  **Chèn Ngữ cảnh Tệp nguồn (Context Injection):** Tự động đính kèm toàn bộ mã nguồn của file chứa unit cần kiểm thử (hoặc tối đa 200 dòng đầu tiên) để cung cấp cho mô hình cấu trúc lớp, các hàm liên quan và import có sẵn.
2.  **Ràng buộc Java:** Yêu cầu gọi các phương thức kiểm thử thông qua lớp `JavaAlgorithms` và cấm tạo class có tên theo dạng `JAVA_001` (tránh lỗi xung đột định nghĩa class).
3.  **Ràng buộc Python:** Chỉ định cú pháp import rõ ràng `from python_functions import <function_name>` và cấm sao chép code production vào file test (tránh lỗi xung đột định danh).

Nhờ các cải tiến prompt này, tỷ lệ biên dịch và chạy thành công trên 50 hàm ở đợt chạy chính thức đạt kết quả tuyệt đối về mặt cấu trúc cú pháp thô.

---

## 3. Thống kê Dữ liệu Token & Chi phí API

Dữ liệu được trích xuất trực tiếp từ các file kết xuất hệ thống trong thư mục [results/openai_usage_report/](file:///d:/Semester_5/SWT301/So%20many%20RBL%20so%20idk,%20this%20one%20is%20pulled%20from%20github/SWT301-SE1944-Group6/results/openai_usage_report/):
*   Tệp JSON: [completions_usage_2026-06-17_2026-07-17.json](file:///d:/Semester_5/SWT301/So%20many%20RBL%20so%20idk,%20this%20one%20is%20pulled%20from%20github/SWT301-SE1944-Group6/results/openai_usage_report/completions_usage_2026-06-17_2026-07-17.json)
*   Tệp CSV: [completions_usage_2026-07-16_2026-07-17.csv](file:///d:/Semester_5/SWT301/So%20many%20RBL%20so%20idk,%20this%20one%20is%20pulled%20from%20github/SWT301-SE1944-Group6/results/openai_usage_report/completions_usage_2026-07-16_2026-07-17.csv)

### Chỉ số tiêu thụ thực tế (Cho cả Pilot & Full Run):
*   **Tổng số yêu cầu thành công (Total Requests):** 60 (10 pilot + 50 full run).
*   **Tổng Input Tokens:** 323,246 tokens.
*   **Tổng Output Tokens:** 50,688 tokens.
*   **Tổng số Tokens tiêu thụ:** 373,934 tokens.
*   **Số lượng Token được cache (Input Cached Tokens):** 4,352 tokens (nhờ cơ chế Prompt Caching của OpenAI giúp tiết kiệm chi phí).
*   **Tổng chi phí thực tế phát sinh (Total Cost):** **`$0.0788997 USD`** (khoảng ~1,900 VND, hiển thị làm tròn thành `$0.08 USD` trên Billing Dashboard).
*   **Hiệu suất trung bình:** ~5,387.4 input tokens và ~$0.0013 USD cho mỗi yêu cầu kiểm thử.

---

## 4. Danh mục Sản phẩm Bàn giao (Deliverables)

Các sản phẩm do Thái thực hiện đã được đẩy lên kho chứa cục bộ và bàn giao cho nhóm tại các thư mục:
*   **Tập mã nguồn test Java (Bàn giao cho Quân):** [results/full_requests/JAVA_*/](file:///d:/Semester_5/SWT301/So%20many%20RBL%20so%20idk,%20this%20one%20is%20pulled%20from%20github/SWT301-SE1944-Group6/results/full_requests/)
*   **Tập mã nguồn test Python (Bàn giao cho Văn):** [results/full_requests/PY_*/](file:///d:/Semester_5/SWT301/So%20many%20RBL%20so%20idk,%20this%20one%20is%20pulled%20from%20github/SWT301-SE1944-Group6/results/full_requests/)
*   **Báo cáo tóm tắt chạy thực nghiệm:** [results/full_llm_output.csv](file:///d:/Semester_5/SWT301/So%20many%20RBL%20so%20idk,%20this%20one%20is%20pulled%20from%20github/SWT301-SE1944-Group6/results/full_llm_output.csv) và [results/full_api_log.txt](file:///d:/Semester_5/SWT301/So%20many%20RBL%20so%20idk,%20this%20one%20is%20pulled%20from%20github/SWT301-SE1944-Group6/results/full_api_log.txt).
*   **Dữ liệu thô của từng hàm (Replication Package):** Mỗi thư mục `unit_id` chứa tệp `request.json`, `response.json` (chứa siêu dữ liệu usage từ OpenAI) và `generated_test.*`.

---

## 5. Hướng dẫn Tái lặp quy trình (Reproduction Steps)

Nếu cần sinh lại các bộ kiểm thử hoặc chạy các bài kiểm tra mới:

1.  **Cài đặt Môi trường & Dependency:**
    ```powershell
    python -m venv .venv
    .\.venv\Scripts\Activate.ps1
    pip install -r experiment/requirements-experiment.txt
    ```
2.  **Cấu hình API Key (Lưu ý không lưu vào mã nguồn):**
    Tạo tệp `.env` tại thư mục gốc dự án chứa dòng cấu hình sau:
    ```env
    OPENAI_API_KEY=sk-your-openai-api-key-here
    ```
3.  **Chạy Script sinh kiểm thử:**
    ```powershell
    # Sinh bộ kiểm thử Pilot (10 hàm)
    python experiment/run_pipeline.py --manifest results/pilot_manifest.csv --sources-root . --output-dir results/pilot_requests --mode generate

    # Sinh bộ kiểm thử chính thức Full Run (50 hàm)
    python experiment/run_pipeline.py --manifest experiment/dataset-manifest.csv --sources-root . --output-dir results/full_requests --mode generate --require-full
    ```

