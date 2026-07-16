import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class JsonPathLookupTest {

    private Map<String, Object> data;

    @BeforeEach
    public void setUp() {
        data = new HashMap<>();
        data.put("key1", "value1");
        data.put("key2", Arrays.asList("value2a", "value2b", "value2c"));
        Map<String, Object> nestedMap = new HashMap<>();
        nestedMap.put("nestedKey", "nestedValue");
        data.put("key3", nestedMap);
    }

    @Test
    public void testJsonPathLookupWithValidMapPath() {
        assertEquals("value1", JavaAlgorithms.jsonPathLookup(data, "key1"));
        assertEquals("nestedValue", JavaAlgorithms.jsonPathLookup(data, "key3.nestedKey"));
    }

    @Test
    public void testJsonPathLookupWithValidListPath() {
        assertEquals("value2a", JavaAlgorithms.jsonPathLookup(data, "key2.0"));
        assertEquals("value2b", JavaAlgorithms.jsonPathLookup(data, "key2.1"));
        assertEquals("value2c", JavaAlgorithms.jsonPathLookup(data, "key2.2"));
    }

    @Test
    public void testJsonPathLookupWithInvalidPath() {
        assertNull(JavaAlgorithms.jsonPathLookup(data, "key4"));
        assertNull(JavaAlgorithms.jsonPathLookup(data, "key2.3"));
        assertNull(JavaAlgorithms.jsonPathLookup(data, "key3.nonExistentKey"));
    }

    @Test
    public void testJsonPathLookupWithNullData() {
        assertNull(JavaAlgorithms.jsonPathLookup(null, "key1"));
    }

    @Test
    public void testJsonPathLookupWithNullPath() {
        assertNull(JavaAlgorithms.jsonPathLookup(data, null));
    }

    @Test
    public void testJsonPathLookupWithEmptyPath() {
        assertNull(JavaAlgorithms.jsonPathLookup(data, ""));
    }

    @Test
    public void testJsonPathLookupWithInvalidListIndex() {
        assertNull(JavaAlgorithms.jsonPathLookup(data, "key2.-1"));
        assertNull(JavaAlgorithms.jsonPathLookup(data, "key2.100"));
    }

    @Test
    public void testJsonPathLookupWithNonDigitListIndex() {
        assertNull(JavaAlgorithms.jsonPathLookup(data, "key2.invalidIndex"));
    }

    @Test
    public void testJsonPathLookupWithMixedPath() {
        assertNull(JavaAlgorithms.jsonPathLookup(data, "key2.0.nestedKey"));
        assertNull(JavaAlgorithms.jsonPathLookup(data, "key3.key2"));
    }
}