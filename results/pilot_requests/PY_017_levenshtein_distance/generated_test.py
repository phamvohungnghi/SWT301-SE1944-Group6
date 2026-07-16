from python_functions import levenshtein_distance

def test_levenshtein_distance():
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
    
    # Test with special characters
    assert levenshtein_distance("abc!", "abc") == 1
    assert levenshtein_distance("abc", "abc!") == 1
    
    # Test with None inputs
    assert levenshtein_distance(None, "abc") == -1
    assert levenshtein_distance("abc", None) == -1
    assert levenshtein_distance(None, None) == -1
    
    # Test with long strings
    assert levenshtein_distance("a" * 1000, "a" * 999) == 1
    assert levenshtein_distance("a" * 1000, "b" * 1000) == 1000

    # Test with strings that require all operations
    assert levenshtein_distance("abc", "yabd") == 2  # Replace 'a' with 'y' and 'c' with 'd'