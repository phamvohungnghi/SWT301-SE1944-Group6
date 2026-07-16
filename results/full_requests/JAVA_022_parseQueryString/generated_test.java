import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class JavaAlgorithmsTest {

    private JavaAlgorithms algorithms;

    @BeforeEach
    void setUp() {
        algorithms = new JavaAlgorithms();
    }

    @Test
    void testParseQueryString_NullInput() {
        Map<String, Object> result = JavaAlgorithms.parseQueryString(null);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    void testParseQueryString_EmptyInput() {
        Map<String, Object> result = JavaAlgorithms.parseQueryString("");
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    void testParseQueryString_OnlyQuestionMark() {
        Map<String, Object> result = JavaAlgorithms.parseQueryString("?");
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    void testParseQueryString_SingleKeyValue() {
        Map<String, Object> result = JavaAlgorithms.parseQueryString("key=value");
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals("value", result.get("key"));
    }

    @Test
    void testParseQueryString_MultipleKeyValues() {
        Map<String, Object> result = JavaAlgorithms.parseQueryString("key1=value1&key2=value2");
        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals("value1", result.get("key1"));
        assertEquals("value2", result.get("key2"));
    }

    @Test
    void testParseQueryString_EmptyValue() {
        Map<String, Object> result = JavaAlgorithms.parseQueryString("key1=&key2=value2");
        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals("", result.get("key1"));
        assertEquals("value2", result.get("key2"));
    }

    @Test
    void testParseQueryString_SameKeyMultipleValues() {
        Map<String, Object> result = JavaAlgorithms.parseQueryString("key=value1&key=value2");
        assertNotNull(result);
        assertEquals(1, result.size());
        assertTrue(result.get("key") instanceof List);
        List<String> values = (List<String>) result.get("key");
        assertEquals(2, values.size());
        assertTrue(values.contains("value1"));
        assertTrue(values.contains("value2"));
    }

    @Test
    void testParseQueryString_EmptyPairs() {
        Map<String, Object> result = JavaAlgorithms.parseQueryString("key1=value1&&key2=value2");
        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals("value1", result.get("key1"));
        assertEquals("value2", result.get("key2"));
    }

    @Test
    void testParseQueryString_LeadingQuestionMark() {
        Map<String, Object> result = JavaAlgorithms.parseQueryString("?key1=value1&key2=value2");
        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals("value1", result.get("key1"));
        assertEquals("value2", result.get("key2"));
    }

    @Test
    void testParseQueryString_OnlyKeys() {
        Map<String, Object> result = JavaAlgorithms.parseQueryString("key1&key2");
        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals("", result.get("key1"));
        assertEquals("", result.get("key2"));
    }

    @Test
    void testParseQueryString_ComplexInput() {
        Map<String, Object> result = JavaAlgorithms.parseQueryString("key1=value1&key2=value2&key1=value3");
        assertNotNull(result);
        assertEquals(2, result.size());
        assertTrue(result.get("key1") instanceof List);
        List<String> values = (List<String>) result.get("key1");
        assertEquals(2, values.size());
        assertTrue(values.contains("value1"));
        assertTrue(values.contains("value3"));
        assertEquals("value2", result.get("key2"));
    }
}