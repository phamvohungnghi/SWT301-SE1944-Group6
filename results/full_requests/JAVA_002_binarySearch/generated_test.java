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
    void testMultipleElementsTargetNotFoundLessThanMin() {
        int[] arr = {1, 3, 5, 7, 9};
        int target = -1;
        assertEquals(-1, JAVA_002_binarySearch.binarySearch(arr, target));
    }

    @Test
    void testMultipleElementsTargetNotFoundGreaterThanMax() {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 11;
        assertEquals(-1, JAVA_002_binarySearch.binarySearch(arr, target));
    }

    @Test
    void testMultipleElementsTargetNotFoundInRange() {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 4;
        assertEquals(-1, JAVA_002_binarySearch.binarySearch(arr, target));
    }

    @Test
    void testTwoElementsTargetFoundAtStart() {
        int[] arr = {1, 3};
        int target = 1;
        assertEquals(0, JAVA_002_binarySearch.binarySearch(arr, target));
    }

    @Test
    void testTwoElementsTargetFoundAtEnd() {
        int[] arr = {1, 3};
        int target = 3;
        assertEquals(1, JAVA_002_binarySearch.binarySearch(arr, target));
    }

    @Test
    void testTwoElementsTargetNotFound() {
        int[] arr = {1, 3};
        int target = 2;
        assertEquals(-1, JAVA_002_binarySearch.binarySearch(arr, target));
    }
}