import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class JAVA_013_romanToIntTest {
    @Test void handlesMissingAndInvalidInput() { assertEquals(0,JavaAlgorithms.romanToInt(null)); assertEquals(0,JavaAlgorithms.romanToInt("")); assertEquals(0,JavaAlgorithms.romanToInt("AX")); }
    @Test void convertsAdditiveAndSubtractiveForms() { assertEquals(3,JavaAlgorithms.romanToInt("III")); assertEquals(4,JavaAlgorithms.romanToInt("IV")); assertEquals(1994,JavaAlgorithms.romanToInt("MCMXCIV")); }
}
