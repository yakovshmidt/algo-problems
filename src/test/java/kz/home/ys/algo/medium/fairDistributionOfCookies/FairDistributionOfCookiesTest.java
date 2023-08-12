package kz.home.ys.algo.medium.fairDistributionOfCookies;

import junit.framework.TestCase;

public class FairDistributionOfCookiesTest extends TestCase {

    public void testDistributeCookies() {
        int result = new FairDistributionOfCookies().distributeCookies(new int[]{6, 1, 3, 2, 2, 4, 1, 2}, 3);

        assertEquals(7, result);
    }
}