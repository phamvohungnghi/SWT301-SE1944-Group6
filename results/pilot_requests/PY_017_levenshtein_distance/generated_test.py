import pytest

def test_levenshtein_distance():
    # Test with two identical strings
    assert levenshtein_distance("test", "test") == 0
    
    # Test with one empty string
    assert levenshtein_distance("", "test") == 4
    assert levenshtein_distance("test", "") == 4
    
    # Test with both strings empty
    assert levenshtein_distance("", "") == 0
    
    # Test with completely different strings
    assert levenshtein_distance("abc", "xyz") == 3
    
    # Test with one string being a prefix of the other
    assert levenshtein_distance("abc", "ab") == 1
    assert levenshtein_distance("ab", "abc") == 1
    
    # Test with strings that have some common characters
    assert levenshtein_distance("kitten", "sitting") == 3
    assert levenshtein_distance("flaw", "lawn") == 2
    
    # Test with None inputs
    assert levenshtein_distance(None, "test") == -1
    assert levenshtein_distance("test", None) == -1
    assert levenshtein_distance(None, None) == -1
    
    # Test with strings of different lengths
    assert levenshtein_distance("short", "longer") == 3
    assert levenshtein_distance("longer", "short") == 3
    
    # Test with strings that are the same except for one character
    assert levenshtein_distance("abcde", "abfde") == 1
    assert levenshtein_distance("abcde", "abCde") == 1  # Case sensitivity
    
    # Test with strings that require multiple edits
    assert levenshtein_distance("abcdef", "azced") == 3
    assert levenshtein_distance("intention", "execution") == 5

    # Test with strings that are very long
    assert levenshtein_distance("a" * 1000, "a" * 999 + "b") == 1
    assert levenshtein_distance("a" * 1000, "b" * 1000) == 1000

    # Test with strings that have special characters
    assert levenshtein_distance("hello!", "hello") == 1
    assert levenshtein_distance("12345", "1234") == 1
    assert levenshtein_distance("abc!@#", "abc#@!") == 2