import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Knapsack01Test {

    private int[] weights;
    private int[] values;
    private int capacity;

    @BeforeEach
    public void setUp() {
        weights = new int[]{1, 2, 3};
        values = new int[]{10, 15, 40};
        capacity = 6;
    }

    @Test
    public void testKnapsack01NormalCase() {
        int result = JavaAlgorithms.knapsack01(weights, values, capacity);
        assertEquals(55, result);
    }

    @Test
    public void testKnapsack01ExactFit() {
        weights = new int[]{2, 3, 4};
        values = new int[]{20, 30, 40};
        capacity = 5;
        int result = JavaAlgorithms.knapsack01(weights, values, capacity);
        assertEquals(50, result);
    }

    @Test
    public void testKnapsack01NoItems() {
        weights = new int[]{};
        values = new int[]{};
        capacity = 0;
        int result = JavaAlgorithms.knapsack01(weights, values, capacity);
        assertEquals(0, result);
    }

    @Test
    public void testKnapsack01ZeroCapacity() {
        capacity = 0;
        int result = JavaAlgorithms.knapsack01(weights, values, capacity);
        assertEquals(0, result);
    }

    @Test
    public void testKnapsack01NullWeights() {
        weights = null;
        int result = JavaAlgorithms.knapsack01(weights, values, capacity);
        assertEquals(0, result);
    }

    @Test
    public void testKnapsack01NullValues() {
        values = null;
        int result = JavaAlgorithms.knapsack01(weights, values, capacity);
        assertEquals(0, result);
    }

    @Test
    public void testKnapsack01MismatchedArrayLengths() {
        weights = new int[]{1, 2};
        values = new int[]{10};
        int result = JavaAlgorithms.knapsack01(weights, values, capacity);
        assertEquals(0, result);
    }

    @Test
    public void testKnapsack01SingleItemFits() {
        weights = new int[]{5};
        values = new int[]{50};
        capacity = 5;
        int result = JavaAlgorithms.knapsack01(weights, values, capacity);
        assertEquals(50, result);
    }

    @Test
    public void testKnapsack01SingleItemTooHeavy() {
        weights = new int[]{10};
        values = new int[]{100};
        capacity = 5;
        int result = JavaAlgorithms.knapsack01(weights, values, capacity);
        assertEquals(0, result);
    }

    @Test
    public void testKnapsack01MultipleItemsExceedCapacity() {
        weights = new int[]{4, 5, 6};
        values = new int[]{40, 50, 60};
        capacity = 5;
        int result = JavaAlgorithms.knapsack01(weights, values, capacity);
        assertEquals(50, result);
    }
}