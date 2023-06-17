package kz.home.ys.algo.easy.imageSmoother;

import junit.framework.TestCase;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertMatrices;

public class ImageSmootherTest extends TestCase {

    public void testImageSmoother() {
        int[][] expected = new int[][]{{137, 141, 137}, {141, 138, 141}, {137, 141, 137}};

        int[][] actual = new ImageSmoother().imageSmoother(new int[][]{{100, 200, 100}, {200, 50, 200}, {100, 200, 100}});

        assertMatrices(expected, actual);
    }
}