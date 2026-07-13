import pytest

def longest_palindrome_substring(s):
    if not s:
        return ""
    longest = ""
    for i in range(len(s)):
        l, r = i, i
        while l >= 0 and r < len(s) and s[l] == s[r]:
            if (r - l + 1) > len(longest):
                longest = s[l:r+1]
            l -= 1
            r += 1
        l, r = i, i + 1
        while l >= 0 and r < len(s) and s[l] == s[r]:
            if (r - l + 1) > len(longest):
                longest = s[l:r+1]
            l -= 1
            r += 1
    return longest

def test_longest_palindrome_substring():
    # Test with a simple palindrome
    assert longest_palindrome_substring("babad") in ["bab", "aba"]
    
    # Test with a single character
    assert longest_palindrome_substring("a") == "a"
    
    # Test with two identical characters
    assert longest_palindrome_substring("aa") == "aa"
    
    # Test with two different characters
    assert longest_palindrome_substring("ab") == "a"
    
    # Test with an empty string
    assert longest_palindrome_substring("") == ""
    
    # Test with a longer palindrome
    assert longest_palindrome_substring("racecar") == "racecar"
    
    # Test with a string that has no palindrome longer than 1
    assert longest_palindrome_substring("abcde") == "a"
    
    # Test with a string that has multiple palindromes
    assert longest_palindrome_substring("cbbd") in ["bb", "b"]
    
    # Test with a string that is a palindrome
    assert longest_palindrome_substring("aibohphobia") == "aibohphobia"
    
    # Test with a string that has mixed case
    assert longest_palindrome_substring("Aibohphobia") == "A"
    
    # Test with a string that has special characters
    assert longest_palindrome_substring("!@#$$#@!") == "$$"
    
    # Test with a long string with no palindromes
    assert longest_palindrome_substring("abcdefghijklmnopqrstuvwxyz") == "a"
    
    # Test with a string that is a palindrome with spaces
    assert longest_palindrome_substring("a man a plan a canal panama") == " a "
    
    # Test with a string that has a palindrome at the end
    assert longest_palindrome_substring("abcba") == "abcba"
    
    # Test with a string that has a palindrome at the start
    assert longest_palindrome_substring("abccba") == "abccba"