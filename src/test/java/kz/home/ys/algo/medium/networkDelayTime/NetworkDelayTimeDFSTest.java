package kz.home.ys.algo.medium.networkDelayTime;

import junit.framework.TestCase;

public class NetworkDelayTimeDFSTest extends TestCase {

    public void testNetworkDelayTime() {
        int result = new NetworkDelayTimeDFS().networkDelayTime(new int[][]{{2, 1, 1}, {2, 3, 1}, {3, 4, 1}}, 4, 2);

        assertEquals(2, result);
    }
}