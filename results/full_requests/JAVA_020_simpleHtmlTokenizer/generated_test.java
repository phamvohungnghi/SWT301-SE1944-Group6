import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class SimpleHtmlTokenizerTest {

    @Test
    public void testNullInput() {
        List<String[]> result = JAVA_020_simpleHtmlTokenizer.simpleHtmlTokenizer(null);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testEmptyString() {
        List<String[]> result = JAVA_020_simpleHtmlTokenizer.simpleHtmlTokenizer("");
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testOnlyText() {
        List<String[]> result = JAVA_020_simpleHtmlTokenizer.simpleHtmlTokenizer("Hello World");
        assertEquals(1, result.size());
        assertArrayEquals(new String[]{"TEXT", "Hello World"}, result.get(0));
    }

    @Test
    public void testOnlyTag() {
        List<String[]> result = JAVA_020_simpleHtmlTokenizer.simpleHtmlTokenizer("<div>");
        assertEquals(1, result.size());
        assertArrayEquals(new String[]{"TAG", "<div>"}, result.get(0));
    }

    @Test
    public void testTextFollowedByTag() {
        List<String[]> result = JAVA_020_simpleHtmlTokenizer.simpleHtmlTokenizer("Hello<div>");
        assertEquals(2, result.size());
        assertArrayEquals(new String[]{"TEXT", "Hello"}, result.get(0));
        assertArrayEquals(new String[]{"TAG", "<div>"}, result.get(1));
    }

    @Test
    public void testTagFollowedByText() {
        List<String[]> result = JAVA_020_simpleHtmlTokenizer.simpleHtmlTokenizer("<div>Hello");
        assertEquals(2, result.size());
        assertArrayEquals(new String[]{"TAG", "<div>"}, result.get(0));
        assertArrayEquals(new String[]{"TEXT", "Hello"}, result.get(1));
    }

    @Test
    public void testMultipleTagsAndText() {
        List<String[]> result = JAVA_020_simpleHtmlTokenizer.simpleHtmlTokenizer("<div>Hello</div>World");
        assertEquals(4, result.size());
        assertArrayEquals(new String[]{"TAG", "<div>"}, result.get(0));
        assertArrayEquals(new String[]{"TEXT", "Hello"}, result.get(1));
        assertArrayEquals(new String[]{"TAG", "</div>"}, result.get(2));
        assertArrayEquals(new String[]{"TEXT", "World"}, result.get(3));
    }

    @Test
    public void testUnclosedTag() {
        List<String[]> result = JAVA_020_simpleHtmlTokenizer.simpleHtmlTokenizer("<div");
        assertEquals(1, result.size());
        assertArrayEquals(new String[]{"TEXT", "<div"}, result.get(0));
    }

    @Test
    public void testTextWithUnclosedTag() {
        List<String[]> result = JAVA_020_simpleHtmlTokenizer.simpleHtmlTokenizer("Hello<div");
        assertEquals(2, result.size());
        assertArrayEquals(new String[]{"TEXT", "Hello"}, result.get(0));
        assertArrayEquals(new String[]{"TEXT", "<div"}, result.get(1));
    }

    @Test
    public void testTagWithAttributes() {
        List<String[]> result = JAVA_020_simpleHtmlTokenizer.simpleHtmlTokenizer("<div class=\"test\">");
        assertEquals(1, result.size());
        assertArrayEquals(new String[]{"TAG", "<div class=\"test\">"}, result.get(0));
    }

    @Test
    public void testComplexHtml() {
        List<String[]> result = JAVA_020_simpleHtmlTokenizer.simpleHtmlTokenizer("<div>Hello<span>World</span></div>");
        assertEquals(6, result.size());
        assertArrayEquals(new String[]{"TAG", "<div>"}, result.get(0));
        assertArrayEquals(new String[]{"TEXT", "Hello"}, result.get(1));
        assertArrayEquals(new String[]{"TAG", "<span>"}, result.get(2));
        assertArrayEquals(new String[]{"TEXT", "World"}, result.get(3));
        assertArrayEquals(new String[]{"TAG", "</span>"}, result.get(4));
        assertArrayEquals(new String[]{"TAG", "</div>"}, result.get(5));
    }
}