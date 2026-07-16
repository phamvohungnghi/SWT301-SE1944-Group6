import pytest
from python_functions import binary_search

def test_binary_search_found():
    assert binary_search([1, 2, 3, 4, 5], 3) == 2
    assert binary_search([1, 2, 3, 4, 5], 1) == 0
    assert binary_search([1, 2, 3, 4, 5], 5) == 4

def test_binary_search_not_found():
    assert binary_search([1, 2, 3, 4, 5], 0) == -1
    assert binary_search([1, 2, 3, 4, 5], 6) == -1
    assert binary_search([1, 2, 3, 4, 5], 10) == -1

def test_binary_search_empty_array():
    assert binary_search([], 1) == -1

def test_binary_search_single_element_found():
    assert binary_search([1], 1) == 0

def test_binary_search_single_element_not_found():
    assert binary_search([1], 2) == -1

def test_binary_search_negative_numbers():
    assert binary_search([-5, -3, -1, 0, 2], -3) == 1
    assert binary_search([-5, -3, -1, 0, 2], -6) == -1

def test_binary_search_duplicates():
    assert binary_search([1, 2, 2, 2, 3], 2) == 1  # First occurrence
    assert binary_search([1, 2, 2, 2, 3], 3) == 4

def test_binary_search_large_array():
    arr = list(range(1000000))
    assert binary_search(arr, 999999) == 999999
    assert binary_search(arr, 500000) == 500000
    assert binary_search(arr, -1) == -1
    assert binary_search(arr, 1000000) == -1

def test_binary_search_non_sorted_array():
    assert binary_search([3, 1, 4, 2, 5], 3) == -1  # Not sorted, should return -1