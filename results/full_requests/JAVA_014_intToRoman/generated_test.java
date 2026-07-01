import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JAVA_014_intToRomanTest {

    @Test
    void testValidInputs() {
        assertEquals("I", JAVA_014_intToRoman.intToRoman(1));
        assertEquals("IV", JAVA_014_intToRoman.intToRoman(4));
        assertEquals("V", JAVA_014_intToRoman.intToRoman(5));
        assertEquals("IX", JAVA_014_intToRoman.intToRoman(9));
        assertEquals("X", JAVA_014_intToRoman.intToRoman(10));
        assertEquals("XL", JAVA_014_intToRoman.intToRoman(40));
        assertEquals("L", JAVA_014_intToRoman.intToRoman(50));
        assertEquals("XC", JAVA_014_intToRoman.intToRoman(90));
        assertEquals("C", JAVA_014_intToRoman.intToRoman(100));
        assertEquals("CD", JAVA_014_intToRoman.intToRoman(400));
        assertEquals("D", JAVA_014_intToRoman.intToRoman(500));
        assertEquals("CM", JAVA_014_intToRoman.intToRoman(900));
        assertEquals("M", JAVA_014_intToRoman.intToRoman(1000));
        assertEquals("MMMCMXCIX", JAVA_014_intToRoman.intToRoman(3999));
    }

    @Test
    void testBoundaryValues() {
        assertEquals("", JAVA_014_intToRoman.intToRoman(0)); // Below minimum valid input
        assertEquals("", JAVA_014_intToRoman.intToRoman(-1)); // Negative input
        assertEquals("", JAVA_014_intToRoman.intToRoman(4000)); // Above maximum valid input
    }

    @Test
    void testComplexNumbers() {
        assertEquals("MMMDXLIX", JAVA_014_intToRoman.intToRoman(3549));
        assertEquals("MMCCCLXXXVIII", JAVA_014_intToRoman.intToRoman(2388));
        assertEquals("CDXLIV", JAVA_014_intToRoman.intToRoman(444));
        assertEquals("DCCCXC", JAVA_014_intToRoman.intToRoman(890));
    }

    @Test
    void testEdgeCases() {
        assertEquals("MMM", JAVA_014_intToRoman.intToRoman(3000)); // Maximum valid number with repeated symbols
        assertEquals("I", JAVA_014_intToRoman.intToRoman(1)); // Minimum valid number
        assertEquals("MM", JAVA_014_intToRoman.intToRoman(2000)); // Multiple of 1000
        assertEquals("CC", JAVA_014_intToRoman.intToRoman(200)); // Multiple of 100
        assertEquals("XX", JAVA_014_intToRoman.intToRoman(20)); // Multiple of 10
        assertEquals("II", JAVA_014_intToRoman.intToRoman(2)); // Multiple of 1
    }
}