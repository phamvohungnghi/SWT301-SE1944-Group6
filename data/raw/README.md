# Dataset Provenance and Specifications (RBL-4)

This directory contains details about the source code dataset frozen for the RBL-4 experiment, which compares GPT-4o-generated unit tests against Randoop benchmarks on symmetric Java and Python implementations.

## 1. Specifications
- **Total Units**: 50 standalone methods/functions (25 Java static methods + 25 Python standalone functions).
- **Target Complexity**: $5 \le CC \le 15$ measured by `lizard` version 1.23.0.
- **Symmetry**: Each of the 25 problems has an identical logic implementation in both Java and Python.

## 2. Provenance & Source Categories
The dataset was curated from three main categories of sources to cover standard algorithms, common utilities, and academic benchmarking:

1. **SOTA (State-of-the-Art) Algorithms**: Standard academic/textbook algorithms:
   - `bubbleSort` / `bubble_sort`
   - `binarySearch` / `binary_search`
   - `knapsack01` / `knapsack_01`
   - `checkSudokuBoard` / `check_sudoku_board`
   - `longestPalindromeSubstring` / `longest_palindrome_substring`
   - `levenshteinDistance` / `levenshtein_distance`
   - `findPrimeFactors` / `find_prime_factors`
   - `dijkstra` / `dijkstra`
   - `isValidBST` / `is_valid_bst`
   - `isMatch` / `is_match`
   
2. **CLASSES2TEST / TestPilot**: Sourced from real-world Java projects/benchmarks commonly used in automated testing research (e.g., classes2test dataset, TestPilot benchmark repository):
   - `mergeIntervals` / `merge_intervals`
   - `evaluateRPN` / `evaluate_rpn`
   - `jsonPathLookup` / `json_path_lookup`
   - `romanToInt` / `roman_to_int`
   - `intToRoman` / `int_to_roman`
   - `simpleHtmlTokenizer` / `simple_html_tokenizer`

3. **Utility Verification**: Custom, robust utility functions designed for validation or utility tasks:
   - `isValidEmail` / `is_valid_email`
   - `calculateTax` / `calculate_tax`
   - `validatePassword` / `validate_password`
   - `runLengthEncoding` / `run_length_encoding`
   - `runLengthDecoding` / `run_length_decoding`
   - `parseCsvLine` / `parse_csv_line`
   - `luhnCheck` / `luhn_check`
   - `parseQueryString` / `parse_query_string`
   - `dateDifference` / `date_difference`

## 3. Dataset Integrity & Freeze Details
- **Freeze Date**: 2026-06-28
- **Dataset Lead**: Vinh
- **Reviewer**: Nghi
- **Integrity Validation**: All function hashes (`source_sha256`) are documented in the main manifest (`experiment/dataset-manifest.csv`). Any changes to these source files will invalidate the hashes, ensuring strict reproducibility.
- **Main Manifest**: `experiment/dataset-manifest.csv`
- **Reference Copy**: `data/dataset-manifest.csv`
- **Pending Provenance Fields**: `repository_url`, `commit_sha`, and `license` are currently marked with `TODO_*` placeholders in the manifest and must be filled after the group confirms the GitHub repository URL, the frozen commit SHA, and the applicable dataset/repository license.

## 4. Usage in the Experiment
- **Pilot Phase**: A randomly selected sample of 10 symmetric functions (5 Java, 5 Python) chosen using random seed `20260628` (documented in `data/pilot_sample.csv`) is evaluated first.
- **Full Phase**: The complete set of 50 functions is evaluated.
- **Evaluation Metrics**:
  - **Branch Coverage**: Measured using JaCoCo (Java) and Coverage.py (Python).
  - **Mutation Score**: Measured using PIT (Java) and pytest-mutagen (Python).
  - **Baseline Comparison**: Compared against Randoop-generated tests for Java.
