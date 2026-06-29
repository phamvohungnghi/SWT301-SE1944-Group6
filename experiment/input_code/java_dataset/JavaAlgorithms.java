// =====================================================================
// JAVA DATASET - 25 STANDALONE FUNCTIONS (CC 5-15)
// This dataset is designed for RBL-2 to evaluate LLM Unit Test Generation.
// =====================================================================

import java.util.*;

public class JavaAlgorithms {

    // 1. Bubble Sort (CC = 5)
    public static int[] bubbleSort(int[] arr) {
        if (arr == null) {
            return null;
        }
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return arr;
    }

    // 2. Binary Search (CC = 5)
    public static int binarySearch(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    // 3. Email Validator (CC = 11)
    public static boolean isValidEmail(String email) {
        if (email == null || !email.contains("@") || !email.contains(".")) {
            return false;
        }
        String[] parts = email.split("@");
        if (parts.length != 2) {
            return false;
        }
        String localPart = parts[0];
        String domainPart = parts[1];
        if (localPart.isEmpty() || domainPart.isEmpty()) {
            return false;
        }
        if (!domainPart.contains(".") || domainPart.startsWith(".") || domainPart.endsWith(".")) {
            return false;
        }
        for (int i = 0; i < localPart.length(); i++) {
            char c = localPart.charAt(i);
            if (!Character.isLetterOrDigit(c) && c != '.' && c != '_' && c != '-') {
                return false;
            }
        }
        return true;
    }

    // 4. Merge Intervals (CC = 7)
    public static List<int[]> mergeIntervals(List<int[]> intervals) {
        if (intervals == null || intervals.isEmpty()) {
            return new ArrayList<>();
        }
        for (int[] interval : intervals) {
            if (interval == null || interval.length != 2 || interval[0] > interval[1]) {
                return new ArrayList<>();
            }
        }
        intervals.sort(Comparator.comparingInt(a -> a[0]));
        List<int[]> merged = new ArrayList<>();
        merged.add(intervals.get(0));
        for (int i = 1; i < intervals.size(); i++) {
            int[] current = intervals.get(i);
            int[] prev = merged.get(merged.size() - 1);
            if (current[0] <= prev[1]) {
                prev[1] = Math.max(prev[1], current[1]);
            } else {
                merged.add(current);
            }
        }
        return merged;
    }

    // 5. Calculate Tax (CC = 8)
    public static double calculateTax(double income, String status) {
        if (income <= 0) {
            return 0.0;
        }
        double tax = 0.0;
        if ("single".equalsIgnoreCase(status)) {
            if (income <= 10000) {
                tax = income * 0.1;
            } else if (income <= 40000) {
                tax = 1000 + (income - 10000) * 0.15;
            } else {
                tax = 5500 + (income - 40000) * 0.25;
            }
        } else if ("married".equalsIgnoreCase(status)) {
            if (income <= 20000) {
                tax = income * 0.1;
            } else if (income <= 80000) {
                tax = 2000 + (income - 20000) * 0.15;
            } else {
                tax = 11000 + (income - 80000) * 0.25;
            }
        } else {
            tax = income * 0.2;
        }
        return tax;
    }

    // 6. Validate Password (CC = 10)
    public static boolean validatePassword(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        String specialChars = "!@#$%^&*()-_+=";
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (specialChars.indexOf(c) >= 0) {
                hasSpecial = true;
            }
        }
        return hasUpper && hasLower && hasDigit && hasSpecial;
    }

    // 7. Reverse Polish Notation (RPN) Evaluator (CC = 12)
    public static int evaluateRPN(String expression) {
        if (expression == null || expression.isEmpty()) {
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        String[] tokens = expression.split("\\s+");
        Set<String> operators = new HashSet<>(Arrays.asList("+", "-", "*", "/"));
        for (String token : tokens) {
            if (operators.contains(token)) {
                if (stack.size() < 2) {
                    return 0;
                }
                int b = stack.pop();
                int a = stack.pop();
                if ("+".equals(token)) {
                    stack.push(a + b);
                } else if ("-".equals(token)) {
                    stack.push(a - b);
                } else if ("*".equals(token)) {
                    stack.push(a * b);
                } else if ("/".equals(token)) {
                    if (b == 0) {
                        return 0;
                    }
                    stack.push(a / b);
                }
            } else {
                try {
                    stack.push(Integer.parseInt(token));
                } catch (NumberFormatException e) {
                    return 0;
                }
            }
        }
        return stack.size() == 1 ? stack.pop() : 0;
    }

    // 8. 0/1 Knapsack Problem DP (CC = 8)
    public static int knapsack01(int[] weights, int[] values, int capacity) {
        if (weights == null || values == null || capacity <= 0 || weights.length != values.length) {
            return 0;
        }
        int n = weights.length;
        int[][] dp = new int[n + 1][capacity + 1];
        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= capacity; w++) {
                if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(values[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }
        return dp[n][capacity];
    }

    // 9. JSON Path Lookup (simplistic) (CC = 10)
    public static Object jsonPathLookup(Map<String, Object> data, String path) {
        if (data == null || path == null || path.isEmpty()) {
            return null;
        }
        String[] keys = path.split("\\.");
        Object current = data;
        for (String key : keys) {
            if (current instanceof Map) {
                Map<?, ?> map = (Map<?, ?>) current;
                if (map.containsKey(key)) {
                    current = map.get(key);
                } else {
                    return null;
                }
            } else if (current instanceof List) {
                List<?> list = (List<?>) current;
                boolean isDigit = true;
                for (int i = 0; i < key.length(); i++) {
                    if (!Character.isDigit(key.charAt(i))) {
                        isDigit = false;
                        break;
                    }
                }
                if (isDigit && !key.isEmpty()) {
                    int idx = Integer.parseInt(key);
                    if (idx >= 0 && idx < list.size()) {
                        current = list.get(idx);
                    } else {
                        return null;
                    }
                } else {
                    return null;
                }
            } else {
                return null;
            }
        }
        return current;
    }

    // 10. Run Length Encoding (CC = 6)
    public static String runLengthEncoding(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isLetter(s.charAt(i))) {
                return "";
            }
        }
        StringBuilder encoded = new StringBuilder();
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                encoded.append(count).append(s.charAt(i - 1));
                count = 1;
            }
        }
        encoded.append(count).append(s.charAt(s.length() - 1));
        return encoded.toString();
    }

    // 11. Run Length Decoding (CC = 7)
    public static String runLengthDecoding(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        StringBuilder decoded = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            if (!Character.isDigit(s.charAt(i))) {
                return "";
            }
            StringBuilder numStr = new StringBuilder();
            while (i < s.length() && Character.isDigit(s.charAt(i))) {
                numStr.append(s.charAt(i));
                i++;
            }
            if (i >= s.length()) {
                return "";
            }
            char c = s.charAt(i);
            int count = Integer.parseInt(numStr.toString());
            for (int k = 0; k < count; k++) {
                decoded.append(c);
            }
            i++;
        }
        return decoded.toString();
    }

    // 12. Check Sudoku Board (CC = 11)
    public static boolean checkSudokuBoard(int[][] board) {
        if (board == null || board.length != 9) {
            return false;
        }
        for (int r = 0; r < 9; r++) {
            Set<Integer> rowSet = new HashSet<>();
            Set<Integer> colSet = new HashSet<>();
            for (int c = 0; c < 9; c++) {
                int rv = board[r][c];
                int cv = board[c][r];
                if (rv != 0) {
                    if (rowSet.contains(rv) || rv < 1 || rv > 9) {
                        return false;
                    }
                    rowSet.add(rv);
                }
                if (cv != 0) {
                    if (colSet.contains(cv) || cv < 1 || cv > 9) {
                        return false;
                    }
                    colSet.add(cv);
                }
            }
        }
        return true;
    }

    // 13. Roman to Integer (CC = 6)
    public static int romanToInt(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int total = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (!romanMap.containsKey(c)) {
                return 0;
            }
            int val = romanMap.get(c);
            if (i + 1 < n && romanMap.containsKey(s.charAt(i + 1)) && romanMap.get(s.charAt(i + 1)) > val) {
                total -= val;
            } else {
                total += val;
            }
        }
        return total;
    }

    // 14. Integer to Roman (CC = 5)
    public static String intToRoman(int num) {
        if (num <= 0 || num > 3999) {
            return "";
        }
        int[] vals = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] sybs = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder romanNum = new StringBuilder();
        int i = 0;
        while (num > 0) {
            int count = num / vals[i];
            for (int k = 0; k < count; k++) {
                romanNum.append(sybs[i]);
                num -= vals[i];
            }
            i++;
        }
        return romanNum.toString();
    }

    // 15. Longest Palindromic Substring (CC = 11)
    public static String longestPalindromeSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            int l = i, r = i;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if ((r - l + 1) > longest.length()) {
                    longest = s.substring(l, r + 1);
                }
                l--;
                r++;
            }
            l = i;
            r = i + 1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if ((r - l + 1) > longest.length()) {
                    longest = s.substring(l, r + 1);
                }
                l--;
                r++;
            }
        }
        return longest;
    }

    // 16. Parse CSV Line (CC = 8)
    public static List<String> parseCsvLine(String line) {
        if (line == null) {
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        boolean inQuotes = false;
        int i = 0;
        while (i < line.length()) {
            char c = line.charAt(i);
            if (c == '"') {
                if (inQuotes && i + 1 < line.length() && line.charAt(i + 1) == '"') {
                    current.append('"');
                    i++;
                } else {
                    inQuotes = !inQuotes;
                }
            } else if (c == ',' && !inQuotes) {
                result.add(current.toString());
                current.setLength(0);
            } else {
                current.append(c);
            }
            i++;
        }
        result.add(current.toString());
        return result;
    }

    // 17. Levenshtein Distance (CC = 8)
    public static int levenshteinDistance(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return -1;
        }
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1]));
                }
            }
        }
        return dp[m][n];
    }

    // 18. Find Prime Factors (CC = 6)
    public static List<Integer> findPrimeFactors(int n) {
        if (n <= 1) {
            return new ArrayList<>();
        }
        List<Integer> factors = new ArrayList<>();
        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }
        int d = 3;
        while (d * d <= n) {
            while (n % d == 0) {
                factors.add(d);
                n /= d;
            }
            d += 2;
        }
        if (n > 1) {
            factors.add(n);
        }
        return factors;
    }

    // 19. Luhn Check (CC = 6)
    public static boolean luhnCheck(String cardNumber) {
        if (cardNumber == null || cardNumber.isEmpty()) {
            return false;
        }
        for (int i = 0; i < cardNumber.length(); i++) {
            if (!Character.isDigit(cardNumber.charAt(i))) {
                return false;
            }
        }
        int total = 0;
        boolean alternate = false;
        for (int i = cardNumber.length() - 1; i >= 0; i--) {
            int val = cardNumber.charAt(i) - '0';
            if (alternate) {
                val *= 2;
                if (val > 9) {
                    val -= 9;
                }
            }
            total += val;
            alternate = !alternate;
        }
        return total % 10 == 0;
    }

    // 20. Simple HTML Tokenizer (CC = 7)
    public static List<String[]> simpleHtmlTokenizer(String html) {
        if (html == null) {
            return new ArrayList<>();
        }
        List<String[]> tokens = new ArrayList<>();
        int i = 0;
        int n = html.length();
        while (i < n) {
            if (html.charAt(i) == '<') {
                int j = i + 1;
                while (j < n && html.charAt(j) != '>') {
                    j++;
                }
                if (j < n) {
                    tokens.add(new String[]{"TAG", html.substring(i, j + 1)});
                    i = j + 1;
                } else {
                    tokens.add(new String[]{"TEXT", html.substring(i)});
                    break;
                }
            } else {
                int j = i;
                while (j < n && html.charAt(j) != '<') {
                    j++;
                }
                tokens.add(new String[]{"TEXT", html.substring(i, j)});
                i = j;
            }
        }
        return tokens;
    }

    // 21. Dijkstra Shortest Path (CC = 11)
    public static int dijkstra(int[][] graph, int src, int dest) {
        if (graph == null) {
            return -1;
        }
        int n = graph.length;
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        boolean[] sptSet = new boolean[n];
        for (int count = 0; count < n; count++) {
            int u = -1;
            int minDist = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (!sptSet[i] && dist[i] < minDist) {
                    minDist = dist[i];
                    u = i;
                }
            }
            if (u == -1 || u == dest) {
                break;
            }
            sptSet[u] = true;
            for (int v = 0; v < n; v++) {
                if (graph[u][v] > 0 && !sptSet[v] && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }
        return dist[dest] == Integer.MAX_VALUE ? -1 : dist[dest];
    }

    // 22. Parse Query String (CC = 8)
    public static Map<String, Object> parseQueryString(String qs) {
        if (qs == null || qs.isEmpty()) {
            return new HashMap<>();
        }
        if (qs.startsWith("?")) {
            qs = qs.substring(1);
        }
        Map<String, Object> result = new HashMap<>();
        String[] pairs = qs.split("&");
        for (String pair : pairs) {
            if (pair.isEmpty()) {
                continue;
            }
            String key;
            String val;
            if (pair.contains("=")) {
                String[] parts = pair.split("=", 2);
                key = parts[0];
                val = parts[1];
            } else {
                key = pair;
                val = "";
            }
            if (result.containsKey(key)) {
                Object existing = result.get(key);
                if (existing instanceof List) {
                    @SuppressWarnings("unchecked")
                    List<String> list = (List<String>) existing;
                    list.add(val);
                } else {
                    List<String> list = new ArrayList<>();
                    list.add((String) existing);
                    list.add(val);
                    result.put(key, list);
                }
            } else {
                result.put(key, val);
            }
        }
        return result;
    }

    // 23. Date Difference (CC = 14)
    public static int dateDifference(String date1, String date2) {
        if (date1 == null || date2 == null) {
            return -1;
        }
        try {
            String[] p1 = date1.split("-");
            String[] p2 = date2.split("-");
            if (p1.length != 3 || p2.length != 3) {
                return -1;
            }
            int y1 = Integer.parseInt(p1[0]);
            int m1 = Integer.parseInt(p1[1]);
            int d1 = Integer.parseInt(p1[2]);
            int y2 = Integer.parseInt(p2[0]);
            int m2 = Integer.parseInt(p2[1]);
            int d2 = Integer.parseInt(p2[2]);

            int ny1 = y1, nm1 = m1;
            if (nm1 < 3) {
                ny1 -= 1;
                nm1 += 12;
            }
            int days1 = 365 * ny1 + ny1 / 4 - ny1 / 100 + ny1 / 400 + (153 * nm1 + 2) / 5 + d1;

            int ny2 = y2, nm2 = m2;
            if (nm2 < 3) {
                ny2 -= 1;
                nm2 += 12;
            }
            int days2 = 365 * ny2 + ny2 / 4 - ny2 / 100 + ny2 / 400 + (153 * nm2 + 2) / 5 + d2;

            return Math.abs(days1 - days2);
        } catch (Exception e) {
            return -1;
        }
    }

    // 24. Is Valid BST (CC = 13)
    public static boolean isValidBST(List<Map<String, Integer>> nodes, int rootIdx) {
        if (nodes == null || rootIdx < 0 || rootIdx >= nodes.size()) {
            return true;
        }
        class StackElement {
            int idx;
            long low;
            long high;
            StackElement(int idx, long low, long high) {
                this.idx = idx;
                this.low = low;
                this.high = high;
            }
        }
        Stack<StackElement> stack = new Stack<>();
        stack.push(new StackElement(rootIdx, Long.MIN_VALUE, Long.MAX_VALUE));
        while (!stack.isEmpty()) {
            StackElement curr = stack.pop();
            Map<String, Integer> node = nodes.get(curr.idx);
            int val = node.get("val");
            if (val <= curr.low || val >= curr.high) {
                return false;
            }
            int left = node.getOrDefault("left", -1);
            int right = node.getOrDefault("right", -1);
            if (left >= 0 && left < nodes.size()) {
                stack.push(new StackElement(left, curr.low, val));
            } else if (left != -1) {
                return false;
            }
            if (right >= 0 && right < nodes.size()) {
                stack.push(new StackElement(right, val, curr.high));
            } else if (right != -1) {
                return false;
            }
        }
        return true;
    }

    // 25. Is Match (CC = 8)
    public static boolean isMatch(String s, String p) {
        if (p == null || s == null) {
            return false;
        }
        if (p.isEmpty()) {
            return s.isEmpty();
        }
        boolean firstMatch = (!s.isEmpty() && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.'));
        if (p.length() >= 2 && p.charAt(1) == '*') {
            return (isMatch(s, p.substring(2)) || (firstMatch && isMatch(s.substring(1), p)));
        } else {
            return firstMatch && isMatch(s.substring(1), p.substring(1));
        }
    }
}
