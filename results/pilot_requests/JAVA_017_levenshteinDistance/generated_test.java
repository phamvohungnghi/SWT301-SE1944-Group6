import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LevenshteinDistanceTest {

    @Test
    public void testBothStringsNull() {
        assertEquals(-1, JAVA_017_levenshteinDistance(null, null), "Both strings are null, expected -1.");
    }

    @Test
    public void testFirstStringNull() {
        assertEquals(-1, JAVA_017_levenshteinDistance(null, "test"), "First string is null, expected -1.");
    }

    @Test
    public void testSecondStringNull() {
        assertEquals(-1, JAVA_017_levenshteinDistance("test", null), "Second string is null, expected -1.");
    }

    @Test
    public void testBothStringsEmpty() {
        assertEquals(0, JAVA_017_levenshteinDistance("", ""), "Both strings are empty, expected 0.");
    }

    @Test
    public void testFirstStringEmpty() {
        assertEquals(4, JAVA_017_levenshteinDistance("", "test"), "First string is empty, expected length of second string.");
    }

    @Test
    public void testSecondStringEmpty() {
        assertEquals(4, JAVA_017_levenshteinDistance("test", ""), "Second string is empty, expected length of first string.");
    }

    @Test
    public void testIdenticalStrings() {
        assertEquals(0, JAVA_017_levenshteinDistance("test", "test"), "Identical strings, expected 0.");
    }

    @Test
    public void testSingleCharacterDifference() {
        assertEquals(1, JAVA_017_levenshteinDistance("test", "tent"), "Single character difference, expected 1.");
    }

    @Test
    public void testCompletelyDifferentStrings() {
        assertEquals(4, JAVA_017_levenshteinDistance("abcd", "wxyz"), "Completely different strings of same length, expected 4.");
    }

    @Test
    public void testOneStringIsPrefixOfAnother() {
        assertEquals(3, JAVA_017_levenshteinDistance("abc", "abcdef"), "One string is a prefix of the other, expected 3.");
    }

    @Test
    public void testOneStringIsSuffixOfAnother() {
        assertEquals(3, JAVA_017_levenshteinDistance("def", "abcdef"), "One string is a suffix of the other, expected 3.");
    }

    @Test
    public void testCaseSensitivity() {
        assertEquals(1, JAVA_017_levenshteinDistance("Test", "test"), "Case sensitivity, expected 1.");
    }

    @Test
    public void testStringsWithSpaces() {
        assertEquals(1, JAVA_017_levenshteinDistance("test", "test "), "Strings with spaces, expected 1.");
    }

    @Test
    public void testLongStrings() {
        String s1 = "abcdefghijklmnopqrstuvwxyz";
        String s2 = "abcdefghijklmnopqrstuvwxy";
        assertEquals(1, JAVA_017_levenshteinDistance(s1, s2), "Long strings with one character difference, expected 1.");
    }

    @Test
    public void testInsertionOperation() {
        assertEquals(1, JAVA_017_levenshteinDistance("abc", "abcd"), "Insertion operation, expected 1.");
    }

    @Test
    public void testDeletionOperation() {
        assertEquals(1, JAVA_017_levenshteinDistance("abcd", "abc"), "Deletion operation, expected 1.");
    }

    @Test
    public void testSubstitutionOperation() {
        assertEquals(1, JAVA_017_levenshteinDistance("abc", "adc"), "Substitution operation, expected 1.");
    }

    @Test
    public void testComplexCase() {
        assertEquals(3, JAVA_017_levenshteinDistance("kitten", "sitting"), "Complex case with multiple operations, expected 3.");
    }
}