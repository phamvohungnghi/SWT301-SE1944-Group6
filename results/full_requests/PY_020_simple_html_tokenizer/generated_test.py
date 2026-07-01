import pytest

from PY_020_simple_html_tokenizer import simple_html_tokenizer

def test_empty_input():
    assert simple_html_tokenizer("") == []

def test_none_input():
    assert simple_html_tokenizer(None) == []

def test_single_tag():
    assert simple_html_tokenizer("<div>") == [("TAG", "<div>")]

def test_single_text():
    assert simple_html_tokenizer("Hello") == [("TEXT", "Hello")]

def test_tag_and_text():
    assert simple_html_tokenizer("<div>Hello</div>") == [
        ("TAG", "<div>"),
        ("TEXT", "Hello"),
        ("TAG", "</div>")
    ]

def test_nested_tags():
    assert simple_html_tokenizer("<div><span>Text</span></div>") == [
        ("TAG", "<div>"),
        ("TAG", "<span>"),
        ("TEXT", "Text"),
        ("TAG", "</span>"),
        ("TAG", "</div>")
    ]

def test_unclosed_tag():
    assert simple_html_tokenizer("<div") == [("TEXT", "<div")]

def test_text_with_unclosed_tag():
    assert simple_html_tokenizer("Hello<div") == [
        ("TEXT", "Hello"),
        ("TEXT", "<div")
    ]

def test_multiple_tags():
    assert simple_html_tokenizer("<div><span></span></div>") == [
        ("TAG", "<div>"),
        ("TAG", "<span>"),
        ("TAG", "</span>"),
        ("TAG", "</div>")
    ]

def test_text_between_tags():
    assert simple_html_tokenizer("<div>Text<span>More</span></div>") == [
        ("TAG", "<div>"),
        ("TEXT", "Text"),
        ("TAG", "<span>"),
        ("TEXT", "More"),
        ("TAG", "</span>"),
        ("TAG", "</div>")
    ]

def test_malformed_tag():
    assert simple_html_tokenizer("<div><span") == [
        ("TAG", "<div>"),
        ("TEXT", "<span")
    ]

def test_empty_tag():
    assert simple_html_tokenizer("<>") == [("TAG", "<>")]

def test_text_with_angle_brackets():
    assert simple_html_tokenizer("Text with < and > symbols") == [
        ("TEXT", "Text with "),
        ("TAG", "<"),
        ("TEXT", " and "),
        ("TAG", ">"),
        ("TEXT", " symbols")
    ]

def test_only_angle_brackets():
    assert simple_html_tokenizer("<>><<") == [
        ("TAG", "<>"),
        ("TAG", ">"),
        ("TAG", "<")
    ]

def test_whitespace_handling():
    assert simple_html_tokenizer(" <div> Text </div> ") == [
        ("TEXT", " "),
        ("TAG", "<div>"),
        ("TEXT", " Text "),
        ("TAG", "</div>"),
        ("TEXT", " ")
    ]