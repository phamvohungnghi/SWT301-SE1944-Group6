import pytest

def test_binary_search_empty_array():
    assert binary_search([], 5) == -1

def test_binary_search_single_element_found():
    assert binary_search([5], 5) == 0

def test_binary_search_single_element_not_found():
    assert binary_search([5], 3) == -1

def test_binary_search_multiple_elements_found():
    assert binary_search([1, 3, 5, 7, 9], 5) == 2
    assert binary_search([1, 3, 5, 7, 9], 1) == 0
    assert binary_search([1, 3, 5, 7, 9], 9) == 4

def test_binary_search_multiple_elements_not_found():
    assert binary_search([1, 3, 5, 7, 9], 0) == -1
    assert binary_search([1, 3, 5, 7, 9], 10) == -1
    assert binary_search([1, 3, 5, 7, 9], 4) == -1

def test_binary_search_duplicates_target_found():
    assert binary_search([1, 3, 3, 3, 5, 7, 9], 3) in [1, 2, 3]

def test_binary_search_duplicates_target_not_found():
    assert binary_search([1, 3, 3, 3, 5, 7, 9], 4) == -1

def test_binary_search_large_array():
    large_array = list(range(1000))
    assert binary_search(large_array, 0) == 0
    assert binary_search(large_array, 999) == 999
    assert binary_search(large_array, 500) == 500
    assert binary_search(large_array, 1000) == -1
    assert binary_search(large_array, -1) == -1

def test_binary_search_negative_numbers():
    assert binary_search([-10, -5, 0, 5, 10], -10) == 0
    assert binary_search([-10, -5, 0, 5, 10], -5) == 1
    assert binary_search([-10, -5, 0, 5, 10], 0) == 2
    assert binary_search([-10, -5, 0, 5, 10], 5) == 3
    assert binary_search([-10, -5, 0, 5, 10], 10) == 4
    assert binary_search([-10, -5, 0, 5, 10], -15) == -1
    assert binary_search([-10, -5, 0, 5, 10], 15) == -1

def test_binary_search_floats():
    assert binary_search([1.1, 2.2, 3.3, 4.4, 5.5], 3.3) == 2
    assert binary_search([1.1, 2.2, 3.3, 4.4, 5.5], 6.6) == -1

def test_binary_search_unsorted_array():
    assert binary_search([5, 3, 1, 9, 7], 3) == -1
    assert binary_search([5, 3, 1, 9, 7], 10) == -1