# RBL-5: Báo Cáo & Trình Bày

**Tuần:** 9–10  
**Đầu vào:** results/full_analysis.ipynb + figures/ đã hoàn chỉnh từ RBL-4  
**Output:** Paper viết trên Overleaf (6–8 trang IEEE, tùy venue) + presentation/slides.pdf (10–12 phút)

## 🖊️ Setup Overleaf (PL làm ngay đầu Tuần 9)

**Overleaf** = editor viết paper LaTeX online, nhiều người cùng chỉnh sửa như Google Docs. Dùng template conference/journal đúng để paper đúng định dạng ngay từ đầu — **không tự đặt font/margin.**

### Bước 0 — Chọn template phù hợp

| **Venue nhắm tới**                                     | **Template**              | **Tìm trên Overleaf**                               |
|--------------------------------------------------------|---------------------------|-----------------------------------------------------|
| **IEEE Conference** (ICSME, SANER, ASE, FISAT, KSE...) | IEEEtran — 2 cột, 10pt    | New Project → Templates → tìm "IEEE Conference"     |
| **ACM Conference** (ESEC/FSE, ISSTA, ICSE...)          | acmart với option sigconf | New Project → Templates → tìm "ACM SIG Proceedings" |
| **Springer LNCS** (một số hội nghị châu Á)             | llncs — 1 cột             | New Project → Templates → tìm "Springer LNCS"       |
| **Chưa biết nộp đâu / nội bộ**                         | IEEE Conference           | Phổ biến nhất trong SE, dùng mặc định               |

### Cách lấy template trên Overleaf

#### Cách 1 — Dùng thẳng từ Overleaf Gallery (khuyên dùng)

1.  Vào overleaf.com → **New Project** → **From Template**
2.  Tìm "IEEE Conference" hoặc "ACM" hoặc "Springer"
3.  Click **Open as Template** → Overleaf tạo project mới với file đầy đủ

#### Cách 2 — Upload template từ trang chủ venue

- IEEE: ieeeauthorcenter.ieee.org → Download IEEEtran.zip
- ACM: acm.org/publications/authors/submissions → Download acmart-primary.zip
- Springer LNCS: springer.com/lncs → Download llncs2e.zip

Sau đó: Overleaf → **New Project** → **Upload Project** → upload file .zip

### Cấu trúc `main.tex` khuyên dùng

#### Template IEEE (`IEEEtran`)

```latex
\documentclass[conference]{IEEEtran}
\usepackage[utf8]{inputenc}
\usepackage{graphicx}
\usepackage{booktabs} % bảng đẹp hơn
\usepackage{listings} % code snippet
\usepackage{hyperref}
\begin{document}
\title{Your Paper Title}
\author{\IEEEauthorblockN{Author 1, Author 2, ...}
\IEEEauthorblockA{FPT University, Vietnam}}
\maketitle
\begin{abstract}
\input{sections/00_abstract}
\end{abstract}
\begin{IEEEkeywords}
large language models, unit test generation, mutation score, empirical study
\end{IEEEkeywords}
% Keywords: 4–6 từ, chữ thường, phân tách bằng dấu phẩy
% Chuẩn hóa tên: dùng IEEE Thesaurus tại thesaurus.ieee.org
% Ví dụ: "large language models" (không viết "LLMs"), "software testing" (không "SW testing")
\input{sections/01_intro}
\input{sections/02_related}
\input{sections/03_method}
\input{sections/04_results}
\input{sections/05_discussion}
\input{sections/06_threats}
\input{sections/07_conclusion}
\bibliographystyle{IEEEtran}
\bibliography{references}
\end{document}
```

#### Template ACM (`acmart sigconf`)

```latex
\documentclass[sigconf,review]{acmart}
% Thay "review" bằng "" khi submit thật (bỏ line numbers)
\begin{document}
\title{Your Paper Title}
\author{Author 1}
\affiliation{\institution{FPT University}\country{Vietnam}}
\email{email@fpt.edu.vn}
\begin{abstract}[Abstract ~150 words]\end{abstract}
\keywords{keyword1, keyword2}
\maketitle
\input{sections/01_intro}
% ... các section khác
\bibliographystyle{ACM-Reference-Format}
\bibliography{references}
\end{document}
```

#### Cấu trúc file trên Overleaf

```text
main.tex ← File chính (chứa \documentclass + \input{})
sections/
├── 00_abstract.tex ← PL viết sau cùng
├── 01_intro.tex
├── 02_related.tex
├── 03_method.tex
├── 04_results.tex
├── 05_discussion.tex
├── 06_threats.tex
└── 07_conclusion.tex
figures/ ← Upload ảnh từ máy lên đây (PNG/PDF ≥ 300 DPI)
references.bib ← BibTeX cho toàn bộ citation
```

Mỗi file section viết độc lập — không có \begin{document} :

```latex
% sections/01_intro.tex
\section{Introduction}
\label{sec:intro}
[Nội dung...]
```

### Bước tiếp theo sau khi tạo project

1.  Chia sẻ link Edit với toàn bộ nhóm: **Share → Anyone with link can edit**
2.  Mirror về local: git clone [Overleaf git URL] hoặc **Menu → GitHub → Sync**
3.  Compile thử: bấm **Recompile** — nếu ra PDF không lỗi là xong

## 👥 Phân công viết & deadline nội bộ

| **Section**            | **Người phụ trách**                      | **Viết trong**           | **Nộp draft cho nhóm**         |
|------------------------|------------------------------------------|--------------------------|--------------------------------|
| Abstract               | **PL**                                   | sections/00_abstract.tex | Ngày 4 Tuần 10 (viết sau cùng) |
| §1 Introduction        | **RW**                                   | 01_intro.tex             | Ngày 2 Tuần 9                  |
| §2 Related Work        | **DG**                                   | 02_related.tex           | Ngày 2 Tuần 9                  |
| §3 Methodology         | **LR** (pipeline) + **MS** (metric/stat) | 03_method.tex            | Ngày 3 Tuần 9                  |
| §4 Results             | **MS**                                   | 04_results.tex           | Ngày 4 Tuần 9                  |
| §5 Discussion          | **PL + MS**                              | 05_discussion.tex        | Ngày 5 Tuần 9                  |
| §6 Threats to Validity | **RW**                                   | 06_threats.tex           | Ngày 5 Tuần 9                  |
| §7 Conclusion          | **RW**                                   | 07_conclusion.tex        | Ngày 1 Tuần 10                 |
| Review tổng thể        | **PL**                                   | —                        | Ngày 2–3 Tuần 10               |
| Final polish           | Tất cả                                   | —                        | Ngày 4 Tuần 10                 |

**Quy tắc review:** Mỗi người viết xong section của mình thì assign cho PL review. PL không tự sửa nội dung kỹ thuật của LR/MS mà comment để người đó sửa.

## 📝 Hướng dẫn viết từng section

### Abstract (PL viết — ~150 words)

**Mục đích:** Phần được đọc nhiều nhất — quyết định reviewer có đọc tiếp không. Viết **sau cùng** khi đã có kết quả đầy đủ.

#### Cấu trúc 5 câu chuẩn

| **Câu** | **Vai trò**     | **Nội dung**                                           |
|---------|-----------------|--------------------------------------------------------|
| 1       | **Context**     | Vấn đề thực tế quan trọng như thế nào? (kèm số nếu có) |
| 2       | **Gap**         | Prior work còn thiếu gì cụ thể?                        |
| 3       | **Method**      | Nhóm làm gì, với dataset nào, dùng tool/LLM gì?        |
| 4       | **Results**     | Kết quả số cụ thể (metric, p-value, effect size)       |
| 5       | **Implication** | Ý nghĩa với researcher/practitioner là gì?             |

#### Ví dụ BAD

> “In this paper, we propose a novel LLM-based approach for unit test generation. We conducted experiments and the results show that our approach is effective and promising.”

Tại sao sai: không có dataset size, không có metric, không có số liệu, "effective and promising" = nói không gì cả.

#### Ví dụ GOOD

> “Unit test generation remains labor-intensive despite tools like EvoSuite. No prior study has evaluated GPT-4o mini for this task using mutation score as the primary metric. We apply GPT-4o mini to 200 Java functions from the Apache Commons dataset and measure mutation score and branch coverage. GPT-4o mini achieves median mutation score 61.3% vs EvoSuite 48.7% (p=0.003, Cliff's δ=0.41, medium). Our results suggest LLM-generated tests can complement search-based tools, particularly for functions with complex logic.”

#### Lỗi hay gặp

- ❌ Không có số liệu trong câu Results: "results are better than baseline"
- ❌ "In this paper, we propose..." — reviewer biết rồi, không cần nói
- ❌ Viết abstract trước khi có kết quả → phải viết lại toàn bộ
- ❌ Vượt quá 200 words (IEEE/ACM thường giới hạn 150–200 words)

### §1 Introduction (RW viết — ~1 trang)

**Mục đích:** Dẫn người đọc từ vấn đề thực tế → GAP → RQ của nhóm.

#### Cấu trúc 5 đoạn

| **Đoạn** | **Nội dung**                                            | **Câu mở đầu gợi ý**                                          |
|----------|---------------------------------------------------------|---------------------------------------------------------------|
| 1        | Vấn đề thực tế — tại sao task này quan trọng            | "Writing [X] manually is time-consuming and error-prone..." |
| 2        | State of the art — các approach hiện tại đã làm được gì | "Recent studies have shown that LLMs can..."                  |
| 3        | GAP — những gì còn thiếu                                | "However, no study has evaluated... on ... using ..."         |
| 4        | Contribution của paper này                              | "In this paper, we present / investigate / compare..."        |
| 5        | Cấu trúc paper                                          | "The rest of this paper is structured as follows..."          |

#### Nguồn cite

- Đoạn 1–2: paper trong evidence-table-merged.md (8–10 paper nổi bật nhất)
- Đoạn 3: paper phản chứng từ gap-analysis.md (những paper gần nhất nhưng vẫn còn GAP)
- Đoạn 4: không cite

**Contribution statement** (cuối đoạn 4) — viết dạng bullet:

```text
To summarize, this paper contributes:
(1) The first empirical evaluation of [I] for [task] using [metric] on [dataset]
(2) Experimental results showing that [1-line finding]
(3) [Optional: public dataset/code at GitHub URL]
```

#### Lỗi hay gặp

- ❌ Bắt đầu bằng "Artificial intelligence is increasingly..." (quá chung)
- ❌ Không cite khi nói "Previous studies show..."
- ❌ Contribution mơ hồ: "We explore LLMs for testing"

### §2 Related Work (DG viết — ~1–1.5 trang)

**Mục đích:** Cho thấy nhóm biết literature + dẫn vào GAP một lần nữa.

**Không viết theo kiểu:** *"Smith et al. (2023) did X. Jones et al. (2024) did Y. Liu et al. (2024) did Z."*

#### Viết theo theme (nhóm paper theo chủ đề)

- **2.1 [Theme A]** – ví dụ: "LLM for Test Generation"
  - → Tóm tắt 4–6 paper về theme này: tool dùng, metric dùng, finding chung
  - → Nhược điểm / limitation của nhóm paper này
- **2.2 [Theme B]** – ví dụ: "Search-Based Software Testing"
  - → Tương tự
- **2.3 Positioning paragraph (cuối section)**
  - → "Unlike prior work, this paper is the first to [gap statement]."

#### Nguồn cite

- Toàn bộ lấy từ team-synthesis/evidence-table-merged.md
- Ưu tiên cite paper có con số kết quả cụ thể trong cột Kết quả
- Mỗi theme: 4–6 paper (không cần cite hết 16 paper)

#### Cách thêm citation vào `references.bib`

1.  Tìm paper trên Semantic Scholar hoặc IEEE Xplore
2.  Bấm "Export" → "BibTeX" → copy entry
3.  Paste vào references.bib
4.  Sửa key (ví dụ: chen2023testgen ) — key này dùng trong \cite{}
5.  Đảm bảo có trường doi hoặc url

### §3 Methodology (LR + MS viết — ~1.5–2 trang)

**Mục đích:** Người đọc phải tự reproduce được experiment dựa trên section này.

#### Phân công chi tiết

- **LR viết:** Dataset + Pipeline (3.1 + 3.2)
- **MS viết:** Metrics + Statistical Analysis Plan (3.3 + 3.4)

#### 3.1 Dataset (LR)

- Tên dataset, nguồn (URL), kích thước tổng
- Cách lấy/filter ra tập dùng trong experiment
- Thống kê mô tả: distribution, class balance, đặc điểm quan trọng
- Cite paper gốc của dataset

#### 3.2 Experimental Setup / Pipeline (LR)

- Model: gpt-4o-mini-2024-07-18, temperature=0, max_tokens=...
- Prompt: trích nguyên văn (dùng LaTeX \begin{lstlisting}...\end{lstlisting} hoặc trong figure)
- Pipeline: các bước xử lý từ input → LLM call → output → metric computation
  - Có thể vẽ diagram đơn giản
- Handling edge cases: empty response, rate limit, timeout

Nếu có thay đổi so với proposal (amendment), ghi: *"We deviated from the proposed protocol in that... This change was approved by the instructor on [date]."*

#### 3.3 Metrics (MS)

- Tên metric + ý nghĩa ngắn gọn
- Công thức toán học (nếu không phải metric chuẩn)
- Tool/thư viện: "sacrebleu v2.3 for BLEU-4" hoặc "sentence-transformers with all-MiniLM-L6-v2"
- Threshold: giá trị + nguồn (Case 1/2/3 từ RBL-3)

#### 3.4 Statistical Analysis Plan (MS)

- Statistical test: tên + lý do chọn (loại dữ liệu)
- $\alpha = 0.05$ (hoặc Bonferroni-corrected nếu nhiều tests)
- Effect size: tên metric effect size + ngưỡng diễn giải

#### Replication package (thêm cuối §3.2)

Thêm 1 câu ở cuối phần 3.2 Pipeline:

> “Our replication package, including datasets, prompts, scripts, and raw results, is publicly available at: \url{https://github.com/[repo-url]}.”

Đây là yêu cầu của hầu hết venue SE. Không cần tạo trang riêng — link GitHub repo là đủ.

#### Nguồn cite

- Dataset: cite paper gốc công bố dataset
- Metric: cite paper đề xuất metric (không phải bài giới thiệu sklearn)
- Statistical test: cite 1 paper SE dùng test này (ví dụ: Arcuri & Briand 2011 cho Wilcoxon)

### §4 Results (MS viết — ~1–1.5 trang)

**Mục đích:** Báo cáo số liệu thực tế, không giải thích hay bình luận (để §5).

**Cấu trúc:** Trả lời từng RQ theo thứ tự.

```text
RQ1: [Câu hỏi nguyên văn từ proposal]
Table 1 shows the [metric] scores for each [condition/strategy].
The median [metric] is [value] (IQR: [lo, hi]).
The Wilcoxon signed-rank test yields p=[value], [tên test], [effect size]=value ([mức: small/med
Therefore, we [reject / fail to reject] H0.
Figure 1 illustrates the distribution of scores across conditions.
```

#### Format bảng kết quả

| **Condition** | **Metric (mean ± std)** | **p-value** | **Effect size**         |
|---------------|-------------------------|-------------|-------------------------|
| Approach A    | $$0.82 \pm 0.09$$       | —           | —                       |
| Approach B    | $$0.67 \pm 0.12$$       | p=0.007     | $\delta = 0.21$ (small) |

#### Quy tắc báo cáo số liệu

- Luôn ghi N thực tế (sau khi bỏ invalid): "N=2,619 valid responses (98.1% of 2,668)"
- Không chỉ p < 0.05 — ghi giá trị chính xác: p=0.031
- Effect size phải có (p-value không đủ để đánh giá practical significance)
- Invalid/error rate: "3.2% of calls returned empty responses; these were excluded"

**Nguồn cite:** Section này ít cite nhất — chỉ cite khi so sánh trực tiếp số liệu với prior work.

### §5 Discussion (PL + MS viết — ~1 trang)

**Mục đích:** Giải thích và đặt kết quả trong bối cảnh rộng hơn.

#### Phân công

- **MS viết draft** (hiểu data nhất)
- **PL review** tổng thể + bổ sung góc nhìn implications

#### Nội dung

#### 5.1 Giải thích finding chính

- Tại sao kết quả lại như vậy? (error analysis — xem những case LLM làm tệ nhất)
- Pattern quan sát được trong data

#### 5.2 So sánh với prior work

- Kết quả của nhóm cao hơn / thấp hơn / tương đồng với paper nào trong SLR?
- Nếu khác biệt: lý do có thể là gì (dataset khác, model khác, metric khác)?

#### 5.3 Implications

- Kết quả này có ý nghĩa gì với người dùng thực tế (developer, tester, team)?
- Nên dùng approach này hay không? Trong điều kiện nào?

#### Khi kết quả âm tính (H0 không bị reject)

- Không cần xin lỗi — phân tích tại sao LLM không đạt ngưỡng
- *"Our results suggest that [finding] may be attributed to [analysis of hard cases]"*
- Đây vẫn là contribution: biết approach X không hiệu quả trong setting Y là thông tin có giá trị

**Nguồn cite:** So sánh số liệu với paper SLR → cite paper đó. Không cite khi nêu nhận xét của chính mình.

### §6 Threats to Validity (RW viết — ~0.5–1 trang)

**Mục đích:** Thành thật về giới hạn của nghiên cứu.

**Threats to Validity** = các yếu tố có thể làm kết quả không hoàn toàn đáng tin hoặc không tổng quát được.

#### 4 loại — mỗi loại 1–2 bullet

| **Loại**       | **Ý nghĩa**                                      | **Ví dụ cho topic LLM**                                   |
|----------------|--------------------------------------------------|-----------------------------------------------------------|
| **Internal**   | Yếu tố làm sai lệch kết quả bên trong experiment | Prompt không hoàn toàn đồng nhất; random seed của LLM     |
| **External**   | Giới hạn tổng quát hóa ra ngoài                  | Chỉ test trên 1 dataset / 1 domain / 1 ngôn ngữ           |
| **Construct**  | Metric có thực sự đo đúng điều cần đo không      | BLEU không capture ngữ nghĩa; CTQRS chỉ đo structure      |
| **Conclusion** | Statistical test có đủ mạnh không                | N nhỏ → low statistical power; multiple testing inflation |

Mỗi threat viết: **mô tả threat + mitigation đã làm** (hành động, không phải ý định).

Ví dụ: *"Conclusion validity: our N=2,619 may be insufficient for sub-group analyses. We mitigated this by pre-registering sub-groups in the proposal before observing results."*

**Nguồn cite:** Thường không cần cite nhiều — đây là nhận xét của chính nhóm.

### §7 Conclusion (RW viết — ~0.5 trang)

#### Cấu trúc

1.  Tóm tắt 1–2 câu mỗi RQ: "We investigated [RQ]. Results show [finding] (p=..., effect size=...)."
2.  Contribution nổi bật nhất: "This is the first study to..."
3.  Future work: 2–3 hướng cụ thể (không phải "cần nghiên cứu thêm")
    - "Future work could investigate [X] by [cách cụ thể]"
    - Tránh: "Future work could explore more datasets" (quá chung)

**Nguồn cite:** Future work có thể cite paper suggest hướng đó hoặc paper làm approach liên quan.

## 📚 Quản lý citations (`references.bib`)

**Phân công:** Mỗi người tự thêm citation của section mình vào references.bib .

#### Format BibTeX chuẩn

```bibtex
@inproceedings{chen2023testgen,
author = {Chen, Mark and others},
title = {Evaluating Large Language Models for Unit Test Generation},
booktitle = {Proc. ICSE 2023},
year = {2023},
doi = {10.1145/XXXXXXX}
}
```

#### Quy tắc

- Key format: authorYEARkeyword (ví dụ: dakhel2024chatgpt )
- Phải có doi hoặc url — không có thì ghi note = {Available: URL}
- Dùng \cite{key} trong text — Overleaf tự generate References section
- Không cite: Wikipedia, blog, Stack Overflow, GitHub README

#### Tìm BibTeX nhanh

- Semantic Scholar → paper → Cite → BibTeX
- IEEE Xplore → paper → Cite This → BibTeX
- Google Scholar → " (nháy kép) → Cite → BibTeX

## 🎬 Làm slide trình bày (2 giờ)

File: presentation/slides.pdf — 10–12 phút

#### Cấu trúc slide

| **Slide** | **Nội dung**                          | **Thời gian** |
|-----------|---------------------------------------|---------------|
| 1         | Tiêu đề + thành viên                  | 30 giây       |
| 2         | Vấn đề thực tế (không phải technical) | 1 phút        |
| 3         | GAP + RQ + H0/H1                      | 1.5 phút      |
| 4         | Dataset + Pipeline (diagram)          | 1.5 phút      |
| 5         | Metric + Statistical test             | 1 phút        |
| 6–7       | Results (table + figures)             | 3 phút        |
| 8         | Discussion + limitations              | 1.5 phút      |
| 9         | Conclusion + future work              | 1 phút        |

#### Nguyên tắc slide

- 1 slide = 1 ý chính — không nhồi text
- Bảng kết quả: tối đa 5 dòng, **bold** dòng quan trọng nhất
- Kết quả số: hiển thị to, dễ đọc từ xa

**Chuẩn bị Q&A:** Mỗi thành viên phải giải thích được phần mình viết:

- Tại sao chọn dataset này không phải dataset khác?
- Tại sao metric này?
- Kết quả âm tính có ý nghĩa gì?
- Nếu làm lại, sẽ thay đổi gì?

## 📁 File mới thêm vào repo sau RBL-5

Xem **RBL-0** cho cấu trúc thư mục toàn bộ dự án. Đây là các file bổ sung cuối cùng.

```text
[tên-nhóm]/
├── paper/
│   ├── main.tex                 ← [MỚI] File LaTeX chính (\input sections/)
│   ├── references.bib           ← [MỚI] BibTeX – mỗi entry có DOI
│   ├── sections/
│   │   ├── 00_abstract.tex      ← [MỚI] PL viết (sau cùng)
│   │   ├── 01_intro.tex         ← [MỚI] RW viết
│   │   ├── 02_related.tex       ← [MỚI] DG viết
│   │   ├── 03_method.tex        ← [MỚI] LR + MS viết
│   │   ├── 04_results.tex       ← [MỚI] MS viết
│   │   ├── 05_discussion.tex    ← [MỚI] PL + MS viết
│   │   ├── 06_threats.tex       ← [MỚI] RW viết
│   │   └── 07_conclusion.tex    ← [MỚI] RW viết
│   ├── figures/                 ← [MỚI] Copy từ ../figures/ (LaTeX \includegraphics)
│   ├── output/
│   │   └── paper_final.pdf      ← [MỚI] ★ PDF compile từ main.tex – file nộp GV
│   └── quality/
│       └── ai_check_log.md      ← [MỚI] Kết quả AI detector (xem RBL-5b)
└── presentation/
    ├── slides_final.pptx        ← [MỚI] ★ Slide trình bày cuối kỳ
    └── slides_final.pdf         ← [MỚI] Export PDF để nộp GV
```

**Lưu ý Overleaf:** Overleaf lưu project online. Trước khi nộp, download toàn bộ project (Menu → Download → Source) và commit vào GitHub.

## ✅ Checklist cuối cùng trước khi nộp

### Paper

- [ ] 6–8 trang IEEE (không tính References) — tùy venue nhắm tới
- [ ] §3 có model version chính xác + prompt nguyên văn
- [ ] §4 mỗi RQ có: metric value + p-value + effect size + N
- [ ] Mọi claim về prior work có citation
- [ ] Tất cả citation có DOI trong references.bib
- [ ] Mọi figure có: title, axis labels, N annotation, ≥ 300 DPI
- [ ] Số trong §4 khớp với full_analysis.ipynb
- [ ] paper/output/paper_final.pdf compile được không lỗi

### Slides

- [ ] 10–12 phút (đã rehearse ≥ 1 lần)
- [ ] presentation/slides_final.pptx + .pdf đều có trong repo
- [ ] Slide 2 bắt đầu bằng vấn đề thực tế, không phải "AI is..."
- [ ] Kết quả chính hiển thị rõ ràng

### GitHub repo — kiểm tra toàn bộ trước khi nộp

- [ ] Commit history đủ các giai đoạn từ RBL-1 đến RBL-5 (không phải 1 commit cuối)
- [ ] README.md ở root: mô tả đề tài + cách reproduce experiment
- [ ] data/raw/ có file thật + README mô tả nguồn
- [ ] results/full_llm_output.csv + full_analysis.ipynb có trong repo
- [ ] paper/main.tex + references.bib + sections/*.tex có trong repo
- [ ] paper/output/paper_final.pdf có trong repo
- [ ] Không có API key, .env , __pycache__/ trong repo
