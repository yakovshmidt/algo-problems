package kz.home.ys.algo.easy.reshapeTheMatrix;

import junit.framework.TestCase;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertMatrices;

public class ReshapeTheMatrixTest extends TestCase {

    public void testMatrixReshape() {
        int[][] expected = new int[][]{{1, 2,}, {3, 4}};

        int[][] actual = new ReshapeTheMatrix().matrixReshape(new int[][]{{1, 2, 3, 4}}, 2, 2);

        assertMatrices(expected, actual);
    }
}