package kz.home.ys.algo.hard.maximumScoreFromPerformingMultiplicationOperations;

class MaximumScoreFromPerformingMultiplicationOperationsTopDown {

    private int n;
    private int m;
    private int[] nums;
    private int[] multipliers;
    private int[][] memo;

    // time - O(M * M)
    // space - O(M * M)
    public int maximumScore(int[] nums, int[] multipliers) {
        this.n = nums.length;
        this.m = multipliers.length;
        this.nums = nums;
        this.multipliers = multipliers;
        this.memo = new int[n + 1][m + 1];

        return dp(0, n - 1, 0);
    }
    
    private int dp(int startIdx, int endIdx, int mIdx) {
        if (mIdx == m) return 0;
        if (memo[startIdx][mIdx] != 0) return memo[startIdx][mIdx];

        int left = nums[startIdx] * multipliers[mIdx] + dp(startIdx + 1, endIdx, mIdx + 1);
        int right = nums[endIdx] * multipliers[mIdx] + dp(startIdx, endIdx - 1, mIdx + 1);
    
        return memo[startIdx][mIdx] = Math.max(left, right);
    }
}