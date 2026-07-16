import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JavaAlgorithmsTest {

    @Test
    public void testLevenshteinDistance() {
        // Test with two identical strings
        Assertions.assertEquals(0, JavaAlgorithms.levenshteinDistance("test", "test"));

        // Test with one empty string
        Assertions.assertEquals(4, JavaAlgorithms.levenshteinDistance("test", ""));
        Assertions.assertEquals(4, JavaAlgorithms.levenshteinDistance("", "test"));

        // Test with both strings empty
        Assertions.assertEquals(0, JavaAlgorithms.levenshteinDistance("", ""));

        // Test with different strings
        Assertions.assertEquals(1, JavaAlgorithms.levenshteinDistance("test", "tast"));
        Assertions.assertEquals(2, JavaAlgorithms.levenshteinDistance("test", "tastt"));
        Assertions.assertEquals(3, JavaAlgorithms.levenshteinDistance("test", "tset"));

        // Test with strings of different lengths
        Assertions.assertEquals(3, JavaAlgorithms.levenshteinDistance("kitten", "sitting"));
        Assertions.assertEquals(5, JavaAlgorithms.levenshteinDistance("flaw", "lawn"));

        // Test with null inputs
        Assertions.assertEquals(-1, JavaAlgorithms.levenshteinDistance(null, "test"));
        Assertions.assertEquals(-1, JavaAlgorithms.levenshteinDistance("test", null));
        Assertions.assertEquals(-1, JavaAlgorithms.levenshteinDistance(null, null));
    }
}