package kz.home.ys.algo.easy.validAnagram;

import junit.framework.TestCase;

public class ValidAnagramTest extends TestCase {

    public void testIsAnagram() {
        boolean isAnagram = new ValidAnagram().isAnagram("anagram", "nagaram");

        assertTrue(isAnagram);
    }
}