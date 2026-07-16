import pytest
from python_functions import find_prime_factors

def test_find_prime_factors():
    # Test with a prime number
    assert find_prime_factors(13) == [13]
    
    # Test with a composite number
    assert find_prime_factors(28) == [2, 2, 7]
    
    # Test with a square of a prime number
    assert find_prime_factors(9) == [3, 3]
    
    # Test with a number that is a product of two different primes
    assert find_prime_factors(15) == [3, 5]
    
    # Test with a large prime number
    assert find_prime_factors(97) == [97]
    
    # Test with a large composite number
    assert find_prime_factors(100) == [2, 2, 5, 5]
    
    # Test with 1 (edge case)
    assert find_prime_factors(1) == []
    
    # Test with 0 (edge case)
    assert find_prime_factors(0) == []
    
    # Test with a negative number (edge case)
    assert find_prime_factors(-10) == []
    
    # Test with a power of a prime number
    assert find_prime_factors(64) == [2, 2, 2, 2, 2, 2]
    
    # Test with a prime factorization that includes 2 and odd primes
    assert find_prime_factors(60) == [2, 2, 3, 5]