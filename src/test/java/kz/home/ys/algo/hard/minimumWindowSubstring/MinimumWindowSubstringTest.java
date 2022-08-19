package kz.home.ys.algo.hard.minimumWindowSubstring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumWindowSubstringTest   {

    @Test
    public void testMinWindow() {
        String minWindow = new MinimumWindowSubstring().minWindow("ADOBECODEBANC", "ABC");

        assertEquals("BANC", minWindow);
    }
}