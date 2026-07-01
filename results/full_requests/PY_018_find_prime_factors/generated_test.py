import pytest

from PY_018_find_prime_factors import find_prime_factors

def test_find_prime_factors_zero():
    assert find_prime_factors(0) == []

def test_find_prime_factors_one():
    assert find_prime_factors(1) == []

def test_find_prime_factors_negative():
    assert find_prime_factors(-10) == []

def test_find_prime_factors_prime_number():
    assert find_prime_factors(13) == [13]

def test_find_prime_factors_composite_number():
    assert find_prime_factors(28) == [2, 2, 7]

def test_find_prime_factors_large_prime():
    assert find_prime_factors(101) == [101]

def test_find_prime_factors_large_composite():
    assert find_prime_factors(100) == [2, 2, 5, 5]

def test_find_prime_factors_power_of_two():
    assert find_prime_factors(16) == [2, 2, 2, 2]

def test_find_prime_factors_mixed_factors():
    assert find_prime_factors(45) == [3, 3, 5]

def test_find_prime_factors_square_of_prime():
    assert find_prime_factors(49) == [7, 7]

def test_find_prime_factors_large_number():
    assert find_prime_factors(123456) == [2, 2, 2, 2, 2, 3, 643]

def test_find_prime_factors_no_factors():
    assert find_prime_factors(97) == [97]  # Prime number

def test_find_prime_factors_minimum_composite():
    assert find_prime_factors(4) == [2, 2]