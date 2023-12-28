package kz.home.ys.algo.medium.maxAreaOfIsland;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

class MaxAreaOfIsland {

    private final int[][] directions = new int[][] {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == 1) {
                    max = Math.max(max, countIsland(grid, row, col));
                }
            }
        }
        return max;
    }

    private int countIsland(int[][] grid, int row, int col) {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[] {row, col});
        grid[row][col] = 0;

        int count = 1;
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            List<int[]> neighbours = getNeighbours(grid, cell);
            for (int[] neighbour : neighbours) {
                queue.offer(neighbour);
                grid[neighbour[0]][neighbour[1]] = 0;
                count++;
            }
        }
        return count;
    }

    private List<int[]> getNeighbours(int[][] grid, int[] cell) {
        int row = cell[0];
        int col = cell[1];
        List<int[]> neighbours = new ArrayList<>();
        if (row - 1 >= 0 && grid[row - 1][col] == 1) neighbours.add(new int[] {row - 1, col});
        if (row + 1 < grid.length && grid[row + 1][col] == 1) neighbours.add(new int[] {row + 1, col});
        if (col - 1 >= 0 && grid[row][col - 1] == 1) neighbours.add(new int[] {row, col - 1});
        if (col + 1 < grid[0].length && grid[row][col + 1] == 1) neighbours.add(new int[] {row, col + 1});
        return neighbours;
    }
}