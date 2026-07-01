import pytest
from PY_005_calculate_tax import calculate_tax

def test_calculate_tax_single_low_income():
    assert calculate_tax(5000, "single") == 500.0

def test_calculate_tax_single_boundary_low():
    assert calculate_tax(10000, "single") == 1000.0

def test_calculate_tax_single_mid_income():
    assert calculate_tax(25000, "single") == 1000 + (25000 - 10000) * 0.15

def test_calculate_tax_single_boundary_mid():
    assert calculate_tax(40000, "single") == 5500.0

def test_calculate_tax_single_high_income():
    assert calculate_tax(60000, "single") == 5500 + (60000 - 40000) * 0.25

def test_calculate_tax_married_low_income():
    assert calculate_tax(10000, "married") == 1000.0

def test_calculate_tax_married_boundary_low():
    assert calculate_tax(20000, "married") == 2000.0

def test_calculate_tax_married_mid_income():
    assert calculate_tax(50000, "married") == 2000 + (50000 - 20000) * 0.15

def test_calculate_tax_married_boundary_mid():
    assert calculate_tax(80000, "married") == 11000.0

def test_calculate_tax_married_high_income():
    assert calculate_tax(100000, "married") == 11000 + (100000 - 80000) * 0.25

def test_calculate_tax_other_status_low_income():
    assert calculate_tax(5000, "head_of_household") == 5000 * 0.2

def test_calculate_tax_other_status_high_income():
    assert calculate_tax(50000, "head_of_household") == 50000 * 0.2

def test_calculate_tax_zero_income():
    assert calculate_tax(0, "single") == 0.0

def test_calculate_tax_negative_income():
    assert calculate_tax(-5000, "single") == 0.0

def test_calculate_tax_invalid_status():
    assert calculate_tax(10000, "unknown_status") == 10000 * 0.2

def test_calculate_tax_zero_income_invalid_status():
    assert calculate_tax(0, "unknown_status") == 0.0

def test_calculate_tax_negative_income_invalid_status():
    assert calculate_tax(-5000, "unknown_status") == 0.0