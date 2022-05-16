package kz.home.ys.algo.medium.numberOfIslands;

import java.util.Stack;

class NumberOfIslands {

    // time - O(N * M)
    // space - O(N * M)
    public int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];

        int numberOfIslands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (visited[i][j]) continue;
                visited[i][j] = true;

                char curr = grid[i][j];
                if (curr == '1') {
                    numberOfIslands++;
                    Stack<Pair> stack = new Stack<>();
                    stack.push(new Pair(i, j));
                    while (!stack.isEmpty()) {
                        Pair position = stack.pop();
                        visited[position.first][position.second] = true;
                        addNeighboursIfLand(stack, visited, grid, position.first, position.second);
                    }
                }
            }
        }
        return numberOfIslands;
    }

    private void addNeighboursIfLand(Stack<Pair> stack,
                                     boolean[][] visited,
                                     char[][] grid,
                                     int i,
                                     int j) {
        if (i - 1 >= 0) {
            if (grid[i - 1][j] == '1' && !visited[i - 1][j]) {
                stack.push(new Pair(i - 1, j));
            }
        }
        if (j - 1 >= 0 && !visited[i][j - 1]) {
            if (grid[i][j - 1] == '1') {
                stack.push(new Pair(i, j - 1));
            }
        }
        if (i + 1 < grid.length && !visited[i + 1][j]) {
            if (grid[i + 1][j] == '1') {
                stack.push(new Pair(i + 1, j));
            }
        }
        if (j + 1 < grid[0].length && !visited[i][j + 1]) {
            if (grid[i][j + 1] == '1') {
                stack.push(new Pair(i, j + 1));
            }
        }
    }
}