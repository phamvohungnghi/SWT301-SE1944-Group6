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
    public void testBinarySearch_TargetInMiddle() {
        int target = 5;
        int result = JavaAlgorithms.binarySearch(sortedArray, target);
        Assertions.assertEquals(4, result);
    }

    @Test
    public void testBinarySearch_TargetAtStart() {
        int target = 1;
        int result = JavaAlgorithms.binarySearch(sortedArray, target);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void testBinarySearch_TargetAtEnd() {
        int target = 10;
        int result = JavaAlgorithms.binarySearch(sortedArray, target);
        Assertions.assertEquals(9, result);
    }

    @Test
    public void testBinarySearch_TargetNotFound() {
        int target = 11;
        int result = JavaAlgorithms.binarySearch(sortedArray, target);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void testBinarySearch_EmptyArray() {
        int[] emptyArray = {};
        int target = 5;
        int result = JavaAlgorithms.binarySearch(emptyArray, target);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void testBinarySearch_NullArray() {
        int target = 5;
        int result = JavaAlgorithms.binarySearch(null, target);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void testBinarySearch_NegativeTarget() {
        int target = -1;
        int result = JavaAlgorithms.binarySearch(sortedArray, target);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void testBinarySearch_TargetInFirstHalf() {
        int target = 3;
        int result = JavaAlgorithms.binarySearch(sortedArray, target);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void testBinarySearch_TargetInSecondHalf() {
        int target = 8;
        int result = JavaAlgorithms.binarySearch(sortedArray, target);
        Assertions.assertEquals(7, result);
    }
}