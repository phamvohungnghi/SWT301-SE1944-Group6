import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JavaAlgorithmsTest {

    @Test
    public void testRunLengthEncoding_NullInput() {
        String result = JavaAlgorithms.runLengthEncoding(null);
        Assertions.assertEquals("", result);
    }

    @Test
    public void testRunLengthEncoding_EmptyString() {
        String result = JavaAlgorithms.runLengthEncoding("");
        Assertions.assertEquals("", result);
    }

    @Test
    public void testRunLengthEncoding_SingleCharacter() {
        String result = JavaAlgorithms.runLengthEncoding("a");
        Assertions.assertEquals("1a", result);
    }

    @Test
    public void testRunLengthEncoding_RepeatedCharacters() {
        String result = JavaAlgorithms.runLengthEncoding("aaabbc");
        Assertions.assertEquals("3a2b1c", result);
    }

    @Test
    public void testRunLengthEncoding_AlternatingCharacters() {
        String result = JavaAlgorithms.runLengthEncoding("abc");
        Assertions.assertEquals("1a1b1c", result);
    }

    @Test
    public void testRunLengthEncoding_NonLetterCharacters() {
        String result = JavaAlgorithms.runLengthEncoding("aa1bb");
        Assertions.assertEquals("", result);
    }

    @Test
    public void testRunLengthEncoding_SpecialCharacters() {
        String result = JavaAlgorithms.runLengthEncoding("aa@bb");
        Assertions.assertEquals("", result);
    }

    @Test
    public void testRunLengthEncoding_MixedCase() {
        String result = JavaAlgorithms.runLengthEncoding("aaAAaa");
        Assertions.assertEquals("2a2A2a", result);
    }

    @Test
    public void testRunLengthEncoding_LongString() {
        String result = JavaAlgorithms.runLengthEncoding("aaaabbbbcccc");
        Assertions.assertEquals("4a4b4c", result);
    }

    @Test
    public void testRunLengthEncoding_SingleCharacterRepeated() {
        String result = JavaAlgorithms.runLengthEncoding("zzzzzz");
        Assertions.assertEquals("6z", result);
    }
}