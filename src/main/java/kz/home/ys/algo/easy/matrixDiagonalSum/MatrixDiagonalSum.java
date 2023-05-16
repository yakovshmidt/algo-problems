package kz.home.ys.algo.easy.matrixDiagonalSum;

class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        /* 
        
        Approach:
        1. choose whether matrix is even or odd
        2. if matrix is odd -> go diagonally -> and caclculate center only once
        3. if matrix is even -> there won't be crosses so that we sum all elements

        time - O(N)
        space - O(1)

        */

        boolean isOdd = mat.length % 2 != 0;
        int n = mat.length;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
            if (isOdd && (n / 2) == i) continue;
            sum += mat[i][n - 1 - i];
        }

        return sum;
    }
}