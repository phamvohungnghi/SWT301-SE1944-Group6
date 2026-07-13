import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorsTest {

    @Test
    void testFindPrimeFactors_Zero() {
        List<Integer> result = JAVA_018_findPrimeFactors.findPrimeFactors(0);
        assertTrue(result.isEmpty(), "Expected empty list for input 0");
    }

    @Test
    void testFindPrimeFactors_One() {
        List<Integer> result = JAVA_018_findPrimeFactors.findPrimeFactors(1);
        assertTrue(result.isEmpty(), "Expected empty list for input 1");
    }

    @Test
    void testFindPrimeFactors_PrimeNumber() {
        List<Integer> result = JAVA_018_findPrimeFactors.findPrimeFactors(13);
        assertEquals(List.of(13), result, "Expected list containing the prime number itself");
    }

    @Test
    void testFindPrimeFactors_SmallComposite() {
        List<Integer> result = JAVA_018_findPrimeFactors.findPrimeFactors(12);
        assertEquals(List.of(2, 2, 3), result, "Expected prime factors for 12");
    }

    @Test
    void testFindPrimeFactors_LargeComposite() {
        List<Integer> result = JAVA_018_findPrimeFactors.findPrimeFactors(100);
        assertEquals(List.of(2, 2, 5, 5), result, "Expected prime factors for 100");
    }

    @Test
    void testFindPrimeFactors_PerfectSquare() {
        List<Integer> result = JAVA_018_findPrimeFactors.findPrimeFactors(36);
        assertEquals(List.of(2, 2, 3, 3), result, "Expected prime factors for 36");
    }

    @Test
    void testFindPrimeFactors_LargePrime() {
        List<Integer> result = JAVA_018_findPrimeFactors.findPrimeFactors(97);
        assertEquals(List.of(97), result, "Expected list containing the large prime number itself");
    }

    @Test
    void testFindPrimeFactors_ProductOfPrimes() {
        List<Integer> result = JAVA_018_findPrimeFactors.findPrimeFactors(15);
        assertEquals(List.of(3, 5), result, "Expected prime factors for 15");
    }

    @Test
    void testFindPrimeFactors_Two() {
        List<Integer> result = JAVA_018_findPrimeFactors.findPrimeFactors(2);
        assertEquals(List.of(2), result, "Expected list containing the prime number 2");
    }

    @Test
    void testFindPrimeFactors_CompositeWithMultipleFactors() {
        List<Integer> result = JAVA_018_findPrimeFactors.findPrimeFactors(60);
        assertEquals(List.of(2, 2, 3, 5), result, "Expected prime factors for 60");
    }
}