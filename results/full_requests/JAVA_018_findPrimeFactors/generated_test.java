import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.ArrayList;

public class JAVA_018_findPrimeFactorsTest {

    @Test
    public void testNegativeNumber() {
        // Negative numbers should return an empty list
        assertEquals(new ArrayList<>(), JAVA_018_findPrimeFactors.findPrimeFactors(-10));
    }

    @Test
    public void testZero() {
        // Zero should return an empty list
        assertEquals(new ArrayList<>(), JAVA_018_findPrimeFactors.findPrimeFactors(0));
    }

    @Test
    public void testOne() {
        // One should return an empty list
        assertEquals(new ArrayList<>(), JAVA_018_findPrimeFactors.findPrimeFactors(1));
    }

    @Test
    public void testPrimeNumber() {
        // Prime number should return itself as the only factor
        assertEquals(List.of(7), JAVA_018_findPrimeFactors.findPrimeFactors(7));
    }

    @Test
    public void testPowerOfTwo() {
        // Power of two should return multiple 2s
        assertEquals(List.of(2, 2, 2), JAVA_018_findPrimeFactors.findPrimeFactors(8));
    }

    @Test
    public void testCompositeNumber() {
        // Composite number should return all prime factors
        assertEquals(List.of(2, 3, 3, 5), JAVA_018_findPrimeFactors.findPrimeFactors(90));
    }

    @Test
    public void testLargePrimeNumber() {
        // Large prime number should return itself
        assertEquals(List.of(101), JAVA_018_findPrimeFactors.findPrimeFactors(101));
    }

    @Test
    public void testLargeCompositeNumber() {
        // Large composite number should return all prime factors
        assertEquals(List.of(2, 2, 2, 7, 7, 11), JAVA_018_findPrimeFactors.findPrimeFactors(4312));
    }

    @Test
    public void testSquareOfPrime() {
        // Square of a prime number should return the prime number twice
        assertEquals(List.of(13, 13), JAVA_018_findPrimeFactors.findPrimeFactors(169));
    }

    @Test
    public void testProductOfTwoPrimes() {
        // Product of two primes should return both primes
        assertEquals(List.of(11, 17), JAVA_018_findPrimeFactors.findPrimeFactors(187));
    }

    @Test
    public void testNumberWithMultiplePrimeFactors() {
        // Number with multiple prime factors should return all factors
        assertEquals(List.of(2, 2, 3, 5, 7), JAVA_018_findPrimeFactors.findPrimeFactors(420));
    }

    @Test
    public void testVeryLargeNumber() {
        // Very large number to test performance and correctness
        assertEquals(List.of(2, 2, 2, 2, 2, 3, 3, 5, 7, 11, 13), JAVA_018_findPrimeFactors.findPrimeFactors(55440));
    }
}