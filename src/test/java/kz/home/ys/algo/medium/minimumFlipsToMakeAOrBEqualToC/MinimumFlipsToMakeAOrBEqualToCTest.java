package kz.home.ys.algo.medium.minimumFlipsToMakeAOrBEqualToC;

import junit.framework.TestCase;

public class MinimumFlipsToMakeAOrBEqualToCTest extends TestCase {

    public void testMinFlips() {
        int minFlips = new MinimumFlipsToMakeAOrBEqualToC().minFlips(2, 6, 5);

        assertEquals(3, minFlips);
    }
}