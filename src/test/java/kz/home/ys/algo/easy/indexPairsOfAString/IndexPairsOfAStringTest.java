package kz.home.ys.algo.easy.indexPairsOfAString;

import junit.framework.TestCase;

public class IndexPairsOfAStringTest extends TestCase {

    public void testIndexPairs() {
        int[][] expected = new int[][]{{3, 7}, {9, 13}, {10, 17}};

        int[][] actual = new IndexPairsOfAString().indexPairs("thestoryofleetcodeandme", new String[]{"story", "fleet", "leetcode"});

        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i][0], actual[i][0]);
            assertEquals(expected[i][1], actual[i][1]);
        }
    }
}