import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EvaluateRPNTest {

    @Test
    void testNullExpression() {
        assertEquals(0, evaluateRPN(null));
    }

    @Test
    void testEmptyExpression() {
        assertEquals(0, evaluateRPN(""));
    }

    @Test
    void testSingleNumber() {
        assertEquals(5, evaluateRPN("5"));
    }

    @Test
    void testAddition() {
        assertEquals(7, evaluateRPN("2 5 +"));
    }

    @Test
    void testSubtraction() {
        assertEquals(3, evaluateRPN("5 2 -"));
    }

    @Test
    void testMultiplication() {
        assertEquals(10, evaluateRPN("2 5 *"));
    }

    @Test
    void testDivision() {
        assertEquals(2, evaluateRPN("6 3 /"));
    }

    @Test
    void testDivisionByZero() {
        assertEquals(0, evaluateRPN("6 0 /"));
    }

    @Test
    void testInsufficientOperands() {
        assertEquals(0, evaluateRPN("+"));
        assertEquals(0, evaluateRPN("1 +"));
    }

    @Test
    void testInvalidNumber() {
        assertEquals(0, evaluateRPN("2 a +"));
    }

    @Test
    void testMultipleOperations() {
        assertEquals(1, evaluateRPN("3 4 + 2 -"));
        assertEquals(14, evaluateRPN("2 3 4 * +"));
        assertEquals(1, evaluateRPN("4 2 / 1 +"));
    }

    @Test
    void testExtraOperands() {
        assertEquals(0, evaluateRPN("2 3 + 4"));
    }

    @Test
    void testNegativeResult() {
        assertEquals(-1, evaluateRPN("2 3 -"));
    }

    @Test
    void testComplexExpression() {
        assertEquals(6, evaluateRPN("2 3 + 1 - 4 *"));
    }
}