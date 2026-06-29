# Final check phần Dataset của Vinh sau khi bổ sung

Ngày kiểm tra: 2026-06-29  
Người kiểm tra: Nghi/Codex  
Phạm vi: `data/`, `experiment/dataset-manifest.csv`, `data/raw/README.md`, `data/pilot_sample.csv`

## 1. Kết luận

Phần dataset của Vinh hiện đã **đạt yêu cầu cấu trúc để chuyển sang người tiếp theo là Thái chạy pilot**.

Đã bổ sung xong các điểm còn thiếu:

- Đã tạo manifest chính thức tại `experiment/dataset-manifest.csv`.
- Đã giữ bản tham chiếu tại `data/dataset-manifest.csv`.
- Đã thêm đủ 3 cột mà `experiment/run_pipeline.py` yêu cầu:
  - `repository_url`
  - `commit_sha`
  - `license`
- Đã cập nhật `data/raw/README.md` để ghi rõ manifest chính thức và bản tham chiếu.

Tuy nhiên, 3 cột provenance hiện đang để placeholder:

```text
TODO_REPOSITORY_URL
TODO_COMMIT_SHA
TODO_LICENSE
```

Các placeholder này không chặn Thái chạy pilot về mặt kỹ thuật, nhưng phải được thay bằng thông tin thật trước khi nộp final/reproducibility package.

## 2. Kết quả kiểm tra manifest

Kiểm tra cả hai file:

- `experiment/dataset-manifest.csv`
- `data/dataset-manifest.csv`

Kết quả:

```text
Tổng số dòng: 50
Python units: 25
Java units: 25
Thiếu cột bắt buộc: 0
Hash mismatch: 0
repository_url placeholder: 50
commit_sha placeholder: 50
license placeholder: 50
```

Nhận xét:

- Dataset đã đủ 50 hàm.
- Manifest đã đủ cột cho script.
- Hash của từng hàm vẫn khớp với source code hiện tại.
- Không phát hiện lỗi integrity ở line range/source hash.

## 3. Các file hiện đã đúng vị trí

| File | Trạng thái | Ghi chú |
|---|---|---|
| `experiment/dataset-manifest.csv` | Đã có | Manifest chính thức theo proposal và script |
| `data/dataset-manifest.csv` | Đã có | Bản tham chiếu trong thư mục data |
| `data/raw/README.md` | Đã cập nhật | Có ghi main manifest, reference copy, pending provenance |
| `data/pilot_sample.csv` | Đã có | 10 hàm pilot, 5 Python + 5 Java |

## 4. Thông tin cần bạn/nhóm cung cấp

Để thay placeholder trong manifest, cần 3 thông tin sau:

### 4.1. `repository_url`

Cần URL GitHub repo chính thức của nhóm.

Ví dụ format:

```text
https://github.com/<owner>/<repo>
```

Nếu repo chưa push lên GitHub, tạm thời giữ `TODO_REPOSITORY_URL`, nhưng trước khi nộp phải cập nhật.

### 4.2. `commit_sha`

Cần commit SHA chứa đúng phiên bản dataset đã freeze.

Ví dụ format:

```text
abc123def456...
```

Nếu hiện thư mục chưa phải git repo hoặc chưa commit, cần commit sau khi dataset ổn định rồi lấy SHA thật.

### 4.3. `license`

Cần license áp dụng cho dataset/source trong repo.

Một số giá trị có thể dùng nếu đúng với nhóm:

```text
MIT
Apache-2.0
GPL-3.0
Group-curated academic dataset
Course project internal use
```

Không nên tự ghi license nếu nhóm chưa thống nhất.

## 5. Quyết định handoff

### Được chuyển cho Thái chạy pilot.

Điều kiện khi chuyển:

- Thái chỉ chạy pilot trước, dùng `data/pilot_sample.csv`.
- Chưa chạy full 50 hàm nếu pilot chưa được Nghi kiểm.
- Thái phải lưu log đầy đủ vào `results/pilot_api_log.txt`.
- Thái phải lưu output vào `results/pilot_llm_output.csv`.

Thứ tự tiếp theo:

```text
Vinh dataset pass cấu trúc
        ↓
Thái chạy pilot 10 hàm
        ↓
Nghi kiểm pilot output/log
        ↓
Nếu pilot ổn, Thái chạy full 50 hàm
        ↓
Quân nhận Java output
        ↓
Văn nhận Python output
```

## 6. Việc còn lại của Vinh

Vinh không còn blocker kỹ thuật cho pilot. Việc còn lại là bổ sung provenance thật trước khi final:

- [ ] Thay `TODO_REPOSITORY_URL` bằng URL repo thật.
- [ ] Thay `TODO_COMMIT_SHA` bằng commit SHA thật sau khi freeze.
- [ ] Thay `TODO_LICENSE` bằng license/dataset usage thật.
- [ ] Nếu có thể, chạy lại Lizard 1.23.0 để xác nhận CC và lưu log.

## 7. Việc tiếp theo của Thái

Thái bắt đầu từ:

```text
data/pilot_sample.csv
experiment/dataset-manifest.csv
experiment/output_pipeline/
```

Thái cần tạo:

```text
results/pilot_llm_output.csv
results/pilot_api_log.txt
```

Sau khi pilot pass mới tạo:

```text
results/full_llm_output.csv
results/full_api_log.txt
```

## 8. Lưu ý quan trọng

Không được thay đổi source code trong:

```text
experiment/input_code/python_dataset/python_functions.py
experiment/input_code/java_dataset/JavaAlgorithms.java
```

Nếu thay đổi source sau khi manifest đã freeze, toàn bộ `source_sha256` sẽ mất hiệu lực và phải freeze lại dataset.
