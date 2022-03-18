package kz.home.ys.algo.easy.mergeTwoSortedLists;

import junit.framework.TestCase;
import kz.home.ys.algo.easy.mergeTwoSortedLists.util.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNull;

public class MergeTwoSortedListsRecursiveTest {

    @Test
    public void testMergeTwoLists() {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode expected = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));

        ListNode actual = new MergeTwoSortedListsRecursive().mergeTwoLists(list1, list2);

        while (actual != null) {
            assertNotNull(expected);
            assertEquals(expected.val, actual.val);
            actual = actual.next;
            expected = expected.next;
        }
        assertNull(expected);
        assertNull(actual);
    }
}