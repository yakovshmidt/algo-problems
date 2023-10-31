package kz.home.ys.algo.medium.spiralMatrixII;

import junit.framework.TestCase;

public class SpiralMatrixIITest extends TestCase {

    public void testGenerateMatrix() {
        int[][] expected = new int[][]{{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};

        int[][] actual = new SpiralMatrixII().generateMatrix(3);

        for (int i = 0; i < expected.length; i++) {
            for (int j = 0; j < expected[0].length; j++) {
                assertEquals(expected[i][j], actual[i][j]);
            }
        }
    }
}