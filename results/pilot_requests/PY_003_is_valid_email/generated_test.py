import pytest

from production_code import is_valid_email

def test_valid_email():
    assert is_valid_email("test@example.com") == True
    assert is_valid_email("user.name+tag+sorting@example.com") == True
    assert is_valid_email("user_name@example.co.uk") == True
    assert is_valid_email("user-name@example.org") == True
    assert is_valid_email("user.name@example.travel") == True

def test_missing_at_symbol():
    assert is_valid_email("testexample.com") == False
    assert is_valid_email("test.example.com") == False

def test_missing_dot_in_domain():
    assert is_valid_email("test@com") == False
    assert is_valid_email("test@examplecom") == False

def test_empty_email():
    assert is_valid_email("") == False
    assert is_valid_email(None) == False

def test_multiple_at_symbols():
    assert is_valid_email("test@@example.com") == False
    assert is_valid_email("test@sub@domain.com") == False

def test_empty_local_or_domain_part():
    assert is_valid_email("@example.com") == False
    assert is_valid_email("test@") == False
    assert is_valid_email("@") == False

def test_domain_starts_or_ends_with_dot():
    assert is_valid_email("test@.example.com") == False
    assert is_valid_email("test@example.com.") == False
    assert is_valid_email("test@.com.") == False

def test_invalid_characters_in_local_part():
    assert is_valid_email("test!@example.com") == False
    assert is_valid_email("test#@example.com") == False
    assert is_valid_email("test$@example.com") == False
    assert is_valid_email("test%@example.com") == False
    assert is_valid_email("test^@example.com") == False
    assert is_valid_email("test&@example.com") == False
    assert is_valid_email("test*@example.com") == False
    assert is_valid_email("test(@example.com") == False
    assert is_valid_email("test)@example.com") == False
    assert is_valid_email("test+@example.com") == False

def test_valid_boundary_cases():
    assert is_valid_email("a@b.c") == True
    assert is_valid_email("a.b.c@d.e.f") == True
    assert is_valid_email("a_b-c@d.e") == True

def test_invalid_boundary_cases():
    assert is_valid_email(".test@example.com") == False
    assert is_valid_email("test.@example.com") == False
    assert is_valid_email("test..test@example.com") == False
    assert is_valid_email("test@.example.com") == False
    assert is_valid_email("test@example..com") == False
    assert is_valid_email("test@.com.") == False