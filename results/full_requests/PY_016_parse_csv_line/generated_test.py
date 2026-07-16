from python_functions import parse_csv_line

def test_parse_csv_line():
    # Test with a normal CSV line
    assert parse_csv_line('value1,value2,value3') == ['value1', 'value2', 'value3']
    
    # Test with quoted values
    assert parse_csv_line('"value1","value2","value3"') == ['value1', 'value2', 'value3']
    
    # Test with mixed quoted and unquoted values
    assert parse_csv_line('value1,"value,2",value3') == ['value1', 'value,2', 'value3']
    
    # Test with escaped quotes
    assert parse_csv_line('"value1 ""escaped"" value2","value3"') == ['value1 "escaped" value2', 'value3']
    
    # Test with empty values
    assert parse_csv_line('value1,,value3') == ['value1', '', 'value3']
    
    # Test with leading and trailing commas
    assert parse_csv_line(',value1,value2,') == ['', 'value1', 'value2', '']
    
    # Test with a line that is just commas
    assert parse_csv_line(',,,') == ['', '', '', '']
    
    # Test with a line that is empty
    assert parse_csv_line('') == ['']
    
    # Test with None input
    assert parse_csv_line(None) == []
    
    # Test with a line that has quotes but no commas
    assert parse_csv_line('"value1"') == ['value1']
    
    # Test with a line that has quotes and escaped quotes
    assert parse_csv_line('"value1 ""escaped"" value2"') == ['value1 "escaped" value2']