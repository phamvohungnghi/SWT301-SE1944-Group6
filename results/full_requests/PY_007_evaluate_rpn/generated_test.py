import pytest

def test_evaluate_rpn_empty_expression():
    from PY_007_evaluate_rpn import evaluate_rpn
    assert evaluate_rpn("") == 0

def test_evaluate_rpn_single_number():
    from PY_007_evaluate_rpn import evaluate_rpn
    assert evaluate_rpn("42") == 42

def test_evaluate_rpn_simple_addition():
    from PY_007_evaluate_rpn import evaluate_rpn
    assert evaluate_rpn("3 4 +") == 7

def test_evaluate_rpn_simple_subtraction():
    from PY_007_evaluate_rpn import evaluate_rpn
    assert evaluate_rpn("10 3 -") == 7

def test_evaluate_rpn_simple_multiplication():
    from PY_007_evaluate_rpn import evaluate_rpn
    assert evaluate_rpn("6 7 *") == 42

def test_evaluate_rpn_simple_division():
    from PY_007_evaluate_rpn import evaluate_rpn
    assert evaluate_rpn("8 2 /") == 4

def test_evaluate_rpn_division_by_zero():
    from PY_007_evaluate_rpn import evaluate_rpn
    assert evaluate_rpn("8 0 /") == 0

def test_evaluate_rpn_invalid_token():
    from PY_007_evaluate_rpn import evaluate_rpn
    assert evaluate_rpn("3 4 + foo") == 0

def test_evaluate_rpn_insufficient_operands():
    from PY_007_evaluate_rpn import evaluate_rpn
    assert evaluate_rpn("3 +") == 0

def test_evaluate_rpn_multiple_numbers_without_operator():
    from PY_007_evaluate_rpn import evaluate_rpn
    assert evaluate_rpn("3 4 5") == 0

def test_evaluate_rpn_complex_expression():
    from PY_007_evaluate_rpn import evaluate_rpn
    assert evaluate_rpn("5 1 2 + 4 * + 3 -") == 14

def test_evaluate_rpn_negative_result():
    from PY_007_evaluate_rpn import evaluate_rpn
    assert evaluate_rpn("3 5 -") == -2

def test_evaluate_rpn_large_numbers():
    from PY_007_evaluate_rpn import evaluate_rpn
    assert evaluate_rpn("1000000 2000000 +") == 3000000

def test_evaluate_rpn_float_input():
    from PY_007_evaluate_rpn import evaluate_rpn
    assert evaluate_rpn("3.5 2 +") == 0

def test_evaluate_rpn_extra_operators():
    from PY_007_evaluate_rpn import evaluate_rpn
    assert evaluate_rpn("3 4 + +") == 0

def test_evaluate_rpn_multiple_divisions():
    from PY_007_evaluate_rpn import evaluate_rpn
    assert evaluate_rpn("100 5 / 2 /") == 10

def test_evaluate_rpn_multiple_operations():
    from PY_007_evaluate_rpn import evaluate_rpn
    assert evaluate_rpn("2 3 + 5 * 6 -") == 19

def test_evaluate_rpn_non_integer_input():
    from PY_007_evaluate_rpn import evaluate_rpn
    assert evaluate_rpn("3 a +") == 0

def test_evaluate_rpn_whitespace_handling():
    from PY_007_evaluate_rpn import evaluate_rpn
    assert evaluate_rpn("   3   4   +   ") == 7