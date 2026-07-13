import pytest

from your_module import is_valid_email  # Adjust the import based on your module structure

def test_valid_email():
    assert is_valid_email("test@example.com") == True
    assert is_valid_email("user.name+tag+sorting@example.com") == True
    assert is_valid_email("user-name@example.co.uk") == True

def test_invalid_email_no_at_symbol():
    assert is_valid_email("test.example.com") == False

def test_invalid_email_no_dot():
    assert is_valid_email("test@com") == False

def test_invalid_email_empty_string():
    assert is_valid_email("") == False

def test_invalid_email_no_local_part():
    assert is_valid_email("@example.com") == False

def test_invalid_email_no_domain_part():
    assert is_valid_email("test@") == False

def test_invalid_email_multiple_at_symbols():
    assert is_valid_email("test@@example.com") == False

def test_invalid_email_domain_starts_with_dot():
    assert is_valid_email("test@.com") == False

def test_invalid_email_domain_ends_with_dot():
    assert is_valid_email("test@example.com.") == False

def test_invalid_email_local_part_invalid_characters():
    assert is_valid_email("test@ex!ample.com") == False
    assert is_valid_email("test@ex#ample.com") == False
    assert is_valid_email("test@ex$ample.com") == False

def test_invalid_email_local_part_empty():
    assert is_valid_email("@example.com") == False

def test_invalid_email_domain_part_empty():
    assert is_valid_email("test@") == False

def test_valid_email_with_subdomain():
    assert is_valid_email("test@mail.example.com") == True

def test_valid_email_with_special_characters():
    assert is_valid_email("test.email@example.com") == True
    assert is_valid_email("test-email@example.com") == True
    assert is_valid_email("test_email@example.com") == True

def test_invalid_email_with_consecutive_special_characters():
    assert is_valid_email("test..email@example.com") == False
    assert is_valid_email("test--email@example.com") == False

def test_invalid_email_with_space():
    assert is_valid_email("test email@example.com") == False
    assert is_valid_email("test@example .com") == False

def test_invalid_email_with_only_special_characters():
    assert is_valid_email("..@example.com") == False
    assert is_valid_email("--@example.com") == False
    assert is_valid_email("..@..com") == False