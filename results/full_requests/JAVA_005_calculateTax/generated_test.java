import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTaxTest {

    @Test
    void testCalculateTaxWithNegativeIncome() {
        assertEquals(0.0, JAVA_005_calculateTax.calculateTax(-5000, "single"), 0.001);
        assertEquals(0.0, JAVA_005_calculateTax.calculateTax(-1, "married"), 0.001);
        assertEquals(0.0, JAVA_005_calculateTax.calculateTax(-100, "other"), 0.001);
    }

    @Test
    void testCalculateTaxWithZeroIncome() {
        assertEquals(0.0, JAVA_005_calculateTax.calculateTax(0, "single"), 0.001);
        assertEquals(0.0, JAVA_005_calculateTax.calculateTax(0, "married"), 0.001);
        assertEquals(0.0, JAVA_005_calculateTax.calculateTax(0, "other"), 0.001);
    }

    @Test
    void testCalculateTaxSingleBracket1() {
        assertEquals(500.0, JAVA_005_calculateTax.calculateTax(5000, "single"), 0.001);
        assertEquals(1000.0, JAVA_005_calculateTax.calculateTax(10000, "single"), 0.001);
    }

    @Test
    void testCalculateTaxSingleBracket2() {
        assertEquals(1750.0, JAVA_005_calculateTax.calculateTax(15000, "single"), 0.001);
        assertEquals(5500.0, JAVA_005_calculateTax.calculateTax(40000, "single"), 0.001);
    }

    @Test
    void testCalculateTaxSingleBracket3() {
        assertEquals(5750.0, JAVA_005_calculateTax.calculateTax(41000, "single"), 0.001);
        assertEquals(8000.0, JAVA_005_calculateTax.calculateTax(50000, "single"), 0.001);
    }

    @Test
    void testCalculateTaxMarriedBracket1() {
        assertEquals(1000.0, JAVA_005_calculateTax.calculateTax(10000, "married"), 0.001);
        assertEquals(2000.0, JAVA_005_calculateTax.calculateTax(20000, "married"), 0.001);
    }

    @Test
    void testCalculateTaxMarriedBracket2() {
        assertEquals(2750.0, JAVA_005_calculateTax.calculateTax(25000, "married"), 0.001);
        assertEquals(11000.0, JAVA_005_calculateTax.calculateTax(80000, "married"), 0.001);
    }

    @Test
    void testCalculateTaxMarriedBracket3() {
        assertEquals(11250.0, JAVA_005_calculateTax.calculateTax(81000, "married"), 0.001);
        assertEquals(13500.0, JAVA_005_calculateTax.calculateTax(90000, "married"), 0.001);
    }

    @Test
    void testCalculateTaxOtherStatus() {
        assertEquals(2000.0, JAVA_005_calculateTax.calculateTax(10000, "other"), 0.001);
        assertEquals(8000.0, JAVA_005_calculateTax.calculateTax(40000, "other"), 0.001);
        assertEquals(20000.0, JAVA_005_calculateTax.calculateTax(100000, "other"), 0.001);
    }

    @Test
    void testCalculateTaxCaseInsensitiveStatus() {
        assertEquals(1000.0, JAVA_005_calculateTax.calculateTax(10000, "SINGLE"), 0.001);
        assertEquals(2000.0, JAVA_005_calculateTax.calculateTax(20000, "MARRIED"), 0.001);
        assertEquals(2000.0, JAVA_005_calculateTax.calculateTax(10000, "OTHER"), 0.001);
    }

    @Test
    void testCalculateTaxInvalidStatus() {
        assertEquals(2000.0, JAVA_005_calculateTax.calculateTax(10000, "unknown"), 0.001);
        assertEquals(8000.0, JAVA_005_calculateTax.calculateTax(40000, ""), 0.001);
        assertEquals(20000.0, JAVA_005_calculateTax.calculateTax(100000, null), 0.001);
    }
}