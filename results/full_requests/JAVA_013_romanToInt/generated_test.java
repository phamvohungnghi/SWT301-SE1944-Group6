import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RomanToIntTest {

    @Test
    public void testNullInput() {
        assertEquals(0, JavaAlgorithms.romanToInt(null));
    }

    @Test
    public void testEmptyString() {
        assertEquals(0, JavaAlgorithms.romanToInt(""));
    }

    @Test
    public void testInvalidCharacter() {
        assertEquals(0, JavaAlgorithms.romanToInt("ABCD"));
    }

    @Test
    public void testSingleCharacter() {
        assertEquals(1, JavaAlgorithms.romanToInt("I"));
        assertEquals(5, JavaAlgorithms.romanToInt("V"));
        assertEquals(10, JavaAlgorithms.romanToInt("X"));
        assertEquals(50, JavaAlgorithms.romanToInt("L"));
        assertEquals(100, JavaAlgorithms.romanToInt("C"));
        assertEquals(500, JavaAlgorithms.romanToInt("D"));
        assertEquals(1000, JavaAlgorithms.romanToInt("M"));
    }

    @Test
    public void testTwoCharacterCombinations() {
        assertEquals(4, JavaAlgorithms.romanToInt("IV"));
        assertEquals(9, JavaAlgorithms.romanToInt("IX"));
        assertEquals(40, JavaAlgorithms.romanToInt("XL"));
        assertEquals(90, JavaAlgorithms.romanToInt("XC"));
        assertEquals(400, JavaAlgorithms.romanToInt("CD"));
        assertEquals(900, JavaAlgorithms.romanToInt("CM"));
    }

    @Test
    public void testValidRomanNumerals() {
        assertEquals(3, JavaAlgorithms.romanToInt("III"));
        assertEquals(58, JavaAlgorithms.romanToInt("LVIII"));
        assertEquals(1994, JavaAlgorithms.romanToInt("MCMXCIV"));
        assertEquals(2023, JavaAlgorithms.romanToInt("MMXXIII"));
    }

    @Test
    public void testInvalidRomanNumerals() {
        assertEquals(0, JavaAlgorithms.romanToInt("IIII"));
        assertEquals(0, JavaAlgorithms.romanToInt("VV"));
        assertEquals(0, JavaAlgorithms.romanToInt("XXXX"));
        assertEquals(0, JavaAlgorithms.romanToInt("LL"));
        assertEquals(0, JavaAlgorithms.romanToInt("CCCCC"));
        assertEquals(0, JavaAlgorithms.romanToInt("DD"));
        assertEquals(0, JavaAlgorithms.romanToInt("MMMM"));
    }

    @Test
    public void testMixedValidAndInvalid() {
        assertEquals(0, JavaAlgorithms.romanToInt("IVI"));
        assertEquals(0, JavaAlgorithms.romanToInt("IXC"));
        assertEquals(0, JavaAlgorithms.romanToInt("MCMXCIVX"));
    }
}