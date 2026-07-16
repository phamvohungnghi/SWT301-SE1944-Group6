import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JavaAlgorithmsTest {

    private int[][] graph;

    @BeforeEach
    public void setUp() {
        graph = new int[][] {
            {0, 1, 4, 0, 0, 0},
            {1, 0, 2, 5, 0, 0},
            {4, 2, 0, 0, 1, 0},
            {0, 5, 0, 0, 3, 2},
            {0, 0, 1, 3, 0, 1},
            {0, 0, 0, 2, 1, 0}
        };
    }

    @Test
    public void testDijkstraValidPath() {
        int result = JavaAlgorithms.dijkstra(graph, 0, 4);
        assertEquals(5, result);
    }

    @Test
    public void testDijkstraNoPath() {
        int result = JavaAlgorithms.dijkstra(graph, 0, 5);
        assertEquals(7, result);
    }

    @Test
    public void testDijkstraSameSourceAndDestination() {
        int result = JavaAlgorithms.dijkstra(graph, 2, 2);
        assertEquals(0, result);
    }

    @Test
    public void testDijkstraInvalidSource() {
        int result = JavaAlgorithms.dijkstra(graph, -1, 4);
        assertEquals(-1, result);
    }

    @Test
    public void testDijkstraInvalidDestination() {
        int result = JavaAlgorithms.dijkstra(graph, 0, 6);
        assertEquals(-1, result);
    }

    @Test
    public void testDijkstraNullGraph() {
        int result = JavaAlgorithms.dijkstra(null, 0, 4);
        assertEquals(-1, result);
    }

    @Test
    public void testDijkstraEmptyGraph() {
        int[][] emptyGraph = new int[0][0];
        int result = JavaAlgorithms.dijkstra(emptyGraph, 0, 0);
        assertEquals(-1, result);
    }

    @Test
    public void testDijkstraDisconnectedGraph() {
        int[][] disconnectedGraph = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };
        int result = JavaAlgorithms.dijkstra(disconnectedGraph, 0, 2);
        assertEquals(-1, result);
    }
}