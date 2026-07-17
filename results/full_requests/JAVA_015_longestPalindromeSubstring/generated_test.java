import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class JAVA_015_longestPalindromeSubstringTest {
    @Test void handlesMissingInput() { assertEquals("",JavaAlgorithms.longestPalindromeSubstring(null)); assertEquals("",JavaAlgorithms.longestPalindromeSubstring("")); }
    @Test void findsOddPalindrome() { String out=JavaAlgorithms.longestPalindromeSubstring("babad"); assertTrue(out.equals("bab")||out.equals("aba")); }
    @Test void findsEvenAndSinglePalindromes() { assertEquals("bb",JavaAlgorithms.longestPalindromeSubstring("cbbd")); assertEquals("a",JavaAlgorithms.longestPalindromeSubstring("abc")); }
}
