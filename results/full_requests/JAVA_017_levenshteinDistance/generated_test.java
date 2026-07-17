import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class JAVA_017_levenshteinDistanceTest {
    @Test void rejectsNull() { assertEquals(-1,JavaAlgorithms.levenshteinDistance(null,"a")); assertEquals(-1,JavaAlgorithms.levenshteinDistance("a",null)); }
    @Test void handlesEmptyAndEqualStrings() { assertEquals(3,JavaAlgorithms.levenshteinDistance("","abc")); assertEquals(0,JavaAlgorithms.levenshteinDistance("same","same")); }
    @Test void computesInsertDeleteSubstituteDistance() { assertEquals(3,JavaAlgorithms.levenshteinDistance("kitten","sitting")); assertEquals(1,JavaAlgorithms.levenshteinDistance("cat","cut")); }
}
