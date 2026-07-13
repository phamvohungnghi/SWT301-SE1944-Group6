import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LevenshteinDistanceTest {

    @Test
    void testNullInputs() {
        assertEquals(-1, levenshteinDistance(null, null));
        assertEquals(-1, levenshteinDistance("test", null));
        assertEquals(-1, levenshteinDistance(null, "test"));
    }

    @Test
    void testEmptyStrings() {
        assertEquals(0, levenshteinDistance("", ""));
        assertEquals(4, levenshteinDistance("test", ""));
        assertEquals(4, levenshteinDistance("", "test"));
    }

    @Test
    void testIdenticalStrings() {
        assertEquals(0, levenshteinDistance("test", "test"));
        assertEquals(0, levenshteinDistance("a", "a"));
    }

    @Test
    void testSingleCharacterDifferences() {
        assertEquals(1, levenshteinDistance("a", "b"));
        assertEquals(1, levenshteinDistance("a", ""));
        assertEquals(1, levenshteinDistance("", "a"));
    }

    @Test
    void testMultipleCharacterDifferences() {
        assertEquals(2, levenshteinDistance("kitten", "sitting"));
        assertEquals(3, levenshteinDistance("flaw", "lawn"));
        assertEquals(5, levenshteinDistance("intention", "execution"));
    }

    @Test
    void testLongerStrings() {
        assertEquals(3, levenshteinDistance("abcdef", "azced"));
        assertEquals(4, levenshteinDistance("sunday", "saturday"));
    }

    @Test
    void testPerformance() {
        String s1 = "a".repeat(1000);
        String s2 = "b".repeat(1000);
        assertEquals(1000, levenshteinDistance(s1, s2));
    }
}