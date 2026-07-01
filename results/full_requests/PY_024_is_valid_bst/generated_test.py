import pytest

def test_is_valid_bst():
    # Test case 1: Empty tree
    assert is_valid_bst([], -1) == True

    # Test case 2: Single node tree
    nodes = [{"val": 10}]
    assert is_valid_bst(nodes, 0) == True

    # Test case 3: Valid BST with multiple nodes
    nodes = [
        {"val": 10, "left": 1, "right": 2},
        {"val": 5, "left": -1, "right": -1},
        {"val": 15, "left": -1, "right": -1}
    ]
    assert is_valid_bst(nodes, 0) == True

    # Test case 4: Invalid BST due to left child
    nodes = [
        {"val": 10, "left": 1, "right": 2},
        {"val": 12, "left": -1, "right": -1},
        {"val": 15, "left": -1, "right": -1}
    ]
    assert is_valid_bst(nodes, 0) == False

    # Test case 5: Invalid BST due to right child
    nodes = [
        {"val": 10, "left": 1, "right": 2},
        {"val": 5, "left": -1, "right": -1},
        {"val": 8, "left": -1, "right": -1}
    ]
    assert is_valid_bst(nodes, 0) == False

    # Test case 6: Invalid BST due to out-of-bounds left child index
    nodes = [
        {"val": 10, "left": 3, "right": 2},
        {"val": 5, "left": -1, "right": -1},
        {"val": 15, "left": -1, "right": -1}
    ]
    assert is_valid_bst(nodes, 0) == False

    # Test case 7: Invalid BST due to out-of-bounds right child index
    nodes = [
        {"val": 10, "left": 1, "right": 3},
        {"val": 5, "left": -1, "right": -1},
        {"val": 15, "left": -1, "right": -1}
    ]
    assert is_valid_bst(nodes, 0) == False

    # Test case 8: Valid BST with deeper structure
    nodes = [
        {"val": 10, "left": 1, "right": 2},
        {"val": 5, "left": 3, "right": 4},
        {"val": 15, "left": -1, "right": -1},
        {"val": 3, "left": -1, "right": -1},
        {"val": 7, "left": -1, "right": -1}
    ]
    assert is_valid_bst(nodes, 0) == True

    # Test case 9: Invalid BST with deeper structure
    nodes = [
        {"val": 10, "left": 1, "right": 2},
        {"val": 5, "left": 3, "right": 4},
        {"val": 15, "left": -1, "right": -1},
        {"val": 3, "left": -1, "right": -1},
        {"val": 12, "left": -1, "right": -1}
    ]
    assert is_valid_bst(nodes, 0) == False

    # Test case 10: Invalid root index (negative)
    nodes = [{"val": 10, "left": -1, "right": -1}]
    assert is_valid_bst(nodes, -1) == True

    # Test case 11: Invalid root index (out of bounds)
    nodes = [{"val": 10, "left": -1, "right": -1}]
    assert is_valid_bst(nodes, 1) == True

    # Test case 12: Valid BST with no children specified
    nodes = [{"val": 10}]
    assert is_valid_bst(nodes, 0) == True

    # Test case 13: Invalid BST due to missing "val" key
    nodes = [{"left": -1, "right": -1}]
    with pytest.raises(KeyError):
        is_valid_bst(nodes, 0)