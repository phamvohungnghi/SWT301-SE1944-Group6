import pytest

from your_module import json_path_lookup  # Replace 'your_module' with the actual module name

def test_json_path_lookup_valid_dict_path():
    data = {"a": {"b": {"c": "value"}}}
    path = "a.b.c"
    assert json_path_lookup(data, path) == "value"

def test_json_path_lookup_valid_list_path():
    data = {"a": [10, 20, 30]}
    path = "a.1"
    assert json_path_lookup(data, path) == 20

def test_json_path_lookup_empty_path():
    data = {"a": {"b": "value"}}
    path = ""
    assert json_path_lookup(data, path) is None

def test_json_path_lookup_none_data():
    data = None
    path = "a.b.c"
    assert json_path_lookup(data, path) is None

def test_json_path_lookup_key_not_found():
    data = {"a": {"b": "value"}}
    path = "a.c"
    assert json_path_lookup(data, path) is None

def test_json_path_lookup_index_out_of_range():
    data = {"a": [10, 20, 30]}
    path = "a.5"
    assert json_path_lookup(data, path) is None

def test_json_path_lookup_invalid_index_in_list():
    data = {"a": [10, 20, 30]}
    path = "a.one"
    assert json_path_lookup(data, path) is None

def test_json_path_lookup_non_dict_or_list():
    data = {"a": "string_value"}
    path = "a.b"
    assert json_path_lookup(data, path) is None

def test_json_path_lookup_empty_dict():
    data = {}
    path = "a.b.c"
    assert json_path_lookup(data, path) is None

def test_json_path_lookup_empty_list():
    data = {"a": []}
    path = "a.0"
    assert json_path_lookup(data, path) is None

def test_json_path_lookup_nested_list():
    data = {"a": [[1, 2], [3, 4]]}
    path = "a.1.0"
    assert json_path_lookup(data, path) == 3

def test_json_path_lookup_nested_list_out_of_range():
    data = {"a": [[1, 2], [3, 4]]}
    path = "a.2.0"
    assert json_path_lookup(data, path) is None

def test_json_path_lookup_mixed_types():
    data = {"a": {"b": [10, {"c": "value"}]}}
    path = "a.b.1.c"
    assert json_path_lookup(data, path) == "value"

def test_json_path_lookup_root_level_key():
    data = {"key": "value"}
    path = "key"
    assert json_path_lookup(data, path) == "value"

def test_json_path_lookup_root_level_list():
    data = [10, 20, 30]
    path = "1"
    assert json_path_lookup(data, path) == 20

def test_json_path_lookup_root_level_list_out_of_range():
    data = [10, 20, 30]
    path = "5"
    assert json_path_lookup(data, path) is None

def test_json_path_lookup_root_level_list_invalid_index():
    data = [10, 20, 30]
    path = "one"
    assert json_path_lookup(data, path) is None

def test_json_path_lookup_non_string_path():
    data = {"a": {"b": "value"}}
    path = None
    assert json_path_lookup(data, path) is None

def test_json_path_lookup_nonexistent_nested_key():
    data = {"a": {"b": {"c": "value"}}}
    path = "a.b.d"
    assert json_path_lookup(data, path) is None

def test_json_path_lookup_partial_path():
    data = {"a": {"b": {"c": "value"}}}
    path = "a.b"
    assert json_path_lookup(data, path) == {"c": "value"}