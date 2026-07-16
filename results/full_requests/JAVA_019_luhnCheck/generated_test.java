import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LuhnCheckTest {

    @BeforeEach
    public void setUp() {
        // No setup needed for this test suite
    }

    @Test
    public void testLuhnCheck_ValidCardNumber() {
        assertTrue(JavaAlgorithms.luhnCheck("4532015112830366")); // Valid Visa
        assertTrue(JavaAlgorithms.luhnCheck("6011514433546201")); // Valid Discover
        assertTrue(JavaAlgorithms.luhnCheck("378282246310005"));  // Valid American Express
        assertTrue(JavaAlgorithms.luhnCheck("371449635398431"));  // Valid American Express
    }

    @Test
    public void testLuhnCheck_InvalidCardNumber() {
        assertFalse(JavaAlgorithms.luhnCheck("4532015112830365")); // Invalid Visa
        assertFalse(JavaAlgorithms.luhnCheck("6011514433546200")); // Invalid Discover
        assertFalse(JavaAlgorithms.luhnCheck("378282246310006"));  // Invalid American Express
        assertFalse(JavaAlgorithms.luhnCheck("371449635398432"));  // Invalid American Express
    }

    @Test
    public void testLuhnCheck_EmptyString() {
        assertFalse(JavaAlgorithms.luhnCheck("")); // Empty string
    }

    @Test
    public void testLuhnCheck_NullInput() {
        assertFalse(JavaAlgorithms.luhnCheck(null)); // Null input
    }

    @Test
    public void testLuhnCheck_NonDigitCharacters() {
        assertFalse(JavaAlgorithms.luhnCheck("4532a015112830366")); // Contains non-digit
        assertFalse(JavaAlgorithms.luhnCheck("6011-5144-3354-6201")); // Contains non-digit
        assertFalse(JavaAlgorithms.luhnCheck("3782 8224 6310 005")); // Contains spaces
    }

    @Test
    public void testLuhnCheck_SingleDigit() {
        assertFalse(JavaAlgorithms.luhnCheck("1")); // Single digit
        assertTrue(JavaAlgorithms.luhnCheck("0")); // Single digit
    }

    @Test
    public void testLuhnCheck_TwoDigits() {
        assertTrue(JavaAlgorithms.luhnCheck("10")); // Valid Luhn
        assertFalse(JavaAlgorithms.luhnCheck("11")); // Invalid Luhn
    }

    @Test
    public void testLuhnCheck_LongCardNumber() {
        assertTrue(JavaAlgorithms.luhnCheck("1234567890123456")); // Valid Luhn
        assertFalse(JavaAlgorithms.luhnCheck("1234567890123455")); // Invalid Luhn
    }
}