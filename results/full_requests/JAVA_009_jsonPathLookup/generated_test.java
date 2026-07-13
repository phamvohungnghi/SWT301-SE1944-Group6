import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class JsonPathLookupTest {

    @Test
    public void testNullData() {
        assertNull(jsonPathLookup(null, "key"));
    }

    @Test
    public void testNullPath() {
        Map<String, Object> data = new HashMap<>();
        assertNull(jsonPathLookup(data, null));
    }

    @Test
    public void testEmptyPath() {
        Map<String, Object> data = new HashMap<>();
        assertNull(jsonPathLookup(data, ""));
    }

    @Test
    public void testNonExistentKey() {
        Map<String, Object> data = new HashMap<>();
        data.put("key", "value");
        assertNull(jsonPathLookup(data, "nonExistentKey"));
    }

    @Test
    public void testValidKey() {
        Map<String, Object> data = new HashMap<>();
        data.put("key", "value");
        assertEquals("value", jsonPathLookup(data, "key"));
    }

    @Test
    public void testNestedMapLookup() {
        Map<String, Object> data = new HashMap<>();
        Map<String, Object> nestedMap = new HashMap<>();
        nestedMap.put("nestedKey", "nestedValue");
        data.put("key", nestedMap);
        assertEquals("nestedValue", jsonPathLookup(data, "key.nestedKey"));
    }

    @Test
    public void testListLookupByIndex() {
        List<Object> list = Arrays.asList("zero", "one", "two");
        Map<String, Object> data = new HashMap<>();
        data.put("list", list);
        assertEquals("one", jsonPathLookup(data, "list.1"));
    }

    @Test
    public void testListLookupInvalidIndex() {
        List<Object> list = Arrays.asList("zero", "one", "two");
        Map<String, Object> data = new HashMap<>();
        data.put("list", list);
        assertNull(jsonPathLookup(data, "list.3"));
    }

    @Test
    public void testListLookupNonDigitKey() {
        List<Object> list = Arrays.asList("zero", "one", "two");
        Map<String, Object> data = new HashMap<>();
        data.put("list", list);
        assertNull(jsonPathLookup(data, "list.one"));
    }

    @Test
    public void testInvalidDataType() {
        Map<String, Object> data = new HashMap<>();
        data.put("key", "value");
        assertNull(jsonPathLookup(data, "key.nestedKey"));
    }

    @Test
    public void testEmptyListLookup() {
        List<Object> list = new ArrayList<>();
        Map<String, Object> data = new HashMap<>();
        data.put("list", list);
        assertNull(jsonPathLookup(data, "list.0"));
    }

    @Test
    public void testValidListLookup() {
        List<Object> list = Arrays.asList("first", "second", "third");
        Map<String, Object> data = new HashMap<>();
        data.put("list", list);
        assertEquals("third", jsonPathLookup(data, "list.2"));
    }

    @Test
    public void testInvalidListLookupNegativeIndex() {
        List<Object> list = Arrays.asList("first", "second", "third");
        Map<String, Object> data = new HashMap<>();
        data.put("list", list);
        assertNull(jsonPathLookup(data, "list.-1"));
    }

    @Test
    public void testInvalidListLookupOutOfBounds() {
        List<Object> list = Arrays.asList("first", "second", "third");
        Map<String, Object> data = new HashMap<>();
        data.put("list", list);
        assertNull(jsonPathLookup(data, "list.5"));
    }
}