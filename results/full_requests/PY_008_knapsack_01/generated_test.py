import pytest

def test_knapsack_01():
    # Test case 1: Basic test with a few items
    weights = [1, 2, 3]
    values = [10, 15, 40]
    capacity = 6
    assert knapsack_01(weights, values, capacity) == 55

    # Test case 2: Exact fit
    weights = [1, 2, 3]
    values = [10, 15, 40]
    capacity = 3
    assert knapsack_01(weights, values, capacity) == 25

    # Test case 3: No items
    weights = []
    values = []
    capacity = 5
    assert knapsack_01(weights, values, capacity) == 0

    # Test case 4: Capacity is zero
    weights = [1, 2, 3]
    values = [10, 15, 40]
    capacity = 0
    assert knapsack_01(weights, values, capacity) == 0

    # Test case 5: Weights and values length mismatch
    weights = [1, 2]
    values = [10]
    capacity = 5
    assert knapsack_01(weights, values, capacity) == 0

    # Test case 6: All items too heavy
    weights = [10, 20, 30]
    values = [60, 100, 120]
    capacity = 5
    assert knapsack_01(weights, values, capacity) == 0

    # Test case 7: Single item fits
    weights = [5]
    values = [10]
    capacity = 5
    assert knapsack_01(weights, values, capacity) == 10

    # Test case 8: Single item too heavy
    weights = [10]
    values = [10]
    capacity = 5
    assert knapsack_01(weights, values, capacity) == 0

    # Test case 9: Multiple items, some fit
    weights = [1, 2, 3, 8]
    values = [20, 5, 10, 40]
    capacity = 9
    assert knapsack_01(weights, values, capacity) == 65

    # Test case 10: Large capacity with small items
    weights = [1, 2, 3]
    values = [10, 15, 40]
    capacity = 100
    assert knapsack_01(weights, values, capacity) == 65

    # Test case 11: Large values and weights
    weights = [10, 20, 30]
    values = [60, 100, 120]
    capacity = 50
    assert knapsack_01(weights, values, capacity) == 220

    # Test case 12: Edge case with negative capacity
    weights = [1, 2, 3]
    values = [10, 15, 40]
    capacity = -5
    assert knapsack_01(weights, values, capacity) == 0

    # Test case 13: Edge case with empty weights and non-empty values
    weights = []
    values = [10, 15, 40]
    capacity = 5
    assert knapsack_01(weights, values, capacity) == 0

    # Test case 14: Edge case with empty values and non-empty weights
    weights = [1, 2, 3]
    values = []
    capacity = 5
    assert knapsack_01(weights, values, capacity) == 0

    # Test case 15: Large input test
    weights = list(range(1, 101))
    values = list(range(1, 101))
    capacity = 100
    assert knapsack_01(weights, values, capacity) == 5050