import pytest

from your_module import parse_csv_line  # Replace 'your_module' with the actual module name

def test_parse_csv_line_none():
    assert parse_csv_line(None) == []

def test_parse_csv_line_empty():
    assert parse_csv_line("") == [""]

def test_parse_csv_line_single_value():
    assert parse_csv_line("value") == ["value"]

def test_parse_csv_line_two_values():
    assert parse_csv_line("value1,value2") == ["value1", "value2"]

def test_parse_csv_line_with_spaces():
    assert parse_csv_line(" value1 , value2 ") == [" value1 ", " value2 "]

def test_parse_csv_line_with_quotes():
    assert parse_csv_line('"value1","value2"') == ["value1", "value2"]

def test_parse_csv_line_with_escaped_quotes():
    assert parse_csv_line('"value1 ""escaped"" value","value2"') == ['value1 "escaped" value', 'value2']

def test_parse_csv_line_with_commas_in_quotes():
    assert parse_csv_line('"value1,value2","value3"') == ["value1,value2", "value3"]

def test_parse_csv_line_multiple_commas():
    assert parse_csv_line("value1,,,value2") == ["value1", "", "", "value2"]

def test_parse_csv_line_trailing_comma():
    assert parse_csv_line("value1,value2,") == ["value1", "value2", ""]

def test_parse_csv_line_leading_comma():
    assert parse_csv_line(",value1,value2") == ["", "value1", "value2"]

def test_parse_csv_line_multiple_quotes():
    assert parse_csv_line('"value1","value2","value3"') == ["value1", "value2", "value3"]

def test_parse_csv_line_unmatched_quotes():
    assert parse_csv_line('"value1,value2') == ['value1,value2']

def test_parse_csv_line_only_commas():
    assert parse_csv_line(",,,") == ["", "", "", ""]

def test_parse_csv_line_only_quotes():
    assert parse_csv_line('"""') == ['"']  # Handling of quotes only

def test_parse_csv_line_complex_case():
    assert parse_csv_line('"value1, with, commas","value2"') == ['value1, with, commas', 'value2']