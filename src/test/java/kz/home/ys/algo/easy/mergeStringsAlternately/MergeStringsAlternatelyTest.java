package kz.home.ys.algo.easy.mergeStringsAlternately;

import junit.framework.TestCase;

public class MergeStringsAlternatelyTest extends TestCase {

    public void testMergeAlternately() {
        String mergedString = new MergeStringsAlternately().mergeAlternately("abcd", "pq");

        assertEquals("apbqcd", mergedString);
    }
}