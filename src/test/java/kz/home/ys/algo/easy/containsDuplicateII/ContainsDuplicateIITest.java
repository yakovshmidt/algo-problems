package kz.home.ys.algo.easy.containsDuplicateII;

import junit.framework.TestCase;

public class ContainsDuplicateIITest extends TestCase {

    public void testContainsNearbyDuplicate() {
        boolean containsNearbyDuplicate = new ContainsDuplicateII().containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1);

        assertTrue(containsNearbyDuplicate);
    }
}