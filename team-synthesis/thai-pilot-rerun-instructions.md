# Hướng dẫn chạy lại Pilot — Gửi Thái (LLM Lead)

Ngày cập nhật: 2026-07-15  
Người gửi: Nghi  
Lý do cập nhật: Script đã được sửa lại để fix lỗi context và API. Thái cần pull repo và chạy lại từ đầu.

---

## Tóm tắt lý do phải chạy lại

Script cũ có 3 lỗi khiến test sinh ra bị sai:

1. **Lỗi API call:** Dùng sai method của OpenAI SDK → crash khi gọi API.
2. **Lỗi context:** LLM không biết hàm Java nằm trong class `JavaAlgorithms` → tự bịa tên class → Quân không compile được.
3. **Lỗi requirements:** Package version sai → cài không được.

Tất cả đã được sửa. Thái chỉ cần pull và chạy lại theo hướng dẫn dưới đây.

---

## Bước 0 — Pull repo mới nhất

```bash
git pull
```

Kiểm tra script đã đúng chưa:

```bash
python experiment/run_pipeline.py --help
```

Nếu hiện usage text → OK. Nếu lỗi import → cài lại dependency ở Bước 1.

---

## Bước 1 — Cài lại dependency

```powershell
# Kích hoạt venv nếu chưa kích hoạt
.\.venv\Scripts\Activate.ps1

# Cài lại (đã sửa version)
pip install -r experiment/requirements-experiment.txt
```

Nếu cài xong thành công, tiếp tục Bước 2.

---

## Bước 2 — Đặt API key

Chọn 1 trong các provider dưới đây. Khuyến nghị dùng **GitHub Models** (miễn phí, không cần thẻ):

### Option A: GitHub Models (MIỄN PHÍ — khuyến nghị nếu chưa có OpenAI key)

Vào https://github.com/settings/tokens → Generate new token (classic) → tick `repo` scope.

```powershell
$env:GITHUB_TOKEN="ghp_xxxxxxxxxxxxxxxxxxxx"
```

### Option B: OpenAI (tốn tiền ~$1.14 USD cho toàn bộ)

```powershell
$env:OPENAI_API_KEY="sk-xxxxxxxxxxxxxxxxxxxx"
```

### Option C: Gemini (miễn phí)

Vào https://aistudio.google.com/ → Get API key.

```powershell
$env:GEMINI_API_KEY="AIzaxxxxxxxxxxxxxxxxx"
```

**Không commit key lên GitHub. Không chụp ảnh màn hình có key.**

---

## Bước 3 — Tạo pilot manifest

```bash
python experiment/make_pilot_manifest.py
```

Output: `results/pilot_manifest.csv` (10 hàm).

---

## Bước 4 — Chạy prepare (KHÔNG gọi API)

```bash
python experiment/run_pipeline.py \
  --manifest results/pilot_manifest.csv \
  --sources-root . \
  --output-dir results/pilot_requests \
  --mode prepare
```

Nếu 10 dòng đều in `OK (prepare)` → tiếp Bước 5.  
Nếu có lỗi → chụp màn hình và gửi cho Nghi, **dừng lại, không tự sửa**.

---

## Bước 5 — Chạy generate (GỌI API THẬT)

```bash
python experiment/run_pipeline.py \
  --manifest results/pilot_manifest.csv \
  --sources-root . \
  --output-dir results/pilot_requests \
  --mode generate
```

Script sẽ tự nhận diện provider từ env variable đã đặt ở Bước 2.

Nếu muốn chỉ định rõ:

```bash
# GitHub Models
python experiment/run_pipeline.py --manifest results/pilot_manifest.csv --sources-root . --output-dir results/pilot_requests --mode generate --provider github

# OpenAI
python experiment/run_pipeline.py --manifest results/pilot_manifest.csv --sources-root . --output-dir results/pilot_requests --mode generate --provider openai

# Gemini
python experiment/run_pipeline.py --manifest results/pilot_manifest.csv --sources-root . --output-dir results/pilot_requests --mode generate --provider gemini
```

---

## Bước 6 — Kiểm tra output

Sau khi chạy xong, `results/pilot_requests/` phải có 10 thư mục, mỗi thư mục:

```
results/pilot_requests/
├── PY_002_binary_search/
│   ├── request.json
│   ├── prompt.sha256
│   ├── response.json
│   ├── generated_test.py     ← file test Python
│   └── metadata.json
├── JAVA_002_binarySearch/
│   ├── request.json
│   ├── prompt.sha256
│   ├── response.json
│   ├── generated_test.java   ← file test Java
│   └── metadata.json
...
```

**Kiểm tra nhanh file Java** — mở `generated_test.java` xem có dòng:

```java
import static org.junit.jupiter.api.Assertions.*;
// và gọi: JavaAlgorithms.bubbleSort(...)
```

**Kiểm tra nhanh file Python** — mở `generated_test.py` xem có dòng:

```python
from python_functions import binary_search
```

Nếu Java gọi đúng `JavaAlgorithms.xxx` và Python import đúng `from python_functions import xxx` → pilot **PASS**.

---

## Bước 7 — Báo lại Nghi

Gửi cho Nghi:

```
Pilot đã chạy xong.
Provider: [github/openai/gemini]
Model thực tế: [tên model]
Số unit: 10
OK: ...
ERROR: ...
File output: results/pilot_requests/
```

Kèm theo: zip thư mục `results/pilot_requests/` hoặc push lên GitHub (không push key).

---

## Lưu ý quan trọng

- **Không sửa file** `experiment/dataset-manifest.csv`, `experiment/input_code/`.
- **Không sửa generated test** rồi gửi lại — kết quả phải là raw output của LLM.
- **Không chạy full 50 hàm** trước khi Nghi xác nhận pilot pass.
