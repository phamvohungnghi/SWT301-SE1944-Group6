import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Knapsack01Test {

    @Test
    void testNullWeights() {
        int[] weights = null;
        int[] values = {1, 2, 3};
        int capacity = 5;
        assertEquals(0, knapsack01(weights, values, capacity));
    }

    @Test
    void testNullValues() {
        int[] weights = {1, 2, 3};
        int[] values = null;
        int capacity = 5;
        assertEquals(0, knapsack01(weights, values, capacity));
    }

    @Test
    void testNegativeCapacity() {
        int[] weights = {1, 2, 3};
        int[] values = {1, 2, 3};
        int capacity = -1;
        assertEquals(0, knapsack01(weights, values, capacity));
    }

    @Test
    void testMismatchedArrayLengths() {
        int[] weights = {1, 2};
        int[] values = {1, 2, 3};
        int capacity = 5;
        assertEquals(0, knapsack01(weights, values, capacity));
    }

    @Test
    void testEmptyArrays() {
        int[] weights = {};
        int[] values = {};
        int capacity = 5;
        assertEquals(0, knapsack01(weights, values, capacity));
    }

    @Test
    void testSingleItemFits() {
        int[] weights = {1};
        int[] values = {1};
        int capacity = 1;
        assertEquals(1, knapsack01(weights, values, capacity));
    }

    @Test
    void testSingleItemTooHeavy() {
        int[] weights = {2};
        int[] values = {1};
        int capacity = 1;
        assertEquals(0, knapsack01(weights, values, capacity));
    }

    @Test
    void testMultipleItemsAllFit() {
        int[] weights = {1, 2, 3};
        int[] values = {10, 15, 40};
        int capacity = 6;
        assertEquals(65, knapsack01(weights, values, capacity));
    }

    @Test
    void testMultipleItemsSomeFit() {
        int[] weights = {1, 2, 3};
        int[] values = {10, 15, 40};
        int capacity = 5;
        assertEquals(55, knapsack01(weights, values, capacity));
    }

    @Test
    void testMultipleItemsNoneFit() {
        int[] weights = {5, 6, 7};
        int[] values = {10, 15, 40};
        int capacity = 4;
        assertEquals(0, knapsack01(weights, values, capacity));
    }

    @Test
    void testExactFit() {
        int[] weights = {2, 3, 4, 5};
        int[] values = {3, 4, 5, 6};
        int capacity = 5;
        assertEquals(7, knapsack01(weights, values, capacity));
    }

    @Test
    void testLargeCapacity() {
        int[] weights = {1, 2, 3, 4, 5};
        int[] values = {1, 2, 3, 4, 5};
        int capacity = 10;
        assertEquals(15, knapsack01(weights, values, capacity));
    }
}