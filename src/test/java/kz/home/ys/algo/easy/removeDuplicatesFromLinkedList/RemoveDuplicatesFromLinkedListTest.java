package kz.home.ys.algo.easy.removeDuplicatesFromLinkedList;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;

public class RemoveDuplicatesFromLinkedListTest {

    @Test
    public void testDeleteDuplicates() {
        ListNode expected = new ListNode(1, new ListNode(2));

        ListNode actual = new RemoveDuplicatesFromLinkedList().deleteDuplicates(
                new ListNode(
                        1,
                        new ListNode(
                                1,
                                new ListNode(2)
                        )
                )
        );

        assertEquals(expected.val, actual.val);
        assertEquals(expected.next.val, actual.next.val);
        assertNull(expected.next.next);
        assertNull(actual.next.next);
    }
}