package kz.home.ys.algo.medium.partitionToKEqualSumSubsets;

import junit.framework.TestCase;

public class PartitionToKEqualSumSubsetsTest extends TestCase {

    public void testCanPartitionKSubsets() {
        boolean result = new PartitionToKEqualSumSubsets().canPartitionKSubsets(new int[]{4, 3, 2, 3, 5, 2, 1}, 4);

        assertTrue(result);
    }
}