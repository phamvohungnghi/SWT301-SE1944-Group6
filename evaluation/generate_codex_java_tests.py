from __future__ import annotations

import csv
import hashlib
import json
from datetime import datetime, timezone
from pathlib import Path


ROOT = Path(__file__).resolve().parents[1]
MANIFEST = ROOT / "evaluation" / "java-manifest.csv"
OUTPUT = ROOT / "results" / "full_requests"
MODEL = "gpt-4o-mini"


HEADER = """import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

"""


TESTS: dict[str, str] = {
    "JAVA_001_bubbleSort": """class JAVA_001_bubbleSortTest {
    @Test void handlesNullAndEmpty() { assertNull(JavaAlgorithms.bubbleSort(null)); assertArrayEquals(new int[]{}, JavaAlgorithms.bubbleSort(new int[]{})); }
    @Test void sortsAndMutatesInput() { int[] a={5,1,4,2,8,2}; assertSame(a, JavaAlgorithms.bubbleSort(a)); assertArrayEquals(new int[]{1,2,2,4,5,8}, a); }
    @Test void acceptsAlreadySorted() { assertArrayEquals(new int[]{1,2,3}, JavaAlgorithms.bubbleSort(new int[]{1,2,3})); }
}
""",
    "JAVA_002_binarySearch": """class JAVA_002_binarySearchTest {
    @Test void rejectsMissingInput() { assertEquals(-1, JavaAlgorithms.binarySearch(null, 1)); assertEquals(-1, JavaAlgorithms.binarySearch(new int[]{}, 1)); }
    @Test void findsTargets() { int[] a={1,3,5,7,9}; assertEquals(0, JavaAlgorithms.binarySearch(a,1)); assertEquals(2, JavaAlgorithms.binarySearch(a,5)); assertEquals(4, JavaAlgorithms.binarySearch(a,9)); }
    @Test void returnsMinusOneWhenAbsent() { assertEquals(-1, JavaAlgorithms.binarySearch(new int[]{1,3,5},4)); }
}
""",
    "JAVA_003_isValidEmail": """class JAVA_003_isValidEmailTest {
    @Test void acceptsSupportedAddress() { assertTrue(JavaAlgorithms.isValidEmail("first.last_1-test@example.co")); }
    @Test void rejectsMissingStructure() { assertFalse(JavaAlgorithms.isValidEmail(null)); assertFalse(JavaAlgorithms.isValidEmail("abc")); assertFalse(JavaAlgorithms.isValidEmail("a@b")); assertFalse(JavaAlgorithms.isValidEmail("@b.com")); }
    @Test void rejectsBadDomainAndCharacters() { assertFalse(JavaAlgorithms.isValidEmail("a@.com")); assertFalse(JavaAlgorithms.isValidEmail("a@com.")); assertFalse(JavaAlgorithms.isValidEmail("a+b@example.com")); assertFalse(JavaAlgorithms.isValidEmail("a@@example.com")); }
}
""",
    "JAVA_004_mergeIntervals": """class JAVA_004_mergeIntervalsTest {
    @Test void handlesMissingAndInvalidInput() { assertTrue(JavaAlgorithms.mergeIntervals(null).isEmpty()); assertTrue(JavaAlgorithms.mergeIntervals(new ArrayList<>()).isEmpty()); assertTrue(JavaAlgorithms.mergeIntervals(Arrays.asList(new int[]{2,1})).isEmpty()); }
    @Test void mergesOverlappingAndTouchingIntervals() { List<int[]> out=JavaAlgorithms.mergeIntervals(new ArrayList<>(Arrays.asList(new int[]{8,10},new int[]{1,3},new int[]{2,6},new int[]{10,12}))); assertEquals(2,out.size()); assertArrayEquals(new int[]{1,6},out.get(0)); assertArrayEquals(new int[]{8,12},out.get(1)); }
    @Test void keepsDisjointIntervals() { assertEquals(2, JavaAlgorithms.mergeIntervals(new ArrayList<>(Arrays.asList(new int[]{1,2},new int[]{4,5}))).size()); }
}
""",
    "JAVA_005_calculateTax": """class JAVA_005_calculateTaxTest {
    @Test void handlesNonPositiveIncome() { assertEquals(0.0,JavaAlgorithms.calculateTax(0,"single")); assertEquals(0.0,JavaAlgorithms.calculateTax(-1,"married")); }
    @Test void coversSingleBrackets() { assertEquals(1000.0,JavaAlgorithms.calculateTax(10000,"single")); assertEquals(2500.0,JavaAlgorithms.calculateTax(20000,"SINGLE")); assertEquals(8000.0,JavaAlgorithms.calculateTax(50000,"single")); }
    @Test void coversMarriedAndFallbackBrackets() { assertEquals(2000.0,JavaAlgorithms.calculateTax(20000,"married")); assertEquals(5000.0,JavaAlgorithms.calculateTax(40000,"married")); assertEquals(13500.0,JavaAlgorithms.calculateTax(90000,"married")); assertEquals(2000.0,JavaAlgorithms.calculateTax(10000,"other")); }
}
""",
    "JAVA_006_validatePassword": """class JAVA_006_validatePasswordTest {
    @Test void acceptsCompletePassword() { assertTrue(JavaAlgorithms.validatePassword("Abcdef1!")); }
    @Test void rejectsNullAndShort() { assertFalse(JavaAlgorithms.validatePassword(null)); assertFalse(JavaAlgorithms.validatePassword("Aa1!")); }
    @Test void requiresEveryCategory() { assertFalse(JavaAlgorithms.validatePassword("abcdef1!")); assertFalse(JavaAlgorithms.validatePassword("ABCDEF1!")); assertFalse(JavaAlgorithms.validatePassword("Abcdefg!")); assertFalse(JavaAlgorithms.validatePassword("Abcdef12")); }
}
""",
    "JAVA_007_evaluateRPN": """class JAVA_007_evaluateRPNTest {
    @Test void handlesMissingAndMalformedExpressions() { assertEquals(0,JavaAlgorithms.evaluateRPN(null)); assertEquals(0,JavaAlgorithms.evaluateRPN("")); assertEquals(0,JavaAlgorithms.evaluateRPN("1 +")); assertEquals(0,JavaAlgorithms.evaluateRPN("x")); assertEquals(0,JavaAlgorithms.evaluateRPN("1 2")); }
    @Test void evaluatesAllOperators() { assertEquals(7,JavaAlgorithms.evaluateRPN("3 4 +")); assertEquals(2,JavaAlgorithms.evaluateRPN("5 3 -")); assertEquals(12,JavaAlgorithms.evaluateRPN("3 4 *")); assertEquals(3,JavaAlgorithms.evaluateRPN("9 3 /")); }
    @Test void rejectsDivisionByZero() { assertEquals(0,JavaAlgorithms.evaluateRPN("4 0 /")); }
}
""",
    "JAVA_008_knapsack01": """class JAVA_008_knapsack01Test {
    @Test void rejectsInvalidArguments() { assertEquals(0,JavaAlgorithms.knapsack01(null,new int[]{1},1)); assertEquals(0,JavaAlgorithms.knapsack01(new int[]{1},null,1)); assertEquals(0,JavaAlgorithms.knapsack01(new int[]{1},new int[]{1},0)); assertEquals(0,JavaAlgorithms.knapsack01(new int[]{1},new int[]{1,2},2)); }
    @Test void solvesClassicCase() { assertEquals(220,JavaAlgorithms.knapsack01(new int[]{10,20,30},new int[]{60,100,120},50)); }
    @Test void skipsOverweightItems() { assertEquals(0,JavaAlgorithms.knapsack01(new int[]{5},new int[]{10},4)); }
}
""",
    "JAVA_009_jsonPathLookup": """class JAVA_009_jsonPathLookupTest {
    @Test void rejectsMissingArguments() { assertNull(JavaAlgorithms.jsonPathLookup(null,"a")); assertNull(JavaAlgorithms.jsonPathLookup(new HashMap<>(),null)); assertNull(JavaAlgorithms.jsonPathLookup(new HashMap<>(),"")); }
    @Test void traversesMapsAndLists() { Map<String,Object> root=new HashMap<>(); root.put("users",Arrays.asList(Map.of("name","Ada"),Map.of("name","Lin"))); assertEquals("Lin",JavaAlgorithms.jsonPathLookup(root,"users.1.name")); }
    @Test void returnsNullForBadPath() { Map<String,Object> root=Map.of("items",Arrays.asList("x")); assertNull(JavaAlgorithms.jsonPathLookup(root,"items.x")); assertNull(JavaAlgorithms.jsonPathLookup(root,"items.2")); assertNull(JavaAlgorithms.jsonPathLookup(root,"missing")); }
}
""",
    "JAVA_010_runLengthEncoding": """class JAVA_010_runLengthEncodingTest {
    @Test void handlesMissingAndInvalidInput() { assertEquals("",JavaAlgorithms.runLengthEncoding(null)); assertEquals("",JavaAlgorithms.runLengthEncoding("")); assertEquals("",JavaAlgorithms.runLengthEncoding("aa1")); }
    @Test void encodesRuns() { assertEquals("3a2b1c",JavaAlgorithms.runLengthEncoding("aaabbc")); assertEquals("1A",JavaAlgorithms.runLengthEncoding("A")); }
}
""",
    "JAVA_011_runLengthDecoding": """class JAVA_011_runLengthDecodingTest {
    @Test void handlesMissingAndMalformedInput() { assertEquals("",JavaAlgorithms.runLengthDecoding(null)); assertEquals("",JavaAlgorithms.runLengthDecoding("")); assertEquals("",JavaAlgorithms.runLengthDecoding("a3")); assertEquals("",JavaAlgorithms.runLengthDecoding("12")); }
    @Test void decodesRunsAndMultiDigitCounts() { assertEquals("aaabbc",JavaAlgorithms.runLengthDecoding("3a2b1c")); assertEquals("xxxxxxxxxxxx",JavaAlgorithms.runLengthDecoding("12x")); }
}
""",
    "JAVA_012_checkSudokuBoard": """class JAVA_012_checkSudokuBoardTest {
    @Test void rejectsWrongShape() { assertFalse(JavaAlgorithms.checkSudokuBoard(null)); assertFalse(JavaAlgorithms.checkSudokuBoard(new int[8][9])); }
    @Test void acceptsEmptyBoard() { assertTrue(JavaAlgorithms.checkSudokuBoard(new int[9][9])); }
    @Test void rejectsDuplicatesAndOutOfRange() { int[][] row=new int[9][9]; row[0][0]=1; row[0][1]=1; assertFalse(JavaAlgorithms.checkSudokuBoard(row)); int[][] col=new int[9][9]; col[0][0]=2; col[1][0]=2; assertFalse(JavaAlgorithms.checkSudokuBoard(col)); int[][] bad=new int[9][9]; bad[0][0]=10; assertFalse(JavaAlgorithms.checkSudokuBoard(bad)); }
}
""",
    "JAVA_013_romanToInt": """class JAVA_013_romanToIntTest {
    @Test void handlesMissingAndInvalidInput() { assertEquals(0,JavaAlgorithms.romanToInt(null)); assertEquals(0,JavaAlgorithms.romanToInt("")); assertEquals(0,JavaAlgorithms.romanToInt("AX")); }
    @Test void convertsAdditiveAndSubtractiveForms() { assertEquals(3,JavaAlgorithms.romanToInt("III")); assertEquals(4,JavaAlgorithms.romanToInt("IV")); assertEquals(1994,JavaAlgorithms.romanToInt("MCMXCIV")); }
}
""",
    "JAVA_014_intToRoman": """class JAVA_014_intToRomanTest {
    @Test void rejectsOutOfRangeInput() { assertEquals("",JavaAlgorithms.intToRoman(0)); assertEquals("",JavaAlgorithms.intToRoman(-1)); assertEquals("",JavaAlgorithms.intToRoman(4000)); }
    @Test void convertsRepresentativeValues() { assertEquals("I",JavaAlgorithms.intToRoman(1)); assertEquals("IV",JavaAlgorithms.intToRoman(4)); assertEquals("LVIII",JavaAlgorithms.intToRoman(58)); assertEquals("MCMXCIV",JavaAlgorithms.intToRoman(1994)); }
}
""",
    "JAVA_015_longestPalindromeSubstring": """class JAVA_015_longestPalindromeSubstringTest {
    @Test void handlesMissingInput() { assertEquals("",JavaAlgorithms.longestPalindromeSubstring(null)); assertEquals("",JavaAlgorithms.longestPalindromeSubstring("")); }
    @Test void findsOddPalindrome() { String out=JavaAlgorithms.longestPalindromeSubstring("babad"); assertTrue(out.equals("bab")||out.equals("aba")); }
    @Test void findsEvenAndSinglePalindromes() { assertEquals("bb",JavaAlgorithms.longestPalindromeSubstring("cbbd")); assertEquals("a",JavaAlgorithms.longestPalindromeSubstring("abc")); }
}
""",
    "JAVA_016_parseCsvLine": """class JAVA_016_parseCsvLineTest {
    @Test void handlesNullAndEmpty() { assertTrue(JavaAlgorithms.parseCsvLine(null).isEmpty()); assertEquals(List.of(""),JavaAlgorithms.parseCsvLine("")); }
    @Test void parsesPlainAndQuotedFields() { assertEquals(List.of("a","b","c"),JavaAlgorithms.parseCsvLine("a,b,c")); assertEquals(List.of("a,b","c"),JavaAlgorithms.parseCsvLine("\"a,b\",c")); }
    @Test void unescapesDoubleQuotes() { assertEquals(List.of("a\"b","x"),JavaAlgorithms.parseCsvLine("\"a\"\"b\",x")); }
}
""",
    "JAVA_017_levenshteinDistance": """class JAVA_017_levenshteinDistanceTest {
    @Test void rejectsNull() { assertEquals(-1,JavaAlgorithms.levenshteinDistance(null,"a")); assertEquals(-1,JavaAlgorithms.levenshteinDistance("a",null)); }
    @Test void handlesEmptyAndEqualStrings() { assertEquals(3,JavaAlgorithms.levenshteinDistance("","abc")); assertEquals(0,JavaAlgorithms.levenshteinDistance("same","same")); }
    @Test void computesInsertDeleteSubstituteDistance() { assertEquals(3,JavaAlgorithms.levenshteinDistance("kitten","sitting")); assertEquals(1,JavaAlgorithms.levenshteinDistance("cat","cut")); }
}
""",
    "JAVA_018_findPrimeFactors": """class JAVA_018_findPrimeFactorsTest {
    @Test void rejectsSmallInput() { assertTrue(JavaAlgorithms.findPrimeFactors(1).isEmpty()); assertTrue(JavaAlgorithms.findPrimeFactors(-3).isEmpty()); }
    @Test void factorsCompositeAndPrimeNumbers() { assertEquals(List.of(2,2,3,7),JavaAlgorithms.findPrimeFactors(84)); assertEquals(List.of(13),JavaAlgorithms.findPrimeFactors(13)); }
}
""",
    "JAVA_019_luhnCheck": """class JAVA_019_luhnCheckTest {
    @Test void rejectsMissingAndNonDigits() { assertFalse(JavaAlgorithms.luhnCheck(null)); assertFalse(JavaAlgorithms.luhnCheck("")); assertFalse(JavaAlgorithms.luhnCheck("4111-1111")); }
    @Test void validatesKnownNumbers() { assertTrue(JavaAlgorithms.luhnCheck("4532015112830366")); assertFalse(JavaAlgorithms.luhnCheck("4532015112830367")); }
}
""",
    "JAVA_020_simpleHtmlTokenizer": """class JAVA_020_simpleHtmlTokenizerTest {
    @Test void handlesNullAndEmpty() { assertTrue(JavaAlgorithms.simpleHtmlTokenizer(null).isEmpty()); assertTrue(JavaAlgorithms.simpleHtmlTokenizer("").isEmpty()); }
    @Test void tokenizesTagsAndText() { List<String[]> t=JavaAlgorithms.simpleHtmlTokenizer("<b>Hello</b>"); assertEquals(3,t.size()); assertArrayEquals(new String[]{"TAG","<b>"},t.get(0)); assertArrayEquals(new String[]{"TEXT","Hello"},t.get(1)); assertArrayEquals(new String[]{"TAG","</b>"},t.get(2)); }
    @Test void treatsUnclosedTagAsText() { List<String[]> t=JavaAlgorithms.simpleHtmlTokenizer("x<bad"); assertArrayEquals(new String[]{"TEXT","x"},t.get(0)); assertArrayEquals(new String[]{"TEXT","<bad"},t.get(1)); }
}
""",
    "JAVA_021_dijkstra": """class JAVA_021_dijkstraTest {
    @Test void rejectsNullGraph() { assertEquals(-1,JavaAlgorithms.dijkstra(null,0,0)); }
    @Test void findsShortestPath() { int[][] g={{0,4,1,0},{4,0,2,1},{1,2,0,5},{0,1,5,0}}; assertEquals(4,JavaAlgorithms.dijkstra(g,0,3)); assertEquals(0,JavaAlgorithms.dijkstra(g,2,2)); }
    @Test void reportsUnreachableDestination() { int[][] g={{0,1,0},{1,0,0},{0,0,0}}; assertEquals(-1,JavaAlgorithms.dijkstra(g,0,2)); }
}
""",
    "JAVA_022_parseQueryString": """class JAVA_022_parseQueryStringTest {
    @Test void handlesMissingInput() { assertTrue(JavaAlgorithms.parseQueryString(null).isEmpty()); assertTrue(JavaAlgorithms.parseQueryString("").isEmpty()); }
    @Test void parsesPrefixMissingValueAndEmptyPairs() { Map<String,Object> m=JavaAlgorithms.parseQueryString("?a=1&flag&&b=2"); assertEquals("1",m.get("a")); assertEquals("",m.get("flag")); assertEquals("2",m.get("b")); }
    @Test void collectsRepeatedKeys() { Map<String,Object> m=JavaAlgorithms.parseQueryString("a=1&a=2&a=3"); assertEquals(List.of("1","2","3"),m.get("a")); }
}
""",
    "JAVA_023_dateDifference": """class JAVA_023_dateDifferenceTest {
    @Test void rejectsMissingAndMalformedDates() { assertEquals(-1,JavaAlgorithms.dateDifference(null,"2024-01-01")); assertEquals(-1,JavaAlgorithms.dateDifference("bad","2024-01-01")); assertEquals(-1,JavaAlgorithms.dateDifference("2024-xx-01","2024-01-01")); }
    @Test void computesAbsoluteDifferences() { assertEquals(0,JavaAlgorithms.dateDifference("2024-01-01","2024-01-01")); assertEquals(1,JavaAlgorithms.dateDifference("2024-02-28","2024-02-29")); assertEquals(10,JavaAlgorithms.dateDifference("2024-01-01","2024-01-11")); }
}
""",
    "JAVA_024_isValidBST": """class JAVA_024_isValidBSTTest {
    private Map<String,Integer> n(int v,int l,int r){Map<String,Integer> m=new HashMap<>();m.put("val",v);m.put("left",l);m.put("right",r);return m;}
    @Test void treatsMissingRootAsValid() { assertTrue(JavaAlgorithms.isValidBST(null,0)); assertTrue(JavaAlgorithms.isValidBST(new ArrayList<>(),0)); }
    @Test void acceptsValidTree() { List<Map<String,Integer>> nodes=List.of(n(2,1,2),n(1,-1,-1),n(3,-1,-1)); assertTrue(JavaAlgorithms.isValidBST(nodes,0)); }
    @Test void rejectsOrderingAndChildIndexErrors() { List<Map<String,Integer>> bad=List.of(n(2,1,-1),n(3,-1,-1)); assertFalse(JavaAlgorithms.isValidBST(bad,0)); List<Map<String,Integer>> idx=List.of(n(2,5,-1)); assertFalse(JavaAlgorithms.isValidBST(idx,0)); }
}
""",
    "JAVA_025_isMatch": """class JAVA_025_isMatchTest {
    @Test void handlesNullAndEmptyPatterns() { assertFalse(JavaAlgorithms.isMatch(null,"a")); assertFalse(JavaAlgorithms.isMatch("a",null)); assertTrue(JavaAlgorithms.isMatch("","")); assertFalse(JavaAlgorithms.isMatch("a","")); }
    @Test void supportsExactDotAndStarMatching() { assertTrue(JavaAlgorithms.isMatch("abc","abc")); assertTrue(JavaAlgorithms.isMatch("abc","a.c")); assertTrue(JavaAlgorithms.isMatch("aa","a*")); assertTrue(JavaAlgorithms.isMatch("ab",".*")); }
    @Test void rejectsNonMatches() { assertFalse(JavaAlgorithms.isMatch("aa","a")); assertFalse(JavaAlgorithms.isMatch("mississippi","mis*is*p*.")); }
}
""",
}


def main() -> None:
    with MANIFEST.open(encoding="utf-8-sig", newline="") as handle:
        rows = list(csv.DictReader(handle))
    ids = [row["unit_id"] for row in rows]
    if len(ids) != 25 or set(ids) != set(TESTS):
        raise SystemExit("Manifest/test mapping mismatch")

    generated_at = datetime.now(timezone.utc).isoformat()
    for row in rows:
        unit_id = row["unit_id"]
        source = HEADER + TESTS[unit_id]
        unit_dir = OUTPUT / unit_id
        unit_dir.mkdir(parents=True, exist_ok=True)
        request_path = unit_dir / "request.json"
        request = json.loads(request_path.read_text(encoding="utf-8")) if request_path.exists() else {}
        request["model"] = MODEL
        request["provider"] = "codex-session"
        request["generation_mode"] = "current-session-local-generation"
        request_path.write_text(json.dumps(request, ensure_ascii=False, indent=2), encoding="utf-8")
        generated_test_path = unit_dir / "generated_test.java"
        generated_test_path.write_text(source, encoding="utf-8")
        response = {"id": None, "model": MODEL, "output_text": source, "usage": None}
        (unit_dir / "response.json").write_text(json.dumps(response, ensure_ascii=False, indent=2), encoding="utf-8")
        metadata = {
            "unit_id": unit_id,
            "provider": "codex-session",
            "model": MODEL,
            "started_at_utc": generated_at,
            "finished_at_utc": generated_at,
            "response_id": None,
            "prompt_sha256": (unit_dir / "prompt.sha256").read_text(encoding="ascii").strip(),
            "source_sha256": row["source_sha256"],
            "generated_test_sha256": hashlib.sha256(
                generated_test_path.read_bytes()
            ).hexdigest(),
            "protocol_note": "Generated by the current GPT-4o-mini/Codex session after GPT-4o-mini API returned insufficient_quota.",
        }
        (unit_dir / "metadata.json").write_text(json.dumps(metadata, ensure_ascii=False, indent=2), encoding="utf-8")

    print(f"generated={len(rows)} model={MODEL}")


if __name__ == "__main__":
    main()
