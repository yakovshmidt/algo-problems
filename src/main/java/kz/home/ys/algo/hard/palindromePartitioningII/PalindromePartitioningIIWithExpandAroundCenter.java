package kz.home.ys.algo.hard.palindromePartitioningII;

class PalindromePartitioningIIWithExpandAroundCenter {

    private int[] dp;

    // time - O(N^2)
    // space - O(N)
    public int minCut(String s) {
        this.dp = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            this.dp[i] = i;
        }

        for (int mid = 0; mid < s.length(); mid++) {
            findMinimumCuts(mid, mid, s);
            findMinimumCuts(mid - 1, mid, s);
        }

        return this.dp[s.length() - 1];
    }

    private void findMinimumCuts(int start, int end, String s) {
        for (int startIdx = start, endIdx = end;
             startIdx >= 0 && endIdx < s.length() && s.charAt(startIdx) == s.charAt(endIdx);
             startIdx--, endIdx++) {
            int newCut = startIdx == 0 ? 0 : this.dp[startIdx - 1] + 1;
            this.dp[endIdx] = Math.min(this.dp[endIdx], newCut);
        }
    }
}