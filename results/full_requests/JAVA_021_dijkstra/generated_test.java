import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DijkstraTest {

    @Test
    void testValidPath() {
        int[][] graph = {
            {0, 1, 4, 0},
            {1, 0, 2, 6},
            {4, 2, 0, 3},
            {0, 6, 3, 0}
        };
        assertEquals(6, JAVA_021_dijkstra.dijkstra(graph, 0, 3));
    }

    @Test
    void testNoPath() {
        int[][] graph = {
            {0, 1, 0, 0},
            {1, 0, 0, 0},
            {0, 0, 0, 1},
            {0, 0, 1, 0}
        };
        assertEquals(-1, JAVA_021_dijkstra.dijkstra(graph, 0, 3));
    }

    @Test
    void testSourceEqualsDestination() {
        int[][] graph = {
            {0, 1, 4, 0},
            {1, 0, 2, 6},
            {4, 2, 0, 3},
            {0, 6, 3, 0}
        };
        assertEquals(0, JAVA_021_dijkstra.dijkstra(graph, 2, 2));
    }

    @Test
    void testEmptyGraph() {
        int[][] graph = {};
        assertEquals(-1, JAVA_021_dijkstra.dijkstra(graph, 0, 0));
    }

    @Test
    void testNullGraph() {
        int[][] graph = null;
        assertEquals(-1, JAVA_021_dijkstra.dijkstra(graph, 0, 0));
    }

    @Test
    void testNegativeWeights() {
        int[][] graph = {
            {0, -1, 4, 0},
            {-1, 0, 2, 6},
            {4, 2, 0, 3},
            {0, 6, 3, 0}
        };
        assertEquals(-1, JAVA_021_dijkstra.dijkstra(graph, 0, 3));
    }

    @Test
    void testUnreachableDestination() {
        int[][] graph = {
            {0, 1, 4, 0},
            {1, 0, 2, 0},
            {4, 2, 0, 0},
            {0, 0, 0, 0}
        };
        assertEquals(-1, JAVA_021_dijkstra.dijkstra(graph, 0, 3));
    }

    @Test
    void testSingleNodeGraph() {
        int[][] graph = {
            {0}
        };
        assertEquals(0, JAVA_021_dijkstra.dijkstra(graph, 0, 0));
    }

    @Test
    void testLargeGraph() {
        int[][] graph = {
            {0, 1, 2, 0, 0},
            {1, 0, 3, 4, 0},
            {2, 3, 0, 5, 6},
            {0, 4, 5, 0, 7},
            {0, 0, 6, 7, 0}
        };
        assertEquals(8, JAVA_021_dijkstra.dijkstra(graph, 0, 4));
    }

    @Test
    void testDisconnectedGraph() {
        int[][] graph = {
            {0, 1, 0, 0, 0},
            {1, 0, 0, 0, 0},
            {0, 0, 0, 1, 0},
            {0, 0, 1, 0, 1},
            {0, 0, 0, 1, 0}
        };
        assertEquals(-1, JAVA_021_dijkstra.dijkstra(graph, 0, 4));
    }
}