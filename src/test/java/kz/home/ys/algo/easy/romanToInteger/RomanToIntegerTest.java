package kz.home.ys.algo.easy.romanToInteger;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanToIntegerTest {

    @Test
    public void testRomanToInt() {
        int romanToInt = new RomanToInteger().romanToInt("MCMXCIV");

        assertEquals(1994, romanToInt);
    }
}