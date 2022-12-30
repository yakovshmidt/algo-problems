package kz.home.ys.algo.google.googleInterviewLeetCodePremium.dynamicProgramming.longestPalindromicSubstring;

class LongestPalindromicSubstringDP {

    // time - O(N^2)
    // space - O(N^2)
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
                    if (longestSoFar < j - i + 1) {
                        startIdx = i;
                        endIdx = j;
                        longestSoFar = j - i + 1;
                    }
                }
            }
        }
        
        return s.substring(startIdx, endIdx + 1);
    }
}