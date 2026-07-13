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
    public void testLongStringWithPalindromes() {
        assertEquals("abcdedcba", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("abcdedcbaefg"));
    }

    @Test
    public void testLongStringWithoutPalindromes() {
        assertEquals("a", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("abcdefgh"));
    }

    @Test
    public void testPalindromeAtStart() {
        assertEquals("madam", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("madamxyz"));
    }

    @Test
    public void testPalindromeAtEnd() {
        assertEquals("deified", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("xyzdeified"));
    }

    @Test
    public void testPalindromeInMiddle() {
        assertEquals("noon", JAVA_015_longestPalindromeSubstring.longestPalindromeSubstring("abcnoonxyz"));
    }
}