package kz.home.ys.algo.medium.topKFrequentElements;

import junit.framework.TestCase;

public class TopKFrequentElementsQuickSelectTest extends TestCase {

    public void testTopKFrequent() {
        int[] expected = new int[] {2, 1};

        int[] actual = new TopKFrequentElementsQuickSelect().topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);

        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}