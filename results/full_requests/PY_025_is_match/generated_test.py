import pytest

def test_is_match():
    # Test cases for empty string and pattern
    assert is_match("", "") == True  # Both empty
    assert is_match("", "a") == False  # Empty string, non-empty pattern
    assert is_match("a", "") == False  # Non-empty string, empty pattern
    
    # Test cases for None inputs
    assert is_match(None, None) == False  # Both None
    assert is_match(None, "a") == False  # String is None
    assert is_match("a", None) == False  # Pattern is None
    
    # Test cases for exact matches
    assert is_match("abc", "abc") == True  # Exact match
    assert is_match("abc", "abcd") == False  # Pattern longer than string
    assert is_match("abcd", "abc") == False  # String longer than pattern
    
    # Test cases for '.' wildcard
    assert is_match("abc", "a.c") == True  # '.' matches any single character
    assert is_match("abc", "a..") == True  # Multiple '.' wildcards
    assert is_match("abc", "a.d") == False  # '.' does not match different character
    
    # Test cases for '*' wildcard
    assert is_match("aa", "a*") == True  # '*' matches zero or more of the preceding character
    assert is_match("aaa", "a*") == True  # '*' matches multiple occurrences
    assert is_match("aab", "c*a*b") == True  # Complex pattern with '*'
    assert is_match("mississippi", "mis*is*p*.") == False  # Complex pattern with '*' and '.'
    assert is_match("ab", ".*") == True  # '.*' matches any string
    assert is_match("abc", ".*c") == True  # '.*' followed by specific character
    assert is_match("abc", ".*d") == False  # '.*' followed by non-matching character
    
    # Test cases for edge cases with '*' wildcard
    assert is_match("", "a*") == True  # '*' matches zero occurrences
    assert is_match("a", "a*") == True  # '*' matches one occurrence
    assert is_match("aa", ".*") == True  # '.*' matches any string
    assert is_match("ab", ".*c") == False  # '.*' does not match additional character
    
    # Test cases for mixed patterns
    assert is_match("abc", "a*b*c*") == True  # '*' matches zero occurrences
    assert is_match("aaa", "a*a") == True  # '*' matches multiple occurrences
    assert is_match("aaa", "a*aa") == True  # '*' matches multiple occurrences followed by exact match
    assert is_match("aaa", "a*aaa") == True  # '*' matches multiple occurrences followed by exact match
    assert is_match("aaa", "a*aaaa") == False  # '*' matches multiple occurrences but pattern is longer
    
    # Test cases for patterns with no wildcards
    assert is_match("abc", "abc") == True  # Exact match
    assert is_match("abc", "abd") == False  # Mismatch in pattern
    assert is_match("abc", "abcd") == False  # Pattern longer than string
    assert is_match("abcd", "abc") == False  # String longer than pattern
    
    # Test cases for patterns with multiple wildcards
    assert is_match("abc", "a.*c") == True  # '.' and '*' combined
    assert is_match("abc", "a.*d") == False  # '.' and '*' combined with mismatch
    assert is_match("abc", ".*.*") == True  # Multiple '.*' wildcards
    assert is_match("abc", ".*.*d") == False  # Multiple '.*' wildcards with mismatch
    
    # Test cases for patterns with '*' following '.'
    assert is_match("abc", ".*") == True  # '.*' matches any string
    assert is_match("abc", ".*c") == True  # '.*' followed by specific character
    assert is_match("abc", ".*d") == False  # '.*' followed by non-matching character
    
    # Test cases for patterns with '*' following specific characters
    assert is_match("aaab", "a*b") == True  # '*' matches multiple occurrences
    assert is_match("b", "a*b") == True  # '*' matches zero occurrences
    assert is_match("aaa", "a*b") == False  # '*' matches multiple occurrences but pattern is longer
    
    # Test cases for patterns with no wildcards and mismatches
    assert is_match("abc", "abd") == False  # Mismatch in pattern
    assert is_match("abc", "abcd") == False  # Pattern longer than string
    assert is_match("abcd", "abc") == False  # String longer than pattern