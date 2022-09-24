package kz.home.ys.algo.easy.romanToInteger;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanToIntegerReverseTest   {

    @Test
    public void testRomanToInt() {
        int romanToInt = new RomanToIntegerReverse().romanToInt("MCMXCIV");

        assertEquals(1994, romanToInt);
    }
}