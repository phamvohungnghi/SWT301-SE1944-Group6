import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class JAVA_004_mergeIntervalsTest {
    @Test void handlesMissingAndInvalidInput() { assertTrue(JavaAlgorithms.mergeIntervals(null).isEmpty()); assertTrue(JavaAlgorithms.mergeIntervals(new ArrayList<>()).isEmpty()); assertTrue(JavaAlgorithms.mergeIntervals(Arrays.asList(new int[]{2,1})).isEmpty()); }
    @Test void mergesOverlappingAndTouchingIntervals() { List<int[]> out=JavaAlgorithms.mergeIntervals(new ArrayList<>(Arrays.asList(new int[]{8,10},new int[]{1,3},new int[]{2,6},new int[]{10,12}))); assertEquals(2,out.size()); assertArrayEquals(new int[]{1,6},out.get(0)); assertArrayEquals(new int[]{8,12},out.get(1)); }
    @Test void keepsDisjointIntervals() { assertEquals(2, JavaAlgorithms.mergeIntervals(new ArrayList<>(Arrays.asList(new int[]{1,2},new int[]{4,5}))).size()); }
}
