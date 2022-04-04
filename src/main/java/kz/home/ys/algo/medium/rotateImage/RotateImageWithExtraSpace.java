package kz.home.ys.algo.medium.rotateImage;

class RotateImageWithExtraSpace {

    // time - O(N^2)
    // space - O(N)
    public void rotate(int[][] matrix) {
        int[][] rotatedMatrix = new int[matrix.length][matrix.length];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                rotatedMatrix[column][matrix.length - 1 - row] = matrix[row][column];
            }
        }
        for (int row = 0; row < rotatedMatrix.length; row++) {
            System.arraycopy(rotatedMatrix[row], 0, matrix[row], 0, rotatedMatrix[row].length);
        }
    }
}