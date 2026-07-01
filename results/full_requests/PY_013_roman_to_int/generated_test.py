import pytest

# Test suite for the roman_to_int function
def test_roman_to_int_valid_cases():
    # Test valid Roman numerals
    assert roman_to_int("I") == 1
    assert roman_to_int("III") == 3
    assert roman_to_int("IV") == 4
    assert roman_to_int("IX") == 9
    assert roman_to_int("LVIII") == 58
    assert roman_to_int("MCMXCIV") == 1994
    assert roman_to_int("MMXXIII") == 2023
    assert roman_to_int("MMMCMXCIX") == 3999  # Maximum valid Roman numeral

def test_roman_to_int_empty_string():
    # Test empty string input
    assert roman_to_int("") == 0

def test_roman_to_int_invalid_characters():
    # Test strings with invalid characters
    assert roman_to_int("A") == 0
    assert roman_to_int("123") == 0
    assert roman_to_int("IVXQ") == 0
    assert roman_to_int("MCMXCV!") == 0
    assert roman_to_int(" ") == 0

def test_roman_to_int_mixed_valid_and_invalid():
    # Test strings with mixed valid and invalid characters
    assert roman_to_int("XIVZ") == 0
    assert roman_to_int("MCMXCIVX") == 0

def test_roman_to_int_boundary_cases():
    # Test boundary cases
    assert roman_to_int("I") == 1  # Smallest valid Roman numeral
    assert roman_to_int("MMMCMXCIX") == 3999  # Largest valid Roman numeral

def test_roman_to_int_subtractive_notation():
    # Test subtractive notation cases
    assert roman_to_int("IV") == 4
    assert roman_to_int("IX") == 9
    assert roman_to_int("XL") == 40
    assert roman_to_int("XC") == 90
    assert roman_to_int("CD") == 400
    assert roman_to_int("CM") == 900

def test_roman_to_int_repeated_characters():
    # Test repeated characters
    assert roman_to_int("II") == 2
    assert roman_to_int("XX") == 20
    assert roman_to_int("CC") == 200
    assert roman_to_int("MM") == 2000

def test_roman_to_int_edge_cases():
    # Test edge cases
    assert roman_to_int("IIII") == 4  # Technically invalid but may be interpreted as 4
    assert roman_to_int("VV") == 0  # Invalid Roman numeral
    assert roman_to_int("LL") == 0  # Invalid Roman numeral
    assert roman_to_int("DD") == 0  # Invalid Roman numeral
    assert roman_to_int("MMMM") == 0  # Invalid Roman numeral (exceeds 3999)

def test_roman_to_int_lowercase_input():
    # Test lowercase input
    assert roman_to_int("i") == 0  # Function does not handle lowercase
    assert roman_to_int("iv") == 0
    assert roman_to_int("mcmxciv") == 0

def test_roman_to_int_non_string_input():
    # Test non-string input
    with pytest.raises(TypeError):
        roman_to_int(1234)
    with pytest.raises(TypeError):
        roman_to_int(None)
    with pytest.raises(TypeError):
        roman_to_int(["I", "V", "X"])