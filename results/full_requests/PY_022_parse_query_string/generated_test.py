import pytest
from PY_022_parse_query_string import parse_query_string

def test_parse_query_string_empty_input():
    assert parse_query_string("") == {}
    assert parse_query_string(None) == {}

def test_parse_query_string_no_question_mark():
    assert parse_query_string("key=value") == {"key": "value"}
    assert parse_query_string("key1=value1&key2=value2") == {"key1": "value1", "key2": "value2"}
    assert parse_query_string("key1=value1&key2=") == {"key1": "value1", "key2": ""}
    assert parse_query_string("key1=value1&key2") == {"key1": "value1", "key2": ""}
    assert parse_query_string("key1=value1&key2=value2&key3") == {"key1": "value1", "key2": "value2", "key3": ""}

def test_parse_query_string_with_question_mark():
    assert parse_query_string("?key=value") == {"key": "value"}
    assert parse_query_string("?key1=value1&key2=value2") == {"key1": "value1", "key2": "value2"}
    assert parse_query_string("?key1=value1&key2=") == {"key1": "value1", "key2": ""}
    assert parse_query_string("?key1=value1&key2") == {"key1": "value1", "key2": ""}
    assert parse_query_string("?key1=value1&key2=value2&key3") == {"key1": "value1", "key2": "value2", "key3": ""}

def test_parse_query_string_duplicate_keys():
    assert parse_query_string("key=value1&key=value2") == {"key": ["value1", "value2"]}
    assert parse_query_string("key=value1&key=value2&key=value3") == {"key": ["value1", "value2", "value3"]}
    assert parse_query_string("key=value1&key=&key=value3") == {"key": ["value1", "", "value3"]}
    assert parse_query_string("key=value1&key") == {"key": ["value1", ""]}

def test_parse_query_string_edge_cases():
    assert parse_query_string("?") == {}
    assert parse_query_string("&") == {}
    assert parse_query_string("&&") == {}
    assert parse_query_string("key=") == {"key": ""}
    assert parse_query_string("key") == {"key": ""}
    assert parse_query_string("key=value&") == {"key": "value"}
    assert parse_query_string("key=value&&key2=value2") == {"key": "value", "key2": "value2"}
    assert parse_query_string("key=value&&key=value2") == {"key": ["value", "value2"]}

def test_parse_query_string_special_characters():
    assert parse_query_string("key=val%20ue") == {"key": "val%20ue"}
    assert parse_query_string("key1=value1&key2=value%202") == {"key1": "value1", "key2": "value%202"}
    assert parse_query_string("key1=value1&key2=&key3=%20") == {"key1": "value1", "key2": "", "key3": "%20"}