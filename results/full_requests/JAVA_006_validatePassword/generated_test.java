import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidatePasswordTest {

    @Test
    public void testNullPassword() {
        assertFalse(JAVA_006_validatePassword(null), "Password should be invalid if it is null");
    }

    @Test
    public void testShortPassword() {
        assertFalse(JAVA_006_validatePassword("Ab1!"), "Password should be invalid if it is shorter than 8 characters");
    }

    @Test
    public void testPasswordWithoutUppercase() {
        assertFalse(JAVA_006_validatePassword("abcd123!"), "Password should be invalid if it does not contain an uppercase letter");
    }

    @Test
    public void testPasswordWithoutLowercase() {
        assertFalse(JAVA_006_validatePassword("ABCD123!"), "Password should be invalid if it does not contain a lowercase letter");
    }

    @Test
    public void testPasswordWithoutDigit() {
        assertFalse(JAVA_006_validatePassword("Abcdefg!"), "Password should be invalid if it does not contain a digit");
    }

    @Test
    public void testPasswordWithoutSpecialCharacter() {
        assertFalse(JAVA_006_validatePassword("Abcdefg1"), "Password should be invalid if it does not contain a special character");
    }

    @Test
    public void testValidPassword() {
        assertTrue(JAVA_006_validatePassword("Abc123!@"), "Password should be valid if it meets all criteria");
    }

    @Test
    public void testPasswordWithOnlySpecialCharacters() {
        assertFalse(JAVA_006_validatePassword("!@#$%^&*"), "Password should be invalid if it only contains special characters");
    }

    @Test
    public void testPasswordWithOnlyDigits() {
        assertFalse(JAVA_006_validatePassword("12345678"), "Password should be invalid if it only contains digits");
    }

    @Test
    public void testPasswordWithOnlyUppercaseLetters() {
        assertFalse(JAVA_006_validatePassword("ABCDEFGH"), "Password should be invalid if it only contains uppercase letters");
    }

    @Test
    public void testPasswordWithOnlyLowercaseLetters() {
        assertFalse(JAVA_006_validatePassword("abcdefgh"), "Password should be invalid if it only contains lowercase letters");
    }

    @Test
    public void testPasswordWithNonSpecialCharacters() {
        assertFalse(JAVA_006_validatePassword("Abc12345"), "Password should be invalid if it does not contain any valid special characters");
    }

    @Test
    public void testPasswordWithBoundaryLength() {
        assertTrue(JAVA_006_validatePassword("Abc123!@"), "Password should be valid if it is exactly 8 characters and meets all criteria");
        assertTrue(JAVA_006_validatePassword("Abc123!@#"), "Password should be valid if it is longer than 8 characters and meets all criteria");
    }
}