import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class JAVA_002_binarySearchTest {
    @Test void rejectsMissingInput() { assertEquals(-1, JavaAlgorithms.binarySearch(null, 1)); assertEquals(-1, JavaAlgorithms.binarySearch(new int[]{}, 1)); }
    @Test void findsTargets() { int[] a={1,3,5,7,9}; assertEquals(0, JavaAlgorithms.binarySearch(a,1)); assertEquals(2, JavaAlgorithms.binarySearch(a,5)); assertEquals(4, JavaAlgorithms.binarySearch(a,9)); }
    @Test void returnsMinusOneWhenAbsent() { assertEquals(-1, JavaAlgorithms.binarySearch(new int[]{1,3,5},4)); }
}
