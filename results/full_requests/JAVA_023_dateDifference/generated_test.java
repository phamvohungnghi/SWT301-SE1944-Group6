import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DateDifferenceTest {

    @Test
    void testNullDate1() {
        assertEquals(-1, JAVA_023_dateDifference.dateDifference(null, "2023-10-01"));
    }

    @Test
    void testNullDate2() {
        assertEquals(-1, JAVA_023_dateDifference.dateDifference("2023-10-01", null));
    }

    @Test
    void testInvalidFormatDate1() {
        assertEquals(-1, JAVA_023_dateDifference.dateDifference("2023-10", "2023-10-01"));
    }

    @Test
    void testInvalidFormatDate2() {
        assertEquals(-1, JAVA_023_dateDifference.dateDifference("2023-10-01", "2023-10"));
    }

    @Test
    void testInvalidDate1() {
        assertEquals(-1, JAVA_023_dateDifference.dateDifference("2023-13-01", "2023-10-01"));
    }

    @Test
    void testInvalidDate2() {
        assertEquals(-1, JAVA_023_dateDifference.dateDifference("2023-10-01", "2023-13-01"));
    }

    @Test
    void testValidDatesSameYear() {
        assertEquals(0, JAVA_023_dateDifference.dateDifference("2023-10-01", "2023-10-01"));
    }

    @Test
    void testValidDatesDifferentDaysSameMonth() {
        assertEquals(1, JAVA_023_dateDifference.dateDifference("2023-10-01", "2023-10-02"));
    }

    @Test
    void testValidDatesDifferentMonths() {
        assertEquals(30, JAVA_023_dateDifference.dateDifference("2023-09-01", "2023-10-01"));
    }

    @Test
    void testValidDatesDifferentYears() {
        assertEquals(365, JAVA_023_dateDifference.dateDifference("2022-10-01", "2023-10-01"));
    }

    @Test
    void testLeapYearDifference() {
        assertEquals(1, JAVA_023_dateDifference.dateDifference("2020-02-28", "2020-02-29"));
    }

    @Test
    void testInvalidIntegerParsing() {
        assertEquals(-1, JAVA_023_dateDifference.dateDifference("2023-10-01", "2023-10-xx"));
    }

    @Test
    void testBoundaryDates() {
        assertEquals(0, JAVA_023_dateDifference.dateDifference("0001-01-01", "0001-01-01"));
        assertEquals(365, JAVA_023_dateDifference.dateDifference("0001-01-01", "0002-01-01"));
    }
}