package kz.home.ys.algo.longestCommonPalindrome;

public class LongestCommonPalindromeDynamicProgramming {

    // time - O(N^2)
    // space - O(N^2)
    public String longestPalindrome(String s) {
        int[][] lcp = new int[s.length()][s.length()];

        String greatestPalindrome = "";
        for (int end = 0; end < s.length(); end++) {
            for (int start = 0; start < s.length(); start++) {
                if (start > end) break;
                if (start == end) {
                    lcp[start][end] = 1;
                } else if (start + 1 == end) {
                    if (s.charAt(start) == s.charAt(end)) {
                        lcp[start][end] = 1;
                    } else {
                        lcp[start][end] = 0;
                    }
                } else {
                    if (s.charAt(start) == s.charAt(end) && lcp[start + 1][end - 1] == 1) {
                        lcp[start][end] = 1;
                    } else {
                        lcp[start][end] = 0;
                    }
                }
                if (lcp[start][end] == 1 && end + 1 - start > greatestPalindrome.length()) {
                    greatestPalindrome = s.substring(start, end + 1);
                }
            }
        }
        return greatestPalindrome;
    }
}
