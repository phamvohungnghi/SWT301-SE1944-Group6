from python_functions import parse_query_string

def test_parse_query_string_empty():
    assert parse_query_string("") == {}

def test_parse_query_string_no_question_mark():
    assert parse_query_string("key=value") == {"key": "value"}

def test_parse_query_string_with_question_mark():
    assert parse_query_string("?key=value") == {"key": "value"}

def test_parse_query_string_multiple_pairs():
    assert parse_query_string("key1=value1&key2=value2") == {"key1": "value1", "key2": "value2"}

def test_parse_query_string_multiple_values_for_key():
    assert parse_query_string("key=value1&key=value2") == {"key": ["value1", "value2"]}

def test_parse_query_string_key_without_value():
    assert parse_query_string("key1=value1&key2=") == {"key1": "value1", "key2": ""}

def test_parse_query_string_empty_key():
    assert parse_query_string("=value") == {"": "value"}

def test_parse_query_string_empty_value():
    assert parse_query_string("key1=&key2=value2") == {"key1": "", "key2": "value2"}

def test_parse_query_string_multiple_empty_pairs():
    assert parse_query_string("key1=value1&&key2=value2") == {"key1": "value1", "key2": "value2"}

def test_parse_query_string_no_pairs():
    assert parse_query_string("??") == {}

def test_parse_query_string_key_with_special_characters():
    assert parse_query_string("key%20with%20spaces=value%20with%20spaces") == {"key with spaces": "value with spaces"}

def test_parse_query_string_key_with_equal_sign():
    assert parse_query_string("key=val=ue") == {"key": "val=ue"}

def test_parse_query_string_value_with_equal_sign():
    assert parse_query_string("key=value=1") == {"key": "value=1"}

def test_parse_query_string_key_with_ampersand():
    assert parse_query_string("key1=value1&key2=value2&key1=value3") == {"key1": ["value1", "value3"], "key2": "value2"}