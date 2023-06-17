package kz.home.ys.algo.easy.transposeMatrix;

import junit.framework.TestCase;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertMatrices;

public class TransposeMatrixTest extends TestCase {

    public void testTranspose() {
        int[][] expected = new int[][]{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};

        int[][] actual = new TransposeMatrix().transpose(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});

        assertMatrices(expected, actual);
    }
}