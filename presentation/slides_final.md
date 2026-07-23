# RBL-5 Final Presentation — Slide Outline
**File:** `presentation/slides_final.pptx` (export → `slides_final.pdf`)  
**Duration:** 10–12 phút | **Venue:** SWT301 Final Defense

---

## Slide 1 — Title (30 giây)

**Title:**  
Evaluating First-Attempt Zero-Shot GPT-4o Unit Test Generation  
on Java and Python Functions with Controlled Cyclomatic Complexity

**Subtitle:** SWT301 — Group 6 | FPT University, 2026  
**Authors:** Nghi (PL) · Vinh · Thái · Quân · Văn

---

## Slide 2 — The Problem (1 phút)

**Heading:** Writing Unit Tests Is Expensive — And Gets Harder as Code Gets Complex

**Key points (bullet, không text dài):**
- Manual unit testing for complex functions = disproportionate dev time
- CC 5–15: real branching logic, not trivial getters
- LLMs can generate tests — but *first-attempt quality* on complex code is unknown
- We don't know if LLMs beat random tools (Randoop) on these cases

**Visual:** Diagram showing CC vs. manual test effort (arrow going up)

---

## Slide 3 — Research Gap & Questions (1.5 phút)

**Heading:** What Nobody Has Measured Yet

**GAP (highlight box):**  
No prior study has: (a) filtered by CC band + (b) zero-shot single-attempt + (c) paired baseline, in one pre-registered design.

**Research Questions:**
- **RQ1:** Does median branch coverage exceed 75%? (Java & Python separately)
- **RQ2:** Do GPT tests outperform Randoop on mutation score? (Java)
- **RQ3:** Does higher CC correlate with lower test quality?

**H₀ statements:** Show as 3 concise null hypotheses

---

## Slide 4 — Dataset & Pipeline (1.5 phút)

**Heading:** 50 Functions, 2 Languages, 1 Frozen Protocol

**Left panel — Dataset:**
- 25 Java methods + 25 Python functions
- CC strictly 5–15 (Lizard 1.23.0)
- Public repos, commit-SHA pinned, manifest frozen before API call
- Isolation: no network/DB/clock/global state

**Right panel — Pipeline diagram:**
```
Frozen Manifest
    ↓
gpt-4o-mini-2024-07-18
(1 prompt, 1 response, no repair)
    ↓
JaCoCo / coverage.py → Branch Coverage
PIT → Mutation Score (Java)
Randoop 4.3.4 → Baseline (Java)
```

---

## Slide 5 — Metrics & Statistical Design (1 phút)

**Heading:** Pre-Registered, Non-Parametric, Holm-Corrected

**Table:**

| Metric | Tool | Used for |
|---|---|---|
| Branch Coverage | JaCoCo 0.8.13 / coverage.py 7.14.2 | RQ1, RQ3 |
| Mutation Score | PIT 1.19.1 | RQ2, RQ3 |
| Executability | JUnit 5.11.4 / pytest 9.1.1 | Baseline |

**Statistical tests:**
- RQ1: One-sided sign test × 2 languages → Holm correction
- RQ2: One-sided paired Wilcoxon + bootstrap CI
- RQ3: Spearman ρ (left-tailed), exploratory

---

## Slide 6 — Results: Executability + RQ1 (1.5 phút)

**Heading:** High Coverage, Even on the First Try

**Executability:**
- Java: **24/25** executable (96%) — 1 compile error
- Python: **22/25** executable (88%) — 3 truncated by token limit

**RQ1 — Branch Coverage Table:**

| Language | n valid | Median | k > 75% | p (Holm) |
|---|---|---|---|---|
| Java | 24/25 | **95.5%** | 23/24 | 2.98 × 10⁻⁶ |
| Python | 22/25 | **100%** | 19/22 | 4.28 × 10⁻⁴ |

**→ Reject H₀ for both languages**

**Note:** Worst-case sensitivity (assign 0% to non-executable) → still reject H₀

---

## Slide 7 — Results: RQ2 vs. Randoop (1.5 phút)

**Heading:** GPT vs. Randoop — Not Even Close

**Visual:** Bar chart or box plot (use `fig2_comparison.png`)

**Key numbers (big & bold):**

| | GPT-4o-mini | Randoop |
|---|---|---|
| Median mutation score | **86.6%** | **14.8%** |
| Median gap | +62.1 pp (CI: 31.6–84.6 pp) |
| Wilcoxon p | **6.58 × 10⁻⁵** |
| Cliff's δ | **0.79 (large)** |

**Example:** `isValidEmail` — Randoop: 4.8%, GPT: 100%  
**→ Reject H₀ for RQ2**

---

## Slide 8 — Discussion & Limitations (1.5 phút)

**Heading:** What We Learned — and What We Can't Claim

**Why GPT wins:**
- Semantic understanding → domain-meaningful inputs
- Random enumeration can't construct valid emails, RPN expressions, etc.

**Failure modes to watch:**
- Token truncation → SyntaxError (fix: bump max_tokens to 4,096)
- Validation functions → happy-path only coverage

**Limitations:**
- Only CC 5–15 standalone functions — may not generalize
- Single model snapshot — may not hold for other LLMs
- Python mutation tool (pytest-mutagen 1.3) couldn't evaluate automatically

---

## Slide 9 — Conclusion & Future Work (1 phút)

**Heading:** Context Beats Randomness — At CC 5–15

**Conclusion bullets:**
- ✅ RQ1: Median branch coverage > 75% for both Java and Python (p < 0.001)
- ✅ RQ2: GPT outperforms Randoop by 62 pp median on mutation (δ=0.79)
- ➡ RQ3: Higher CC → lower branch coverage (moderate negative correlation)

**Future work:**
1. Extend CC range beyond 15 (class-level, complex business logic)
2. Add automatic truncation-retry (token limit fix)
3. Replicate with other LLMs (GPT-4o, DeepSeek, Llama)

**Replication package:**  
🔗 `github.com/phamvohungnghi/SWT301-SE1944-Group6`

---

## Speaker Notes Summary

| Slide | Presenter | Key message |
|---|---|---|
| 1 | Nghi | Title + team |
| 2 | Nghi / Văn | Problem motivation |
| 3 | Nghi | RQ + GAP |
| 4 | Vinh + Thái | Dataset + pipeline |
| 5 | Quân | Stats design |
| 6–7 | Quân + Thái | Results |
| 8 | Nghi | Discussion |
| 9 | Nghi | Conclusion |

---

## Q&A Prep Checklist

- [ ] Tại sao chọn CC 5–15 mà không phải range khác?
- [ ] Tại sao dùng sign test thay vì t-test?
- [ ] Randoop với time budget 60s có fair không?
- [ ] Python mutation score NA — có làm giảm tính valid không?
- [ ] Nếu làm lại, sẽ thay đổi gì?
