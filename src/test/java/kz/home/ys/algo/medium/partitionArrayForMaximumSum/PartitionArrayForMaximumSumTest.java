package kz.home.ys.algo.medium.partitionArrayForMaximumSum;

import junit.framework.TestCase;

public class PartitionArrayForMaximumSumTest extends TestCase {

    public void testMaxSumAfterPartitioning() {
        int result = new PartitionArrayForMaximumSum().maxSumAfterPartitioning(new int[]{1, 15, 7, 9, 2, 5, 10}, 3);

        assertEquals(84, result);
    }
}