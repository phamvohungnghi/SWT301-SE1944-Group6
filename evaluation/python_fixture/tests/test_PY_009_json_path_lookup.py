import pytest
from python_functions import json_path_lookup

def test_json_path_lookup_with_none_data():
    assert json_path_lookup(None, "a.b") is None

def test_json_path_lookup_with_empty_path():
    assert json_path_lookup({"a": 1}, "") is None

def test_json_path_lookup_with_nonexistent_key():
    assert json_path_lookup({"a": 1}, "b") is None

def test_json_path_lookup_with_nested_dict():
    data = {"a": {"b": {"c": 1}}}
    assert json_path_lookup(data, "a.b.c") == 1

def test_json_path_lookup_with_list_index():
    data = {"a": [1, 2, 3]}
    assert json_path_lookup(data, "a.1") == 2

def test_json_path_lookup_with_invalid_list_index():
    data = {"a": [1, 2, 3]}
    assert json_path_lookup(data, "a.3") is None

def test_json_path_lookup_with_non_digit_key_in_list():
    data = {"a": [1, 2, 3]}
    assert json_path_lookup(data, "a.b") is None

def test_json_path_lookup_with_empty_dict():
    data = {}
    assert json_path_lookup(data, "a") is None

def test_json_path_lookup_with_complex_structure():
    data = {"a": {"b": [1, 2, {"c": 3}]}}
    assert json_path_lookup(data, "a.b.2.c") == 3

def test_json_path_lookup_with_multiple_levels():
    data = {"x": {"y": {"z": 42}}}
    assert json_path_lookup(data, "x.y.z") == 42

def test_json_path_lookup_with_list_of_dicts():
    data = {"items": [{"id": 1}, {"id": 2}]}
    assert json_path_lookup(data, "items.1.id") == 2

def test_json_path_lookup_with_invalid_path():
    data = {"a": {"b": 1}}
    assert json_path_lookup(data, "a.b.c") is None

def test_json_path_lookup_with_numeric_key_in_dict():
    data = {1: "one", 2: "two"}
    assert json_path_lookup(data, "1") == "one"

def test_json_path_lookup_with_mixed_types():
    data = {"a": [1, {"b": 2}, 3]}
    assert json_path_lookup(data, "a.1.b") == 2

def test_json_path_lookup_with_none_in_path():
    data = {"a": {"b": None}}
    assert json_path_lookup(data, "a.b") is None

def test_json_path_lookup_with_path_to_none_value():
    data = {"a": {"b": {"c": None}}}
    assert json_path_lookup(data, "a.b.c") is None

def test_json_path_lookup_with_path_to_empty_list():
    data = {"a": {"b": []}}
    assert json_path_lookup(data, "a.b.0") is None

def test_json_path_lookup_with_path_to_empty_dict():
    data = {"a": {"b": {}}}
    assert json_path_lookup(data, "a.b.c") is None

def test_json_path_lookup_with_path_to_nonexistent_list_index():
    data = {"a": [1, 2, 3]}
    assert json_path_lookup(data, "a.5") is None

def test_json_path_lookup_with_path_to_nonexistent_dict_key():
    data = {"a": {"b": 1}}
    assert json_path_lookup(data, "a.c") is None

def test_json_path_lookup_with_path_to_nested_empty_dict():
    data = {"a": {"b": {}}}
    assert json_path_lookup(data, "a.b.c") is None

def test_json_path_lookup_with_path_to_nested_empty_list():
    data = {"a": {"b": []}}
    assert json_path_lookup(data, "a.b.0") is None