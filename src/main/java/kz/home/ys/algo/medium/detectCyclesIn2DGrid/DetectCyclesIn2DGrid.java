package kz.home.ys.algo.medium.detectCyclesIn2DGrid;

import java.util.*;

class DetectCyclesIn2DGrid {
    public boolean containsCycle(char[][] grid) {
        /*
        
        Approach:
        * iterate over the 2D Grid
        * take a cell and using dfs
        * check whether there is a cycle
        
        */

        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (!visited[row][col] && isCycleExist(grid, visited, row, col, -1, -1)) return true;
            }
        }
        return false;
    }

    private boolean isCycleExist(char[][] grid, boolean[][] visited, int row, int col, int prevRow, int prevCol) {
        visited[row][col] = true;
        List<int[]> neighbours = getNeighbours(grid, row, col, grid[row][col]);
        boolean ans = false;
        for (int[] neighbour : neighbours) {
            int nRow = neighbour[0];
            int nCol = neighbour[1];

            if (visited[nRow][nCol] && nRow != prevRow && nCol != prevCol) return true;
            if (!visited[nRow][nCol]) ans = ans || isCycleExist(grid, visited, nRow, nCol, row, col);
        }
        return ans;
    }

    private List<int[]> getNeighbours(char[][] grid, int row, int col, int val) {
        List<int[]> neighbours = new ArrayList<>();
        if (row - 1 >= 0 && grid[row - 1][col] == val) neighbours.add(new int[] {row - 1, col});
        if (col - 1 >= 0 && grid[row][col - 1] == val) neighbours.add(new int[] {row, col - 1});
        if (row + 1 < grid.length && grid[row + 1][col] == val) neighbours.add(new int[] {row + 1, col});
        if (col + 1 < grid[0].length && grid[row][col + 1] == val) neighbours.add(new int[] {row , col + 1});
        return neighbours;
    }
}