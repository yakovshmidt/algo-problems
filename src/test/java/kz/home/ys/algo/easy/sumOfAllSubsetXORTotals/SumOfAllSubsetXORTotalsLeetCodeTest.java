package kz.home.ys.algo.easy.sumOfAllSubsetXORTotals;

import junit.framework.TestCase;

public class SumOfAllSubsetXORTotalsLeetCodeTest extends TestCase {

    public void testSubsetXORSum() {
        int subsetXORSum = new SumOfAllSubsetXORTotalsLeetCode().subsetXORSum(new int[]{5, 1, 6});

        assertEquals(28, subsetXORSum);
    }
}