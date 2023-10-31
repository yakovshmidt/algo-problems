package kz.home.ys.algo.hard.numberIncreasingPathsInAGrid;

import java.util.Arrays;

class NumberIncreasingPathsInAGridSorting {

    private final int mod = (int) 1e9 + 7;
    private final int[][] directions = new int[][] {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    private int[][] dp;

    public int countPaths(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        this.dp = new int[m][n];
        Arrays.stream(dp).forEach(row -> Arrays.fill(row, 1));
        
        int[][] cellList = new int[m * n][2];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int index = i * n + j;
                cellList[index][0] = i;
                cellList[index][1] = j;
            }
        }
        Arrays.sort(cellList, (a, b) -> grid[a[0]][a[1]] - grid[b[0]][b[1]]);

        for (int[] cell : cellList) {
            int i = cell[0], j = cell[1];

            for (int[] d : directions) {
                int currI = i + d[0], currJ = j + d[1];
                if (currI >= 0 && currI < m && currJ >= 0 && currJ < n && grid[i][j] < grid[currI][currJ]) {
                    dp[currI][currJ] += dp[i][j];
                    dp[currI][currJ] %= mod;
                }
            }
        }

        int numberOfPaths = 0;
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                numberOfPaths += dp[i][j];
                numberOfPaths %= mod;
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