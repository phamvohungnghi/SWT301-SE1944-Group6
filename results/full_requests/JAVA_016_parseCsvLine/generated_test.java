import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class ParseCsvLineTest {

    @Test
    public void testNullInput() {
        List<String> result = JAVA_016_parseCsvLine(null);
        assertNotNull(result, "Result should not be null for null input");
        assertTrue(result.isEmpty(), "Result should be empty for null input");
    }

    @Test
    public void testEmptyString() {
        List<String> result = JAVA_016_parseCsvLine("");
        assertNotNull(result, "Result should not be null for empty string input");
        assertEquals(1, result.size(), "Result should contain one element for empty string input");
        assertEquals("", result.get(0), "The single element should be an empty string");
    }

    @Test
    public void testSingleValueNoQuotes() {
        List<String> result = JAVA_016_parseCsvLine("value");
        assertNotNull(result, "Result should not be null for single value input");
        assertEquals(1, result.size(), "Result should contain one element for single value input");
        assertEquals("value", result.get(0), "The single element should match the input value");
    }

    @Test
    public void testMultipleValuesNoQuotes() {
        List<String> result = JAVA_016_parseCsvLine("value1,value2,value3");
        assertNotNull(result, "Result should not be null for multiple values input");
        assertEquals(3, result.size(), "Result should contain three elements for multiple values input");
        assertEquals("value1", result.get(0), "First element should match the first value");
        assertEquals("value2", result.get(1), "Second element should match the second value");
        assertEquals("value3", result.get(2), "Third element should match the third value");
    }

    @Test
    public void testValuesWithQuotes() {
        List<String> result = JAVA_016_parseCsvLine("\"value1\",\"value2\",\"value3\"");
        assertNotNull(result, "Result should not be null for quoted values input");
        assertEquals(3, result.size(), "Result should contain three elements for quoted values input");
        assertEquals("value1", result.get(0), "First element should match the first quoted value");
        assertEquals("value2", result.get(1), "Second element should match the second quoted value");
        assertEquals("value3", result.get(2), "Third element should match the third quoted value");
    }

    @Test
    public void testValuesWithEscapedQuotes() {
        List<String> result = JAVA_016_parseCsvLine("\"value1\",\"va\"\"lue2\",\"value3\"");
        assertNotNull(result, "Result should not be null for values with escaped quotes");
        assertEquals(3, result.size(), "Result should contain three elements for values with escaped quotes");
        assertEquals("value1", result.get(0), "First element should match the first quoted value");
        assertEquals("va\"lue2", result.get(1), "Second element should match the second quoted value with escaped quotes");
        assertEquals("value3", result.get(2), "Third element should match the third quoted value");
    }

    @Test
    public void testValuesWithMixedQuotesAndCommas() {
        List<String> result = JAVA_016_parseCsvLine("\"value1,with,commas\",value2,\"value3\"");
        assertNotNull(result, "Result should not be null for values with mixed quotes and commas");
        assertEquals(3, result.size(), "Result should contain three elements for values with mixed quotes and commas");
        assertEquals("value1,with,commas", result.get(0), "First element should match the first quoted value with commas");
        assertEquals("value2", result.get(1), "Second element should match the second value");
        assertEquals("value3", result.get(2), "Third element should match the third quoted value");
    }

    @Test
    public void testTrailingComma() {
        List<String> result = JAVA_016_parseCsvLine("value1,value2,");
        assertNotNull(result, "Result should not be null for input with trailing comma");
        assertEquals(3, result.size(), "Result should contain three elements for input with trailing comma");
        assertEquals("value1", result.get(0), "First element should match the first value");
        assertEquals("value2", result.get(1), "Second element should match the second value");
        assertEquals("", result.get(2), "Third element should be an empty string for trailing comma");
    }

    @Test
    public void testLeadingComma() {
        List<String> result = JAVA_016_parseCsvLine(",value1,value2");
        assertNotNull(result, "Result should not be null for input with leading comma");
        assertEquals(3, result.size(), "Result should contain three elements for input with leading comma");
        assertEquals("", result.get(0), "First element should be an empty string for leading comma");
        assertEquals("value1", result.get(1), "Second element should match the first value");
        assertEquals("value2", result.get(2), "Third element should match the second value");
    }

    @Test
    public void testOnlyCommas() {
        List<String> result = JAVA_016_parseCsvLine(",,,");
        assertNotNull(result, "Result should not be null for input with only commas");
        assertEquals(4, result.size(), "Result should contain four elements for input with three commas");
        assertEquals("", result.get(0), "First element should be an empty string");
        assertEquals("", result.get(1), "Second element should be an empty string");
        assertEquals("", result.get(2), "Third element should be an empty string");
        assertEquals("", result.get(3), "Fourth element should be an empty string");
    }

    @Test
    public void testUnclosedQuotes() {
        List<String> result = JAVA_016_parseCsvLine("\"value1,value2");
        assertNotNull(result, "Result should not be null for input with unclosed quotes");
        assertEquals(1, result.size(), "Result should contain one element for input with unclosed quotes");
        assertEquals("value1,value2", result.get(0), "Element should contain the entire input with unclosed quotes");
    }

    @Test
    public void testEmptyQuotedValue() {
        List<String> result = JAVA_016_parseCsvLine("\"\"");
        assertNotNull(result, "Result should not be null for input with empty quoted value");
        assertEquals(1, result.size(), "Result should contain one element for input with empty quoted value");
        assertEquals("", result.get(0), "Element should be an empty string for empty quoted value");
    }
}