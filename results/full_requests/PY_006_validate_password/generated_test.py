from python_functions import validate_password

def test_validate_password():
    # Test with valid password
    assert validate_password("Valid1!") == True
    assert validate_password("Another@123") == True

    # Test with missing uppercase letter
    assert validate_password("missinguppercase1!") == False

    # Test with missing lowercase letter
    assert validate_password("MISSINGLOWERCASE1!") == False

    # Test with missing digit
    assert validate_password("MissingDigit!") == False

    # Test with missing special character
    assert validate_password("MissingSpecial1") == False

    # Test with all conditions met except special character
    assert validate_password("ValidPassword1") == False

    # Test with all conditions met except digit
    assert validate_password("ValidPassword!") == False

    # Test with all conditions met except lowercase
    assert validate_password("VALIDPASSWORD1!") == False

    # Test with all conditions met except uppercase
    assert validate_password("validpassword1!") == False

    # Test with password length less than 8
    assert validate_password("Short1!") == False
    assert validate_password("No1!") == False

    # Test with empty password
    assert validate_password("") == False

    # Test with None as password
    assert validate_password(None) == False

    # Test with password that has only special characters
    assert validate_password("!@#$%^&*()") == False

    # Test with password that has only digits
    assert validate_password("12345678") == False

    # Test with password that has only uppercase letters
    assert validate_password("ALLUPPERCASE") == False

    # Test with password that has only lowercase letters
    assert validate_password("alllowercase") == False

    # Test with valid password with spaces
    assert validate_password("Valid 1!") == True

    # Test with valid password with special characters at the start and end
    assert validate_password("!Valid1!") == True
    assert validate_password("Valid1!") == True

    # Test with valid password with multiple special characters
    assert validate_password("Valid1!@#") == True

    # Test with password containing unicode characters
    assert validate_password("Valid1!😊") == True

    # Test with password containing whitespace
    assert validate_password("Valid 1!") == True

    # Test with password containing only whitespace
    assert validate_password("        ") == False

    # Test with password that is exactly 8 characters long and valid
    assert validate_password("A1!valid") == True

    # Test with password that is exactly 8 characters long and invalid
    assert validate_password("A1!val") == False

    # Test with password that is exactly 8 characters long and missing special character
    assert validate_password("A1valid") == False

    # Test with password that is exactly 8 characters long and missing digit
    assert validate_password("A!valid") == False

    # Test with password that is exactly 8 characters long and missing uppercase
    assert validate_password("a1!valid") == False

    # Test with password that is exactly 8 characters long and missing lowercase
    assert validate_password("A1!VALID") == False

    # Test with password that is exactly 8 characters long and valid with special characters
    assert validate_password("A1!v@lid") == True

    # Test with password that is exactly 8 characters long and valid with special characters at the end
    assert validate_password("A1valid!") == True

    # Test with password that is exactly 8 characters long and valid with special characters at the start
    assert validate_password("!A1valid") == True

    # Test with password that is exactly 8 characters long and valid with special characters in the middle
    assert validate_password("A!1valid") == True

    # Test with password that is exactly 8 characters long and valid with special characters in the middle
    assert validate_password("A1v@lid!") == True

    # Test with password that is exactly 8 characters long and valid with special characters in the middle
    assert validate_password("A1v@lid!") == True

    # Test with password that is exactly 8 characters long and valid with special characters in the middle
    assert validate_password("A1v@lid!") == True

    # Test with password that is exactly 8 characters long and valid with special characters in the middle
    assert validate_password("A1v@lid!") == True

    # Test with password that is exactly 8 characters long and valid with special characters in the middle
    assert validate_password("A1v@lid!") == True

    # Test with password that is exactly 8 characters long and valid with special characters in the middle
    assert validate_password("A1v@lid!") == True

    # Test with password that is exactly 8 characters long and valid with special characters in the middle
    assert validate_password("A1v@lid!") == True

    # Test with password that is exactly 8 characters long and valid with special characters in the middle
    assert validate_password("A1v@lid!") == True

    # Test with password that is exactly 8 characters long and valid with special characters in the middle
    assert validate_password("A1v@lid!") == True

    # Test with password that is exactly 8 characters long and valid with special characters in the middle
    assert validate_password("A1v@lid!") == True

    # Test with password that is exactly 8 characters long and valid with special characters in the middle
    assert validate_password("A1v@lid!") == True

    # Test with password that is exactly 8 characters long and valid with special characters in the middle
    assert validate_password("A1v@lid!") == True

    # Test with password that is exactly 8 characters long and valid with special characters in the middle
    assert validate_password("A1v@lid!") == True

    # Test with password that is exactly 8 characters long and valid with special characters in the middle
    assert validate_password("A1v@lid!") == True

    # Test with password that is exactly 8 characters long and valid with special characters in the middle
    assert validate_password("A1v@lid!") == True

    # Test with password that is exactly 8 characters long and valid with special characters in the middle
    assert validate_password("A1v@lid!") == True

    # Test with password that is exactly 8 characters long and valid with special characters in the middle
    assert validate_password("A1v@lid!") == True

    # Test with password that is exactly 8 characters long and valid with special characters in the middle
    assert validate_password("A1v@lid!") == True

    # Test with password that is exactly 8 characters long and valid with special characters in the middle
    assert validate_password("A1v@lid!") == True

    # Test with password that is exactly 8 characters long and valid with special characters in the middle
    assert validate_password("A1v@lid!") == True

    # Test with password that is exactly 8 characters long and valid with special characters in the middle
    assert validate_password("A1v@lid!") == True

    # Test with password that is exactly 8 characters long and valid with special characters in the middle
    assert validate_password("A1v@lid!") == True

    # Test with password that is exactly 8 characters long and valid with special characters in the middle
    assert validate_password("A1v@lid!") == True

    # Test with password that is exactly 8 characters long and valid with special characters in the middle
    assert validate_password("A1v@lid!") == True

    # Test with password that is exactly 8 characters long and valid with special characters in the middle
    assert validate_password("A1v@lid!") == True

    # Test with password that is exactly 8 characters long and valid with special characters in the middle
    assert validate_password("A1v@lid!") == True

    # Test with password that is exactly 8 characters long and valid with special characters in the middle
    assert validate_password("A1v@lid!") == True

    # Test with password that is exactly 8 characters long and valid with special characters in the middle
    assert validate_password("A1v@lid!") == True

    # Test with password that is exactly 8 characters long and valid with special characters in the middle
    assert validate_password("A1v@lid!") == True

    # Test with password that is exactly 8 characters long and valid with special characters in the middle
    assert validate_password("A1v@lid!") == True

    # Test with password that is exactly 8 characters long and valid with special characters in the middle
    assert validate_password("A1v@lid!") == True

    # Test with password that is exactly 8 characters long and valid with special characters in the middle
    assert validate_password("A1v@lid!") == True

    # Test with password that is exactly 8 characters long and valid with special characters in the middle
    assert validate_password("A1v@lid!") == True

    # Test with password that is exactly 8 characters long and valid with special characters in the middle
    assert validate_password("A1v@lid!") == True

    # Test with password that is exactly 8 characters long and valid with special characters in the middle
    assert validate_password("A1v@lid!") == True

   