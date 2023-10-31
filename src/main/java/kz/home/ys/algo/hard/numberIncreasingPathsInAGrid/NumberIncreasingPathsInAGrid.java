package kz.home.ys.algo.hard.numberIncreasingPathsInAGrid;

class NumberIncreasingPathsInAGrid {

    private final int mod = (int) 1e9 + 7;
    private final int[][] directions = new int[][] {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    private int[][] dp;

    public int countPaths(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        this.dp = new int[m][n];
        
        int numberOfPaths = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                numberOfPaths  = (numberOfPaths + countPaths(grid, i, j)) % mod;
            }
        }
        return numberOfPaths;
    }

    private int countPaths(int[][] grid, int i, int j) {
        if (dp[i][j] != 0) return dp[i][j];
        
        int m = grid.length;
        int n = grid[0].length;

        int result = 1;
        for (int[] direction : directions) {
            int nextI = direction[0] + i;
            int nextJ = direction[1] + j;
            if (nextI >= 0 && nextI < m && nextJ >= 0 && nextJ < n && grid[i][j] < grid[nextI][nextJ]) {
                result += countPaths(grid, nextI, nextJ);
                result %= mod;
            }
        }

        dp[i][j] = result;
        return result;
    }
}