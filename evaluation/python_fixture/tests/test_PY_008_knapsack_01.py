from python_functions import knapsack_01

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

    # Test case 5: Invalid input (weights and values length mismatch)
    weights = [1, 2]
    values = [10, 15, 40]
    capacity = 5
    assert knapsack_01(weights, values, capacity) == 0

    # Test case 6: All items too heavy
    weights = [10, 20, 30]
    values = [60, 100, 120]
    capacity = 5
    assert knapsack_01(weights, values, capacity) == 0

    # Test case 7: Single item fits exactly
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
    weights = [1, 2, 3, 4, 5]
    values = [1, 2, 3, 4, 5]
    capacity = 5
    assert knapsack_01(weights, values, capacity) == 15

    # Test case 10: Large capacity with multiple items
    weights = [1, 2, 3, 4, 5]
    values = [10, 20, 30, 40, 50]
    capacity = 10
    assert knapsack_01(weights, values, capacity) == 90

    # Test case 11: Edge case with negative capacity
    weights = [1, 2, 3]
    values = [10, 15, 40]
    capacity = -1
    assert knapsack_01(weights, values, capacity) == 0

    # Test case 12: Large input
    weights = [i for i in range(1, 101)]
    values = [i * 10 for i in range(1, 101)]
    capacity = 100
    assert knapsack_01(weights, values, capacity) == 5050

    # Test case 13: All items fit
    weights = [1, 2, 3, 4]
    values = [10, 20, 30, 40]
    capacity = 10
    assert knapsack_01(weights, values, capacity) == 100

    # Test case 14: No items and negative capacity
    weights = []
    values = []
    capacity = -5
    assert knapsack_01(weights, values, capacity) == 0

    # Test case 15: Large weights and values
    weights = [10, 20, 30]
    values = [60, 100, 120]
    capacity = 50
    assert knapsack_01(weights, values, capacity) == 220