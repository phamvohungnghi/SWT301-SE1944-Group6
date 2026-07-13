import pytest

def roman_to_int(s):
    roman_map = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}
    if not s:
        return 0
    total = 0
    n = len(s)
    for i in range(n):
        if s[i] not in roman_map:
            return 0
        val = roman_map[s[i]]
        if i + 1 < n and roman_map[s[i + 1]] > val:
            total -= val
        else:
            total += val
    return total

def test_roman_to_int():
    # Test valid Roman numerals
    assert roman_to_int("III") == 3
    assert roman_to_int("IV") == 4
    assert roman_to_int("IX") == 9
    assert roman_to_int("LVIII") == 58
    assert roman_to_int("MCMXCIV") == 1994
    assert roman_to_int("MMXXIII") == 2023

    # Test empty string
    assert roman_to_int("") == 0

    # Test invalid characters
    assert roman_to_int("ABC") == 0
    assert roman_to_int("IIII") == 0  # Invalid as per Roman numeral rules
    assert roman_to_int("VV") == 0  # Invalid as per Roman numeral rules
    assert roman_to_int("XXXX") == 0  # Invalid as per Roman numeral rules
    assert roman_to_int("LL") == 0  # Invalid as per Roman numeral rules
    assert roman_to_int("CC") == 0  # Invalid as per Roman numeral rules
    assert roman_to_int("DD") == 0  # Invalid as per Roman numeral rules
    assert roman_to_int("MM") == 0  # Invalid as per Roman numeral rules

    # Test boundary cases
    assert roman_to_int("I") == 1
    assert roman_to_int("M") == 1000
    assert roman_to_int("MMMCMXC") == 3900  # Valid upper boundary
    assert roman_to_int("MMMCMXCIX") == 3999  # Valid upper boundary
    assert roman_to_int("MMMM") == 0  # Invalid as per Roman numeral rules

    # Test mixed valid and invalid
    assert roman_to_int("IXC") == 0  # Invalid sequence
    assert roman_to_int("MCMXCIVX") == 0  # Invalid sequence

    # Test single character valid
    assert roman_to_int("V") == 5
    assert roman_to_int("X") == 10
    assert roman_to_int("C") == 100
    assert roman_to_int("D") == 500
    assert roman_to_int("M") == 1000

    # Test long valid sequence
    assert roman_to_int("MMMMDCCCLXXXVIII") == 4888  # Valid long sequence
    assert roman_to_int("MMMDCCCLXXX") == 3880  # Valid long sequence

    # Test invalid sequences with valid characters
    assert roman_to_int("IC") == 0  # Invalid sequence
    assert roman_to_int("IL") == 0  # Invalid sequence
    assert roman_to_int("ID") == 0  # Invalid sequence
    assert roman_to_int("IM") == 0  # Invalid sequence
    assert roman_to_int("VX") == 0  # Invalid sequence
    assert roman_to_int("VL") == 0  # Invalid sequence
    assert roman_to_int("VC") == 0  # Invalid sequence
    assert roman_to_int("XD") == 0  # Invalid sequence
    assert roman_to_int("XM") == 0  # Invalid sequence
    assert roman_to_int("LC") == 0  # Invalid sequence
    assert roman_to_int("LD") == 0  # Invalid sequence
    assert roman_to_int("LM") == 0  # Invalid sequence
    assert roman_to_int("DM") == 0  # Invalid sequence

    # Test valid combinations
    assert roman_to_int("XII") == 12
    assert roman_to_int("XXVII") == 27
    assert roman_to_int("XLII") == 42
    assert roman_to_int("XC") == 90
    assert roman_to_int("CD") == 400
    assert roman_to_int("CM") == 900

    # Test maximum valid input
    assert roman_to_int("MMMCMXCIX") == 3999  # Maximum valid Roman numeral
    assert roman_to_int("MMMCMXC") == 3900  # Just below maximum valid Roman numeral

    # Test invalid input with valid characters
    assert roman_to_int("MCMXCIVM") == 0  # Invalid due to extra character
    assert roman_to_int("IVIV") == 0  # Invalid due to repetition
    assert roman_to_int("IXIX") == 0  # Invalid due to repetition
    assert roman_to_int("XLXL") == 0  # Invalid due to repetition
    assert roman_to_int("CDCD") == 0  # Invalid due to repetition
    assert roman_to_int("CMCM") == 0  # Invalid due to repetition

    # Test single invalid character
    assert roman_to_int("Z") == 0  # Invalid character
    assert roman_to_int("A") == 0  # Invalid character
    assert roman_to_int("!") == 0  # Invalid character
    assert roman_to_int("@") == 0  # Invalid character
    assert roman_to_int("#") == 0  # Invalid character
    assert roman_to_int("$") == 0  # Invalid character
    assert roman_to_int("%") == 0  # Invalid character
    assert roman_to_int("^") == 0  # Invalid character
    assert roman_to_int("&") == 0  # Invalid character
    assert roman_to_int("*") == 0  # Invalid character
    assert roman_to_int("(") == 0  # Invalid character
    assert roman_to_int(")") == 0  # Invalid character
    assert roman_to_int("-") == 0  # Invalid character
    assert roman_to_int("+") == 0  # Invalid character
    assert roman_to_int("=") == 0  # Invalid character
    assert roman_to_int("[") == 0  # Invalid character
    assert roman_to_int("]") == 0  # Invalid character
    assert roman_to_int("{") == 0  # Invalid character
    assert roman_to_int("}") == 0  # Invalid character
    assert roman_to_int(";") == 0  # Invalid character
    assert roman_to_int(":") == 0  # Invalid character
    assert roman_to_int("'") == 0  # Invalid character
    assert roman_to_int('"') == 0  # Invalid character
    assert roman_to_int("<") == 0  # Invalid character
    assert roman_to_int(">") == 0  # Invalid character
    assert roman_to_int(",") == 0  # Invalid character
    assert roman_to_int(".") == 0  # Invalid character
    assert roman_to_int("?") == 0  # Invalid character
    assert roman_to_int("/") == 0  # Invalid character
    assert roman_to_int("\\") == 0  # Invalid character
    assert roman_to_int("|") == 0  # Invalid character
    assert roman_to_int("~") == 0  # Invalid character
    assert roman_to_int("`") == 0  # Invalid character