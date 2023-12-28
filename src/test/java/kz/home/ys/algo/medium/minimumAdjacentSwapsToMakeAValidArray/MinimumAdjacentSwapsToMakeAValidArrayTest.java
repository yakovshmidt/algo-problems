package kz.home.ys.algo.medium.minimumAdjacentSwapsToMakeAValidArray;

import junit.framework.TestCase;

public class MinimumAdjacentSwapsToMakeAValidArrayTest extends TestCase {

    public void testMinimumSwaps() {
        int result = new MinimumAdjacentSwapsToMakeAValidArray().minimumSwaps(new int[]{3, 4, 5, 5, 3, 1});

        assertEquals(6, result);
    }
}