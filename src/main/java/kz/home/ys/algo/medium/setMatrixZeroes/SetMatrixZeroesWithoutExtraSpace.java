package kz.home.ys.algo.medium.setMatrixZeroes;

class SetMatrixZeroesWithoutExtraSpace {

    // time - O(N*M)
    // space - O(1)
    public void setZeroes(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;
        boolean isColZero = false;
        boolean isRowZero = false;

        for (int i = 0; i < R; i++) {
            if (matrix[i][0] == 0) {
                isColZero = true;
                break;
            }
        }
        
        for (int j = 0; j < C; j++) {
            if (matrix[0][j] == 0) {
                isRowZero = true;
                break;
            }
        }

        
        for (int i = 1; i < R; i++) {
            for (int j = 1; j < C; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        
        for (int i = 1; i < R; i++) {
            for (int j = 1; j < C; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        
        if (isRowZero) {
            for (int j = 0; j < C; j++) {
                matrix[0][j] = 0;
            }
        }
        
        if (isColZero) {
            for (int i = 0; i < R; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}