from python_functions import is_valid_bst

def test_is_valid_bst():
    # Test case 1: Empty tree
    assert is_valid_bst([], 0) == True

    # Test case 2: Single node tree
    assert is_valid_bst([{"val": 10}], 0) == True

    # Test case 3: Valid BST
    assert is_valid_bst([{"val": 10, "left": 1, "right": 2}, {"val": 5}, {"val": 15}], 0) == True

    # Test case 4: Invalid BST (left child greater than parent)
    assert is_valid_bst([{"val": 10, "left": 1, "right": 2}, {"val": 15}, {"val": 5}], 0) == False

    # Test case 5: Invalid BST (right child less than parent)
    assert is_valid_bst([{"val": 10, "left": 1, "right": 2}, {"val": 5}, {"val": 12}], 0) == False

    # Test case 6: Valid BST with negative values
    assert is_valid_bst([{"val": 0, "left": 1, "right": 2}, {"val": -1}, {"val": 1}], 0) == True

    # Test case 7: Invalid BST with negative values
    assert is_valid_bst([{"val": 0, "left": 1, "right": 2}, {"val": 1}, {"val": -1}], 0) == False

    # Test case 8: Tree with multiple levels
    assert is_valid_bst([{"val": 4, "left": 1, "right": 3}, {"val": 2, "left": 4, "right": 5}, {"val": 6}], 0) == True

    # Test case 9: Invalid BST with multiple levels
    assert is_valid_bst([{"val": 4, "left": 1, "right": 3}, {"val": 5, "left": 4, "right": 2}, {"val": 6}], 0) == False

    # Test case 10: Root index out of bounds
    assert is_valid_bst([{"val": 10}], 1) == True
    assert is_valid_bst([{"val": 10}], -1) == True

    # Test case 11: Non-existent nodes
    assert is_valid_bst([{"val": 10, "left": 1, "right": 2}, {"val": 5}, {"val": 15}], 3) == True
    assert is_valid_bst([{"val": 10, "left": 1, "right": 2}, {"val": 5}, {"val": 15}], -1) == True

    # Test case 12: All left children
    assert is_valid_bst([{"val": 3, "left": 2, "right": -1}, {"val": 2, "left": 1, "right": -1}, {"val": 1}], 0) == True

    # Test case 13: All right children
    assert is_valid_bst([{"val": 1, "left": -1, "right": 1}, {"val": 2, "left": -1, "right": 1}, {"val": 3}], 0) == True

    # Test case 14: Invalid due to duplicate values
    assert is_valid_bst([{"val": 10, "left": 1, "right": 2}, {"val": 10}, {"val": 15}], 0) == False

    # Test case 15: Large tree
    nodes = [{"val": i} for i in range(100)]
    for i in range(50):
        nodes[i]["left"] = 2 * i + 1
        nodes[i]["right"] = 2 * i + 2
    assert is_valid_bst(nodes, 0) == True

    # Test case 16: Large tree with invalid structure
    nodes[50]["val"] = 200  # Making a node invalid
    assert is_valid_bst(nodes, 0) == False