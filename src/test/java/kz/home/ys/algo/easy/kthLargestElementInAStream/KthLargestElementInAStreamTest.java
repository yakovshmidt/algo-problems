package kz.home.ys.algo.easy.kthLargestElementInAStream;

import junit.framework.TestCase;

public class KthLargestElementInAStreamTest extends TestCase {

    public void testAdd() {
        KthLargestElementInAStream kthLargestElementInAStream = new KthLargestElementInAStream(3, new int[]{4, 5, 8, 2});

        assertEquals(4,kthLargestElementInAStream.add(3));   // return 4
        assertEquals(5,kthLargestElementInAStream.add(5));   // return 5
        assertEquals(5,kthLargestElementInAStream.add(10));  // return 5
        assertEquals(8,kthLargestElementInAStream.add(9));   // return 8
        assertEquals(8,kthLargestElementInAStream.add(4));   // return 8
    }
}