package kz.home.ys.algo.medium.jumpGameII;

import junit.framework.TestCase;

public class JumpGameIIBFSTest extends TestCase {

    public void testJump() {
        int result = new JumpGameIIBFS().jump(new int[]{2, 1, 1, 1, 1});

        assertEquals(3, result);
    }
}