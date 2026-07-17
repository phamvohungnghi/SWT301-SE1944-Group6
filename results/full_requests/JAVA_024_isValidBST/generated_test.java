import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class JAVA_024_isValidBSTTest {
    private Map<String,Integer> n(int v,int l,int r){Map<String,Integer> m=new HashMap<>();m.put("val",v);m.put("left",l);m.put("right",r);return m;}
    @Test void treatsMissingRootAsValid() { assertTrue(JavaAlgorithms.isValidBST(null,0)); assertTrue(JavaAlgorithms.isValidBST(new ArrayList<>(),0)); }
    @Test void acceptsValidTree() { List<Map<String,Integer>> nodes=List.of(n(2,1,2),n(1,-1,-1),n(3,-1,-1)); assertTrue(JavaAlgorithms.isValidBST(nodes,0)); }
    @Test void rejectsOrderingAndChildIndexErrors() { List<Map<String,Integer>> bad=List.of(n(2,1,-1),n(3,-1,-1)); assertFalse(JavaAlgorithms.isValidBST(bad,0)); List<Map<String,Integer>> idx=List.of(n(2,5,-1)); assertFalse(JavaAlgorithms.isValidBST(idx,0)); }
}
