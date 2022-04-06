package kz.home.ys.algo.hard.interweavingStrings;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class InterweavingStringsWithCacheTest {

    @Test
    public void testInterweavingStrings() {
        String one = "algoexpert";
        String two = "your-dream-job";
        String three = "your-algodream-expertjob";

        boolean actual = new InterweavingStringsWithCache().interweavingStrings(one, two, three);

        assertTrue(actual);
    }

    @Test
    public void testInterweavingStrings_anotherCase() {
        String one = "aaaaaaa";
        String two = "aaaabaaa";
        String three = "aaaaaaaaaaaaaab";

        boolean actual = new InterweavingStringsWithCache().interweavingStrings(one, two, three);

        assertFalse(actual);
    }
}