# RBL-3 Proposal Defense — Visual Deck

Deck được thiết kế theo nguyên tắc **ít chữ, một ý chính mỗi slide, ưu tiên mô hình hóa**. `proposal.md` được giữ nguyên.

| Slide | Mô hình trực quan | Người nói |
|---|---|---|
| 1 | Scope card: 50 functions / 25 Java / 25 Python | Nghi |
| 2 | Chuỗi Problem → Confounders → GAP | Vinh |
| 3 | Evidence table: 5 key papers | Vinh |
| 4 | RQ/metric/threshold/test matrix | Quân |
| 5 | Pipeline + compact model specification | Thái |
| 6 | Dataset tree + provenance gate | Vinh |
| 7 | Work-package ownership map | Văn |
| 8 | Evaluation/interpretation matrix | Quân |
| 9 | Validity quadrants: I/C/E/C | Văn |
| 10 | Timeline gates + resources + contingency | Nghi |
| 11 | Contribution triangle + reproducibility package | Nghi |

## Nguyên tắc nội dung

- Giữ nguyên RQ, hypothesis, threshold, model, prompt strategy, metric và baseline đã được duyệt.
- Không đưa đoạn văn dài lên slide; phần giải thích nằm trong speaker notes và `presentation-script.md`.
- Mỗi work package có một owner; owner tự viết phần báo cáo tương ứng.
- Java và Python metrics được tách owner do khác toolchain; kết quả tích hợp do Quân thực hiện.
- Không trình bày kết quả giả định như kết quả đã quan sát.

## Tệp đầu ra

- `GPT-4o_RBL3_Proposal_Defense_Visual.pptx`
- `presentation-script.md`
- `build_proposal_deck.mjs`
