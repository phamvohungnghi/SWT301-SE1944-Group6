# Phân công theo work package — RBL-3

## Nguyên tắc

- Một người sở hữu một phần công việc xuyên suốt, không chia 10 hàm/người.
- Người thực hiện phần nào tự viết report subsection của phần đó.
- Nghi chỉ merge, kiểm tra consistency và quản lý checkpoint; không viết thay nội dung chuyên môn.
- Metrics được tách Java/Python cho Quân và Văn vì hai toolchain độc lập và khối lượng lớn.
- Thái (LLM Runner) không tự xác minh statistical result.

## Phân công chính

| Thành viên | Work package | Scope chạy | Deliverable kỹ thuật | Phần báo cáo tự viết |
|---|---|---|---|---|
| **Nghi** | WP0 — Governance & Reproducibility | Toàn bộ pipeline | checkpoint log, amendment log, traceability audit, final merge | Timeline & Resources; Reproducibility/Amendment; integration note |
| **Vinh** | WP1 — Dataset & Preflight | Cả 50 hàm | manifest, provenance, CC report, fixtures, input checksum | Dataset; Sampling; Data quality/provenance |
| **Thái** | WP2 — LLM Generation | Cả 50 hàm | 50 prompts, raw responses/failure logs, token/time/cost log | Model/API; Prompt; Generation procedure; API cost |
| **Quân** | WP3 — Java Evaluation & Statistics | 25 Java + integrated statistics | JUnit/JaCoCo/PIT/Randoop outputs, analysis script, adjusted p/effect/CI | Java evaluation; RQ2; Statistical analysis |
| **Văn** | WP4 — Python Evaluation & Visualization | 25 Python | pytest/coverage/pytest-mutagen outputs, normalized Python results, figures | Python evaluation; RQ1-Python; figures and validity observations |

## Vì sao metrics chia hai người

Java cần JUnit + JaCoCo + PIT + Randoop; Python cần pytest + coverage.py + pytest-mutagen. Đây là hai môi trường build, failure taxonomy và raw report khác nhau. Quân và Văn chạy độc lập theo ngôn ngữ và tự viết subsection tương ứng; Quân chỉ nhận normalized Python table để chạy integrated RQ1/RQ3 statistics.

## Handoff

```text
Vinh: 50 frozen inputs
        ↓
Thái: 50 raw LLM outputs
        ├───────────────┐
        ↓               ↓
Quân: 25 Java       Văn: 25 Python
metrics + Randoop   metrics + figures
        └───────┬───────┘
                ↓
Nghi: consistency gate + merge
```

## Report ownership

| Report subsection | Author | Reviewer |
|---|---|---|
| Dataset, sampling, provenance | Vinh | Nghi |
| Model/API, prompt, generation log/cost | Thái | Nghi |
| Java metrics, Randoop, RQ2 | Quân | Nghi |
| Python metrics, figures, Python observations | Văn | Nghi |
| Integrated statistical conclusions | Quân | Văn cross-check |
| Timeline/resources/amendment/reproducibility | Nghi | Cả nhóm |

Không có “một người viết toàn bộ report”. Người khác chỉ review, không thay tác giả phần chuyên môn.

## Definition of Done

### Vinh — Dataset

- 50/50 hàm có Pair ID, source path, hash, CC và provenance.
- 25 Java + 25 Python fixtures pass preflight.
- Manifest freeze trước khi gọi model.

### Thái — LLM

- 50/50 prompt và raw response/failure log.
- Exact model/request parameters được lưu.
- Token, timestamp, cost và response ID đầy đủ.

### Quân — Java & Statistics

- 25/25 Java execution, coverage, mutation và Randoop result.
- Analysis script chạy từ normalized tables, không sửa raw data.
- Báo adjusted p, effect và CI.

### Văn — Python & Visualization

- 25/25 Python execution, coverage và mutation result.
- Figures truy ngược được về normalized results.
- Viết Python result subsection, không viết thay Java/LLM/dataset.

### Nghi — Gate

- Mỗi handoff có file count/checksum.
- Proposal–protocol–result–slide không mâu thuẫn.
- Merge các subsection nhưng giữ author ownership.
