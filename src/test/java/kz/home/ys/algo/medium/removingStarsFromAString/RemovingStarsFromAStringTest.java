package kz.home.ys.algo.medium.removingStarsFromAString;

import junit.framework.TestCase;

public class RemovingStarsFromAStringTest extends TestCase {

    public void testRemoveStars() {
        String result = new RemovingStarsFromAString().removeStars("leet**cod*e");

        assertEquals("lecoe", result);
    }
}