import pytest
from PY_006_validate_password import validate_password

def test_validate_password_empty_string():
    assert validate_password("") == False

def test_validate_password_none():
    assert validate_password(None) == False

def test_validate_password_too_short():
    assert validate_password("Ab1!") == False

def test_validate_password_no_uppercase():
    assert validate_password("abcd1234!") == False

def test_validate_password_no_lowercase():
    assert validate_password("ABCD1234!") == False

def test_validate_password_no_digit():
    assert validate_password("Abcdefg!") == False

def test_validate_password_no_special_character():
    assert validate_password("Abcdefg1") == False

def test_validate_password_valid_password():
    assert validate_password("Abc123!@") == True

def test_validate_password_only_special_characters():
    assert validate_password("!@#$%^&*()") == False

def test_validate_password_only_digits():
    assert validate_password("12345678") == False

def test_validate_password_only_uppercase():
    assert validate_password("ABCDEFGH") == False

def test_validate_password_only_lowercase():
    assert validate_password("abcdefgh") == False

def test_validate_password_special_characters_at_boundaries():
    assert validate_password("!Abc123!") == True

def test_validate_password_repeated_characters():
    assert validate_password("AAbb11!!") == True

def test_validate_password_no_special_characters_in_set():
    assert validate_password("Abc123~") == False

def test_validate_password_special_characters_edge_case():
    assert validate_password("Abc123!@#$%^&*()-_+=") == True

def test_validate_password_all_conditions_met_min_length():
    assert validate_password("A1b!cD2e") == True

def test_validate_password_all_conditions_met_max_length():
    assert validate_password("A1b!cD2eF3g@hI4jK5l#") == True

def test_validate_password_whitespace_in_password():
    assert validate_password("Abc 123!") == False

def test_validate_password_unicode_characters():
    assert validate_password("Abc123!ñ") == False

def test_validate_password_special_characters_only_one_match():
    assert validate_password("Abc123!") == True
    assert validate_password("Abc123@") == True
    assert validate_password("Abc123#") == True
    assert validate_password("Abc123$") == True
    assert validate_password("Abc123%") == True
    assert validate_password("Abc123^") == True
    assert validate_password("Abc123&") == True
    assert validate_password("Abc123*") == True
    assert validate_password("Abc123(") == True
    assert validate_password("Abc123)") == True
    assert validate_password("Abc123-") == True
    assert validate_password("Abc123_") == True
    assert validate_password("Abc123+") == True
    assert validate_password("Abc123=") == True