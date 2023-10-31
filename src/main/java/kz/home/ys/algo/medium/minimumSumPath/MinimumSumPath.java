package kz.home.ys.algo.medium.minimumSumPath;

import java.util.Arrays;

class MinimumSumPath {

    // time - O(M*N)
    // space - O(M*N)
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] memo = new int[m][n];
        for (int[] memoRow : memo) {
            Arrays.fill(memoRow, Integer.MAX_VALUE);
        }
        return minPathSum(grid, m - 1, n - 1, memo);
    }

    private int minPathSum(int[][] grid, int m, int n, int[][] memo) {
        if (m < 0 || n < 0) return Integer.MAX_VALUE;
        if (memo[m][n] != Integer.MAX_VALUE) return memo[m][n];
        if (m == 0 && n == 0) return grid[0][0];

        int currGrid = grid[m][n];

        return memo[m][n] = currGrid + Math.min(minPathSum(grid, m, n - 1, memo), minPathSum(grid, m - 1, n, memo));
    }
}