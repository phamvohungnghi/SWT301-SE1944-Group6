import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxCalculatorTest {

    @Test
    public void testCalculateTax_ZeroIncome() {
        assertEquals(0.0, calculateTax(0, "single"));
    }

    @Test
    public void testCalculateTax_NegativeIncome() {
        assertEquals(0.0, calculateTax(-5000, "single"));
    }

    @Test
    public void testCalculateTax_SingleIncomeBelowThreshold() {
        assertEquals(1000.0, calculateTax(10000, "single"));
    }

    @Test
    public void testCalculateTax_SingleIncomeMiddleBracket() {
        assertEquals(4000.0, calculateTax(30000, "single"));
    }

    @Test
    public void testCalculateTax_SingleIncomeAboveThreshold() {
        assertEquals(8500.0, calculateTax(60000, "single"));
    }

    @Test
    public void testCalculateTax_MarriedIncomeBelowThreshold() {
        assertEquals(2000.0, calculateTax(20000, "married"));
    }

    @Test
    public void testCalculateTax_MarriedIncomeMiddleBracket() {
        assertEquals(8000.0, calculateTax(60000, "married"));
    }

    @Test
    public void testCalculateTax_MarriedIncomeAboveThreshold() {
        assertEquals(16500.0, calculateTax(100000, "married"));
    }

    @Test
    public void testCalculateTax_OtherStatusIncome() {
        assertEquals(2000.0, calculateTax(10000, "other"));
    }

    @Test
    public void testCalculateTax_UpperBoundarySingle() {
        assertEquals(5500.0, calculateTax(40000, "single"));
    }

    @Test
    public void testCalculateTax_UpperBoundaryMarried() {
        assertEquals(11000.0, calculateTax(80000, "married"));
    }

    @Test
    public void testCalculateTax_UnknownStatus() {
        assertEquals(2000.0, calculateTax(10000, "unknown"));
    }
}