package kz.home.ys.algo.medium.jumpGame;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class JumpGameNeetCodeTest {

    @Test
    public void testCanJump() {
        boolean canJump1 = new JumpGameNeetCode().canJump(new int[]{3, 2, 1, 0, 4});
        boolean canJump2 = new JumpGameNeetCode().canJump(new int[]{2, 3, 1, 1, 4});

        assertFalse(canJump1);
        assertTrue(canJump2);
    }
}