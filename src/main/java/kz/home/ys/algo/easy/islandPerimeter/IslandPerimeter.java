package kz.home.ys.algo.easy.islandPerimeter;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class IslandPerimeter {

    // time - O(N*M)
    // space - O(N*M)
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        Stack<int[]> stack = new Stack<>();
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        outer: for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    stack.push(new int[] {i, j});
                    break outer;
                }
            }
        }

        while (!stack.isEmpty()) {
            int[] curr = stack.pop();
            int rowIdx = curr[0];
            int colIdx = curr[1];
            if (visited[rowIdx][colIdx]) continue;
            visited[rowIdx][colIdx] = true;

            List<int[]> neighbours = getNeighbours(grid, rowIdx, colIdx);
            perimeter += 4 - neighbours.size();

            for (int[] neighbour : neighbours) {
                stack.push(neighbour);
            }
        }

        return perimeter;
    }

    private List<int[]> getNeighbours(int[][] grid, int rowIdx, int colIdx) {
        List<int[]> neighbours = new ArrayList<>();
        if (rowIdx - 1 >= 0 && grid[rowIdx - 1][colIdx] == 1) neighbours.add(new int[] {rowIdx - 1, colIdx});
        if (rowIdx + 1 < grid.length && grid[rowIdx + 1][colIdx] == 1) neighbours.add(new int[] {rowIdx + 1, colIdx});
        if (colIdx - 1 >= 0 && grid[rowIdx][colIdx - 1] == 1) neighbours.add(new int[] {rowIdx, colIdx - 1});
        if (colIdx + 1 < grid[0].length && grid[rowIdx][colIdx + 1] == 1) neighbours.add(new int[] {rowIdx, colIdx + 1});
        return neighbours;
    }
}