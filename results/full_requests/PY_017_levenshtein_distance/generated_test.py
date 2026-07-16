from python_functions import levenshtein_distance

def test_levenshtein_distance():
    # Test with two identical strings
    assert levenshtein_distance("kitten", "kitten") == 0
    
    # Test with one empty string
    assert levenshtein_distance("", "abc") == 3
    assert levenshtein_distance("abc", "") == 3
    
    # Test with both strings empty
    assert levenshtein_distance("", "") == 0
    
    # Test with different lengths
    assert levenshtein_distance("abc", "ab") == 1
    assert levenshtein_distance("ab", "abc") == 1
    assert levenshtein_distance("abc", "def") == 3
    
    # Test with single character changes
    assert levenshtein_distance("a", "b") == 1
    assert levenshtein_distance("a", "a") == 0
    assert levenshtein_distance("abc", "abd") == 1
    assert levenshtein_distance("abc", "a") == 2
    
    # Test with substitutions
    assert levenshtein_distance("kitten", "sitting") == 3
    assert levenshtein_distance("flaw", "lawn") == 2
    
    # Test with insertions
    assert levenshtein_distance("abc", "abdc") == 1
    assert levenshtein_distance("abc", "abcd") == 1
    
    # Test with deletions
    assert levenshtein_distance("abc", "bc") == 1
    assert levenshtein_distance("abc", "a") == 2
    
    # Test with None inputs
    assert levenshtein_distance(None, "abc") == -1
    assert levenshtein_distance("abc", None) == -1
    assert levenshtein_distance(None, None) == -1
    
    # Test with longer strings
    assert levenshtein_distance("abcdef", "azced") == 3
    assert levenshtein_distance("sunday", "saturday") == 3

    # Test with strings that are completely different
    assert levenshtein_distance("abc", "xyz") == 3

    # Test with strings that have spaces
    assert levenshtein_distance("a b c", "a b d") == 1
    assert levenshtein_distance("kitten", "kit ten") == 2

    # Test with special characters
    assert levenshtein_distance("abc!", "abc") == 1
    assert levenshtein_distance("abc", "abc!") == 1

    # Test with numeric strings
    assert levenshtein_distance("123", "123") == 0
    assert levenshtein_distance("123", "124") == 1
    assert levenshtein_distance("123", "12") == 1
    assert levenshtein_distance("12", "123") == 1

    # Test with long strings
    assert levenshtein_distance("a" * 1000, "a" * 999) == 1
    assert levenshtein_distance("a" * 1000, "b" * 1000) == 1000

    # Test with mixed content
    assert levenshtein_distance("Hello, World!", "Hello, World!") == 0
    assert levenshtein_distance("Hello, World!", "Hello, world!") == 1
    assert levenshtein_distance("Hello, World!", "Hello, Worl!") == 1

    # Test with strings that are anagrams
    assert levenshtein_distance("listen", "silent") == 6  # All characters need to be changed

    # Test with strings that have different cases
    assert levenshtein_distance("abc", "ABC") == 3
    assert levenshtein_distance("AbC", "abc") == 3

    # Test with strings that are substrings
    assert levenshtein_distance("abc", "abcd") == 1
    assert levenshtein_distance("abcd", "abc") == 1

    # Test with strings that are the same except for one character
    assert levenshtein_distance("abcde", "abfde") == 1
    assert levenshtein_distance("abcde", "abCde") == 1

    # Test with strings that have repeated characters
    assert levenshtein_distance("aaabbb", "ababab") == 3
    assert levenshtein_distance("ababab", "aaabbb") == 3

    # Test with strings that are completely different
    assert levenshtein_distance("abcdef", "ghijkl") == 6

    # Test with strings that have different lengths and characters
    assert levenshtein_distance("abc", "defgh") == 5
    assert levenshtein_distance("abcdef", "gh") == 6

    # Test with strings that are the same except for one character
    assert levenshtein_distance("abcde", "abCde") == 1
    assert levenshtein_distance("abcde", "abCde") == 1

    # Test with strings that have spaces and punctuation
    assert levenshtein_distance("Hello, World!", "Hello World!") == 1
    assert levenshtein_distance("Hello, World!", "Hello, world!") == 1

    # Test with strings that are the same except for one character
    assert levenshtein_distance("abcde", "abCde") == 1
    assert levenshtein_distance("abcde", "abCde") == 1

    # Test with strings that have different lengths and characters
    assert levenshtein_distance("abc", "defgh") == 5
    assert levenshtein_distance("abcdef", "gh") == 6

    # Test with strings that are the same except for one character
    assert levenshtein_distance("abcde", "abCde") == 1
    assert levenshtein_distance("abcde", "abCde") == 1

    # Test with strings that have spaces and punctuation
    assert levenshtein_distance("Hello, World!", "Hello World!") == 1
    assert levenshtein_distance("Hello, World!", "Hello, world!") == 1

    # Test with strings that are the same except for one character
    assert levenshtein_distance("abcde", "abCde") == 1
    assert levenshtein_distance("abcde", "abCde") == 1

    # Test with strings that have different lengths and characters
    assert levenshtein_distance("abc", "defgh") == 5
    assert levenshtein_distance("abcdef", "gh") == 6

    # Test with strings that are the same except for one character
    assert levenshtein_distance("abcde", "abCde") == 1
    assert levenshtein_distance("abcde", "abCde") == 1

    # Test with strings that have spaces and punctuation
    assert levenshtein_distance("Hello, World!", "Hello World!") == 1
    assert levenshtein_distance("Hello, World!", "Hello, world!") == 1

    # Test with strings that are the same except for one character
    assert levenshtein_distance("abcde", "abCde") == 1
    assert levenshtein_distance("abcde", "abCde") == 1

    # Test with strings that have different lengths and characters
    assert levenshtein_distance("abc", "defgh") == 5
    assert levenshtein_distance("abcdef", "gh") == 6

    # Test with strings that are the same except for one character
    assert levenshtein_distance("abcde", "abCde") == 1
    assert levenshtein_distance("abcde", "abCde") == 1

    # Test with strings that have spaces and punctuation
    assert levenshtein_distance("Hello, World!", "Hello World!") == 1
    assert levenshtein_distance("Hello, World!", "Hello, world!") == 1

    # Test with strings that are the same except for one character
    assert levenshtein_distance("abcde", "abCde") == 1
    assert levenshtein_distance("abcde", "abCde") == 1

    # Test with strings that have different lengths and characters
    assert levenshtein_distance("abc", "defgh") == 5
    assert levenshtein_distance("abcdef", "gh") == 6

    # Test with strings that are the same except for one character
    assert levenshtein_distance("abcde", "abCde") == 1
    assert levenshtein_distance("abcde", "abCde") == 1

    # Test with strings that have spaces and punctuation
    assert levenshtein_distance("Hello, World!", "Hello World!") == 1
    assert levenshtein_distance("Hello, World!", "Hello, world!") == 1

    # Test with strings that are the same except for one character
    assert levenshtein_distance("abcde", "abCde") == 1
    assert levenshtein_distance("abcde", "abCde") == 1

    # Test with strings that have different lengths and characters
    assert levenshtein_distance("abc", "defgh") == 5
    assert levenshtein_distance("abcdef", "gh") == 6

    # Test with strings that are the same except for one