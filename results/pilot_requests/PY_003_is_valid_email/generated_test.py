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
    assert is_valid_email("missingdot@domain") == False  # No dot in domain
    assert is_valid_email("user@.com") == False  # Dot at the start of domain
    assert is_valid_email("user@domain.") == False  # Dot at the end of domain
    assert is_valid_email("user@domain..com") == False  # Consecutive dots in domain
    assert is_valid_email("user@domain.c") == True  # Valid with single character TLD
    assert is_valid_email("user@domain.c1") == True  # Valid with alphanumeric TLD
    assert is_valid_email("user@domain.c-1") == False  # Invalid character in TLD
    assert is_valid_email("user@domain.c_1") == False  # Invalid character in TLD
    assert is_valid_email("user@domain.c1.com") == True  # Valid with subdomain
    assert is_valid_email("user@domain..com") == False  # Invalid due to consecutive dots
    assert is_valid_email("user@domain.com.") == False  # Invalid due to trailing dot

    # Test special characters in local part
    assert is_valid_email("user.name@example.com") == True  # Valid with dot
    assert is_valid_email("user-name@example.com") == True  # Valid with hyphen
    assert is_valid_email("user_name@example.com") == True  # Valid with underscore
    assert is_valid_email("user+name@example.com") == True  # Valid with plus
    assert is_valid_email("user@domain.com") == True  # Valid basic case
    assert is_valid_email("user@domain.co") == True  # Valid with two-letter TLD

    # Test invalid characters in local part
    assert is_valid_email("user@domain.com!") == False  # Invalid character
    assert is_valid_email("user@domain.com#") == False  # Invalid character
    assert is_valid_email("user@domain.com$") == False  # Invalid character
    assert is_valid_email("user@domain.com%") == False  # Invalid character
    assert is_valid_email("user@domain.com^") == False  # Invalid character
    assert is_valid_email("user@domain.com&") == False  # Invalid character
    assert is_valid_email("user@domain.com*") == False  # Invalid character
    assert is_valid_email("user@domain.com(") == False  # Invalid character
    assert is_valid_email("user@domain.com)") == False  # Invalid character
    assert is_valid_email("user@domain.com+") == False  # Invalid character
    assert is_valid_email("user@domain.com=") == False  # Invalid character
    assert is_valid_email("user@domain.com{") == False  # Invalid character
    assert is_valid_email("user@domain.com}") == False  # Invalid character
    assert is_valid_email("user@domain.com[") == False  # Invalid character
    assert is_valid_email("user@domain.com]") == False  # Invalid character
    assert is_valid_email("user@domain.com|") == False  # Invalid character
    assert is_valid_email("user@domain.com:") == False  # Invalid character
    assert is_valid_email("user@domain.com;") == False  # Invalid character
    assert is_valid_email("user@domain.com'") == False  # Invalid character
    assert is_valid_email("user@domain.com\"") == False  # Invalid character
    assert is_valid_email("user@domain.com<") == False  # Invalid character
    assert is_valid_email("user@domain.com>") == False  # Invalid character
    assert is_valid_email("user@domain.com?") == False  # Invalid character
    assert is_valid_email("user@domain.com/") == False  # Invalid character
    assert is_valid_email("user@domain.com\\") == False  # Invalid character
    assert is_valid_email("user@domain.com`") == False  # Invalid character
    assert is_valid_email("user@domain.com~") == False  # Invalid character

    # Test edge cases
    assert is_valid_email("user@domain.c") == True  # Valid with single character TLD
    assert is_valid_email("user@domain.com") == True  # Valid basic case
    assert is_valid_email("user@domain.com.") == False  # Invalid due to trailing dot
    assert is_valid_email("user@.com") == False  # Invalid due to missing local part
    assert is_valid_email(".user@domain.com") == False  # Invalid due to leading dot in local part
    assert is_valid_email("user.@domain.com") == False  # Invalid due to trailing dot in local part
    assert is_valid_email("user@domain..com") == False  # Invalid due to consecutive dots in domain
    assert is_valid_email("user@domain.c1") == True  # Valid with alphanumeric TLD
    assert is_valid_email("user@domain.c-1") == False  # Invalid character in TLD
    assert is_valid_email("user@domain.c_1") == False  # Invalid character in TLD
    assert is_valid_email("user@domain.c1.com") == True  # Valid with subdomain
    assert is_valid_email("user@domain.com.") == False  # Invalid due to trailing dot
    assert is_valid_email("user@domain.com..") == False  # Invalid due to consecutive dots
    assert is_valid_email("user@domain..com") == False  # Invalid due to consecutive dots
    assert is_valid_email("user@domain.com..") == False  # Invalid due to consecutive dots
    assert is_valid_email("user@domain.com.") == False  # Invalid due to trailing dot
    assert is_valid_email("user@domain.com..") == False  # Invalid due to consecutive dots
    assert is_valid_email("user@domain.com.") == False  # Invalid due to trailing dot
    assert is_valid_email("user@domain.com..") == False  # Invalid due to consecutive dots
    assert is_valid_email("user@domain.com.") == False  # Invalid due to trailing dot
    assert is_valid_email("user@domain.com..") == False  # Invalid due to consecutive dots
    assert is_valid_email("user@domain.com.") == False  # Invalid due to trailing dot
    assert is_valid_email("user@domain.com..") == False  # Invalid due to consecutive dots
    assert is_valid_email("user@domain.com.") == False  # Invalid due to trailing dot
    assert is_valid_email("user@domain.com..") == False  # Invalid due to consecutive dots
    assert is_valid_email("user@domain.com.") == False  # Invalid due to trailing dot
    assert is_valid_email("user@domain.com..") == False  # Invalid due to consecutive dots
    assert is_valid_email("user@domain.com.") == False  # Invalid due to trailing dot
    assert is_valid_email("user@domain.com..") == False  # Invalid due to consecutive dots
    assert is_valid_email("user@domain.com.") == False  # Invalid due to trailing dot
    assert is_valid_email("user@domain.com..") == False  # Invalid due to consecutive dots
    assert is_valid_email("user@domain.com.") == False  # Invalid due to trailing dot
    assert is_valid_email("user@domain.com..") == False  # Invalid due to consecutive dots
    assert is_valid_email("user@domain.com.") == False  # Invalid due to trailing dot
    assert is_valid_email("user@domain.com..") == False  # Invalid due to consecutive dots
    assert is_valid_email("user@domain.com.") == False  # Invalid due to trailing dot
    assert is_valid_email("user@domain.com..") == False  # Invalid due to consecutive dots
    assert is_valid_email("user@domain.com.") == False  # Invalid due to trailing dot
    assert is_valid_email("user@domain.com..") == False  # Invalid due to consecutive dots
    assert is_valid_email("user@domain.com.") == False  # Invalid due to trailing dot
    assert is_valid_email("user@domain.com..") == False  # Invalid due to consecutive dots
    assert is_valid_email("user@domain.com.") == False  # Invalid due to trailing dot
    assert is_valid_email("user@domain.com..") == False  # Invalid due to consecutive dots
    assert is_valid_email("user@domain.com.") == False  # Invalid due to trailing dot
    assert is_valid_email("user@domain.com..") == False  # Invalid due to consecutive dots
    assert