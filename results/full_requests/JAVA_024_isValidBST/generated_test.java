import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class JAVA_024_isValidBSTTest {

    @Test
    void testNullNodes() {
        assertTrue(JAVA_024_isValidBST(null, 0));
    }

    @Test
    void testEmptyNodes() {
        assertTrue(JAVA_024_isValidBST(new ArrayList<>(), 0));
    }

    @Test
    void testInvalidRootIndexNegative() {
        List<Map<String, Integer>> nodes = new ArrayList<>();
        nodes.add(Map.of("val", 10));
        assertTrue(JAVA_024_isValidBST(nodes, -1));
    }

    @Test
    void testInvalidRootIndexOutOfBounds() {
        List<Map<String, Integer>> nodes = new ArrayList<>();
        nodes.add(Map.of("val", 10));
        assertTrue(JAVA_024_isValidBST(nodes, 1));
    }

    @Test
    void testSingleNodeValidBST() {
        List<Map<String, Integer>> nodes = new ArrayList<>();
        nodes.add(Map.of("val", 10));
        assertTrue(JAVA_024_isValidBST(nodes, 0));
    }

    @Test
    void testTwoNodesValidBST() {
        List<Map<String, Integer>> nodes = new ArrayList<>();
        nodes.add(Map.of("val", 10, "left", 1));
        nodes.add(Map.of("val", 5));
        assertTrue(JAVA_024_isValidBST(nodes, 0));
    }

    @Test
    void testTwoNodesInvalidBST() {
        List<Map<String, Integer>> nodes = new ArrayList<>();
        nodes.add(Map.of("val", 10, "left", 1));
        nodes.add(Map.of("val", 15));
        assertFalse(JAVA_024_isValidBST(nodes, 0));
    }

    @Test
    void testThreeNodesValidBST() {
        List<Map<String, Integer>> nodes = new ArrayList<>();
        nodes.add(Map.of("val", 10, "left", 1, "right", 2));
        nodes.add(Map.of("val", 5));
        nodes.add(Map.of("val", 15));
        assertTrue(JAVA_024_isValidBST(nodes, 0));
    }

    @Test
    void testThreeNodesInvalidBSTLeft() {
        List<Map<String, Integer>> nodes = new ArrayList<>();
        nodes.add(Map.of("val", 10, "left", 1, "right", 2));
        nodes.add(Map.of("val", 15));
        nodes.add(Map.of("val", 20));
        assertFalse(JAVA_024_isValidBST(nodes, 0));
    }

    @Test
    void testThreeNodesInvalidBSTRight() {
        List<Map<String, Integer>> nodes = new ArrayList<>();
        nodes.add(Map.of("val", 10, "left", 1, "right", 2));
        nodes.add(Map.of("val", 5));
        nodes.add(Map.of("val", 5));
        assertFalse(JAVA_024_isValidBST(nodes, 0));
    }

    @Test
    void testInvalidLeftChildIndex() {
        List<Map<String, Integer>> nodes = new ArrayList<>();
        nodes.add(Map.of("val", 10, "left", 2));
        assertFalse(JAVA_024_isValidBST(nodes, 0));
    }

    @Test
    void testInvalidRightChildIndex() {
        List<Map<String, Integer>> nodes = new ArrayList<>();
        nodes.add(Map.of("val", 10, "right", 2));
        assertFalse(JAVA_024_isValidBST(nodes, 0));
    }

    @Test
    void testComplexValidBST() {
        List<Map<String, Integer>> nodes = new ArrayList<>();
        nodes.add(Map.of("val", 20, "left", 1, "right", 2));
        nodes.add(Map.of("val", 10, "left", 3, "right", 4));
        nodes.add(Map.of("val", 30));
        nodes.add(Map.of("val", 5));
        nodes.add(Map.of("val", 15));
        assertTrue(JAVA_024_isValidBST(nodes, 0));
    }

    @Test
    void testComplexInvalidBST() {
        List<Map<String, Integer>> nodes = new ArrayList<>();
        nodes.add(Map.of("val", 20, "left", 1, "right", 2));
        nodes.add(Map.of("val", 10, "left", 3, "right", 4));
        nodes.add(Map.of("val", 30));
        nodes.add(Map.of("val", 25));
        nodes.add(Map.of("val", 15));
        assertFalse(JAVA_024_isValidBST(nodes, 0));
    }

    @Test
    void testDuplicateValues() {
        List<Map<String, Integer>> nodes = new ArrayList<>();
        nodes.add(Map.of("val", 10, "left", 1, "right", 2));
        nodes.add(Map.of("val", 10));
        nodes.add(Map.of("val", 15));
        assertFalse(JAVA_024_isValidBST(nodes, 0));
    }
}