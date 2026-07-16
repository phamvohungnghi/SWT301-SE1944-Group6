import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JavaAlgorithmsTest {

    @Test
    public void testIsMatch() {
        // Test cases for isMatch function

        // Test with exact match
        assertTrue(JavaAlgorithms.isMatch("abc", "abc"));
        
        // Test with single character wildcard
        assertTrue(JavaAlgorithms.isMatch("a", "."));
        assertFalse(JavaAlgorithms.isMatch("b", "."));
        
        // Test with multiple character wildcard
        assertTrue(JavaAlgorithms.isMatch("aa", "a*"));
        assertTrue(JavaAlgorithms.isMatch("ab", ".*"));
        assertFalse(JavaAlgorithms.isMatch("a", ".*b"));
        
        // Test with empty pattern
        assertTrue(JavaAlgorithms.isMatch("", ""));
        assertFalse(JavaAlgorithms.isMatch("a", ""));
        
        // Test with pattern that has a star
        assertTrue(JavaAlgorithms.isMatch("aab", "c*a*b"));
        assertFalse(JavaAlgorithms.isMatch("mississippi", "mis*is*p*."));
        
        // Test with null inputs
        assertFalse(JavaAlgorithms.isMatch(null, "a"));
        assertFalse(JavaAlgorithms.isMatch("a", null));
        assertFalse(JavaAlgorithms.isMatch(null, null));
        
        // Test with pattern that matches empty string
        assertTrue(JavaAlgorithms.isMatch("abc", ".*"));
        assertTrue(JavaAlgorithms.isMatch("", ".*"));
        
        // Test with complex patterns
        assertTrue(JavaAlgorithms.isMatch("ab", ".*"));
        assertTrue(JavaAlgorithms.isMatch("aab", "c*a*b"));
        assertFalse(JavaAlgorithms.isMatch("mississippi", "mis*is*p*."));
        
        // Test with single character and star
        assertTrue(JavaAlgorithms.isMatch("a", "a*"));
        assertTrue(JavaAlgorithms.isMatch("aa", "a*"));
        assertTrue(JavaAlgorithms.isMatch("aaa", "a*"));
        assertFalse(JavaAlgorithms.isMatch("a", "b*"));
        
        // Test with patterns that should not match
        assertFalse(JavaAlgorithms.isMatch("abc", "a.c"));
        assertFalse(JavaAlgorithms.isMatch("abc", "a*b*c"));
    }
}