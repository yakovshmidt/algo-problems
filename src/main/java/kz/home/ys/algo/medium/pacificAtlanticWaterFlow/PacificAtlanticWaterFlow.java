package kz.home.ys.algo.medium.pacificAtlanticWaterFlow;

import java.util.ArrayList;
import java.util.List;

class PacificAtlanticWaterFlow {

    // time - O(N * M)
    // space - O(N * M)
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int rows = heights.length;
        int cols = heights[0].length;
        boolean[][] pacific = new boolean[rows][cols];
        boolean[][] atlantic = new boolean[rows][cols];

        // time - O(N * M)
        // space - O(N * M)
        for (int col = 0; col < cols; col++) {
            dfs(0, col, pacific, heights, heights[0][col]);
            dfs(rows - 1, col, atlantic, heights, heights[rows - 1][col]);
        }

        // time - O(N * M)
        // space - O(N * M)
        for (int row = 0; row < rows; row++) {
            dfs(row, 0, pacific, heights, heights[row][0]);
            dfs(row, cols - 1, atlantic, heights, heights[row][cols - 1]);
        }

        // time - O(N * M)
        // space - O(N * M)
        List<List<Integer>> intersections = new ArrayList<>();
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (pacific[row][col] && atlantic[row][col]) {
                    intersections.add(List.of(row, col));
                }
            }
        }

        return intersections;
    }

    private void dfs(int row, int col, boolean[][] visited, int[][] heights, int prevHeight) {
        if (row < 0 || col < 0 || row >= heights.length || col >= heights[0].length || visited[row][col] || heights[row][col] < prevHeight) {
            return;
        }
        visited[row][col] = true;
        dfs(row - 1, col, visited, heights, heights[row][col]);
        dfs(row + 1, col, visited, heights, heights[row][col]);
        dfs(row, col - 1, visited, heights, heights[row][col]);
        dfs(row, col + 1, visited, heights, heights[row][col]);
    }
}