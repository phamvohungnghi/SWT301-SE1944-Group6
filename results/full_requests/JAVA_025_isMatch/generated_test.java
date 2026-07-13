import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JAVA_025_isMatchTest {

    @Test
    void testNullPattern() {
        assertFalse(JAVA_025_isMatch.isMatch("abc", null));
    }

    @Test
    void testNullString() {
        assertFalse(JAVA_025_isMatch.isMatch(null, "a"));
    }

    @Test
    void testBothNull() {
        assertFalse(JAVA_025_isMatch.isMatch(null, null));
    }

    @Test
    void testEmptyPattern() {
        assertTrue(JAVA_025_isMatch.isMatch("", ""));
    }

    @Test
    void testEmptyStringWithEmptyPattern() {
        assertTrue(JAVA_025_isMatch.isMatch("", ""));
    }

    @Test
    void testEmptyStringWithNonEmptyPattern() {
        assertFalse(JAVA_025_isMatch.isMatch("", "a"));
    }

    @Test
    void testSingleCharacterMatch() {
        assertTrue(JAVA_025_isMatch.isMatch("a", "a"));
    }

    @Test
    void testSingleCharacterMismatch() {
        assertFalse(JAVA_025_isMatch.isMatch("a", "b"));
    }

    @Test
    void testDotMatch() {
        assertTrue(JAVA_025_isMatch.isMatch("a", "."));
    }

    @Test
    void testStarWithSingleMatch() {
        assertTrue(JAVA_025_isMatch.isMatch("aa", "a*"));
    }

    @Test
    void testStarWithMultipleMatches() {
        assertTrue(JAVA_025_isMatch.isMatch("aaa", "a*"));
    }

    @Test
    void testStarWithNoMatch() {
        assertFalse(JAVA_025_isMatch.isMatch("a", "b*"));
    }

    @Test
    void testComplexPatternMatch() {
        assertTrue(JAVA_025_isMatch.isMatch("aab", "c*a*b"));
    }

    @Test
    void testComplexPatternMismatch() {
        assertFalse(JAVA_025_isMatch.isMatch("mississippi", "mis*is*p*."));
    }

    @Test
    void testPatternWithMultipleStars() {
        assertTrue(JAVA_025_isMatch.isMatch("ab", ".*"));
    }

    @Test
    void testPatternWithLeadingStar() {
        assertFalse(JAVA_025_isMatch.isMatch("abc", "*a"));
    }

    @Test
    void testPatternWithTrailingStar() {
        assertTrue(JAVA_025_isMatch.isMatch("abc", "abc*"));
    }

    @Test
    void testPatternWithOnlyStar() {
        assertTrue(JAVA_025_isMatch.isMatch("abc", ".*"));
    }

    @Test
    void testLongStringWithStar() {
        assertTrue(JAVA_025_isMatch.isMatch("abbbbbbc", "ab*bc"));
    }

    @Test
    void testLongStringWithStarMismatch() {
        assertFalse(JAVA_025_isMatch.isMatch("abbbbbbc", "ab*cd"));
    }
}