import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class JAVA_015_longestPalindromeSubstringTest {

    @Test
    void testNullInput() {
        assertEquals("", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring(null), "Null input should return an empty string.");
    }

    @Test
    void testEmptyString() {
        assertEquals("", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring(""), "Empty string should return an empty string.");
    }

    @Test
    void testSingleCharacterString() {
        assertEquals("a", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("a"), "Single character string should return the character itself.");
    }

    @Test
    void testTwoDifferentCharacters() {
        assertEquals("a", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("ab"), "For two different characters, the first character should be returned.");
    }

    @Test
    void testTwoSameCharacters() {
        assertEquals("aa", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("aa"), "For two same characters, the entire string should be returned.");
    }

    @Test
    void testPalindromeOddLength() {
        assertEquals("aba", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("aba"), "Odd-length palindrome should return the entire string.");
    }

    @Test
    void testPalindromeEvenLength() {
        assertEquals("abba", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("abba"), "Even-length palindrome should return the entire string.");
    }

    @Test
    void testNonPalindromeString() {
        assertEquals("a", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("abc"), "For a non-palindromic string, the first character should be returned.");
    }

    @Test
    void testStringWithMultiplePalindromes() {
        assertEquals("aba", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("abacdfgdcaba"), "Should return the longest palindrome substring.");
    }

    @Test
    void testStringWithPalindromeAtStart() {
        assertEquals("aba", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("abacdef"), "Should return the palindrome at the start of the string.");
    }

    @Test
    void testStringWithPalindromeAtEnd() {
        assertEquals("cdc", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("abacdc"), "Should return the palindrome at the end of the string.");
    }

    @Test
    void testStringWithEntireStringAsPalindrome() {
        assertEquals("racecar", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("racecar"), "Should return the entire string if it is a palindrome.");
    }

    @Test
    void testStringWithNoRepeatingCharacters() {
        assertEquals("a", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("abcdefg"), "Should return the first character for a string with no repeating characters.");
    }

    @Test
    void testStringWithAllSameCharacters() {
        assertEquals("aaaaa", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("aaaaa"), "Should return the entire string if all characters are the same.");
    }

    @Test
    void testStringWithSpecialCharacters() {
        assertEquals("!@#", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("!@#!@#"), "Should handle special characters and return the longest palindrome.");
    }

    @Test
    void testStringWithMixedCasePalindrome() {
        assertEquals("AaA", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("AaA"), "Should treat mixed case as valid palindrome.");
    }

    @Test
    void testStringWithSpaces() {
        assertEquals(" a ", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("a b a"), "Should include spaces in the palindrome.");
    }

    @Test
    void testLongString() {
        String input = "a".repeat(1000) + "b" + "a".repeat(1000);
        assertEquals("a".repeat(1000) + "b" + "a".repeat(1000), JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring(input), "Should handle very long strings.");
    }
}