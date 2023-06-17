package kz.home.ys.algo.easy.largestNumberAtLeastTwiceOfOthers;

import junit.framework.TestCase;

public class LargestNumberAtLeastTwiceOfOthersTest extends TestCase {

    public void testDominantIndex() {
        int resultedIdx = new LargestNumberAtLeastTwiceOfOthers().dominantIndex(new int[]{3, 6, 1, 0});

        assertEquals(1, resultedIdx);
    }
}