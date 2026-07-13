def test_is_match():
    # Test cases for is_match function

    # Test with None inputs
    assert not is_match(None, None)
    assert not is_match("abc", None)
    assert not is_match(None, "a*b")

    # Test with empty pattern
    assert is_match("", "")
    assert not is_match("a", "")
    assert not is_match("abc", "")

    # Test with simple character matches
    assert is_match("a", "a")
    assert not is_match("a", "b")
    assert is_match("abc", "abc")
    assert not is_match("abc", "abcd")

    # Test with single character and dot
    assert is_match("a", ".")
    assert is_match("b", ".")
    assert not is_match("a", "b")

    # Test with star operator
    assert is_match("aa", "a*")
    assert is_match("aab", "c*a*b")
    assert not is_match("mississippi", "mis*is*p*.")
    assert is_match("ab", ".*")
    assert is_match("aab", ".*")
    assert is_match("aaa", "a*")
    assert is_match("ab", ".*c")

    # Test with edge cases
    assert is_match("a", "a*")
    assert is_match("", ".*")
    assert not is_match("a", ".*b")
    assert is_match("abc", ".*c")
    assert not is_match("abc", ".*d")
    assert is_match("abc", ".*")  # Full match with any character
    assert not is_match("abc", "a.*d")  # Should not match

    # Test with patterns that include multiple stars
    assert is_match("a", "a**")
    assert is_match("aaa", "a**")
    assert is_match("aa", "a*b*")
    assert is_match("a", "a*b*")
    assert not is_match("a", "b*a*")  # Should not match

    # Test with patterns that have leading/trailing stars
    assert is_match("abc", "*abc")
    assert is_match("abc", "abc*")
    assert not is_match("abc", "*xyz*")  # Should not match
    assert is_match("abc", "*")  # Match with any string
    assert is_match("", "*")  # Match with empty string

    # Test with complex patterns
    assert is_match("ab", ".*b")
    assert is_match("ab", ".*a*b")
    assert not is_match("ab", ".*c")
    assert is_match("abc", ".*")  # Full match with any character
    assert not is_match("abc", "a.*d")  # Should not match

    # Test with patterns that have no matches
    assert not is_match("abc", "xyz")
    assert not is_match("abc", "a.c")  # Should not match
    assert not is_match("abc", "a.*d")  # Should not match
    assert not is_match("abc", ".*xyz")  # Should not match

    # Test with patterns that are just wildcards
    assert is_match("abc", ".*")  # Full match with any character
    assert is_match("", ".*")  # Match with empty string
    assert is_match("abc", ".*c")  # Should match
    assert not is_match("abc", ".*d")  # Should not match

    # Test with patterns that have multiple characters and stars
    assert is_match("aabb", "a*b*")  # Should match
    assert is_match("aabb", ".*")  # Full match with any character
    assert not is_match("aabb", "a*b*c")  # Should not match
    assert is_match("aabb", ".*b")  # Should match
    assert not is_match("aabb", ".*c")  # Should not match

    # Test with patterns that have leading/trailing characters
    assert is_match("abc", "a.*c")  # Should match
    assert not is_match("abc", "a.*d")  # Should not match
    assert is_match("abc", ".*b")  # Should match
    assert not is_match("abc", ".*d")  # Should not match

    # Test with patterns that have no matches
    assert not is_match("abc", "xyz")  # Should not match
    assert not is_match("abc", "a.c")  # Should not match
    assert not is_match("abc", "a.*d")  # Should not match
    assert not is_match("abc", ".*xyz")  # Should not match

    # Test with patterns that are just wildcards
    assert is_match("abc", ".*")  # Full match with any character
    assert is_match("", ".*")  # Match with empty string
    assert is_match("abc", ".*c")  # Should match
    assert not is_match("abc", ".*d")  # Should not match

    # Test with patterns that have multiple characters and stars
    assert is_match("aabb", "a*b*")  # Should match
    assert is_match("aabb", ".*")  # Full match with any character
    assert not is_match("aabb", "a*b*c")  # Should not match
    assert is_match("aabb", ".*b")  # Should match
    assert not is_match("aabb", ".*c")  # Should not match

    # Test with patterns that have leading/trailing characters
    assert is_match("abc", "a.*c")  # Should match
    assert not is_match("abc", "a.*d")  # Should not match
    assert is_match("abc", ".*b")  # Should match
    assert not is_match("abc", ".*d")  # Should not match