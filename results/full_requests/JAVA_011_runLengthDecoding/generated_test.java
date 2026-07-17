import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class JAVA_011_runLengthDecodingTest {
    @Test void handlesMissingAndMalformedInput() { assertEquals("",JavaAlgorithms.runLengthDecoding(null)); assertEquals("",JavaAlgorithms.runLengthDecoding("")); assertEquals("",JavaAlgorithms.runLengthDecoding("a3")); assertEquals("",JavaAlgorithms.runLengthDecoding("12")); }
    @Test void decodesRunsAndMultiDigitCounts() { assertEquals("aaabbc",JavaAlgorithms.runLengthDecoding("3a2b1c")); assertEquals("xxxxxxxxxxxx",JavaAlgorithms.runLengthDecoding("12x")); }
}
