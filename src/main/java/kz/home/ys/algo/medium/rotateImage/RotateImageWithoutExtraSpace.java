package kz.home.ys.algo.medium.rotateImage;

class RotateImageWithoutExtraSpace {

    // time - O(N^2)
    // space - O(1)
    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int j = 0; j < matrix.length; j++) {
            for (int i = 0; i < matrix.length / 2; i++) {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[j][matrix.length - 1 - i];
                matrix[j][matrix.length - 1 - i] = temp;
            }
        }
    }
}