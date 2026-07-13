import pytest

def test_calculate_tax():
    # Test cases for income <= 0
    assert calculate_tax(0, "single") == 0.0
    assert calculate_tax(-1000, "single") == 0.0
    assert calculate_tax(0, "married") == 0.0
    assert calculate_tax(-1000, "married") == 0.0
    assert calculate_tax(0, "other") == 0.0
    assert calculate_tax(-1000, "other") == 0.0

    # Test cases for single status
    assert calculate_tax(5000, "single") == 500.0  # 10% of 5000
    assert calculate_tax(10000, "single") == 1000.0  # 10% of 10000
    assert calculate_tax(15000, "single") == 1000.0 + (15000 - 10000) * 0.15  # 1000 + 750
    assert calculate_tax(40000, "single") == 1000.0 + (40000 - 10000) * 0.15  # 1000 + 4500
    assert calculate_tax(50000, "single") == 5500.0 + (50000 - 40000) * 0.25  # 5500 + 2500
    assert calculate_tax(100000, "single") == 5500.0 + (100000 - 40000) * 0.25  # 5500 + 15000

    # Test cases for married status
    assert calculate_tax(10000, "married") == 1000.0  # 10% of 10000
    assert calculate_tax(20000, "married") == 2000.0  # 10% of 20000
    assert calculate_tax(30000, "married") == 2000.0 + (30000 - 20000) * 0.15  # 2000 + 1500
    assert calculate_tax(80000, "married") == 2000.0 + (80000 - 20000) * 0.15  # 2000 + 9000
    assert calculate_tax(100000, "married") == 11000.0 + (100000 - 80000) * 0.25  # 11000 + 5000

    # Test cases for other status
    assert calculate_tax(10000, "other") == 2000.0  # 20% of 10000
    assert calculate_tax(20000, "other") == 4000.0  # 20% of 20000
    assert calculate_tax(50000, "other") == 10000.0  # 20% of 50000
    assert calculate_tax(100000, "other") == 20000.0  # 20% of 100000

    # Edge cases
    assert calculate_tax(10001, "single") == 1000.0 + (10001 - 10000) * 0.15  # Just above boundary
    assert calculate_tax(40001, "single") == 5500.0 + (40001 - 40000) * 0.25  # Just above boundary
    assert calculate_tax(20001, "married") == 2000.0 + (20001 - 20000) * 0.15  # Just above boundary
    assert calculate_tax(80001, "married") == 11000.0 + (80001 - 80000) * 0.25  # Just above boundary

    # Invalid status
    assert calculate_tax(50000, "invalid") == 10000.0  # 20% of 50000 for invalid status