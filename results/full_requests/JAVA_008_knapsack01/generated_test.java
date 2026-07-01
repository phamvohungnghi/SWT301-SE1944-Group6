import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Knapsack01Test {

    @Test
    void testKnapsack01ValidInput() {
        int[] weights = {1, 2, 3};
        int[] values = {6, 10, 12};
        int capacity = 5;
        assertEquals(22, JAVA_008_knapsack01.knapsack01(weights, values, capacity));
    }

    @Test
    void testKnapsack01ZeroCapacity() {
        int[] weights = {1, 2, 3};
        int[] values = {6, 10, 12};
        int capacity = 0;
        assertEquals(0, JAVA_008_knapsack01.knapsack01(weights, values, capacity));
    }

    @Test
    void testKnapsack01EmptyWeightsAndValues() {
        int[] weights = {};
        int[] values = {};
        int capacity = 5;
        assertEquals(0, JAVA_008_knapsack01.knapsack01(weights, values, capacity));
    }

    @Test
    void testKnapsack01NullWeights() {
        int[] weights = null;
        int[] values = {6, 10, 12};
        int capacity = 5;
        assertEquals(0, JAVA_008_knapsack01.knapsack01(weights, values, capacity));
    }

    @Test
    void testKnapsack01NullValues() {
        int[] weights = {1, 2, 3};
        int[] values = null;
        int capacity = 5;
        assertEquals(0, JAVA_008_knapsack01.knapsack01(weights, values, capacity));
    }

    @Test
    void testKnapsack01NegativeCapacity() {
        int[] weights = {1, 2, 3};
        int[] values = {6, 10, 12};
        int capacity = -5;
        assertEquals(0, JAVA_008_knapsack01.knapsack01(weights, values, capacity));
    }

    @Test
    void testKnapsack01WeightsValuesLengthMismatch() {
        int[] weights = {1, 2};
        int[] values = {6, 10, 12};
        int capacity = 5;
        assertEquals(0, JAVA_008_knapsack01.knapsack01(weights, values, capacity));
    }

    @Test
    void testKnapsack01SingleItemFits() {
        int[] weights = {5};
        int[] values = {10};
        int capacity = 5;
        assertEquals(10, JAVA_008_knapsack01.knapsack01(weights, values, capacity));
    }

    @Test
    void testKnapsack01SingleItemDoesNotFit() {
        int[] weights = {6};
        int[] values = {10};
        int capacity = 5;
        assertEquals(0, JAVA_008_knapsack01.knapsack01(weights, values, capacity));
    }

    @Test
    void testKnapsack01AllItemsFitExactly() {
        int[] weights = {1, 2, 3};
        int[] values = {6, 10, 12};
        int capacity = 6;
        assertEquals(28, JAVA_008_knapsack01.knapsack01(weights, values, capacity));
    }

    @Test
    void testKnapsack01NoItemsFit() {
        int[] weights = {5, 6, 7};
        int[] values = {10, 20, 30};
        int capacity = 4;
        assertEquals(0, JAVA_008_knapsack01.knapsack01(weights, values, capacity));
    }

    @Test
    void testKnapsack01PartialFit() {
        int[] weights = {3, 4, 5};
        int[] values = {30, 40, 50};
        int capacity = 7;
        assertEquals(70, JAVA_008_knapsack01.knapsack01(weights, values, capacity));
    }
}