package kz.home.ys.algo.medium.deleteAndEarn;

import junit.framework.TestCase;

public class DeleteAndEarnRecursiveTest extends TestCase {

    public void testDeleteAndEarn() {
        int earned = new DeleteAndEarnRecursive().deleteAndEarn(new int[]{3, 4, 2});

        assertEquals(6, earned);
    }
}