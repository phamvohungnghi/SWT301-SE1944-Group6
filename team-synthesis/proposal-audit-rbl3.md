# Audit `proposal.md` theo hướng dẫn RBL-3

**Nguồn đối chiếu:** `Giai đoạn 2/RBL-3_Experiment_Design_Research_Proposal.pdf`  
**Phạm vi:** chỉ review; không thay đổi proposal đã duyệt.

## Kết luận nhanh

Protocol cốt lõi về RQ, hypotheses, model, prompt, metric, baseline và statistical test đã đủ mạnh để triển khai. Tuy nhiên, tài liệu chưa bao phủ trọn template RBL-3 ở các phần trình bày/điều hành nghiên cứu. Nên bổ sung bằng phụ lục hoặc execution package, không tự sửa RQ/metric/threshold.

| Yêu cầu RBL-3 | Hiện trạng | Đánh giá | Cần bổ sung |
|---|---|---|---|
| §1 Title & Group | Có tiêu đề, môn học, thành viên | WARNING | Tiêu đề còn ghi RBL-2; thiếu version, ngày cụ thể và trạng thái “đã duyệt” |
| §2 Problem Statement | Có problem, motivation và GAP | WARNING | Body mới nêu trực tiếp TestPilot/AgoneTest; nên có ≥3 citation cụ thể và reference mapping rõ |
| §3 Related Work | Có evidence summary ngắn | FAIL | Thiếu bảng paper summary, pattern analysis và GAP mapping riêng |
| §4 Research Questions | PICO/PECO, H0/H1, threshold, test, α đầy đủ | PASS | Không đổi sau phê duyệt |
| §5 Experiment Protocol | Dataset, model, prompt, toolchain, metric, baseline, pipeline đầy đủ | WARNING | Manifest còn rỗng; provenance/license/commit của 50 hàm hiện chưa được chứng minh |
| §6 Evaluation Plan | Có estimand/test/multiplicity/decision | WARNING | Thiếu ma trận diễn giải positive/mixed/double-negative; thiếu rule cho subgroup và power/precision analysis |
| §7 Threats to Validity | Có threat→mitigation cụ thể | WARNING | Chưa nhóm rõ thành Internal/External/Construct/Conclusion như template RBL-3 |
| §8 Timeline & Resources | Có timeline/gates | FAIL | Thiếu resource inventory, API cost, contingency ≥2 risks và deliverable hằng tuần theo từng người |
| Cross-section consistency | Phần lớn nhất quán | WARNING | Proposal ghi 7 paper có outcome định lượng, evidence table hiện đã là 10/10; cần đồng bộ khi tạo version tiếp theo |

## Những phần nên thêm

### 1. Related Work matrix

Một bảng ngắn: `Paper | Model | Dataset/N | Metric | Best quantitative result | Limitation`, sau đó 3–4 pattern tổng hợp và bảng GAP mapping.

### 2. Dataset provenance appendix

Với 50 hàm hiện có trong `input_code`, cần ghi cho từng Pair ID:

- nguồn/repository hoặc xác nhận là dataset do nhóm xây dựng;
- license/quyền sử dụng;
- file, line range, hash;
- CC thực đo;
- fixture/preflight status.

Nếu 50 hàm do nhóm tự xây dựng thay vì lấy từ public repositories như proposal mô tả, đây là thay đổi dataset source và phải xử lý bằng amendment, không sửa im lặng.

### 3. Evaluation interpretation matrix

Thêm cách diễn giải trước khi có data:

- RQ1 đạt / không đạt ở cả hai ngôn ngữ;
- chỉ một ngôn ngữ đạt;
- RQ2 GPT-4o tốt hơn / không tốt hơn Randoop;
- RQ3 correlation âm / không có evidence.

### 4. Power/precision note

Ghi rõ nghiên cứu dùng n=25/language, RQ3 exploratory và báo 95% CI/effect size. Nếu không làm prospective power analysis, phải nói rõ đây là bounded sample theo resource và không claim “đủ power”.

### 5. Resource, cost và contingency

- API budget/token cap và owner.
- Máy/JDK/Python/container owner.
- Hai contingency tối thiểu: model unavailable; mutation tool/fixture failure.
- Quy trình amendment và deadline phản hồi.

### 6. Work-package deliverables

Mỗi người sở hữu một work package và tự viết subsection tương ứng. PL chỉ merge/format, không viết thay toàn bộ report.

## Những phần không cần thay đổi

- RQ1/RQ2/RQ3.
- H0/H1 và α.
- Ngưỡng 75% đã khai báo Case 3.
- Exact model/API/prompt parameters.
- Randoop baseline và test direction.
- No-HARKing, no-regeneration và raw logging rules.

## Mức sẵn sàng

- **Research protocol:** PASS.
- **RBL-3 document completeness:** CONDITIONAL PASS.
- **Full experiment readiness:** chưa đạt cho đến khi dataset provenance/manifest, work packages, resource inventory và pilot artifacts hoàn tất.
