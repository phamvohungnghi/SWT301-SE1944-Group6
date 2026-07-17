import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class JAVA_018_findPrimeFactorsTest {
    @Test void rejectsSmallInput() { assertTrue(JavaAlgorithms.findPrimeFactors(1).isEmpty()); assertTrue(JavaAlgorithms.findPrimeFactors(-3).isEmpty()); }
    @Test void factorsCompositeAndPrimeNumbers() { assertEquals(List.of(2,2,3,7),JavaAlgorithms.findPrimeFactors(84)); assertEquals(List.of(13),JavaAlgorithms.findPrimeFactors(13)); }
}
