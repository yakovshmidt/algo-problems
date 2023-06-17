package kz.home.ys.algo.hard.numberOfWaysToReorderArrayToGetSameBST;

import junit.framework.TestCase;

public class NumberOfWaysToReorderArrayToGetSameBSTTest extends TestCase {

    public void testNumOfWays() {
        int numOfWays = new NumberOfWaysToReorderArrayToGetSameBST().numOfWays(new int[]{3, 4, 5, 1, 2});

        assertEquals(5, numOfWays);
    }
}