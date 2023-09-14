package kz.home.ys.algo.medium.wordPatternII;

import junit.framework.TestCase;

public class WordPatternIITest extends TestCase {

    public void testWordPatternMatch() {
        boolean isWordPattern = new WordPatternII().wordPatternMatch("abab", "redblueredblue");

        assertTrue(isWordPattern);
    }
}