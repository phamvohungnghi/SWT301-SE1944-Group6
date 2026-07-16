import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JavaAlgorithmsTest {

    private List<int[]> intervals;

    @BeforeEach
    public void setUp() {
        intervals = new ArrayList<>();
    }

    @Test
    public void testMergeIntervals_NullInput() {
        List<int[]> result = JavaAlgorithms.mergeIntervals(null);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testMergeIntervals_EmptyInput() {
        List<int[]> result = JavaAlgorithms.mergeIntervals(new ArrayList<>());
        assertTrue(result.isEmpty());
    }

    @Test
    public void testMergeIntervals_SingleInterval() {
        intervals.add(new int[]{1, 3});
        List<int[]> result = JavaAlgorithms.mergeIntervals(intervals);
        assertEquals(1, result.size());
        assertEquals(1, result.get(0)[0]);
        assertEquals(3, result.get(0)[1]);
    }

    @Test
    public void testMergeIntervals_NoOverlap() {
        intervals.add(new int[]{1, 2});
        intervals.add(new int[]{3, 4});
        List<int[]> result = JavaAlgorithms.mergeIntervals(intervals);
        assertEquals(2, result.size());
        assertEquals(1, result.get(0)[0]);
        assertEquals(2, result.get(0)[1]);
        assertEquals(3, result.get(1)[0]);
        assertEquals(4, result.get(1)[1]);
    }

    @Test
    public void testMergeIntervals_WithOverlap() {
        intervals.add(new int[]{1, 3});
        intervals.add(new int[]{2, 4});
        List<int[]> result = JavaAlgorithms.mergeIntervals(intervals);
        assertEquals(1, result.size());
        assertEquals(1, result.get(0)[0]);
        assertEquals(4, result.get(0)[1]);
    }

    @Test
    public void testMergeIntervals_ComplexOverlap() {
        intervals.add(new int[]{1, 4});
        intervals.add(new int[]{2, 3});
        intervals.add(new int[]{5, 6});
        List<int[]> result = JavaAlgorithms.mergeIntervals(intervals);
        assertEquals(2, result.size());
        assertEquals(1, result.get(0)[0]);
        assertEquals(4, result.get(0)[1]);
        assertEquals(5, result.get(1)[0]);
        assertEquals(6, result.get(1)[1]);
    }

    @Test
    public void testMergeIntervals_InvalidInterval() {
        intervals.add(new int[]{1, 3});
        intervals.add(new int[]{4, 2}); // Invalid interval
        List<int[]> result = JavaAlgorithms.mergeIntervals(intervals);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testMergeIntervals_NullInterval() {
        intervals.add(new int[]{1, 3});
        intervals.add(null); // Null interval
        List<int[]> result = JavaAlgorithms.mergeIntervals(intervals);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testMergeIntervals_SortedInput() {
        intervals.add(new int[]{1, 2});
        intervals.add(new int[]{3, 5});
        intervals.add(new int[]{4, 6});
        List<int[]> result = JavaAlgorithms.mergeIntervals(intervals);
        assertEquals(2, result.size());
        assertEquals(1, result.get(0)[0]);
        assertEquals(2, result.get(0)[1]);
        assertEquals(3, result.get(1)[0]);
        assertEquals(6, result.get(1)[1]);
    }

    @Test
    public void testMergeIntervals_AdjacentIntervals() {
        intervals.add(new int[]{1, 2});
        intervals.add(new int[]{2, 3});
        List<int[]> result = JavaAlgorithms.mergeIntervals(intervals);
        assertEquals(1, result.size());
        assertEquals(1, result.get(0)[0]);
        assertEquals(3, result.get(0)[1]);
    }
}