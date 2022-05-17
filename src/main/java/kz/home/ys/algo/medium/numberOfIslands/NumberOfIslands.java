package kz.home.ys.algo.medium.numberOfIslands;

import java.util.Stack;

class NumberOfIslands {

    // time - O(N * M)
    // space - O(1)
    public int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];

        int numberOfIslands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    dfs(i, j, grid.length, grid[0].length, visited, grid);
                    numberOfIslands++;
                }
            }
        }
        return numberOfIslands;
    }

    private void dfs(int i, int j, int m, int n, boolean[][] visited, char[][] grid) {
        if (i < 0 || j < 0 || i >= m || j >= n || visited[i][j] || grid[i][j] == '0') return;
        visited[i][j] = true;

        dfs(i - 1, j, m, n, visited,grid);
        dfs(i, j - 1, m, n, visited,grid);
        dfs(i + 1, j, m, n, visited,grid);
        dfs(i, j + 1, m, n, visited,grid);
    }
}