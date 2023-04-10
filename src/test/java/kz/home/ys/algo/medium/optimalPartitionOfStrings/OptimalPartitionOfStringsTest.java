package kz.home.ys.algo.medium.optimalPartitionOfStrings;

import junit.framework.TestCase;

public class OptimalPartitionOfStringsTest extends TestCase {

    public void testPartitionString() {
        int partitions = new OptimalPartitionOfStrings().partitionString("abacaba");

        assertEquals(4, partitions);
    }
}