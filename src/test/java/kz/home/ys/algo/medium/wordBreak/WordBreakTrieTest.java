package kz.home.ys.algo.medium.wordBreak;

import junit.framework.TestCase;

import java.util.List;

public class WordBreakTrieTest extends TestCase {

    public void testWordBreak() {
        boolean result = new WordBreakTrie().wordBreak("catsandog", List.of("cats","dog","sand","and","cat"));

        assertFalse(result);
    }
}