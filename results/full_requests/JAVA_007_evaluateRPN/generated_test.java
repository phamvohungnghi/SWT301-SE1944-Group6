import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

public class JavaAlgorithmsTest {

    @Test
    public void testEvaluateRPN_NullExpression() {
        assertEquals(0, JavaAlgorithms.evaluateRPN(null));
    }

    @Test
    public void testEvaluateRPN_EmptyExpression() {
        assertEquals(0, JavaAlgorithms.evaluateRPN(""));
    }

    @Test
    public void testEvaluateRPN_SingleNumber() {
        assertEquals(5, JavaAlgorithms.evaluateRPN("5"));
        assertEquals(-3, JavaAlgorithms.evaluateRPN("-3"));
    }

    @Test
    public void testEvaluateRPN_Addition() {
        assertEquals(7, JavaAlgorithms.evaluateRPN("3 4 +"));
        assertEquals(0, JavaAlgorithms.evaluateRPN("3 -3 +"));
    }

    @Test
    public void testEvaluateRPN_Subtraction() {
        assertEquals(1, JavaAlgorithms.evaluateRPN("4 3 -"));
        assertEquals(-1, JavaAlgorithms.evaluateRPN("3 4 -"));
    }

    @Test
    public void testEvaluateRPN_Multiplication() {
        assertEquals(12, JavaAlgorithms.evaluateRPN("3 4 *"));
        assertEquals(0, JavaAlgorithms.evaluateRPN("0 4 *"));
    }

    @Test
    public void testEvaluateRPN_Division() {
        assertEquals(2, JavaAlgorithms.evaluateRPN("8 4 /"));
        assertEquals(0, JavaAlgorithms.evaluateRPN("4 0 /"));
    }

    @Test
    public void testEvaluateRPN_ComplexExpression() {
        assertEquals(14, JavaAlgorithms.evaluateRPN("2 3 + 4 *"));
        assertEquals(1, JavaAlgorithms.evaluateRPN("10 2 5 / +"));
    }

    @Test
    public void testEvaluateRPN_InvalidToken() {
        assertEquals(0, JavaAlgorithms.evaluateRPN("3 4 + invalid"));
        assertEquals(0, JavaAlgorithms.evaluateRPN("3 4 + 5 invalid *"));
    }

    @Test
    public void testEvaluateRPN_InsufficientOperands() {
        assertEquals(0, JavaAlgorithms.evaluateRPN("+"));
        assertEquals(0, JavaAlgorithms.evaluateRPN("3 +"));
        assertEquals(0, JavaAlgorithms.evaluateRPN("3 4 + -"));
    }

    @Test
    public void testEvaluateRPN_MultipleOperators() {
        assertEquals(1, JavaAlgorithms.evaluateRPN("3 4 + 2 -"));
        assertEquals(0, JavaAlgorithms.evaluateRPN("3 4 + 2 - 5 +"));
    }

    @Test
    public void testEvaluateRPN_OnlyOperators() {
        assertEquals(0, JavaAlgorithms.evaluateRPN("+ - * /"));
    }
}