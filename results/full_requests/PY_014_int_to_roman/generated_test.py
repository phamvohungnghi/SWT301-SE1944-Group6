from python_functions import int_to_roman

def test_int_to_roman():
    # Test lower boundary
    assert int_to_roman(0) == ""
    assert int_to_roman(-1) == ""
    
    # Test upper boundary
    assert int_to_roman(4000) == ""
    
    # Test valid conversions
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
    
    # Test combinations
    assert int_to_roman(1994) == "MCMXCIV"
    assert int_to_roman(58) == "LVIII"
    assert int_to_roman(2023) == "MMXXIII"
    
    # Test random values within range
    assert int_to_roman(123) == "CXXIII"
    assert int_to_roman(256) == "CCLVI"
    assert int_to_roman(3333) == "MMMCCCXXXIII"