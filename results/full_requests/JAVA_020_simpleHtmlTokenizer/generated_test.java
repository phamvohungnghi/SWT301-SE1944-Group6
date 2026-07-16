import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaAlgorithmsTest {

    private JavaAlgorithms javaAlgorithms;

    @BeforeEach
    public void setUp() {
        javaAlgorithms = new JavaAlgorithms();
    }

    @Test
    public void testSimpleHtmlTokenizer_NullInput() {
        List<String[]> result = JavaAlgorithms.simpleHtmlTokenizer(null);
        assertEquals(new ArrayList<>(), result);
    }

    @Test
    public void testSimpleHtmlTokenizer_EmptyString() {
        List<String[]> result = JavaAlgorithms.simpleHtmlTokenizer("");
        assertEquals(new ArrayList<>(), result);
    }

    @Test
    public void testSimpleHtmlTokenizer_OnlyText() {
        String html = "Hello World";
        List<String[]> result = JavaAlgorithms.simpleHtmlTokenizer(html);
        assertEquals(1, result.size());
        assertArrayEquals(new String[]{"TEXT", "Hello World"}, result.get(0));
    }

    @Test
    public void testSimpleHtmlTokenizer_SingleTag() {
        String html = "<p>";
        List<String[]> result = JavaAlgorithms.simpleHtmlTokenizer(html);
        assertEquals(1, result.size());
        assertArrayEquals(new String[]{"TAG", "<p>"}, result.get(0));
    }

    @Test
    public void testSimpleHtmlTokenizer_CompleteTag() {
        String html = "<p>Hello</p>";
        List<String[]> result = JavaAlgorithms.simpleHtmlTokenizer(html);
        assertEquals(2, result.size());
        assertArrayEquals(new String[]{"TAG", "<p>"}, result.get(0));
        assertArrayEquals(new String[]{"TEXT", "Hello"}, result.get(1));
        assertArrayEquals(new String[]{"TAG", "</p>"}, result.get(2));
    }

    @Test
    public void testSimpleHtmlTokenizer_MissingClosingTag() {
        String html = "<p>Hello";
        List<String[]> result = JavaAlgorithms.simpleHtmlTokenizer(html);
        assertEquals(1, result.size());
        assertArrayEquals(new String[]{"TEXT", "<p>Hello"}, result.get(0));
    }

    @Test
    public void testSimpleHtmlTokenizer_MultipleTagsAndText() {
        String html = "<div>Hello <b>World</b></div>";
        List<String[]> result = JavaAlgorithms.simpleHtmlTokenizer(html);
        assertEquals(4, result.size());
        assertArrayEquals(new String[]{"TAG", "<div>"}, result.get(0));
        assertArrayEquals(new String[]{"TEXT", "Hello "}, result.get(1));
        assertArrayEquals(new String[]{"TAG", "<b>"}, result.get(2));
        assertArrayEquals(new String[]{"TEXT", "World"}, result.get(3));
        assertArrayEquals(new String[]{"TAG", "</b>"}, result.get(4));
        assertArrayEquals(new String[]{"TAG", "</div>"}, result.get(5));
    }

    @Test
    public void testSimpleHtmlTokenizer_ConsecutiveTags() {
        String html = "<p><b></b></p>";
        List<String[]> result = JavaAlgorithms.simpleHtmlTokenizer(html);
        assertEquals(3, result.size());
        assertArrayEquals(new String[]{"TAG", "<p>"}, result.get(0));
        assertArrayEquals(new String[]{"TAG", "<b>"}, result.get(1));
        assertArrayEquals(new String[]{"TAG", "</b>"}, result.get(2));
        assertArrayEquals(new String[]{"TAG", "</p>"}, result.get(3));
    }

    @Test
    public void testSimpleHtmlTokenizer_TextBeforeTag() {
        String html = "Hello <b>World</b>";
        List<String[]> result = JavaAlgorithms.simpleHtmlTokenizer(html);
        assertEquals(3, result.size());
        assertArrayEquals(new String[]{"TEXT", "Hello "}, result.get(0));
        assertArrayEquals(new String[]{"TAG", "<b>"}, result.get(1));
        assertArrayEquals(new String[]{"TEXT", "World"}, result.get(2));
        assertArrayEquals(new String[]{"TAG", "</b>"}, result.get(3));
    }

    @Test
    public void testSimpleHtmlTokenizer_TextAfterTag() {
        String html = "<b>World</b> Hello";
        List<String[]> result = JavaAlgorithms.simpleHtmlTokenizer(html);
        assertEquals(4, result.size());
        assertArrayEquals(new String[]{"TAG", "<b>"}, result.get(0));
        assertArrayEquals(new String[]{"TEXT", "World"}, result.get(1));
        assertArrayEquals(new String[]{"TAG", "</b>"}, result.get(2));
        assertArrayEquals(new String[]{"TEXT", " Hello"}, result.get(3));
    }
}