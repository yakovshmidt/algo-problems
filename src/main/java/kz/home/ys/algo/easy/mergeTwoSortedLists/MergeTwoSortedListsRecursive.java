package kz.home.ys.algo.easy.mergeTwoSortedLists;

import kz.home.ys.algo.easy.mergeTwoSortedLists.util.ListNode;

public class MergeTwoSortedListsRecursive {

    // time - O(N + M) - where N is length of list1 and M is length of list2
    // space - O(N + M)
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode curr;
        if (list1.val < list2.val) {
            curr = list1;
            curr.next = mergeTwoLists(list1.next, list2);
        } else {
            curr = list2;
            curr.next = mergeTwoLists(list1, list2.next);
        }
        return curr;
    }
}