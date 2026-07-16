import pytest
from python_functions import evaluate_rpn

def test_evaluate_rpn_basic_operations():
    assert evaluate_rpn("3 4 +") == 7
    assert evaluate_rpn("10 2 -") == 8
    assert evaluate_rpn("2 3 *") == 6
    assert evaluate_rpn("8 4 /") == 2

def test_evaluate_rpn_multiple_operations():
    assert evaluate_rpn("2 3 + 5 *") == 25
    assert evaluate_rpn("4 5 + 2 * 3 -") == 10
    assert evaluate_rpn("3 4 + 2 * 7 -") == 7

def test_evaluate_rpn_edge_cases():
    assert evaluate_rpn("") == 0
    assert evaluate_rpn("5 0 /") == 0
    assert evaluate_rpn("5 1 0 / +") == 0
    assert evaluate_rpn("5 1 + 2 /") == 3

def test_evaluate_rpn_invalid_input():
    assert evaluate_rpn("3 4 + invalid") == 0
    assert evaluate_rpn("3 4 + 5 6") == 0
    assert evaluate_rpn("3 4 + 5 * 6 /") == 0

def test_evaluate_rpn_single_number():
    assert evaluate_rpn("42") == 42
    assert evaluate_rpn("100") == 100

def test_evaluate_rpn_zero_division():
    assert evaluate_rpn("5 0 /") == 0
    assert evaluate_rpn("10 5 0 / +") == 0

def test_evaluate_rpn_unbalanced_stack():
    assert evaluate_rpn("3 4 + 5 -") == 0
    assert evaluate_rpn("3 +") == 0
    assert evaluate_rpn("3 4 + 5 6 +") == 0

def test_evaluate_rpn_large_numbers():
    assert evaluate_rpn("1000000 2000000 +") == 3000000
    assert evaluate_rpn("1000000 2000000 *") == 2000000000000

def test_evaluate_rpn_negative_numbers():
    assert evaluate_rpn("-3 -4 +") == -7
    assert evaluate_rpn("-10 -2 -") == -8
    assert evaluate_rpn("5 -3 *") == -15

def test_evaluate_rpn_mixed_operations():
    assert evaluate_rpn("3 4 + 2 * 7 -") == 7
    assert evaluate_rpn("5 1 2 + 4 * + 3 -") == 14
    assert evaluate_rpn("3 4 + 2 * 1 -") == 13

if __name__ == "__main__":
    pytest.main()