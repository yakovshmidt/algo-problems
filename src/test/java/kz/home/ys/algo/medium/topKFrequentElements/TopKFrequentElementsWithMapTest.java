package kz.home.ys.algo.medium.topKFrequentElements;

import junit.framework.TestCase;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertArrays;

public class TopKFrequentElementsWithMapTest extends TestCase {

    public void testTopKFrequent() {
        int[] expected = new int[]{1, 2};

        int[] actual = new TopKFrequentElementsWithMap().topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);

        assertArrays(expected, actual);
    }
}