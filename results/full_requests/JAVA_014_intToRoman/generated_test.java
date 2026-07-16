import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntToRomanTest {

    @Test
    public void testIntToRoman_ValidInputs() {
        assertEquals("I", JavaAlgorithms.intToRoman(1));
        assertEquals("IV", JavaAlgorithms.intToRoman(4));
        assertEquals("V", JavaAlgorithms.intToRoman(5));
        assertEquals("IX", JavaAlgorithms.intToRoman(9));
        assertEquals("X", JavaAlgorithms.intToRoman(10));
        assertEquals("XL", JavaAlgorithms.intToRoman(40));
        assertEquals("L", JavaAlgorithms.intToRoman(50));
        assertEquals("XC", JavaAlgorithms.intToRoman(90));
        assertEquals("C", JavaAlgorithms.intToRoman(100));
        assertEquals("CD", JavaAlgorithms.intToRoman(400));
        assertEquals("D", JavaAlgorithms.intToRoman(500));
        assertEquals("CM", JavaAlgorithms.intToRoman(900));
        assertEquals("M", JavaAlgorithms.intToRoman(1000));
        assertEquals("MMXXIII", JavaAlgorithms.intToRoman(2023));
        assertEquals("MMMCMXCIX", JavaAlgorithms.intToRoman(3999));
    }

    @Test
    public void testIntToRoman_BoundaryInputs() {
        assertEquals("", JavaAlgorithms.intToRoman(0)); // Below valid range
        assertEquals("", JavaAlgorithms.intToRoman(-1)); // Below valid range
        assertEquals("", JavaAlgorithms.intToRoman(4000)); // Above valid range
    }

    @Test
    public void testIntToRoman_AdditionalCases() {
        assertEquals("MMM", JavaAlgorithms.intToRoman(3000)); // Upper limit of thousands
        assertEquals("MMMCMXC", JavaAlgorithms.intToRoman(3990)); // Complex case
        assertEquals("MMMDCCCLXXXVIII", JavaAlgorithms.intToRoman(3888)); // Complex case
    }

    @Test
    public void testIntToRoman_EmptyStringForInvalidInput() {
        assertEquals("", JavaAlgorithms.intToRoman(0));
        assertEquals("", JavaAlgorithms.intToRoman(-10));
        assertEquals("", JavaAlgorithms.intToRoman(4000));
    }
}