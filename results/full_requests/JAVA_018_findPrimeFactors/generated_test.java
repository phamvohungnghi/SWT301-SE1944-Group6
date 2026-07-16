import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JavaAlgorithmsTest {

    @BeforeEach
    public void setUp() {
        // Any setup can be done here if needed
    }

    @Test
    public void testFindPrimeFactors_Zero() {
        List<Integer> result = JavaAlgorithms.findPrimeFactors(0);
        assertTrue(result.isEmpty(), "Expected empty list for input 0");
    }

    @Test
    public void testFindPrimeFactors_One() {
        List<Integer> result = JavaAlgorithms.findPrimeFactors(1);
        assertTrue(result.isEmpty(), "Expected empty list for input 1");
    }

    @Test
    public void testFindPrimeFactors_Two() {
        List<Integer> result = JavaAlgorithms.findPrimeFactors(2);
        assertEquals(List.of(2), result, "Expected [2] for input 2");
    }

    @Test
    public void testFindPrimeFactors_Three() {
        List<Integer> result = JavaAlgorithms.findPrimeFactors(3);
        assertEquals(List.of(3), result, "Expected [3] for input 3");
    }

    @Test
    public void testFindPrimeFactors_Four() {
        List<Integer> result = JavaAlgorithms.findPrimeFactors(4);
        assertEquals(List.of(2, 2), result, "Expected [2, 2] for input 4");
    }

    @Test
    public void testFindPrimeFactors_Six() {
        List<Integer> result = JavaAlgorithms.findPrimeFactors(6);
        assertEquals(List.of(2, 3), result, "Expected [2, 3] for input 6");
    }

    @Test
    public void testFindPrimeFactors_Nine() {
        List<Integer> result = JavaAlgorithms.findPrimeFactors(9);
        assertEquals(List.of(3, 3), result, "Expected [3, 3] for input 9");
    }

    @Test
    public void testFindPrimeFactors_Twelve() {
        List<Integer> result = JavaAlgorithms.findPrimeFactors(12);
        assertEquals(List.of(2, 2, 3), result, "Expected [2, 2, 3] for input 12");
    }

    @Test
    public void testFindPrimeFactors_Thirty() {
        List<Integer> result = JavaAlgorithms.findPrimeFactors(30);
        assertEquals(List.of(2, 3, 5), result, "Expected [2, 3, 5] for input 30");
    }

    @Test
    public void testFindPrimeFactors_PrimeNumber() {
        List<Integer> result = JavaAlgorithms.findPrimeFactors(29);
        assertEquals(List.of(29), result, "Expected [29] for input 29");
    }

    @Test
    public void testFindPrimeFactors_LargeNumber() {
        List<Integer> result = JavaAlgorithms.findPrimeFactors(100);
        assertEquals(List.of(2, 2, 5, 5), result, "Expected [2, 2, 5, 5] for input 100");
    }

    @Test
    public void testFindPrimeFactors_LargePrime() {
        List<Integer> result = JavaAlgorithms.findPrimeFactors(997);
        assertEquals(List.of(997), result, "Expected [997] for input 997");
    }
}