package kz.home.ys.algo.google.googleInterviewLeetCodePremium.arraysAndStrings.minimumWindowSubstring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumWindowSubstringTest  {

    @Test
    public void testMinWindow() {
        String minWindow = new MinimumWindowSubstring().minWindow("ADOBECODEBANC", "ABC");

        assertEquals("BANC", minWindow);
    }
}