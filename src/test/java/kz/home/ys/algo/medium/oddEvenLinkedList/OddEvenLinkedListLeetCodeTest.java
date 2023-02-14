package kz.home.ys.algo.medium.oddEvenLinkedList;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class OddEvenLinkedListLeetCodeTest {

    @Test
    public void testOddEvenList() {
        ListNode expected = new ListNode(2, new ListNode(3, new ListNode(6, new ListNode(7, new ListNode(1, new ListNode(5, new ListNode(4)))))));

        ListNode actual = new OddEvenLinkedListLeetCode().oddEvenList(
                new ListNode(2, new ListNode(1, new ListNode(3, new ListNode(5, new ListNode(6, new ListNode(4, new ListNode(7)))))))
        );

        while (expected != null) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
        assertNull(expected);
        assertNull(actual);
    }
}