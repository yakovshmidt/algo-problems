package kz.home.ys.algo.medium.swappingNodesInALinkedList;

import junit.framework.TestCase;

public class SwappingNodesInALinkedListTest extends TestCase {

    public void testSwapNodes() {
        ListNode expected = new ListNode(1, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(5)))));

        ListNode actual = new SwappingNodesInALinkedList().swapNodes(
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))),
                2
        );

        while (expected != null) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
        assertNull(actual);
    }
}