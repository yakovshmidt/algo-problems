package kz.home.ys.algo.medium.shortestPathInBinaryMatrix;

import java.util.LinkedList;
import java.util.Queue;

class ShortestPathInBinaryMatrix {

    // time - O(N)
    // space - O(N)
    public int shortestPathBinaryMatrix(int[][] grid) {
        if (grid.length == 0) return -1;
        if (grid[0][0] != 0 || grid[grid.length - 1][grid[0].length - 1] != 0) return -1;
        
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int[][] directions = new int[][] {{0, 1}, {0, -1}, {-1, 0}, {1, 0}, {1, 1}, {-1, -1}, {-1, 1}, {1, -1}};
        Queue<Pair> queue = new LinkedList<>();                                                                             queue.add(new Pair(0, 0, 1));
        visited[0][0] = true;
                  
        int shortestPath = Integer.MAX_VALUE;
        while (!queue.isEmpty()) {
            Pair curr = queue.poll();
            
            if (curr.row == grid.length - 1 && curr.column == grid[0].length - 1)
                    shortestPath = Math.min(shortestPath, curr.level);
            
            for (int[] direction: directions) {
                int row = curr.row + direction[0];
                int column = curr.column + direction[1];
                int level = curr.level;
                
                if (row >= 0 && column >= 0 && row < grid.length && column < grid[0].length && !visited[row][column] && grid[row][column] != 1) {
                    queue.add(new Pair(row, column, level + 1));
                    visited[row][column] = true;
                }
            }
        }
        
        return shortestPath == Integer.MAX_VALUE ? - 1 : shortestPath;
    }
}