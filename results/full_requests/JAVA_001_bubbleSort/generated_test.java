import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void testBubbleSort_NullArray() {
        assertNull(JAVA_001_bubbleSort.bubbleSort(null));
    }

    @Test
    void testBubbleSort_EmptyArray() {
        int[] result = JAVA_001_bubbleSort.bubbleSort(new int[]{});
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    void testBubbleSort_SingleElement() {
        int[] result = JAVA_001_bubbleSort.bubbleSort(new int[]{5});
        assertArrayEquals(new int[]{5}, result);
    }

    @Test
    void testBubbleSort_TwoElements_Sorted() {
        int[] result = JAVA_001_bubbleSort.bubbleSort(new int[]{1, 2});
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    void testBubbleSort_TwoElements_Unsorted() {
        int[] result = JAVA_001_bubbleSort.bubbleSort(new int[]{2, 1});
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    void testBubbleSort_MultipleElements_Sorted() {
        int[] result = JAVA_001_bubbleSort.bubbleSort(new int[]{1, 2, 3, 4, 5});
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result);
    }

    @Test
    void testBubbleSort_MultipleElements_Unsorted() {
        int[] result = JAVA_001_bubbleSort.bubbleSort(new int[]{5, 3, 4, 1, 2});
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result);
    }

    @Test
    void testBubbleSort_MultipleElements_WithDuplicates() {
        int[] result = JAVA_001_bubbleSort.bubbleSort(new int[]{3, 1, 2, 3, 2});
        assertArrayEquals(new int[]{1, 2, 2, 3, 3}, result);
    }

    @Test
    void testBubbleSort_AllIdenticalElements() {
        int[] result = JAVA_001_bubbleSort.bubbleSort(new int[]{2, 2, 2, 2});
        assertArrayEquals(new int[]{2, 2, 2, 2}, result);
    }

    @Test
    void testBubbleSort_NegativeAndPositiveNumbers() {
        int[] result = JAVA_001_bubbleSort.bubbleSort(new int[]{-1, 2, 0, -3, 5});
        assertArrayEquals(new int[]{-3, -1, 0, 2, 5}, result);
    }
}