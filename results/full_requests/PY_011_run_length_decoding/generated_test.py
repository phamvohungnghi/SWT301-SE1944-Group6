import pytest
from python_functions import run_length_decoding

def test_run_length_decoding():
    # Test basic decoding
    assert run_length_decoding("2a3b1c") == "aabbbbc"
    assert run_length_decoding("1x1y1z") == "xyz"
    
    # Test with single characters
    assert run_length_decoding("5a") == "aaaaa"
    assert run_length_decoding("1b") == "b"
    
    # Test with multiple characters
    assert run_length_decoding("3a2b4c") == "aaabbcccc"
    
    # Test with empty string
    assert run_length_decoding("") == ""
    
    # Test with invalid input (non-digit at start)
    assert run_length_decoding("a3b") == ""
    
    # Test with invalid input (non-digit in the middle)
    assert run_length_decoding("2a3b1c2d3") == ""
    
    # Test with invalid input (digit at the end)
    assert run_length_decoding("2a3b1") == ""
    
    # Test with only digits
    assert run_length_decoding("123") == ""
    
    # Test with long input
    assert run_length_decoding("10a5b2c") == "aaaaaaaaaabbbbbcc"
    
    # Test with leading zeros
    assert run_length_decoding("02a3b") == ""
    
    # Test with large numbers
    assert run_length_decoding("1000a") == "a" * 1000

    # Test with invalid characters
    assert run_length_decoding("3a2b1c$") == ""