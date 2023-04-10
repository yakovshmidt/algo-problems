package kz.home.ys.algo.medium.numberOfEnclaves;

import junit.framework.TestCase;

public class NumberOfEnclavesTest extends TestCase {

    public void testNumEnclaves() {
        int enclavesNumber = new NumberOfEnclaves().numEnclaves(new int[][]{{0, 0, 0, 0}, {1, 0, 1, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}});

        assertEquals(3, enclavesNumber);
    }
}