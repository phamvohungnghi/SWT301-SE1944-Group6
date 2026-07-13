import pytest

def json_path_lookup(data, path):
    if data is None or not path:
        return None
    keys = path.split(".")
    current = data
    for key in keys:
        if isinstance(current, dict):
            if key in current:
                current = current[key]
            else:
                return None
        elif isinstance(current, list):
            if key.isdigit():
                idx = int(key)
                if 0 <= idx < len(current):
                    current = current[idx]
                else:
                    return None
            else:
                return None
        else:
            return None
    return current

def test_json_path_lookup():
    # Test with a simple dictionary
    data = {"a": {"b": {"c": 1}}}
    assert json_path_lookup(data, "a.b.c") == 1
    assert json_path_lookup(data, "a.b") == {"c": 1}
    assert json_path_lookup(data, "a.x") is None
    assert json_path_lookup(data, "x.b") is None

    # Test with a list
    data = {"a": [1, 2, 3]}
    assert json_path_lookup(data, "a.0") == 1
    assert json_path_lookup(data, "a.2") == 3
    assert json_path_lookup(data, "a.3") is None
    assert json_path_lookup(data, "a.x") is None

    # Test with nested lists and dictionaries
    data = {"a": [{"b": 1}, {"b": 2}]}
    assert json_path_lookup(data, "a.0.b") == 1
    assert json_path_lookup(data, "a.1.b") == 2
    assert json_path_lookup(data, "a.2.b") is None

    # Test with None data
    assert json_path_lookup(None, "a.b") is None
    assert json_path_lookup({"a": 1}, "") is None

    # Test with empty list
    data = {"a": []}
    assert json_path_lookup(data, "a.0") is None

    # Test with invalid path
    data = {"a": {"b": {"c": 1}}}
    assert json_path_lookup(data, "a.b.c.d") is None
    assert json_path_lookup(data, "a.b.0") is None

    # Test with non-string path
    assert json_path_lookup(data, 123) is None
    assert json_path_lookup(data, None) is None

    # Test with complex structure
    data = {"a": {"b": [1, 2, {"c": 3}]}}
    assert json_path_lookup(data, "a.b.2.c") == 3
    assert json_path_lookup(data, "a.b.3") is None
    assert json_path_lookup(data, "a.b.x") is None

    # Test with boolean values
    data = {"a": True}
    assert json_path_lookup(data, "a") is True
    assert json_path_lookup(data, "b") is None

    # Test with numeric values
    data = {"a": 42}
    assert json_path_lookup(data, "a") == 42
    assert json_path_lookup(data, "b") is None

    # Test with empty dictionary
    data = {}
    assert json_path_lookup(data, "a") is None
    assert json_path_lookup(data, "") is None

    # Test with deeply nested structure
    data = {"a": {"b": {"c": {"d": {"e": 5}}}}}
    assert json_path_lookup(data, "a.b.c.d.e") == 5
    assert json_path_lookup(data, "a.b.c.d.x") is None
    assert json_path_lookup(data, "a.b.x") is None
    assert json_path_lookup(data, "x.b.c") is None

    # Test with list of dictionaries
    data = [{"name": "Alice"}, {"name": "Bob"}]
    assert json_path_lookup(data, "0.name") == "Alice"
    assert json_path_lookup(data, "1.name") == "Bob"
    assert json_path_lookup(data, "2.name") is None
    assert json_path_lookup(data, "0.age") is None

    # Test with mixed types
    data = {"a": [1, {"b": 2}, 3]}
    assert json_path_lookup(data, "a.1.b") == 2
    assert json_path_lookup(data, "a.0") == 1
    assert json_path_lookup(data, "a.2") == 3
    assert json_path_lookup(data, "a.3") is None

    # Test with invalid index
    data = {"a": [1, 2, 3]}
    assert json_path_lookup(data, "a.3") is None
    assert json_path_lookup(data, "a.-1") is None

    # Test with invalid key in dictionary
    data = {"a": {"b": 1}}
    assert json_path_lookup(data, "a.c") is None
    assert json_path_lookup(data, "a.b.c") is None

    # Test with empty path
    assert json_path_lookup(data, "") is None
    assert json_path_lookup(data, "a.") is None

    # Test with path containing only digits
    data = [10, 20, 30]
    assert json_path_lookup(data, "0") == 10
    assert json_path_lookup(data, "1") == 20
    assert json_path_lookup(data, "2") == 30
    assert json_path_lookup(data, "3") is None

    # Test with path that is a single digit
    data = {"0": "zero", "1": "one"}
    assert json_path_lookup(data, "0") == "zero"
    assert json_path_lookup(data, "1") == "one"
    assert json_path_lookup(data, "2") is None

    # Test with path that is a single character
    data = {"a": "apple", "b": "banana"}
    assert json_path_lookup(data, "a") == "apple"
    assert json_path_lookup(data, "b") == "banana"
    assert json_path_lookup(data, "c") is None

    # Test with path that is a mix of keys and indices
    data = {"a": [{"b": 1}, {"b": 2}]}
    assert json_path_lookup(data, "a.0.b") == 1
    assert json_path_lookup(data, "a.1.b") == 2
    assert json_path_lookup(data, "a.2.b") is None
    assert json_path_lookup(data, "a.x") is None

    # Test with path that has leading/trailing dots
    data = {"a": {"b": 1}}
    assert json_path_lookup(data, ".a.b") is None
    assert json_path_lookup(data, "a.b.") is None
    assert json_path_lookup(data, ".a.b.") is None

    # Test with path that is just a dot
    assert json_path_lookup(data, ".") is None
    assert json_path_lookup(data, "..") is None

    # Test with path that is empty
    assert json_path_lookup(data, "") is None

    # Test with path that is a single space
    assert json_path_lookup(data, " ") is None

    # Test with path that is a mix of valid and invalid keys
    data = {"a": {"b": 1, "c": 2}}
    assert json_path_lookup(data, "a.b.c") is None
    assert json_path_lookup(data, "a.c.b") is None

    # Test with path that is a mix of valid and invalid indices
    data = [{"a": 1}, {"a": 2}]
    assert json_path_lookup(data, "0.a") == 1
    assert json_path_lookup(data, "1.a") == 2
    assert json_path_lookup(data, "2.a") is None
    assert json_path_lookup(data, "0.b") is None

    # Test with path that is a mix of valid keys and invalid indices
    data = {"a": [1, 2, 3]}
    assert json_path_lookup(data, "a.0") == 1
    assert json_path_lookup(data, "a.1") == 2
    assert json_path_lookup(data, "a.2") == 3
    assert json_path_lookup(data, "a.3") is None
    assert json_path_lookup(data, "a.x") is None

    # Test with path that is a mix of valid indices and invalid keys
    data = [{"a": 1}, {"b": 2}]
    assert json_path_lookup(data, "0.a") == 1
    assert json_path_lookup(data, "1.a") is None
    assert json_path_lookup(data, "0.b") is None
    assert json_path_lookup(data, "1.b") == 2

    # Test with path that is a mix of valid keys and invalid keys
    data = {"a": {"b": 1, "c": 2}}
    assert json_path_lookup(data, "a.b") == 1
    assert json_path_lookup(data, "a.c") == 2
    assert json_path_lookup(data, "a.d") is None
    assert json_path_lookup(data, "b.c") is None

    # Test with path that is a mix of valid indices and invalid indices
    data = [{"a": 1},