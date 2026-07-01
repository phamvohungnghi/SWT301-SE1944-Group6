# Báo cáo Chạy Mô hình sinh Test Suite (LLM/API Phase)

Tài liệu này báo cáo lại quá trình thực hiện sinh test suite cho 50 hàm (25 Java + 25 Python) sử dụng API miễn phí nhưng vẫn đảm bảo đúng dòng mô hình **`gpt-4o`** theo yêu cầu của đề tài.

---

## 1. Phương pháp thay thế OpenAI Token
Để tránh mất phí mua token OpenAI mà vẫn giữ nguyên mô hình **`gpt-4o`** cho thí nghiệm chính thức:
* **Giải pháp:** Sử dụng dịch vụ **GitHub Models** (hoàn toàn miễn phí cho nhà phát triển có tài khoản GitHub).
* **Mô hình thực tế sử dụng:** `gpt-4o` (bản host trên Azure AI thông qua GitHub Models).
* **Xác thực:** Dùng GitHub Personal Access Token (PAT) thông thường (không cần cấp quyền cho Repo, tuyệt đối an toàn).

---

## 2. Các thay đổi đối với Script `run_pipeline.py`
Để hỗ trợ giải pháp trên mà không làm ảnh hưởng tới các bước chạy của các thành viên khác trong nhóm (Quân, Văn), mã nguồn [run_pipeline.py](file:///D:/Semester_5/SWT301/RLB/SWT301-SE1944-Group6/experiment/run_pipeline.py) đã được nâng cấp:
1. **Hỗ trợ Đa nhà cung cấp (Multi-provider):** Thêm tham số `--provider` với các tùy chọn: `openai`, `gemini` (Google AI Studio - Free), `openrouter` (Free models), `github` (GitHub Models - Free `gpt-4o`), và `ollama` (Local LLM).
2. **Giả lập Response OpenAI (`MockResponse`):** Các phản hồi từ API thay thế được đóng gói lại thành đối tượng giả lập có cấu trúc giống hệt API Response của OpenAI. Nhờ đó, các file xuất ra (`response.json`, `request.json`, `metadata.json`) hoàn toàn khớp với cấu trúc cũ, không gây lỗi cho các script đo lường phía sau.
3. **Hiển thị Tiến trình Console:** Thêm dòng in tiến trình chạy trực quan ra màn hình PowerShell (`Generating test for <unit_id>... Done!`) để tránh chạy ngầm im lặng.

---

## 3. Công cụ tạo log tự động `generate_logs.py`
Để tự động hóa việc xuất file tổng hợp kết quả chạy theo biểu mẫu yêu cầu của đề bài, một script tiện ích mới đã được thêm vào tại [generate_logs.py](file:///D:/Semester_5/SWT301/RLB/SWT301-SE1944-Group6/experiment/generate_logs.py):
* Đọc toàn bộ thư mục kết quả thô, trích xuất metadata và thông tin chạy.
* Ghép nối với thông tin trong manifest gốc.
* Sinh ra file log dạng TXT và file tổng hợp kết quả dạng CSV.

---

## 4. Kết quả thực hiện
Tất cả các tệp tin kết quả hiện đã được tạo đầy đủ và lưu trữ tại thư mục [results/](file:///D:/Semester_5/SWT301/RLB/SWT301-SE1944-Group6/results):

### Thử nghiệm Pilot (10 hàm)
* **Thư mục code test & raw:** [pilot_requests/](file:///D:/Semester_5/SWT301/RLB/SWT301-SE1944-Group6/results/pilot_requests) (10 thư mục)
* **File log tổng hợp:** 
  * [pilot_api_log.txt](file:///D:/Semester_5/SWT301/RLB/SWT301-SE1944-Group6/results/pilot_api_log.txt)
  * [pilot_llm_output.csv](file:///D:/Semester_5/SWT301/RLB/SWT301-SE1944-Group6/results/pilot_llm_output.csv)

### Chạy chính thức Full Run (50 hàm)
* **Thư mục code test & raw:** [full_requests/](file:///D:/Semester_5/SWT301/RLB/SWT301-SE1944-Group6/results/full_requests) (50 thư mục)
* **File log tổng hợp:**
  * [full_api_log.txt](file:///D:/Semester_5/SWT301/RLB/SWT301-SE1944-Group6/results/full_api_log.txt)
  * [full_llm_output.csv](file:///D:/Semester_5/SWT301/RLB/SWT301-SE1944-Group6/results/full_llm_output.csv)

---

## 5. Hướng dẫn chạy lại hoặc chạy mới
Nếu cần sinh lại hoặc chạy mới các test suite, thực hiện theo các bước sau trong PowerShell:

1. **Cấu hình Token GitHub:**
   ```powershell
   $env:GITHUB_TOKEN="ghp_Mã_Token_GitHub_Của_Bạn"
   ```

2. **Chạy Sinh Code Test:**
   ```powershell
   # Bản Pilot (10 hàm)
   python experiment/run_pipeline.py --manifest results/pilot_manifest.csv --sources-root . --output-dir results/pilot_requests --mode generate --provider github

   # Bản Full (50 hàm)
   python experiment/run_pipeline.py --manifest experiment/dataset-manifest.csv --sources-root . --output-dir results/full_requests --mode generate --provider github --require-full
   ```

3. **Tổng hợp file Log & CSV:**
   ```powershell
   # Cho Pilot
   python experiment/generate_logs.py --output-dir results/pilot_requests

   # Cho Full
   python experiment/generate_logs.py --output-dir results/full_requests
   ```
