import pytest

from your_module import parse_csv_line  # Replace 'your_module' with the actual module name

def test_parse_csv_line_empty_string():
    assert parse_csv_line("") == [""]

def test_parse_csv_line_none():
    assert parse_csv_line(None) == []

def test_parse_csv_line_single_value():
    assert parse_csv_line("value") == ["value"]

def test_parse_csv_line_multiple_values():
    assert parse_csv_line("value1,value2,value3") == ["value1", "value2", "value3"]

def test_parse_csv_line_with_quotes():
    assert parse_csv_line('"value1","value2","value3"') == ["value1", "value2", "value3"]

def test_parse_csv_line_with_quotes_and_commas():
    assert parse_csv_line('"value,1","value,2","value,3"') == ["value,1", "value,2", "value,3"]

def test_parse_csv_line_with_escaped_quotes():
    assert parse_csv_line('"value""1","value""2","value""3"') == ['value"1', 'value"2', 'value"3']

def test_parse_csv_line_mixed_quotes_and_plain():
    assert parse_csv_line('value1,"value2","value,3",value4') == ["value1", "value2", "value,3", "value4"]

def test_parse_csv_line_trailing_comma():
    assert parse_csv_line("value1,value2,") == ["value1", "value2", ""]

def test_parse_csv_line_leading_comma():
    assert parse_csv_line(",value1,value2") == ["", "value1", "value2"]

def test_parse_csv_line_only_commas():
    assert parse_csv_line(",,,") == ["", "", "", ""]

def test_parse_csv_line_unbalanced_quotes():
    assert parse_csv_line('"value1,value2') == ['value1,value2']

def test_parse_csv_line_unbalanced_quotes_with_comma():
    assert parse_csv_line('value1,"value2,value3') == ["value1", "value2,value3"]

def test_parse_csv_line_quotes_with_spaces():
    assert parse_csv_line(' "value1" , "value2" ') == [" \"value1\" ", " \"value2\" "]

def test_parse_csv_line_empty_quoted_field():
    assert parse_csv_line('"","value1","value2"') == ["", "value1", "value2"]

def test_parse_csv_line_whitespace_only():
    assert parse_csv_line("   ") == ["   "]