import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmailValidatorTest {

    @Test
    public void testValidEmail() {
        assertTrue(JavaAlgorithms.isValidEmail("test@example.com"));
        assertTrue(JavaAlgorithms.isValidEmail("user.name+tag+sorting@example.com"));
        assertTrue(JavaAlgorithms.isValidEmail("user_name@example.co.uk"));
        assertTrue(JavaAlgorithms.isValidEmail("user-name@example.com"));
    }

    @Test
    public void testInvalidEmail_Null() {
        assertFalse(JavaAlgorithms.isValidEmail(null));
    }

    @Test
    public void testInvalidEmail_NoAtSymbol() {
        assertFalse(JavaAlgorithms.isValidEmail("testexample.com"));
    }

    @Test
    public void testInvalidEmail_NoDomain() {
        assertFalse(JavaAlgorithms.isValidEmail("test@.com"));
        assertFalse(JavaAlgorithms.isValidEmail("test@com"));
    }

    @Test
    public void testInvalidEmail_EmptyLocalPart() {
        assertFalse(JavaAlgorithms.isValidEmail("@example.com"));
    }

    @Test
    public void testInvalidEmail_EmptyDomainPart() {
        assertFalse(JavaAlgorithms.isValidEmail("test@"));
    }

    @Test
    public void testInvalidEmail_MultipleAtSymbols() {
        assertFalse(JavaAlgorithms.isValidEmail("test@@example.com"));
    }

    @Test
    public void testInvalidEmail_DomainStartsWithDot() {
        assertFalse(JavaAlgorithms.isValidEmail("test@.example.com"));
    }

    @Test
    public void testInvalidEmail_DomainEndsWithDot() {
        assertFalse(JavaAlgorithms.isValidEmail("test@example.com."));
    }

    @Test
    public void testInvalidEmail_InvalidCharactersInLocalPart() {
        assertFalse(JavaAlgorithms.isValidEmail("test@exa!mple.com"));
        assertFalse(JavaAlgorithms.isValidEmail("test@exa#mple.com"));
        assertFalse(JavaAlgorithms.isValidEmail("test@exa$mple.com"));
    }

    @Test
    public void testInvalidEmail_ValidCharactersInLocalPart() {
        assertTrue(JavaAlgorithms.isValidEmail("test.email@example.com"));
        assertTrue(JavaAlgorithms.isValidEmail("test_email@example.com"));
        assertTrue(JavaAlgorithms.isValidEmail("test-email@example.com"));
    }

    @Test
    public void testInvalidEmail_SingleCharacterLocalPart() {
        assertTrue(JavaAlgorithms.isValidEmail("a@b.com"));
        assertFalse(JavaAlgorithms.isValidEmail("@b.com"));
    }

    @Test
    public void testInvalidEmail_SingleCharacterDomainPart() {
        assertFalse(JavaAlgorithms.isValidEmail("test@b"));
    }
}