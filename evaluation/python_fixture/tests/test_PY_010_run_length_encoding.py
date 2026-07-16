from python_functions import run_length_encoding

def test_run_length_encoding():
    # Test with a simple case
    assert run_length_encoding("aaabb") == "3a2b"
    
    # Test with a single character
    assert run_length_encoding("a") == "1a"
    
    # Test with no characters
    assert run_length_encoding("") == ""
    
    # Test with all unique characters
    assert run_length_encoding("abc") == "1a1b1c"
    
    # Test with mixed characters
    assert run_length_encoding("aabbcc") == "2a2b2c"
    
    # Test with non-alphabetic characters (should return "")
    assert run_length_encoding("aa1bb") == ""
    assert run_length_encoding("abc!") == ""
    
    # Test with a long string
    assert run_length_encoding("aaaabbbbcccc") == "4a4b4c"
    
    # Test with alternating characters
    assert run_length_encoding("abababab") == "1a1b1a1b1a1b1a1b"
    
    # Test with uppercase and lowercase (should return "")
    assert run_length_encoding("aaAA") == ""
    
    # Test with a string of the same character
    assert run_length_encoding("zzzzzzzz") == "8z"