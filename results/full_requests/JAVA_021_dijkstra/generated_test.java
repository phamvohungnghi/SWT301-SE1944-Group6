import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class JAVA_021_dijkstraTest {
    @Test void rejectsNullGraph() { assertEquals(-1,JavaAlgorithms.dijkstra(null,0,0)); }
    @Test void findsShortestPath() { int[][] g={{0,4,1,0},{4,0,2,1},{1,2,0,5},{0,1,5,0}}; assertEquals(4,JavaAlgorithms.dijkstra(g,0,3)); assertEquals(0,JavaAlgorithms.dijkstra(g,2,2)); }
    @Test void reportsUnreachableDestination() { int[][] g={{0,1,0},{1,0,0},{0,0,0}}; assertEquals(-1,JavaAlgorithms.dijkstra(g,0,2)); }
}
