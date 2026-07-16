import pytest
from python_functions import bubble_sort

def test_bubble_sort_normal_cases():
    assert bubble_sort([5, 2, 9, 1, 5, 6]) == [1, 2, 5, 5, 6, 9]
    assert bubble_sort([3, 0, 2, 5, -1, 4, 1]) == [-1, 0, 1, 2, 3, 4, 5]
    assert bubble_sort([1]) == [1]
    assert bubble_sort([]) == []

def test_bubble_sort_edge_cases():
    assert bubble_sort([1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]  # Already sorted
    assert bubble_sort([5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5]  # Reverse sorted
    assert bubble_sort([1, 1, 1, 1]) == [1, 1, 1, 1]  # All elements the same

def test_bubble_sort_none_input():
    assert bubble_sort(None) is None

def test_bubble_sort_large_numbers():
    assert bubble_sort([1000000, 500000, 0, -1000000]) == [-1000000, 0, 500000, 1000000]

def test_bubble_sort_floats():
    assert bubble_sort([1.1, 2.2, 0.5, 3.3]) == [0.5, 1.1, 2.2, 3.3]

def test_bubble_sort_negative_numbers():
    assert bubble_sort([-1, -3, -2, -5, 0]) == [-5, -3, -2, -1, 0]