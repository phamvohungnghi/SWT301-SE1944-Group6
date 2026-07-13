import pytest

def test_date_difference():
    # Test with valid dates
    assert date_difference("2023-10-01", "2023-10-01") == 0
    assert date_difference("2023-01-01", "2023-01-02") == 1
    assert date_difference("2020-02-29", "2021-03-01") == 366  # Leap year
    assert date_difference("2021-12-31", "2022-01-01") == 1

    # Test with None values
    assert date_difference(None, "2023-10-01") == -1
    assert date_difference("2023-10-01", None) == -1
    assert date_difference(None, None) == -1

    # Test with invalid date formats
    assert date_difference("2023-10", "2023-10-01") == -1
    assert date_difference("2023-10-01", "2023") == -1
    assert date_difference("2023-10-01", "2023-10-01-01") == -1

    # Test with invalid date values
    assert date_difference("2023-13-01", "2023-10-01") == -1  # Invalid month
    assert date_difference("2023-10-32", "2023-10-01") == -1  # Invalid day
    assert date_difference("2023-10-01", "2023-10-00") == -1  # Invalid day

    # Test with dates that are far apart
    assert date_difference("1900-01-01", "2100-01-01") == 73050  # 200 years
    assert date_difference("2000-01-01", "3000-01-01") == 365242  # 1000 years

    # Test with edge cases
    assert date_difference("2023-02-28", "2023-03-01") == 1  # End of February to start of March
    assert date_difference("2024-02-29", "2024-03-01") == 1  # Leap year end of February to start of March
    assert date_difference("2023-01-01", "2023-12-31") == 364  # Start to end of the year

    # Test with same year, different months
    assert date_difference("2023-01-01", "2023-06-01") == 151  # January to June
    assert date_difference("2023-06-01", "2023-01-01") == 151  # June to January (same dates, different order)