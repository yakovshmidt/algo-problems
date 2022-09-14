package kz.home.ys.algo.medium.implementTrie;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ImplementTrieTest {

    @Test
    public void testImplementTrie() {
        ImplementTrie trie = new ImplementTrie();

        trie.insert("apple");

        assertTrue(trie.search("apple"));
        assertFalse(trie.search("app"));
        assertTrue(trie.startsWith("app"));

        trie.insert("app");

        assertTrue(trie.search("app"));
    }
}