import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EvaluateRPNTest {

    @Test
    public void testNullExpression() {
        assertEquals(0, JAVA_007_evaluateRPN(null));
    }

    @Test
    public void testEmptyExpression() {
        assertEquals(0, JAVA_007_evaluateRPN(""));
    }

    @Test
    public void testSingleNumber() {
        assertEquals(5, JAVA_007_evaluateRPN("5"));
    }

    @Test
    public void testSimpleAddition() {
        assertEquals(7, JAVA_007_evaluateRPN("3 4 +"));
    }

    @Test
    public void testSimpleSubtraction() {
        assertEquals(-1, JAVA_007_evaluateRPN("3 4 -"));
    }

    @Test
    public void testSimpleMultiplication() {
        assertEquals(12, JAVA_007_evaluateRPN("3 4 *"));
    }

    @Test
    public void testSimpleDivision() {
        assertEquals(2, JAVA_007_evaluateRPN("8 4 /"));
    }

    @Test
    public void testDivisionByZero() {
        assertEquals(0, JAVA_007_evaluateRPN("8 0 /"));
    }

    @Test
    public void testInvalidToken() {
        assertEquals(0, JAVA_007_evaluateRPN("3 4 + x"));
    }

    @Test
    public void testInsufficientOperandsForOperator() {
        assertEquals(0, JAVA_007_evaluateRPN("+"));
        assertEquals(0, JAVA_007_evaluateRPN("3 +"));
    }

    @Test
    public void testMultipleOperators() {
        assertEquals(9, JAVA_007_evaluateRPN("2 3 + 4 *"));
    }

    @Test
    public void testComplexExpression() {
        assertEquals(14, JAVA_007_evaluateRPN("5 1 2 + 4 * + 3 -"));
    }

    @Test
    public void testExtraOperands() {
        assertEquals(0, JAVA_007_evaluateRPN("3 4 5 +"));
    }

    @Test
    public void testNegativeNumbers() {
        assertEquals(-7, JAVA_007_evaluateRPN("-3 -4 +"));
    }

    @Test
    public void testMixedPositiveAndNegativeNumbers() {
        assertEquals(-1, JAVA_007_evaluateRPN("3 -4 +"));
    }

    @Test
    public void testZeroOperands() {
        assertEquals(0, JAVA_007_evaluateRPN("0 0 +"));
    }
}