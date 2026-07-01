import pytest
from PY_014_int_to_roman import int_to_roman

def test_int_to_roman_valid_cases():
    # Test valid cases
    assert int_to_roman(1) == "I"
    assert int_to_roman(4) == "IV"
    assert int_to_roman(9) == "IX"
    assert int_to_roman(40) == "XL"
    assert int_to_roman(90) == "XC"
    assert int_to_roman(400) == "CD"
    assert int_to_roman(900) == "CM"
    assert int_to_roman(3999) == "MMMCMXCIX"
    assert int_to_roman(58) == "LVIII"  # 50 + 5 + 3
    assert int_to_roman(1994) == "MCMXCIV"  # 1000 + 900 + 90 + 4

def test_int_to_roman_boundary_cases():
    # Test boundary cases
    assert int_to_roman(0) == ""  # Below valid range
    assert int_to_roman(-1) == ""  # Negative number
    assert int_to_roman(4000) == ""  # Above valid range
    assert int_to_roman(3999) == "MMMCMXCIX"  # Upper valid limit
    assert int_to_roman(1) == "I"  # Lower valid limit

def test_int_to_roman_edge_cases():
    # Test edge cases
    assert int_to_roman(3) == "III"  # Repeated symbols
    assert int_to_roman(8) == "VIII"  # Combination of repeated and single symbols
    assert int_to_roman(49) == "XLIX"  # Complex combination
    assert int_to_roman(444) == "CDXLIV"  # Complex combination with multiple symbols

def test_int_to_roman_invalid_cases():
    # Test invalid cases
    assert int_to_roman(0) == ""  # Zero is invalid
    assert int_to_roman(-10) == ""  # Negative number
    assert int_to_roman(4000) == ""  # Number greater than 3999
    assert int_to_roman(5000) == ""  # Number far beyond valid range

def test_int_to_roman_large_numbers():
    # Test large numbers within valid range
    assert int_to_roman(1000) == "M"
    assert int_to_roman(2000) == "MM"
    assert int_to_roman(3000) == "MMM"
    assert int_to_roman(3888) == "MMMDCCCLXXXVIII"  # 3000 + 500 + 300 + 80 + 8

def test_int_to_roman_small_numbers():
    # Test small numbers within valid range
    assert int_to_roman(2) == "II"
    assert int_to_roman(6) == "VI"
    assert int_to_roman(11) == "XI"
    assert int_to_roman(20) == "XX"
    assert int_to_roman(31) == "XXXI"