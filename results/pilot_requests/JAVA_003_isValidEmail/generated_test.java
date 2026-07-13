import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmailValidatorTest {

    @Test
    public void testNullEmail() {
        assertFalse(JAVA_003_isValidEmail.isValidEmail(null));
    }

    @Test
    public void testMissingAtSymbol() {
        assertFalse(JAVA_003_isValidEmail.isValidEmail("testemail.com"));
    }

    @Test
    public void testMissingDot() {
        assertFalse(JAVA_003_isValidEmail.isValidEmail("test@emailcom"));
    }

    @Test
    public void testMultipleAtSymbols() {
        assertFalse(JAVA_003_isValidEmail.isValidEmail("test@@email.com"));
    }

    @Test
    public void testEmptyLocalPart() {
        assertFalse(JAVA_003_isValidEmail.isValidEmail("@domain.com"));
    }

    @Test
    public void testEmptyDomainPart() {
        assertFalse(JAVA_003_isValidEmail.isValidEmail("local@.com"));
    }

    @Test
    public void testDomainStartsWithDot() {
        assertFalse(JAVA_003_isValidEmail.isValidEmail("local@domain.com."));
    }

    @Test
    public void testDomainEndsWithDot() {
        assertFalse(JAVA_003_isValidEmail.isValidEmail("local@.domain.com"));
    }

    @Test
    public void testValidEmail() {
        assertTrue(JAVA_003_isValidEmail.isValidEmail("test.email@example.com"));
    }

    @Test
    public void testValidEmailWithUnderscore() {
        assertTrue(JAVA_003_isValidEmail.isValidEmail("test_email@example.com"));
    }

    @Test
    public void testValidEmailWithHyphen() {
        assertTrue(JAVA_003_isValidEmail.isValidEmail("test-email@example.com"));
    }

    @Test
    public void testInvalidCharacterInLocalPart() {
        assertFalse(JAVA_003_isValidEmail.isValidEmail("test#email@example.com"));
    }

    @Test
    public void testValidEmailWithSubdomain() {
        assertTrue(JAVA_003_isValidEmail.isValidEmail("test@sub.domain.com"));
    }

    @Test
    public void testValidEmailWithNumbers() {
        assertTrue(JAVA_003_isValidEmail.isValidEmail("test123@example.com"));
    }

    @Test
    public void testLocalPartWithConsecutiveDots() {
        assertFalse(JAVA_003_isValidEmail.isValidEmail("test..email@example.com"));
    }
}