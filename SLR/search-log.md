Search Log - LLM for Unit Test Case Generation
Thành viên: Nguyen Tuan Vinh
Ngày thực hiện: 2026-06-03

Chuỗi tìm kiếm (Query Strings)

String A (Tổng hợp các khía cạnh: LLM, Unit Test Gen, Java/Python, Coverage, Mutation)
- Query nguyên văn:
  `("GPT-4" OR "Large Language Model" OR LLM) AND ("unit test generation" OR "automated test generation" OR "test case generation") AND (Java OR Python) AND ("branch coverage" OR "code coverage") AND ("mutation testing" OR "mutation score")`
- Database: IEEE Xplore, ACM Digital Library, Semantic Scholar
- Bộ lọc: Year 2020-2026, English only, Publications (Articles/Conference Papers)
- Số kết quả: 6 (sau khi hợp nhất kết quả tìm kiếm từ các database)

String B (Tập trung vào GPT-4, Unit Test, Branch Coverage, Java/Python)
- Query nguyên văn:
  `("GPT-4") AND ("unit test generation") AND ("branch coverage") AND (Java OR Python)`
- Database: IEEE Xplore, ACM Digital Library, Semantic Scholar
- Bộ lọc: Year 2023-2026 (sau khi GPT-4 ra mắt)
- Số kết quả: 2

String C (Tập trung vào GPT-4, Unit Test, Mutation Testing, Java/Python)
- Query nguyên văn:
  `("GPT-4") AND ("unit test generation") AND ("mutation score" OR "mutation testing") AND (Java OR Python)`
- Database: IEEE Xplore, ACM Digital Library, Semantic Scholar
- Bộ lọc: Year 2023-2026
- Số kết quả: 10

---

Tổng hợp trước dedup

| Database / Source | Search String | Kết quả (sau khi tổng hợp) |
| :--- | :--- | :--- |
| IEEE Xplore, ACM DL, Semantic Scholar | String A | 6 |
| IEEE Xplore, ACM DL, Semantic Scholar | String B | 2 |
| IEEE Xplore, ACM DL, Semantic Scholar | String C | 10 |
| Tổng trước dedup | | 18 |
| Số trùng lặp bị loại | | 2 |
| Tổng sau dedup (đưa vào V1) | | 16 |

---

Phần S - Cross-reference Search (Snowballing)
- Phương pháp: Backward snowballing - đọc danh mục tài liệu tham khảo (references) của các bài báo đã pass V2 screening.
- Công cụ: CrossRef (crossref.org) để tìm định danh DOI; Google Scholar để tra cứu trích dẫn.
- Ngày thực hiện: 2026-06-03
- Paper included đã scan: 8 papers (từ danh sách tìm kiếm cơ sở dữ liệu ban đầu đã pass V2)
- Kết quả: Phát hiện thêm 2 bài báo liên quan sâu sắc qua trích dẫn chéo và đưa vào danh sách screening:
  1. Bài 17: "No More Manual Tests? Evaluating and Improving ChatGPT for Unit Test Generation" (Zhiqiang Yuan et al., FSE 2024) - phát hiện từ tài liệu tham khảo của bài Lops 2025 (AgoneTest).
  2. Bài 18: "An Empirical Evaluation of Using Large Language Models for Automated Unit Test Generation" (Max Schäfer et al., IEEE TSE 2024) - phát hiện từ tài liệu tham khảo của bài Lu 2026 (Beyond Coverage).

---

Ghi chú
- Công cụ lọc trùng (Dedup): Python custom script (check_title)
