import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JavaAlgorithmsTest {

    private int[] sortedArray;

    @BeforeEach
    public void setUp() {
        sortedArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }

    @Test
    public void testBinarySearchFound() {
        int target = 5;
        int expectedIndex = 4;
        int result = JavaAlgorithms.binarySearch(sortedArray, target);
        Assertions.assertEquals(expectedIndex, result);
    }

    @Test
    public void testBinarySearchNotFound() {
        int target = 11;
        int result = JavaAlgorithms.binarySearch(sortedArray, target);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void testBinarySearchEmptyArray() {
        int[] emptyArray = {};
        int target = 1;
        int result = JavaAlgorithms.binarySearch(emptyArray, target);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void testBinarySearchNullArray() {
        int target = 1;
        int result = JavaAlgorithms.binarySearch(null, target);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void testBinarySearchFirstElement() {
        int target = 1;
        int expectedIndex = 0;
        int result = JavaAlgorithms.binarySearch(sortedArray, target);
        Assertions.assertEquals(expectedIndex, result);
    }

    @Test
    public void testBinarySearchLastElement() {
        int target = 10;
        int expectedIndex = 9;
        int result = JavaAlgorithms.binarySearch(sortedArray, target);
        Assertions.assertEquals(expectedIndex, result);
    }

    @Test
    public void testBinarySearchNegativeTarget() {
        int target = -1;
        int result = JavaAlgorithms.binarySearch(sortedArray, target);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void testBinarySearchTargetAtMid() {
        int target = 5;
        int expectedIndex = 4;
        int result = JavaAlgorithms.binarySearch(sortedArray, target);
        Assertions.assertEquals(expectedIndex, result);
    }

    @Test
    public void testBinarySearchDuplicateElements() {
        int[] arrayWithDuplicates = {1, 2, 2, 3, 4, 5};
        int target = 2;
        int expectedIndex = 1; // First occurrence of 2
        int result = JavaAlgorithms.binarySearch(arrayWithDuplicates, target);
        Assertions.assertEquals(expectedIndex, result);
    }
}