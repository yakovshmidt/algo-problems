package kz.home.ys.algo.medium.optimalPartitionOfStrings;

import junit.framework.TestCase;

public class OptimalPartitionOfStringsWithoutExtraSpaceTest extends TestCase {

    public void testPartitionString() {
        int partitions = new OptimalPartitionOfStringsWithoutExtraSpace().partitionString("abacaba");

        assertEquals(4, partitions);
    }
}