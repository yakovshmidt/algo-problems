package kz.home.ys.algo.google.googleInterviewLeetCodePremium.linkedList.addTwoNumbers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class AddTwoNumbersTest {

    @Test
    public void testAddTwoNumbers() {
        ListNode expected = new ListNode(7, new ListNode(0, new ListNode(8)));

        ListNode actual = new AddTwoNumbers().addTwoNumbers(
                new ListNode(2, new ListNode(4, new ListNode(3))),
                new ListNode(5, new ListNode(6, new ListNode(4)))
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