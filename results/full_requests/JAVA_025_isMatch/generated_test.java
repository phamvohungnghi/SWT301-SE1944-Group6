import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JAVA_025_isMatchTest {

    @Test
    void testNullInputs() {
        assertFalse(JAVA_025_isMatch.isMatch(null, null));
        assertFalse(JAVA_025_isMatch.isMatch(null, "a*"));
        assertFalse(JAVA_025_isMatch.isMatch("abc", null));
    }

    @Test
    void testEmptyPattern() {
        assertTrue(JAVA_025_isMatch.isMatch("", ""));
        assertFalse(JAVA_025_isMatch.isMatch("a", ""));
    }

    @Test
    void testEmptyString() {
        assertTrue(JAVA_025_isMatch.isMatch("", "a*"));
        assertFalse(JAVA_025_isMatch.isMatch("", "a"));
        assertTrue(JAVA_025_isMatch.isMatch("", ".*"));
    }

    @Test
    void testExactMatch() {
        assertTrue(JAVA_025_isMatch.isMatch("abc", "abc"));
        assertFalse(JAVA_025_isMatch.isMatch("abc", "abcd"));
        assertFalse(JAVA_025_isMatch.isMatch("abcd", "abc"));
    }

    @Test
    void testSingleCharacterWildcard() {
        assertTrue(JAVA_025_isMatch.isMatch("a", "."));
        assertFalse(JAVA_025_isMatch.isMatch("", "."));
        assertTrue(JAVA_025_isMatch.isMatch("abc", "a.c"));
        assertFalse(JAVA_025_isMatch.isMatch("abc", "a.d"));
    }

    @Test
    void testKleeneStar() {
        assertTrue(JAVA_025_isMatch.isMatch("aa", "a*"));
        assertTrue(JAVA_025_isMatch.isMatch("aaa", "a*"));
        assertTrue(JAVA_025_isMatch.isMatch("a", "a*"));
        assertTrue(JAVA_025_isMatch.isMatch("", "a*"));
        assertFalse(JAVA_025_isMatch.isMatch("b", "a*"));
    }

    @Test
    void testCombinationOfWildcardAndStar() {
        assertTrue(JAVA_025_isMatch.isMatch("abc", ".*"));
        assertTrue(JAVA_025_isMatch.isMatch("a", ".*"));
        assertTrue(JAVA_025_isMatch.isMatch("", ".*"));
        assertTrue(JAVA_025_isMatch.isMatch("ab", ".*b"));
        assertFalse(JAVA_025_isMatch.isMatch("ab", ".*c"));
    }

    @Test
    void testComplexPatterns() {
        assertTrue(JAVA_025_isMatch.isMatch("aab", "c*a*b"));
        assertFalse(JAVA_025_isMatch.isMatch("mississippi", "mis*is*p*."));
        assertTrue(JAVA_025_isMatch.isMatch("mississippi", "mis*is*ip*."));
        assertTrue(JAVA_025_isMatch.isMatch("ab", ".*c*"));
        assertFalse(JAVA_025_isMatch.isMatch("abc", ".*c*d"));
    }

    @Test
    void testEdgeCases() {
        assertFalse(JAVA_025_isMatch.isMatch("a", "a*a*a*a*a*a*a*a*a*a*b"));
        assertTrue(JAVA_025_isMatch.isMatch("aaaaaaaaaaaaab", "a*a*a*a*a*a*a*a*a*a*b"));
        assertTrue(JAVA_025_isMatch.isMatch("a", ".*..a*"));
        assertFalse(JAVA_025_isMatch.isMatch("a", ".*..b*"));
    }
}