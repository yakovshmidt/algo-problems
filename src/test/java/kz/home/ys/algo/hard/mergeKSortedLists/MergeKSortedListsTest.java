package kz.home.ys.algo.hard.mergeKSortedLists;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeKSortedListsTest {

    @Test
    public void testMergeKLists() {
        ListNode first = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode second = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode third = new ListNode(2, new ListNode(6));

        ListNode actual = new MergeKSortedLists().mergeKLists(new ListNode[]{first, second, third});

        ListNode expected = new ListNode(
                1,
                new ListNode(
                        1,
                        new ListNode(
                                2,
                                new ListNode(
                                        3,
                                        new ListNode(
                                                4,
                                                new ListNode(
                                                        4,
                                                        new ListNode(
                                                                5,
                                                                new ListNode(6)
                                                        )
                                                )
                                        )
                                )
                        )

                )
        );

        while (expected != null) {
            assertNotNull(actual);
            assertEquals(expected.val, actual.val);

            actual = actual.next;
            expected = expected.next;
        }
        assertNull(actual);
    }
}