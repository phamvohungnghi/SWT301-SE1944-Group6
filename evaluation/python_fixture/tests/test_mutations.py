import pytest_mutagen as mg
from python_functions import (
    bubble_sort, binary_search, is_valid_email, merge_intervals, calculate_tax,
    validate_password, evaluate_rpn, knapsack_01, json_path_lookup,
    run_length_encoding, run_length_decoding, check_sudoku_board, roman_to_int,
    int_to_roman, longest_palindrome_substring, parse_csv_line, levenshtein_distance,
    find_prime_factors, luhn_check, simple_html_tokenizer, dijkstra,
    parse_query_string, date_difference, is_valid_bst, is_match
)

# 1. Mutants for bubble_sort
@mg.mutant_of("bubble_sort", "BUBBLE_SORT_MUT_1", file="test_PY_001_bubble_sort.py", description="Change comparison operator from > to <")
def bubble_sort_mut_1(arr):
    if arr is None:
        return None
    n = len(arr)
    for i in range(n):
        swapped = False
        for j in range(0, n - i - 1):
            if arr[j] < arr[j + 1]:  # Mutated: > to <
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
                swapped = True
        if not swapped:
            break
    return arr

# 2. Mutants for binary_search
@mg.mutant_of("binary_search", "BINARY_SEARCH_MUT_1", file="test_PY_002_binary_search.py", description="Change low <= high to low < high")
def binary_search_mut_1(arr, target):
    if not arr:
        return -1
    low = 0
    high = len(arr) - 1
    while low < high:  # Mutated: low <= high to low < high
        mid = (low + high) // 2
        if arr[mid] == target:
            return mid
        elif arr[mid] < target:
            low = mid + 1
        else:
            high = mid - 1
    return -1

@mg.mutant_of("binary_search", "BINARY_SEARCH_MUT_2", file="test_PY_002_binary_search.py", description="Change low = mid + 1 to low = mid")
def binary_search_mut_2(arr, target):
    if not arr:
        return -1
    low = 0
    high = len(arr) - 1
    while low <= high:
        mid = (low + high) // 2
        if arr[mid] == target:
            return mid
        elif arr[mid] < target:
            low = mid  # Mutated: low = mid + 1 to low = mid
        else:
            high = mid - 1
    return -1

# 3. Mutants for is_valid_email
@mg.mutant_of("is_valid_email", "IS_VALID_EMAIL_MUT_1", file="test_PY_003_is_valid_email.py", description="Remove @ check")
def is_valid_email_mut_1(email):
    if not email or "." not in email:  # Mutated: removed "@" not in email check
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

# 4. Mutants for merge_intervals
@mg.mutant_of("merge_intervals", "MERGE_INTERVALS_MUT_1", file="test_PY_004_merge_intervals.py", description="Change curr_start <= prev_end to curr_start < prev_end")
def merge_intervals_mut_1(intervals):
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
        if curr_start < prev_end:  # Mutated: <= to <
            merged[-1] = [prev_start, max(prev_end, curr_end)]
        else:
            merged.append(current)
    return merged

# 5. Mutants for calculate_tax
@mg.mutant_of("calculate_tax", "CALCULATE_TAX_MUT_1", file="test_PY_005_calculate_tax.py", description="Change single status 40000 boundary tax multiplier")
def calculate_tax_mut_1(income, status):
    if income <= 0:
        return 0.0
    tax = 0.0
    if status == "single":
        if income <= 10000:
            tax = income * 0.1
        elif income <= 40000:
            tax = 1000 + (income - 10000) * 0.15
        else:
            tax = 5500 + (income - 40000) * 0.35  # Mutated: 0.25 to 0.35
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

# 6. Mutants for validate_password
@mg.mutant_of("validate_password", "VALIDATE_PASSWORD_MUT_1", file="test_PY_006_validate_password.py", description="Change length requirement from < 8 to < 6")
def validate_password_mut_1(password):
    if not password or len(password) < 6:  # Mutated: < 8 to < 6
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

# 7. Mutants for evaluate_rpn
@mg.mutant_of("evaluate_rpn", "EVALUATE_RPN_MUT_1", file="test_PY_007_evaluate_rpn.py", description="Change division behavior to non-integer division")
def evaluate_rpn_mut_1(expression):
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
                stack.append(a / b)  # Mutated: int(a/b) to a/b
        else:
            try:
                stack.append(int(token))
            except ValueError:
                return 0
    return stack.pop() if len(stack) == 1 else 0

# 8. Mutants for knapsack_01
@mg.mutant_of("knapsack_01", "KNAPSACK_01_MUT_1", file="test_PY_008_knapsack_01.py", description="Change maximum value addition calculation")
def knapsack_01_mut_1(weights, values, capacity):
    if not weights or not values or capacity <= 0 or len(weights) != len(values):
        return 0
    n = len(weights)
    dp = [[0] * (capacity + 1) for _ in range(n + 1)]
    for i in range(1, n + 1):
        for w in range(1, capacity + 1):
            if weights[i - 1] <= w:
                dp[i][w] = values[i - 1] + dp[i - 1][w - weights[i - 1]]  # Mutated: removed max comparison
            else:
                dp[i][w] = dp[i - 1][w]
    return dp[n][capacity]

# 9. Mutants for json_path_lookup
@mg.mutant_of("json_path_lookup", "JSON_PATH_LOOKUP_MUT_1", file="test_PY_009_json_path_lookup.py", description="Change nested dict lookup failure return value")
def json_path_lookup_mut_1(data, path):
    if data is None or not path:
        return None
    keys = path.split(".")
    current = data
    for key in keys:
        if isinstance(current, dict):
            if key in current:
                current = current[key]
            else:
                return {}  # Mutated: None to {}
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

# 10. Mutants for run_length_encoding
@mg.mutant_of("run_length_encoding", "RUN_LENGTH_ENCODING_MUT_1", file="test_PY_010_run_length_encoding.py", description="Change character case check to count non-alpha as valid")
def run_length_encoding_mut_1(s):
    if not s:
        return ""
    # Mutated: removed non-alpha character check
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

# 11. Mutants for run_length_decoding
@mg.mutant_of("run_length_decoding", "RUN_LENGTH_DECODING_MUT_1", file="test_PY_011_run_length_decoding.py", description="Change missing character check behavior")
def run_length_decoding_mut_1(s):
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
            return "ERROR"  # Mutated: "" to "ERROR"
        char = s[i]
        decoded.append(char * int(num_str))
        i += 1
    return "".join(decoded)

# 12. Mutants for check_sudoku_board
@mg.mutant_of("check_sudoku_board", "CHECK_SUDOKU_BOARD_MUT_1", file="test_PY_012_check_sudoku_board.py", description="Change Sudoku digit range from 1-9 to 0-9")
def check_sudoku_board_mut_1(board):
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
                if rv in row_set or not (0 <= rv <= 9):  # Mutated: 1 <= rv <= 9 to 0 <= rv <= 9
                    return False
                row_set.add(rv)
            if cv != 0:
                if cv in col_set or not (1 <= cv <= 9):
                    return False
                col_set.add(cv)
    return True

# 13. Mutants for roman_to_int
@mg.mutant_of("roman_to_int", "ROMAN_TO_INT_MUT_1", file="test_PY_013_roman_to_int.py", description="Change V value to 4")
def roman_to_int_mut_1(s):
    roman_map = {'I': 1, 'V': 4, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000} # Mutated: V value 5 to 4
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

@mg.mutant_of("roman_to_int", "ROMAN_TO_INT_MUT_2", file="test_PY_013_roman_to_int.py", description="Change subtraction to addition")
def roman_to_int_mut_2(s):
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
            total += val  # Mutated: total -= val to total += val
        else:
            total += val
    return total

# 14. Mutants for int_to_roman
@mg.mutant_of("int_to_roman", "INT_TO_ROMAN_MUT_1", file="test_PY_014_int_to_roman.py", description="Change num boundary limit from 3999 to 4000")
def int_to_roman_mut_1(num):
    if num <= 0 or num > 4000:  # Mutated: 3999 to 4000
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

# 15. Mutants for longest_palindrome_substring
@mg.mutant_of("longest_palindrome_substring", "LONGEST_PALINDROME_MUT_1", file="test_PY_015_longest_palindrome_substring.py", description="Change > to >= comparison")
def longest_palindrome_mut_1(s):
    if not s:
        return ""
    longest = ""
    for i in range(len(s)):
        l, r = i, i
        while l >= 0 and r < len(s) and s[l] == s[r]:
            if (r - l + 1) >= len(longest):  # Mutated: > to >=
                longest = s[l:r+1]
            l -= 1
            r += 1
        l, r = i, i + 1
        while l >= 0 and r < len(s) and s[l] == s[r]:
            if (r - l + 1) >= len(longest):  # Mutated: > to >=
                longest = s[l:r+1]
            l -= 1
            r += 1
    return longest

@mg.mutant_of("longest_palindrome_substring", "LONGEST_PALINDROME_MUT_2", file="test_PY_015_longest_palindrome_substring.py", description="Change odd start to even")
def longest_palindrome_mut_2(s):
    if not s:
        return ""
    longest = ""
    for i in range(len(s)):
        l, r = i, i + 1  # Mutated: odd search removed, starts with even
        while l >= 0 and r < len(s) and s[l] == s[r]:
            if (r - l + 1) > len(longest):
                longest = s[l:r+1]
            l -= 1
            r += 1
    return longest

# 16. Mutants for parse_csv_line
@mg.mutant_of("parse_csv_line", "PARSE_CSV_LINE_MUT_1", file="test_PY_016_parse_csv_line.py", description="Change quote escape handling")
def parse_csv_line_mut_1(line):
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
                in_quotes = in_quotes  # Mutated: in_quotes = not in_quotes to in_quotes = in_quotes
        elif char == ',' and not in_quotes:
            result.append("".join(current))
            current = []
        else:
            current.append(char)
        i += 1
    result.append("".join(current))
    return result

# 17. Mutants for levenshtein_distance
@mg.mutant_of("levenshtein_distance", "LEVENSHTEIN_MUT_1", file="test_PY_017_levenshtein_distance.py", description="Change None input check behavior")
def levenshtein_distance_mut_1(s1, s2):
    if s1 is None or s2 is None:
        return 0  # Mutated: -1 to 0
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

# 18. Mutants for find_prime_factors
@mg.mutant_of("find_prime_factors", "FIND_PRIME_FACTORS_MUT_1", file="test_PY_018_find_prime_factors.py", description="Change factorization divisor step to 1 instead of 2")
def find_prime_factors_mut_1(n):
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
        d += 1  # Mutated: d += 2 to d += 1
    if n > 1:
        factors.append(n)
    return factors

# 19. Mutants for luhn_check
@mg.mutant_of("luhn_check", "LUHN_CHECK_MUT_1", file="test_PY_019_luhn_check.py", description="Change Luhn digit multiplication condition")
def luhn_check_mut_1(card_number):
    if not card_number or not card_number.isdigit():
        return False
    total = 0
    reverse_digits = card_number[::-1]
    for idx, digit in enumerate(reverse_digits):
        val = int(digit)
        if idx % 2 == 0:  # Mutated: idx % 2 == 1 to idx % 2 == 0
            val *= 2
            if val > 9:
                val -= 9
        total += val
    return total % 10 == 0

# 20. Mutants for simple_html_tokenizer
@mg.mutant_of("simple_html_tokenizer", "SIMPLE_HTML_TOKENIZER_MUT_1", file="test_PY_020_simple_html_tokenizer.py", description="Change fallback type on unclosed HTML tag")
def simple_html_tokenizer_mut_1(html):
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
                tokens.append(("TAG", html[i:]))  # Mutated: TEXT to TAG
                break
        else:
            j = i
            while j < n and html[j] != '<':
                j += 1
            tokens.append(("TEXT", html[i:j]))
            i = j
    return tokens

# 21. Mutants for dijkstra
@mg.mutant_of("dijkstra", "DIJKSTRA_MUT_1", file="test_PY_021_dijkstra.py", description="Change node visit termination condition")
def dijkstra_mut_1(graph, src, dest):
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
        if u == -1:  # Mutated: removed "or u == dest" check
            break
        spt_set[u] = True
        for v in range(n):
            if graph[u][v] > 0 and not spt_set[v] and dist[v] > dist[u] + graph[u][v]:
                dist[v] = dist[u] + graph[u][v]
    return dist[dest] if dist[dest] != float('inf') else -1

# 22. Mutants for parse_query_string
@mg.mutant_of("parse_query_string", "PARSE_QUERY_MUT_1", file="test_PY_022_parse_query_string.py", description="Remove ? check")
def parse_query_mut_1(qs):
    if not qs:
        return {}
    # Mutated: removed "?" start check
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

@mg.mutant_of("parse_query_string", "PARSE_QUERY_MUT_2", file="test_PY_022_parse_query_string.py", description="Split without limit")
def parse_query_mut_2(qs):
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
            parts = pair.split("=")  # Mutated: split(..., 1) to split(...)
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

# 23. Mutants for date_difference
@mg.mutant_of("date_difference", "DATE_DIFFERENCE_MUT_1", file="test_PY_023_date_difference.py", description="Change return on parsing exception from -1 to 0")
def date_difference_mut_1(date1, date2):
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
        return 0  # Mutated: -1 to 0

# 24. Mutants for is_valid_bst
@mg.mutant_of("is_valid_bst", "IS_VALID_BST_MUT_1", file="test_PY_024_is_valid_bst.py", description="Change BST boundary from strictly less/greater to inclusive comparison")
def is_valid_bst_mut_1(nodes, root_idx):
    if not nodes or root_idx < 0 or root_idx >= len(nodes):
        return True
    stack = [(root_idx, float('-inf'), float('inf'))]
    while stack:
        curr, low, high = stack.pop()
        node = nodes[curr]
        val = node["val"]
        if val < low or val > high:  # Mutated: <= / >= to < / >
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

# 25. Mutants for is_match
@mg.mutant_of("is_match", "IS_MATCH_MUT_1", file="test_PY_025_is_match.py", description="Change wildcard regex match dot character to match letter 'd' only")
def is_match_mut_1(s, p):
    if p is None or s is None:
        return False
    if not p:
        return not s
    first_match = bool(s) and p[0] in (s[0], 'd')  # Mutated: '.' to 'd'
    if len(p) >= 2 and p[1] == '*':
        return (is_match(s, p[2:]) or
                (first_match and is_match(s[1:], p)))
    else:
        return first_match and is_match(s[1:], p[1:])
