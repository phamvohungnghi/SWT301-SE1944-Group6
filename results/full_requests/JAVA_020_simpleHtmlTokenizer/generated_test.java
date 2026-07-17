import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class JAVA_020_simpleHtmlTokenizerTest {
    @Test void handlesNullAndEmpty() { assertTrue(JavaAlgorithms.simpleHtmlTokenizer(null).isEmpty()); assertTrue(JavaAlgorithms.simpleHtmlTokenizer("").isEmpty()); }
    @Test void tokenizesTagsAndText() { List<String[]> t=JavaAlgorithms.simpleHtmlTokenizer("<b>Hello</b>"); assertEquals(3,t.size()); assertArrayEquals(new String[]{"TAG","<b>"},t.get(0)); assertArrayEquals(new String[]{"TEXT","Hello"},t.get(1)); assertArrayEquals(new String[]{"TAG","</b>"},t.get(2)); }
    @Test void treatsUnclosedTagAsText() { List<String[]> t=JavaAlgorithms.simpleHtmlTokenizer("x<bad"); assertArrayEquals(new String[]{"TEXT","x"},t.get(0)); assertArrayEquals(new String[]{"TEXT","<bad"},t.get(1)); }
}
