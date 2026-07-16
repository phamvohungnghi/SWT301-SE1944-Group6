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
    
    # Test with a string that is a palindrome
    assert longest_palindrome_substring("racecar") == "racecar"
    
    # Test with a string that has multiple palindromes
    assert longest_palindrome_substring("aabbcc") in ["aa", "bb", "cc"]
    
    # Test with a string that has mixed case
    assert longest_palindrome_substring("Aba") in ["A", "b", "a"]
    
    # Test with a string that has special characters
    assert longest_palindrome_substring("!@#$$#@!") == "$$"
    
    # Test with a long string with a palindrome in the middle
    assert longest_palindrome_substring("xyzracecarxyz") == "racecar"
    
    # Test with a string that is a palindrome with spaces
    assert longest_palindrome_substring("a man a plan a canal panama") in [" a ", " a ", " a ", " a ", " a "]
    
    # Test with a string that has no palindromes
    assert longest_palindrome_substring("abcdefgh") in ["a", "b", "c", "d", "e", "f", "g", "h"]