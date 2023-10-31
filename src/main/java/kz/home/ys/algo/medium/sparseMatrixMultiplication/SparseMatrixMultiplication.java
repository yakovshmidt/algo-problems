package kz.home.ys.algo.medium.sparseMatrixMultiplication;

import java.util.ArrayList;
import java.util.List;

class SparseMatrixMultiplication {
    public int[][] multiply(int[][] mat1, int[][] mat2) {
        int m = mat1.length;
        int k = mat1[0].length;
        int n = mat2[0].length;

        List<List<Pair<Integer, Integer>>> mat1AsList = compressMatrix(mat1);
        List<List<Pair<Integer, Integer>>> mat2AsList = compressMatrix(mat2);

        int[][] ans = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (Pair<Integer, Integer> mat1Element : mat1AsList.get(i)) {
                int element1 = mat1Element.getKey();
                int mat1Col = mat1Element.getValue();
                for (Pair<Integer, Integer> mat2Element : mat2AsList.get(mat1Col)) {
                    int element2 = mat2Element.getKey();
                    int mat2Col = mat2Element.getValue();
                    ans[i][mat2Col] += element1 * element2;
                }
            }
        }

        return ans;
    }

    private List<List<Pair<Integer, Integer>>> compressMatrix(int[][] mat) {
        List<List<Pair<Integer, Integer>>> compressedMatrix = new ArrayList<>();

        for (int[] ints : mat) {
            List<Pair<Integer, Integer>> currRow = new ArrayList<>();
            for (int j = 0; j < mat[0].length; j++) {
                if (ints[j] != 0) {
                    currRow.add(new Pair<>(ints[j], j));
                }
            }
            compressedMatrix.add(currRow);
        }

        return compressedMatrix;
    }
}