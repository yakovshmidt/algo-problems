package kz.home.ys.algo.hard.maximumSumSubmatrix;

class MaximumSumSubmatrixBruteForce {

    // time - O(W * H * S^2) - where W is width and H is height of matrix and S is input size
    // space - O(1)
    public int maximumSumSubmatrix(int[][] matrix, int size) {
        int maxSumSubmatrix = Integer.MIN_VALUE;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                maxSumSubmatrix = Math.max(getSubmatrixSum(matrix, row, column, size), maxSumSubmatrix);
            }
        }
        return maxSumSubmatrix;
    }

    private int getSubmatrixSum(int[][] matrix, int startRow, int startColumn, int size) {
        if (!isValid(matrix, startRow, startColumn, size)) {
            return Integer.MIN_VALUE;
        }
        int currentSumSubmatrix = 0;
        for (int currRow = startRow; currRow < startRow + size; currRow++) {
            for (int currColumn = startColumn; currColumn < startColumn + size; currColumn++) {
                currentSumSubmatrix += matrix[currRow][currColumn];
            }
        }
        return currentSumSubmatrix;
    }

    private boolean isValid(int[][] matrix, int startRow, int startColumn, int size) {
        int endRow = startRow + size;
        int endColumn = startColumn + size;
        return startRow >= 0
                && startColumn >= 0
                && endRow <= matrix.length
                && endColumn <= matrix[startRow].length;
    }
}

