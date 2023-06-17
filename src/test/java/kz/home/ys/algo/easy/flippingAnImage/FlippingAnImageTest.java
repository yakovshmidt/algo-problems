package kz.home.ys.algo.easy.flippingAnImage;

import junit.framework.TestCase;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertMatrices;

public class FlippingAnImageTest extends TestCase {

    public void testFlipAndInvertImage() {
        int[][] expected = new int[][] {{1,0,0},{0,1,0},{1,1,1}};

        int[][] actual = new FlippingAnImage().flipAndInvertImage(new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}});

        assertMatrices(expected, actual);
    }
}