package kz.home.ys.algo.hard.maximalRectangle;

class MaximalRectangle {

    // time - O(ROW*COL^2)
    // space - O(ROW*COL)
    public int maximalRectangle(char[][] matrix) {
        int[][] histogram = new int[matrix.length][matrix[0].length];
        int maximalRectangle = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (row == 0) {
                    histogram[row][col] = matrix[row][col] - '0';
                } else {
                    histogram[row][col] = (matrix[row][col] == '0') ? matrix[row][col] - '0' : matrix[row][col] + histogram[row - 1][col] - '0';
                }
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                int rowsNumber = histogram[row][col];
                int colsNumber = 1;

                maximalRectangle = Math.max(maximalRectangle, rowsNumber * colsNumber);

                int nextCol = col + 1;
                while (nextCol < matrix[0].length) {
                    int nextRowsNumber = histogram[row][nextCol];
                    if (nextRowsNumber == 0) break;

                    colsNumber++;
                    rowsNumber = Math.min(nextRowsNumber, rowsNumber);

                    maximalRectangle = Math.max(maximalRectangle, rowsNumber * colsNumber);

                    nextCol++;
                }
            }
        }

        return maximalRectangle;
    }
}