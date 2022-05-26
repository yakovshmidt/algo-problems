package kz.home.ys.algo.medium.jumpGameII;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JumpGameIITest   {

    @Test
    public void testJump() {
        int jumps = new JumpGameII().jump(new int[]{3, 4, 3, 2, 5, 4, 3});

        assertEquals(3, jumps);
    }
}