package kz.home.ys.algo.easy.distributeCandies;

import junit.framework.TestCase;

public class DistributeCandiesTest extends TestCase {

    public void testDistributeCandies() {
        int distributedCandies = new DistributeCandies().distributeCandies(new int[]{1, 1, 2, 2, 3, 3});

        assertEquals(3, distributedCandies);
    }
}