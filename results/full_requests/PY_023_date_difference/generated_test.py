from python_functions import date_difference

def test_date_difference():
    # Test valid date differences
    assert date_difference("2023-10-01", "2023-10-01") == 0
    assert date_difference("2023-01-01", "2023-01-02") == 1
    assert date_difference("2023-01-01", "2024-01-01") == 365
    assert date_difference("2020-01-01", "2021-01-01") == 366  # Leap year
    assert date_difference("2021-01-01", "2020-01-01") == 366  # Leap year

    # Test invalid date formats
    assert date_difference("2023-10-01", "2023-10") == -1
    assert date_difference("2023-10-01", "2023-10-01-01") == -1
    assert date_difference("2023-10-01", "2023-10-01-01") == -1
    assert date_difference("2023-10-01", "2023-10-01-01") == -1

    # Test None inputs
    assert date_difference(None, "2023-10-01") == -1
    assert date_difference("2023-10-01", None) == -1
    assert date_difference(None, None) == -1

    # Test invalid date values
    assert date_difference("2023-13-01", "2023-10-01") == -1  # Invalid month
    assert date_difference("2023-10-32", "2023-10-01") == -1  # Invalid day
    assert date_difference("2023-10-01", "2023-10-32") == -1  # Invalid day

    # Test edge cases
    assert date_difference("0001-01-01", "0001-01-01") == 0  # Earliest date
    assert date_difference("9999-12-31", "9999-12-31") == 0  # Latest date
    assert date_difference("0001-01-01", "9999-12-31") == 3652058  # Max range
    assert date_difference("9999-12-31", "0001-01-01") == 3652058  # Max range reversed

    # Test exception handling
    assert date_difference("2023-10-01", "invalid-date") == -1
    assert date_difference("invalid-date", "2023-10-01") == -1
    assert date_difference("2023-10-01", "2023-10-01") == 0  # Valid case after invalid

    # Test same month, different years
    assert date_difference("2022-10-01", "2023-10-01") == 365
    assert date_difference("2021-10-01", "2023-10-01") == 730

    # Test same day, different months
    assert date_difference("2023-01-01", "2023-02-01") == 31
    assert date_difference("2023-01-01", "2023-03-01") == 59  # Non-leap year

    # Test same day, different years
    assert date_difference("2020-02-29", "2021-02-28") == 365  # Leap year to non-leap year
    assert date_difference("2020-02-29", "2024-02-29") == 1461  # Leap year to leap year

    # Test across years
    assert date_difference("2020-12-31", "2021-01-01") == 1
    assert date_difference("2021-01-01", "2020-12-31") == 1

    # Test large date differences
    assert date_difference("2000-01-01", "3000-01-01") == 3652425  # Roughly 1000 years
    assert date_difference("3000-01-01", "2000-01-01") == 3652425  # Roughly 1000 years reversed

    # Test negative years
    assert date_difference("-0001-01-01", "0001-01-01") == 730  # 2 years apart
    assert date_difference("0001-01-01", "-0001-01-01") == 730  # 2 years apart reversed

    # Test invalid input types
    assert date_difference(123, 456) == -1  # Non-string input
    assert date_difference("2023-10-01", 456) == -1  # Mixed input types
    assert date_difference(123, "2023-10-01") == -1  # Mixed input types
    assert date_difference(123, None) == -1  # Mixed input types
    assert date_difference(None, 456) == -1  # Mixed input types
    assert date_difference(None, None) == -1  # Mixed input types