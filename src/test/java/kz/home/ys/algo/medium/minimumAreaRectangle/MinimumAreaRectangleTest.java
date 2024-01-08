package kz.home.ys.algo.medium.minimumAreaRectangle;

import junit.framework.TestCase;

public class MinimumAreaRectangleTest extends TestCase {

    public void testMinAreaRect() {
        int result = new MinimumAreaRectangle().minAreaRect(new int[][]{{1, 1}, {1, 3}, {3, 1}, {3, 3}, {2, 2}});

        assertEquals(4, result);
    }
}