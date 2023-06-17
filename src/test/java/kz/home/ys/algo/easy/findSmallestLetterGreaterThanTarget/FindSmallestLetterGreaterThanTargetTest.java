package kz.home.ys.algo.easy.findSmallestLetterGreaterThanTarget;

import junit.framework.TestCase;

public class FindSmallestLetterGreaterThanTargetTest extends TestCase {

    public void testNextGreatestLetter() {
        char nextGreatestLetter = new FindSmallestLetterGreaterThanTarget().nextGreatestLetter(new char[]{'c', 'f', 'j' }, 'c');

        assertEquals('f', nextGreatestLetter);
    }
}