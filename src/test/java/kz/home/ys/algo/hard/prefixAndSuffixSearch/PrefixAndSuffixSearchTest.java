package kz.home.ys.algo.hard.prefixAndSuffixSearch;

import junit.framework.TestCase;

public class PrefixAndSuffixSearchTest extends TestCase {

    public void testPrefixAndSuffixSearch() {
        PrefixAndSuffixSearch search = new PrefixAndSuffixSearch(new String[]{"abbba", "abba"});

        assertEquals(1, search.f("ab", "ba"));
    }

    public void testPrefixAndSuffixSearch2() {
        PrefixAndSuffixSearch search = new PrefixAndSuffixSearch(new String[]{"apple"});

        assertEquals(-1, search.f("a", "a"));
    }
}