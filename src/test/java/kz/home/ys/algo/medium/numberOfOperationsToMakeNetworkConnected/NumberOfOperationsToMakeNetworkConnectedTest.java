package kz.home.ys.algo.medium.numberOfOperationsToMakeNetworkConnected;

import junit.framework.TestCase;

public class NumberOfOperationsToMakeNetworkConnectedTest extends TestCase {

    public void testMakeConnected() {
        int result = new NumberOfOperationsToMakeNetworkConnected().makeConnected(6, new int[][]{{0, 1}, {0, 2}, {0, 3}, {1, 2}, {1, 3}});

        assertEquals(2, result);
    }
}