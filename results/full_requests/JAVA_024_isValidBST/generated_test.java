import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class JavaAlgorithmsTest {

    @Test
    public void testIsValidBST_NullNodes() {
        assertTrue(JavaAlgorithms.isValidBST(null, 0));
    }

    @Test
    public void testIsValidBST_EmptyNodes() {
        List<Map<String, Integer>> nodes = new ArrayList<>();
        assertTrue(JavaAlgorithms.isValidBST(nodes, 0));
    }

    @Test
    public void testIsValidBST_SingleNode() {
        List<Map<String, Integer>> nodes = new ArrayList<>();
        Map<String, Integer> node = new HashMap<>();
        node.put("val", 10);
        nodes.add(node);
        assertTrue(JavaAlgorithms.isValidBST(nodes, 0));
    }

    @Test
    public void testIsValidBST_ValidBST() {
        List<Map<String, Integer>> nodes = new ArrayList<>();
        Map<String, Integer> node1 = new HashMap<>();
        node1.put("val", 10);
        node1.put("left", 1);
        node1.put("right", 2);
        nodes.add(node1);

        Map<String, Integer> node2 = new HashMap<>();
        node2.put("val", 5);
        node2.put("left", -1);
        node2.put("right", -1);
        nodes.add(node2);

        Map<String, Integer> node3 = new HashMap<>();
        node3.put("val", 15);
        node3.put("left", -1);
        node3.put("right", -1);
        nodes.add(node3);

        assertTrue(JavaAlgorithms.isValidBST(nodes, 0));
    }

    @Test
    public void testIsValidBST_InvalidBST_LeftChildGreater() {
        List<Map<String, Integer>> nodes = new ArrayList<>();
        Map<String, Integer> node1 = new HashMap<>();
        node1.put("val", 10);
        node1.put("left", 1);
        node1.put("right", 2);
        nodes.add(node1);

        Map<String, Integer> node2 = new HashMap<>();
        node2.put("val", 15);
        node2.put("left", -1);
        node2.put("right", -1);
        nodes.add(node2);

        Map<String, Integer> node3 = new HashMap<>();
        node3.put("val", 5);
        node3.put("left", -1);
        node3.put("right", -1);
        nodes.add(node3);

        assertFalse(JavaAlgorithms.isValidBST(nodes, 0));
    }

    @Test
    public void testIsValidBST_InvalidBST_RightChildLess() {
        List<Map<String, Integer>> nodes = new ArrayList<>();
        Map<String, Integer> node1 = new HashMap<>();
        node1.put("val", 10);
        node1.put("left", 1);
        node1.put("right", 2);
        nodes.add(node1);

        Map<String, Integer> node2 = new HashMap<>();
        node2.put("val", 5);
        node2.put("left", -1);
        node2.put("right", -1);
        nodes.add(node2);

        Map<String, Integer> node3 = new HashMap<>();
        node3.put("val", 15);
        node3.put("left", -1);
        node3.put("right", -1);
        nodes.add(node3);

        assertFalse(JavaAlgorithms.isValidBST(nodes, 0));
    }

    @Test
    public void testIsValidBST_InvalidIndex() {
        List<Map<String, Integer>> nodes = new ArrayList<>();
        Map<String, Integer> node = new HashMap<>();
        node.put("val", 10);
        nodes.add(node);
        assertTrue(JavaAlgorithms.isValidBST(nodes, -1));
        assertTrue(JavaAlgorithms.isValidBST(nodes, 1));
    }

    @Test
    public void testIsValidBST_ComplexTree() {
        List<Map<String, Integer>> nodes = new ArrayList<>();
        Map<String, Integer> node1 = new HashMap<>();
        node1.put("val", 20);
        node1.put("left", 1);
        node1.put("right", 2);
        nodes.add(node1);

        Map<String, Integer> node2 = new HashMap<>();
        node2.put("val", 10);
        node2.put("left", 3);
        node2.put("right", 4);
        nodes.add(node2);

        Map<String, Integer> node3 = new HashMap<>();
        node3.put("val", 30);
        node3.put("left", -1);
        node3.put("right", -1);
        nodes.add(node3);

        Map<String, Integer> node4 = new HashMap<>();
        node4.put("val", 5);
        node4.put("left", -1);
        node4.put("right", -1);
        nodes.add(node4);

        Map<String, Integer> node5 = new HashMap<>();
        node5.put("val", 15);
        node5.put("left", -1);
        node5.put("right", -1);
        nodes.add(node5);

        assertTrue(JavaAlgorithms.isValidBST(nodes, 0));
    }

    @Test
    public void testIsValidBST_ComplexInvalidTree() {
        List<Map<String, Integer>> nodes = new ArrayList<>();
        Map<String, Integer> node1 = new HashMap<>();
        node1.put("val", 20);
        node1.put("left", 1);
        node1.put("right", 2);
        nodes.add(node1);

        Map<String, Integer> node2 = new HashMap<>();
        node2.put("val", 30);
        node2.put("left", 3);
        node2.put("right", 4);
        nodes.add(node2);

        Map<String, Integer> node3 = new HashMap<>();
        node3.put("val", 10);
        node3.put("left", -1);
        node3.put("right", -1);
        nodes.add(node3);

        Map<String, Integer> node4 = new HashMap<>();
        node4.put("val", 5);
        node4.put("left", -1);
        node4.put("right", -1);
        nodes.add(node4);

        Map<String, Integer> node5 = new HashMap<>();
        node5.put("val", 15);
        node5.put("left", -1);
        node5.put("right", -1);
        nodes.add(node5);

        assertFalse(JavaAlgorithms.isValidBST(nodes, 0));
    }
}