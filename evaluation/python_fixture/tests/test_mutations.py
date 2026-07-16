import pytest_mutagen as mg
from python_functions import binary_search, roman_to_int, longest_palindrome_substring, parse_query_string

# Mutants for binary_search
@mg.mutant_of("binary_search", "BINARY_SEARCH_MUT_1", file="test_PY_002_binary_search.py", description="Change low <= high to low < high")
def binary_search_mut_1(arr, target):
    if not arr:
        return -1
    low = 0
    high = len(arr) - 1
    while low < high:  # Mutated
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
            low = mid  # Mutated
        else:
            high = mid - 1
    return -1

# Mutants for roman_to_int
@mg.mutant_of("roman_to_int", "ROMAN_TO_INT_MUT_1", file="test_PY_013_roman_to_int.py", description="Change V value to 4")
def roman_to_int_mut_1(s):
    roman_map = {'I': 1, 'V': 4, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000} # Mutated
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
            total += val  # Mutated
        else:
            total += val
    return total

# Mutants for longest_palindrome_substring
@mg.mutant_of("longest_palindrome_substring", "LONGEST_PALINDROME_MUT_1", file="test_PY_015_longest_palindrome_substring.py", description="Change > to >= len")
def longest_palindrome_mut_1(s):
    if not s:
        return ""
    longest = ""
    for i in range(len(s)):
        l, r = i, i
        while l >= 0 and r < len(s) and s[l] == s[r]:
            if (r - l + 1) >= len(longest): # Mutated
                longest = s[l:r+1]
            l -= 1
            r += 1
        l, r = i, i + 1
        while l >= 0 and r < len(s) and s[l] == s[r]:
            if (r - l + 1) >= len(longest): # Mutated
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
        l, r = i, i + 1 # Mutated
        while l >= 0 and r < len(s) and s[l] == s[r]:
            if (r - l + 1) > len(longest):
                longest = s[l:r+1]
            l -= 1
            r += 1
    return longest

# Mutants for parse_query_string
@mg.mutant_of("parse_query_string", "PARSE_QUERY_MUT_1", file="test_PY_022_parse_query_string.py", description="Remove ? check")
def parse_query_mut_1(qs):
    if not qs:
        return {}
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
            parts = pair.split("=") # Mutated
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
