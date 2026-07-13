import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

public class RomanToIntTest {

    @Test
    public void testNullInput() {
        assertEquals(0, JAVA_013_romanToInt.romanToInt(null));
    }

    @Test
    public void testEmptyInput() {
        assertEquals(0, JAVA_013_romanToInt.romanToInt(""));
    }

    @Test
    public void testInvalidCharacter() {
        assertEquals(0, JAVA_013_romanToInt.romanToInt("ABC"));
    }

    @Test
    public void testSingleCharacter() {
        assertEquals(1, JAVA_013_romanToInt.romanToInt("I"));
        assertEquals(5, JAVA_013_romanToInt.romanToInt("V"));
        assertEquals(10, JAVA_013_romanToInt.romanToInt("X"));
        assertEquals(50, JAVA_013_romanToInt.romanToInt("L"));
        assertEquals(100, JAVA_013_romanToInt.romanToInt("C"));
        assertEquals(500, JAVA_013_romanToInt.romanToInt("D"));
        assertEquals(1000, JAVA_013_romanToInt.romanToInt("M"));
    }

    @Test
    public void testTwoCharacterCombinations() {
        assertEquals(4, JAVA_013_romanToInt.romanToInt("IV"));
        assertEquals(9, JAVA_013_romanToInt.romanToInt("IX"));
        assertEquals(40, JAVA_013_romanToInt.romanToInt("XL"));
        assertEquals(90, JAVA_013_romanToInt.romanToInt("XC"));
        assertEquals(400, JAVA_013_romanToInt.romanToInt("CD"));
        assertEquals(900, JAVA_013_romanToInt.romanToInt("CM"));
    }

    @Test
    public void testMultipleCharacters() {
        assertEquals(3, JAVA_013_romanToInt.romanToInt("III"));
        assertEquals(58, JAVA_013_romanToInt.romanToInt("LVIII"));
        assertEquals(1994, JAVA_013_romanToInt.romanToInt("MCMXCIV"));
    }

    @Test
    public void testInvalidSequence() {
        assertEquals(0, JAVA_013_romanToInt.romanToInt("IIII"));
        assertEquals(0, JAVA_013_romanToInt.romanToInt("VV"));
        assertEquals(0, JAVA_013_romanToInt.romanToInt("XXXX"));
        assertEquals(0, JAVA_013_romanToInt.romanToInt("LL"));
        assertEquals(0, JAVA_013_romanToInt.romanToInt("CCCC"));
        assertEquals(0, JAVA_013_romanToInt.romanToInt("DD"));
        assertEquals(0, JAVA_013_romanToInt.romanToInt("MMMM"));
    }
}