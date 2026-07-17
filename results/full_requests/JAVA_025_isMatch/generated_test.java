import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class JAVA_025_isMatchTest {
    @Test void handlesNullAndEmptyPatterns() { assertFalse(JavaAlgorithms.isMatch(null,"a")); assertFalse(JavaAlgorithms.isMatch("a",null)); assertTrue(JavaAlgorithms.isMatch("","")); assertFalse(JavaAlgorithms.isMatch("a","")); }
    @Test void supportsExactDotAndStarMatching() { assertTrue(JavaAlgorithms.isMatch("abc","abc")); assertTrue(JavaAlgorithms.isMatch("abc","a.c")); assertTrue(JavaAlgorithms.isMatch("aa","a*")); assertTrue(JavaAlgorithms.isMatch("ab",".*")); }
    @Test void rejectsNonMatches() { assertFalse(JavaAlgorithms.isMatch("aa","a")); assertFalse(JavaAlgorithms.isMatch("mississippi","mis*is*p*.")); }
}
