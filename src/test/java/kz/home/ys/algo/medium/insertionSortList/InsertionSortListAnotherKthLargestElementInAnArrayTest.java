package kz.home.ys.algo.medium.insertionSortList;

import junit.framework.TestCase;
import kz.home.ys.algo.helper.ListNode;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertLinkedLists;

public class InsertionSortListAnotherKthLargestElementInAnArrayTest extends TestCase {

    public void testInsertionSortList() {
        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));

        ListNode actual = new InsertionSortListAnotherSolution().insertionSortList(
                new ListNode(4, new ListNode(2, new ListNode(1, new ListNode(3))))
        );

        assertLinkedLists(expected, actual);
    }
}