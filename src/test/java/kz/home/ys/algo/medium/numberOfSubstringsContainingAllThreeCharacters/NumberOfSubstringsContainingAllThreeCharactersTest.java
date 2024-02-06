package kz.home.ys.algo.medium.numberOfSubstringsContainingAllThreeCharacters;

import junit.framework.TestCase;

public class NumberOfSubstringsContainingAllThreeCharactersTest extends TestCase {

    public void testNumberOfSubstrings() {
        int result = new NumberOfSubstringsContainingAllThreeCharacters().numberOfSubstrings("abcabc");

        assertEquals(10, result);
    }
}