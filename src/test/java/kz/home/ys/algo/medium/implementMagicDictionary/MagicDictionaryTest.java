package kz.home.ys.algo.medium.implementMagicDictionary;

import junit.framework.TestCase;

public class MagicDictionaryTest extends TestCase {

    public void testMagicDictionary1() {
        MagicDictionary magicDictionary = new MagicDictionary();
        magicDictionary.buildDict(new String[]{"hello", "hallo", "leetcode"});
        assertTrue(magicDictionary.search("hello"));
        assertTrue(magicDictionary.search("hhllo"));
        assertFalse(magicDictionary.search("hell"));
        assertFalse(magicDictionary.search("leetcoded"));
    }

    public void testMagicDictionary2() {
        MagicDictionary magicDictionary = new MagicDictionary();
        magicDictionary.buildDict(new String[]{"hello", "leetcode"});
        assertFalse(magicDictionary.search("hello"));
        assertTrue(magicDictionary.search("hhllo"));
        assertFalse(magicDictionary.search("hell"));
        assertFalse(magicDictionary.search("leetcoded"));
    }
}