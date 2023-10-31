package kz.home.ys.algo.medium.removeDuplicateLetters;

import junit.framework.TestCase;

public class RemoveDuplicateLettersTest extends TestCase {

    public void testRemoveDuplicateLetters() {
        String result = new RemoveDuplicateLetters().removeDuplicateLetters("cbacdcbc");

        assertEquals("acdb", result);
    }
}