package kz.home.ys.algo.easy.repeatedSubstringPattern;

import junit.framework.TestCase;

public class RepeatedSubstringPatternTest extends TestCase {

    public void testRepeatedSubstringPattern() {
        boolean isRepeatedSubstringPattern = new RepeatedSubstringPattern().repeatedSubstringPattern("abcabcabcabc");

        assertTrue(isRepeatedSubstringPattern);
    }
}