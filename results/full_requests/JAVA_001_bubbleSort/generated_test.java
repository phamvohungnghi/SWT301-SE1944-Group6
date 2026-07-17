import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class JAVA_001_bubbleSortTest {
    @Test void handlesNullAndEmpty() { assertNull(JavaAlgorithms.bubbleSort(null)); assertArrayEquals(new int[]{}, JavaAlgorithms.bubbleSort(new int[]{})); }
    @Test void sortsAndMutatesInput() { int[] a={5,1,4,2,8,2}; assertSame(a, JavaAlgorithms.bubbleSort(a)); assertArrayEquals(new int[]{1,2,2,4,5,8}, a); }
    @Test void acceptsAlreadySorted() { assertArrayEquals(new int[]{1,2,3}, JavaAlgorithms.bubbleSort(new int[]{1,2,3})); }
}
