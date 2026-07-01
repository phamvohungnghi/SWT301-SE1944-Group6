import pytest

def test_bubble_sort_none_input():
    assert bubble_sort(None) is None

def test_bubble_sort_empty_list():
    assert bubble_sort([]) == []

def test_bubble_sort_single_element():
    assert bubble_sort([42]) == [42]

def test_bubble_sort_sorted_list():
    assert bubble_sort([1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

def test_bubble_sort_reverse_sorted_list():
    assert bubble_sort([5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5]

def test_bubble_sort_unsorted_list():
    assert bubble_sort([3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5]) == [1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9]

def test_bubble_sort_duplicates():
    assert bubble_sort([4, 2, 2, 4, 1, 1]) == [1, 1, 2, 2, 4, 4]

def test_bubble_sort_negative_numbers():
    assert bubble_sort([-3, -1, -4, -2, 0]) == [-4, -3, -2, -1, 0]

def test_bubble_sort_mixed_numbers():
    assert bubble_sort([3, -1, 4, 0, -5, 2]) == [-5, -1, 0, 2, 3, 4]

def test_bubble_sort_large_numbers():
    assert bubble_sort([1000000, 999999, 1000001]) == [999999, 1000000, 1000001]

def test_bubble_sort_floats():
    assert bubble_sort([3.1, 2.2, 1.3, 4.4]) == [1.3, 2.2, 3.1, 4.4]

def test_bubble_sort_mixed_types():
    with pytest.raises(TypeError):
        bubble_sort([1, "two", 3])