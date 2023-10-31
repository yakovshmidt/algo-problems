package kz.home.ys.algo.medium.maxChunksToMakeSorted;

import junit.framework.TestCase;

public class MaxChunksToMakeSortedTest extends TestCase {

    public void testMaxChunksToSorted() {
        int maxChunksToSorted = new MaxChunksToMakeSorted().maxChunksToSorted(new int[]{1, 0, 2, 3, 4});

        assertEquals(4, maxChunksToSorted);
    }
}