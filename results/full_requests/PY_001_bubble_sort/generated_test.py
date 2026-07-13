import pytest

from your_module import bubble_sort  # Replace 'your_module' with the actual module name

def test_bubble_sort_normal_case():
    assert bubble_sort([64, 34, 25, 12, 22, 11, 90]) == [11, 12, 22, 25, 34, 64, 90]

def test_bubble_sort_already_sorted():
    assert bubble_sort([1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

def test_bubble_sort_reverse_sorted():
    assert bubble_sort([5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5]

def test_bubble_sort_empty():
    assert bubble_sort([]) == []

def test_bubble_sort_single_element():
    assert bubble_sort([42]) == [42]

def test_bubble_sort_none():
    assert bubble_sort(None) is None

def test_bubble_sort_negative_numbers():
    assert bubble_sort([-1, -3, -2, 0, 2, 1]) == [-3, -2, -1, 0, 1, 2]

def test_bubble_sort_floats():
    assert bubble_sort([1.1, 2.2, 0.5, 3.3]) == [0.5, 1.1, 2.2, 3.3]

def test_bubble_sort_duplicates():
    assert bubble_sort([3, 1, 2, 3, 2, 1]) == [1, 1, 2, 2, 3, 3]

def test_bubble_sort_large_numbers():
    assert bubble_sort([1000000, 500000, 10000000, 0]) == [0, 500000, 1000000, 10000000]

def test_bubble_sort_large_array():
    assert bubble_sort(list(range(1000, 0, -1))) == list(range(1, 1001))