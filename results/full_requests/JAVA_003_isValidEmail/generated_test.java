import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class JAVA_003_isValidEmailTest {
    @Test void acceptsSupportedAddress() { assertTrue(JavaAlgorithms.isValidEmail("first.last_1-test@example.co")); }
    @Test void rejectsMissingStructure() { assertFalse(JavaAlgorithms.isValidEmail(null)); assertFalse(JavaAlgorithms.isValidEmail("abc")); assertFalse(JavaAlgorithms.isValidEmail("a@b")); assertFalse(JavaAlgorithms.isValidEmail("@b.com")); }
    @Test void rejectsBadDomainAndCharacters() { assertFalse(JavaAlgorithms.isValidEmail("a@.com")); assertFalse(JavaAlgorithms.isValidEmail("a@com.")); assertFalse(JavaAlgorithms.isValidEmail("a+b@example.com")); assertFalse(JavaAlgorithms.isValidEmail("a@@example.com")); }
}
