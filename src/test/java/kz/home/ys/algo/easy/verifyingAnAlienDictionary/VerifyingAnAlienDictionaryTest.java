package kz.home.ys.algo.easy.verifyingAnAlienDictionary;

import junit.framework.TestCase;

public class VerifyingAnAlienDictionaryTest extends TestCase {

    public void testIsAlienSorted1() {
        boolean result = new VerifyingAnAlienDictionary().isAlienSorted(new String[]{"hello", "leetcode" }, "hlabcdefgijkmnopqrstuvwxyz");

        assertTrue(result);
    }

    public void testIsAlienSorted2() {
        boolean result = new VerifyingAnAlienDictionary().isAlienSorted(new String[]{"word","world","row" }, "worldabcefghijkmnpqstuvxyz");

        assertFalse(result);
    }
}