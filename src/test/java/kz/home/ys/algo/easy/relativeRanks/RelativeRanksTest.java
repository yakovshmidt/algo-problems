package kz.home.ys.algo.easy.relativeRanks;

import junit.framework.TestCase;

public class RelativeRanksTest extends TestCase {

    public void testFindRelativeRanks() {
        String[] expected = new String[] {"Gold Medal","5","Bronze Medal","Silver Medal","4"};
        String[] actual = new RelativeRanks().findRelativeRanks(new int[]{10, 3, 8, 9, 4});

        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}