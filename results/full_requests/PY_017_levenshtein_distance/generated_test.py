import pytest

from your_module import levenshtein_distance

def test_levenshtein_distance_basic():
    assert levenshtein_distance("kitten", "sitting") == 3
    assert levenshtein_distance("flaw", "lawn") == 2
    assert levenshtein_distance("gumbo", "gambol") == 2
    assert levenshtein_distance("", "") == 0
    assert levenshtein_distance("abc", "") == 3
    assert levenshtein_distance("", "abc") == 3

def test_levenshtein_distance_identical_strings():
    assert levenshtein_distance("test", "test") == 0
    assert levenshtein_distance("a", "a") == 0
    assert levenshtein_distance("", "") == 0

def test_levenshtein_distance_single_character():
    assert levenshtein_distance("a", "b") == 1
    assert levenshtein_distance("a", "") == 1
    assert levenshtein_distance("", "a") == 1

def test_levenshtein_distance_case_sensitivity():
    assert levenshtein_distance("Test", "test") == 1
    assert levenshtein_distance("TEST", "test") == 4

def test_levenshtein_distance_special_characters():
    assert levenshtein_distance("hello!", "hello") == 1
    assert levenshtein_distance("hello", "hello!") == 1
    assert levenshtein_distance("@#$%", "@#$%") == 0
    assert levenshtein_distance("@#$%", "abcd") == 4

def test_levenshtein_distance_unicode():
    assert levenshtein_distance("你好", "你好") == 0
    assert levenshtein_distance("你好", "您好") == 1
    assert levenshtein_distance("你好", "") == 2

def test_levenshtein_distance_none_inputs():
    assert levenshtein_distance(None, "test") == -1
    assert levenshtein_distance("test", None) == -1
    assert levenshtein_distance(None, None) == -1

def test_levenshtein_distance_large_inputs():
    s1 = "a" * 1000
    s2 = "b" * 1000
    assert levenshtein_distance(s1, s2) == 1000
    s3 = "a" * 1000
    s4 = "a" * 999 + "b"
    assert levenshtein_distance(s3, s4) == 1

def test_levenshtein_distance_empty_strings():
    assert levenshtein_distance("", "") == 0
    assert levenshtein_distance("", "abc") == 3
    assert levenshtein_distance("abc", "") == 3

def test_levenshtein_distance_substring():
    assert levenshtein_distance("abc", "abcd") == 1
    assert levenshtein_distance("abcd", "abc") == 1
    assert levenshtein_distance("abc", "ab") == 1
    assert levenshtein_distance("ab", "abc") == 1