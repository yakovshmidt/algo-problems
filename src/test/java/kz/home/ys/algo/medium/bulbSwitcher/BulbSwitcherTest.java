package kz.home.ys.algo.medium.bulbSwitcher;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BulbSwitcherTest   {

    @Test
    public void testBulbSwitch() {
        int result = new BulbSwitcher().bulbSwitch(3);

        assertEquals(1, result);
    }
}