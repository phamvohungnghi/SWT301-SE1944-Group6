import pytest

from PY_017_levenshtein_distance import levenshtein_distance

def test_levenshtein_distance_basic():
    assert levenshtein_distance("kitten", "sitting") == 3
    assert levenshtein_distance("flaw", "lawn") == 2
    assert levenshtein_distance("intention", "execution") == 5

def test_levenshtein_distance_empty_strings():
    assert levenshtein_distance("", "") == 0
    assert levenshtein_distance("abc", "") == 3
    assert levenshtein_distance("", "abc") == 3

def test_levenshtein_distance_identical_strings():
    assert levenshtein_distance("abc", "abc") == 0
    assert levenshtein_distance("a", "a") == 0
    assert levenshtein_distance("", "") == 0

def test_levenshtein_distance_single_character_strings():
    assert levenshtein_distance("a", "b") == 1
    assert levenshtein_distance("a", "") == 1
    assert levenshtein_distance("", "b") == 1

def test_levenshtein_distance_none_inputs():
    assert levenshtein_distance(None, "abc") == -1
    assert levenshtein_distance("abc", None) == -1
    assert levenshtein_distance(None, None) == -1

def test_levenshtein_distance_mixed_cases():
    assert levenshtein_distance("abc", "ABC") == 3
    assert levenshtein_distance("AbC", "aBc") == 2

def test_levenshtein_distance_unicode_strings():
    assert levenshtein_distance("你好", "你好") == 0
    assert levenshtein_distance("你好", "您好") == 1
    assert levenshtein_distance("你好", "世界") == 2

def test_levenshtein_distance_large_strings():
    s1 = "a" * 100
    s2 = "b" * 100
    assert levenshtein_distance(s1, s2) == 100
    assert levenshtein_distance(s1, s1) == 0

def test_levenshtein_distance_substring_cases():
    assert levenshtein_distance("abc", "abcd") == 1
    assert levenshtein_distance("abcd", "abc") == 1
    assert levenshtein_distance("abc", "ab") == 1

def test_levenshtein_distance_special_characters():
    assert levenshtein_distance("abc!", "abc") == 1
    assert levenshtein_distance("abc", "abc!") == 1
    assert levenshtein_distance("!@#", "!@#") == 0
    assert levenshtein_distance("!@#", "@#!") == 2

def test_levenshtein_distance_whitespace():
    assert levenshtein_distance("abc ", "abc") == 1
    assert levenshtein_distance(" abc", "abc") == 1
    assert levenshtein_distance("abc", "a bc") == 1
    assert levenshtein_distance("abc", "a  bc") == 2
    assert levenshtein_distance(" ", "") == 1
    assert levenshtein_distance("", " ") == 1