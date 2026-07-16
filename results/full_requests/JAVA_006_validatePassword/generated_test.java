import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JavaAlgorithmsTest {

    @Test
    public void testValidatePassword_NullPassword() {
        assertFalse(JavaAlgorithms.validatePassword(null));
    }

    @Test
    public void testValidatePassword_TooShort() {
        assertFalse(JavaAlgorithms.validatePassword("Short1!"));
    }

    @Test
    public void testValidatePassword_NoUpperCase() {
        assertFalse(JavaAlgorithms.validatePassword("lowercase1!"));
    }

    @Test
    public void testValidatePassword_NoLowerCase() {
        assertFalse(JavaAlgorithms.validatePassword("UPPERCASE1!"));
    }

    @Test
    public void testValidatePassword_NoDigit() {
        assertFalse(JavaAlgorithms.validatePassword("NoDigit!"));
    }

    @Test
    public void testValidatePassword_NoSpecialCharacter() {
        assertFalse(JavaAlgorithms.validatePassword("NoSpecial1"));
    }

    @Test
    public void testValidatePassword_ValidPassword() {
        assertTrue(JavaAlgorithms.validatePassword("Valid1!"));
    }

    @Test
    public void testValidatePassword_OnlyUpperCase() {
        assertFalse(JavaAlgorithms.validatePassword("UPPERCASE!"));
    }

    @Test
    public void testValidatePassword_OnlyLowerCase() {
        assertFalse(JavaAlgorithms.validatePassword("lowercase!"));
    }

    @Test
    public void testValidatePassword_OnlyDigits() {
        assertFalse(JavaAlgorithms.validatePassword("12345678"));
    }

    @Test
    public void testValidatePassword_OnlySpecialCharacters() {
        assertFalse(JavaAlgorithms.validatePassword("!@#$%^&*"));
    }

    @Test
    public void testValidatePassword_ValidPasswordWithAllCharacters() {
        assertTrue(JavaAlgorithms.validatePassword("A1b!cdef"));
    }

    @Test
    public void testValidatePassword_ValidPasswordWithMultipleSpecialCharacters() {
        assertTrue(JavaAlgorithms.validatePassword("A1b!c@d#e$"));
    }

    @Test
    public void testValidatePassword_ValidPasswordWithSpaces() {
        assertTrue(JavaAlgorithms.validatePassword("A1b! cdef"));
    }

    @Test
    public void testValidatePassword_ValidPasswordWithDifferentSpecialCharacters() {
        assertTrue(JavaAlgorithms.validatePassword("A1b-c_d+e"));
    }
}