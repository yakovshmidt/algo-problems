package kz.home.ys.algo.easy.circularSentence;

import junit.framework.TestCase;

public class CircularSentenceTest extends TestCase {

    public void testIsCircularSentence() {
        boolean result = new CircularSentence().isCircularSentence("leetcode exercises sound delightful");

        assertTrue(result);
    }
}