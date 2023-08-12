package kz.home.ys.algo.medium.leftmostColumnWithAtLeastAOne;

import java.util.List;

public class BinaryMatrix {

    private final int[][] binaryMatrix;

    public BinaryMatrix(int[][] binaryMatrix) {
        this.binaryMatrix = binaryMatrix;
    }

    public int get(int row, int col) {
        return binaryMatrix[row][col];
    }

    public List<Integer> dimensions() {
        return List.of(this.binaryMatrix.length, this.binaryMatrix[0].length);
    }
}
