import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LuhnCheckTest {

    @Test
    void testNullInput() {
        assertFalse(JAVA_019_luhnCheck(null), "Null input should return false");
    }

    @Test
    void testEmptyString() {
        assertFalse(JAVA_019_luhnCheck(""), "Empty string should return false");
    }

    @Test
    void testNonDigitCharacters() {
        assertFalse(JAVA_019_luhnCheck("1234a567"), "String with non-digit characters should return false");
        assertFalse(JAVA_019_luhnCheck("12 34"), "String with spaces should return false");
        assertFalse(JAVA_019_luhnCheck("12-34"), "String with special characters should return false");
    }

    @Test
    void testValidLuhnNumber() {
        assertTrue(JAVA_019_luhnCheck("4532015112830366"), "Valid Luhn number should return true");
        assertTrue(JAVA_019_luhnCheck("79927398713"), "Valid Luhn number should return true");
    }

    @Test
    void testInvalidLuhnNumber() {
        assertFalse(JAVA_019_luhnCheck("4532015112830367"), "Invalid Luhn number should return false");
        assertFalse(JAVA_019_luhnCheck("79927398710"), "Invalid Luhn number should return false");
    }

    @Test
    void testSingleDigitNumbers() {
        assertFalse(JAVA_019_luhnCheck("0"), "Single digit '0' should return false");
        assertFalse(JAVA_019_luhnCheck("1"), "Single digit '1' should return false");
        assertFalse(JAVA_019_luhnCheck("9"), "Single digit '9' should return false");
    }

    @Test
    void testBoundaryCases() {
        assertTrue(JAVA_019_luhnCheck("18"), "Boundary case '18' should return true");
        assertFalse(JAVA_019_luhnCheck("19"), "Boundary case '19' should return false");
    }

    @Test
    void testAllZeros() {
        assertTrue(JAVA_019_luhnCheck("0000000000000000"), "All zeros should return true");
    }

    @Test
    void testAlternatingDigits() {
        assertTrue(JAVA_019_luhnCheck("1212121212121212"), "Alternating digits valid Luhn number should return true");
        assertFalse(JAVA_019_luhnCheck("1212121212121213"), "Alternating digits invalid Luhn number should return false");
    }

    @Test
    void testLongValidNumber() {
        assertTrue(JAVA_019_luhnCheck("499273987164999273987164"), "Long valid Luhn number should return true");
    }

    @Test
    void testLongInvalidNumber() {
        assertFalse(JAVA_019_luhnCheck("499273987164999273987165"), "Long invalid Luhn number should return false");
    }
}