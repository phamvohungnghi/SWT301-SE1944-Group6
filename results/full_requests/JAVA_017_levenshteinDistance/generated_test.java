import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LevenshteinDistanceTest {

    @Test
    public void testNullInputs() {
        assertEquals(-1, JAVA_017_levenshteinDistance(null, "test"), "Null first string should return -1");
        assertEquals(-1, JAVA_017_levenshteinDistance("test", null), "Null second string should return -1");
        assertEquals(-1, JAVA_017_levenshteinDistance(null, null), "Both strings null should return -1");
    }

    @Test
    public void testEmptyStrings() {
        assertEquals(0, JAVA_017_levenshteinDistance("", ""), "Both strings empty should return 0");
        assertEquals(4, JAVA_017_levenshteinDistance("", "test"), "Empty first string should return length of second string");
        assertEquals(4, JAVA_017_levenshteinDistance("test", ""), "Empty second string should return length of first string");
    }

    @Test
    public void testIdenticalStrings() {
        assertEquals(0, JAVA_017_levenshteinDistance("test", "test"), "Identical strings should return 0");
        assertEquals(0, JAVA_017_levenshteinDistance("a", "a"), "Single identical characters should return 0");
    }

    @Test
    public void testSingleCharacterStrings() {
        assertEquals(1, JAVA_017_levenshteinDistance("a", "b"), "Different single characters should return 1");
        assertEquals(1, JAVA_017_levenshteinDistance("a", ""), "Single character and empty string should return 1");
        assertEquals(1, JAVA_017_levenshteinDistance("", "b"), "Empty string and single character should return 1");
    }

    @Test
    public void testGeneralCases() {
        assertEquals(3, JAVA_017_levenshteinDistance("kitten", "sitting"), "Distance between 'kitten' and 'sitting' should be 3");
        assertEquals(1, JAVA_017_levenshteinDistance("flaw", "flaws"), "Distance between 'flaw' and 'flaws' should be 1");
        assertEquals(2, JAVA_017_levenshteinDistance("gumbo", "gambol"), "Distance between 'gumbo' and 'gambol' should be 2");
        assertEquals(4, JAVA_017_levenshteinDistance("book", "back"), "Distance between 'book' and 'back' should be 4");
    }

    @Test
    public void testCaseSensitivity() {
        assertEquals(1, JAVA_017_levenshteinDistance("Test", "test"), "Case difference should count as one edit");
        assertEquals(4, JAVA_017_levenshteinDistance("TEST", "test"), "All characters different in case should return string length");
    }

    @Test
    public void testLongStrings() {
        assertEquals(6, JAVA_017_levenshteinDistance("abcdef", "ghijkl"), "Completely different strings of same length should return length");
        assertEquals(3, JAVA_017_levenshteinDistance("abcdef", "abcxyz"), "Half different strings should return half length");
    }

    @Test
    public void testPrefixSuffixCases() {
        assertEquals(3, JAVA_017_levenshteinDistance("abc", "abcdef"), "Adding suffix should return suffix length");
        assertEquals(3, JAVA_017_levenshteinDistance("abcdef", "abc"), "Removing suffix should return suffix length");
        assertEquals(3, JAVA_017_levenshteinDistance("def", "abcdef"), "Adding prefix should return prefix length");
        assertEquals(3, JAVA_017_levenshteinDistance("abcdef", "def"), "Removing prefix should return prefix length");
    }
}