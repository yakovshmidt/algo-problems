package kz.home.ys.algo.google.googleInterviewLeetCodePremium.linkedList.mergeTwoLists;

class MergeTwoLists {
    
    // time - O(N + M)
    // space - O(N + M)
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-101);
        ListNode curr = dummy;
        while (list1 != null || list2 != null) {
            if (list1 == null) {
                curr.next = list2;
                break;
            } else if (list2 == null) {
                curr.next = list1;
                break;
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
        return dummy.next;
    }
}