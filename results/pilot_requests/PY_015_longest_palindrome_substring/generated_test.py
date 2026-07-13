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
    
    # Test with two characters, both the same
    assert longest_palindrome_substring("aa") == "aa"
    
    # Test with two characters, different
    assert longest_palindrome_substring("ab") == "a"
    
    # Test with an empty string
    assert longest_palindrome_substring("") == ""
    
    # Test with a longer palindrome
    assert longest_palindrome_substring("racecar") == "racecar"
    
    # Test with a string that has no palindrome longer than 1
    assert longest_palindrome_substring("abcde") == "a"
    
    # Test with a string that has multiple palindromes
    assert longest_palindrome_substring("cbbd") in ["bb"]
    
    # Test with a string that is a palindrome
    assert longest_palindrome_substring("aabbcc") in ["aa", "bb", "cc"]
    
    # Test with a string that has odd-length palindromes
    assert longest_palindrome_substring("abccba") == "abccba"
    
    # Test with a string that has even-length palindromes
    assert longest_palindrome_substring("abba") == "abba"
    
    # Test with a string that has mixed characters
    assert longest_palindrome_substring("A man, a plan, a canal: Panama") == "a"
    
    # Test with a long string with no palindromes
    assert longest_palindrome_substring("abcdefghijklmnopqrstuvwxyz") == "a"
    
    # Test with a string that is a single character repeated
    assert longest_palindrome_substring("aaaaaa") == "aaaaaa"