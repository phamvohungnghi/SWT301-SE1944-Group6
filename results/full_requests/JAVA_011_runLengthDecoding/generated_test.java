import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class JAVA_011_runLengthDecodingTest {

    @Test
    void testNullInput() {
        assertEquals("", JAVA_011_runLengthDecoding.runLengthDecoding(null), "Null input should return an empty string");
    }

    @Test
    void testEmptyInput() {
        assertEquals("", JAVA_011_runLengthDecoding.runLengthDecoding(""), "Empty input should return an empty string");
    }

    @Test
    void testValidSingleCharacterDecoding() {
        assertEquals("aaa", JAVA_011_runLengthDecoding.runLengthDecoding("3a"), "Input '3a' should decode to 'aaa'");
    }

    @Test
    void testValidMultipleCharacterDecoding() {
        assertEquals("aaabbbccc", JAVA_011_runLengthDecoding.runLengthDecoding("3a3b3c"), "Input '3a3b3c' should decode to 'aaabbbccc'");
    }

    @Test
    void testValidMixedDecoding() {
        assertEquals("aabbcccc", JAVA_011_runLengthDecoding.runLengthDecoding("2a2b4c"), "Input '2a2b4c' should decode to 'aabbcccc'");
    }

    @Test
    void testInvalidInputNonDigitStart() {
        assertEquals("", JAVA_011_runLengthDecoding.runLengthDecoding("a3"), "Input starting with a non-digit should return an empty string");
    }

    @Test
    void testInvalidInputMissingCharacter() {
        assertEquals("", JAVA_011_runLengthDecoding.runLengthDecoding("3"), "Input with a number but no character should return an empty string");
    }

    @Test
    void testInvalidInputOnlyDigits() {
        assertEquals("", JAVA_011_runLengthDecoding.runLengthDecoding("123"), "Input with only digits should return an empty string");
    }

    @Test
    void testInvalidInputEmptyCount() {
        assertEquals("", JAVA_011_runLengthDecoding.runLengthDecoding("3a2"), "Input with an incomplete count should return an empty string");
    }

    @Test
    void testInvalidInputInterleavedNonDigit() {
        assertEquals("", JAVA_011_runLengthDecoding.runLengthDecoding("3a2b1c!"), "Input with interleaved non-digit characters should return an empty string");
    }

    @Test
    void testZeroCount() {
        assertEquals("", JAVA_011_runLengthDecoding.runLengthDecoding("0a"), "Input '0a' should decode to an empty string");
    }

    @Test
    void testLargeCount() {
        String result = JAVA_011_runLengthDecoding.runLengthDecoding("100a");
        assertEquals(100, result.length(), "Input '100a' should decode to a string of length 100");
        assertTrue(result.chars().allMatch(c -> c == 'a'), "Decoded string should consist only of 'a'");
    }

    @Test
    void testMultipleZeroCounts() {
        assertEquals("", JAVA_011_runLengthDecoding.runLengthDecoding("0a0b0c"), "Input '0a0b0c' should decode to an empty string");
    }

    @Test
    void testEdgeCaseSingleCharacter() {
        assertEquals("b", JAVA_011_runLengthDecoding.runLengthDecoding("1b"), "Input '1b' should decode to 'b'");
    }

    @Test
    void testEdgeCaseLongSequence() {
        String input = "1a1b1c1d1e1f1g1h1i1j1k1l1m1n1o1p1q1r1s1t1u1v1w1x1y1z";
        String expected = "abcdefghijklmnopqrstuvwxyz";
        assertEquals(expected, JAVA_011_runLengthDecoding.runLengthDecoding(input), "Input with single counts for all letters should decode correctly");
    }
}