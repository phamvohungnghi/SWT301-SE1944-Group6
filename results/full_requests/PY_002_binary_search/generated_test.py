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

def test_binary_search_empty():
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

def test_binary_search_target_at_start():
    assert binary_search([1, 2, 3, 4, 5], 1) == 0

def test_binary_search_target_at_end():
    assert binary_search([1, 2, 3, 4, 5], 5) == 4

def test_binary_search_target_in_middle():
    assert binary_search([1, 2, 3, 4, 5], 3) == 2

def test_binary_search_negative_numbers():
    assert binary_search([-5, -3, -1, 0, 2, 4], -3) == 1
    assert binary_search([-5, -3, -1, 0, 2, 4], -6) == -1

def test_binary_search_large_numbers():
    assert binary_search([100, 200, 300, 400, 500], 300) == 2
    assert binary_search([100, 200, 300, 400, 500], 600) == -1

def test_binary_search_duplicates():
    assert binary_search([1, 2, 2, 2, 3], 2) == 1  # First occurrence
    assert binary_search([1, 2, 2, 2, 3], 1) == 0
    assert binary_search([1, 2, 2, 2, 3], 3) == 4
    assert binary_search([1, 2, 2, 2, 3], 4) == -1