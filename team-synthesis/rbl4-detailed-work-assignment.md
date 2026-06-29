# Phan cong cong viec chi tiet cho RBL-4 Experiment

## 1. Muc tieu cua RBL-4

RBL-4 la giai doan chay thuc nghiem that tren 50 ham da co trong project:

- 25 ham Python: `experiment/input_code/python_dataset/python_functions.py`
- 25 ham Java: `experiment/input_code/java_dataset/JavaAlgorithms.java`
- 50 prompt da tao san: `experiment/output_pipeline/`

Muc tieu cuoi cung cua giai doan nay la tao du cac artifact sau:

- `experiment/dataset-manifest.csv`
- `data/raw/README.md`
- `data/pilot_sample.csv`
- `results/pilot_llm_output.csv`
- `results/pilot_api_log.txt`
- `results/full_llm_output.csv`
- `results/full_api_log.txt`
- `results/full_analysis.ipynb`
- `results/summary.csv`
- `figures/fig1_distribution.png`
- `figures/fig2_comparison.png`
- `notes.md`

Nguyen tac bat buoc: proposal da duyet la hop dong. Khong doi RQ, metric, threshold, model, prompt hoac cach tinh sau khi da thay ket qua.

## 2. Thu tu lam viec tong the

Khong duoc lam song song tuy tien. Thu tu dung la:

```text
Vinh freeze dataset
        ↓
Thái chạy prompt/API
        ↓
Quân đo Java + Randoop
        ↓
Văn đo Python + vẽ figures
        ↓
Quân chạy thống kê tổng hợp
        ↓
Nghi kiểm tra consistency + merge report
```

Giai thich ngan:

- Neu Vinh chua xong manifest thi Thai chua duoc chay API.
- Neu Thai chua co output GPT thi Quan/Van chua the do coverage/mutation.
- Neu Quan/Van chua co bang metric thi chua duoc chay thong ke.
- Neu chua co summary/figures thi Nghi chua duoc merge final report.

## 3. Phan cong theo tung nguoi

| Thanh vien | Vai tro | Lam truoc/sau ai | Output chinh |
|---|---|---|---|
| Vinh | Dataset Lead | Lam dau tien | `experiment/dataset-manifest.csv`, `data/raw/README.md`, `data/pilot_sample.csv` |
| Thai | LLM/API Lead | Sau Vinh | `results/pilot_llm_output.csv`, `results/full_llm_output.csv`, API logs |
| Quan | Java Metrics + Statistics Lead | Sau Thai; thong ke sau Van | Java coverage/mutation/Randoop, `results/summary.csv` |
| Van | Python Metrics + Figures Lead | Sau Thai; dua metric cho Quan | Python coverage/mutation, `figures/` |
| Nghi | Project Lead + Final Integrator | Theo doi tu dau; merge cuoi cung | `notes.md`, checklist, report merge, consistency audit |

## 4. Cong viec chi tiet cua Vinh - Dataset Lead

### 4.1. Muc tieu cua Vinh

Vinh khong phai viet test, khong goi GPT, khong chay coverage. Viec cua Vinh la bien 50 ham dang co thanh mot dataset thuc nghiem da duoc dong bang va co the kiem chung.

Noi cach khac, Vinh phai tra loi duoc:

- 50 ham la nhung ham nao?
- Moi ham nam o file nao?
- Dong bat dau va dong ket thuc cua tung ham la bao nhieu?
- Cyclomatic Complexity cua tung ham la bao nhieu?
- Ham co dung dieu kien `5 <= CC <= 15` khong?
- Source hash cua tung ham la gi?
- Sau khi freeze, co ai tu y doi ham khong?

### 4.2. File Vinh phai tao

#### File 1: `experiment/dataset-manifest.csv`

Day la file quan trong nhat cua Vinh. File nay la danh sach chinh thuc cua 50 ham duoc dua vao experiment.

Cot nen co:

```csv
unit_id,language,framework,relative_path,start_line,end_line,symbol,cc_lizard_1_23_0,isolation_status,source_sha256,reviewer_1,reviewer_2,notes
```

Giai thich cac cot:

| Cot | Y nghia |
|---|---|
| `unit_id` | Ma duy nhat cua ham, vi du `PY_001_bubble_sort`, `JAVA_001_bubbleSort` |
| `language` | `python` hoac `java` |
| `framework` | Python dung `pytest`, Java dung `junit5` |
| `relative_path` | Duong dan toi file source |
| `start_line` | Dong bat dau cua ham |
| `end_line` | Dong ket thuc cua ham |
| `symbol` | Ten ham/method |
| `cc_lizard_1_23_0` | Cyclomatic Complexity do bang Lizard 1.23.0 |
| `isolation_status` | `include` neu ham duoc dua vao experiment |
| `source_sha256` | Hash SHA-256 cua source ham |
| `reviewer_1` | Nguoi review thu nhat, de xuat `Vinh` |
| `reviewer_2` | Nguoi review thu hai, de xuat `Nghi` |
| `notes` | Ghi chu neu co |

Vi du:

```csv
unit_id,language,framework,relative_path,start_line,end_line,symbol,cc_lizard_1_23_0,isolation_status,source_sha256,reviewer_1,reviewer_2,notes
PY_001_bubble_sort,python,pytest,experiment/input_code/python_dataset/python_functions.py,7,19,bubble_sort,6,include,<hash>,Vinh,Nghi,standalone function
JAVA_001_bubbleSort,java,junit5,experiment/input_code/java_dataset/JavaAlgorithms.java,11,31,bubbleSort,5,include,<hash>,Vinh,Nghi,static method
```

#### File 2: `data/raw/README.md`

File nay giai thich nguon goc dataset. Day la yeu cau trong RBL-4 muc "File moi them vao repo sau RBL-4".

Noi dung can co:

- Dataset gom 50 ham: 25 Java + 25 Python.
- File source goc nam o dau.
- Muc dich dataset: danh gia GPT-4o sinh unit test.
- Tieu chi loc: standalone, `5 <= CC <= 15`.
- Cong cu do CC: Lizard 1.23.0.
- Ngay freeze dataset.
- Ai phu trach dataset.
- License/source/provenance.
- Luu y: sau khi freeze, moi thay doi phai ghi vao amendment log.

#### File 3: `data/pilot_sample.csv`

File nay la mau pilot 10-20% cua 50 ham. Nen chon 10 ham:

- 5 Python
- 5 Java

Bat buoc chon bang random seed co dinh, khong chon ham de bang tay.

Cot nen co:

```csv
unit_id,language,symbol,cc_lizard_1_23_0,relative_path,seed
```

Seed de xuat:

```text
20260628
```

### 4.3. Checklist Done cua Vinh

- [ ] Dem du 25 Python functions.
- [ ] Dem du 25 Java static methods.
- [ ] Ghi du 50 dong trong `experiment/dataset-manifest.csv`.
- [ ] Tat ca `unit_id` khong trung nhau.
- [ ] Tat ca ham co `5 <= CC <= 15`.
- [ ] Tat ca ham co `source_sha256`.
- [ ] Tao `data/raw/README.md`.
- [ ] Tao `data/pilot_sample.csv` gom 10 ham.
- [ ] Bao cho Thai: "Dataset da freeze, co the chay pilot".

## 5. Cong viec chi tiet cua Thai - LLM/API Lead

### 5.1. Dieu kien de Thai bat dau

Thai chi duoc bat dau khi Vinh da xong:

- `experiment/dataset-manifest.csv`
- `data/raw/README.md`
- `data/pilot_sample.csv`

Neu chua co 3 file nay, Thai khong duoc chay API vi se khong chung minh duoc dataset da freeze truoc khi goi model.

### 5.2. Muc tieu cua Thai

Thai phu trach chay GPT-4o sinh test tu prompt da co san. Thai phai luu lai day du request/response/log de dam bao reproducibility.

### 5.3. Viec Thai can lam

#### Buoc 1: Kiem tra prompt

Kiem tra thu muc:

```text
experiment/output_pipeline/
```

Can co:

- 25 prompt Python
- 25 prompt Java

Neu thieu prompt nao thi bao Vinh/Nghi truoc khi chay.

#### Buoc 2: Chay pilot truoc

Input:

```text
data/pilot_sample.csv
```

Output can tao:

```text
results/pilot_llm_output.csv
results/pilot_api_log.txt
```

Trong `pilot_api_log.txt`, moi request can ghi:

- `timestamp`
- `unit_id`
- `prompt_file`
- `response.model`
- `response_id`
- input tokens
- output tokens
- estimated cost
- status: `OK`, `EMPTY`, `ERROR`, `RATE_LIMIT`

#### Buoc 3: Neu pilot on thi chay full 50 ham

Input:

```text
experiment/dataset-manifest.csv
```

Output:

```text
results/full_llm_output.csv
results/full_api_log.txt
```

Quy tac:

- Khong doi model.
- Khong doi prompt.
- Khong goi lai GPT de sua output sau khi da co response.
- Neu response rong thi danh dau `INVALID`, khong tu dien noi dung.
- Neu bi rate limit thi retry theo exponential backoff va ghi vao log.

### 5.4. Checklist Done cua Thai

- [ ] Xac nhan co du 50 prompt.
- [ ] Chay xong pilot va luu log.
- [ ] Pilot khong co loi nghiem trong.
- [ ] Chay xong full 50 ham.
- [ ] Moi ham co raw output hoac status `INVALID`.
- [ ] Log co model, timestamp, token, cost.
- [ ] Ban giao Java output cho Quan.
- [ ] Ban giao Python output cho Van.

## 6. Cong viec chi tiet cua Quan - Java Metrics + Statistics Lead

### 6.1. Dieu kien de Quan bat dau

Quan chi bat dau phan Java khi Thai da co output cho 25 Java methods.

Input cua Quan:

- Java generated tests tu Thai
- 25 Java methods trong `JavaAlgorithms.java`
- `experiment/dataset-manifest.csv`

### 6.2. Muc tieu cua Quan

Quan phu trach do chat luong test cho Java:

- Executability / compilability
- Branch Coverage bang JaCoCo
- Mutation Score bang PIT
- Randoop baseline
- RQ2 GPT-4o vs Randoop
- Thong ke tong hop sau khi nhan bang Python cua Van

### 6.3. Viec Quan can lam

#### Buoc 1: Tao Java fixture

Can co cau truc de chay JUnit 5 cho `JavaAlgorithms.java`.

Can dam bao:

- JDK 17
- JUnit 5.11.4
- JaCoCo 0.8.13
- PIT 1.19.1
- Randoop 4.3.4

#### Buoc 2: Dua generated test vao fixture

Moi method Java can co generated test tu GPT.

Neu test khong compile:

- Khong sua bang tay trong primary result.
- Ghi status `NON_EXECUTABLE`.
- Ghi loi compile vao raw log.

#### Buoc 3: Chay JaCoCo

Can lay:

- covered branches
- total branches
- branch coverage %

Output nen tao:

```text
results/java_coverage.csv
```

Cot de xuat:

```csv
unit_id,symbol,cc,executability,total_branches,covered_branches,branch_coverage,status,notes
```

#### Buoc 4: Chay PIT Mutation Testing

Can lay:

- mutants generated
- mutants killed
- invalid mutants
- mutation score %

Output:

```text
results/java_mutation.csv
```

Cot de xuat:

```csv
unit_id,symbol,cc,mutants_generated,mutants_killed,mutants_invalid,mutation_score,status,notes
```

#### Buoc 5: Chay Randoop baseline

Chi chay cho 25 Java units.

Config bat buoc:

- Randoop 4.3.4
- random seed: `20260621`
- time limit: 60 giay/unit

Output:

```text
results/randoop_java_results.csv
```

Cot de xuat:

```csv
unit_id,symbol,randoop_branch_coverage,randoop_mutation_score,status,notes
```

#### Buoc 6: Chay thong ke tong hop

Buoc nay lam sau khi Van da co Python metrics.

Quan tao:

```text
results/full_analysis.ipynb
results/summary.csv
```

Can tra loi:

- RQ1 Java: GPT-4o branch coverage co vuot 75% khong?
- RQ1 Python: nhan bang cua Van de tinh chung trong summary.
- RQ2 Java: GPT-4o mutation score co cao hon Randoop khong?
- RQ3: CC co tuong quan nghich voi branch coverage/mutation score khong?

### 6.4. Checklist Done cua Quan

- [ ] 25/25 Java methods co status execution.
- [ ] Co `results/java_coverage.csv`.
- [ ] Co `results/java_mutation.csv`.
- [ ] Co `results/randoop_java_results.csv`.
- [ ] Co raw logs cho compile/test/coverage/mutation.
- [ ] Chay RQ2.
- [ ] Nhan Python metrics tu Van.
- [ ] Tao `results/full_analysis.ipynb`.
- [ ] Tao `results/summary.csv`.
- [ ] Ban giao summary cho Nghi.

## 7. Cong viec chi tiet cua Van - Python Metrics + Figures Lead

### 7.1. Dieu kien de Van bat dau

Van chi bat dau khi Thai da co output cho 25 Python functions.

Input cua Van:

- Python generated tests tu Thai
- `python_functions.py`
- `experiment/dataset-manifest.csv`

### 7.2. Muc tieu cua Van

Van phu trach do chat luong test cho Python:

- Executability
- Branch Coverage bang coverage.py
- Mutation Score bang pytest-mutagen
- Chuan hoa bang metric Python
- Ve figures cho report

### 7.3. Viec Van can lam

#### Buoc 1: Tao Python test fixture

Can dam bao:

- Python 3.12
- pytest 9.1.1
- coverage.py 7.14.2
- pytest-mutagen 1.3

#### Buoc 2: Dua generated test vao fixture

Moi function Python can co generated test tu GPT.

Neu test bi loi import/runtime/syntax:

- Khong sua bang tay trong primary result.
- Ghi status `NON_EXECUTABLE`.
- Ghi loi vao raw log.

#### Buoc 3: Chay coverage.py

Can lay branch coverage cho tung function.

Output:

```text
results/python_coverage.csv
```

Cot de xuat:

```csv
unit_id,symbol,cc,executability,total_branches,covered_branches,branch_coverage,status,notes
```

#### Buoc 4: Chay pytest-mutagen

Can lay mutation score cho tung function.

Output:

```text
results/python_mutation.csv
```

Cot de xuat:

```csv
unit_id,symbol,cc,mutants_generated,mutants_killed,mutants_invalid,mutation_score,status,notes
```

#### Buoc 5: Ve figures

Tao thu muc:

```text
figures/
```

Can co it nhat:

```text
figures/fig1_distribution.png
figures/fig2_comparison.png
```

Yeu cau figure:

- PNG toi thieu 300 DPI.
- Co title.
- Co label truc x/y.
- Co ghi N.
- Khong dung mau sac gay roi.
- Figure phai trace duoc tu `results/*.csv`.

Goi y:

- `fig1_distribution.png`: boxplot/violin cho branch coverage va mutation score theo language.
- `fig2_comparison.png`: GPT-4o vs Randoop mutation score tren Java.

### 7.4. Checklist Done cua Van

- [ ] 25/25 Python functions co status execution.
- [ ] Co `results/python_coverage.csv`.
- [ ] Co `results/python_mutation.csv`.
- [ ] Co raw logs cho pytest/coverage/mutation.
- [ ] Co `figures/fig1_distribution.png`.
- [ ] Co `figures/fig2_comparison.png`.
- [ ] Ban giao Python metrics cho Quan.
- [ ] Ban giao figures cho Nghi.

## 8. Cong viec chi tiet cua Nghi - Project Lead + Final Integrator

### 8.1. Muc tieu cua Nghi

Nghi khong lam thay het viec cua nhom. Nghi phu trach governance, consistency va final merge.

Nghi phai dam bao:

- Khong ai doi RQ sau khi thay data.
- Khong ai doi threshold sau khi thay data.
- Khong ai sua generated test bang tay trong primary result.
- Moi loi deu duoc ghi vao log.
- Report, result, slide va proposal khong mau thuan nhau.

### 8.2. Viec Nghi can lam tu dau den cuoi

#### Buoc 1: Tao `notes.md`

File `notes.md` ghi:

- Ngay freeze dataset.
- Random seed pilot.
- Ai lam file nao.
- Loi gap phai.
- Cach xu ly loi.
- Amendment neu co.

#### Buoc 2: Kiem gate truoc pilot

Theo RBL-4, truoc pilot can qua cac gate:

| Gate | Nghi can kiem |
|---|---|
| E1 Proposal duyet | Co confirm cua GV |
| E2 Dataset | Co `dataset-manifest.csv`, `data/raw/README.md` |
| E3 API test | Thai chay duoc 1 API call mau |
| E4 Metric script | Quan/Van co cach tinh metric tren data gia |
| E5 Ground truth plan | Co quy tac annotate/IAA neu can |
| E6 Budget | Thai tinh cost |
| E7 GitHub | Repo san sang, khong commit API key |

#### Buoc 3: Kiem handoff giua cac thanh vien

Moi lan ban giao phai co file that:

- Vinh -> Thai: manifest + pilot sample
- Thai -> Quan: Java generated output + API log
- Thai -> Van: Python generated output + API log
- Van -> Quan: Python metric CSV
- Quan -> Nghi: summary + analysis notebook
- Van -> Nghi: figures

#### Buoc 4: Merge report

Nghi gom cac phan:

- Dataset: Vinh viet
- Model/API: Thai viet
- Java/Randoop/RQ2: Quan viet
- Python/Figures: Van viet
- Statistical summary: Quan viet, Van cross-check
- Threats/Reproducibility/Timeline: Nghi viet

### 8.3. Checklist Done cua Nghi

- [ ] Co `notes.md`.
- [ ] Gate E1-E7 da check.
- [ ] Khong co API key trong repo.
- [ ] Cac result CSV co cung `unit_id` voi manifest.
- [ ] Figures dung data tu result CSV.
- [ ] `summary.csv` khop voi notebook.
- [ ] Report khong claim qua muc.
- [ ] Slide/report/result khong mau thuan.
- [ ] Final package san sang nop.

## 9. Bang handoff chi tiet

| Buoc | Nguoi lam | Can nhan tu ai | File tao ra | Ban giao cho ai |
|---|---|---|---|---|
| 1 | Vinh | Source 50 ham da co | `experiment/dataset-manifest.csv` | Thai, Nghi |
| 2 | Vinh | Manifest | `data/raw/README.md` | Nghi |
| 3 | Vinh | Manifest | `data/pilot_sample.csv` | Thai |
| 4 | Thai | Pilot sample cua Vinh | `results/pilot_llm_output.csv`, `results/pilot_api_log.txt` | Nghi |
| 5 | Nghi | Pilot output cua Thai | Pilot decision trong `notes.md` | Ca nhom |
| 6 | Thai | Manifest cua Vinh | `results/full_llm_output.csv`, `results/full_api_log.txt` | Quan, Van |
| 7 | Quan | Java output cua Thai | `results/java_coverage.csv`, `results/java_mutation.csv` | Nghi |
| 8 | Quan | Java source + manifest | `results/randoop_java_results.csv` | Nghi |
| 9 | Van | Python output cua Thai | `results/python_coverage.csv`, `results/python_mutation.csv` | Quan, Nghi |
| 10 | Van | Result CSV | `figures/fig1_distribution.png`, `figures/fig2_comparison.png` | Nghi |
| 11 | Quan | Java metrics + Python metrics cua Van | `results/full_analysis.ipynb`, `results/summary.csv` | Nghi |
| 12 | Nghi | Tat ca output | Final report/slide consistency check | GV/nhom |

## 10. Definition of Done toan project

Project RBL-4 chi duoc xem la xong khi co du:

- [ ] 50 ham source trong `experiment/input_code/`.
- [ ] 50 prompt trong `experiment/output_pipeline/`.
- [ ] `experiment/dataset-manifest.csv`.
- [ ] `data/raw/README.md`.
- [ ] `data/pilot_sample.csv`.
- [ ] `results/pilot_llm_output.csv`.
- [ ] `results/pilot_api_log.txt`.
- [ ] `results/full_llm_output.csv`.
- [ ] `results/full_api_log.txt`.
- [ ] `results/java_coverage.csv`.
- [ ] `results/java_mutation.csv`.
- [ ] `results/randoop_java_results.csv`.
- [ ] `results/python_coverage.csv`.
- [ ] `results/python_mutation.csv`.
- [ ] `results/full_analysis.ipynb`.
- [ ] `results/summary.csv`.
- [ ] `figures/fig1_distribution.png`.
- [ ] `figures/fig2_comparison.png`.
- [ ] `notes.md`.
- [ ] Bao cao co ket luan theo tung RQ.

## 11. Nhung dieu khong duoc lam

- Khong doi threshold 75% sau khi thay coverage.
- Khong doi mutation threshold/cach tinh sau khi thay mutation score.
- Khong chon lai ham de ket qua dep hon.
- Khong xoa output GPT bi loi.
- Khong sua generated test bang tay roi tinh nhu ket qua GPT.
- Khong commit `.env` hoac API key.
- Khong chay full experiment khi chua co manifest.
- Khong viet report claim GPT-4o tot hon noi chung neu data chi chung minh trong 50 ham CC 5-15.

## 12. Ket luan ngan gon

Vinh lam dataset freeze truoc. Thai chi duoc chay GPT sau khi dataset da freeze. Quan va Van chi do metric sau khi Thai co output. Quan chay thong ke tong hop sau khi co ca Java va Python metrics. Nghi theo doi gate tu dau va merge cuoi cung.

Day la cach chia viec dung voi RBL-4 vi no tach ro dataset, model generation, metric evaluation, statistics va final reporting.
