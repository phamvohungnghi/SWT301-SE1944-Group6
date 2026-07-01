import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JAVA_004_mergeIntervalsTest {

    @Test
    public void testNullInput() {
        List<int[]> result = JAVA_004_mergeIntervals.mergeIntervals(null);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testEmptyInput() {
        List<int[]> result = JAVA_004_mergeIntervals.mergeIntervals(new ArrayList<>());
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testSingleInterval() {
        List<int[]> intervals = Arrays.asList(new int[]{1, 3});
        List<int[]> result = JAVA_004_mergeIntervals.mergeIntervals(intervals);
        assertEquals(1, result.size());
        assertArrayEquals(new int[]{1, 3}, result.get(0));
    }

    @Test
    public void testNonOverlappingIntervals() {
        List<int[]> intervals = Arrays.asList(new int[]{1, 2}, new int[]{3, 4});
        List<int[]> result = JAVA_004_mergeIntervals.mergeIntervals(intervals);
        assertEquals(2, result.size());
        assertArrayEquals(new int[]{1, 2}, result.get(0));
        assertArrayEquals(new int[]{3, 4}, result.get(1));
    }

    @Test
    public void testOverlappingIntervals() {
        List<int[]> intervals = Arrays.asList(new int[]{1, 3}, new int[]{2, 4});
        List<int[]> result = JAVA_004_mergeIntervals.mergeIntervals(intervals);
        assertEquals(1, result.size());
        assertArrayEquals(new int[]{1, 4}, result.get(0));
    }

    @Test
    public void testFullyContainedIntervals() {
        List<int[]> intervals = Arrays.asList(new int[]{1, 5}, new int[]{2, 3});
        List<int[]> result = JAVA_004_mergeIntervals.mergeIntervals(intervals);
        assertEquals(1, result.size());
        assertArrayEquals(new int[]{1, 5}, result.get(0));
    }

    @Test
    public void testTouchingIntervals() {
        List<int[]> intervals = Arrays.asList(new int[]{1, 2}, new int[]{2, 3});
        List<int[]> result = JAVA_004_mergeIntervals.mergeIntervals(intervals);
        assertEquals(1, result.size());
        assertArrayEquals(new int[]{1, 3}, result.get(0));
    }

    @Test
    public void testUnsortedIntervals() {
        List<int[]> intervals = Arrays.asList(new int[]{5, 6}, new int[]{1, 3}, new int[]{2, 4});
        List<int[]> result = JAVA_004_mergeIntervals.mergeIntervals(intervals);
        assertEquals(1, result.size());
        assertArrayEquals(new int[]{1, 6}, result.get(0));
    }

    @Test
    public void testInvalidIntervalNullElement() {
        List<int[]> intervals = Arrays.asList(new int[]{1, 3}, null, new int[]{2, 4});
        List<int[]> result = JAVA_004_mergeIntervals.mergeIntervals(intervals);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testInvalidIntervalLength() {
        List<int[]> intervals = Arrays.asList(new int[]{1, 3}, new int[]{2}, new int[]{2, 4});
        List<int[]> result = JAVA_004_mergeIntervals.mergeIntervals(intervals);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testInvalidIntervalOrder() {
        List<int[]> intervals = Arrays.asList(new int[]{1, 3}, new int[]{4, 2});
        List<int[]> result = JAVA_004_mergeIntervals.mergeIntervals(intervals);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testMultipleMerges() {
        List<int[]> intervals = Arrays.asList(new int[]{1, 3}, new int[]{2, 6}, new int[]{8, 10}, new int[]{9, 12});
        List<int[]> result = JAVA_004_mergeIntervals.mergeIntervals(intervals);
        assertEquals(2, result.size());
        assertArrayEquals(new int[]{1, 6}, result.get(0));
        assertArrayEquals(new int[]{8, 12}, result.get(1));
    }
}