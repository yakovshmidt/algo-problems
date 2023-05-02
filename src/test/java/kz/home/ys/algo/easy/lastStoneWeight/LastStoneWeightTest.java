package kz.home.ys.algo.easy.lastStoneWeight;

import junit.framework.TestCase;

public class LastStoneWeightTest extends TestCase {

    public void testLastStoneWeight() {
        int lastStoneWeight = new LastStoneWeight().lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1});

        assertEquals(1, lastStoneWeight);
    }
}