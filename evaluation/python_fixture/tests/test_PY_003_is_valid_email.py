from python_functions import is_valid_email

def test_is_valid_email():
    # Test valid email addresses
    assert is_valid_email("test@example.com") == True
    assert is_valid_email("user.name+tag+sorting@example.com") == True
    assert is_valid_email("user_name@example.co.uk") == True
    assert is_valid_email("user-name@example.com") == True
    assert is_valid_email("user.name@example.com") == True

    # Test invalid email addresses
    assert is_valid_email("") == False  # Empty string
    assert is_valid_email("plainaddress") == False  # No @ and no dot
    assert is_valid_email("@missinglocalpart.com") == False  # Missing local part
    assert is_valid_email("missingdomain@.com") == False  # Missing domain part
    assert is_valid_email("missingat.com") == False  # Missing @
    assert is_valid_email("user@.com") == False  # Domain starts with dot
    assert is_valid_email("user@domain.") == False  # Domain ends with dot
    assert is_valid_email("user@domain..com") == False  # Consecutive dots in domain
    assert is_valid_email("user@domain.com.") == False  # Domain ends with dot
    assert is_valid_email("user@domain.c") == True  # Valid TLD with one character
    assert is_valid_email("user@domain.c1") == True  # Valid TLD with one character followed by digit

    # Test special characters in local part
    assert is_valid_email("user.name@example.com") == True  # Valid special character
    assert is_valid_email("user_name@example.com") == True  # Valid special character
    assert is_valid_email("user-name@example.com") == True  # Valid special character
    assert is_valid_email("user.name@sub.domain.com") == True  # Subdomain
    assert is_valid_email("user@domain.com") == True  # Simple valid email

    # Test invalid characters in local part
    assert is_valid_email("user@domain.com!") == False  # Invalid character in local part
    assert is_valid_email("user@domain.com#") == False  # Invalid character in local part
    assert is_valid_email("user@domain.com$") == False  # Invalid character in local part
    assert is_valid_email("user@domain.com%") == False  # Invalid character in local part
    assert is_valid_email("user@domain.com^") == False  # Invalid character in local part
    assert is_valid_email("user@domain.com&") == False  # Invalid character in local part
    assert is_valid_email("user@domain.com*") == False  # Invalid character in local part
    assert is_valid_email("user@domain.com(") == False  # Invalid character in local part
    assert is_valid_email("user@domain.com)") == False  # Invalid character in local part
    assert is_valid_email("user@domain.com+") == False  # Invalid character in local part
    assert is_valid_email("user@domain.com=") == False  # Invalid character in local part
    assert is_valid_email("user@domain.com;") == False  # Invalid character in local part
    assert is_valid_email("user@domain.com:") == False  # Invalid character in local part
    assert is_valid_email("user@domain.com<") == False  # Invalid character in local part
    assert is_valid_email("user@domain.com>") == False  # Invalid character in local part
    assert is_valid_email("user@domain.com?") == False  # Invalid character in local part
    assert is_valid_email("user@domain.com|") == False  # Invalid character in local part
    assert is_valid_email("user@domain.com/") == False  # Invalid character in local part
    assert is_valid_email("user@domain.com\\") == False  # Invalid character in local part
    assert is_valid_email("user@domain.com{") == False  # Invalid character in local part
    assert is_valid_email("user@domain.com}") == False  # Invalid character in local part
    assert is_valid_email("user@domain.com~") == False  # Invalid character in local part

    # Test edge cases
    assert is_valid_email("user@domain.c") == True  # Valid TLD with one character
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com.") == False  # Invalid email
    assert is_valid_email("user@.com") == False  # Invalid email
    assert is_valid_email("user@domain..com") == False  # Invalid email
    assert is_valid_email("user@domain.com.") == False  # Invalid email
    assert is_valid_email("user@domain.c1") == True  # Valid TLD with one character followed by digit
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email
    assert is_valid_email("user@domain.com") == True  # Valid email