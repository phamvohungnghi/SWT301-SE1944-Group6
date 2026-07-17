import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class JAVA_008_knapsack01Test {
    @Test void rejectsInvalidArguments() { assertEquals(0,JavaAlgorithms.knapsack01(null,new int[]{1},1)); assertEquals(0,JavaAlgorithms.knapsack01(new int[]{1},null,1)); assertEquals(0,JavaAlgorithms.knapsack01(new int[]{1},new int[]{1},0)); assertEquals(0,JavaAlgorithms.knapsack01(new int[]{1},new int[]{1,2},2)); }
    @Test void solvesClassicCase() { assertEquals(220,JavaAlgorithms.knapsack01(new int[]{10,20,30},new int[]{60,100,120},50)); }
    @Test void skipsOverweightItems() { assertEquals(0,JavaAlgorithms.knapsack01(new int[]{5},new int[]{10},4)); }
}
