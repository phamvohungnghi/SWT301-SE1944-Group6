from python_functions import calculate_tax

def test_calculate_tax():
    # Test cases for income <= 0
    assert calculate_tax(0, "single") == 0.0
    assert calculate_tax(-1000, "single") == 0.0
    assert calculate_tax(0, "married") == 0.0
    assert calculate_tax(-1000, "married") == 0.0
    assert calculate_tax(0, "other") == 0.0
    assert calculate_tax(-1000, "other") == 0.0

    # Test cases for "single" status
    assert calculate_tax(5000, "single") == 500.0  # 10% of 5000
    assert calculate_tax(10000, "single") == 1000.0  # 10% of 10000
    assert calculate_tax(15000, "single") == 1000.0 + (15000 - 10000) * 0.15  # 1000 + 15% of 5000
    assert calculate_tax(40000, "single") == 5500.0  # 1000 + 15% of 30000
    assert calculate_tax(50000, "single") == 5500.0 + (50000 - 40000) * 0.25  # 5500 + 25% of 10000

    # Test cases for "married" status
    assert calculate_tax(10000, "married") == 1000.0  # 10% of 10000
    assert calculate_tax(20000, "married") == 2000.0  # 10% of 20000
    assert calculate_tax(30000, "married") == 2000.0 + (30000 - 20000) * 0.15  # 2000 + 15% of 10000
    assert calculate_tax(80000, "married") == 11000.0  # 2000 + 15% of 60000
    assert calculate_tax(90000, "married") == 11000.0 + (90000 - 80000) * 0.25  # 11000 + 25% of 10000

    # Test cases for "other" status
    assert calculate_tax(10000, "other") == 2000.0  # 20% of 10000
    assert calculate_tax(20000, "other") == 4000.0  # 20% of 20000
    assert calculate_tax(50000, "other") == 10000.0  # 20% of 50000
    assert calculate_tax(100000, "other") == 20000.0  # 20% of 100000

    # Test cases for invalid status
    assert calculate_tax(30000, "invalid_status") == 6000.0  # 20% of 30000
    assert calculate_tax(0, "invalid_status") == 0.0  # Edge case for income 0
    assert calculate_tax(-5000, "invalid_status") == 0.0  # Edge case for negative income