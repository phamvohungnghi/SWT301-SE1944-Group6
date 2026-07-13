def test_is_valid_bst():
    # Test case 1: Empty tree
    assert is_valid_bst([], 0) == True

    # Test case 2: Single node tree
    assert is_valid_bst([{"val": 10}], 0) == True

    # Test case 3: Valid BST
    nodes = [{"val": 10, "left": 1, "right": 2}, {"val": 5}, {"val": 15}]
    assert is_valid_bst(nodes, 0) == True

    # Test case 4: Invalid BST (left child greater than parent)
    nodes = [{"val": 10, "left": 1, "right": 2}, {"val": 15}, {"val": 5}]
    assert is_valid_bst(nodes, 0) == False

    # Test case 5: Invalid BST (right child less than parent)
    nodes = [{"val": 10, "left": 1, "right": 2}, {"val": 5}, {"val": 10}]
    assert is_valid_bst(nodes, 0) == False

    # Test case 6: Invalid BST (out of bounds left child)
    nodes = [{"val": 10, "left": 1, "right": 2}, {"val": 5, "left": -1, "right": -1}, {"val": 15}]
    assert is_valid_bst(nodes, 0) == True

    # Test case 7: Invalid BST (out of bounds right child)
    nodes = [{"val": 10, "left": 1, "right": 2}, {"val": 5}, {"val": 15, "left": -1, "right": 3}]
    assert is_valid_bst(nodes, 0) == False

    # Test case 8: Valid BST with negative values
    nodes = [{"val": 0, "left": 1, "right": 2}, {"val": -1}, {"val": 1}]
    assert is_valid_bst(nodes, 0) == True

    # Test case 9: Invalid BST with negative values
    nodes = [{"val": 0, "left": 1, "right": 2}, {"val": 1}, {"val": -1}]
    assert is_valid_bst(nodes, 0) == False

    # Test case 10: Root index out of bounds
    assert is_valid_bst(nodes, 3) == True

    # Test case 11: Invalid BST with duplicate values
    nodes = [{"val": 10, "left": 1, "right": 2}, {"val": 10}, {"val": 15}]
    assert is_valid_bst(nodes, 0) == False

    # Test case 12: Valid BST with large values
    nodes = [{"val": 2**31 - 1, "left": 1, "right": 2}, {"val": 2**31 - 2}, {"val": 2**31 - 3}]
    assert is_valid_bst(nodes, 0) == True

    # Test case 13: Invalid BST with large values
    nodes = [{"val": 2**31 - 1, "left": 1, "right": 2}, {"val": 2**31}, {"val": 2**31 - 2}]
    assert is_valid_bst(nodes, 0) == False

    # Test case 14: Valid BST with complex structure
    nodes = [{"val": 20, "left": 1, "right": 2}, {"val": 10, "left": 3, "right": 4}, {"val": 30}, {"val": 5}, {"val": 15}]
    assert is_valid_bst(nodes, 0) == True

    # Test case 15: Invalid BST with complex structure
    nodes = [{"val": 20, "left": 1, "right": 2}, {"val": 10, "left": 3, "right": 4}, {"val": 30}, {"val": 25}, {"val": 15}]
    assert is_valid_bst(nodes, 0) == False