import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class JAVA_006_validatePasswordTest {
    @Test void acceptsCompletePassword() { assertTrue(JavaAlgorithms.validatePassword("Abcdef1!")); }
    @Test void rejectsNullAndShort() { assertFalse(JavaAlgorithms.validatePassword(null)); assertFalse(JavaAlgorithms.validatePassword("Aa1!")); }
    @Test void requiresEveryCategory() { assertFalse(JavaAlgorithms.validatePassword("abcdef1!")); assertFalse(JavaAlgorithms.validatePassword("ABCDEF1!")); assertFalse(JavaAlgorithms.validatePassword("Abcdefg!")); assertFalse(JavaAlgorithms.validatePassword("Abcdef12")); }
}
