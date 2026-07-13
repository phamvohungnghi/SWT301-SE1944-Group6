import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IntToRomanTest {

    @Test
    void testZero() {
        assertEquals("", JAVA_014_intToRoman.intToRoman(0), "Expected empty string for input 0");
    }

    @Test
    void testNegative() {
        assertEquals("", JAVA_014_intToRoman.intToRoman(-1), "Expected empty string for negative input");
    }

    @Test
    void testAboveMax() {
        assertEquals("", JAVA_014_intToRoman.intToRoman(4000), "Expected empty string for input above 3999");
    }

    @Test
    void testOne() {
        assertEquals("I", JAVA_014_intToRoman.intToRoman(1), "Expected 'I' for input 1");
    }

    @Test
    void testFour() {
        assertEquals("IV", JAVA_014_intToRoman.intToRoman(4), "Expected 'IV' for input 4");
    }

    @Test
    void testFive() {
        assertEquals("V", JAVA_014_intToRoman.intToRoman(5), "Expected 'V' for input 5");
    }

    @Test
    void testNine() {
        assertEquals("IX", JAVA_014_intToRoman.intToRoman(9), "Expected 'IX' for input 9");
    }

    @Test
    void testTen() {
        assertEquals("X", JAVA_014_intToRoman.intToRoman(10), "Expected 'X' for input 10");
    }

    @Test
    void testForty() {
        assertEquals("XL", JAVA_014_intToRoman.intToRoman(40), "Expected 'XL' for input 40");
    }

    @Test
    void testFifty() {
        assertEquals("L", JAVA_014_intToRoman.intToRoman(50), "Expected 'L' for input 50");
    }

    @Test
    void testNinety() {
        assertEquals("XC", JAVA_014_intToRoman.intToRoman(90), "Expected 'XC' for input 90");
    }

    @Test
    void testFourHundred() {
        assertEquals("CD", JAVA_014_intToRoman.intToRoman(400), "Expected 'CD' for input 400");
    }

    @Test
    void testFiveHundred() {
        assertEquals("D", JAVA_014_intToRoman.intToRoman(500), "Expected 'D' for input 500");
    }

    @Test
    void testNineHundred() {
        assertEquals("CM", JAVA_014_intToRoman.intToRoman(900), "Expected 'CM' for input 900");
    }

    @Test
    void testOneThousand() {
        assertEquals("M", JAVA_014_intToRoman.intToRoman(1000), "Expected 'M' for input 1000");
    }

    @Test
    void testMixedValues() {
        assertEquals("MCMXCIV", JAVA_014_intToRoman.intToRoman(1994), "Expected 'MCMXCIV' for input 1994");
    }

    @Test
    void testThreeThousand() {
        assertEquals("MMM", JAVA_014_intToRoman.intToRoman(3000), "Expected 'MMM' for input 3000");
    }

    @Test
    void testThreeThousandNineHundredNinetyNine() {
        assertEquals("MMMCMXCIX", JAVA_014_intToRoman.intToRoman(3999), "Expected 'MMMCMXCIX' for input 3999");
    }
}