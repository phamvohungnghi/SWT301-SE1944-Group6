import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JavaAlgorithmsTest {

    @Test
    public void testRunLengthDecoding_ValidInput() {
        assertEquals("aaabb", JavaAlgorithms.runLengthDecoding("3a2b"));
        assertEquals("cccc", JavaAlgorithms.runLengthDecoding("4c"));
        assertEquals("xxyyy", JavaAlgorithms.runLengthDecoding("2x3y"));
    }

    @Test
    public void testRunLengthDecoding_EmptyString() {
        assertEquals("", JavaAlgorithms.runLengthDecoding(""));
    }

    @Test
    public void testRunLengthDecoding_NullInput() {
        assertEquals("", JavaAlgorithms.runLengthDecoding(null));
    }

    @Test
    public void testRunLengthDecoding_InvalidCharacter() {
        assertEquals("", JavaAlgorithms.runLengthDecoding("3a2b4c1d!"));
        assertEquals("", JavaAlgorithms.runLengthDecoding("3a2b4c1d#"));
    }

    @Test
    public void testRunLengthDecoding_NonDigitStart() {
        assertEquals("", JavaAlgorithms.runLengthDecoding("a3b2"));
        assertEquals("", JavaAlgorithms.runLengthDecoding("b4c1d"));
    }

    @Test
    public void testRunLengthDecoding_MissingCharacterAfterCount() {
        assertEquals("", JavaAlgorithms.runLengthDecoding("3a2"));
        assertEquals("", JavaAlgorithms.runLengthDecoding("4c"));
    }

    @Test
    public void testRunLengthDecoding_ConsecutiveDigits() {
        assertEquals("aaa", JavaAlgorithms.runLengthDecoding("3a"));
        assertEquals("bb", JavaAlgorithms.runLengthDecoding("2b"));
        assertEquals("cccc", JavaAlgorithms.runLengthDecoding("4c"));
    }

    @Test
    public void testRunLengthDecoding_LargeCounts() {
        assertEquals("a", JavaAlgorithms.runLengthDecoding("1a"));
        assertEquals("bbbb", JavaAlgorithms.runLengthDecoding("4b"));
        assertEquals("cccccccccc", JavaAlgorithms.runLengthDecoding("10c"));
    }

    @Test
    public void testRunLengthDecoding_ComplexValidInput() {
        assertEquals("aaabbbcccc", JavaAlgorithms.runLengthDecoding("3a3b4c"));
        assertEquals("xyzxyz", JavaAlgorithms.runLengthDecoding("3x2y2z"));
    }

    @Test
    public void testRunLengthDecoding_OnlyDigits() {
        assertEquals("", JavaAlgorithms.runLengthDecoding("12345"));
    }
}