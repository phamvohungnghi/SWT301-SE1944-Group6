import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LuhnCheckTest {

    @Test
    void testNullInput() {
        assertFalse(JAVA_019_luhnCheck.luhnCheck(null));
    }

    @Test
    void testEmptyInput() {
        assertFalse(JAVA_019_luhnCheck.luhnCheck(""));
    }

    @Test
    void testNonDigitCharacters() {
        assertFalse(JAVA_019_luhnCheck.luhnCheck("1234a6789"));
        assertFalse(JAVA_019_luhnCheck.luhnCheck("1234-5678-9012-3456"));
        assertFalse(JAVA_019_luhnCheck.luhnCheck("1234 5678 9012 3456"));
    }

    @Test
    void testValidLuhnNumber() {
        assertTrue(JAVA_019_luhnCheck.luhnCheck("4532015112830366")); // Visa
        assertTrue(JAVA_019_luhnCheck.luhnCheck("6011514433546201")); // Discover
        assertTrue(JAVA_019_luhnCheck.luhnCheck("371449635398431"));  // American Express
    }

    @Test
    void testInvalidLuhnNumber() {
        assertFalse(JAVA_019_luhnCheck.luhnCheck("4532015112830365")); // Invalid Visa
        assertFalse(JAVA_019_luhnCheck.luhnCheck("6011514433546200")); // Invalid Discover
        assertFalse(JAVA_019_luhnCheck.luhnCheck("371449635398432"));  // Invalid American Express
    }

    @Test
    void testSingleDigitInput() {
        assertFalse(JAVA_019_luhnCheck.luhnCheck("5")); // Single digit cannot be valid
    }

    @Test
    void testTwoDigitInput() {
        assertFalse(JAVA_019_luhnCheck.luhnCheck("12")); // Two digits cannot be valid
    }

    @Test
    void testLongValidLuhnNumber() {
        assertTrue(JAVA_019_luhnCheck.luhnCheck("79927398713")); // Valid Luhn number
    }

    @Test
    void testLongInvalidLuhnNumber() {
        assertFalse(JAVA_019_luhnCheck.luhnCheck("79927398714")); // Invalid Luhn number
    }
}