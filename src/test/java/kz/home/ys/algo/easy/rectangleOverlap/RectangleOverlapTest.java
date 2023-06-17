package kz.home.ys.algo.easy.rectangleOverlap;

import junit.framework.TestCase;

public class RectangleOverlapTest extends TestCase {

    public void testIsRectangleOverlap() {
        boolean isRectangleOverlap = new RectangleOverlap().isRectangleOverlap(new int[]{0, 0, 2, 2}, new int[]{1, 1, 3, 3});

        assertTrue(isRectangleOverlap);
    }
}