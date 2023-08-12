package kz.home.ys.algo.medium.topKFrequentElements;

import junit.framework.TestCase;

public class TopKFrequentElementsTest extends TestCase {

    public void testTopKFrequent() {
        int[] expected = new int[] {1,2};

        int[] actual = new TopKFrequentElements().topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);

        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}