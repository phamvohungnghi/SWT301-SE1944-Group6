# TEAM CONTRIBUTION STATEMENT (BÁO CÁO ĐÓNG GÓP THÀNH VIÊN)

**Project:** RBL-5 Paper & Final Presentation — SWT301 (SE1944)  
**Group:** Group 6 — FPT University, 2026  
**Paper Title:** *Evaluating First-Attempt Zero-Shot GPT-4o Unit Test Generation on Java and Python Methods with Controlled Cyclomatic Complexity*  

---

## 📊 Summary of Contributions (Tóm tắt tỉ lệ đóng góp)

We, the undersigned members of Group 6, confirm that all 5 members have contributed **equally (20.0% each)** to the successful execution, empirical evaluation, paper writing, and final presentation of this RBL-5 project.

| Student Name | Student Role | Main Work Packages | Contribution % | Status |
|---|---|---|:---:|:---:|
| **Phạm Võ Hùng Nghi** | Project Lead (PL) | Executive Leadership, Abstract, Discussion, Conclusion, Overleaf & Replication Package | **20.0%** | ✅ Completed |
| **Nguyễn Tuấn Vinh** | Dataset Lead (WP1) | Code Collection, Lizard CC 5–15 Filtering, Dataset Manifest & SHA-256 Freezing | **20.0%** | ✅ Completed |
| **Nguyễn Hoàng Gia Thái** | Model & API Lead (WP2) | Prompt Engineering, Context Injection, OpenAI API Execution, Token & Cost Analysis | **20.0%** | ✅ Completed |
| **Vương Minh Quân** | Metrics & Stats Lead (WP3) | Java Toolchain Setup (JaCoCo, PIT), Randoop Baseline, Results & Statistical Tests | **20.0%** | ✅ Completed |
| **Nguyễn Tường Văn** | Python Pipeline & SLR Lead (WP4) | Python Pipeline Execution (coverage.py & pytest-mutagen), SLR, Intro, Related Work, Threats & Slides | **20.0%** | ✅ Completed |
| **TOTAL** | — | — | **100.0%** | **Equal Contribution** |

---

## 📝 Detailed Breakdown per Member (Chi tiết công việc từng thành viên)

### 1. Phạm Võ Hùng Nghi (Project Lead) — 20%
- **Leadership & Governance:** Overall project planning, timeline enforcement, protocol amendment authorization (`notes.md`).
- **Paper Writing:**
  - `paper/sections/00_abstract.tex`: Drafted final 5-sentence IEEE abstract with exact empirical numbers.
  - `paper/sections/05_discussion.tex`: Interpreted findings, comparisons with prior literature (TestPilot, AgoneTest, ChatTester), and practical implications.
  - `paper/sections/07_conclusion.tex`: Formulated final summary, limitations, and future work.
- **Packaging & Quality:** Created `paper.zip`, compiled `paper_final.pdf`, managed GitHub replication package, and ran AI-content detection checks (`ai_check_log.md`).

### 2. Nguyễn Tuấn Vinh (Dataset Lead) — 20%
- **Dataset Construction:** Screened public open-source Java/Python repositories and course project repositories.
- **Complexity Filtering:** Used Lizard 1.23.0 to measure Cyclomatic Complexity, enforcing strict filtering ($5 \le \text{CC} \le 15$).
- **Isolation & Freeze:** Performed independent isolation review (no DB, network, or clock dependencies) and generated frozen `experiment/dataset-manifest.csv` with SHA-256 hashes.
- **Paper Writing:** Authored `paper/sections/03_method.tex` (§3.1 Dataset and Subject Units).

### 3. Nguyễn Hoàng Gia Thái (Model & API Lead) — 20%
- **API Pipeline:** Integrated official OpenAI API using snapshot `gpt-4o-mini-2024-07-18` with deterministic parameters (`temperature=0.0`, `max_tokens=2048`).
- **Prompt Engineering:** Designed language-specific system prompts and minimal context injection (supplying up to 200 lines of source context).
- **Execution & Cost Monitoring:** Executed 60 batch API requests, logged raw JSON payloads, and computed token consumption ($0.0789 USD).
- **Paper Writing:** Authored `paper/sections/03_method.tex` (§3.2 LLM Setup, §3.3 Prompt Engineering, §3.4 Execution Cost & Table I).

### 4. Vương Minh Quân (Metrics & Statistics Lead) — 20%
- **Evaluation Toolchain:** Configured JaCoCo 0.8.13 (Java branch coverage) and PIT 1.19.1 (Java mutation score).
- **Baseline Execution:** Ran Randoop 4.3.4 baseline across 25 Java units with pinned seed `20260621` (60s time budget per unit).
- **Statistical Testing:** Implemented `evaluation/integrated_statistics.py` for non-parametric tests (Sign test, Wilcoxon signed-rank test, Spearman rank correlation, Holm-Bonferroni correction).
- **Paper Writing:** Authored `paper/sections/03_method.tex` (§3.5 Metrics, §3.6 Statistical Plan) and `paper/sections/04_results.tex` (Section 4 Results & Tables II, III, IV).

### 5. Nguyễn Tường Văn (Python Pipeline & Literature Lead) — 20%
- **Python Pipeline Execution:** Chạy toàn bộ pipeline thực nghiệm sinh unit test trên 25 hàm Python, đo đạc chỉ số Branch Coverage bằng `coverage.py 7.14.2` và Mutation Score bằng `pytest-mutagen 1.3`.
- **Systematic Literature Review:** Reviewed 10 foundational papers on LLM unit test generation and search-based testing.
- **Paper Writing:**
  - `paper/sections/01_intro.tex`: Authored 5-paragraph IEEE introduction, motivation, research gap, and 4 contribution bullets.
  - `paper/sections/02_related.tex`: Authored Related Work (§2.1 Zero-shot, §2.2 Feedback-driven, §2.3 Research Positioning).
  - `paper/sections/06_threats.tex`: Authored Threats to Validity (Internal, Construct, External, Conclusion validity).
- **Presentation Design:** Designed the 9-slide defense presentation outline (`presentation/slides_final.md`).

---

## ✒️ Member Sign-off (Xác nhận của thành viên)

By submitting this document, all group members agree with the contribution percentages and task distribution detailed above:

- [x] **Phạm Võ Hùng Nghi** (Project Lead)
- [x] **Nguyễn Tuấn Vinh** (Dataset Lead)
- [x] **Nguyễn Hoàng Gia Thái** (Model & API Lead)
- [x] **Vương Minh Quân** (Metrics & Stats Lead)
- [x] **Nguyễn Tường Văn** (Python Pipeline Lead)
