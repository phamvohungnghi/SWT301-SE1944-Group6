from python_functions import merge_intervals

def test_merge_intervals():
    # Test with overlapping intervals
    assert merge_intervals([[1, 3], [2, 6], [8, 10], [15, 18]]) == [[1, 6], [8, 10], [15, 18]]
    
    # Test with non-overlapping intervals
    assert merge_intervals([[1, 2], [3, 4], [5, 6]]) == [[1, 2], [3, 4], [5, 6]]
    
    # Test with intervals that touch
    assert merge_intervals([[1, 4], [4, 5]]) == [[1, 5]]
    
    # Test with a single interval
    assert merge_intervals([[1, 4]]) == [[1, 4]]
    
    # Test with empty input
    assert merge_intervals([]) == []
    
    # Test with invalid intervals (start greater than end)
    assert merge_intervals([[5, 2]]) == []
    
    # Test with intervals containing invalid lengths
    assert merge_intervals([[1, 2], [3]]) == []
    
    # Test with mixed valid and invalid intervals
    assert merge_intervals([[1, 2], [3, 4], [5, 3]]) == []
    
    # Test with all intervals overlapping
    assert merge_intervals([[1, 10], [2, 3], [4, 5], [6, 7]]) == [[1, 10]]
    
    # Test with large intervals
    assert merge_intervals([[1, 100], [2, 50], [51, 75], [76, 100]]) == [[1, 100]]