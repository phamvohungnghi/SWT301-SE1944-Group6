import pytest

def test_run_length_decoding_empty_string():
    assert run_length_decoding("") == ""

def test_run_length_decoding_single_character_repeated():
    assert run_length_decoding("3a") == "aaa"
    assert run_length_decoding("1b") == "b"

def test_run_length_decoding_multiple_characters():
    assert run_length_decoding("3a2b1c") == "aaabbc"
    assert run_length_decoding("10x5y") == "xxxxxxxxxxyyyyy"

def test_run_length_decoding_invalid_input_no_digits():
    assert run_length_decoding("abc") == ""
    assert run_length_decoding("a1b2") == ""

def test_run_length_decoding_invalid_input_incomplete_pair():
    assert run_length_decoding("3") == ""
    assert run_length_decoding("3a2") == ""
    assert run_length_decoding("3a2b1") == ""

def test_run_length_decoding_invalid_input_non_digit_prefix():
    assert run_length_decoding("a3b") == ""
    assert run_length_decoding("x10y") == ""

def test_run_length_decoding_large_numbers():
    assert run_length_decoding("100a") == "a" * 100
    assert run_length_decoding("50b50c") == "b" * 50 + "c" * 50

def test_run_length_decoding_mixed_valid_and_invalid():
    assert run_length_decoding("3a2b1cX") == ""
    assert run_length_decoding("3a2b1c3") == ""
    assert run_length_decoding("3a2b1c1") == ""

def test_run_length_decoding_edge_cases():
    assert run_length_decoding("0a") == ""
    assert run_length_decoding("00a") == ""
    assert run_length_decoding("01a") == "a"
    assert run_length_decoding("001a") == "a"