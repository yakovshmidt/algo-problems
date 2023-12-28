package kz.home.ys.algo.medium.partitionEqualSubsetSum;

import junit.framework.TestCase;

public class PartitionEqualSubsetSumTopDownTest extends TestCase {

    public void testCanPartition() {
        boolean result = new PartitionEqualSubsetSumTopDown().canPartition(new int[]{1, 5, 11, 5});

        assertTrue(result);
    }
}