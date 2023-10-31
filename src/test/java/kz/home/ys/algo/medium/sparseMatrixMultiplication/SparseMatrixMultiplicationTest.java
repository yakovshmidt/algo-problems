package kz.home.ys.algo.medium.sparseMatrixMultiplication;

import junit.framework.TestCase;

public class SparseMatrixMultiplicationTest extends TestCase {

    public void testMultiply() {
        int[][] expected = new int[][]{{7, 0, 0}, {-7, 0, 3}};

        int[][] actual = new SparseMatrixMultiplication().multiply(
                new int[][]{{1, 0, 0}, {-1, 0, 3}},
                new int[][]{{7, 0, 0}, {0, 0, 0}, {0, 0, 1}}
        );

        for (int i = 0; i < actual.length; i++) {
            for (int j = 0; j < actual[0].length; j++) {
                assertEquals(expected[i][j], actual[i][j]);
            }
        }
    }
}