package kz.home.ys.algo.google.googleInterviewLeetCodePremium.linkedList.removeNthNodeFromEndOfList;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class RemoveNthNodeFromEndOfListAddLeadingNodeTest {

    @Test
    public void testRemoveNthFromEnd() {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        ListNode listNodeWithoutSecondNodeFromEndOfList = new RemoveNthNodeFromEndOfListAddLeadingNode().removeNthFromEnd(listNode, 2);

        assertEquals(1, listNodeWithoutSecondNodeFromEndOfList.val);
        assertEquals(2, listNodeWithoutSecondNodeFromEndOfList.next.val);
        assertEquals(3, listNodeWithoutSecondNodeFromEndOfList.next.next.val);
        assertEquals(5, listNodeWithoutSecondNodeFromEndOfList.next.next.next.val);
        assertNull(listNodeWithoutSecondNodeFromEndOfList.next.next.next.next);
    }

    @Test
    public void testRemoveNthFromEnd_2() {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        ListNode listNodeWithoutSecondNodeFromEndOfList = new RemoveNthNodeFromEndOfListAddLeadingNode().removeNthFromEnd(listNode, 3);

        assertEquals(1, listNodeWithoutSecondNodeFromEndOfList.val);
        assertEquals(2, listNodeWithoutSecondNodeFromEndOfList.next.val);
        assertEquals(4, listNodeWithoutSecondNodeFromEndOfList.next.next.val);
        assertEquals(5, listNodeWithoutSecondNodeFromEndOfList.next.next.next.val);
        assertNull(listNodeWithoutSecondNodeFromEndOfList.next.next.next.next);
    }
}