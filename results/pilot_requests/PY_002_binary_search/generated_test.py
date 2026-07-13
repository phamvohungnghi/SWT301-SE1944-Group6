import pytest

def binary_search(arr, target):
    if not arr:
        return -1
    low = 0
    high = len(arr) - 1
    while low <= high:
        mid = (low + high) // 2
        if arr[mid] == target:
            return mid
        elif arr[mid] < target:
            low = mid + 1
        else:
            high = mid - 1
    return -1

def test_binary_search_empty_array():
    assert binary_search([], 1) == -1

def test_binary_search_single_element_found():
    assert binary_search([1], 1) == 0

def test_binary_search_single_element_not_found():
    assert binary_search([1], 2) == -1

def test_binary_search_multiple_elements_found():
    assert binary_search([1, 2, 3, 4, 5], 3) == 2
    assert binary_search([1, 2, 3, 4, 5], 1) == 0
    assert binary_search([1, 2, 3, 4, 5], 5) == 4

def test_binary_search_multiple_elements_not_found():
    assert binary_search([1, 2, 3, 4, 5], 0) == -1
    assert binary_search([1, 2, 3, 4, 5], 6) == -1

def test_binary_search_target_less_than_all_elements():
    assert binary_search([10, 20, 30, 40, 50], 5) == -1

def test_binary_search_target_greater_than_all_elements():
    assert binary_search([10, 20, 30, 40, 50], 60) == -1

def test_binary_search_target_at_start():
    assert binary_search([10, 20, 30, 40, 50], 10) == 0

def test_binary_search_target_at_end():
    assert binary_search([10, 20, 30, 40, 50], 50) == 4

def test_binary_search_target_in_middle():
    assert binary_search([10, 20, 30, 40, 50], 30) == 2

def test_binary_search_duplicates():
    assert binary_search([1, 2, 2, 2, 3], 2) in [1, 2, 3]  # Any index of '2' is valid
    assert binary_search([1, 1, 1, 1, 1], 1) in [0, 1, 2, 3, 4]  # Any index of '1' is valid

def test_binary_search_large_array():
    arr = list(range(1000000))
    assert binary_search(arr, 999999) == 999999
    assert binary_search(arr, 0) == 0
    assert binary_search(arr, 500000) == 500000
    assert binary_search(arr, 1000000) == -1  # Not found case