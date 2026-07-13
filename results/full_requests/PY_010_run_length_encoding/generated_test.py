import pytest
from your_module import run_length_encoding  # Adjust the import based on your module structure

def test_run_length_encoding_empty_string():
    assert run_length_encoding("") == ""

def test_run_length_encoding_single_character():
    assert run_length_encoding("a") == "1a"
    assert run_length_encoding("z") == "1z"

def test_run_length_encoding_repeated_characters():
    assert run_length_encoding("aa") == "2a"
    assert run_length_encoding("aaa") == "3a"
    assert run_length_encoding("aaaa") == "4a"

def test_run_length_encoding_mixed_characters():
    assert run_length_encoding("aaabbb") == "3a3b"
    assert run_length_encoding("aabbcc") == "2a2b2c"
    assert run_length_encoding("abc") == "1a1b1c"

def test_run_length_encoding_non_alpha_characters():
    assert run_length_encoding("abc123") == ""
    assert run_length_encoding("a!b") == ""
    assert run_length_encoding("hello!") == ""

def test_run_length_encoding_boundary_cases():
    assert run_length_encoding("a" * 1000) == "1000a"
    assert run_length_encoding("b" * 500 + "c" * 500) == "500b500c"

def test_run_length_encoding_case_sensitivity():
    assert run_length_encoding("aaAA") == "2a2A"
    assert run_length_encoding("aAaA") == "1a1A1a1A"

def test_run_length_encoding_long_string():
    assert run_length_encoding("a" * 100 + "b" * 100 + "c" * 100) == "100a100b100c"