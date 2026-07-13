import pytest

from your_module import validate_password  # Adjust the import based on your project structure

def test_empty_password():
    assert validate_password("") == False

def test_short_password():
    assert validate_password("Short1!") == False
    assert validate_password("Short") == False

def test_no_uppercase():
    assert validate_password("lowercase1!") == False

def test_no_lowercase():
    assert validate_password("UPPERCASE1!") == False

def test_no_digit():
    assert validate_password("NoDigit!") == False

def test_no_special_character():
    assert validate_password("NoSpecial1") == False

def test_valid_password():
    assert validate_password("Valid1!") == True

def test_only_special_characters():
    assert validate_password("!@#$%^&*()") == False

def test_only_digits():
    assert validate_password("12345678") == False

def test_only_uppercase():
    assert validate_password("UPPERCASE") == False

def test_only_lowercase():
    assert validate_password("lowercase") == False

def test_valid_password_with_boundary_length():
    assert validate_password("Valid1!") == True
    assert validate_password("ValidPassword1!") == True

def test_special_character_at_start():
    assert validate_password("!Valid1") == True

def test_special_character_at_end():
    assert validate_password("Valid1!") == True

def test_multiple_special_characters():
    assert validate_password("Valid1!@") == True

def test_password_with_spaces():
    assert validate_password("Valid 1!") == False

def test_password_with_unicode():
    assert validate_password("Val1d!😊") == True
    assert validate_password("Val1d😊") == False
    assert validate_password("!😊") == False