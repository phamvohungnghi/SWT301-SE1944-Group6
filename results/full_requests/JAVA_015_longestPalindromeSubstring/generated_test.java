import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JavaAlgorithmsTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testLongestPalindromeSubstring_NullInput() {
        assertEquals("", JavaAlgorithms.longestPalindromeSubstring(null));
    }

    @Test
    void testLongestPalindromeSubstring_EmptyInput() {
        assertEquals("", JavaAlgorithms.longestPalindromeSubstring(""));
    }

    @Test
    void testLongestPalindromeSubstring_SingleCharacter() {
        assertEquals("a", JavaAlgorithms.longestPalindromeSubstring("a"));
    }

    @Test
    void testLongestPalindromeSubstring_TwoDifferentCharacters() {
        assertEquals("a", JavaAlgorithms.longestPalindromeSubstring("ab"));
    }

    @Test
    void testLongestPalindromeSubstring_TwoSameCharacters() {
        assertEquals("aa", JavaAlgorithms.longestPalindromeSubstring("aa"));
    }

    @Test
    void testLongestPalindromeSubstring_OddLengthPalindrome() {
        assertEquals("aba", JavaAlgorithms.longestPalindromeSubstring("abacdfgdcaba"));
    }

    @Test
    void testLongestPalindromeSubstring_EvenLengthPalindrome() {
        assertEquals("abba", JavaAlgorithms.longestPalindromeSubstring("cbbd"));
    }

    @Test
    void testLongestPalindromeSubstring_NoPalindrome() {
        assertEquals("a", JavaAlgorithms.longestPalindromeSubstring("abc"));
    }

    @Test
    void testLongestPalindromeSubstring_MultiplePalindromes() {
        assertEquals("bab", JavaAlgorithms.longestPalindromeSubstring("babad"));
    }

    @Test
    void testLongestPalindromeSubstring_ComplexCase() {
        assertEquals("racecar", JavaAlgorithms.longestPalindromeSubstring("racecarxyz"));
    }

    @Test
    void testLongestPalindromeSubstring_EntireStringIsPalindrome() {
        assertEquals("madam", JavaAlgorithms.longestPalindromeSubstring("madam"));
    }

    @Test
    void testLongestPalindromeSubstring_SpecialCharacters() {
        assertEquals("!@!", JavaAlgorithms.longestPalindromeSubstring("!@!abc!@!"));
    }

    @Test
    void testLongestPalindromeSubstring_Spaces() {
        assertEquals(" a ", JavaAlgorithms.longestPalindromeSubstring(" a b a "));
    }

    @Test
    void testLongestPalindromeSubstring_LongestAtStart() {
        assertEquals("abcba", JavaAlgorithms.longestPalindromeSubstring("abcbaxyz"));
    }

    @Test
    void testLongestPalindromeSubstring_LongestAtEnd() {
        assertEquals("xyzzyx", JavaAlgorithms.longestPalindromeSubstring("xyzzyxabc"));
    }
}