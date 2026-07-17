import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class JAVA_022_parseQueryStringTest {
    @Test void handlesMissingInput() { assertTrue(JavaAlgorithms.parseQueryString(null).isEmpty()); assertTrue(JavaAlgorithms.parseQueryString("").isEmpty()); }
    @Test void parsesPrefixMissingValueAndEmptyPairs() { Map<String,Object> m=JavaAlgorithms.parseQueryString("?a=1&flag&&b=2"); assertEquals("1",m.get("a")); assertEquals("",m.get("flag")); assertEquals("2",m.get("b")); }
    @Test void collectsRepeatedKeys() { Map<String,Object> m=JavaAlgorithms.parseQueryString("a=1&a=2&a=3"); assertEquals(List.of("1","2","3"),m.get("a")); }
}
