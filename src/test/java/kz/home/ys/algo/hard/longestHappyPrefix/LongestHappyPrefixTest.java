package kz.home.ys.algo.hard.longestHappyPrefix;

import junit.framework.TestCase;

public class LongestHappyPrefixTest extends TestCase {

    public void testLongestPrefix() {
        String result = new LongestHappyPrefix().longestPrefix("ababcabab");

        assertEquals("abab", result);
    }
}