import pytest

def parse_query_string(qs):
    if not qs:
        return {}
    if qs.startswith("?"):
        qs = qs[1:]
    result = {}
    pairs = qs.split("&")
    for pair in pairs:
        if not pair:
            continue
        if "=" in pair:
            parts = pair.split("=", 1)
            key, val = parts[0], parts[1]
        else:
            key, val = pair, ""
        if key in result:
            if isinstance(result[key], list):
                result[key].append(val)
            else:
                result[key] = [result[key], val]
        else:
            result[key] = val
    return result

def test_parse_query_string_empty():
    assert parse_query_string("") == {}

def test_parse_query_string_no_query():
    assert parse_query_string("?") == {}

def test_parse_query_string_single_key_value():
    assert parse_query_string("key=value") == {"key": "value"}

def test_parse_query_string_single_key_no_value():
    assert parse_query_string("key=") == {"key": ""}

def test_parse_query_string_multiple_keys():
    assert parse_query_string("key1=value1&key2=value2") == {"key1": "value1", "key2": "value2"}

def test_parse_query_string_multiple_keys_with_empty_values():
    assert parse_query_string("key1=&key2=") == {"key1": "", "key2": ""}

def test_parse_query_string_key_with_multiple_values():
    assert parse_query_string("key=value1&key=value2") == {"key": ["value1", "value2"]}

def test_parse_query_string_key_with_empty_and_value():
    assert parse_query_string("key=&key=value") == {"key": ["", "value"]}

def test_parse_query_string_key_with_no_value_and_empty_key():
    assert parse_query_string("key1=&key2") == {"key1": "", "key2": ""}

def test_parse_query_string_ignore_empty_pairs():
    assert parse_query_string("key1=value1&&key2=value2") == {"key1": "value1", "key2": "value2"}

def test_parse_query_string_multiple_keys_with_special_characters():
    assert parse_query_string("key1=value1&key2=value2%20with%20spaces") == {"key1": "value1", "key2": "value2 with spaces"}

def test_parse_query_string_key_with_no_value_and_special_characters():
    assert parse_query_string("key1=value1&key2") == {"key1": "value1", "key2": ""}