package kz.home.ys.algo.easy.intersectionOfTwoLinkedLists;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntersectionOfTwoLinkedListsTest {

    @Test
    public void testGetIntersectionNode() {
        ListNode commonNode = new ListNode(8, new ListNode(4, new ListNode(5)));
        ListNode nodeA = new ListNode(4, new ListNode(1, commonNode));
        ListNode nodeB = new ListNode(5, new ListNode(6, new ListNode(1, commonNode)));

        ListNode intersectionNode = new IntersectionOfTwoLinkedLists().getIntersectionNode(nodeA, nodeB);

        assertEquals(intersectionNode.val, commonNode.val);
    }
}