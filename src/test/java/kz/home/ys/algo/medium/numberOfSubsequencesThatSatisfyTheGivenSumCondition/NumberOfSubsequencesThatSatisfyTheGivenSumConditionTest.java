package kz.home.ys.algo.medium.numberOfSubsequencesThatSatisfyTheGivenSumCondition;

import junit.framework.TestCase;

public class NumberOfSubsequencesThatSatisfyTheGivenSumConditionTest extends TestCase {

    public void testNumSubseq() {
        int numSubseq = new NumberOfSubsequencesThatSatisfyTheGivenSumCondition().numSubseq(new int[]{3, 5, 6, 7}, 9);

        assertEquals(4, numSubseq);
    }
}