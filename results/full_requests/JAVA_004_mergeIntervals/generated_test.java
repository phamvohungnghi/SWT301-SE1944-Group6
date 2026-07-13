import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeIntervalsTest {

    @Test
    void testMergeIntervals_NullInput() {
        List<int[]> result = JAVA_004_mergeIntervals.mergeIntervals(null);
        assertTrue(result.isEmpty(), "Expected empty list for null input");
    }

    @Test
    void testMergeIntervals_EmptyInput() {
        List<int[]> result = JAVA_004_mergeIntervals.mergeIntervals(new ArrayList<>());
        assertTrue(result.isEmpty(), "Expected empty list for empty input");
    }

    @Test
    void testMergeIntervals_InvalidInterval_Null() {
        List<int[]> intervals = new ArrayList<>();
        intervals.add(null);
        List<int[]> result = JAVA_004_mergeIntervals.mergeIntervals(intervals);
        assertTrue(result.isEmpty(), "Expected empty list for input with null interval");
    }

    @Test
    void testMergeIntervals_InvalidInterval_LengthNotTwo() {
        List<int[]> intervals = new ArrayList<>();
        intervals.add(new int[]{1});
        List<int[]> result = JAVA_004_mergeIntervals.mergeIntervals(intervals);
        assertTrue(result.isEmpty(), "Expected empty list for input with interval length not equal to 2");
    }

    @Test
    void testMergeIntervals_InvalidInterval_StartGreaterThanEnd() {
        List<int[]> intervals = new ArrayList<>();
        intervals.add(new int[]{2, 1});
        List<int[]> result = JAVA_004_mergeIntervals.mergeIntervals(intervals);
        assertTrue(result.isEmpty(), "Expected empty list for input with start greater than end");
    }

    @Test
    void testMergeIntervals_NoOverlap() {
        List<int[]> intervals = new ArrayList<>();
        intervals.add(new int[]{1, 2});
        intervals.add(new int[]{3, 4});
        List<int[]> result = JAVA_004_mergeIntervals.mergeIntervals(intervals);
        assertEquals(2, result.size(), "Expected two intervals in the result");
        assertArrayEquals(new int[]{1, 2}, result.get(0), "First interval should be [1, 2]");
        assertArrayEquals(new int[]{3, 4}, result.get(1), "Second interval should be [3, 4]");
    }

    @Test
    void testMergeIntervals_WithOverlap() {
        List<int[]> intervals = new ArrayList<>();
        intervals.add(new int[]{1, 3});
        intervals.add(new int[]{2, 4});
        List<int[]> result = JAVA_004_mergeIntervals.mergeIntervals(intervals);
        assertEquals(1, result.size(), "Expected one merged interval in the result");
        assertArrayEquals(new int[]{1, 4}, result.get(0), "Merged interval should be [1, 4]");
    }

    @Test
    void testMergeIntervals_ComplexOverlap() {
        List<int[]> intervals = new ArrayList<>();
        intervals.add(new int[]{1, 4});
        intervals.add(new int[]{2, 3});
        intervals.add(new int[]{5, 6});
        List<int[]> result = JAVA_004_mergeIntervals.mergeIntervals(intervals);
        assertEquals(2, result.size(), "Expected two intervals in the result");
        assertArrayEquals(new int[]{1, 4}, result.get(0), "First merged interval should be [1, 4]");
        assertArrayEquals(new int[]{5, 6}, result.get(1), "Second interval should be [5, 6]");
    }

    @Test
    void testMergeIntervals_AdjacentIntervals() {
        List<int[]> intervals = new ArrayList<>();
        intervals.add(new int[]{1, 2});
        intervals.add(new int[]{2, 3});
        List<int[]> result = JAVA_004_mergeIntervals.mergeIntervals(intervals);
        assertEquals(1, result.size(), "Expected one merged interval in the result");
        assertArrayEquals(new int[]{1, 3}, result.get(0), "Merged interval should be [1, 3]");
    }
}