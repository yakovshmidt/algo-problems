package kz.home.ys.algo.hard.maximalRectangle;

class MaximalRectangleWithoutMatrix {

    // time - O(ROW*COL^2)
    // space - O(COL)
    public int maximalRectangle(char[][] matrix) {
        int cols = matrix[0].length;
        int rows = matrix.length;
        int maximalRectangle = 0;

        int[] histogram = new int[cols];

        for (int row = 0; row < rows; row++) {
            calculateHistogram(matrix, histogram, row, cols);
            for (int col = 0; col < cols; col++) {
                maximalRectangle = findMaximalRectangle(matrix, histogram, maximalRectangle, col);
            }
        }

        return maximalRectangle;
    }

    private void calculateHistogram(char[][] matrix, int[] histogram, int row, int cols) {
        for (int col = 0; col < cols; col++) {
            if (row == 0) {
                histogram[col] = matrix[row][col] - '0';
            } else {
                histogram[col] = (matrix[row][col] == '0') ? matrix[row][col] - '0' : matrix[row][col] + histogram[col] - '0';
            }
        }
    }

    private int findMaximalRectangle(char[][] matrix, int[] histogram, int possibleMaximalRectangle, int col) {
        int height = histogram[col];
        int width = 1;

        possibleMaximalRectangle = Math.max(possibleMaximalRectangle, height * width);

        int nextCol = col + 1;
        while (nextCol < matrix[0].length) {
            int nextHeight = histogram[nextCol];
            if (nextHeight == 0) break;

            width++;
            height = Math.min(nextHeight, height);

            possibleMaximalRectangle = Math.max(possibleMaximalRectangle, height * width);

            nextCol++;
        }
        return possibleMaximalRectangle;
    }
}