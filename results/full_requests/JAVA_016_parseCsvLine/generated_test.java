import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaAlgorithmsTest {

    @BeforeEach
    public void setUp() {
        // Any setup can be done here if needed
    }

    @Test
    public void testParseCsvLine_NullInput() {
        List<String> result = JavaAlgorithms.parseCsvLine(null);
        assertEquals(Arrays.asList(), result);
    }

    @Test
    public void testParseCsvLine_EmptyInput() {
        List<String> result = JavaAlgorithms.parseCsvLine("");
        assertEquals(Arrays.asList(""), result);
    }

    @Test
    public void testParseCsvLine_SingleValue() {
        List<String> result = JavaAlgorithms.parseCsvLine("value");
        assertEquals(Arrays.asList("value"), result);
    }

    @Test
    public void testParseCsvLine_TwoValues() {
        List<String> result = JavaAlgorithms.parseCsvLine("value1,value2");
        assertEquals(Arrays.asList("value1", "value2"), result);
    }

    @Test
    public void testParseCsvLine_QuotedValue() {
        List<String> result = JavaAlgorithms.parseCsvLine("\"value1\",\"value2\"");
        assertEquals(Arrays.asList("value1", "value2"), result);
    }

    @Test
    public void testParseCsvLine_QuotedValueWithComma() {
        List<String> result = JavaAlgorithms.parseCsvLine("\"value1,value2\",\"value3\"");
        assertEquals(Arrays.asList("value1,value2", "value3"), result);
    }

    @Test
    public void testParseCsvLine_EscapedQuote() {
        List<String> result = JavaAlgorithms.parseCsvLine("\"value1\"\"value2\"");
        assertEquals(Arrays.asList("value1", "value2"), result);
    }

    @Test
    public void testParseCsvLine_MixedQuotesAndValues() {
        List<String> result = JavaAlgorithms.parseCsvLine("value1,\"value2,value3\",value4");
        assertEquals(Arrays.asList("value1", "value2,value3", "value4"), result);
    }

    @Test
    public void testParseCsvLine_LeadingAndTrailingSpaces() {
        List<String> result = JavaAlgorithms.parseCsvLine("  value1 , \" value2 \" , value3  ");
        assertEquals(Arrays.asList("  value1 ", " value2 ", " value3  "), result);
    }

    @Test
    public void testParseCsvLine_ConsecutiveCommas() {
        List<String> result = JavaAlgorithms.parseCsvLine("value1,,value3");
        assertEquals(Arrays.asList("value1", "", "value3"), result);
    }

    @Test
    public void testParseCsvLine_EmptyValues() {
        List<String> result = JavaAlgorithms.parseCsvLine(",value2,,value4");
        assertEquals(Arrays.asList("", "value2", "", "value4"), result);
    }
}