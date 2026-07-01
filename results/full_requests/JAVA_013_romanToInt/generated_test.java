import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RomanToIntTest {

    @Test
    public void testValidSingleCharacters() {
        assertEquals(1, JAVA_013_romanToInt("I"));
        assertEquals(5, JAVA_013_romanToInt("V"));
        assertEquals(10, JAVA_013_romanToInt("X"));
        assertEquals(50, JAVA_013_romanToInt("L"));
        assertEquals(100, JAVA_013_romanToInt("C"));
        assertEquals(500, JAVA_013_romanToInt("D"));
        assertEquals(1000, JAVA_013_romanToInt("M"));
    }

    @Test
    public void testValidCombinations() {
        assertEquals(3, JAVA_013_romanToInt("III"));
        assertEquals(4, JAVA_013_romanToInt("IV"));
        assertEquals(9, JAVA_013_romanToInt("IX"));
        assertEquals(58, JAVA_013_romanToInt("LVIII"));
        assertEquals(1994, JAVA_013_romanToInt("MCMXCIV"));
    }

    @Test
    public void testEmptyString() {
        assertEquals(0, JAVA_013_romanToInt(""));
    }

    @Test
    public void testNullInput() {
        assertEquals(0, JAVA_013_romanToInt(null));
    }

    @Test
    public void testInvalidCharacters() {
        assertEquals(0, JAVA_013_romanToInt("A"));
        assertEquals(0, JAVA_013_romanToInt("IIIIIIII"));
        assertEquals(0, JAVA_013_romanToInt("123"));
        assertEquals(0, JAVA_013_romanToInt("IVXQ"));
    }

    @Test
    public void testBoundaryCases() {
        assertEquals(3999, JAVA_013_romanToInt("MMMCMXCIX"));
        assertEquals(1, JAVA_013_romanToInt("I"));
        assertEquals(0, JAVA_013_romanToInt("MMMM")); // Invalid case
    }

    @Test
    public void testSubtractiveNotation() {
        assertEquals(4, JAVA_013_romanToInt("IV"));
        assertEquals(9, JAVA_013_romanToInt("IX"));
        assertEquals(40, JAVA_013_romanToInt("XL"));
        assertEquals(90, JAVA_013_romanToInt("XC"));
        assertEquals(400, JAVA_013_romanToInt("CD"));
        assertEquals(900, JAVA_013_romanToInt("CM"));
    }

    @Test
    public void testNonSubtractiveNotation() {
        assertEquals(6, JAVA_013_romanToInt("VI"));
        assertEquals(11, JAVA_013_romanToInt("XI"));
        assertEquals(60, JAVA_013_romanToInt("LX"));
        assertEquals(110, JAVA_013_romanToInt("CX"));
        assertEquals(510, JAVA_013_romanToInt("DI"));
        assertEquals(1010, JAVA_013_romanToInt("MI"));
    }
}