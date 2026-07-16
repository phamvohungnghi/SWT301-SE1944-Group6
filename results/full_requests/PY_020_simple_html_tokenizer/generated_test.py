from python_functions import simple_html_tokenizer

def test_simple_html_tokenizer():
    # Test with a simple HTML string
    html = "<html><body>Hello</body></html>"
    expected = [("TAG", "<html>"), ("TAG", "<body>"), ("TEXT", "Hello"), ("TAG", "</body>"), ("TAG", "</html>")]
    assert simple_html_tokenizer(html) == expected

    # Test with a string containing no tags
    html = "Hello World"
    expected = [("TEXT", "Hello World")]
    assert simple_html_tokenizer(html) == expected

    # Test with a string containing only tags
    html = "<tag1><tag2></tag2></tag1>"
    expected = [("TAG", "<tag1>"), ("TAG", "<tag2>"), ("TAG", "</tag2>"), ("TAG", "</tag1>")]
    assert simple_html_tokenizer(html) == expected

    # Test with a malformed tag
    html = "<tag1><tag2></tag1>"
    expected = [("TAG", "<tag1>"), ("TAG", "<tag2>"), ("TEXT", "</tag1>")]
    assert simple_html_tokenizer(html) == expected

    # Test with an empty string
    html = ""
    expected = [("TEXT", "")]
    assert simple_html_tokenizer(html) == expected

    # Test with None input
    html = None
    expected = []
    assert simple_html_tokenizer(html) == expected

    # Test with a string that starts with a tag
    html = "<tag>Hello</tag>"
    expected = [("TAG", "<tag>"), ("TEXT", "Hello"), ("TAG", "</tag>")]
    assert simple_html_tokenizer(html) == expected

    # Test with a string that ends with a tag
    html = "Hello <tag>"
    expected = [("TEXT", "Hello "), ("TAG", "<tag>")]
    assert simple_html_tokenizer(html) == expected

    # Test with multiple consecutive tags
    html = "<tag1><tag2></tag2><tag3></tag3></tag1>"
    expected = [("TAG", "<tag1>"), ("TAG", "<tag2>"), ("TAG", "</tag2>"), ("TAG", "<tag3>"), ("TAG", "</tag3>"), ("TAG", "</tag1>")]
    assert simple_html_tokenizer(html) == expected

    # Test with text before and after tags
    html = "Start <tag>Middle</tag> End"
    expected = [("TEXT", "Start "), ("TAG", "<tag>"), ("TEXT", "Middle"), ("TAG", "</tag>"), ("TEXT", " End")]
    assert simple_html_tokenizer(html) == expected

    # Test with nested tags
    html = "<outer><inner>Content</inner></outer>"
    expected = [("TAG", "<outer>"), ("TAG", "<inner>"), ("TEXT", "Content"), ("TAG", "</inner>"), ("TAG", "</outer>")]
    assert simple_html_tokenizer(html) == expected

    # Test with tags containing attributes
    html = '<tag attribute="value">Content</tag>'
    expected = [("TAG", '<tag attribute="value">'), ("TEXT", "Content"), ("TAG", "</tag>")]
    assert simple_html_tokenizer(html) == expected

    # Test with unclosed tag
    html = "<tag>Content"
    expected = [("TAG", "<tag>"), ("TEXT", "Content")]
    assert simple_html_tokenizer(html) == expected

    # Test with special characters in text
    html = "<tag>Content & more</tag>"
    expected = [("TAG", "<tag>"), ("TEXT", "Content & more"), ("TAG", "</tag>")]
    assert simple_html_tokenizer(html) == expected

    # Test with a tag that has no content
    html = "<tag></tag>"
    expected = [("TAG", "<tag>"), ("TAG", "</tag>")]
    assert simple_html_tokenizer(html) == expected

    # Test with a string that has only text and no tags
    html = "Just text"
    expected = [("TEXT", "Just text")]
    assert simple_html_tokenizer(html) == expected

    # Test with a string that has multiple tags and text
    html = "<tag1>Text1</tag1><tag2>Text2</tag2>"
    expected = [("TAG", "<tag1>"), ("TEXT", "Text1"), ("TAG", "</tag1>"), ("TAG", "<tag2>"), ("TEXT", "Text2"), ("TAG", "</tag2>")]
    assert simple_html_tokenizer(html) == expected

    # Test with a string that has a tag with no closing angle bracket
    html = "<tag1>Text1<tag2>Text2"
    expected = [("TAG", "<tag1>"), ("TEXT", "Text1"), ("TAG", "<tag2>"), ("TEXT", "Text2")]
    assert simple_html_tokenizer(html) == expected

    # Test with a string that has a tag with no opening angle bracket
    html = "Text1<tag2>Text2</tag2>"
    expected = [("TEXT", "Text1"), ("TAG", "<tag2>"), ("TEXT", "Text2"), ("TAG", "</tag2>")]
    assert simple_html_tokenizer(html) == expected

    # Test with a string that has a tag with no closing tag
    html = "<tag1>Text1<tag2>Text2</tag1>"
    expected = [("TAG", "<tag1>"), ("TEXT", "Text1"), ("TAG", "<tag2>"), ("TEXT", "Text2"), ("TAG", "</tag1>")]
    assert simple_html_tokenizer(html) == expected

    # Test with a string that has a tag with no opening tag
    html = "Text1</tag2>"
    expected = [("TEXT", "Text1"), ("TAG", "</tag2>")]
    assert simple_html_tokenizer(html) == expected

    # Test with a string that has a tag with no content
    html = "<tag1></tag1>"
    expected = [("TAG", "<tag1>"), ("TAG", "</tag1>")]
    assert simple_html_tokenizer(html) == expected

    # Test with a string that has a tag with special characters
    html = "<tag1>Text1 & Text2</tag1>"
    expected = [("TAG", "<tag1>"), ("TEXT", "Text1 & Text2"), ("TAG", "</tag1>")]
    assert simple_html_tokenizer(html) == expected

    # Test with a string that has a tag with a newline
    html = "<tag1>\nText1\n</tag1>"
    expected = [("TAG", "<tag1>"), ("TEXT", "\nText1\n"), ("TAG", "</tag1>")]
    assert simple_html_tokenizer(html) == expected

    # Test with a string that has a tag with multiple spaces
    html = "<tag1>   Text1   </tag1>"
    expected = [("TAG", "<tag1>"), ("TEXT", "   Text1   "), ("TAG", "</tag1>")]
    assert simple_html_tokenizer(html) == expected

    # Test with a string that has a tag with a single space
    html = "<tag1> Text1 </tag1>"
    expected = [("TAG", "<tag1>"), ("TEXT", " Text1 "), ("TAG", "</tag1>")]
    assert simple_html_tokenizer(html) == expected

    # Test with a string that has a tag with a tab
    html = "<tag1>\tText1\t</tag1>"
    expected = [("TAG", "<tag1>"), ("TEXT", "\tText1\t"), ("TAG", "</tag1>")]
    assert simple_html_tokenizer(html) == expected

    # Test with a string that has a tag with a carriage return
    html = "<tag1>\rText1\r</tag1>"
    expected = [("TAG", "<tag1>"), ("TEXT", "\rText1\r"), ("TAG", "</tag1>")]
    assert simple_html_tokenizer(html) == expected

    # Test with a string that has a tag with a mix of spaces and text
    html = "<tag1>   Text1   </tag1>"
    expected = [("TAG", "<tag1>"), ("TEXT", "   Text1   "), ("TAG", "</tag1>")]
    assert simple_html_tokenizer(html) == expected

    # Test with a string that has a tag with a mix of special characters and text
    html = "<tag1>Text1 & Text2</tag1>"
    expected = [("TAG", "<tag1>"), ("TEXT", "Text1 & Text2"), ("TAG", "</tag1>")]
    assert simple_html_tokenizer(html) == expected

    # Test with a string that has a tag with a mix of newlines and text
    html = "<tag1>\nText1\n</tag1>"
    expected = [("TAG", "<tag1>"), ("TEXT", "\nText1\n"), ("TAG", "</tag1>")]
    assert simple_html_tokenizer(html) == expected

    # Test with a string that has a tag with a mix of tabs and text
    html = "<tag1>\tText1\t</tag1>"
    expected = [("TAG", "<tag1>"), ("TEXT", "\tText1\t"), ("TAG", "</tag