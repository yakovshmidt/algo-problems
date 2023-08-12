package kz.home.ys.algo.medium.singleNumberII;

import junit.framework.TestCase;

public class SingleNumberIITest extends TestCase {

    public void testSingleNumber() {
        int singleNumber = new SingleNumberII().singleNumber(new int[]{0, 1, 0, 1, 0, 1, 99});

        assertEquals(99, singleNumber);
    }
}