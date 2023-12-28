package kz.home.ys.algo.medium.minimumSwapsToGroupAll1sTogether;

import junit.framework.TestCase;

public class MinimumSwapsToGroupAll1sTogetherTest extends TestCase {

    public void testMinSwaps() {
        int result = new MinimumSwapsToGroupAll1sTogether().minSwaps(new int[]{1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1});

        assertEquals(3, result);
    }
}