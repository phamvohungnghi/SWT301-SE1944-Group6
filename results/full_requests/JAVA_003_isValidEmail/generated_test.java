import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IsValidEmailTest {

    @Test
    public void testNullEmail() {
        assertFalse(JAVA_003_isValidEmail.isValidEmail(null));
    }

    @Test
    public void testEmptyEmail() {
        assertFalse(JAVA_003_isValidEmail.isValidEmail(""));
    }

    @Test
    public void testEmailWithoutAtSymbol() {
        assertFalse(JAVA_003_isValidEmail.isValidEmail("example.com"));
    }

    @Test
    public void testEmailWithoutDot() {
        assertFalse(JAVA_003_isValidEmail.isValidEmail("example@com"));
    }

    @Test
    public void testEmailWithMultipleAtSymbols() {
        assertFalse(JAVA_003_isValidEmail.isValidEmail("example@@domain.com"));
    }

    @Test
    public void testEmailWithEmptyLocalPart() {
        assertFalse(JAVA_003_isValidEmail.isValidEmail("@domain.com"));
    }

    @Test
    public void testEmailWithEmptyDomainPart() {
        assertFalse(JAVA_003_isValidEmail.isValidEmail("example@"));
    }

    @Test
    public void testEmailWithDomainStartingWithDot() {
        assertFalse(JAVA_003_isValidEmail.isValidEmail("example@.domain.com"));
    }

    @Test
    public void testEmailWithDomainEndingWithDot() {
        assertFalse(JAVA_003_isValidEmail.isValidEmail("example@domain.com."));
    }

    @Test
    public void testEmailWithInvalidCharactersInLocalPart() {
        assertFalse(JAVA_003_isValidEmail.isValidEmail("exa!mple@domain.com"));
    }

    @Test
    public void testValidEmail() {
        assertTrue(JAVA_003_isValidEmail.isValidEmail("example@domain.com"));
    }

    @Test
    public void testValidEmailWithSubdomain() {
        assertTrue(JAVA_003_isValidEmail.isValidEmail("example@sub.domain.com"));
    }

    @Test
    public void testValidEmailWithAllowedSpecialCharactersInLocalPart() {
        assertTrue(JAVA_003_isValidEmail.isValidEmail("exa-mple_123@domain.com"));
    }

    @Test
    public void testEmailWithOnlyAtSymbol() {
        assertFalse(JAVA_003_isValidEmail.isValidEmail("@"));
    }

    @Test
    public void testEmailWithOnlyDot() {
        assertFalse(JAVA_003_isValidEmail.isValidEmail("."));
    }

    @Test
    public void testEmailWithAtAndDotButNoLocalPart() {
        assertFalse(JAVA_003_isValidEmail.isValidEmail("@.com"));
    }

    @Test
    public void testEmailWithAtAndDotButNoDomainPart() {
        assertFalse(JAVA_003_isValidEmail.isValidEmail("example@."));
    }

    @Test
    public void testEmailWithMultipleDotsInDomain() {
        assertTrue(JAVA_003_isValidEmail.isValidEmail("example@domain.co.uk"));
    }

    @Test
    public void testEmailWithMultipleDotsInLocalPart() {
        assertTrue(JAVA_003_isValidEmail.isValidEmail("exa.mple@domain.com"));
    }
}