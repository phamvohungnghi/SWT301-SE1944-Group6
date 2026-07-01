import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class JAVA_015_longestPalindromeSubstringTest {

    @Test
    public void testNullInput() {
        assertEquals("", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring(null), "Null input should return an empty string");
    }

    @Test
    public void testEmptyString() {
        assertEquals("", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring(""), "Empty string should return an empty string");
    }

    @Test
    public void testSingleCharacterString() {
        assertEquals("a", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("a"), "Single character string should return itself");
    }

    @Test
    public void testTwoCharacterPalindrome() {
        assertEquals("aa", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("aa"), "Two-character palindrome should return itself");
    }

    @Test
    public void testTwoCharacterNonPalindrome() {
        assertEquals("a", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("ab"), "Two-character non-palindrome should return the first character");
    }

    @Test
    public void testOddLengthPalindrome() {
        assertEquals("aba", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("aba"), "Odd-length palindrome should return itself");
    }

    @Test
    public void testEvenLengthPalindrome() {
        assertEquals("abba", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("abba"), "Even-length palindrome should return itself");
    }

    @Test
    public void testStringWithMultiplePalindromes() {
        assertEquals("anana", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("bananas"), "Should return the longest palindrome in the string");
    }

    @Test
    public void testStringWithNoPalindrome() {
        assertEquals("a", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("abcdefg"), "Should return the first character when no palindrome exists");
    }

    @Test
    public void testStringWithAllSameCharacters() {
        assertEquals("aaaaa", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("aaaaa"), "Should return the entire string if all characters are the same");
    }

    @Test
    public void testPalindromeAtStart() {
        assertEquals("racecar", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("racecarxyz"), "Should return the palindrome at the start of the string");
    }

    @Test
    public void testPalindromeAtEnd() {
        assertEquals("racecar", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("xyzracecar"), "Should return the palindrome at the end of the string");
    }

    @Test
    public void testPalindromeInMiddle() {
        assertEquals("racecar", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("xyzracecarxyz"), "Should return the palindrome in the middle of the string");
    }

    @Test
    public void testStringWithSpecialCharacters() {
        assertEquals("!@#!@#", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("abc!@#!@#def"), "Should handle special characters correctly");
    }

    @Test
    public void testStringWithSpaces() {
        assertEquals(" a ", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("a b a"), "Should handle spaces correctly in the palindrome");
    }

    @Test
    public void testLongString() {
        String input = "a".repeat(1000) + "b" + "a".repeat(1000);
        assertEquals("a".repeat(1000) + "b" + "a".repeat(1000), JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring(input), "Should handle long strings correctly");
    }
}