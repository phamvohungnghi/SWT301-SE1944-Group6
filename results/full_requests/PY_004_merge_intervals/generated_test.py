import pytest

from your_module import merge_intervals  # Replace 'your_module' with the actual module name

def test_merge_intervals_empty_input():
    assert merge_intervals([]) == []

def test_merge_intervals_single_interval():
    assert merge_intervals([[1, 2]]) == [[1, 2]]

def test_merge_intervals_no_overlap():
    assert merge_intervals([[1, 2], [3, 4], [5, 6]]) == [[1, 2], [3, 4], [5, 6]]

def test_merge_intervals_with_overlap():
    assert merge_intervals([[1, 3], [2, 4], [5, 7]]) == [[1, 4], [5, 7]]

def test_merge_intervals_fully_nested_intervals():
    assert merge_intervals([[1, 10], [2, 5], [6, 9]]) == [[1, 10]]

def test_merge_intervals_adjacent_intervals():
    assert merge_intervals([[1, 2], [2, 3], [3, 4]]) == [[1, 4]]

def test_merge_intervals_unsorted_input():
    assert merge_intervals([[5, 6], [1, 3], [2, 4]]) == [[1, 4], [5, 6]]

def test_merge_intervals_invalid_interval_start_greater_than_end():
    assert merge_intervals([[5, 4], [1, 3]]) == []

def test_merge_intervals_invalid_interval_length_not_two():
    assert merge_intervals([[1, 3, 5], [2, 4]]) == []

def test_merge_intervals_mixed_valid_and_invalid_intervals():
    assert merge_intervals([[1, 3], [5, 4], [2, 4]]) == []

def test_merge_intervals_large_input():
    intervals = [[i, i + 1] for i in range(0, 1000, 2)]
    expected = [[0, 1000]]
    assert merge_intervals(intervals) == expected

def test_merge_intervals_negative_intervals():
    assert merge_intervals([[-10, -5], [-6, -3], [-2, 0]]) == [[-10, -3], [-2, 0]]

def test_merge_intervals_mixed_positive_and_negative_intervals():
    assert merge_intervals([[-5, -1], [-2, 3], [4, 6]]) == [[-5, 3], [4, 6]]

def test_merge_intervals_single_point_intervals():
    assert merge_intervals([[1, 1], [2, 2], [3, 3]]) == [[1, 1], [2, 2], [3, 3]]

def test_merge_intervals_overlapping_and_adjacent():
    assert merge_intervals([[1, 5], [5, 10], [10, 15]]) == [[1, 15]]