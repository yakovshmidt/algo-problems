package kz.home.ys.algo.easy.determineWhetherMatrixCanBeObtainedByRotation;

class DetermineWhetherMatrixCanBeObtainedByRotation {
    public boolean findRotation(int[][] matrix, int[][] target) {
        int maxNumberOfRotations = 4;
        outer: while (maxNumberOfRotations > 0) {
            int n = matrix.length;
            for (int i = 0; i < n / 2; i++) {
                for (int j = i; j < n - 1 - i; j++) {
                    int temp = matrix[n - 1 - j][i];
                    matrix[n - 1 - j][i] = matrix[n - 1 - i][n - j - 1];
                    matrix[n - 1 - i][n - j - 1] = matrix[j][n - 1 - i];
                    matrix[j][n - 1 - i] = matrix[i][j];
                    matrix[i][j] = temp;
                }
            }

            for (int i = 0; i < target.length; i++) {
                for (int j = 0; j < target[i].length; j++) {
                    if (matrix[i][j] != target[i][j]) {
                        maxNumberOfRotations--;
                        continue outer;
                    }
                }
            }

            return true;
        }

        return false;
    }
}