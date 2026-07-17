import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class JAVA_010_runLengthEncodingTest {
    @Test void handlesMissingAndInvalidInput() { assertEquals("",JavaAlgorithms.runLengthEncoding(null)); assertEquals("",JavaAlgorithms.runLengthEncoding("")); assertEquals("",JavaAlgorithms.runLengthEncoding("aa1")); }
    @Test void encodesRuns() { assertEquals("3a2b1c",JavaAlgorithms.runLengthEncoding("aaabbc")); assertEquals("1A",JavaAlgorithms.runLengthEncoding("A")); }
}
