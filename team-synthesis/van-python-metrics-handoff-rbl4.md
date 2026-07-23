# Handoff cho Văn - Python Metrics và Figures RBL-4

Ngày chuẩn bị: 2026-07-02  
Người nhận việc: Văn  
Vai trò: Python Metrics + Visualization Lead  
Đầu vào từ Thái: đã có 25 Python generated tests trong `results/full_requests/PY_*/`

## 1. Mục tiêu của Văn

Văn phụ trách đánh giá phần Python của RBL-4:

- Kiểm tra generated tests Python có import/run được không.
- Đo branch coverage bằng coverage.py.
- Đo mutation score bằng pytest-mutagen.
- Chuẩn hóa kết quả Python thành CSV.
- Tạo figures cho report.
- Bàn giao Python metrics cho Quân để chạy thống kê tổng hợp.

Quan trọng: bước đầu tiên của Văn là **executability/preflight**, chưa phải coverage/mutation ngay.

## 2. File Văn cần nhận

Văn cần pull repo mới nhất:

```text
https://github.com/phamvohungnghi/SWT301-SE1944-Group6
```

Các file/thư mục cần dùng:

```text
experiment/dataset-manifest.csv
experiment/input_code/python_dataset/python_functions.py
results/full_llm_output.csv
results/full_api_log.txt
results/full_requests/PY_*/
team-synthesis/thai-llm-output-review-rbl4.md
```

Ý nghĩa:

| File/thư mục | Dùng để làm gì |
|---|---|
| `python_functions.py` | Production code Python thật |
| `results/full_requests/PY_*/generated_test.py` | Test Python do LLM sinh |
| `results/full_llm_output.csv` | Danh sách output/status từ Thái |
| `results/full_api_log.txt` | Log generation |
| `dataset-manifest.csv` | Mapping `unit_id`, function, CC, hash |

## 3. Cảnh báo quan trọng trước khi làm

Khi kiểm tra output của Thái, đã phát hiện rủi ro import rất cao:

```text
Python generated tests: 25
Tests import python_functions: 0
```

Ví dụ test đang gọi trực tiếp:

```python
def test_bubble_sort_empty_list():
    assert bubble_sort([]) == []
```

Nhưng test không có:

```python
from python_functions import bubble_sort
```

Do đó nhiều hoặc toàn bộ Python tests có thể fail với `NameError` nếu fixture không tự inject/import function.

Văn **không được sửa generated test rồi tính là first-attempt GPT output**. Nếu fail import/name, ghi đúng là `IMPORT_ERROR`, `NAME_ERROR`, hoặc `NON_EXECUTABLE`.

## 4. Thứ tự công việc của Văn

```text
1. Tạo Python fixture
2. Copy production code vào fixture
3. Copy raw generated tests vào fixture
4. Chạy pytest/import preflight
5. Ghi results/python_executability.csv
6. Chỉ với test executable: chạy coverage.py
7. Chạy pytest-mutagen
8. Ghi results/python_coverage.csv
9. Ghi results/python_mutation.csv
10. Tạo figures/
11. Bàn giao Python metrics cho Quân
```

## 5. Bước 1 - Tạo Python fixture

Văn tạo một thư mục làm việc riêng, ví dụ:

```text
evaluation/python_fixture/
```

Cấu trúc đề xuất:

```text
evaluation/python_fixture/
├─ python_functions.py
└─ tests/
   ├─ test_PY_001_bubble_sort.py
   ├─ test_PY_002_binary_search.py
   └─ ...
```

Toolchain theo proposal:

```text
Python 3.14.6
pytest 9.1.1
coverage.py 7.14.2
pytest-mutagen 1.3
pandas 3.0.3
scipy 1.18.0
```

Cài dependency:

```bash
pip install -r experiment/requirements-experiment.txt
```

Nếu dependency lỗi, báo Nghi trước.

## 6. Bước 2 - Copy raw generated tests

Nguồn:

```text
results/full_requests/PY_*/generated_test.py
```

Đích:

```text
evaluation/python_fixture/tests/
```

Quy tắc:

- Không sửa nội dung raw test trước primary executability.
- Có thể đổi tên file thành `test_<unit_id>.py` để pytest nhận diện, nhưng phải ghi lại trong notes.
- Nếu tạo `conftest.py` để inject/import function, phải phân biệt rõ:
  - `raw_executability`
  - `normalized_fixture_executability`

Primary result nên dùng raw generated test.

## 7. Bước 3 - Chạy executability/preflight

Mục tiêu là trả lời:

```text
25 Python generated tests có import/run được không?
```

Output bắt buộc:

```text
results/python_executability.csv
```

Format đề xuất:

```csv
unit_id,symbol,cc,status,error_type,error_message,generated_test_path,notes
```

Giá trị `status`:

| Status | Ý nghĩa |
|---|---|
| `EXECUTABLE` | Test import và chạy được |
| `IMPORT_ERROR` | Không import được module/function |
| `NAME_ERROR` | Test gọi function chưa được define |
| `TEST_RUNTIME_ERROR` | Import được nhưng chạy lỗi runtime |
| `EMPTY_TEST` | File test rỗng |
| `MISSING_TEST` | Không có file generated test |

Ví dụ:

```csv
PY_001_bubble_sort,bubble_sort,6,NAME_ERROR,NAME_ERROR,"name 'bubble_sort' is not defined",results/full_requests/PY_001_bubble_sort/generated_test.py,raw generated test does not import target function
```

## 8. Bước 4 - Chạy coverage.py

Chỉ chạy coverage sau khi có executability.

Output:

```text
results/python_coverage.csv
```

Format đề xuất:

```csv
unit_id,symbol,cc,executability,total_branches,covered_branches,branch_coverage,status,notes
```

Quy tắc:

- Nếu test không executable, `branch_coverage` để `NA` trong primary complete-case.
- Có thể tạo thêm sensitivity analysis bằng cách tính non-executable là 0, nhưng phải ghi rõ.
- Không xóa unit fail khỏi denominator khi báo executability.

## 9. Bước 5 - Chạy pytest-mutagen

Output:

```text
results/python_mutation.csv
```

Format đề xuất:

```csv
unit_id,symbol,cc,executability,mutants_generated,mutants_killed,mutants_invalid,mutation_score,status,notes
```

Quy tắc:

- Nếu non-executable, mutation_score = `NA` ở primary complete-case.
- Timeout tính là survived nếu theo primary analysis.
- Không loại equivalent mutant bằng tay sau khi thấy kết quả.

## 10. Bước 6 - Tạo figures

Văn tạo thư mục:

```text
figures/
```

Figures tối thiểu:

```text
figures/fig1_distribution.png
figures/fig2_comparison.png
```

Gợi ý:

| Figure | Nội dung |
|---|---|
| `fig1_distribution.png` | Distribution/boxplot/violin branch coverage và mutation score theo language |
| `fig2_comparison.png` | GPT-4o vs Randoop mutation score trên Java, dùng data Quân gửi |

Yêu cầu:

- PNG tối thiểu 300 DPI.
- Có title.
- Có axis labels.
- Có N annotation.
- Data phải trace được về CSV trong `results/`.

Nếu Quân chưa có Randoop result, Văn có thể tạo trước `fig1_distribution.png`, sau đó bổ sung `fig2_comparison.png`.

## 11. Report subsection Văn phải viết

Văn tự viết các phần sau:

- Python evaluation setup.
- Python executability result.
- Python branch coverage result.
- Python mutation score result.
- Figures and visualization explanation.
- Python-specific validity observations.

Không để người khác viết thay phần chuyên môn Python/figures.

## 12. Điều Văn không được làm

- Không sửa generated tests rồi tính là first-attempt output.
- Không xóa unit fail khỏi log.
- Không đổi threshold.
- Không đổi metric definition sau khi thấy data.
- Không chỉ báo coverage trên subset pass mà không báo executability denominator.
- Không tự thêm RQ mới.
- Không tự sửa production code để test pass.

## 13. Checklist Done của Văn

### Python preflight

- [x] Tạo Python fixture.
- [x] Copy `python_functions.py`.
- [x] Copy 25 Python generated tests.
- [x] Chạy pytest/import preflight.
- [x] Tạo `results/python_executability.csv`.

### Python metrics

- [x] Tạo `results/python_coverage.csv`.
- [x] Tạo `results/python_mutation.csv`.
- [x] Lưu raw logs cho pytest/coverage.py/pytest-mutagen.

### Figures

- [x] Tạo `figures/fig1_distribution.png`.
- [x] Tạo `figures/fig2_comparison.png` khi có Java/Randoop data.
- [x] Đảm bảo figures trace được về result CSV.

### Handoff

- [x] Gửi Python metrics cho Quân.
- [x] Gửi figures cho Nghi.
- [x] Viết Python subsection cho report.

## 14. Handoff sau khi Văn xong

Văn gửi lại cho Nghi và Quân:

```text
results/python_executability.csv
results/python_coverage.csv
results/python_mutation.csv
figures/
raw logs
```

Nếu import/name fail hàng loạt, vẫn gửi kết quả fail. Đây là dữ liệu hợp lệ về executability của first-attempt LLM output.
