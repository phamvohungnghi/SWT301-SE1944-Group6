def test_int_to_roman():
    from your_module import int_to_roman  # Replace 'your_module' with the actual module name

    # Test cases for valid inputs
    assert int_to_roman(1) == "I"
    assert int_to_roman(4) == "IV"
    assert int_to_roman(5) == "V"
    assert int_to_roman(9) == "IX"
    assert int_to_roman(10) == "X"
    assert int_to_roman(40) == "XL"
    assert int_to_roman(50) == "L"
    assert int_to_roman(90) == "XC"
    assert int_to_roman(100) == "C"
    assert int_to_roman(400) == "CD"
    assert int_to_roman(500) == "D"
    assert int_to_roman(900) == "CM"
    assert int_to_roman(1000) == "M"
    assert int_to_roman(1994) == "MCMXCIV"
    assert int_to_roman(2023) == "MMXXIII"
    assert int_to_roman(3999) == "MMMCMXCIX"

    # Test cases for boundary conditions
    assert int_to_roman(0) == ""
    assert int_to_roman(-1) == ""
    assert int_to_roman(4000) == ""

    # Test cases for invalid inputs
    assert int_to_roman(5000) == ""
    assert int_to_roman(-10) == ""
    assert int_to_roman(10000) == ""