package kz.home.ys.algo.easy.powerOfThree;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PowerOfThreeWithConstantTimeAndSpaceTest {

    @Test
    public void testIsPowerOfThree() {
        boolean powerOfThree = new PowerOfThreeWithConstantTimeAndSpace().isPowerOfThree(27);

        assertTrue(powerOfThree);
    }
}