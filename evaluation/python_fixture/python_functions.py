# =====================================================================
# PYTHON DATASET - 25 STANDALONE FUNCTIONS (CC 5-15)
# This dataset is designed for RBL-2 to evaluate LLM Unit Test Generation.
# =====================================================================

# 1. Bubble Sort (CC = 6)
def bubble_sort(arr):
    if arr is None:
        return None
    n = len(arr)
    for i in range(n):
        swapped = False
        for j in range(0, n - i - 1):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
                swapped = True
        if not swapped:
            break
    return arr


# 2. Binary Search (CC = 5)
def binary_search(arr, target):
    if not arr:
        return -1
    low = 0
    high = len(arr) - 1
    while low <= high:
        mid = (low + high) // 2
        if arr[mid] == target:
            return mid
        elif arr[mid] < target:
            low = mid + 1
        else:
            high = mid - 1
    return -1


# 3. Email Validator (CC = 13)
def is_valid_email(email):
    if not email or "@" not in email or "." not in email:
        return False
    parts = email.split("@")
    if len(parts) != 2:
        return False
    local_part, domain_part = parts[0], parts[1]
    if not local_part or not domain_part:
        return False
    if "." not in domain_part or domain_part.startswith(".") or domain_part.endswith("."):
        return False
    for char in local_part:
        if not (char.isalnum() or char in "._-"):
            return False
    return True


# 4. Merge Intervals (CC = 7)
def merge_intervals(intervals):
    if not intervals:
        return []
    for interval in intervals:
        if len(interval) != 2 or interval[0] > interval[1]:
            return []
    intervals.sort(key=lambda x: x[0])
    merged = [intervals[0]]
    for current in intervals[1:]:
        prev_start, prev_end = merged[-1]
        curr_start, curr_end = current
        if curr_start <= prev_end:
            merged[-1] = [prev_start, max(prev_end, curr_end)]
        else:
            merged.append(current)
    return merged


# 5. Calculate Tax (CC = 8)
def calculate_tax(income, status):
    if income <= 0:
        return 0.0
    tax = 0.0
    if status == "single":
        if income <= 10000:
            tax = income * 0.1
        elif income <= 40000:
            tax = 1000 + (income - 10000) * 0.15
        else:
            tax = 5500 + (income - 40000) * 0.25
    elif status == "married":
        if income <= 20000:
            tax = income * 0.1
        elif income <= 80000:
            tax = 2000 + (income - 20000) * 0.15
        else:
            tax = 11000 + (income - 80000) * 0.25
    else:
        tax = income * 0.2
    return tax


# 6. Validate Password (CC = 11)
def validate_password(password):
    if not password or len(password) < 8:
        return False
    has_upper = False
    has_lower = False
    has_digit = False
    has_special = False
    special_chars = "!@#$%^&*()-_+="
    for char in password:
        if char.isupper():
            has_upper = True
        elif char.islower():
            has_lower = True
        elif char.isdigit():
            has_digit = True
        elif char in special_chars:
            has_special = True
    return has_upper and has_lower and has_digit and has_special


# 7. Reverse Polish Notation Evaluator (CC = 12)
def evaluate_rpn(expression):
    if not expression:
        return 0
    stack = []
    tokens = expression.split()
    operators = {"+", "-", "*", "/"}
    for token in tokens:
        if token in operators:
            if len(stack) < 2:
                return 0
            b = stack.pop()
            a = stack.pop()
            if token == "+":
                stack.append(a + b)
            elif token == "-":
                stack.append(a - b)
            elif token == "*":
                stack.append(a * b)
            elif token == "/":
                if b == 0:
                    return 0
                stack.append(int(a / b))
        else:
            try:
                stack.append(int(token))
            except ValueError:
                return 0
    return stack.pop() if len(stack) == 1 else 0


# 8. 0/1 Knapsack Problem DP (CC = 9)
def knapsack_01(weights, values, capacity):
    if not weights or not values or capacity <= 0 or len(weights) != len(values):
        return 0
    n = len(weights)
    dp = [[0] * (capacity + 1) for _ in range(n + 1)]
    for i in range(1, n + 1):
        for w in range(1, capacity + 1):
            if weights[i - 1] <= w:
                dp[i][w] = max(values[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w])
            else:
                dp[i][w] = dp[i - 1][w]
    return dp[n][capacity]


# 9. JSON Path Lookup (CC = 9)
def json_path_lookup(data, path):
    if data is None or not path:
        return None
    keys = path.split(".")
    current = data
    for key in keys:
        if isinstance(current, dict):
            if key in current:
                current = current[key]
            else:
                return None
        elif isinstance(current, list):
            if key.isdigit():
                idx = int(key)
                if 0 <= idx < len(current):
                    current = current[idx]
                else:
                    return None
            else:
                return None
        else:
            return None
    return current


# 10. Run Length Encoding (CC = 6)
def run_length_encoding(s):
    if not s:
        return ""
    for char in s:
        if not char.isalpha():
            return ""
    encoded = []
    count = 1
    for i in range(1, len(s)):
        if s[i] == s[i - 1]:
            count += 1
        else:
            encoded.append(f"{count}{s[i-1]}")
            count = 1
    encoded.append(f"{count}{s[-1]}")
    return "".join(encoded)


# 11. Run Length Decoding (CC = 7)
def run_length_decoding(s):
    if not s:
        return ""
    decoded = []
    i = 0
    while i < len(s):
        if not s[i].isdigit():
            return ""
        num_str = ""
        while i < len(s) and s[i].isdigit():
            num_str += s[i]
            i += 1
        if i >= len(s):
            return ""
        char = s[i]
        decoded.append(char * int(num_str))
        i += 1
    return "".join(decoded)


# 12. Check Sudoku Board (CC = 14)
def check_sudoku_board(board):
    if board is None or len(board) != 9:
        return False
    for row in board:
        if row is None or len(row) != 9:
            return False
    for r in range(9):
        row_set = set()
        col_set = set()
        for c in range(9):
            rv = board[r][c]
            cv = board[c][r]
            if rv != 0:
                if rv in row_set or not (1 <= rv <= 9):
                    return False
                row_set.add(rv)
            if cv != 0:
                if cv in col_set or not (1 <= cv <= 9):
                    return False
                col_set.add(cv)
    return True


# 13. Roman to Integer (CC = 6)
def roman_to_int(s):
    roman_map = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}
    if not s:
        return 0
    total = 0
    n = len(s)
    for i in range(n):
        if s[i] not in roman_map:
            return 0
        val = roman_map[s[i]]
        if i + 1 < n and roman_map[s[i + 1]] > val:
            total -= val
        else:
            total += val
    return total


# 14. Integer to Roman (CC = 5)
def int_to_roman(num):
    if num <= 0 or num > 3999:
        return ""
    val = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1]
    syb = ["M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"]
    roman_num = ""
    i = 0
    while num > 0:
        for _ in range(num // val[i]):
            roman_num += syb[i]
            num -= val[i]
        i += 1
    return roman_num


# 15. Longest Palindromic Substring (CC = 11)
def longest_palindrome_substring(s):
    if not s:
        return ""
    longest = ""
    for i in range(len(s)):
        l, r = i, i
        while l >= 0 and r < len(s) and s[l] == s[r]:
            if (r - l + 1) > len(longest):
                longest = s[l:r+1]
            l -= 1
            r += 1
        # Even length
        l, r = i, i + 1
        while l >= 0 and r < len(s) and s[l] == s[r]:
            if (r - l + 1) > len(longest):
                longest = s[l:r+1]
            l -= 1
            r += 1
    return longest


# 16. Parse CSV Line (CC = 9)
def parse_csv_line(line):
    if line is None:
        return []
    result = []
    current = []
    in_quotes = False
    i = 0
    while i < len(line):
        char = line[i]
        if char == '"':
            if in_quotes and i + 1 < len(line) and line[i + 1] == '"':
                current.append('"')
                i += 1
            else:
                in_quotes = not in_quotes
        elif char == ',' and not in_quotes:
            result.append("".join(current))
            current = []
        else:
            current.append(char)
        i += 1
    result.append("".join(current))
    return result


# 17. Levenshtein Distance (CC = 9)
def levenshtein_distance(s1, s2):
    if s1 is None or s2 is None:
        return -1
    m, n = len(s1), len(s2)
    dp = [[0] * (n + 1) for _ in range(m + 1)]
    for i in range(m + 1):
        dp[i][0] = i
    for j in range(n + 1):
        dp[0][j] = j
    for i in range(1, m + 1):
        for j in range(1, n + 1):
            if s1[i - 1] == s2[j - 1]:
                dp[i][j] = dp[i - 1][j - 1]
            else:
                dp[i][j] = 1 + min(dp[i - 1][j], dp[i][j - 1], dp[i - 1][j - 1])
    return dp[m][n]


# 18. Find Prime Factors (CC = 6)
def find_prime_factors(n):
    if n <= 1:
        return []
    factors = []
    while n % 2 == 0:
        factors.append(2)
        n //= 2
    d = 3
    while d * d <= n:
        while n % d == 0:
            factors.append(d)
            n //= d
        d += 2
    if n > 1:
        factors.append(n)
    return factors


# 19. Luhn Check (CC = 6)
def luhn_check(card_number):
    if not card_number or not card_number.isdigit():
        return False
    total = 0
    reverse_digits = card_number[::-1]
    for idx, digit in enumerate(reverse_digits):
        val = int(digit)
        if idx % 2 == 1:
            val *= 2
            if val > 9:
                val -= 9
        total += val
    return total % 10 == 0


# 20. Simple HTML Tokenizer (CC = 9)
def simple_html_tokenizer(html):
    if html is None:
        return []
    tokens = []
    i = 0
    n = len(html)
    while i < n:
        if html[i] == '<':
            j = i + 1
            while j < n and html[j] != '>':
                j += 1
            if j < n:
                tokens.append(("TAG", html[i:j+1]))
                i = j + 1
            else:
                tokens.append(("TEXT", html[i:]))
                break
        else:
            j = i
            while j < n and html[j] != '<':
                j += 1
            tokens.append(("TEXT", html[i:j]))
            i = j
    return tokens


# 21. Dijkstra Shortest Path (CC = 11)
def dijkstra(graph, src, dest):
    if graph is None:
        return -1
    n = len(graph)
    dist = [float('inf')] * n
    dist[src] = 0
    spt_set = [False] * n
    for _ in range(n):
        u = -1
        min_val = float('inf')
        for i in range(n):
            if not spt_set[i] and dist[i] < min_val:
                min_val = dist[i]
                u = i
        if u == -1 or u == dest:
            break
        spt_set[u] = True
        for v in range(n):
            if graph[u][v] > 0 and not spt_set[v] and dist[v] > dist[u] + graph[u][v]:
                dist[v] = dist[u] + graph[u][v]
    return dist[dest] if dist[dest] != float('inf') else -1


# 22. Parse Query String (CC = 8)
def parse_query_string(qs):
    if not qs:
        return {}
    if qs.startswith("?"):
        qs = qs[1:]
    result = {}
    pairs = qs.split("&")
    for pair in pairs:
        if not pair:
            continue
        if "=" in pair:
            parts = pair.split("=", 1)
            key, val = parts[0], parts[1]
        else:
            key, val = pair, ""
        if key in result:
            if isinstance(result[key], list):
                result[key].append(val)
            else:
                result[key] = [result[key], val]
        else:
            result[key] = val
    return result


# 23. Date Difference (CC = 8)
def date_difference(date1, date2):
    if date1 is None or date2 is None:
        return -1
    try:
        p1 = date1.split('-')
        p2 = date2.split('-')
        if len(p1) != 3 or len(p2) != 3:
            return -1
        y1, m1, d1 = map(int, p1)
        y2, m2, d2 = map(int, p2)

        ny1, nm1 = y1, m1
        if nm1 < 3:
            ny1 -= 1
            nm1 += 12
        days1 = 365 * ny1 + ny1 // 4 - ny1 // 100 + ny1 // 400 + (153 * nm1 + 2) // 5 + d1

        ny2, nm2 = y2, m2
        if nm2 < 3:
            ny2 -= 1
            nm2 += 12
        days2 = 365 * ny2 + ny2 // 4 - ny2 // 100 + ny2 // 400 + (153 * nm2 + 2) // 5 + d2

        return abs(days1 - days2)
    except Exception:
        return -1


# 24. Is Valid BST (CC = 13)
def is_valid_bst(nodes, root_idx):
    if not nodes or root_idx < 0 or root_idx >= len(nodes):
        return True
    stack = [(root_idx, float('-inf'), float('inf'))]
    while stack:
        curr, low, high = stack.pop()
        node = nodes[curr]
        val = node["val"]
        if val <= low or val >= high:
            return False
        left = node.get("left", -1)
        right = node.get("right", -1)
        if left >= 0 and left < len(nodes):
            stack.append((left, low, val))
        elif left != -1:
            return False
        if right >= 0 and right < len(nodes):
            stack.append((right, val, high))
        elif right != -1:
            return False
    return True


# 25. Is Match (CC = 10)
def is_match(s, p):
    if p is None or s is None:
        return False
    if not p:
        return not s
    first_match = bool(s) and p[0] in (s[0], '.')
    if len(p) >= 2 and p[1] == '*':
        return (is_match(s, p[2:]) or
                (first_match and is_match(s[1:], p)))
    else:
        return first_match and is_match(s[1:], p[1:])
