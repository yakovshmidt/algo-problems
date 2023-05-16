package kz.home.ys.algo.medium.swapNodesInPairs;

import junit.framework.TestCase;

public class SwapNodesInPairsTest extends TestCase {

    public void testSwapPairs() {
        ListNode expected = new ListNode(2, new ListNode(1, new ListNode(4, new ListNode(3))));

        ListNode actual = new SwapNodesInPairs().swapPairs(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))));

        while (expected != null) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
        assertNull(actual);
    }
}