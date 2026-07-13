import pytest

def test_evaluate_rpn():
    # Test with a simple addition
    assert evaluate_rpn("3 4 +") == 7
    
    # Test with a simple subtraction
    assert evaluate_rpn("10 4 -") == 6
    
    # Test with a simple multiplication
    assert evaluate_rpn("2 3 *") == 6
    
    # Test with a simple division
    assert evaluate_rpn("8 2 /") == 4
    
    # Test with division by zero
    assert evaluate_rpn("8 0 /") == 0
    
    # Test with multiple operations
    assert evaluate_rpn("3 4 + 2 *") == 14  # (3 + 4) * 2
    
    # Test with mixed operations
    assert evaluate_rpn("5 1 2 + 4 * + 3 -") == 14  # 5 + (1 + 2) * 4 - 3
    
    # Test with insufficient operands
    assert evaluate_rpn("+") == 0
    assert evaluate_rpn("3 +") == 0
    assert evaluate_rpn("3 4 + +") == 0
    
    # Test with invalid token
    assert evaluate_rpn("3 4 &") == 0
    assert evaluate_rpn("3 4 + a") == 0
    
    # Test with empty expression
    assert evaluate_rpn("") == 0
    
    # Test with a single number
    assert evaluate_rpn("42") == 42
    
    # Test with negative numbers
    assert evaluate_rpn("-3 -4 +") == -7  # (-3) + (-4)
    
    # Test with large numbers
    assert evaluate_rpn("1000000 2000000 +") == 3000000
    
    # Test with a complex expression
    assert evaluate_rpn("3 4 2 * 1 5 - 2 3 ^ ^ / +") == 3  # (3 + (4 * 2) / ((1 - 5) ^ (2 ^ 3)))
    
    # Test with a single operator
    assert evaluate_rpn("+") == 0
    assert evaluate_rpn("-") == 0
    assert evaluate_rpn("*") == 0
    assert evaluate_rpn("/") == 0
    
    # Test with multiple spaces
    assert evaluate_rpn("   3   4   +   ") == 7
    assert evaluate_rpn("   10   4   -   ") == 6
    assert evaluate_rpn("   2   3   *   ") == 6
    assert evaluate_rpn("   8   2   /   ") == 4