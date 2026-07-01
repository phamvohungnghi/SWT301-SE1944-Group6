import pytest

def test_date_difference_valid_dates():
    # Test with valid dates
    assert date_difference("2023-10-01", "2023-10-02") == 1
    assert date_difference("2023-10-01", "2023-09-30") == 1
    assert date_difference("2023-10-01", "2023-10-01") == 0
    assert date_difference("2020-02-28", "2020-03-01") == 2  # Leap year
    assert date_difference("2019-02-28", "2019-03-01") == 1  # Non-leap year
    assert date_difference("2000-01-01", "1900-01-01") == 36524  # Century leap year difference
    assert date_difference("2000-01-01", "2100-01-01") == 36524  # Non-century leap year difference

def test_date_difference_invalid_format():
    # Test with invalid date formats
    assert date_difference("2023-10-01", "2023/10/02") == -1
    assert date_difference("2023-10-01", "2023-10") == -1
    assert date_difference("2023-10-01", "2023-10-02-01") == -1
    assert date_difference("2023-10-01", "2023-13-01") == -1  # Invalid month
    assert date_difference("2023-10-01", "2023-10-32") == -1  # Invalid day
    assert date_difference("2023-10-01", "abcd-ef-gh") == -1  # Non-numeric date

def test_date_difference_none_input():
    # Test with None as input
    assert date_difference(None, "2023-10-01") == -1
    assert date_difference("2023-10-01", None) == -1
    assert date_difference(None, None) == -1

def test_date_difference_empty_string():
    # Test with empty string as input
    assert date_difference("", "2023-10-01") == -1
    assert date_difference("2023-10-01", "") == -1
    assert date_difference("", "") == -1

def test_date_difference_non_string_input():
    # Test with non-string input
    assert date_difference(20231001, "2023-10-01") == -1
    assert date_difference("2023-10-01", 20231001) == -1
    assert date_difference(20231001, 20231001) == -1
    assert date_difference(["2023-10-01"], "2023-10-01") == -1
    assert date_difference("2023-10-01", ["2023-10-01"]) == -1

def test_date_difference_large_date_difference():
    # Test with a large date difference
    assert date_difference("0001-01-01", "9999-12-31") == 3652058

def test_date_difference_edge_cases():
    # Test with edge cases
    assert date_difference("0001-01-01", "0001-01-02") == 1  # Minimum valid date
    assert date_difference("9999-12-30", "9999-12-31") == 1  # Maximum valid date
    assert date_difference("2023-02-28", "2023-03-01") == 1  # Non-leap year February
    assert date_difference("2024-02-28", "2024-03-01") == 2  # Leap year February

def test_date_difference_exception_handling():
    # Test with inputs that may raise exceptions
    assert date_difference("2023-10-01", "2023-10-01-01") == -1  # Too many parts after split
    assert date_difference("2023-10-01", "2023-10-XX") == -1  # Non-integer parts
    assert date_difference("2023-10-01", "2023-10-") == -1  # Missing day part
    assert date_difference("2023-10-01", "2023--01") == -1  # Missing month part
    assert date_difference("2023-10-01", "-10-01") == -1  # Missing year part