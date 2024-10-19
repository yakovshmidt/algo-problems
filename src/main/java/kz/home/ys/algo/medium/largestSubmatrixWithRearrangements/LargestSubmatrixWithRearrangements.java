package kz.home.ys.algo.medium.largestSubmatrixWithRearrangements;

import java.util.Arrays;

class LargestSubmatrixWithRearrangements {
    public int largestSubmatrix(int[][] matrix) {
        int ans = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] != 0 && row > 0) {
                    matrix[row][col] += matrix[row - 1][col];
                }
            }

            int[] currRow = matrix[row].clone();
            Arrays.sort(currRow);
            for (int col = 0; col < matrix[0].length; col++) {
                ans = Math.max(ans, currRow[col] * (matrix[0].length - col));
            }
        }

        return ans;
    }
}