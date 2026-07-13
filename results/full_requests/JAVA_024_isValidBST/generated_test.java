import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class IsValidBSTTest {

    @Test
    void testNullNodes() {
        assertTrue(JAVA_024_isValidBST.isValidBST(null, 0));
    }

    @Test
    void testEmptyNodes() {
        assertTrue(JAVA_024_isValidBST.isValidBST(new ArrayList<>(), 0));
    }

    @Test
    void testSingleNode() {
        List<Map<String, Integer>> nodes = new ArrayList<>();
        Map<String, Integer> node = new HashMap<>();
        node.put("val", 5);
        nodes.add(node);
        assertTrue(JAVA_024_isValidBST.isValidBST(nodes, 0));
    }

    @Test
    void testValidBST() {
        List<Map<String, Integer>> nodes = new ArrayList<>();
        Map<String, Integer> node1 = new HashMap<>();
        node1.put("val", 2);
        node1.put("left", -1);
        node1.put("right", 1);
        nodes.add(node1);
        
        Map<String, Integer> node2 = new HashMap<>();
        node2.put("val", 3);
        node2.put("left", -1);
        node2.put("right", -1);
        nodes.add(node2);
        
        assertTrue(JAVA_024_isValidBST.isValidBST(nodes, 0));
    }

    @Test
    void testInvalidBST() {
        List<Map<String, Integer>> nodes = new ArrayList<>();
        Map<String, Integer> node1 = new HashMap<>();
        node1.put("val", 5);
        node1.put("left", 1);
        node1.put("right", 2);
        nodes.add(node1);
        
        Map<String, Integer> node2 = new HashMap<>();
        node2.put("val", 1);
        node2.put("left", -1);
        node2.put("right", -1);
        nodes.add(node2);
        
        Map<String, Integer> node3 = new HashMap<>();
        node3.put("val", 4);
        node3.put("left", -1);
        node3.put("right", -1);
        nodes.add(node3);
        
        assertFalse(JAVA_024_isValidBST.isValidBST(nodes, 0));
    }

    @Test
    void testInvalidLeftChild() {
        List<Map<String, Integer>> nodes = new ArrayList<>();
        Map<String, Integer> node1 = new HashMap<>();
        node1.put("val", 5);
        node1.put("left", 1);
        node1.put("right", -1);
        nodes.add(node1);
        
        Map<String, Integer> node2 = new HashMap<>();
        node2.put("val", 6);
        node2.put("left", -1);
        node2.put("right", -1);
        nodes.add(node2);
        
        assertFalse(JAVA_024_isValidBST.isValidBST(nodes, 0));
    }

    @Test
    void testInvalidRightChild() {
        List<Map<String, Integer>> nodes = new ArrayList<>();
        Map<String, Integer> node1 = new HashMap<>();
        node1.put("val", 5);
        node1.put("left", -1);
        node1.put("right", 1);
        nodes.add(node1);
        
        Map<String, Integer> node2 = new HashMap<>();
        node2.put("val", 3);
        node2.put("left", -1);
        node2.put("right", -1);
        nodes.add(node2);
        
        assertFalse(JAVA_024_isValidBST.isValidBST(nodes, 0));
    }

    @Test
    void testOutOfBoundsLeftChild() {
        List<Map<String, Integer>> nodes = new ArrayList<>();
        Map<String, Integer> node = new HashMap<>();
        node.put("val", 5);
        node.put("left", 1);
        node.put("right", -1);
        nodes.add(node);
        assertFalse(JAVA_024_isValidBST.isValidBST(nodes, 0));
    }

    @Test
    void testOutOfBoundsRightChild() {
        List<Map<String, Integer>> nodes = new ArrayList<>();
        Map<String, Integer> node = new HashMap<>();
        node.put("val", 5);
        node.put("left", -1);
        node.put("right", 1);
        nodes.add(node);
        assertFalse(JAVA_024_isValidBST.isValidBST(nodes, 0));
    }

    @Test
    void testNegativeIndex() {
        List<Map<String, Integer>> nodes = new ArrayList<>();
        Map<String, Integer> node = new HashMap<>();
        node.put("val", 5);
        nodes.add(node);
        assertTrue(JAVA_024_isValidBST.isValidBST(nodes, -1));
    }

    @Test
    void testIndexOutOfBounds() {
        List<Map<String, Integer>> nodes = new ArrayList<>();
        Map<String, Integer> node = new HashMap<>();
        node.put("val", 5);
        nodes.add(node);
        assertTrue(JAVA_024_isValidBST.isValidBST(nodes, 2));
    }
}