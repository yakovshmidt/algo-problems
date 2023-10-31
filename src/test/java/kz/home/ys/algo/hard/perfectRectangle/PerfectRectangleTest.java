package kz.home.ys.algo.hard.perfectRectangle;

import junit.framework.TestCase;

public class PerfectRectangleTest extends TestCase {

    public void testIsRectangleCover() {
        boolean isPerfectRectangle = new PerfectRectangle()
                .isRectangleCover(new int[][]{{1, 1, 3, 3}, {3, 1, 4, 2}, {3, 2, 4, 4}, {1, 3, 2, 4}, {2, 3, 3, 4}});

        assertTrue(isPerfectRectangle);
    }
}