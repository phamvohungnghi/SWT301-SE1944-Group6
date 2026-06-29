# Handoff cho Thái - LLM/API Lead RBL-4

Ngày chuẩn bị: 2026-06-30  
Người nhận việc: Thái  
Vai trò: LLM/API Lead  
Trạng thái đầu vào: Dataset của Vinh đã đủ để chuyển sang bước pilot.

## 1. Mục tiêu của Thái

Thái phụ trách chạy GPT-4o để sinh unit test từ 50 prompt đã có sẵn trong project.

Thái không phụ trách:

- Không sửa dataset.
- Không đổi danh sách 50 hàm.
- Không đổi RQ.
- Không đổi threshold.
- Không đo coverage/mutation.
- Không sửa generated test bằng tay để làm kết quả đẹp hơn.

Thái chỉ phụ trách:

- Kiểm tra prompt.
- Chạy API pilot 10 hàm.
- Ghi log API đầy đủ.
- Lưu raw output của model.
- Nếu pilot pass, chạy full 50 hàm.
- Bàn giao Java output cho Quân.
- Bàn giao Python output cho Văn.

## 2. File Thái cần nhận

Thái cần pull hoặc tải repo GitHub mới nhất:

```text
https://github.com/phamvohungnghi/SWT301-SE1944-Group6
```

Sau khi có repo, Thái cần kiểm tra các file/thư mục sau:

```text
experiment/dataset-manifest.csv
data/pilot_sample.csv
experiment/output_pipeline/
experiment/run_pipeline.py
experiment/requirements-experiment.txt
```

Ý nghĩa:

| File/thư mục | Dùng để làm gì |
|---|---|
| `experiment/dataset-manifest.csv` | Danh sách chính thức 50 hàm đã freeze |
| `data/pilot_sample.csv` | 10 hàm pilot cần chạy trước |
| `experiment/output_pipeline/` | 50 prompt đã sinh sẵn |
| `experiment/run_pipeline.py` | Script chuẩn để prepare/generate request |
| `experiment/requirements-experiment.txt` | Dependency Python cần cài |

## 3. Việc bạn cần làm trước khi giao cho Thái

Bạn cần gửi cho Thái:

1. Link GitHub repo:

```text
https://github.com/phamvohungnghi/SWT301-SE1944-Group6
```

2. File hướng dẫn này:

```text
team-synthesis/thai-llm-runner-handoff-rbl4.md
```

3. Nhắc Thái rằng **chỉ chạy pilot trước**, chưa chạy full.

4. Nhắc Thái không commit hoặc gửi API key lên GitHub.

5. Nếu Thái dùng OpenAI API, Thái tự đặt API key ở máy của Thái bằng environment variable:

```powershell
$env:OPENAI_API_KEY="sk-..."
```

Không được tạo file `.env` rồi commit lên GitHub.

## 4. Trình tự Thái phải làm

### Bước 1 - Clone repo

```bash
git clone https://github.com/phamvohungnghi/SWT301-SE1944-Group6.git
cd SWT301-SE1944-Group6
```

### Bước 2 - Tạo môi trường Python

Khuyến nghị dùng virtual environment:

```bash
python -m venv .venv
```

Windows PowerShell:

```powershell
.\.venv\Scripts\Activate.ps1
```

Cài dependency:

```bash
pip install -r experiment/requirements-experiment.txt
```

Nếu cài lỗi OpenAI/lizard, báo lại Nghi trước khi chạy API.

### Bước 3 - Kiểm tra API key

PowerShell:

```powershell
$env:OPENAI_API_KEY="sk-..."
```

Kiểm tra:

```powershell
echo $env:OPENAI_API_KEY
```

Không chụp màn hình hoặc gửi API key vào nhóm chat.

### Bước 4 - Tạo thư mục kết quả

```bash
mkdir results
```

Nếu thư mục đã tồn tại thì bỏ qua.

### Bước 5 - Chạy prepare trước, chưa gọi API

Mục đích: kiểm tra manifest, hash, line range, CC, prompt format.

Lệnh đề xuất:

```bash
python experiment/run_pipeline.py --manifest experiment/dataset-manifest.csv --sources-root . --output-dir results/pilot_prepare --mode prepare
```

Nếu bước này lỗi, dừng lại và báo Nghi. Không tự sửa dataset.

Lưu ý: Script hiện tại mặc định chạy toàn bộ manifest, chưa lọc riêng pilot sample. Nếu muốn pilot đúng 10 hàm, Thái cần dùng một manifest pilot riêng hoặc Nghi tạo script lọc pilot trước.

## 5. Cách chạy pilot đúng 10 hàm

Pilot phải dùng:

```text
data/pilot_sample.csv
```

Vì `experiment/run_pipeline.py` hiện đọc manifest chính, cách an toàn là tạo một manifest pilot từ 10 `unit_id` trong `data/pilot_sample.csv`.

File cần tạo:

```text
results/pilot_manifest.csv
```

Quy tắc:

- Lấy đủ 10 dòng tương ứng từ `experiment/dataset-manifest.csv`.
- Không tự chọn hàm khác.
- Không đổi seed.
- Không đổi source.

Sau đó chạy:

```bash
python experiment/run_pipeline.py --manifest results/pilot_manifest.csv --sources-root . --output-dir results/pilot_requests --mode prepare
```

Nếu prepare pass, mới chạy generate:

```bash
python experiment/run_pipeline.py --manifest results/pilot_manifest.csv --sources-root . --output-dir results/pilot_requests --mode generate
```

## 6. Output Thái phải nộp sau pilot

Sau pilot, Thái phải nộp đủ:

```text
results/pilot_manifest.csv
results/pilot_requests/
results/pilot_llm_output.csv
results/pilot_api_log.txt
```

Trong `results/pilot_requests/`, mỗi `unit_id` nên có:

```text
request.json
prompt.sha256
response.json
generated_test.java hoặc generated_test.py
metadata.json
```

## 7. Format `results/pilot_api_log.txt`

Mỗi dòng log nên có:

```text
timestamp_utc | unit_id | language | model | response_id | status | prompt_sha256 | source_sha256 | error_message
```

Ví dụ:

```text
2026-06-30T10:15:22Z | PY_002_binary_search | python | gpt-4o-2024-08-06 | resp_xxx | OK | abc... | def... | 
```

Nếu lỗi:

```text
2026-06-30T10:18:01Z | JAVA_003_isValidEmail | java | gpt-4o-2024-08-06 | NONE | ERROR | abc... | def... | rate_limit
```

## 8. Format `results/pilot_llm_output.csv`

Nên có các cột:

```csv
unit_id,language,symbol,status,response_model,response_id,generated_test_path,metadata_path,error_message
```

Ví dụ:

```csv
PY_002_binary_search,python,binary_search,OK,gpt-4o-2024-08-06,resp_xxx,results/pilot_requests/PY_002_binary_search/generated_test.py,results/pilot_requests/PY_002_binary_search/metadata.json,
```

Nếu lỗi:

```csv
JAVA_003_isValidEmail,java,isValidEmail,ERROR,,NONE,,,rate_limit
```

## 9. Khi nào pilot được xem là pass?

Pilot pass khi:

- 10/10 unit có request được tạo.
- API log có đủ 10 dòng.
- Không mất raw response.
- Output không rỗng quá 20%.
- Không có lỗi format hàng loạt.
- Response model đúng với proposal.
- Không có API key trong bất kỳ file nào.

Nếu có 1-2 lỗi nhỏ, Thái ghi rõ vào log và báo Nghi.

Nếu lỗi nghiêm trọng, dừng lại:

- Không chạy full.
- Không gọi lại API hàng loạt.
- Báo Nghi để quyết định.

## 10. Sau pilot Thái phải báo gì cho Nghi?

Thái gửi lại:

```text
Pilot đã chạy xong.
Số unit: 10
OK: ...
ERROR: ...
INVALID/EMPTY: ...
Model thực tế: ...
Tổng request: ...
Tổng cost ước tính: ...
File output: results/pilot_llm_output.csv
File log: results/pilot_api_log.txt
```

Nghi sẽ kiểm tra pilot. Nếu pass, Nghi mới cho phép chạy full 50 hàm.

## 11. Chạy full 50 hàm

Chỉ chạy full khi Nghi xác nhận pilot pass.

Lệnh full prepare:

```bash
python experiment/run_pipeline.py --manifest experiment/dataset-manifest.csv --sources-root . --output-dir results/full_requests --mode prepare --require-full
```

Lệnh full generate:

```bash
python experiment/run_pipeline.py --manifest experiment/dataset-manifest.csv --sources-root . --output-dir results/full_requests --mode generate --require-full
```

Output cần có:

```text
results/full_requests/
results/full_llm_output.csv
results/full_api_log.txt
```

## 12. Bàn giao sau full run

Sau khi full run xong:

### Gửi cho Quân

```text
25 Java generated tests
results/full_llm_output.csv
results/full_api_log.txt
results/full_requests/JAVA_*/
```

Quân sẽ chạy:

- JUnit
- JaCoCo
- PIT
- Randoop

### Gửi cho Văn

```text
25 Python generated tests
results/full_llm_output.csv
results/full_api_log.txt
results/full_requests/PY_*/
```

Văn sẽ chạy:

- pytest
- coverage.py
- pytest-mutagen

## 13. Những điều Thái không được làm

- Không đổi model.
- Không đổi prompt.
- Không đổi temperature.
- Không chạy full trước khi pilot pass.
- Không xóa response lỗi.
- Không tự điền output nếu GPT trả rỗng.
- Không sửa generated test bằng tay rồi tính là GPT output.
- Không commit API key.
- Không tạo dataset mới.
- Không thêm/bớt unit ngoài manifest.

## 14. Checklist Done của Thái

### Pilot

- [ ] Clone repo mới nhất.
- [ ] Cài dependency.
- [ ] Kiểm tra API key.
- [ ] Tạo `results/pilot_manifest.csv`.
- [ ] Chạy prepare cho 10 hàm.
- [ ] Chạy generate cho 10 hàm.
- [ ] Tạo `results/pilot_llm_output.csv`.
- [ ] Tạo `results/pilot_api_log.txt`.
- [ ] Báo Nghi kiểm pilot.

### Full

- [ ] Chỉ chạy khi Nghi xác nhận pilot pass.
- [ ] Chạy prepare full 50.
- [ ] Chạy generate full 50.
- [ ] Tạo `results/full_llm_output.csv`.
- [ ] Tạo `results/full_api_log.txt`.
- [ ] Bàn giao Java output cho Quân.
- [ ] Bàn giao Python output cho Văn.

## 15. Ghi chú cho Nghi

Trước khi giao Thái, Nghi nên nói rõ:

```text
Thái chỉ chạy pilot 10 hàm trước. Không chạy full cho đến khi Nghi kiểm pilot log và output.
```

Nếu Thái chưa quen script, Nghi có thể hỗ trợ tạo sẵn `results/pilot_manifest.csv` từ `data/pilot_sample.csv`.
