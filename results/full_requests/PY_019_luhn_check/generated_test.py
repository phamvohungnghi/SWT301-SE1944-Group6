import pytest

from your_module import luhn_check

def test_luhn_check_valid_card_numbers():
    # Valid card numbers
    assert luhn_check("4532015112830366") == True  # Visa
    assert luhn_check("6011111111111117") == True  # Discover
    assert luhn_check("378282246310005") == True   # American Express
    assert luhn_check("5105105105105100") == True  # MasterCard

def test_luhn_check_invalid_card_numbers():
    # Invalid card numbers
    assert luhn_check("4532015112830367") == False
    assert luhn_check("6011111111111118") == False
    assert luhn_check("378282246310006") == False
    assert luhn_check("5105105105105101") == False

def test_luhn_check_empty_string():
    # Empty string
    assert luhn_check("") == False

def test_luhn_check_non_digit_characters():
    # Non-digit characters
    assert luhn_check("abcd1234") == False
    assert luhn_check("1234abcd") == False
    assert luhn_check("!@#$%^&*()") == False

def test_luhn_check_single_digit():
    # Single digit cases
    assert luhn_check("0") == True  # Valid single digit
    assert luhn_check("1") == False  # Invalid single digit

def test_luhn_check_all_zeroes():
    # All zeroes
    assert luhn_check("0000000000000000") == True

def test_luhn_check_boundary_cases():
    # Boundary cases
    assert luhn_check("9") == False  # Single digit, invalid
    assert luhn_check("90") == True  # Two digits, valid
    assert luhn_check("91") == False  # Two digits, invalid

def test_luhn_check_large_number():
    # Large number
    assert luhn_check("12345678901234567890") == False
    assert luhn_check("7992739871300000") == True  # Valid large number

def test_luhn_check_leading_zeroes():
    # Leading zeroes
    assert luhn_check("0004532015112830366") == True  # Valid card number with leading zeroes
    assert luhn_check("0000000000000000000") == True  # All zeroes with leading zeroes

def test_luhn_check_special_cases():
    # Special cases
    assert luhn_check(None) == False  # None input
    assert luhn_check(" ") == False  # Whitespace input
    assert luhn_check("1234567890123456789a") == False  # Mixed digits and letters