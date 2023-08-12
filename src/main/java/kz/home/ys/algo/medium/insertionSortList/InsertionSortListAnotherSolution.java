package kz.home.ys.algo.medium.insertionSortList;

import kz.home.ys.algo.helper.ListNode;

class InsertionSortListAnotherSolution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null) return head;

        ListNode dummy = new ListNode(0);
        ListNode curr = head;
        ListNode prev = dummy;
        ListNode next;

        while (curr != null) {
            next = curr.next;
            while (prev.next != null && prev.next.val < curr.val) {
                prev = prev.next;
            }

            curr.next = prev.next;
            prev.next = curr;
            curr = next;
            prev = dummy;
        }

        return dummy.next;
    }
}