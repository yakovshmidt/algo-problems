package kz.home.ys.algo.easy.mergeTwoSortedLists;

import kz.home.ys.algo.easy.mergeTwoSortedLists.util.ListNode;

public class MergeTwoSortedListsIterative {

    // time - O(N + M) - where N is length of list1 and M is length of list2
    // space - O(N + M)
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode curr = head;
        while (list1 != null || list2 != null) {
            if (list1 == null) {
                curr.next = new ListNode(list2.val);
                list2 = list2.next;
            } else if (list2 == null) {
                curr.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                if (list1.val < list2.val) {
                    curr.next = new ListNode(list1.val);
                    list1 = list1.next;
                } else {
                    curr.next = new ListNode(list2.val);
                    list2 = list2.next;
                }
            }
            curr = curr.next;
        }

        return head.next;
    }
}