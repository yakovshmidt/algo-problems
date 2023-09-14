package kz.home.ys.algo.medium.maximumXOROfTwoNumbersInAnArray;

import junit.framework.TestCase;

public class MaximumXOROfTwoNumbersInAnArrayWithTrieTest extends TestCase {

    public void testFindMaximumXOR() {
        int result = new MaximumXOROfTwoNumbersInAnArrayWithTrie().findMaximumXOR(new int[]{3, 10, 5, 25, 2, 8});

        assertEquals(28, result);
    }
}