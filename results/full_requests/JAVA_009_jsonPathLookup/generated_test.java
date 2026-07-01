import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class JsonPathLookupTest {

    @Test
    void testNullData() {
        assertNull(JAVA_009_jsonPathLookup.jsonPathLookup(null, "key"));
    }

    @Test
    void testNullPath() {
        Map<String, Object> data = new HashMap<>();
        assertNull(JAVA_009_jsonPathLookup.jsonPathLookup(data, null));
    }

    @Test
    void testEmptyPath() {
        Map<String, Object> data = new HashMap<>();
        assertNull(JAVA_009_jsonPathLookup.jsonPathLookup(data, ""));
    }

    @Test
    void testPathNotFoundInMap() {
        Map<String, Object> data = new HashMap<>();
        data.put("key1", "value1");
        assertNull(JAVA_009_jsonPathLookup.jsonPathLookup(data, "key2"));
    }

    @Test
    void testPathFoundInMap() {
        Map<String, Object> data = new HashMap<>();
        data.put("key1", "value1");
        assertEquals("value1", JAVA_009_jsonPathLookup.jsonPathLookup(data, "key1"));
    }

    @Test
    void testNestedMapPathFound() {
        Map<String, Object> innerMap = new HashMap<>();
        innerMap.put("innerKey", "innerValue");
        Map<String, Object> data = new HashMap<>();
        data.put("outerKey", innerMap);
        assertEquals("innerValue", JAVA_009_jsonPathLookup.jsonPathLookup(data, "outerKey.innerKey"));
    }

    @Test
    void testNestedMapPathNotFound() {
        Map<String, Object> innerMap = new HashMap<>();
        innerMap.put("innerKey", "innerValue");
        Map<String, Object> data = new HashMap<>();
        data.put("outerKey", innerMap);
        assertNull(JAVA_009_jsonPathLookup.jsonPathLookup(data, "outerKey.nonExistentKey"));
    }

    @Test
    void testListIndexFound() {
        List<Object> list = Arrays.asList("value1", "value2", "value3");
        Map<String, Object> data = new HashMap<>();
        data.put("key", list);
        assertEquals("value2", JAVA_009_jsonPathLookup.jsonPathLookup(data, "key.1"));
    }

    @Test
    void testListIndexOutOfBounds() {
        List<Object> list = Arrays.asList("value1", "value2", "value3");
        Map<String, Object> data = new HashMap<>();
        data.put("key", list);
        assertNull(JAVA_009_jsonPathLookup.jsonPathLookup(data, "key.3"));
    }

    @Test
    void testListIndexNegative() {
        List<Object> list = Arrays.asList("value1", "value2", "value3");
        Map<String, Object> data = new HashMap<>();
        data.put("key", list);
        assertNull(JAVA_009_jsonPathLookup.jsonPathLookup(data, "key.-1"));
    }

    @Test
    void testInvalidListIndex() {
        List<Object> list = Arrays.asList("value1", "value2", "value3");
        Map<String, Object> data = new HashMap<>();
        data.put("key", list);
        assertNull(JAVA_009_jsonPathLookup.jsonPathLookup(data, "key.invalid"));
    }

    @Test
    void testMixedMapAndListPath() {
        List<Object> list = Arrays.asList("value1", "value2", "value3");
        Map<String, Object> innerMap = new HashMap<>();
        innerMap.put("innerKey", list);
        Map<String, Object> data = new HashMap<>();
        data.put("outerKey", innerMap);
        assertEquals("value3", JAVA_009_jsonPathLookup.jsonPathLookup(data, "outerKey.innerKey.2"));
    }

    @Test
    void testNonNavigableObject() {
        Map<String, Object> data = new HashMap<>();
        data.put("key", "nonNavigable");
        assertNull(JAVA_009_jsonPathLookup.jsonPathLookup(data, "key.subKey"));
    }

    @Test
    void testEmptyKeyInPath() {
        Map<String, Object> data = new HashMap<>();
        data.put("", "emptyKeyValue");
        assertEquals("emptyKeyValue", JAVA_009_jsonPathLookup.jsonPathLookup(data, ""));
    }

    @Test
    void testEmptyKeyInNestedPath() {
        Map<String, Object> innerMap = new HashMap<>();
        innerMap.put("", "emptyKeyValue");
        Map<String, Object> data = new HashMap<>();
        data.put("outerKey", innerMap);
        assertEquals("emptyKeyValue", JAVA_009_jsonPathLookup.jsonPathLookup(data, "outerKey."));
    }
}