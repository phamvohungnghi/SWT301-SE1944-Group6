def test_simple_html_tokenizer():
    from PY_020_simple_html_tokenizer import simple_html_tokenizer

    # Test with None input
    assert simple_html_tokenizer(None) == []

    # Test with empty string
    assert simple_html_tokenizer("") == []

    # Test with a simple tag
    assert simple_html_tokenizer("<tag>") == [("TAG", "<tag>")]

    # Test with text before a tag
    assert simple_html_tokenizer("Hello <tag>") == [("TEXT", "Hello "), ("TAG", "<tag>")]

    # Test with text after a tag
    assert simple_html_tokenizer("<tag>Hello") == [("TAG", "<tag>"), ("TEXT", "Hello")]

    # Test with multiple tags
    assert simple_html_tokenizer("<tag1><tag2>") == [("TAG", "<tag1>"), ("TAG", "<tag2>")]

    # Test with text between tags
    assert simple_html_tokenizer("<tag1>Text<tag2>") == [("TAG", "<tag1>"), ("TEXT", "Text"), ("TAG", "<tag2>")]

    # Test with unclosed tag
    assert simple_html_tokenizer("<tag1>Text") == [("TAG", "<tag1>"), ("TEXT", "Text")]

    # Test with text only
    assert simple_html_tokenizer("Just some text") == [("TEXT", "Just some text")]

    # Test with tags and text mixed
    assert simple_html_tokenizer("<tag1>Text1<tag2>Text2") == [("TAG", "<tag1>"), ("TEXT", "Text1"), ("TAG", "<tag2>"), ("TEXT", "Text2")]

    # Test with nested tags
    assert simple_html_tokenizer("<tag1><tag2></tag2></tag1>") == [("TAG", "<tag1>"), ("TAG", "<tag2>"), ("TAG", "</tag2>"), ("TAG", "</tag1>")]

    # Test with text before and after nested tags
    assert simple_html_tokenizer("Before<tag1><tag2></tag2></tag1>After") == [
        ("TEXT", "Before"),
        ("TAG", "<tag1>"),
        ("TAG", "<tag2>"),
        ("TAG", "</tag2>"),
        ("TAG", "</tag1>"),
        ("TEXT", "After")
    ]