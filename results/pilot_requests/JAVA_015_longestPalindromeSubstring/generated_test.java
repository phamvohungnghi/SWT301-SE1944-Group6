import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JavaAlgorithmsTest {

    @Test
    public void testLongestPalindromeSubstring_NullInput() {
        assertEquals("", JavaAlgorithms.longestPalindromeSubstring(null));
    }

    @Test
    public void testLongestPalindromeSubstring_EmptyInput() {
        assertEquals("", JavaAlgorithms.longestPalindromeSubstring(""));
    }

    @Test
    public void testLongestPalindromeSubstring_SingleCharacter() {
        assertEquals("a", JavaAlgorithms.longestPalindromeSubstring("a"));
    }

    @Test
    public void testLongestPalindromeSubstring_TwoDifferentCharacters() {
        assertEquals("a", JavaAlgorithms.longestPalindromeSubstring("ab"));
    }

    @Test
    public void testLongestPalindromeSubstring_TwoSameCharacters() {
        assertEquals("aa", JavaAlgorithms.longestPalindromeSubstring("aa"));
    }

    @Test
    public void testLongestPalindromeSubstring_OddLengthPalindrome() {
        assertEquals("aba", JavaAlgorithms.longestPalindromeSubstring("abacdfgdcaba"));
    }

    @Test
    public void testLongestPalindromeSubstring_EvenLengthPalindrome() {
        assertEquals("abba", JavaAlgorithms.longestPalindromeSubstring("cbbd"));
    }

    @Test
    public void testLongestPalindromeSubstring_NoPalindrome() {
        assertEquals("a", JavaAlgorithms.longestPalindromeSubstring("abc"));
    }

    @Test
    public void testLongestPalindromeSubstring_MultiplePalindromes() {
        assertEquals("racecar", JavaAlgorithms.longestPalindromeSubstring("racecarxyz"));
    }

    @Test
    public void testLongestPalindromeSubstring_ComplexInput() {
        assertEquals("anana", JavaAlgorithms.longestPalindromeSubstring("bananas"));
    }

    @Test
    public void testLongestPalindromeSubstring_SpecialCharacters() {
        assertEquals("!@!", JavaAlgorithms.longestPalindromeSubstring("!@!abc!@!"));
    }

    @Test
    public void testLongestPalindromeSubstring_Spaces() {
        assertEquals(" a ", JavaAlgorithms.longestPalindromeSubstring(" a b a "));
    }

    @Test
    public void testLongestPalindromeSubstring_LongestAtStart() {
        assertEquals("abcba", JavaAlgorithms.longestPalindromeSubstring("abcbaabc"));
    }

    @Test
    public void testLongestPalindromeSubstring_LongestAtEnd() {
        assertEquals("abcba", JavaAlgorithms.longestPalindromeSubstring("xyzabcba"));
    }

    @Test
    public void testLongestPalindromeSubstring_LongestInMiddle() {
        assertEquals("xyzzyx", JavaAlgorithms.longestPalindromeSubstring("axyzzyxabc"));
    }
}