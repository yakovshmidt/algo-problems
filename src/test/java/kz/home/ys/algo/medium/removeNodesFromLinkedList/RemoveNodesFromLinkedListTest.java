package kz.home.ys.algo.medium.removeNodesFromLinkedList;

import junit.framework.TestCase;

public class RemoveNodesFromLinkedListTest extends TestCase {

    public void testRemoveNodes() {
        ListNode expected = new ListNode(13, new ListNode(8));

        ListNode actual = new RemoveNodesFromLinkedList().removeNodes(
                new ListNode(
                        5,
                        new ListNode(
                                2,
                                new ListNode(
                                        13,
                                        new ListNode(
                                                3,
                                                new ListNode(8)
                                        )
                                )
                        )
                )
        );

        while (expected != null && actual != null) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
        assertNull(expected);
        assertNull(actual);
    }
}