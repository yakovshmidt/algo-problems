package kz.home.ys.algo.hard.containsDuplicateIII;

import junit.framework.TestCase;

public class ContainsDuplicateIIITest extends TestCase {

    public void testContainsNearbyAlmostDuplicate() {
        var containsNearbyAlmostDuplicate = new ContainsDuplicateIII();

        assertTrue(containsNearbyAlmostDuplicate.containsNearbyAlmostDuplicate(new int[]{1,2,3,1}, 3, 0));
        assertTrue(containsNearbyAlmostDuplicate.containsNearbyAlmostDuplicate(new int[]{1, 5, 9, 1, 5, 9}, 3, 3));
        assertFalse(containsNearbyAlmostDuplicate.containsNearbyAlmostDuplicate(new int[]{1, 5, 9, 1, 5, 9}, 2, 3));
    }
}