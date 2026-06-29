IE Criteria - LLM for Unit Test Case Generation
Thành viên: Nguyen Tuan Vinh
RQ: "Đối với Java/Python functions ở cyclomatic complexity trung bình (P), GPT-4 tự động sinh unit test cases (I) so với test cases viết thủ công bởi sinh viên (C) có đạt branch coverage >= 80% và mutation score >= 60% không (O)?"

PICO:
- P (Population): Java và Python functions có độ phức tạp cyclomatic complexity trung bình (từ 5 đến 15, đo bằng Lizard).
- I (Intervention): GPT-4 tự động sinh unit test cases (hoặc LLM/mô hình sinh test tự động).
- C (Comparison): Kiểm thử viết thủ công bởi sinh viên và kiểm thử tự động sinh bởi công cụ truyền thống (như Randoop).
- O (Outcome): Branch coverage (đạt >= 80%) và mutation score (đạt >= 60%, phân tích qua PIT/pytest-mutagen).

---

Inclusion Criteria (IC) - Paper phải thỏa mãn TẤT CẢ các điều kiện sau
| Mã | Tiêu chí | Chi tiết |
| :--- | :--- | :--- |
| IC-L | Ngôn ngữ | Viết bằng tiếng Anh. |
| IC-Y | Năm xuất bản | Xuất bản từ năm 2020 đến nay. Lý do: Các mô hình ngôn ngữ lớn (LLM) và đặc biệt là dòng mô hình GPT của OpenAI bắt đầu được nghiên cứu ứng dụng rộng rãi trong Kỹ nghệ phần mềm từ năm 2020. |
| IC-T | Loại tài liệu | Đăng trên hội nghị (conference) hoặc tạp chí (journal) khoa học có phản biện (peer-reviewed) - không phải blog, thesis, hay báo cáo kỹ thuật chưa xuất bản. |
| IC-P | Task cụ thể (Population) | Nghiên cứu về việc sinh unit test case tự động cho mã nguồn Java hoặc Python. |
| IC-I | Kỹ thuật cụ thể (Intervention) | Sử dụng kỹ thuật dựa trên các Mô hình ngôn ngữ lớn (LLM) như GPT-4, GPT-3.5 hoặc các mô hình mã nguồn mở có kích thước lớn tương đương. |
| IC-E | Kết quả thực nghiệm | Có ít nhất 1 kết quả thực nghiệm bằng con số cụ thể về branch coverage hoặc mutation score hiển thị ở các Bảng (Table) hoặc Hình vẽ (Figure) trong bài gốc. |

Exclusion Criteria (EC) - Loại nếu thỏa mãn BẤT KỲ điều kiện nào sau đây
| Mã | Tiêu chí | Chi tiết |
| :--- | :--- | :--- |
| EC-D | Trùng lặp | Trùng lặp với bài báo đã được đưa vào danh sách trước đó. |
| EC-A | Không có toàn văn | Không thể truy cập hoặc tải được bản toàn văn (full-text) của bài viết để đọc sâu. |
| EC-S | Độ dài bài viết | Bài viết dưới 4 trang (ví dụ: poster, extended abstract, short workshop paper). |
| EC-N | Thiếu thực nghiệm | Không có đánh giá thực nghiệm (ví dụ: các bài báo vị thế - position paper, tầm nhìn - vision paper, tutorial, hoặc survey tổng quan). |
| EC-O | Sai chủ đề | Không tập trung vào unit test generation (ví dụ: sinh test ở mức giao diện/UI testing, kiểm thử hệ thống/system testing, kiểm thử tích hợp/integration testing; sinh mã nguồn thông thường không chứa test case/assertions; hoặc các bài viết chỉ phân tích/thực thi test có sẵn/bảo trì test). |

---

Checklist tự kiểm tra (Self-Checklist)
- [x] Đủ 6 IC (IC-L, IC-Y, IC-T, IC-P, IC-I, IC-E) và 5 EC (EC-D, EC-A, EC-S, EC-N, EC-O)
- [x] IC-P chứa tên task cụ thể (sinh unit test case tự động cho Java hoặc Python)
- [x] IC-I chứa loại kỹ thuật cụ thể (LLM như GPT-4, GPT-3.5)
- [x] EC-O liệt kê ít nhất 2 task dễ bị nhầm (UI/system/integration testing, general code gen, test execution/maintenance)
- [x] IC-Y có lý do chọn năm xuất bản rõ ràng (1 câu lý giải kỹ thuật xuất hiện từ 2020)
