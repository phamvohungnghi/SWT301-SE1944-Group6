import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ParseQueryStringTest {

    @Test
    void testNullInput() {
        Map<String, Object> result = JAVA_022_parseQueryString(null);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    void testEmptyInput() {
        Map<String, Object> result = JAVA_022_parseQueryString("");
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    void testInputWithOnlyQuestionMark() {
        Map<String, Object> result = JAVA_022_parseQueryString("?");
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    void testSingleKeyValuePair() {
        Map<String, Object> result = JAVA_022_parseQueryString("key=value");
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals("value", result.get("key"));
    }

    @Test
    void testSingleKeyWithoutValue() {
        Map<String, Object> result = JAVA_022_parseQueryString("key");
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals("", result.get("key"));
    }

    @Test
    void testMultipleKeyValuePairs() {
        Map<String, Object> result = JAVA_022_parseQueryString("key1=value1&key2=value2");
        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals("value1", result.get("key1"));
        assertEquals("value2", result.get("key2"));
    }

    @Test
    void testDuplicateKeys() {
        Map<String, Object> result = JAVA_022_parseQueryString("key=value1&key=value2");
        assertNotNull(result);
        assertEquals(1, result.size());
        assertTrue(result.get("key") instanceof List);
        List<?> values = (List<?>) result.get("key");
        assertEquals(2, values.size());
        assertEquals("value1", values.get(0));
        assertEquals("value2", values.get(1));
    }

    @Test
    void testDuplicateKeysWithEmptyValue() {
        Map<String, Object> result = JAVA_022_parseQueryString("key=value1&key=");
        assertNotNull(result);
        assertEquals(1, result.size());
        assertTrue(result.get("key") instanceof List);
        List<?> values = (List<?>) result.get("key");
        assertEquals(2, values.size());
        assertEquals("value1", values.get(0));
        assertEquals("", values.get(1));
    }

    @Test
    void testKeyWithoutValueAndDuplicateKeys() {
        Map<String, Object> result = JAVA_022_parseQueryString("key=value1&key&key=value2");
        assertNotNull(result);
        assertEquals(1, result.size());
        assertTrue(result.get("key") instanceof List);
        List<?> values = (List<?>) result.get("key");
        assertEquals(3, values.size());
        assertEquals("value1", values.get(0));
        assertEquals("", values.get(1));
        assertEquals("value2", values.get(2));
    }

    @Test
    void testInputWithLeadingQuestionMark() {
        Map<String, Object> result = JAVA_022_parseQueryString("?key=value");
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals("value", result.get("key"));
    }

    @Test
    void testInputWithEmptyPairs() {
        Map<String, Object> result = JAVA_022_parseQueryString("key1=value1&&key2=value2");
        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals("value1", result.get("key1"));
        assertEquals("value2", result.get("key2"));
    }

    @Test
    void testInputWithSpecialCharacters() {
        Map<String, Object> result = JAVA_022_parseQueryString("key1=val%20ue1&key2=val%3Due2");
        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals("val%20ue1", result.get("key1"));
        assertEquals("val%3Due2", result.get("key2"));
    }

    @Test
    void testInputWithTrailingAmpersand() {
        Map<String, Object> result = JAVA_022_parseQueryString("key1=value1&");
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals("value1", result.get("key1"));
    }

    @Test
    void testInputWithOnlyAmpersands() {
        Map<String, Object> result = JAVA_022_parseQueryString("&&&&");
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }
}