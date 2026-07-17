import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class JAVA_019_luhnCheckTest {
    @Test void rejectsMissingAndNonDigits() { assertFalse(JavaAlgorithms.luhnCheck(null)); assertFalse(JavaAlgorithms.luhnCheck("")); assertFalse(JavaAlgorithms.luhnCheck("4111-1111")); }
    @Test void validatesKnownNumbers() { assertTrue(JavaAlgorithms.luhnCheck("4532015112830366")); assertFalse(JavaAlgorithms.luhnCheck("4532015112830367")); }
}
