import pytest

def test_merge_intervals():
    # Test with no intervals
    assert merge_intervals([]) == []

    # Test with a single interval
    assert merge_intervals([[1, 3]]) == [[1, 3]]

    # Test with non-overlapping intervals
    assert merge_intervals([[1, 2], [3, 4]]) == [[1, 2], [3, 4]]

    # Test with overlapping intervals
    assert merge_intervals([[1, 3], [2, 4]]) == [[1, 4]]
    assert merge_intervals([[1, 4], [2, 3]]) == [[1, 4]]

    # Test with intervals that touch but do not overlap
    assert merge_intervals([[1, 2], [2, 3]]) == [[1, 3]]

    # Test with multiple overlapping intervals
    assert merge_intervals([[1, 5], [2, 3], [4, 6]]) == [[1, 6]]

    # Test with intervals in reverse order
    assert merge_intervals([[5, 6], [1, 3], [2, 4]]) == [[1, 6]]

    # Test with invalid intervals (start greater than end)
    assert merge_intervals([[1, 3], [4, 2]]) == []
    assert merge_intervals([[1, 2], [3, 1]]) == []

    # Test with intervals containing invalid lengths
    assert merge_intervals([[1, 2], [3]]) == []
    assert merge_intervals([[1, 2], [3, 4, 5]]) == []

    # Test with large intervals
    assert merge_intervals([[1, 1000], [500, 1500], [2000, 3000]]) == [[1, 1500], [2000, 3000]]

    # Test with negative intervals
    assert merge_intervals([[-3, -1], [-2, 0], [1, 2]]) == [[-3, 0], [1, 2]]

    # Test with mixed positive and negative intervals
    assert merge_intervals([[-1, 1], [2, 3], [0, 2]]) == [[-1, 3]]