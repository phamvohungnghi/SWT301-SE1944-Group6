RBL-4: Thực Nghiệm
Tuần: 7–8
Đầu vào: team-synthesis/proposal.md đã được GV phê duyệt
Output: results/full_analysis.ipynb + figures/ + commit history trên GitHub
Nguyên tắc cốt lõi: Proposal đã duyệt = hợp đồng. Không được đổi RQ, metric, threshold sau khi thấy data.
________________________________________
🚦 Trước khi bắt đầu Tuần 7 — 7 gate bắt buộc
Gate	Pass khi	Fail → làm gì
E1 Proposal duyệt	GV confirm hoặc email xác nhận	Chờ GV — cuối Tuần 6 chưa duyệt → kích hoạt Downscope
E2 Dataset	File thật đã có trong data/raw/, đúng format	DG phải xong trong Tuần 6
E3 API test	test_api.py chạy được, có 1 output mẫu	LR setup trong Tuần 6
E4 Metric script	compute_metric.py chạy trên data giả, không lỗi	MS implement trong Tuần 6
E5 Ground truth plan	Proposal §5.4 có annotation process + ngưỡng IAA	Đọc lại proposal §5.4
E6 Budget	Chi phí ước tính ≤ ngân sách có sẵn	LR tính lại theo N thực tế
E7 GitHub	Repo có, tất cả thành viên push được, .gitignore đúng	LR setup trong Tuần 5–6
🧪 Tuần 7 — Pilot
Pilot = chạy thử trên 10–20% dữ liệu để phát hiện vấn đề kỹ thuật trước khi scale toàn bộ.
7.1 — Chuẩn bị mẫu pilot (DG)
1.	Chọn ngẫu nhiên 10–20% N từ dataset với random seed cố định
Ghi seed vào notes.md 
o	Không chọn “dễ” — phải random để đại diện distribution thật.
2.	Lưu: data/pilot_sample.csv 
3.	Gán nhãn ground truth: data/pilot_ground_truth.csv 
4.	Tính IAA ngay trên pilot nếu có ≥ 2 annotators 
IAA (Inter-Annotator Agreement) = mức độ đồng thuận giữa 2 người gán nhãn, đo bằng Cohen's Kappa.
•	Kappa ≥ 0.8: tốt 
•	Kappa 0.7–0.8: chấp nhận được 
•	Kappa < 0.7: dừng, làm rõ hướng dẫn gán nhãn, gán lại 
________________________________________
7.2 — Chạy LLM trên pilot (LR)
1.	Load data/pilot_sample.csv 
2.	Chạy với cấu hình chính xác từ proposal §5.3
Model version, temperature, prompt nguyên văn. 
3.	Log từng call vào results/pilot_api_log.txt:
timestamp, response.model, cost per call 
4.	Lưu: results/pilot_llm_output.csv 
Không được: Dùng model version khác hoặc sửa prompt mà không có amendment được duyệt.
________________________________________
7.3 — Phân tích pilot (MS)
Chạy results/pilot_analysis.ipynb:
1.	Tính metric trên pilot output 
2.	Vẽ histogram phân phối 
3.	Xác nhận lại lựa chọn statistical test: 
o	Phân phối như dự kiến → giữ nguyên test đã chọn trong proposal 
o	Phân phối khác → ghi vào notes.md, báo PL, viết amendment nếu cần 
________________________________________
7.4 — Quyết định sau pilot
Kết quả pilot	Hành động
Pipeline chạy đúng, format output đúng	Tiến hành full experiment Tuần 8
Lỗi kỹ thuật nhỏ, format output, script bug	LR sửa trong ngày, không cần amendment
Metric không tính được	Báo GV ngay, viết amendment trong 24 giờ
Output rỗng > 20%	Điều tra nguyên nhân trước khi scale
Phân phối data rất khác dự kiến	Ghi vào notes.md, GV quyết định có amendment không

🔬 Tuần 8 — Full Experiment
8.1 — Gán nhãn full dataset (DG)
1.	Gán nhãn toàn bộ: data/full_ground_truth.csv 
2.	Tính IAA trên full set — phải đạt ngưỡng đã ghi trong proposal 
Nếu không đạt ngưỡng IAA: dừng, làm rõ guideline, gán lại phần conflicting trước khi chạy LLM.
________________________________________
8.2 — Chạy LLM toàn bộ (LR)
1.	Chạy trên toàn bộ dataset với cùng config như pilot 
2.	Log: results/full_api_log.txt
Ghi timestamp, response.model, cost, errors 
3.	Lưu: results/full_llm_output.csv 
4.	Commit lên GitHub sau mỗi batch lớn
Không để mất data. 
________________________________________
Xử lý lỗi API:
•	Empty response → đánh dấu INVALID, không tự điền
Xử lý lỗi API:
•	Rate limit → dùng retry với exponential backoff
Code mẫu bên dưới. 
•	Thay đổi model response format giữa chừng → báo PL ngay 
import time, random

def call_llm_with_retry(prompt, max_retries=5):
    for attempt in range(max_retries):
        try:
            response = client.chat.completions.create(...)
            return response

        except Exception as e:
            if "rate_limit" in str(e).lower() or "429" in str(e):
                wait = (2 ** attempt) + random.uniform(0, 1)  # 1s, 2s, 4s, 8s, 16s + jitter
                print(f"Rate limit hit. Retry {attempt+1}/{max_retries} sau {wait:.1f}s")
                time.sleep(wait)
            else:
                raise  # lỗi khác → không retry, raise lên để biết

    return None  # hết retry → trả None, đánh dấu INVALID
8.3 — Phân tích thống kê (MS)
Chạy results/full_analysis.ipynb:
1.	Tính metric trên toàn bộ output 
2.	Chạy statistical test đã chọn trong proposal
(α = 0.05) 
3.	Tính effect size 
Effect size = mức độ thực tế của sự khác biệt, không chỉ có ý nghĩa thống kê hay không.
•	Cohen's d hoặc Cliff's δ: nhỏ < 0.2, trung bình 0.2–0.5, lớn > 0.5 
•	p-value nhỏ nhưng effect size nhỏ → kết quả có ý nghĩa thống kê nhưng ít giá trị thực tế 
4.	Ghi kết quả vào results/summary.csv:
metric value, p-value, effect size, N 
5.	Kết luận từng RQ:
reject H0 / fail to reject H0 
Không được: Đổi statistical test sau khi xem data để ra kết quả “đẹp hơn” — đây là HARKing.
________________________________________
8.4 — Tạo figures (RW)
File figures/:
•	Mỗi figure phải có: title, axis labels, N annotation, ≥ 300 DPI 
•	Tối thiểu 2 plots: 
o	Distribution plot, boxplot/violin, cho metric chính 
o	Comparison plot nếu có comparative RQ
☁️ Chạy thực nghiệm trên Google Colab / Kaggle
Dùng khi: laptop không đủ RAM/GPU, hoặc experiment cần chạy liên tục nhiều giờ.
Chọn nền tảng
Tiêu chí	Google Colab	Kaggle Notebooks
GPU free	T4 miễn phí, giới hạn ~4–6h/ngày	T4 hoặc P100, 30h/tuần
RAM	12–15 GB	13–16 GB
Thời gian chạy liên tục	~12h, Colab Pro: 24h	~9h/session
Lưu file kết quả	Google Drive mount	Kaggle Output, tự download
Phù hợp với	API call + xử lý nhẹ	Chạy model nặng, dataset lớn
Giới hạn API key	Cần cẩn thận, xem bên dưới	Dùng Kaggle Secrets
________________________________________
Gợi ý chọn:
•	Gọi LLM API, OpenAI/Gemini, + N < 5,000 mẫu → Colab
Dễ mount Drive, chia sẻ notebook. 
•	Chạy model local, Llama, sentence-transformers, hoặc EvoSuite → Kaggle
GPU ổn định hơn.
•	Setup Google Colab
•	Bước 1 — Tạo notebook và mount Drive
•	# Cell đầu tiên — mount Google Drive để lưu kết quả
from google.colab import drive
drive.mount('/content/drive')

# Tạo thư mục output trên Drive
import os
OUTPUT_DIR = '/content/drive/MyDrive/RBL-experiment/results'
os.makedirs(OUTPUT_DIR, exist_ok=True)
•	________________________________________
•	Bước 2 — Cài đặt dependencies
•	# Cell thứ 2 — cài packages
!pip install openai sentence-transformers sacrebleu scipy -q
•	________________________________________
•	Bước 3 — Đặt API key an toàn
•	KHÔNG hardcode key vào notebook
•	# Cách đúng — dùng Colab Secrets
# biểu tượng chìa khóa bên trái
from google.colab import userdata
import os

os.environ['OPENAI_API_KEY'] = userdata.get('OPENAI_API_KEY')

# Hoặc input thủ công (key sẽ biến mất khi session kết thúc)
import getpass

os.environ['OPENAI_API_KEY'] = getpass.getpass('Enter API key: ')
Bước 4 — Upload dataset lên Drive trước khi chạy
# Load dataset từ Drive
import pandas as pd

df = pd.read_csv('/content/drive/MyDrive/RBL-experiment/data/pilot_sample.csv')
print(f"Loaded {len(df)} rows")
________________________________________
Bước 5 — Checkpoint để tránh mất kết quả khi session timeout
# Lưu sau mỗi batch — không đợi chạy xong toàn bộ mới lưu
CHECKPOINT_PATH = f'{OUTPUT_DIR}/pilot_llm_output_checkpoint.csv'
results = []

for i, row in df.iterrows():
    result = call_llm(row)        # hàm gọi API của bạn
    results.append(result)

    # Lưu checkpoint mỗi 50 dòng
    if i % 50 == 0:
        pd.DataFrame(results).to_csv(CHECKPOINT_PATH, index=False)
        print(f"Checkpoint saved: {i+1}/{len(df)}")

# Lưu final
pd.DataFrame(results).to_csv(f'{OUTPUT_DIR}/pilot_llm_output.csv', index=False)
Xử lý Colab timeout
Session bị ngắt giữa chừng:
1.	Kiểm tra checkpoint file có không:
pd.read_csv(CHECKPOINT_PATH) → xem đã chạy đến dòng nào 
2.	Lọc ra những dòng chưa chạy → tiếp tục từ đó 
3.	Merge kết quả cũ + mới vào 1 file 
________________________________________
Setup Kaggle Notebooks
Bước 1 — Upload dataset lên Kaggle
1.	kaggle.com → Datasets → New Dataset → Upload file CSV/ZIP 
2.	Hoặc dùng Kaggle CLI:
kaggle datasets init -p ./data → kaggle datasets create -p ./data 
________________________________________
Bước 2 — Tạo Notebook mới và add dataset
1.	kaggle.com → Code → New Notebook 
2.	Panel phải → Add Data → tìm dataset vừa upload → Add 
3.	Dataset sẽ có ở:
/kaggle/input/[tên-dataset]/ 
________________________________________
Bước 3 — Đặt API key qua Kaggle Secrets
1.	kaggle.com → Settings → Secrets → Add New Secret 
2.	Name: OPENAI_API_KEY, Value: sk-...
3.	Trong notebook: 
from kaggle_secrets import UserSecretsClient
import os

secrets = UserSecretsClient()
os.environ['OPENAI_API_KEY'] = secrets.get_secret('OPENAI_API_KEY')
________________________________________
Bước 4 — Lưu output
# Output tự động lưu trong /kaggle/working/
# Download sau khi chạy xong: Output tab → Download

OUTPUT_DIR = '/kaggle/working/results'

import os
os.makedirs(OUTPUT_DIR, exist_ok=True)
________________________________________
Bước 5 — Commit notebook để lưu kết quả vĩnh viễn
•	Bấm Save Version → Save & Run All (Commit) → Kaggle chạy lại toàn bộ và lưu output 
•	Sau khi commit xong: Output tab → Download → tải về máy → commit lên GitHub repo của nhóm 
Kaggle giới hạn 9h/session — nếu dataset lớn, chia batch và dùng checkpoint tương tự Colab.
Sync kết quả về GitHub (BẮT BUỘC)
Dù chạy trên Colab hay Kaggle, kết quả cuối cùng phải commit lên GitHub — không lưu chỉ trên Drive/Kaggle.
# Sau khi download kết quả về máy
git add results/pilot_llm_output.csv results/pilot_api_log.txt
git commit -m "feat: add pilot experiment results (N=262, GPT-4o-mini)"
git push
________________________________________
Đặt tên commit có ý nghĩa:
•	✅ feat: add pilot results (N=262, 98.1% valid) 
•	✅ feat: add full experiment output + api log 
•	❌ update, final, done
•	⚠️ Ghi chú khi gặp vấn đề
Vấn đề	Không được làm	Phải làm
Kết quả thấp hơn threshold	Đổi threshold, thêm RQ mới, chọn subset tốt hơn	Báo cáo kết quả thật, giải thích nguyên nhân trong paper
Dataset thiếu N	Tự thêm dữ liệu chưa được kiểm chứng	Ghi deviation, báo GV, viết amendment
API trả về kết quả khác lạ	Bỏ qua hoặc xóa	Ghi vào log, tính riêng invalid rate
Metric không tính được 1 số case	Bỏ qua hoặc điền 0	Ghi là INVALID, tính riêng
•	________________________________________
•	📁 File mới thêm vào repo sau RBL-4
•	Xem RBL-0 cho cấu trúc thư mục toàn bộ dự án. Tất cả file dưới đây phải commit lên GitHub.
[tên-nhóm]/
├─ data/
│  ├─ raw/                          ← [MỚI] Dataset gốc – KHÔNG sửa file gốc
│  │  └─ README.md                  ← [MỚI] nguồn, license, cấu trúc cột, ngày tải
│  ├─ pilot_sample.csv              ← [MỚI T7] 10–20% N, ghi seed trong notes.md
│  ├─ pilot_ground_truth.csv        ← [MỚI T7] Nhãn annotate pilot + IAA score
│  └─ full_ground_truth.csv         ← [MỚI T8] Nhãn annotate toàn bộ + IAA score
├─ scripts/
│  ├─ test_api.py                   ← [MỚI T6] 1 API call test – gate E3
│  ├─ run_experiment.py             ← [MỚI T6] Batch-run LLM theo config §5.3 proposal
│  └─ compute_metric.py             ← [MỚI T6] Tính metric + statistical test – gate E4
├─ results/
│  ├─ pilot_llm_output.csv          ← [MỚI T7] Output LLM trên pilot
│  ├─ pilot_api_log.txt             ← [MỚI T7] timestamp, response.model, cost/call
│  ├─ pilot_analysis.ipynb          ← [MỚI T7] Histogram + descriptive stats + test choice
│  ├─ full_llm_output.csv           ← [MỚI T8] ★ Output LLM toàn bộ dataset
│  ├─ full_api_log.txt              ← [MỚI T8] timestamp, model, cost, errors
│  ├─ full_analysis.ipynb           ← [MỚI T8] ★ p-value, effect size, kết luận per RQ
│  └─ summary.csv                   ← [MỚI T8] 1 dòng/RQ: metric, p, effect size, N
├─ figures/
│  ├─ fig1_distribution.png         ← [MỚI T8] Boxplot/violin metric chính (≥300 DPI)
│  └─ fig2_comparison.png           ← [MỚI T8] Comparative plot nếu có RQ2
└─ notes.md                         ← [MỚI T7] Mọi quyết định kỹ thuật + error log
Checklist commit GitHub:
Checklist commit GitHub:
☐ Không commit API key, file .env, __pycache__/, .DS_Store
☐ data/raw/README.md ghi đủ: nguồn URL, license, ngày tải, cấu trúc cột
☐ Mỗi batch chạy xong → commit ngay
Không đợi cuối Tuần 8 commit 1 lần.
☐ Commit message có ý nghĩa:
feat: add full experiment output (N=2619, 98.1% valid)
☐ full_analysis.ipynb có thể chạy lại từ đầu không bị lỗi
Restart & Run All.
________________________________________
Bước tiếp theo: Viết báo cáo và chuẩn bị trình bày → xem RBL-5.
________________________________________


