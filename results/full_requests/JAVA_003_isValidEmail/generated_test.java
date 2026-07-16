import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmailValidatorTest {

    @BeforeEach
    public void setUp() {
        // No setup needed for this test suite
    }

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
        assertFalse(JavaAlgorithms.isValidEmail("test@ex#ample.com"));
        assertFalse(JavaAlgorithms.isValidEmail("test@ex$ample.com"));
    }

    @Test
    public void testInvalidEmail_ValidCharactersButNoDotInDomain() {
        assertFalse(JavaAlgorithms.isValidEmail("test@examplecom"));
    }

    @Test
    public void testInvalidEmail_ValidLocalPartButNoDomain() {
        assertFalse(JavaAlgorithms.isValidEmail("test@"));
    }
}