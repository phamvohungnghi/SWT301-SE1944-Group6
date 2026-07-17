import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class JAVA_009_jsonPathLookupTest {
    @Test void rejectsMissingArguments() { assertNull(JavaAlgorithms.jsonPathLookup(null,"a")); assertNull(JavaAlgorithms.jsonPathLookup(new HashMap<>(),null)); assertNull(JavaAlgorithms.jsonPathLookup(new HashMap<>(),"")); }
    @Test void traversesMapsAndLists() { Map<String,Object> root=new HashMap<>(); root.put("users",Arrays.asList(Map.of("name","Ada"),Map.of("name","Lin"))); assertEquals("Lin",JavaAlgorithms.jsonPathLookup(root,"users.1.name")); }
    @Test void returnsNullForBadPath() { Map<String,Object> root=Map.of("items",Arrays.asList("x")); assertNull(JavaAlgorithms.jsonPathLookup(root,"items.x")); assertNull(JavaAlgorithms.jsonPathLookup(root,"items.2")); assertNull(JavaAlgorithms.jsonPathLookup(root,"missing")); }
}
