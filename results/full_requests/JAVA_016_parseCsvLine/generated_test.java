import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class CsvParserTest {

    @Test
    void testParseCsvLine_NullInput() {
        List<String> result = JAVA_016_parseCsvLine.parseCsvLine(null);
        assertTrue(result.isEmpty(), "Expected empty list for null input");
    }

    @Test
    void testParseCsvLine_EmptyString() {
        List<String> result = JAVA_016_parseCsvLine.parseCsvLine("");
        assertEquals(1, result.size(), "Expected one empty string in the result");
        assertEquals("", result.get(0), "Expected the first element to be an empty string");
    }

    @Test
    void testParseCsvLine_SingleValue() {
        List<String> result = JAVA_016_parseCsvLine.parseCsvLine("value");
        assertEquals(1, result.size(), "Expected one value in the result");
        assertEquals("value", result.get(0), "Expected the first element to match the input value");
    }

    @Test
    void testParseCsvLine_TwoValues() {
        List<String> result = JAVA_016_parseCsvLine.parseCsvLine("value1,value2");
        assertEquals(2, result.size(), "Expected two values in the result");
        assertEquals("value1", result.get(0), "Expected the first element to match value1");
        assertEquals("value2", result.get(1), "Expected the second element to match value2");
    }

    @Test
    void testParseCsvLine_QuotedValue() {
        List<String> result = JAVA_016_parseCsvLine.parseCsvLine("\"value\"");
        assertEquals(1, result.size(), "Expected one quoted value in the result");
        assertEquals("value", result.get(0), "Expected the first element to match the unquoted value");
    }

    @Test
    void testParseCsvLine_QuotedComma() {
        List<String> result = JAVA_016_parseCsvLine.parseCsvLine("\"value1,value2\"");
        assertEquals(1, result.size(), "Expected one value in the result");
        assertEquals("value1,value2", result.get(0), "Expected the first element to match the quoted value with comma");
    }

    @Test
    void testParseCsvLine_EscapedQuote() {
        List<String> result = JAVA_016_parseCsvLine.parseCsvLine("\"value with \"\"escaped quotes\"\"");
        assertEquals(1, result.size(), "Expected one value in the result");
        assertEquals("value with \"escaped quotes\"", result.get(0), "Expected the first element to match the value with escaped quotes");
    }

    @Test
    void testParseCsvLine_MultipleValuesWithQuotes() {
        List<String> result = JAVA_016_parseCsvLine.parseCsvLine("value1,\"value2,value3\",value4");
        assertEquals(3, result.size(), "Expected three values in the result");
        assertEquals("value1", result.get(0), "Expected the first element to match value1");
        assertEquals("value2,value3", result.get(1), "Expected the second element to match value2,value3");
        assertEquals("value4", result.get(2), "Expected the third element to match value4");
    }

    @Test
    void testParseCsvLine_ConsecutiveCommas() {
        List<String> result = JAVA_016_parseCsvLine.parseCsvLine("value1,,value2");
        assertEquals(3, result.size(), "Expected three values in the result due to consecutive commas");
        assertEquals("value1", result.get(0), "Expected the first element to match value1");
        assertEquals("", result.get(1), "Expected the second element to be an empty string");
        assertEquals("value2", result.get(2), "Expected the third element to match value2");
    }
}