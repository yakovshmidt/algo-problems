package kz.home.ys.algo.medium.numberOfSubsequencesThatSatisfyTheGivenSumCondition;

import junit.framework.TestCase;

public class NumberOfSubsequencesThatSatisfyTheGivenSumConditionBinarySearchTest extends TestCase {

    public void testNumSubseq() {
        int numSubseq = new NumberOfSubsequencesThatSatisfyTheGivenSumCondition().numSubseq(new int[]{3, 3, 6, 8}, 10);

        assertEquals(6, numSubseq);
    }
}