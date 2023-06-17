package kz.home.ys.algo.easy.shift2DGrid;

import java.util.ArrayList;
import java.util.List;

class Shift2DGrid {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> result = new ArrayList<>(grid.length);
        for (int i = 0; i < grid.length; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < grid[0].length; j++) {
                row.add(-1001);
            }
            result.add(row);
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int newCol = (j + k) % grid[i].length;
                int wrapAroundCount = (j + k) / grid[i].length;
                int newRow = (i + wrapAroundCount) % grid.length;
                result.get(newRow).set(newCol, grid[i][j]);
            }
        }

        return result;
    }
}