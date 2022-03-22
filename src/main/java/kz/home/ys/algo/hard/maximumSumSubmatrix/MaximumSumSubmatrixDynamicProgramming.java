package kz.home.ys.algo.hard.maximumSumSubmatrix;

class MaximumSumSubmatrixDynamicProgramming {

    // time - O(H * W)
    // space - O(H * W)
    public int maximumSumSubmatrix(int[][] matrix, int size) {
        int[][] sums = createSumMatrix(matrix);
        int maxSumSubmatrix = Integer.MIN_VALUE;

        for (int row = size - 1; row < matrix.length; row++) {
            for (int column = size - 1; column < matrix[row].length; column++) {
                int total = sums[row][column];

                boolean touchesTopBorder = (row - size < 0);
                if (!touchesTopBorder) {
                    total -= sums[row - size][column];
                }

                boolean touchesLeftBorder = (column - size < 0);
                if (!touchesLeftBorder) {
                    total -= sums[row][column - size];
                }


                boolean touchesTopOrLeftBorder = (touchesTopBorder || touchesLeftBorder);
                if (!touchesTopOrLeftBorder) {
                    total += sums[row - size][column - size];
                }

                maxSumSubmatrix = Math.max(total, maxSumSubmatrix);
            }
        }

        return maxSumSubmatrix;
    }

    private int[][] createSumMatrix(int[][] matrix) {
        int[][] sums = new int[matrix.length][matrix[0].length];
        sums[0][0] = matrix[0][0];

        for (int idx = 1; idx < matrix.length; idx++) {
            sums[idx][0] = sums[idx - 1][0] + matrix[idx][0];
        }

        for (int idx = 1; idx < matrix[0].length; idx++) {
            sums[0][idx] = sums[0][idx - 1] + matrix[0][idx];
        }

        for (int row = 1; row < matrix.length; row++) {
            for (int column = 1; column < matrix[row].length; column++) {
                sums[row][column] = sums[row - 1][column] + sums[row][column - 1] - sums[row - 1][column - 1] + matrix[row][column];
            }
        }

        return sums;
    }
}

