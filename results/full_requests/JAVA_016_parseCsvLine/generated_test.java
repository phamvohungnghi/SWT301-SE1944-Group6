import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class JAVA_016_parseCsvLineTest {
    @Test void handlesNullAndEmpty() { assertTrue(JavaAlgorithms.parseCsvLine(null).isEmpty()); assertEquals(List.of(""),JavaAlgorithms.parseCsvLine("")); }
    @Test void parsesPlainAndQuotedFields() { assertEquals(List.of("a","b","c"),JavaAlgorithms.parseCsvLine("a,b,c")); assertEquals(List.of("a,b","c"),JavaAlgorithms.parseCsvLine(""a,b",c")); }
    @Test void unescapesDoubleQuotes() { assertEquals(List.of("a"b","x"),JavaAlgorithms.parseCsvLine(""a""b",x")); }
}
