import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DateDifferenceTest {

    @Test
    void testValidDatesSameDay() {
        assertEquals(0, JAVA_023_dateDifference("2023-10-10", "2023-10-10"));
    }

    @Test
    void testValidDatesDifferentDays() {
        assertEquals(1, JAVA_023_dateDifference("2023-10-10", "2023-10-11"));
        assertEquals(31, JAVA_023_dateDifference("2023-01-01", "2023-02-01"));
    }

    @Test
    void testValidDatesDifferentYears() {
        assertEquals(365, JAVA_023_dateDifference("2022-10-10", "2023-10-10"));
        assertEquals(366, JAVA_023_dateDifference("2019-01-01", "2020-01-01")); // Leap year
    }

    @Test
    void testValidDatesDifferentMonths() {
        assertEquals(30, JAVA_023_dateDifference("2023-04-01", "2023-05-01"));
        assertEquals(28, JAVA_023_dateDifference("2023-02-01", "2023-03-01")); // Non-leap year February
        assertEquals(29, JAVA_023_dateDifference("2020-02-01", "2020-03-01")); // Leap year February
    }

    @Test
    void testNullInputs() {
        assertEquals(-1, JAVA_023_dateDifference(null, "2023-10-10"));
        assertEquals(-1, JAVA_023_dateDifference("2023-10-10", null));
        assertEquals(-1, JAVA_023_dateDifference(null, null));
    }

    @Test
    void testInvalidDateFormats() {
        assertEquals(-1, JAVA_023_dateDifference("2023-10", "2023-10-10")); // Missing day
        assertEquals(-1, JAVA_023_dateDifference("2023-10-10", "2023/10/10")); // Wrong delimiter
        assertEquals(-1, JAVA_023_dateDifference("2023-10-10", "10-10-2023")); // Wrong format
        assertEquals(-1, JAVA_023_dateDifference("2023-10-10", "abcd-ef-gh")); // Non-numeric
    }

    @Test
    void testOutOfRangeValues() {
        assertEquals(-1, JAVA_023_dateDifference("2023-13-10", "2023-10-10")); // Invalid month
        assertEquals(-1, JAVA_023_dateDifference("2023-10-32", "2023-10-10")); // Invalid day
        assertEquals(-1, JAVA_023_dateDifference("2023-00-10", "2023-10-10")); // Invalid month (zero)
        assertEquals(-1, JAVA_023_dateDifference("2023-10-00", "2023-10-10")); // Invalid day (zero)
    }

    @Test
    void testExceptionHandling() {
        assertEquals(-1, JAVA_023_dateDifference("2023-10-10", ""));
        assertEquals(-1, JAVA_023_dateDifference("", "2023-10-10"));
        assertEquals(-1, JAVA_023_dateDifference("", ""));
    }
}