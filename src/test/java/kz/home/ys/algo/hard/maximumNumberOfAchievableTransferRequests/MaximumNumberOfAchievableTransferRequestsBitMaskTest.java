package kz.home.ys.algo.hard.maximumNumberOfAchievableTransferRequests;

import junit.framework.TestCase;

public class MaximumNumberOfAchievableTransferRequestsBitMaskTest extends TestCase {

    public void testMaximumRequests() {
        int maxNumberOfAchievableRequests = new MaximumNumberOfAchievableTransferRequestsBitMask().maximumRequests(
                5,
                new int[][]{{0, 1}, {1, 0}, {0, 1}, {1, 2}, {2, 0}, {3, 4}}
        );

        assertEquals(5, maxNumberOfAchievableRequests);
    }
}