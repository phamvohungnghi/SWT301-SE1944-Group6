import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JavaAlgorithmsTest {

    @Test
    public void testDateDifference_ValidDates() {
        Assertions.assertEquals(0, JavaAlgorithms.dateDifference("2023-10-01", "2023-10-01"));
        Assertions.assertEquals(1, JavaAlgorithms.dateDifference("2023-10-01", "2023-10-02"));
        Assertions.assertEquals(365, JavaAlgorithms.dateDifference("2022-10-01", "2023-10-01"));
        Assertions.assertEquals(365, JavaAlgorithms.dateDifference("2023-10-01", "2024-10-01"));
        Assertions.assertEquals(30, JavaAlgorithms.dateDifference("2023-09-01", "2023-10-01"));
    }

    @Test
    public void testDateDifference_LeapYear() {
        Assertions.assertEquals(60, JavaAlgorithms.dateDifference("2020-01-01", "2020-03-01")); // Leap year
        Assertions.assertEquals(59, JavaAlgorithms.dateDifference("2020-01-01", "2020-02-29")); // Leap year
        Assertions.assertEquals(1, JavaAlgorithms.dateDifference("2020-02-29", "2020-03-01")); // Leap year
    }

    @Test
    public void testDateDifference_InvalidFormat() {
        Assertions.assertEquals(-1, JavaAlgorithms.dateDifference("2023-10", "2023-10-01"));
        Assertions.assertEquals(-1, JavaAlgorithms.dateDifference("2023-10-01", "2023-10-01-01"));
        Assertions.assertEquals(-1, JavaAlgorithms.dateDifference("2023-10-01", "2023-10"));
        Assertions.assertEquals(-1, JavaAlgorithms.dateDifference("2023-10-01", "2023-10-01-01"));
    }

    @Test
    public void testDateDifference_NullInput() {
        Assertions.assertEquals(-1, JavaAlgorithms.dateDifference(null, "2023-10-01"));
        Assertions.assertEquals(-1, JavaAlgorithms.dateDifference("2023-10-01", null));
        Assertions.assertEquals(-1, JavaAlgorithms.dateDifference(null, null));
    }

    @Test
    public void testDateDifference_InvalidDate() {
        Assertions.assertEquals(-1, JavaAlgorithms.dateDifference("2023-02-30", "2023-03-01")); // Invalid date
        Assertions.assertEquals(-1, JavaAlgorithms.dateDifference("2023-04-31", "2023-05-01")); // Invalid date
    }
}