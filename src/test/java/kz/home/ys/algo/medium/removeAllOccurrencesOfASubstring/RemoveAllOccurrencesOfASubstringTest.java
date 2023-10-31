package kz.home.ys.algo.medium.removeAllOccurrencesOfASubstring;

import junit.framework.TestCase;

public class RemoveAllOccurrencesOfASubstringTest extends TestCase {

    public void testRemoveOccurrences() {
        String result = new RemoveAllOccurrencesOfASubstring().removeOccurrences("daabcbaabcbc", "abc");

        assertEquals("dab", result);
    }
}