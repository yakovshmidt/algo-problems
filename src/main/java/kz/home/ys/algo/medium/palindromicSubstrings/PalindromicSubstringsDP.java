package kz.home.ys.algo.medium.palindromicSubstrings;

class PalindromicSubstringsDP {

    // time - O(N^2)
    // space - O(N * N) -> O(2N) -> O(N)
    public int countSubstrings(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        int palindromicSubstringsCount = 0;
        
        for (int j = 0; j < s.length(); j++) {
            dp[j][j] = true;
            palindromicSubstringsCount++;
            for (int i = 0; i < j; i++) {
                if (s.charAt(i) == s.charAt(j) && (j - i <= 2 || dp[i + 1][j - 1])) {
                    dp[i][j] = true;
                    palindromicSubstringsCount++;
                }
            }
         }
        
        return palindromicSubstringsCount;
    }
}