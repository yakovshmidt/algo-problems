package kz.home.ys.algo.easy.wordPattern;

import junit.framework.TestCase;

public class WordPatternTest extends TestCase {

    public void testWordPattern() {
        boolean isWordPattern = new WordPattern().wordPattern("abba", "dog cat cat dog");

        assertTrue(isWordPattern);
    }
}