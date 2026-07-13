def test_run_length_decoding():
    from your_module import run_length_decoding  # Replace 'your_module' with the actual module name

    # Test with a normal case
    assert run_length_decoding("3a2b1c") == "aaabbc"
    
    # Test with a single character
    assert run_length_decoding("1a") == "a"
    
    # Test with multiple characters
    assert run_length_decoding("4x2y") == "xxxxyy"
    
    # Test with no input
    assert run_length_decoding("") == ""
    
    # Test with invalid input (non-digit at start)
    assert run_length_decoding("a3b") == ""
    
    # Test with invalid input (non-digit in the middle)
    assert run_length_decoding("3a2b1c4") == ""
    
    # Test with input ending with digits
    assert run_length_decoding("3a2b1") == ""
    
    # Test with input having only digits
    assert run_length_decoding("123") == ""
    
    # Test with input having characters but no digits
    assert run_length_decoding("abc") == ""
    
    # Test with large numbers
    assert run_length_decoding("10a") == "aaaaaaaaaa"
    
    # Test with a long sequence
    assert run_length_decoding("5a3b2c1d") == "aaaaabbbcc"