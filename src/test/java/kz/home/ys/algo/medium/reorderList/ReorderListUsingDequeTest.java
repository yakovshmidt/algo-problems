package kz.home.ys.algo.medium.reorderList;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ReorderListUsingDequeTest {

    @Test
    public void testReorderList() {
        ListNode actual = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        new ReorderListUsingDeque().reorderList(actual);

        ListNode expected = new ListNode(1, new ListNode(5, new ListNode(2, new ListNode(4, new ListNode(3)))));
        while (actual != null && expected != null) {
            assertEquals(expected.val, actual.val);
            actual = actual.next;
            expected = expected.next;
        }
        assertNull(expected);
        assertNull(actual);
    }
}