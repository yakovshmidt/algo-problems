package kz.home.ys.algo.medium.maximumTwinSumOfALinkedList;

import junit.framework.TestCase;

public class MaximumTwinSumOfALinkedListTest extends TestCase {

    public void testPairSum() {
        int maxSumOfTwins = new MaximumTwinSumOfALinkedList().pairSum(
                new ListNode(5, new ListNode(4, new ListNode(2, new ListNode(1))))
        );

        assertEquals(6, maxSumOfTwins);
    }
}