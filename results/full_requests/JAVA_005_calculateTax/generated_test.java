import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class JAVA_005_calculateTaxTest {
    @Test void handlesNonPositiveIncome() { assertEquals(0.0,JavaAlgorithms.calculateTax(0,"single")); assertEquals(0.0,JavaAlgorithms.calculateTax(-1,"married")); }
    @Test void coversSingleBrackets() { assertEquals(1000.0,JavaAlgorithms.calculateTax(10000,"single")); assertEquals(2500.0,JavaAlgorithms.calculateTax(20000,"SINGLE")); assertEquals(8000.0,JavaAlgorithms.calculateTax(50000,"single")); }
    @Test void coversMarriedAndFallbackBrackets() { assertEquals(2000.0,JavaAlgorithms.calculateTax(20000,"married")); assertEquals(5000.0,JavaAlgorithms.calculateTax(40000,"married")); assertEquals(13500.0,JavaAlgorithms.calculateTax(90000,"married")); assertEquals(2000.0,JavaAlgorithms.calculateTax(10000,"other")); }
}
