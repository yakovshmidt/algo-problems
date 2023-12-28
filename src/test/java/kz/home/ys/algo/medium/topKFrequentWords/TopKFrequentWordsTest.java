package kz.home.ys.algo.medium.topKFrequentWords;

import junit.framework.TestCase;

import java.util.List;

public class TopKFrequentWordsTest extends TestCase {

    public void testTopKFrequent() {
        List<String> result = new TopKFrequentWords().topKFrequent(new String[]{"i", "love", "leetcode", "i", "love", "coding"}, 2);

        assertEquals(2, result.size());
        assertEquals("i", result.get(0));
        assertEquals("love", result.get(1));
    }
}