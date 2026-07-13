import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RunLengthDecodingTest {

    @Test
    void testNullInput() {
        assertEquals("", JAVA_011_runLengthDecoding.runLengthDecoding(null));
    }

    @Test
    void testEmptyInput() {
        assertEquals("", JAVA_011_runLengthDecoding.runLengthDecoding(""));
    }

    @Test
    void testSingleCharacter() {
        assertEquals("a", JAVA_011_runLengthDecoding.runLengthDecoding("1a"));
    }

    @Test
    void testMultipleCharacters() {
        assertEquals("aa", JAVA_011_runLengthDecoding.runLengthDecoding("2a"));
        assertEquals("aaa", JAVA_011_runLengthDecoding.runLengthDecoding("3a"));
    }

    @Test
    void testDifferentCharacters() {
        assertEquals("aabb", JAVA_011_runLengthDecoding.runLengthDecoding("2a2b"));
        assertEquals("aaabbb", JAVA_011_runLengthDecoding.runLengthDecoding("3a3b"));
    }

    @Test
    void testInvalidInputStartsWithCharacter() {
        assertEquals("", JAVA_011_runLengthDecoding.runLengthDecoding("a2b"));
    }

    @Test
    void testInvalidInputWithLeadingZero() {
        assertEquals("", JAVA_011_runLengthDecoding.runLengthDecoding("02a"));
    }

    @Test
    void testInvalidInputWithNonDigit() {
        assertEquals("", JAVA_011_runLengthDecoding.runLengthDecoding("1a2b3c4d5e6f7g8h9i0j"));
    }

    @Test
    void testInputWithNoCharacters() {
        assertEquals("", JAVA_011_runLengthDecoding.runLengthDecoding("1"));
    }

    @Test
    void testInputWithCountZero() {
        assertEquals("", JAVA_011_runLengthDecoding.runLengthDecoding("0a"));
    }

    @Test
    void testInputWithLargeCount() {
        assertEquals("a", JAVA_011_runLengthDecoding.runLengthDecoding("1000000a").substring(0, 1));
    }

    @Test
    void testInputWithMultipleCounts() {
        assertEquals("aaabbbccc", JAVA_011_runLengthDecoding.runLengthDecoding("3a3b3c"));
    }

    @Test
    void testInputWithInvalidCount() {
        assertEquals("", JAVA_011_runLengthDecoding.runLengthDecoding("1a1b1c1d1e1f1g1h1i1j1k1l1m1n1o1p1q1r1s1t1u1v1w1x1y1z1"));
    }
}