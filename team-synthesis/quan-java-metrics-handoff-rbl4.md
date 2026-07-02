# Handoff cho Quân - Java Metrics, Randoop và Statistics RBL-4

Ngày chuẩn bị: 2026-07-02  
Người nhận việc: Quân  
Vai trò: Java Metrics + Randoop + Statistics Lead  
Đầu vào từ Thái: đã có 25 Java generated tests trong `results/full_requests/JAVA_*/`

## 1. Mục tiêu của Quân

Quân phụ trách đánh giá phần Java của RBL-4:

- Kiểm tra generated tests Java có compile/run được không.
- Đo branch coverage bằng JaCoCo.
- Đo mutation score bằng PIT.
- Chạy baseline Randoop cho 25 Java methods.
- Chuẩn hóa kết quả Java thành CSV.
- Sau khi nhận Python metrics từ Văn, chạy thống kê tổng hợp cho RQ1/RQ2/RQ3.

Quan trọng: bước đầu tiên của Quân là **executability/preflight**, chưa phải coverage/mutation ngay.

## 2. File Quân cần nhận

Quân cần pull repo mới nhất:

```text
https://github.com/phamvohungnghi/SWT301-SE1944-Group6
```

Các file/thư mục cần dùng:

```text
experiment/dataset-manifest.csv
experiment/input_code/java_dataset/JavaAlgorithms.java
results/full_llm_output.csv
results/full_api_log.txt
results/full_requests/JAVA_*/
team-synthesis/thai-llm-output-review-rbl4.md
```

Ý nghĩa:

| File/thư mục | Dùng để làm gì |
|---|---|
| `JavaAlgorithms.java` | Production code Java thật |
| `results/full_requests/JAVA_*/generated_test.java` | Test Java do LLM sinh |
| `results/full_llm_output.csv` | Danh sách output/status từ Thái |
| `results/full_api_log.txt` | Log generation |
| `dataset-manifest.csv` | Mapping `unit_id`, method, CC, hash |

## 3. Cảnh báo quan trọng trước khi làm

Khi kiểm tra output của Thái, đã phát hiện rủi ro compile rất cao:

```text
Java generated tests: 25
Tests gọi JavaAlgorithms: 0
Tests gọi JAVA_* unit id: 25
```

Ví dụ test đang gọi:

```java
JAVA_001_bubbleSort.bubbleSort(input)
JAVA_002_binarySearch.binarySearch(arr, target)
```

Trong khi production class thật là:

```java
JavaAlgorithms
```

Do đó nhiều hoặc toàn bộ Java tests có thể compile fail.

Quân **không được sửa generated test rồi tính là first-attempt GPT output**. Nếu fail compile, ghi đúng là `COMPILE_ERROR` hoặc `NON_EXECUTABLE`.

## 4. Thứ tự công việc của Quân

```text
1. Tạo Java fixture
2. Copy production code vào fixture
3. Copy raw generated tests vào fixture
4. Chạy compile/JUnit preflight
5. Ghi results/java_executability.csv
6. Chỉ với test executable: chạy JaCoCo
7. Chạy PIT mutation
8. Chạy Randoop baseline
9. Ghi results/java_coverage.csv
10. Ghi results/java_mutation.csv
11. Ghi results/randoop_java_results.csv
12. Sau khi nhận Python metrics từ Văn, chạy full_analysis.ipynb và summary.csv
```

## 5. Bước 1 - Tạo Java fixture

Quân tạo một thư mục làm việc riêng, ví dụ:

```text
evaluation/java_fixture/
```

Cấu trúc đề xuất:

```text
evaluation/java_fixture/
├─ pom.xml
├─ src/main/java/JavaAlgorithms.java
└─ src/test/java/
   ├─ JAVA_001_bubbleSortTest.java
   ├─ JAVA_002_binarySearchTest.java
   └─ ...
```

Toolchain theo proposal:

```text
JDK 17
JUnit 5.11.4
JaCoCo 0.8.13
PIT 1.19.1
Randoop 4.3.4
```

Nếu chưa có Maven, báo Nghi trước.

## 6. Bước 2 - Copy raw generated tests

Nguồn:

```text
results/full_requests/JAVA_*/generated_test.java
```

Đích:

```text
evaluation/java_fixture/src/test/java/
```

Quy tắc:

- Không sửa nội dung raw test trước primary executability.
- Có thể đổi tên file test để Maven/JUnit nhận diện, nhưng phải ghi lại trong notes.
- Nếu phải wrap fixture để test compile, phải phân biệt rõ:
  - `raw_executability`
  - `normalized_fixture_executability`

Primary result nên dùng raw generated test.

## 7. Bước 3 - Chạy executability/preflight

Mục tiêu là trả lời:

```text
25 Java generated tests có compile/run được không?
```

Output bắt buộc:

```text
results/java_executability.csv
```

Format đề xuất:

```csv
unit_id,symbol,cc,status,error_type,error_message,generated_test_path,notes
```

Giá trị `status`:

| Status | Ý nghĩa |
|---|---|
| `EXECUTABLE` | Test compile và chạy được |
| `COMPILE_ERROR` | Không compile được |
| `TEST_RUNTIME_ERROR` | Compile được nhưng chạy lỗi runtime |
| `EMPTY_TEST` | File test rỗng |
| `MISSING_TEST` | Không có file generated test |

Ví dụ:

```csv
JAVA_001_bubbleSort,bubbleSort,6,COMPILE_ERROR,CANNOT_FIND_SYMBOL,"cannot find symbol JAVA_001_bubbleSort",results/full_requests/JAVA_001_bubbleSort/generated_test.java,raw generated test calls unit_id as class
```

## 8. Bước 4 - Chạy JaCoCo

Chỉ chạy JaCoCo sau khi có executability.

Output:

```text
results/java_coverage.csv
```

Format đề xuất:

```csv
unit_id,symbol,cc,executability,total_branches,covered_branches,branch_coverage,status,notes
```

Quy tắc:

- Nếu test không executable, `branch_coverage` để `NA` trong primary complete-case.
- Có thể tạo thêm sensitivity analysis bằng cách tính non-executable là 0, nhưng phải ghi rõ.
- Không xóa unit fail khỏi denominator khi báo executability.

## 9. Bước 5 - Chạy PIT Mutation Testing

Output:

```text
results/java_mutation.csv
```

Format đề xuất:

```csv
unit_id,symbol,cc,executability,mutants_generated,mutants_killed,mutants_invalid,mutation_score,status,notes
```

Quy tắc:

- Nếu non-executable, mutation_score = `NA` ở primary complete-case.
- Timeout tính là survived nếu theo primary analysis.
- Không loại equivalent mutant bằng tay sau khi thấy kết quả.

## 10. Bước 6 - Chạy Randoop baseline

Randoop chỉ áp dụng cho Java.

Config theo proposal:

```text
Randoop 4.3.4
randomseed = 20260621
time limit = 60 seconds / unit
JDK 17
same production source
```

Output:

```text
results/randoop_java_results.csv
```

Format đề xuất:

```csv
unit_id,symbol,randoop_status,randoop_branch_coverage,randoop_mutation_score,notes
```

Không sửa Randoop generated tests bằng tay.

## 11. Bước 7 - Thống kê tổng hợp

Chỉ làm sau khi Văn gửi:

```text
results/python_executability.csv
results/python_coverage.csv
results/python_mutation.csv
```

Quân tạo:

```text
results/full_analysis.ipynb
results/summary.csv
```

RQ cần trả lời:

### RQ1 Java/Python

Branch coverage median có vượt 75% không?

Theo proposal mới:

```text
Exact sign test, right-tailed
Holm correction cho Java/Python
```

### RQ2 Java

GPT-4o mutation score có cao hơn Randoop không?

```text
Paired one-sided Wilcoxon signed-rank
Sensitivity: sign test nếu nhiều ties/zero
```

### RQ3

CC có tương quan nghịch với branch coverage/mutation score không?

```text
Spearman one-sided
Holm correction cho 4 tests
```

## 12. Report subsection Quân phải viết

Quân tự viết các phần sau:

- Java evaluation setup.
- Java executability result.
- Java branch coverage result.
- Java mutation score result.
- Randoop baseline setup/result.
- RQ2 result.
- Integrated statistical result sau khi nhận Python metrics.

Không để người khác viết thay phần chuyên môn Java/Randoop.

## 13. Điều Quân không được làm

- Không sửa generated tests rồi tính là first-attempt output.
- Không xóa unit fail khỏi log.
- Không đổi threshold.
- Không đổi statistical test sau khi thấy data.
- Không chỉ báo coverage trên subset pass mà không báo executability denominator.
- Không tự thêm RQ mới.
- Không thay Randoop seed/time budget mà không ghi amendment.

## 14. Checklist Done của Quân

### Java preflight

- [ ] Tạo Java fixture.
- [ ] Copy `JavaAlgorithms.java`.
- [ ] Copy 25 Java generated tests.
- [ ] Chạy compile/JUnit preflight.
- [ ] Tạo `results/java_executability.csv`.

### Java metrics

- [ ] Tạo `results/java_coverage.csv`.
- [ ] Tạo `results/java_mutation.csv`.
- [ ] Tạo raw logs cho JUnit/JaCoCo/PIT.

### Randoop

- [ ] Chạy Randoop 25 Java units.
- [ ] Tạo `results/randoop_java_results.csv`.
- [ ] Lưu raw Randoop output/log.

### Statistics

- [ ] Nhận Python metrics từ Văn.
- [ ] Tạo `results/full_analysis.ipynb`.
- [ ] Tạo `results/summary.csv`.
- [ ] Viết kết luận RQ1/RQ2/RQ3.

## 15. Handoff sau khi Quân xong

Quân gửi lại cho Nghi:

```text
results/java_executability.csv
results/java_coverage.csv
results/java_mutation.csv
results/randoop_java_results.csv
results/full_analysis.ipynb
results/summary.csv
raw logs
```

Nếu compile fail hàng loạt, vẫn gửi kết quả fail. Đây là dữ liệu hợp lệ về executability của first-attempt LLM output.
