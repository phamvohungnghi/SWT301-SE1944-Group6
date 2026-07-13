import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DijkstraTest {

    @Test
    void testNullGraph() {
        assertEquals(-1, JAVA_021_dijkstra.dijkstra(null, 0, 1));
    }

    @Test
    void testEmptyGraph() {
        int[][] graph = {};
        assertEquals(-1, JAVA_021_dijkstra.dijkstra(graph, 0, 1));
    }

    @Test
    void testSingleNodeGraph() {
        int[][] graph = {{0}};
        assertEquals(0, JAVA_021_dijkstra.dijkstra(graph, 0, 0));
    }

    @Test
    void testTwoNodeGraphNoPath() {
        int[][] graph = {
            {0, 0},
            {0, 0}
        };
        assertEquals(-1, JAVA_021_dijkstra.dijkstra(graph, 0, 1));
    }

    @Test
    void testTwoNodeGraphWithPath() {
        int[][] graph = {
            {0, 1},
            {0, 0}
        };
        assertEquals(1, JAVA_021_dijkstra.dijkstra(graph, 0, 1));
    }

    @Test
    void testThreeNodeGraph() {
        int[][] graph = {
            {0, 1, 4},
            {0, 0, 2},
            {0, 0, 0}
        };
        assertEquals(3, JAVA_021_dijkstra.dijkstra(graph, 0, 2));
    }

    @Test
    void testDisconnectedGraph() {
        int[][] graph = {
            {0, 1, 0},
            {0, 0, 0},
            {0, 1, 0}
        };
        assertEquals(-1, JAVA_021_dijkstra.dijkstra(graph, 0, 2));
    }

    @Test
    void testGraphWithNegativeWeights() {
        int[][] graph = {
            {0, 1, 4},
            {0, 0, -2},
            {0, 0, 0}
        };
        assertEquals(3, JAVA_021_dijkstra.dijkstra(graph, 0, 2));
    }

    @Test
    void testGraphWithMultiplePaths() {
        int[][] graph = {
            {0, 10, 5},
            {0, 0, 2},
            {0, 3, 0}
        };
        assertEquals(7, JAVA_021_dijkstra.dijkstra(graph, 0, 1));
    }

    @Test
    void testSourceEqualsDestination() {
        int[][] graph = {
            {0, 1, 2},
            {0, 0, 0},
            {0, 0, 0}
        };
        assertEquals(0, JAVA_021_dijkstra.dijkstra(graph, 1, 1));
    }
}