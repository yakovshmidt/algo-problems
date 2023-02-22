package kz.home.ys.algo.easy.happyNumber;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class HappyNumberTest   {

    @Test
    public void testIsHappy() {
        boolean isHappyNumber = new HappyNumber().isHappy(3);

        assertFalse(isHappyNumber);
    }
}