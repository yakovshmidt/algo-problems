package kz.home.ys.algo.hard.tallestBillboard;

import junit.framework.TestCase;

public class TallestBillboardTest extends TestCase {

    public void testTallestBillboard() {
        int tallestBillboard = new TallestBillboard().tallestBillboard(new int[]{1, 2, 3, 6});

        assertEquals(6, tallestBillboard);
    }
}