package kz.home.ys.algo.hard.longestIncreasingPathInAMatrix;

import java.util.ArrayList;
import java.util.List;

class LongestIncreasingPathInAMatrix {
    
    // Time - O(M*N)
    // Space - O(M*N)
    public int longestIncreasingPath(int[][] matrix) {
        int[][] cache = new int[matrix.length][matrix[0].length];
        int maxPath = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                maxPath = Math.max(maxPath, longestIncreasingPath(row, col, matrix, cache));
            }
        }
        return maxPath;
    }
    
    private int longestIncreasingPath(int row, int col, int[][] matrix, int[][] cache) {
        if (cache[row][col] != 0) return cache[row][col];
        
        List<int[]> neighbours = getGreaterNeighbours(row, col, matrix);
        
        for (int[] neighbour : neighbours) {
            int nRow = neighbour[0], nCol = neighbour[1];
            cache[row][col] = Math.max(cache[row][col], longestIncreasingPath(nRow, nCol, matrix, cache));
        }
        
        return ++cache[row][col];
    }
    
    private List<int[]> getGreaterNeighbours(int row, int col, int[][] matrix) {
        List<int[]> neighbours = new ArrayList<>();
        int val = matrix[row][col];
        if (row - 1 >= 0 && matrix[row - 1][col] > val) {
            neighbours.add(new int[] {row - 1, col});
        }
        if (col - 1 >= 0 && matrix[row][col - 1] > val) {
            neighbours.add(new int[] {row, col - 1});
        }
        if (row + 1 < matrix.length && matrix[row + 1][col] > val) {
            neighbours.add(new int[] {row + 1, col});
        }
        if (col + 1 < matrix[0].length && matrix[row][col + 1] > val) {
            neighbours.add(new int[] {row, col + 1});
        }
        return neighbours;
    }
}