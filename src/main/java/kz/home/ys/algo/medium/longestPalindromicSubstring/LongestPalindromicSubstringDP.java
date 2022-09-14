package kz.home.ys.algo.medium.longestPalindromicSubstring;

public class LongestPalindromicSubstringDP {

    // time - O(N^2)
    // space - O(1)
    public String longestPalindrome(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        int longestSoFar = 0;
        int startIdx = 0;
        int endIdx = 0;

        for (int j = 0; j < s.length(); j++) {
            dp[j][j] = true;
            for (int i = 0; i < j; i++) {
                if (s.charAt(i) == s.charAt(j) && (j - i <= 2 || dp[i + 1][j - 1])) {
                    dp[i][j] = true;
                    if (j - i + 1 > longestSoFar) {
                        longestSoFar = j - i + 1;
                        startIdx = i;
                        endIdx = j;
                    }
                }
            }
        }

        return s.substring(startIdx, endIdx + 1);
    }
}
