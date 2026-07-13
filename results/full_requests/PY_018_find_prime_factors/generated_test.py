import pytest

from your_module import find_prime_factors  # Adjust the import based on your module structure

def test_find_prime_factors_with_negative_number():
    assert find_prime_factors(-10) == []

def test_find_prime_factors_with_zero():
    assert find_prime_factors(0) == []

def test_find_prime_factors_with_one():
    assert find_prime_factors(1) == []

def test_find_prime_factors_with_two():
    assert find_prime_factors(2) == [2]

def test_find_prime_factors_with_three():
    assert find_prime_factors(3) == [3]

def test_find_prime_factors_with_four():
    assert find_prime_factors(4) == [2, 2]

def test_find_prime_factors_with_six():
    assert find_prime_factors(6) == [2, 3]

def test_find_prime_factors_with_twelve():
    assert find_prime_factors(12) == [2, 2, 3]

def test_find_prime_factors_with_prime_number():
    assert find_prime_factors(29) == [29]

def test_find_prime_factors_with_large_composite_number():
    assert find_prime_factors(100) == [2, 2, 5, 5]

def test_find_prime_factors_with_large_prime_number():
    assert find_prime_factors(9973) == [9973]

def test_find_prime_factors_with_product_of_primes():
    assert find_prime_factors(15) == [3, 5]

def test_find_prime_factors_with_square_of_prime():
    assert find_prime_factors(49) == [7, 7]

def test_find_prime_factors_with_even_and_odd_primes():
    assert find_prime_factors(2310) == [2, 3, 5, 7, 11]