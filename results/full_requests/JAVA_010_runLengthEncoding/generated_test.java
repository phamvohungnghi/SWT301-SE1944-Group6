import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RunLengthEncodingTest {

    @Test
    void testNullInput() {
        assertEquals("", JAVA_010_runLengthEncoding.runLengthEncoding(null));
    }

    @Test
    void testEmptyString() {
        assertEquals("", JAVA_010_runLengthEncoding.runLengthEncoding(""));
    }

    @Test
    void testSingleCharacter() {
        assertEquals("1a", JAVA_010_runLengthEncoding.runLengthEncoding("a"));
        assertEquals("1b", JAVA_010_runLengthEncoding.runLengthEncoding("b"));
    }

    @Test
    void testTwoDifferentCharacters() {
        assertEquals("1a1b", JAVA_010_runLengthEncoding.runLengthEncoding("ab"));
    }

    @Test
    void testTwoSameCharacters() {
        assertEquals("2a", JAVA_010_runLengthEncoding.runLengthEncoding("aa"));
        assertEquals("2b", JAVA_010_runLengthEncoding.runLengthEncoding("bb"));
    }

    @Test
    void testMultipleSameCharacters() {
        assertEquals("3a", JAVA_010_runLengthEncoding.runLengthEncoding("aaa"));
        assertEquals("4b", JAVA_010_runLengthEncoding.runLengthEncoding("bbbb"));
    }

    @Test
    void testMixedCharacters() {
        assertEquals("2a1b2c", JAVA_010_runLengthEncoding.runLengthEncoding("aabbcc"));
        assertEquals("1a1b1c1d", JAVA_010_runLengthEncoding.runLengthEncoding("abcd"));
    }

    @Test
    void testLongSequence() {
        assertEquals("5a", JAVA_010_runLengthEncoding.runLengthEncoding("aaaaa"));
        assertEquals("1a1b1c1d1e1f", JAVA_010_runLengthEncoding.runLengthEncoding("abcdef"));
    }

    @Test
    void testInvalidCharacter() {
        assertEquals("", JAVA_010_runLengthEncoding.runLengthEncoding("a1b"));
        assertEquals("", JAVA_010_runLengthEncoding.runLengthEncoding("abc!"));
    }

    @Test
    void testAllSameCharacters() {
        assertEquals("10a", JAVA_010_runLengthEncoding.runLengthEncoding("aaaaaaaaaa"));
    }

    @Test
    void testLargeInput() {
        String input = "a".repeat(1000);
        assertEquals("1000a", JAVA_010_runLengthEncoding.runLengthEncoding(input));
    }
}