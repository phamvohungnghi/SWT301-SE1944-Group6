# Nhận xét phần Dataset của Vinh cho RBL-4

Ngày kiểm tra: 2026-06-29  
Người kiểm tra: Nghi/Codex  
Phạm vi kiểm tra: `data/`, `experiment/input_code/`, yêu cầu trong `RBL-4.docx`, `RBL/RBL-4.md`, `team-synthesis/proposal.md`, và script `experiment/run_pipeline.py`.

## 1. Kết luận nhanh

Phần Vinh làm **đã đúng phần lớn yêu cầu dataset**:

- Đã có manifest 50 hàm.
- Đã đủ 25 Python + 25 Java.
- Đã có `data/raw/README.md`.
- Đã có `data/pilot_sample.csv`.
- Pilot sample đúng 10 hàm, gồm 5 Python + 5 Java.
- `unit_id` không bị trùng.
- Tất cả CC nằm trong khoảng 5-15.
- Tất cả dòng source trong manifest có hash SHA-256 và hash đang khớp với source code hiện tại.

Tuy nhiên, **chưa nên chuyển ngay cho Thái chạy API full**, vì còn 2 điểm cần sửa trước:

1. Manifest đang nằm ở `data/dataset-manifest.csv`, nhưng proposal và `experiment/run_pipeline.py` đang kỳ vọng `experiment/dataset-manifest.csv`.
2. Manifest hiện thiếu 3 cột mà `experiment/run_pipeline.py` yêu cầu: `repository_url`, `commit_sha`, `license`.

Sau khi Vinh sửa 2 điểm trên, có thể chuyển sang bước tiếp theo cho Thái chạy pilot.

## 2. Các file Vinh đã tạo

| File | Trạng thái | Nhận xét |
|---|---|---|
| `data/dataset-manifest.csv` | Đã có | Nội dung tốt, đủ 50 dòng, nhưng sai vị trí so với proposal/script |
| `data/raw/README.md` | Đã có | Mô tả dataset, freeze date, lead/reviewer, CC, pilot/full phase |
| `data/pilot_sample.csv` | Đã có | Đúng 10 dòng, 5 Python + 5 Java, có seed `20260628` |
| `experiment/dataset-manifest.csv` | Chưa có | Đây là blocker vì proposal/script dùng đường dẫn này |
| `notes.md` | Chưa có | Không phải riêng Vinh, nhưng Nghi cần tạo để ghi freeze/pilot decision |

## 3. Kiểm tra chi tiết `data/dataset-manifest.csv`

### 3.1. Số lượng dòng

Kết quả kiểm tra:

```text
Tổng số unit: 50
Python: 25
Java: 25
Duplicate unit_id: 0
Missing hash: 0
Missing start_line/end_line: 0
CC ngoài range 5-15: 0
Hash mismatch với source hiện tại: 0
```

Nhận xét: đạt yêu cầu về số lượng và tính toàn vẹn source.

### 3.2. Các cột hiện có

Manifest hiện có các cột:

```csv
unit_id,language,framework,relative_path,start_line,end_line,symbol,cc_lizard_1_23_0,isolation_status,source_sha256,reviewer_1,reviewer_2,notes
```

Các cột này đủ cho việc review dataset thủ công. Nhưng chưa đủ cho script hiện tại.

### 3.3. Các cột còn thiếu theo `experiment/run_pipeline.py`

Trong `experiment/run_pipeline.py`, biến `REQUIRED_COLUMNS` yêu cầu thêm:

```text
repository_url
commit_sha
license
```

Do đó nếu Thái chạy script với manifest hiện tại, script sẽ báo lỗi thiếu cột.

Vinh cần bổ sung 3 cột này vào manifest:

| Cột cần thêm | Nội dung đề xuất |
|---|---|
| `repository_url` | Nếu dataset do nhóm tự xây dựng trong repo này, ghi URL repo GitHub của nhóm. Nếu chưa có URL, ghi `local_group_dataset` tạm thời và Nghi cập nhật sau |
| `commit_sha` | Commit chứa source dataset. Nếu repo hiện chưa có Git commit, ghi `pending_git_commit` tạm thời, nhưng trước khi nộp phải thay bằng commit thật |
| `license` | Nếu dataset nhóm tự xây dựng, ghi `group-curated` hoặc license của repo nhóm. Nếu lấy từ nguồn ngoài thì phải ghi license nguồn ngoài |

## 4. Vấn đề vị trí file manifest

Proposal mục Dataset ghi artifact freeze là:

```text
experiment/dataset-manifest.csv
```

Script `experiment/run_pipeline.py` cũng đặt mặc định:

```text
experiment/dataset-manifest.csv
```

Nhưng Vinh đang tạo:

```text
data/dataset-manifest.csv
```

Đây là điểm cần sửa trước khi bàn giao.

### Cách sửa đề xuất

Chọn một trong hai cách:

#### Cách khuyến nghị

Di chuyển/copy manifest sang đúng vị trí:

```text
experiment/dataset-manifest.csv
```

Sau đó có thể giữ `data/dataset-manifest.csv` như bản tham chiếu, nhưng bản chính thức phải là `experiment/dataset-manifest.csv`.

#### Cách khác

Sửa script để dùng `data/dataset-manifest.csv`. Cách này không khuyến nghị vì proposal đã ghi artifact chính là `experiment/dataset-manifest.csv`.

## 5. Kiểm tra `data/raw/README.md`

### Phần đã đạt

README đã có:

- Tổng số 50 units.
- 25 Java + 25 Python.
- CC 5-15.
- Lizard 1.23.0.
- Freeze date: 2026-06-28.
- Dataset Lead: Vinh.
- Reviewer: Nghi.
- Mô tả pilot phase và full phase.
- Mô tả metric: JaCoCo, Coverage.py, PIT, pytest-mutagen, Randoop.

### Phần nên bổ sung

README đang ghi:

```text
All function hashes are documented in the main manifest (`experiment/dataset-manifest.csv`)
```

Nhưng file hiện tại lại nằm ở:

```text
data/dataset-manifest.csv
```

Cần sửa cho khớp. Nếu làm theo cách khuyến nghị ở trên, hãy copy manifest sang `experiment/dataset-manifest.csv` và giữ README như hiện tại.

Ngoài ra nên bổ sung rõ hơn:

- Dataset là tự curated trong nhóm hay lấy từ repo ngoài.
- License cụ thể là gì.
- Nếu có GitHub repo, ghi URL repo.
- Nếu chưa có commit SHA, ghi rõ sẽ cập nhật sau khi push GitHub.

## 6. Kiểm tra `data/pilot_sample.csv`

Kết quả kiểm tra:

```text
Tổng pilot rows: 10
Python: 5
Java: 5
Seed: 20260628
Tất cả unit_id đều tồn tại trong manifest
Không thấy lệch language/symbol/CC/path so với manifest
```

Nhận xét: đạt yêu cầu pilot 10-20% dataset. Với 50 hàm, 10 hàm là đúng 20%.

Pilot sample hiện gồm:

- Python:
  - `PY_015_longest_palindrome_substring`
  - `PY_002_binary_search`
  - `PY_012_check_sudoku_board`
  - `PY_003_is_valid_email`
  - `PY_017_levenshtein_distance`
- Java:
  - `JAVA_015_longestPalindromeSubstring`
  - `JAVA_002_binarySearch`
  - `JAVA_012_checkSudokuBoard`
  - `JAVA_003_isValidEmail`
  - `JAVA_017_levenshteinDistance`

Nhận xét thêm: pilot sample đang chọn theo cặp đối xứng Java/Python, đây là tốt vì giúp debug cùng một bài toán ở hai ngôn ngữ.

## 7. Điểm chưa kiểm tra được

Máy hiện tại chưa có package `lizard`, nên chưa thể chạy lại Lizard để xác nhận độc lập CC bằng tool. Tuy nhiên:

- CC trong manifest đều nằm trong range 5-15.
- Hash source khớp với line range hiện tại.
- README ghi dùng Lizard 1.23.0.

Trước khi chuyển full experiment, nên có một lần chạy lại Lizard trong môi trường đã cài dependency để xác nhận CC.

## 8. Quyết định: đã chuyển sang người tiếp theo được chưa?

### Chưa nên chuyển cho Thái chạy full API ngay.

Lý do:

- Thiếu `experiment/dataset-manifest.csv`.
- Manifest thiếu `repository_url`, `commit_sha`, `license`, nên `experiment/run_pipeline.py` sẽ không chạy được với manifest hiện tại.

### Có thể chuyển sang Thái sau khi Vinh sửa 2 việc sau:

1. Tạo/copy manifest chính thức tại:

```text
experiment/dataset-manifest.csv
```

2. Bổ sung 3 cột vào manifest:

```text
repository_url,commit_sha,license
```

Sau khi sửa xong, Nghi kiểm lại nhanh. Nếu pass, Thái được phép chạy **pilot trước**, chưa chạy full ngay.

## 9. Checklist sửa cho Vinh

- [ ] Copy hoặc di chuyển `data/dataset-manifest.csv` sang `experiment/dataset-manifest.csv`.
- [ ] Thêm cột `repository_url`.
- [ ] Thêm cột `commit_sha`.
- [ ] Thêm cột `license`.
- [ ] Đảm bảo `data/raw/README.md` trỏ đúng tới manifest chính thức.
- [ ] Cài/chạy Lizard 1 lần để xác nhận CC nếu môi trường cho phép.
- [ ] Báo Nghi kiểm lại.

## 10. Sau khi Vinh sửa xong thì ai làm tiếp?

Người tiếp theo là **Thái - LLM/API Lead**.

Thứ tự sau khi Vinh pass:

```text
Vinh sửa manifest
        ↓
Nghi kiểm lại manifest
        ↓
Thái chạy pilot 10 hàm từ data/pilot_sample.csv
        ↓
Nghi xem pilot có lỗi format/API không
        ↓
Thái mới chạy full 50 hàm
```

Thai cần tạo:

```text
results/pilot_llm_output.csv
results/pilot_api_log.txt
```

Nếu pilot ổn, Thai tiếp tục tạo:

```text
results/full_llm_output.csv
results/full_api_log.txt
```

Sau đó mới bàn giao Java output cho Quân và Python output cho Văn.
