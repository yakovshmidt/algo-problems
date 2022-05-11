package kz.home.ys.algo.medium.removeDuplicatesFromSortedListII;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;

public class RemoveDuplicatesFromSortedListIIWithFlagTest {

    @Test
    public void testDeleteDuplicates() {
        ListNode listNodeWithoutDuplicates = new RemoveDuplicatesFromSortedListIIWithFlag().deleteDuplicates(
                new ListNode(
                        1,
                        new ListNode(
                                1,
                                new ListNode(
                                        2,
                                        new ListNode(3)
                                )
                        )
                )
        );

        assertEquals(2, listNodeWithoutDuplicates.val);
        assertEquals(3, listNodeWithoutDuplicates.next.val);
        assertNull(listNodeWithoutDuplicates.next.next);
    }
}