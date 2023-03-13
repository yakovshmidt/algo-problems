package kz.home.ys.algo.easy.powerOfThree;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PowerOfThreeTest {

    @Test
    public void testIsPowerOfThree() {
        boolean powerOfThree = new PowerOfThree().isPowerOfThree(27);

        assertTrue(powerOfThree);
    }
}