package kz.home.ys.algo.medium.numberOfMatchingSequences;

import junit.framework.TestCase;

public class NumberOfMatchingSequencesTest extends TestCase {

    public void testNumMatchingSubseq() {
        int numMatchingSubseq = new NumberOfMatchingSequences().numMatchingSubseq("abcde", new String[]{"a", "bb", "acd", "ace"});

        assertEquals(3, numMatchingSubseq);
    }
}