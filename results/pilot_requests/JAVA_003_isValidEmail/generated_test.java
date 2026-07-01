import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmailValidatorTest {

    @Test
    void testValidEmail() {
        assertTrue(JAVA_003_isValidEmail("user@example.com"));
        assertTrue(JAVA_003_isValidEmail("user.name@example.com"));
        assertTrue(JAVA_003_isValidEmail("user_name@example.com"));
        assertTrue(JAVA_003_isValidEmail("user-name@example.com"));
        assertTrue(JAVA_003_isValidEmail("user123@example.com"));
    }

    @Test
    void testInvalidEmailNull() {
        assertFalse(JAVA_003_isValidEmail(null));
    }

    @Test
    void testInvalidEmailNoAtSymbol() {
        assertFalse(JAVA_003_isValidEmail("userexample.com"));
    }

    @Test
    void testInvalidEmailNoDot() {
        assertFalse(JAVA_003_isValidEmail("user@examplecom"));
    }

    @Test
    void testInvalidEmailMultipleAtSymbols() {
        assertFalse(JAVA_003_isValidEmail("user@@example.com"));
    }

    @Test
    void testInvalidEmailEmptyLocalPart() {
        assertFalse(JAVA_003_isValidEmail("@example.com"));
    }

    @Test
    void testInvalidEmailEmptyDomainPart() {
        assertFalse(JAVA_003_isValidEmail("user@"));
    }

    @Test
    void testInvalidEmailDomainStartsWithDot() {
        assertFalse(JAVA_003_isValidEmail("user@.example.com"));
    }

    @Test
    void testInvalidEmailDomainEndsWithDot() {
        assertFalse(JAVA_003_isValidEmail("user@example.com."));
    }

    @Test
    void testInvalidEmailLocalPartContainsInvalidCharacters() {
        assertFalse(JAVA_003_isValidEmail("user!@example.com"));
        assertFalse(JAVA_003_isValidEmail("user#@example.com"));
        assertFalse(JAVA_003_isValidEmail("user$@example.com"));
        assertFalse(JAVA_003_isValidEmail("user%@example.com"));
    }

    @Test
    void testBoundaryCases() {
        assertTrue(JAVA_003_isValidEmail("u@e.co"));
        assertFalse(JAVA_003_isValidEmail("u@e.c"));
        assertFalse(JAVA_003_isValidEmail("u@e."));
        assertFalse(JAVA_003_isValidEmail("u@.co"));
    }
}