import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void testNullPassword() {
        assertFalse(validatePassword(null), "Password should be invalid when null");
    }

    @Test
    void testEmptyPassword() {
        assertFalse(validatePassword(""), "Password should be invalid when empty");
    }

    @Test
    void testShortPassword() {
        assertFalse(validatePassword("Short1!"), "Password should be invalid if less than 8 characters");
    }

    @Test
    void testValidPassword() {
        assertTrue(validatePassword("Valid1!"), "Password should be valid with upper, lower, digit, and special character");
    }

    @Test
    void testMissingUppercase() {
        assertFalse(validatePassword("missingupper1!"), "Password should be invalid if missing uppercase letter");
    }

    @Test
    void testMissingLowercase() {
        assertFalse(validatePassword("MISSINGLOWER1!"), "Password should be invalid if missing lowercase letter");
    }

    @Test
    void testMissingDigit() {
        assertFalse(validatePassword("MissingSpecial!"), "Password should be invalid if missing digit");
    }

    @Test
    void testMissingSpecial() {
        assertFalse(validatePassword("Missing1Upper"), "Password should be invalid if missing special character");
    }

    @Test
    void testOnlyUppercase() {
        assertFalse(validatePassword("ALLUPPERCASE1!"), "Password should be invalid if only uppercase letters");
    }

    @Test
    void testOnlyLowercase() {
        assertFalse(validatePassword("alllowercase1!"), "Password should be invalid if only lowercase letters");
    }

    @Test
    void testOnlyDigits() {
        assertFalse(validatePassword("12345678"), "Password should be invalid if only digits");
    }

    @Test
    void testOnlySpecialCharacters() {
        assertFalse(validatePassword("!@#$%^&*"), "Password should be invalid if only special characters");
    }

    @Test
    void testValidPasswordWithDifferentSpecialChars() {
        assertTrue(validatePassword("ValidPassword1@"), "Password should be valid with different special characters");
    }

    @Test
    void testPasswordWithSpaces() {
        assertFalse(validatePassword("Valid 1!"), "Password should be invalid if it contains spaces");
    }

    @Test
    void testPasswordWithAllRequirementsMet() {
        assertTrue(validatePassword("A1b!cdef"), "Password should be valid with all requirements met");
    }
}