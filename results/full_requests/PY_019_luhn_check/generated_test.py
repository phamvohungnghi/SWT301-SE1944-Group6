import pytest
from your_module import luhn_check  # Adjust the import based on your project structure

def test_luhn_check_valid_card():
    assert luhn_check("4532015112830366") == True
    assert luhn_check("6011514433546201") == True
    assert luhn_check("378282246310005") == True
    assert luhn_check("371449635398431") == True

def test_luhn_check_invalid_card():
    assert luhn_check("4532015112830367") == False
    assert luhn_check("6011514433546200") == False
    assert luhn_check("378282246310006") == False
    assert luhn_check("371449635398432") == False

def test_luhn_check_empty_input():
    assert luhn_check("") == False

def test_luhn_check_non_digit_input():
    assert luhn_check("1234a6789012345") == False
    assert luhn_check("abcd") == False
    assert luhn_check("1234 5678 9012 3456") == False

def test_luhn_check_single_digit():
    assert luhn_check("5") == False
    assert luhn_check("0") == False

def test_luhn_check_two_digits():
    assert luhn_check("10") == False
    assert luhn_check("11") == False
    assert luhn_check("12") == False
    assert luhn_check("13") == False
    assert luhn_check("14") == False
    assert luhn_check("15") == False
    assert luhn_check("16") == False
    assert luhn_check("17") == False
    assert luhn_check("18") == False
    assert luhn_check("19") == False

def test_luhn_check_large_number():
    assert luhn_check("12345678901234567890") == False
    assert luhn_check("4532015112830366" * 10) == False  # Exceeding typical card length

def test_luhn_check_valid_boundary_cases():
    assert luhn_check("79927398713") == True  # Valid 11-digit number
    assert luhn_check("1234567812345670") == True  # Valid 16-digit number

def test_luhn_check_invalid_boundary_cases():
    assert luhn_check("79927398714") == False  # Invalid 11-digit number
    assert luhn_check("1234567812345671") == False  # Invalid 16-digit number