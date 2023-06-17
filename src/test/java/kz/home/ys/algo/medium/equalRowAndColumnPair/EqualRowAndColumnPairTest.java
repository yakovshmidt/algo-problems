package kz.home.ys.algo.medium.equalRowAndColumnPair;

import junit.framework.TestCase;

public class EqualRowAndColumnPairTest extends TestCase {

    public void testEqualPairs() {
        int equalPairs = new EqualRowAndColumnPair().equalPairs(new int[][]{{11, 1}, {1, 11}});

        assertEquals(2,equalPairs);
    }
}