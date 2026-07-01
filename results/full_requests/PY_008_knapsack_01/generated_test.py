import pytest

from production_code import knapsack_01

def test_knapsack_01_empty_weights_and_values():
    assert knapsack_01([], [], 10) == 0

def test_knapsack_01_zero_capacity():
    assert knapsack_01([1, 2, 3], [10, 20, 30], 0) == 0

def test_knapsack_01_weights_values_length_mismatch():
    assert knapsack_01([1, 2], [10], 10) == 0

def test_knapsack_01_negative_capacity():
    assert knapsack_01([1, 2, 3], [10, 20, 30], -5) == 0

def test_knapsack_01_single_item_fits():
    assert knapsack_01([5], [10], 5) == 10

def test_knapsack_01_single_item_does_not_fit():
    assert knapsack_01([10], [20], 5) == 0

def test_knapsack_01_multiple_items_exact_fit():
    assert knapsack_01([1, 2, 3], [10, 20, 30], 6) == 60

def test_knapsack_01_multiple_items_partial_fit():
    assert knapsack_01([1, 2, 3], [10, 20, 30], 5) == 50

def test_knapsack_01_multiple_items_no_fit():
    assert knapsack_01([5, 6, 7], [10, 20, 30], 4) == 0

def test_knapsack_01_large_capacity():
    assert knapsack_01([1, 2, 3], [10, 20, 30], 100) == 60

def test_knapsack_01_large_weights():
    assert knapsack_01([100, 200, 300], [10, 20, 30], 50) == 0

def test_knapsack_01_large_values():
    assert knapsack_01([1, 2, 3], [1000, 2000, 3000], 5) == 5000

def test_knapsack_01_duplicate_items():
    assert knapsack_01([1, 1, 1], [10, 10, 10], 2) == 20

def test_knapsack_01_zero_weights():
    assert knapsack_01([0, 0, 0], [10, 20, 30], 10) == 60

def test_knapsack_01_zero_values():
    assert knapsack_01([1, 2, 3], [0, 0, 0], 10) == 0

def test_knapsack_01_mixed_weights_and_values():
    assert knapsack_01([1, 3, 4, 5], [10, 40, 50, 70], 7) == 90

def test_knapsack_01_minimal_input():
    assert knapsack_01([1], [1], 1) == 1

def test_knapsack_01_large_input():
    weights = [i for i in range(1, 101)]
    values = [i * 10 for i in range(1, 101)]
    capacity = 50
    assert knapsack_01(weights, values, capacity) == 12750

def test_knapsack_01_edge_case_capacity_equals_weight():
    assert knapsack_01([5, 10, 15], [10, 20, 30], 15) == 30

def test_knapsack_01_edge_case_capacity_one_less_than_weight():
    assert knapsack_01([5, 10, 15], [10, 20, 30], 14) == 20

def test_knapsack_01_edge_case_all_items_fit():
    assert knapsack_01([1, 2, 3], [10, 20, 30], 6) == 60

def test_knapsack_01_edge_case_no_items():
    assert knapsack_01([], [], 0) == 0