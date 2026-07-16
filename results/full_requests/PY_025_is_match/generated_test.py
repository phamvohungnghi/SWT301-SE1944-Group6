import pytest
from python_functions import is_match

def test_is_match_basic():
    assert is_match("a", "a") == True
    assert is_match("a", "b") == False
    assert is_match("aa", "a") == False
    assert is_match("aa", "aa") == True
    assert is_match("aaa", "aa") == False
    assert is_match("aa", "a*") == True
    assert is_match("ab", ".*") == True
    assert is_match("aab", "c*a*b") == True
    assert is_match("mississippi", "mis*is*p*.") == False

def test_is_match_with_dot():
    assert is_match("abc", "a.c") == True
    assert is_match("abc", "a.*c") == True
    assert is_match("abc", "a..c") == False
    assert is_match("a", ".") == True
    assert is_match("", ".") == False

def test_is_match_with_star():
    assert is_match("a", "a*") == True
    assert is_match("aa", "a*") == True
    assert is_match("aaa", "a*") == True
    assert is_match("ab", ".*") == True
    assert is_match("aab", "c*a*b") == True
    assert is_match("mississippi", "mis*is*ip*.") == True

def test_is_match_empty_string():
    assert is_match("", "") == True
    assert is_match("a", "") == False
    assert is_match("", "a") == False
    assert is_match("", ".*") == True
    assert is_match("", "a*") == True

def test_is_match_none():
    assert is_match(None, "a") == False
    assert is_match("a", None) == False
    assert is_match(None, None) == False

def test_is_match_edge_cases():
    assert is_match("a", ".*") == True
    assert is_match("ab", ".*") == True
    assert is_match("abc", ".*") == True
    assert is_match("abc", "a.*c") == True
    assert is_match("abc", ".*c") == True
    assert is_match("abc", ".*b") == False
    assert is_match("abc", ".*d") == False
    assert is_match("abc", "a*b*c") == False
    assert is_match("abc", "a*b*c*") == True
    assert is_match("abc", ".*.*") == True
    assert is_match("abc", ".*.*.*") == True
    assert is_match("abc", ".*.*.*.*") == True
    assert is_match("abc", ".*.*.*.*.*") == True
    assert is_match("abc", ".*.*.*.*.*.*") == True
    assert is_match("abc", ".*.*.*.*.*.*.*") == True
    assert is_match("abc", ".*.*.*.*.*.*.*.*") == True
    assert is_match("abc", ".*.*.*.*.*.*.*.*.*") == True
    assert is_match("abc", ".*.*.*.*.*.*.*.*.*.*") == True
    assert is_match("abc", ".*.*.*.*.*.*.*.*.*.*.*") == True
    assert is_match("abc", ".*.*.*.*.*.*.*.*.*.*.*.*") == True
    assert is_match("abc", ".*.*.*.*.*.*.*.*.*.*.*.*.*") == True
    assert is_match("abc", ".*.*.*.*.*.*.*.*.*.*.*.*.*.*") == True
    assert is_match("abc", ".*.*.*.*.*.*.*.*.*.*.*.*.*.*.*") == True
    assert is_match("abc", ".*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*") == True
    assert is_match("abc", ".*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*") == True
    assert is_match("abc", ".*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*") == True
    assert is_match("abc", ".*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*") == True
    assert is_match("abc", ".*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*") == True
    assert is_match("abc", ".*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*") == True
    assert is_match("abc", ".*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*") == True
    assert is_match("abc", ".*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*") == True
    assert is_match("abc", ".*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*") == True
    assert is_match("abc", ".*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*") == True
    assert is_match("abc", ".*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*") == True
    assert is_match("abc", ".*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*") == True
    assert is_match("abc", ".*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*") == True
    assert is_match("abc", ".*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*") == True
    assert is_match("abc", ".*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*") == True
    assert is_match("abc", ".*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*") == True
    assert is_match("abc", ".*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*") == True
    assert is_match("abc", ".*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*") == True
    assert is_match("abc", ".*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*") == True
    assert is_match("abc", ".*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*") == True
    assert is_match("abc", ".*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*") == True
    assert is_match("abc", ".*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*") == True
    assert is_match("abc", ".*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*") == True
    assert is_match("abc", ".*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*") == True
    assert is_match("abc", ".*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*") == True
    assert is_match("abc", ".*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*") == True
    assert is_match("abc", ".*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*") == True
    assert is_match("abc", ".*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*") == True
    assert is_match("abc", ".*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*