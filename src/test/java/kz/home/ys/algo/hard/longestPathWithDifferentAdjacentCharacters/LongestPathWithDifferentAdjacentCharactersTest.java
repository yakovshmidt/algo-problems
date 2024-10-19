package kz.home.ys.algo.hard.longestPathWithDifferentAdjacentCharacters;

import junit.framework.TestCase;

public class LongestPathWithDifferentAdjacentCharactersTest extends TestCase {

    public void testLongestPath() {
        int result = new LongestPathWithDifferentAdjacentCharacters().longestPath(new int[]{-1, 0, 0, 1, 1, 2}, "abacbe");

        assertEquals(3, result);
    }
}