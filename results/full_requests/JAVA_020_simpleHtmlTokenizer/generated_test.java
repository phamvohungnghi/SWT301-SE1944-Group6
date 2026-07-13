import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class SimpleHtmlTokenizerTest {

    @Test
    void testNullInput() {
        List<String[]> result = JAVA_020_simpleHtmlTokenizer.simpleHtmlTokenizer(null);
        assertTrue(result.isEmpty(), "Expected empty list for null input");
    }

    @Test
    void testEmptyString() {
        List<String[]> result = JAVA_020_simpleHtmlTokenizer.simpleHtmlTokenizer("");
        assertTrue(result.isEmpty(), "Expected empty list for empty string");
    }

    @Test
    void testSingleTag() {
        List<String[]> result = JAVA_020_simpleHtmlTokenizer.simpleHtmlTokenizer("<tag>");
        assertEquals(1, result.size(), "Expected one token for single tag");
        assertArrayEquals(new String[]{"TAG", "<tag>"}, result.get(0), "Token mismatch for single tag");
    }

    @Test
    void testTextBeforeTag() {
        List<String[]> result = JAVA_020_simpleHtmlTokenizer.simpleHtmlTokenizer("Hello <tag>");
        assertEquals(2, result.size(), "Expected two tokens for text before tag");
        assertArrayEquals(new String[]{"TEXT", "Hello "}, result.get(0), "Token mismatch for text before tag");
        assertArrayEquals(new String[]{"TAG", "<tag>"}, result.get(1), "Token mismatch for tag");
    }

    @Test
    void testTextAfterTag() {
        List<String[]> result = JAVA_020_simpleHtmlTokenizer.simpleHtmlTokenizer("<tag> World");
        assertEquals(2, result.size(), "Expected two tokens for tag followed by text");
        assertArrayEquals(new String[]{"TAG", "<tag>"}, result.get(0), "Token mismatch for tag");
        assertArrayEquals(new String[]{"TEXT", " World"}, result.get(1), "Token mismatch for text after tag");
    }

    @Test
    void testMultipleTags() {
        List<String[]> result = JAVA_020_simpleHtmlTokenizer.simpleHtmlTokenizer("<tag1>Text1<tag2>Text2</tag2>");
        assertEquals(4, result.size(), "Expected four tokens for multiple tags and text");
        assertArrayEquals(new String[]{"TAG", "<tag1>"}, result.get(0), "Token mismatch for first tag");
        assertArrayEquals(new String[]{"TEXT", "Text1"}, result.get(1), "Token mismatch for first text");
        assertArrayEquals(new String[]{"TAG", "<tag2>"}, result.get(2), "Token mismatch for second tag");
        assertArrayEquals(new String[]{"TEXT", "Text2"}, result.get(3), "Token mismatch for second text");
    }

    @Test
    void testUnclosedTag() {
        List<String[]> result = JAVA_020_simpleHtmlTokenizer.simpleHtmlTokenizer("<tag>");
        assertEquals(1, result.size(), "Expected one token for unclosed tag");
        assertArrayEquals(new String[]{"TAG", "<tag>"}, result.get(0), "Token mismatch for unclosed tag");
    }

    @Test
    void testTextOnly() {
        List<String[]> result = JAVA_020_simpleHtmlTokenizer.simpleHtmlTokenizer("Just some text.");
        assertEquals(1, result.size(), "Expected one token for text only");
        assertArrayEquals(new String[]{"TEXT", "Just some text."}, result.get(0), "Token mismatch for text only");
    }

    @Test
    void testTagsWithNoText() {
        List<String[]> result = JAVA_020_simpleHtmlTokenizer.simpleHtmlTokenizer("<tag1><tag2>");
        assertEquals(2, result.size(), "Expected two tokens for tags with no text");
        assertArrayEquals(new String[]{"TAG", "<tag1>"}, result.get(0), "Token mismatch for first tag");
        assertArrayEquals(new String[]{"TAG", "<tag2>"}, result.get(1), "Token mismatch for second tag");
    }
}