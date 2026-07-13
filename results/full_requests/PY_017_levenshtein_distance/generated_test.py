import pytest

def test_levenshtein_distance():
    # Test cases for levenshtein_distance function

    # Test with two identical strings
    assert levenshtein_distance("kitten", "kitten") == 0

    # Test with one empty string
    assert levenshtein_distance("", "abc") == 3
    assert levenshtein_distance("abc", "") == 3

    # Test with both strings empty
    assert levenshtein_distance("", "") == 0

    # Test with different strings
    assert levenshtein_distance("kitten", "sitting") == 3
    assert levenshtein_distance("flaw", "lawn") == 2
    assert levenshtein_distance("intention", "execution") == 5

    # Test with strings of different lengths
    assert levenshtein_distance("abc", "ab") == 1
    assert levenshtein_distance("a", "abc") == 2
    assert levenshtein_distance("abc", "a") == 2

    # Test with None inputs
    assert levenshtein_distance(None, "abc") == -1
    assert levenshtein_distance("abc", None) == -1
    assert levenshtein_distance(None, None) == -1

    # Test with single character strings
    assert levenshtein_distance("a", "b") == 1
    assert levenshtein_distance("a", "a") == 0

    # Test with strings that are completely different
    assert levenshtein_distance("abc", "xyz") == 3
    assert levenshtein_distance("abcdef", "ghijkl") == 6

    # Test with strings that require multiple operations
    assert levenshtein_distance("abc", "yabc") == 1
    assert levenshtein_distance("abc", "abcy") == 1
    assert levenshtein_distance("abc", "xyzabc") == 3

    # Test with long strings
    assert levenshtein_distance("a" * 1000, "a" * 999) == 1
    assert levenshtein_distance("a" * 1000, "b" * 1000) == 1000

    # Test with strings that have repeated characters
    assert levenshtein_distance("aaa", "a") == 2
    assert levenshtein_distance("a", "aaa") == 2

    # Test with strings that are substrings of each other
    assert levenshtein_distance("abc", "abcd") == 1
    assert levenshtein_distance("abcd", "abc") == 1

    # Test with strings that are anagrams
    assert levenshtein_distance("listen", "silent") == 6  # All characters need to be rearranged

    # Test with special characters
    assert levenshtein_distance("abc!@#", "abc") == 3
    assert levenshtein_distance("abc", "abc!@#") == 3

    # Test with numeric strings
    assert levenshtein_distance("123", "123") == 0
    assert levenshtein_distance("123", "456") == 3
    assert levenshtein_distance("123", "12") == 1
    assert levenshtein_distance("12", "123") == 1

    # Test with whitespace
    assert levenshtein_distance("abc ", "abc") == 1
    assert levenshtein_distance("abc", "abc ") == 1
    assert levenshtein_distance("abc ", " abc") == 1
    assert levenshtein_distance(" abc", "abc ") == 2