package kz.home.ys.algo.medium.minimumNumberOfDaysToMakeMBouquets;

import junit.framework.TestCase;

public class MinimumNumberOfDaysToMakeMBouquetsTest extends TestCase {

    public void testMinDays() {
        int result = new MinimumNumberOfDaysToMakeMBouquets().minDays(new int[]{1, 10, 3, 10, 2}, 3, 1);

        assertEquals(3, result);
    }
}