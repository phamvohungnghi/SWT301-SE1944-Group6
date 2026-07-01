import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void testNullArray() {
        int[] arr = null;
        int target = 5;
        assertEquals(-1, JAVA_002_binarySearch.binarySearch(arr, target));
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        int target = 5;
        assertEquals(-1, JAVA_002_binarySearch.binarySearch(arr, target));
    }

    @Test
    void testSingleElementArrayTargetFound() {
        int[] arr = {5};
        int target = 5;
        assertEquals(0, JAVA_002_binarySearch.binarySearch(arr, target));
    }

    @Test
    void testSingleElementArrayTargetNotFound() {
        int[] arr = {5};
        int target = 3;
        assertEquals(-1, JAVA_002_binarySearch.binarySearch(arr, target));
    }

    @Test
    void testMultipleElementsTargetFoundAtStart() {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 1;
        assertEquals(0, JAVA_002_binarySearch.binarySearch(arr, target));
    }

    @Test
    void testMultipleElementsTargetFoundAtEnd() {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 9;
        assertEquals(4, JAVA_002_binarySearch.binarySearch(arr, target));
    }

    @Test
    void testMultipleElementsTargetFoundInMiddle() {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 5;
        assertEquals(2, JAVA_002_binarySearch.binarySearch(arr, target));
    }

    @Test
    void testMultipleElementsTargetNotFound() {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 4;
        assertEquals(-1, JAVA_002_binarySearch.binarySearch(arr, target));
    }

    @Test
    void testMultipleElementsTargetLessThanAll() {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 0;
        assertEquals(-1, JAVA_002_binarySearch.binarySearch(arr, target));
    }

    @Test
    void testMultipleElementsTargetGreaterThanAll() {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 10;
        assertEquals(-1, JAVA_002_binarySearch.binarySearch(arr, target));
    }

    @Test
    void testArrayWithDuplicatesTargetFound() {
        int[] arr = {1, 3, 3, 5, 7, 9};
        int target = 3;
        int result = JAVA_002_binarySearch.binarySearch(arr, target);
        assertTrue(result == 1 || result == 2);
    }

    @Test
    void testArrayWithDuplicatesTargetNotFound() {
        int[] arr = {1, 3, 3, 5, 7, 9};
        int target = 4;
        assertEquals(-1, JAVA_002_binarySearch.binarySearch(arr, target));
    }
}