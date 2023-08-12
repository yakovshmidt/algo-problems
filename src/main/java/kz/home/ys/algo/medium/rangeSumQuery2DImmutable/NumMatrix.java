package kz.home.ys.algo.medium.rangeSumQuery2DImmutable;

class NumMatrix {

    private final int[][] matrixSum;

    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        this.matrixSum = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int top = (i - 1 < 0) ? 0 : matrixSum[i - 1][j];
                int left = (j - 1 < 0) ? 0 : matrixSum[i][j - 1];
                int common = (i - 1 < 0 || j - 1 < 0) ? 0 : matrixSum[i - 1][j - 1];
                matrixSum[i][j] = matrix[i][j] + top + left - common;
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int top = (row1 - 1 < 0) ? 0 : matrixSum[row1 - 1][col2];
        int left = (col1 - 1 < 0) ? 0 : matrixSum[row2][col1 - 1];
        int common = (row1 - 1 < 0 || col1 - 1 < 0) ? 0 : matrixSum[row1 - 1][col1 - 1];
        return matrixSum[row2][col2] - top - left + common;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */