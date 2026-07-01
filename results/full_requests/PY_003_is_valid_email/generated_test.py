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

def test_missing_dot():
    assert is_valid_email("test@examplecom") == False
    assert is_valid_email("test@com") == False

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

def test_invalid_domain_format():
    assert is_valid_email("test@.com") == False
    assert is_valid_email("test@example.") == False
    assert is_valid_email("test@.example.com") == False
    assert is_valid_email("test@example..com") == False

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

def test_valid_characters_in_local_part():
    assert is_valid_email("test.email@example.com") == True
    assert is_valid_email("test-email@example.com") == True
    assert is_valid_email("test_email@example.com") == True
    assert is_valid_email("test.email123@example.com") == True

def test_edge_cases():
    assert is_valid_email("a@b.c") == True  # Minimum valid email
    assert is_valid_email("a@b.c.d") == True  # Nested domain
    assert is_valid_email("a@b..c") == False  # Double dot in domain
    assert is_valid_email("a@.b.c") == False  # Domain starts with dot
    assert is_valid_email("a@b.c.") == False  # Domain ends with dot
    assert is_valid_email("a..b@c.d") == True  # Double dot in local part is valid
    assert is_valid_email("a.b.c@d.e") == True  # Multiple dots in local and domain parts