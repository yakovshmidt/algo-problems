package kz.home.ys.algo.medium.maximumSwap;

import junit.framework.TestCase;

public class MaximumSwapTest extends TestCase {

    public void testMaximumSwap() {
        int maximumSwap = new MaximumSwap().maximumSwap(9937);

        assertEquals(9973, maximumSwap);
    }
}