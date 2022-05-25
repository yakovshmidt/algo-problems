package kz.home.ys.algo.medium.jumpGame;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class JumpGameTest {

    @Test
    public void testCanJump() {
        boolean canJump = new JumpGame().canJump(new int[]{3, 2, 1, 0, 4});

        assertFalse(canJump);
    }
}