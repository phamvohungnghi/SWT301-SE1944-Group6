import pytest
from python_functions import binary_search

def test_binary_search_empty_array():
    assert binary_search([], 5) == -1

def test_binary_search_single_element_found():
    assert binary_search([5], 5) == 0

def test_binary_search_single_element_not_found():
    assert binary_search([3], 5) == -1

def test_binary_search_multiple_elements_found():
    assert binary_search([1, 2, 3, 4, 5], 3) == 2
    assert binary_search([1, 2, 3, 4, 5], 1) == 0
    assert binary_search([1, 2, 3, 4, 5], 5) == 4

def test_binary_search_multiple_elements_not_found():
    assert binary_search([1, 2, 3, 4, 5], 0) == -1
    assert binary_search([1, 2, 3, 4, 5], 6) == -1

def test_binary_search_multiple_elements_target_first():
    assert binary_search([1, 2, 3, 4, 5, 6, 7, 8, 9, 10], 1) == 0

def test_binary_search_multiple_elements_target_last():
    assert binary_search([1, 2, 3, 4, 5, 6, 7, 8, 9, 10], 10) == 9

def test_binary_search_multiple_elements_target_middle():
    assert binary_search([1, 2, 3, 4, 5, 6, 7, 8, 9, 10], 5) == 4

def test_binary_search_target_less_than_all_elements():
    assert binary_search([10, 20, 30, 40, 50], 5) == -1

def test_binary_search_target_greater_than_all_elements():
    assert binary_search([10, 20, 30, 40, 50], 60) == -1

def test_binary_search_duplicates_found():
    assert binary_search([1, 2, 2, 2, 3], 2) in [1, 2, 3]  # Any index of '2' is valid

def test_binary_search_duplicates_not_found():
    assert binary_search([1, 2, 2, 2, 3], 4) == -1

def test_binary_search_large_array():
    large_array = list(range(1000000))
    assert binary_search(large_array, 999999) == 999999
    assert binary_search(large_array, 0) == 0
    assert binary_search(large_array, 500000) == 500000
    assert binary_search(large_array, -1) == -1
    assert binary_search(large_array, 1000000) == -1

def test_binary_search_negative_numbers():
    assert binary_search([-10, -5, 0, 5, 10], -5) == 1
    assert binary_search([-10, -5, 0, 5, 10], -10) == 0
    assert binary_search([-10, -5, 0, 5, 10], 10) == 4
    assert binary_search([-10, -5, 0, 5, 10], 1) == -1

def test_binary_search_non_integer_elements():
    with pytest.raises(TypeError):
        binary_search(["a", "b", "c"], "b")  # Assuming the function should only work with integers