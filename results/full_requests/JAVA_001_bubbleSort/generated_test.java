import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

    @Test
    void testNullArray() {
        int[] input = null;
        int[] result = JAVA_001_bubbleSort.bubbleSort(input);
        assertNull(result, "Sorting a null array should return null.");
    }

    @Test
    void testEmptyArray() {
        int[] input = {};
        int[] result = JAVA_001_bubbleSort.bubbleSort(input);
        assertArrayEquals(new int[]{}, result, "Sorting an empty array should return an empty array.");
    }

    @Test
    void testSingleElementArray() {
        int[] input = {5};
        int[] result = JAVA_001_bubbleSort.bubbleSort(input);
        assertArrayEquals(new int[]{5}, result, "Sorting a single-element array should return the same array.");
    }

    @Test
    void testAlreadySortedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] result = JAVA_001_bubbleSort.bubbleSort(input);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result, "Sorting an already sorted array should return the same array.");
    }

    @Test
    void testReverseSortedArray() {
        int[] input = {5, 4, 3, 2, 1};
        int[] result = JAVA_001_bubbleSort.bubbleSort(input);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result, "Sorting a reverse sorted array should return a sorted array.");
    }

    @Test
    void testUnsortedArray() {
        int[] input = {3, 1, 4, 1, 5, 9, 2, 6, 5};
        int[] result = JAVA_001_bubbleSort.bubbleSort(input);
        assertArrayEquals(new int[]{1, 1, 2, 3, 4, 5, 5, 6, 9}, result, "Sorting an unsorted array should return a sorted array.");
    }

    @Test
    void testArrayWithDuplicates() {
        int[] input = {4, 2, 4, 2, 4};
        int[] result = JAVA_001_bubbleSort.bubbleSort(input);
        assertArrayEquals(new int[]{2, 2, 4, 4, 4}, result, "Sorting an array with duplicates should return a sorted array with duplicates in order.");
    }

    @Test
    void testArrayWithNegativeNumbers() {
        int[] input = {3, -1, 4, -1, 5, -9, 2, 6, 5};
        int[] result = JAVA_001_bubbleSort.bubbleSort(input);
        assertArrayEquals(new int[]{-9, -1, -1, 2, 3, 4, 5, 5, 6}, result, "Sorting an array with negative numbers should return a sorted array.");
    }

    @Test
    void testArrayWithAllEqualElements() {
        int[] input = {7, 7, 7, 7, 7};
        int[] result = JAVA_001_bubbleSort.bubbleSort(input);
        assertArrayEquals(new int[]{7, 7, 7, 7, 7}, result, "Sorting an array with all equal elements should return the same array.");
    }

    @Test
    void testLargeArray() {
        int[] input = new int[1000];
        int[] expected = new int[1000];
        for (int i = 0; i < 1000; i++) {
            input[i] = 1000 - i;
            expected[i] = i + 1;
        }
        int[] result = JAVA_001_bubbleSort.bubbleSort(input);
        assertArrayEquals(expected, result, "Sorting a large array should return a sorted array.");
    }
}