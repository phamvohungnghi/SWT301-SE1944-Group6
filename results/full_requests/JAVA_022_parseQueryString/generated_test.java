import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class QueryStringParserTest {

    @Test
    void testParseQueryString_NullInput() {
        Map<String, Object> result = JAVA_022_parseQueryString.parseQueryString(null);
        assertTrue(result.isEmpty(), "Expected empty map for null input");
    }

    @Test
    void testParseQueryString_EmptyInput() {
        Map<String, Object> result = JAVA_022_parseQueryString.parseQueryString("");
        assertTrue(result.isEmpty(), "Expected empty map for empty input");
    }

    @Test
    void testParseQueryString_OnlyQuestionMark() {
        Map<String, Object> result = JAVA_022_parseQueryString.parseQueryString("?");
        assertTrue(result.isEmpty(), "Expected empty map for input with only '?'");
    }

    @Test
    void testParseQueryString_SingleKeyValue() {
        Map<String, Object> result = JAVA_022_parseQueryString.parseQueryString("key=value");
        assertEquals(1, result.size(), "Expected map size of 1");
        assertEquals("value", result.get("key"), "Expected value for 'key' to be 'value'");
    }

    @Test
    void testParseQueryString_MultipleKeyValues() {
        Map<String, Object> result = JAVA_022_parseQueryString.parseQueryString("key1=value1&key2=value2");
        assertEquals(2, result.size(), "Expected map size of 2");
        assertEquals("value1", result.get("key1"), "Expected value for 'key1' to be 'value1'");
        assertEquals("value2", result.get("key2"), "Expected value for 'key2' to be 'value2'");
    }

    @Test
    void testParseQueryString_EmptyValue() {
        Map<String, Object> result = JAVA_022_parseQueryString.parseQueryString("key=");
        assertEquals(1, result.size(), "Expected map size of 1");
        assertEquals("", result.get("key"), "Expected value for 'key' to be empty string");
    }

    @Test
    void testParseQueryString_MultipleValuesForSameKey() {
        Map<String, Object> result = JAVA_022_parseQueryString.parseQueryString("key=value1&key=value2");
        assertEquals(1, result.size(), "Expected map size of 1");
        assertTrue(result.get("key") instanceof List, "Expected value for 'key' to be a List");
        List<String> values = (List<String>) result.get("key");
        assertEquals(2, values.size(), "Expected list size of 2");
        assertTrue(values.contains("value1"), "Expected list to contain 'value1'");
        assertTrue(values.contains("value2"), "Expected list to contain 'value2'");
    }

    @Test
    void testParseQueryString_IgnoreEmptyPairs() {
        Map<String, Object> result = JAVA_022_parseQueryString.parseQueryString("key1=value1&&key2=value2");
        assertEquals(2, result.size(), "Expected map size of 2");
        assertEquals("value1", result.get("key1"), "Expected value for 'key1' to be 'value1'");
        assertEquals("value2", result.get("key2"), "Expected value for 'key2' to be 'value2'");
    }

    @Test
    void testParseQueryString_LeadingQuestionMark() {
        Map<String, Object> result = JAVA_022_parseQueryString.parseQueryString("?key=value");
        assertEquals(1, result.size(), "Expected map size of 1");
        assertEquals("value", result.get("key"), "Expected value for 'key' to be 'value'");
    }

    @Test
    void testParseQueryString_MultipleEmptyKeys() {
        Map<String, Object> result = JAVA_022_parseQueryString.parseQueryString("=value1&=value2");
        assertEquals(1, result.size(), "Expected map size of 1");
        assertTrue(result.get("").equals("value2") || result.get("").equals("value1"), "Expected last value for empty key to be either 'value1' or 'value2'");
    }
}