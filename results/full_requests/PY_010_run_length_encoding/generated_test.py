import pytest

from PY_010_run_length_encoding import run_length_encoding

def test_empty_string():
    assert run_length_encoding("") == ""

def test_single_character():
    assert run_length_encoding("a") == "1a"
    assert run_length_encoding("z") == "1z"

def test_repeated_characters():
    assert run_length_encoding("aaa") == "3a"
    assert run_length_encoding("bbbbbb") == "6b"

def test_mixed_characters():
    assert run_length_encoding("aabb") == "2a2b"
    assert run_length_encoding("aaabbcc") == "3a2b2c"

def test_no_repeated_characters():
    assert run_length_encoding("abc") == "1a1b1c"
    assert run_length_encoding("xyz") == "1x1y1z"

def test_numeric_characters():
    assert run_length_encoding("123") == ""
    assert run_length_encoding("a1b2") == ""

def test_special_characters():
    assert run_length_encoding("a!b@") == ""
    assert run_length_encoding("a#b$c") == ""

def test_mixed_valid_and_invalid_characters():
    assert run_length_encoding("a1b") == ""
    assert run_length_encoding("abc!") == ""

def test_uppercase_characters():
    assert run_length_encoding("AAA") == "3A"
    assert run_length_encoding("AaAa") == "1A1a1A1a"

def test_mixed_case_characters():
    assert run_length_encoding("aAaA") == "1a1A1a1A"
    assert run_length_encoding("aaAA") == "2a2A"

def test_long_string():
    input_str = "a" * 1000 + "b" * 500 + "c" * 300
    expected_output = "1000a500b300c"
    assert run_length_encoding(input_str) == expected_output

def test_boundary_case_two_characters():
    assert run_length_encoding("aa") == "2a"
    assert run_length_encoding("ab") == "1a1b"