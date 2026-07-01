import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RunLengthEncodingTest {

    @Test
    public void testNullInput() {
        assertEquals("", JAVA_010_runLengthEncoding(null), "Null input should return an empty string.");
    }

    @Test
    public void testEmptyString() {
        assertEquals("", JAVA_010_runLengthEncoding(""), "Empty string should return an empty string.");
    }

    @Test
    public void testSingleCharacterString() {
        assertEquals("1A", JAVA_010_runLengthEncoding("A"), "Single character string should return '1' followed by the character.");
    }

    @Test
    public void testStringWithAllUniqueCharacters() {
        assertEquals("1A1B1C1D", JAVA_010_runLengthEncoding("ABCD"), "String with all unique characters should return '1' followed by each character.");
    }

    @Test
    public void testStringWithRepeatingCharacters() {
        assertEquals("3A2B4C", JAVA_010_runLengthEncoding("AAABBCCCC"), "String with repeating characters should return correct run-length encoding.");
    }

    @Test
    public void testStringWithMixedRepeatingAndUniqueCharacters() {
        assertEquals("2A1B3C1D", JAVA_010_runLengthEncoding("AABCCCD"), "String with mixed repeating and unique characters should return correct run-length encoding.");
    }

    @Test
    public void testStringWithNonAlphabeticCharacters() {
        assertEquals("", JAVA_010_runLengthEncoding("A1B2C3"), "String with non-alphabetic characters should return an empty string.");
    }

    @Test
    public void testStringWithSpaces() {
        assertEquals("", JAVA_010_runLengthEncoding("A B C"), "String with spaces should return an empty string.");
    }

    @Test
    public void testStringWithLowercaseLetters() {
        assertEquals("2a3b1c", JAVA_010_runLengthEncoding("aabbbc"), "String with lowercase letters should return correct run-length encoding.");
    }

    @Test
    public void testStringWithMixedCaseLetters() {
        assertEquals("1A1a1B1b", JAVA_010_runLengthEncoding("AaBb"), "String with mixed case letters should return correct run-length encoding.");
    }

    @Test
    public void testStringWithLongRepeatingSequence() {
        String input = "A".repeat(1000);
        String expected = "1000A";
        assertEquals(expected, JAVA_010_runLengthEncoding(input), "String with long repeating sequence should return correct run-length encoding.");
    }
}