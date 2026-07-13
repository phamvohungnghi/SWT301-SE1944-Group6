import pytest

from your_module import is_valid_email  # Adjust the import according to your project structure

def test_valid_email():
    assert is_valid_email("test@example.com") == True
    assert is_valid_email("user.name+tag+sorting@example.com") == True
    assert is_valid_email("user-name@example.co.uk") == True
    assert is_valid_email("user_name@example.org") == True

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

def test_invalid_email_local_part_only_special_characters():
    assert is_valid_email("!#$%&'*+/=?^_`{|}~@example.com") == True

def test_invalid_email_local_part_only_special_characters_no_domain():
    assert is_valid_email("!#$%&'*+/=?^_`{|}~@") == False

def test_invalid_email_domain_part_only_special_characters():
    assert is_valid_email("test@!#$%&'*+/=?^_`{|}~") == False

def test_invalid_email_with_spaces():
    assert is_valid_email("test @example.com") == False
    assert is_valid_email("test@example .com") == False
    assert is_valid_email("test@ example.com") == False

def test_valid_email_with_subdomain():
    assert is_valid_email("test@mail.example.com") == True

def test_valid_email_with_numeric_domain():
    assert is_valid_email("test@123.com") == True

def test_invalid_email_with_numeric_local_part():
    assert is_valid_email("123@domain.com") == True

def test_invalid_email_with_consecutive_dots():
    assert is_valid_email("test..email@example.com") == False

def test_invalid_email_with_consecutive_special_characters():
    assert is_valid_email("test@@example.com") == False

def test_valid_email_with_hyphen_in_domain():
    assert is_valid_email("test@domain-name.com") == True

def test_invalid_email_with_hyphen_at_start_of_domain():
    assert is_valid_email("test@-domain.com") == False

def test_invalid_email_with_hyphen_at_end_of_domain():
    assert is_valid_email("test@domain-.com") == False