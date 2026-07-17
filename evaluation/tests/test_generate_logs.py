from experiment.generate_logs import format_log_line


def test_format_log_line_has_no_trailing_whitespace_when_error_is_empty():
    line = format_log_line(
        "2026-07-17T00:00:00+00:00",
        "JAVA_001_example",
        "java",
        "gpt-4o-mini",
        None,
        "OK",
        "prompt-hash",
        "source-hash",
        "",
    )

    assert line.endswith("source-hash")
    assert line == line.rstrip()
