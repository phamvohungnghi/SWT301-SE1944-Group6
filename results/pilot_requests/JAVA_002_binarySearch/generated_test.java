import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {

    @Test
    public void testBinarySearchWithNullArray() {
        assertEquals(-1, JAVA_002_binarySearch.binarySearch(null, 5));
    }

    @Test
    public void testBinarySearchWithEmptyArray() {
        assertEquals(-1, JAVA_002_binarySearch.binarySearch(new int[]{}, 5));
    }

    @Test
    public void testBinarySearchWithSingleElementArray_TargetFound() {
        assertEquals(0, JAVA_002_binarySearch.binarySearch(new int[]{5}, 5));
    }

    @Test
    public void testBinarySearchWithSingleElementArray_TargetNotFound() {
        assertEquals(-1, JAVA_002_binarySearch.binarySearch(new int[]{5}, 3));
    }

    @Test
    public void testBinarySearchWithMultipleElements_TargetFoundAtBeginning() {
        assertEquals(0, JAVA_002_binarySearch.binarySearch(new int[]{1, 2, 3, 4, 5}, 1));
    }

    @Test
    public void testBinarySearchWithMultipleElements_TargetFoundAtEnd() {
        assertEquals(4, JAVA_002_binarySearch.binarySearch(new int[]{1, 2, 3, 4, 5}, 5));
    }

    @Test
    public void testBinarySearchWithMultipleElements_TargetFoundInMiddle() {
        assertEquals(2, JAVA_002_binarySearch.binarySearch(new int[]{1, 2, 3, 4, 5}, 3));
    }

    @Test
    public void testBinarySearchWithMultipleElements_TargetNotFound() {
        assertEquals(-1, JAVA_002_binarySearch.binarySearch(new int[]{1, 2, 3, 4, 5}, 6));
    }

    @Test
    public void testBinarySearchWithNegativeNumbers_TargetFound() {
        assertEquals(2, JAVA_002_binarySearch.binarySearch(new int[]{-5, -3, -1, 0, 2}, -1));
    }

    @Test
    public void testBinarySearchWithNegativeNumbers_TargetNotFound() {
        assertEquals(-1, JAVA_002_binarySearch.binarySearch(new int[]{-5, -3, -1, 0, 2}, -4));
    }

    @Test
    public void testBinarySearchWithDuplicates_TargetFound() {
        assertEquals(2, JAVA_002_binarySearch.binarySearch(new int[]{1, 2, 2, 2, 3}, 2));
    }

    @Test
    public void testBinarySearchWithDuplicates_TargetNotFound() {
        assertEquals(-1, JAVA_002_binarySearch.binarySearch(new int[]{1, 2, 2, 2, 3}, 4));
    }
}