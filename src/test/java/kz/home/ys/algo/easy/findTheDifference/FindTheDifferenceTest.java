package kz.home.ys.algo.easy.findTheDifference;

import junit.framework.TestCase;

public class FindTheDifferenceTest extends TestCase {

    public void testFindTheDifference() {
        char theDifferenceLetter = new FindTheDifference().findTheDifference("abcd", "abcde");

        assertEquals('e', theDifferenceLetter);
    }
}