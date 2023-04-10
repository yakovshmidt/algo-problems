package kz.home.ys.algo.medium.numberOfClosedIslands;

import java.util.ArrayList;
import java.util.List;

class NumberOfClosedIslands {

    private static final int LAND = 0;

    public int closedIsland(int[][] grid) {
        for (int row = 0; row < grid.length; row++) {
            dfs(grid, row, 0);
            dfs(grid, row, grid[0].length - 1);
        }
        for (int col = 0; col < grid[0].length; col++) {
            dfs(grid, 0, col);
            dfs(grid, grid.length - 1, col);
        }

        int closedIslands = 0;
        for (int row = 1; row < grid.length - 1; row++) {
            for (int col = 1; col < grid[0].length - 1; col++) {
                if (grid[row][col] == LAND) {
                    dfs(grid, row, col);
                    closedIslands++;
                }
            }
        }
        return closedIslands;
    }

    private void dfs(int[][] grid, int row, int col) {
        if (grid[row][col] == LAND) {
            grid[row][col] = 2;

            List<int[]> neighbours = getLandNeighbours(grid, row, col);
            for (int[] neighbour : neighbours) {
                dfs(grid, neighbour[0], neighbour[1]);
            }
        }
    }

    private List<int[]> getLandNeighbours(int[][] grid, int row, int col) {
        List<int[]> neighbours = new ArrayList<>();
        if (row - 1 >= 0 && grid[row - 1][col] == LAND) {
            neighbours.add(new int[]{row - 1, col});
        }
        if (row + 1 < grid.length && grid[row + 1][col] == LAND) {
            neighbours.add(new int[]{row + 1, col});
        }
        if (col - 1 >= 0 && grid[row][col - 1] == LAND) {
            neighbours.add(new int[]{row, col - 1});
        }
        if (col + 1 < grid[0].length && grid[row][col + 1] == LAND) {
            neighbours.add(new int[]{row, col + 1});
        }
        return neighbours;
    }
}








