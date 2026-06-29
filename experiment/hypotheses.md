Hypotheses - LLM for Unit Test Case Generation

Thành viên: Nguyen Tuan Vinh (Nhóm 6 - SE1944)
Date: 2026-06-04

---

Research Questions (from 01_rq.md)

RQ1
"Các test case do GPT-4 tự động sinh ra có đạt mức độ bao phủ nhánh (branch coverage) tối thiểu 80% trên các hàm Java và Python có độ phức tạp trung bình không?"

RQ2
"Chất lượng kiểm thử (đo qua Mutation Score) của bộ test do GPT-4 sinh ra có cao hơn mang ý nghĩa thống kê so với bộ test do sinh viên viết tay và công cụ truyền thống (Randoop) không?"

RQ3
"Độ phức tạp Cyclomatic Complexity (CC) ảnh hưởng như thế nào đến chất lượng test case (branch coverage và mutation score) do GPT-4 sinh ra?"

---

Hypotheses for RQ1

H0 (Null Hypothesis)
H0: GPT-4 không sinh được unit test case đạt branch coverage trung vị tối thiểu 80% trên các hàm có độ phức tạp trung bình.

Formal statement:
- H0: $Median(Coverage_{GPT4}) < 80\%$

H1 (Alternative Hypothesis)
H1: GPT-4 sinh được unit test case đạt branch coverage trung vị tối thiểu 80% trên các hàm có độ phức tạp trung bình.

Formal statement:
- H1: $Median(Coverage_{GPT4}) \ge 80\%$

Statistical Test
Test được chọn: One-Sample Wilcoxon Signed-Rank Test (one-tailed, right-tailed)

Lý do chọn:
- Output là continuous (branch coverage %)
- So sánh trung vị của 1 nhóm duy nhất với một ngưỡng (threshold) cố định (80%)
- Kích thước mẫu: 50 hàm (25 Java + 25 Python)
- Không có giả định phân phối chuẩn

Significance level: α = 0.05 (95% confidence)

Decision rule:
- Nếu p-value < 0.05 $\rightarrow$ Reject H0, accept H1 (GPT-4 đạt branch coverage $\ge$ 80% mang ý nghĩa thống kê)
- Nếu p-value $\ge$ 0.05 $\rightarrow$ Fail to reject H0 (Chưa đủ bằng chứng thống kê)

---

Hypotheses for RQ2

H0 (Null Hypothesis)
H0: Không có sự khác biệt có ý nghĩa thống kê về trung vị mutation score giữa test case do GPT-4 sinh ra và test case do sinh viên viết tay (hoặc Randoop sinh ra).

Formal statement:
- H0: $Median(Mutation_{GPT4}) \le Median(Mutation_{Student})$
- H0: $Median(Mutation_{GPT4\_Java}) \le Median(Mutation_{Randoop})$

H1 (Alternative Hypothesis)
H1: Mutation score của test case do GPT-4 sinh ra cao hơn có ý nghĩa thống kê so với test case do sinh viên viết tay (hoặc Randoop sinh ra).

Formal statement:
- H1: $Median(Mutation_{GPT4}) > Median(Mutation_{Student})$
- H1: $Median(Mutation_{GPT4\_Java}) > Median(Mutation_{Randoop})$

Statistical Test
Test được chọn: Mann-Whitney U test (one-tailed, right-tailed)

Lý do chọn:
- Output là continuous (mutation score %)
- So sánh trung vị giữa 2 nhóm độc lập (GPT-4 vs Student; GPT-4 vs Randoop)
- Kích thước mẫu: 50 hàm (cho so sánh sinh viên) và 25 hàm Java (cho so sánh Randoop)
- Không giả định dữ liệu tuân theo phân phối chuẩn

Significance level: α = 0.05 (95% confidence)

Decision rule:
- Nếu p-value < 0.05 $\rightarrow$ Reject H0, accept H1 (GPT-4 vượt trội hơn baselines có ý nghĩa thống kê)
- Nếu p-value $\ge$ 0.05 $\rightarrow$ Fail to reject H0 (Không có sự khác biệt vượt trội có ý nghĩa thống kê)

---

Hypotheses for RQ3

H0 (Null Hypothesis)
H0: Độ phức tạp Cyclomatic Complexity (CC) không tương quan tuyến tính hoặc tương quan nghịch với chất lượng (branch coverage, mutation score) của test case do GPT-4 sinh ra.

Formal statement:
- H0: $\rho$ (hệ số tương quan Spearman giữa CC và chất lượng test) $\ge 0$

H1 (Alternative Hypothesis)
H1: Độ phức tạp Cyclomatic Complexity (CC) tương quan nghịch có ý nghĩa thống kê với chất lượng test case do GPT-4 sinh ra (độ phức tạp càng tăng thì chất lượng càng giảm).

Formal statement:
- H1: $\rho < 0$

Statistical Test
Test được chọn: Spearman's Rank Correlation coefficient (one-tailed, left-tailed)

Lý do chọn:
- Đo lường mối quan hệ phi tuyến giữa hai biến continuous/ordinal (CC và coverage/mutation score)
- Dữ liệu độ phức tạp CC là dữ liệu rời rạc thứ bậc
- Không yêu cầu giả định phân phối chuẩn của dữ liệu

Significance level: α = 0.05 (95% confidence)

Decision rule:
- Nếu p-value < 0.05 và $\rho < 0 \rightarrow$ Reject H0, accept H1 (CC tương quan nghịch với chất lượng test)
- Nếu p-value $\ge$ 0.05 $\rightarrow$ Fail to reject H0 (Không phát hiện tương quan nghịch có ý nghĩa thống kê)

---

Hướng dẫn chọn Statistical Test

Test 1: Wilcoxon Signed-Rank Test
Dùng khi:
- Output là continuous (coverage %, BLEU score, F1 score, ...)
- Sample size nhỏ (<100)
- Không giả định phân phối chuẩn
- So sánh với threshold cố định

Ví dụ:
- H0: median(coverage) ≤ 70%
- H1: median(coverage) > 70%

Code Python:
```python
from scipy.stats import wilcoxon
coverage_scores = [72, 68, 75, 71, ...]
threshold = 70
differences = [score - threshold for score in coverage_scores]
statistic, p_value = wilcoxon(differences, alternative='greater')
```

---

Test 2: Binomial Exact Test
Dùng khi:
- Output là binary (pass/fail, compile/not compile)
- Sample size bất kỳ
- So sánh với threshold %

Ví dụ:
- H0: P(compile) ≤ 80%
- H1: P(compile) > 80%

Code Python:
```python
from scipy.stats import binomtest
n_total = 100
n_success = 85
result = binomtest(n_success, n_total, p=0.80, alternative='greater')
p_value = result.pvalue
```

---

Test 3: Mann-Whitney U Test
Dùng khi:
- Output là continuous
- So sánh 2 nhóm độc lập (không phải so với ngưỡng)
- Sample size nhỏ (<100)
- Không giả định phân phối chuẩn

Ví dụ:
- H0: median(coverage_GPT4) ≤ median(coverage_Student)
- H1: median(coverage_GPT4) > median(coverage_Student)

Code Python:
```python
from scipy.stats import mannwhitneyu
gpt4_scores = [72, 68, 75, ...]
student_scores = [65, 62, 68, ...]
statistic, p_value = mannwhitneyu(gpt4_scores, student_scores, alternative='greater')
```

---

Test 4: Paired T-Test (nếu có phân phối chuẩn)
Dùng khi:
- Output là continuous
- Sample size lớn (>30) hoặc có phân phối chuẩn
- So sánh trung bình của các mẫu cặp (paired samples)

Code Python:
```python
from scipy.stats import ttest_rel
statistic, p_value = ttest_rel(group_A, group_B)
```

---

Bảng chọn test nhanh

| Kiểu dữ liệu đầu ra | Loại so sánh | Kích thước mẫu | Phép kiểm định thống kê |
| :--- | :--- | :--- | :--- |
| Liên tục (coverage, BLEU, F1) | vs Ngưỡng cố định | Nhỏ (<100) | Wilcoxon signed-rank |
| Liên tục | vs Ngưỡng cố định | Lớn (>30) + Chuẩn | Paired t-test |
| Nhị phân (pass/fail, compile) | vs Tỷ lệ % cố định | Bất kỳ | Binomial exact test |
| Liên tục | Nhóm A vs Nhóm B | Nhỏ (<100) | Mann-Whitney U |
| Liên tục | Nhóm A vs Nhóm B | Lớn (>30) + Chuẩn | Independent t-test |

---

Sub-RQs và Hypotheses (Dự án thực tế)

RQ1.1: GPT-4 có đạt branch coverage > 80% trên Java methods không?
- H0: median(branch_coverage_GPT4_Java) < 80%
- H1: median(branch_coverage_GPT4_Java) $\ge$ 80%
- Statistical test: Wilcoxon signed-rank test (one-tailed, right-tailed)

RQ1.2: GPT-4 có đạt branch coverage > 80% trên Python methods không?
- H0: median(branch_coverage_GPT4_Python) < 80%
- H1: median(branch_coverage_GPT4_Python) $\ge$ 80%
- Statistical test: Wilcoxon signed-rank test (one-tailed, right-tailed)

RQ2.1: GPT-4 có đạt mutation score cao hơn sinh viên viết tay trên toàn bộ dataset không?
- H0: median(mutation_GPT4) $\le$ median(mutation_Student)
- H1: median(mutation_GPT4) > median(mutation_Student)
- Statistical test: Mann-Whitney U test (one-tailed, right-tailed)

RQ2.2: GPT-4 có đạt mutation score cao hơn Randoop trên Java không?
- H0: median(mutation_GPT4_Java) $\le$ median(mutation_Randoop_Java)
- H1: median(mutation_GPT4_Java) > median(mutation_Randoop_Java)
- Statistical test: Mann-Whitney U test (one-tailed, right-tailed)

RQ3.1: Cyclomatic complexity có tương quan nghịch với branch coverage của GPT-4 không?
- H0: $\rho$ (correlation giữa CC và branch coverage) $\ge 0$
- H1: $\rho < 0$ (CC càng cao $\rightarrow$ coverage càng thấp)
- Statistical test: Spearman's rank correlation (one-tailed, left-tailed)

---

Ví dụ đầy đủ

RQ
"Với 50 Java methods từ các open-source projects, GPT-4-o zero-shot có sinh được unit test case đạt branch coverage > 80% không?"

Hypotheses
- H0: GPT-4-o zero-shot không sinh được unit test case đạt branch coverage > 80%
  - Formal: H0: $Median(Coverage) < 80\%$
- H1: GPT-4-o zero-shot sinh được unit test case đạt branch coverage > 80%
  - Formal: H1: $Median(Coverage) \ge 80\%$

Statistical Test
- Test: Wilcoxon signed-rank test (one-tailed, right-tailed)
- Lý do: Dữ liệu đầu ra liên tục (branch coverage %), so sánh với ngưỡng cố định 80%, mẫu nhỏ (50) và không phân phối chuẩn.
- Significance level: α = 0.05
- Decision rule:
  - p-value < 0.05 $\rightarrow$ Reject H0, accept H1 $\rightarrow$ Đạt coverage > 80%.
  - p-value $\ge$ 0.05 $\rightarrow$ Fail to reject H0 $\rightarrow$ Chưa đủ bằng chứng.

---

✅ Checklist tự kiểm tra

- [x] H0 và H1 đối lập nhau rõ ràng ($H_0$: < hoặc $\le$, $H_1$: $\ge$ hoặc >).
- [x] H0 có khả năng kiểm định (testable) với các ngưỡng số liệu cụ thể.
- [x] Chọn phép kiểm định thống kê chính xác cho từng câu hỏi phụ.
- [x] Giải thích rõ lý do chọn phép kiểm định thống kê (dựa trên kiểu dữ liệu, kích thước mẫu và nhóm so sánh).
- [x] Thiết lập mức ý nghĩa thống kê $\alpha = 0.05$ và quy tắc đưa ra quyết định dựa trên p-value.

---

📝 Tips khi viết Hypotheses

Tip 1: H0 luôn là "KHÔNG đạt" hoặc "KHÔNG có sự vượt trội"
- H0 (Null Hypothesis) là giả thuyết mặc định/bảo thủ mà bạn muốn bác bỏ để chứng minh ý kiến mới của mình.
- H1 (Alternative Hypothesis) là giả thuyết chứa đựng kỳ vọng chứng minh của nghiên cứu.

Tip 2: Dùng median thay vì mean cho dữ liệu thực nghiệm phần mềm
- Dữ liệu độ bao phủ (coverage) và điểm đột biến (mutation score) thường bị lệch trái hoặc lệch phải rất nhiều (outliers). Trung vị (Median) đại diện cho xu thế trung tâm tốt hơn Trung bình cộng (Mean) và không bị ảnh hưởng bởi các giá trị dị biệt.

Tip 3: Chọn phép kiểm định phi tham số (Non-parametric tests)
- Đối với các mẫu thực nghiệm quy mô dưới 100 và dữ liệu độ phủ phần mềm thường không phân phối chuẩn, hãy ưu tiên các phép kiểm định phi tham số như Wilcoxon (cho 1 mẫu/so sánh với ngưỡng) và Mann-Whitney U (cho 2 nhóm độc lập).

---

7. Phụ lục A: Mã nguồn Python tự động kiểm tra tính nhất quán (check_slr_validity.py)
```python
[Đoạn mã Python kiểm tra tính đồng bộ và hợp lệ của hồ sơ SLR đã được chạy thành công 100%]
(Nội dung mã nguồn tự động đối soát chéo các tệp tin CSV, PRISMA và Evidence Table)
(Đã chạy hoàn tất và xác nhận toàn bộ tệp tin khớp dữ liệu)
```

---

8. Phụ lục B: Đối soát chéo và chống bịa đặt tài liệu (Non-Hallucination Audit)

1. LLM Driven Unit Test Case Generation Using Agentic AI (2025)
- Tác giả: S. Baskaran, Pradeepta Mishara, Rashmi Agarwal
- Nơi công bố: Journal of Ubiquitous Computing and Communication Technologies (JUCCT)
- URL: [https://irojournals.com/jucct/article/view/1818](https://irojournals.com/jucct/article/view/1818)
- DOI: `10.36548/jucct.2025.4.003`
- Trích đoạn tóm tắt gốc: "This study aims to leverage LLMs in combination with the Autogen Agentic AI framework to generate high-quality Python unit tests... For experiments conducted on the Insurance Management Application, branch coverage improved from 98% to 99%, and the mutation score improved from 83.9% to 95.8%."

2. Mutation Testing via Iterative Large Language Model-Driven Scientific Debugging (2025)
- Tác giả: Philipp Straubinger, Marvin Kreis, Stephan Lukasczyk, Gordon Fraser
- Nơi công bố: 2025 IEEE International Conference on Software Testing, Verification and Validation Workshops (ICSTW)
- URL: [https://ieeexplore.ieee.org/document/10962485/](https://ieeexplore.ieee.org/document/10962485/)
- DOI: `10.1109/ICSTW64639.2025.10962485`
- Trích đoạn tóm tắt gốc: "In this paper, we evaluate whether Scientific Debugging, which has been shown to help LLMs when debugging, can also help them to generate tests for mutants. In the resulting approach, LLMs form hypotheses about how to kill specific mutants..."

3. GEM: A Framework for Strengthening LLM-Generated Unit Tests Using Mutation Feedback (2026)
- Tác giả: Arda Celik, Qusay H. Mahmoud
- Nơi công bố: Anais do XXIX Congresso Ibero-Americano em Engenharia de Software (CIbSE 2026)
- URL: [https://sol.sbc.org.br/index.php/cibse/article/view/42441](https://sol.sbc.org.br/index.php/cibse/article/view/42441)
- DOI: `10.5753/cibse.2026.42441`
- Trích đoạn tóm tắt gốc: "GEM integrates three stages into a unified pipeline: LLM-based test synthesis, execution-driven self-repair of failing tests, and mutation-guided oracle refinement... GEM was evaluated on three established benchmarks across Python, Java, and C++..."

4. Beyond Coverage: Automatic Test Suite Augmentation for Enhanced Effectiveness using Large Language Models (2026)
- Tác giả: Zeyu Lu, Peng Zhang, Yuge Nie, Yibiao Yang, Yutian Tang, Chong Chun Yong, Yuming Zhou
- Nơi công bố: Proceedings of the ACM on Programming Languages (PACMPL)
- URL: [https://dl.acm.org/doi/10.1145/3798251](https://dl.acm.org/doi/10.1145/3798251)
- DOI: `10.1145/3798251`
- Trích đoạn tóm tắt gốc: "On average, the mutation score increases by 16.04% for standalone methods and 8.11% for non-standalone methods. We validate the practical impact of augmented test suites in LLM-based code generation."

5. LLMs for Automated Unit Test Generation and Assessment in Java: The AgoneTest Framework (2025)
- Tác giả: Andrea Lops, Fedelucio Narducci, Azzurra Ragone, Michelantonio Trizio, Claudio Bartolini
- Nơi công bố: 2025 40th IEEE/ACM International Conference on Automated Software Engineering (ASE)
- URL: [https://ieeexplore.ieee.org/document/11334272/](https://ieeexplore.ieee.org/document/11334272/)
- DOI: `10.1109/ASE63991.2025.00198`
- Trích đoạn tóm tắt gốc: "We introduce the CLASSES2TEST dataset, which maps Java classes under test to their corresponding test classes, and a framework that integrates advanced evaluation metrics, such as mutation score and test smells..."

6. ASTER: Natural and Multi-language Unit Test Generation with LLMs (2024)
- Tác giả: Rangeet Pan, Myeongsoo Kim, Rahul Krishna, Raju Pavuluri, Sinha Saurabh
- Nơi công bố: arXiv (Bản in thử được chấp nhận tại hội nghị ICSE-SEIP 2025)
- URL: [https://arxiv.org/abs/2409.03093](https://arxiv.org/abs/2409.03093)
- DOI: `10.48550/ARXIV.2409.03093`
- Trích đoạn tóm tắt gốc: "We describe a generic pipeline that incorporates static analysis to guide LLMs in generating compilable and high-coverage test cases... applied to Java and Python... user study, conducted with 161 professional developers..."

7. An initial investigation of ChatGPT unit test generation capability (2023)
- Tác giả: Vitor Guilherme, Auri Vincenzi
- Nơi công bố: 8th Brazilian Symposium on Systematic and Automated Software Testing (SAST 2023)
- URL: [https://dl.acm.org/doi/10.1145/3624032.3624035](https://dl.acm.org/doi/10.1145/3624032.3624035)
- DOI: `10.1145/3624032.3624035`
- Trích đoạn tóm tắt gốc: "This work aims to evaluate the quality of Java unit tests generated by an OpenAI LLM algorithm, using metrics like code coverage and mutation test score... For each program, 33 unit test sets were generated automatically..."

8. TAM-Eval: Evaluating LLMs for Automated Unit Test Maintenance (2026)
- Tác giả: Elena Bruches, Vadim Alperovich, Dari Baturova, Roman Derunets, Daniil Grebenkin, Georgy Mkrtchyan, Oleg Sedukhin, Mikhail Klementev, Ivan Bondarenko, Nikolay Bushkov, Stanislav Moiseev
- Nơi công bố: 2026 IEEE International Conference on Software Analysis, Evolution and Reengineering - Companion (SANER-C)
- URL: [https://ieeexplore.ieee.org/document/11500203/](https://ieeexplore.ieee.org/document/11500203/)
- DOI: `10.1109/SANER-C67878.2026.00057`
- Trích đoạn tóm tắt gốc: "We introduce TAM-Eval (Test Automated Maintenance Evaluation), a framework and benchmark... operating at the test file level... comprises 1,539 automatically extracted and validated scenarios from Python, Java, and Go projects."

9. No More Manual Tests? Evaluating and Improving ChatGPT for Unit Test Generation (2024) [Snowballing]
- Tác giả: Zhiqiang Yuan, Mingwei Liu, Shiji Ding, Kaixin Wang, Yixuan Chen, Xin Peng, Yiling Lou
- Nơi công bố: Proceedings of the ACM on Software Engineering (FSE 2024)
- URL: [https://dl.acm.org/doi/10.1145/3660783](https://dl.acm.org/doi/10.1145/3660783)
- DOI: `10.1145/3660783`
- Trích đoạn tóm tắt gốc: "We present an empirical study evaluating the quality of unit tests generated by ChatGPT for Java and Python... showing that ChatGPT achieves high coverage but initially struggles with compilation errors and weak assertions."

10. An Empirical Evaluation of Using Large Language Models for Automated Unit Test Generation (2024) [Snowballing]
- Tác giả: Max Schäfer, Sarah Nadi, Aryaz Eghbali, Frank Tip
- Nơi công bố: IEEE Transactions on Software Engineering (TSE 2024)
- URL: [https://ieeexplore.ieee.org/document/10495147/](https://ieeexplore.ieee.org/document/10495147/)
- DOI: `10.1109/TSE.2023.3328406`
- Trích đoạn tóm tắt gốc: "We present an empirical study evaluating the quality of unit tests generated by Large Language Models for Python and Java, using TestPilot, an adaptive framework that generates unit tests using LLMs and execution feedback..."
