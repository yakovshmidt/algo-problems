package kz.home.ys.algo.easy.repeatedSubstringPattern;

import junit.framework.TestCase;

public class RepeatedSubstringPatternLeetCodeTest extends TestCase {

    public void testRepeatedSubstringPattern() {
        boolean isRepeatedSubstringPattern = new RepeatedSubstringPatternLeetCode().repeatedSubstringPattern("abcabcabcabc");

        assertTrue(isRepeatedSubstringPattern);
    }
}