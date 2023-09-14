package kz.home.ys.algo.hard.countKSubsequencesOfAStringWithMaximumBeauty;

import junit.framework.TestCase;

public class CountKSubsequencesOfAStringWithMaximumBeautyTest extends TestCase {

    public void testCountKSubsequencesWithMaxBeauty() {
        int result = new CountKSubsequencesOfAStringWithMaximumBeauty().countKSubsequencesWithMaxBeauty("bcca", 2);

        assertEquals(4, result);
    }
}