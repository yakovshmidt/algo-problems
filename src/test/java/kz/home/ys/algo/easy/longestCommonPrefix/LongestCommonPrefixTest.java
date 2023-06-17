package kz.home.ys.algo.easy.longestCommonPrefix;

import junit.framework.TestCase;

public class LongestCommonPrefixTest extends TestCase {

    public void testLongestCommonPrefix() {
        String longestCommonPrefix = new LongestCommonPrefix().longestCommonPrefix(new String[]{"flower", "flow", "flight"});

        assertEquals("fl", longestCommonPrefix);
    }
}