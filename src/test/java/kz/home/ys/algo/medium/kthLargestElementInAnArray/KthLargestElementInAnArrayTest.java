package kz.home.ys.algo.medium.kthLargestElementInAnArray;

import junit.framework.TestCase;

public class KthLargestElementInAnArrayTest extends TestCase {

    public void testFindKthLargest() {
        int kthLargest = new KthLargestElementInAnArray().findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2);

        assertEquals(5, kthLargest);
    }
}