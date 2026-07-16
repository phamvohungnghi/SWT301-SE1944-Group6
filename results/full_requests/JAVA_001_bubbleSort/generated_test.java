import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JavaAlgorithmsTest {

    private int[] sortedArray;
    private int[] unsortedArray;
    private int[] emptyArray;
    private int[] singleElementArray;
    private int[] nullArray;

    @BeforeEach
    public void setUp() {
        sortedArray = new int[]{1, 2, 3, 4, 5};
        unsortedArray = new int[]{5, 3, 4, 1, 2};
        emptyArray = new int[]{};
        singleElementArray = new int[]{1};
        nullArray = null;
    }

    @Test
    public void testBubbleSortWithSortedArray() {
        int[] result = JavaAlgorithms.bubbleSort(sortedArray);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result);
    }

    @Test
    public void testBubbleSortWithUnsortedArray() {
        int[] result = JavaAlgorithms.bubbleSort(unsortedArray);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result);
    }

    @Test
    public void testBubbleSortWithEmptyArray() {
        int[] result = JavaAlgorithms.bubbleSort(emptyArray);
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    public void testBubbleSortWithSingleElementArray() {
        int[] result = JavaAlgorithms.bubbleSort(singleElementArray);
        assertArrayEquals(new int[]{1}, result);
    }

    @Test
    public void testBubbleSortWithNullArray() {
        int[] result = JavaAlgorithms.bubbleSort(nullArray);
        assertNull(result);
    }

    @Test
    public void testBubbleSortWithAlreadySortedArray() {
        int[] result = JavaAlgorithms.bubbleSort(new int[]{1, 2, 3, 4, 5});
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result);
    }

    @Test
    public void testBubbleSortWithReverseSortedArray() {
        int[] result = JavaAlgorithms.bubbleSort(new int[]{5, 4, 3, 2, 1});
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result);
    }

    @Test
    public void testBubbleSortWithDuplicates() {
        int[] result = JavaAlgorithms.bubbleSort(new int[]{3, 1, 2, 2, 1});
        assertArrayEquals(new int[]{1, 1, 2, 2, 3}, result);
    }

    @Test
    public void testBubbleSortWithNegativeNumbers() {
        int[] result = JavaAlgorithms.bubbleSort(new int[]{-1, -3, -2, 0, 1});
        assertArrayEquals(new int[]{-3, -2, -1, 0, 1}, result);
    }

    @Test
    public void testBubbleSortWithMixedNumbers() {
        int[] result = JavaAlgorithms.bubbleSort(new int[]{3, -1, 2, 0, -2});
        assertArrayEquals(new int[]{-2, -1, 0, 2, 3}, result);
    }
}