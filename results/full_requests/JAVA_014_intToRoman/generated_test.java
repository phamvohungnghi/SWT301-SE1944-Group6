import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class JAVA_014_intToRomanTest {
    @Test void rejectsOutOfRangeInput() { assertEquals("",JavaAlgorithms.intToRoman(0)); assertEquals("",JavaAlgorithms.intToRoman(-1)); assertEquals("",JavaAlgorithms.intToRoman(4000)); }
    @Test void convertsRepresentativeValues() { assertEquals("I",JavaAlgorithms.intToRoman(1)); assertEquals("IV",JavaAlgorithms.intToRoman(4)); assertEquals("LVIII",JavaAlgorithms.intToRoman(58)); assertEquals("MCMXCIV",JavaAlgorithms.intToRoman(1994)); }
}
