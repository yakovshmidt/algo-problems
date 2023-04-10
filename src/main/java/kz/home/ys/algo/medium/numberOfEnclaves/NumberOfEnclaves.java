package kz.home.ys.algo.medium.numberOfEnclaves;

import java.util.ArrayList;
import java.util.List;

class NumberOfEnclaves {

    // time - O(N*M)
    // space - O(N*M) + O(N*M) -> O(N*M)
    public int numEnclaves(int[][] grid) {
        /* 
        
        Approach:

        1. iterate over the borders and check whether cell is land or not
            1.1 if it is -> dfs or bfs find all relationships
            2.2 if it is not -> skip
        
        */

        boolean[][] visited = new boolean[grid.length][grid[0].length];

        for (int row = 0; row < grid.length; row++) {
            dfs(grid, row, 0, visited);
            dfs(grid, row, grid[0].length - 1, visited);
        }
        for (int col = 0; col < grid[0].length; col++) {
            dfs(grid, 0, col, visited);
            dfs(grid, grid.length - 1, col, visited);
        }

        int islands = 0;
        for (int row = 1; row < grid.length - 1; row++) {
            for (int col = 1; col < grid[0].length - 1; col++) {
                if (!visited[row][col] && grid[row][col] == 1) {
                    islands++;
                }
            }
        }

        return islands;
    }

    private void dfs(int[][] grid, int row, int col, boolean[][] visited) {
        if (visited[row][col]) return;
        visited[row][col] = true;

        if (grid[row][col] == 1) {
            List<int[]> neighbours = new ArrayList<>();
            if (row - 1 >= 0 && !visited[row - 1][col] && grid[row - 1][col] == 1) neighbours.add(new int[] {row - 1, col});
            if (col - 1 >= 0 && !visited[row][col - 1] && grid[row][col - 1] == 1) neighbours.add(new int[] {row, col - 1});
            if (row + 1 < grid.length && !visited[row + 1][col] && grid[row + 1][col] == 1) neighbours.add(new int[] {row + 1, col});
            if (col + 1 < grid[0].length && !visited[row][col + 1] && grid[row][col + 1] == 1) neighbours.add(new int[] {row, col + 1});

            for (int[] neighbour : neighbours) {
                dfs(grid, neighbour[0], neighbour[1], visited);
            }
        }
    }

    public static void main(String[] args) {
        double x = 38.0 / 6.0;
        System.out.println(x % 1 == 0);
    }
}









