import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {

    @Test
    public void testBinarySearch_TargetInMiddle() {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        int result = JAVA_002_binarySearch.binarySearch(arr, target);
        assertEquals(2, result);
    }

    @Test
    public void testBinarySearch_TargetAtStart() {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 1;
        int result = JAVA_002_binarySearch.binarySearch(arr, target);
        assertEquals(0, result);
    }

    @Test
    public void testBinarySearch_TargetAtEnd() {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 5;
        int result = JAVA_002_binarySearch.binarySearch(arr, target);
        assertEquals(4, result);
    }

    @Test
    public void testBinarySearch_TargetNotFound() {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 6;
        int result = JAVA_002_binarySearch.binarySearch(arr, target);
        assertEquals(-1, result);
    }

    @Test
    public void testBinarySearch_EmptyArray() {
        int[] arr = {};
        int target = 1;
        int result = JAVA_002_binarySearch.binarySearch(arr, target);
        assertEquals(-1, result);
    }

    @Test
    public void testBinarySearch_NullArray() {
        int[] arr = null;
        int target = 1;
        int result = JAVA_002_binarySearch.binarySearch(arr, target);
        assertEquals(-1, result);
    }

    @Test
    public void testBinarySearch_SingleElementArray_TargetFound() {
        int[] arr = {1};
        int target = 1;
        int result = JAVA_002_binarySearch.binarySearch(arr, target);
        assertEquals(0, result);
    }

    @Test
    public void testBinarySearch_SingleElementArray_TargetNotFound() {
        int[] arr = {1};
        int target = 2;
        int result = JAVA_002_binarySearch.binarySearch(arr, target);
        assertEquals(-1, result);
    }

    @Test
    public void testBinarySearch_MultipleSameElements_TargetFound() {
        int[] arr = {1, 1, 1, 1, 1};
        int target = 1;
        int result = JAVA_002_binarySearch.binarySearch(arr, target);
        assertTrue(result >= 0 && result < arr.length);
    }

    @Test
    public void testBinarySearch_MultipleSameElements_TargetNotFound() {
        int[] arr = {1, 1, 1, 1, 1};
        int target = 2;
        int result = JAVA_002_binarySearch.binarySearch(arr, target);
        assertEquals(-1, result);
    }
}