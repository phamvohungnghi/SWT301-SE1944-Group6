import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LongestPalindromeSubstringTest {

    @Test
    public void testNullInput() {
        assertEquals("", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring(null));
    }

    @Test
    public void testEmptyString() {
        assertEquals("", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring(""));
    }

    @Test
    public void testSingleCharacter() {
        assertEquals("a", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("a"));
    }

    @Test
    public void testTwoIdenticalCharacters() {
        assertEquals("aa", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("aa"));
    }

    @Test
    public void testTwoDifferentCharacters() {
        assertEquals("a", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("ab"));
    }

    @Test
    public void testOddLengthPalindrome() {
        assertEquals("aba", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("abacdfgdcaba"));
    }

    @Test
    public void testEvenLengthPalindrome() {
        assertEquals("abba", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("cbbd"));
    }

    @Test
    public void testNoPalindrome() {
        assertEquals("a", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("abc"));
    }

    @Test
    public void testMultiplePalindromes() {
        assertEquals("racecar", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("racecarxyz"));
    }

    @Test
    public void testLongestPalindromeAtStart() {
        assertEquals("madam", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("madamxyz"));
    }

    @Test
    public void testLongestPalindromeAtEnd() {
        assertEquals("deified", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("xyzdeified"));
    }

    @Test
    public void testLongestPalindromeInMiddle() {
        assertEquals("anana", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("bananas"));
    }

    @Test
    public void testAllIdenticalCharacters() {
        assertEquals("aaaa", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("aaaa"));
    }

    @Test
    public void testLongStringWithNoPalindrome() {
        assertEquals("a", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("abcdefgh"));
    }

    @Test
    public void testLongStringWithMultiplePalindromes() {
        assertEquals("abcba", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("abcbaabcba"));
    }
}