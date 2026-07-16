import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JavaAlgorithmsTest {

    @Test
    public void testCalculateTax_SingleIncomeBelowThreshold() {
        double result = JavaAlgorithms.calculateTax(5000, "single");
        Assertions.assertEquals(500.0, result, 0.001);
    }

    @Test
    public void testCalculateTax_SingleIncomeAtThreshold() {
        double result = JavaAlgorithms.calculateTax(10000, "single");
        Assertions.assertEquals(1000.0, result, 0.001);
    }

    @Test
    public void testCalculateTax_SingleIncomeAboveThreshold() {
        double result = JavaAlgorithms.calculateTax(30000, "single");
        Assertions.assertEquals(4000.0, result, 0.001);
    }

    @Test
    public void testCalculateTax_SingleIncomeAboveUpperThreshold() {
        double result = JavaAlgorithms.calculateTax(50000, "single");
        Assertions.assertEquals(10500.0, result, 0.001);
    }

    @Test
    public void testCalculateTax_MarriedIncomeBelowThreshold() {
        double result = JavaAlgorithms.calculateTax(15000, "married");
        Assertions.assertEquals(1500.0, result, 0.001);
    }

    @Test
    public void testCalculateTax_MarriedIncomeAtThreshold() {
        double result = JavaAlgorithms.calculateTax(20000, "married");
        Assertions.assertEquals(2000.0, result, 0.001);
    }

    @Test
    public void testCalculateTax_MarriedIncomeAboveThreshold() {
        double result = JavaAlgorithms.calculateTax(60000, "married");
        Assertions.assertEquals(8000.0, result, 0.001);
    }

    @Test
    public void testCalculateTax_MarriedIncomeAboveUpperThreshold() {
        double result = JavaAlgorithms.calculateTax(100000, "married");
        Assertions.assertEquals(18500.0, result, 0.001);
    }

    @Test
    public void testCalculateTax_OtherStatusIncome() {
        double result = JavaAlgorithms.calculateTax(30000, "other");
        Assertions.assertEquals(6000.0, result, 0.001);
    }

    @Test
    public void testCalculateTax_NegativeIncome() {
        double result = JavaAlgorithms.calculateTax(-5000, "single");
        Assertions.assertEquals(0.0, result, 0.001);
    }

    @Test
    public void testCalculateTax_ZeroIncome() {
        double result = JavaAlgorithms.calculateTax(0, "single");
        Assertions.assertEquals(0.0, result, 0.001);
    }

    @Test
    public void testCalculateTax_IncomeWithNullStatus() {
        double result = JavaAlgorithms.calculateTax(30000, null);
        Assertions.assertEquals(6000.0, result, 0.001);
    }

    @Test
    public void testCalculateTax_IncomeWithEmptyStatus() {
        double result = JavaAlgorithms.calculateTax(30000, "");
        Assertions.assertEquals(6000.0, result, 0.001);
    }
}