from python_functions import longest_palindrome_substring

def test_longest_palindrome_substring():
    # Test with a simple palindrome
    assert longest_palindrome_substring("babad") in ["bab", "aba"]
    
    # Test with a single character
    assert longest_palindrome_substring("a") == "a"
    
    # Test with two characters, both the same
    assert longest_palindrome_substring("aa") == "aa"
    
    # Test with two characters, different
    assert longest_palindrome_substring("ab") in ["a", "b"]
    
    # Test with an empty string
    assert longest_palindrome_substring("") == ""
    
    # Test with a longer palindrome
    assert longest_palindrome_substring("cbbd") == "bb"
    
    # Test with a string that has no palindrome longer than 1
    assert longest_palindrome_substring("abcde") in ["a", "b", "c", "d", "e"]
    
    # Test with a complex palindrome
    assert longest_palindrome_substring("racecar") == "racecar"
    
    # Test with a string that has multiple palindromes
    assert longest_palindrome_substring("aabbccddeeffgghhiijj") in ["aa", "bb", "cc", "dd", "ee", "ff", "gg", "hh", "ii", "jj"]
    
    # Test with a string that is a palindrome with spaces
    assert longest_palindrome_substring("a man a plan a canal panama") == "ana"
    
    # Test with a string that has mixed case
    assert longest_palindrome_substring("Aba") in ["A", "a", "b"]
    
    # Test with a string that has special characters
    assert longest_palindrome_substring("!@#$$#@!") == "$$"
    
    # Test with a long string with no palindromes
    assert longest_palindrome_substring("abcdefghijklmnopqrstuvwxyz") in ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"]