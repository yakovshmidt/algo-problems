package kz.home.ys.algo.google.googleInterviewLeetCodePremium.linkedList.removeNthNodeFromEndOfList;

public class RemoveNthNodeFromEndOfListAddLeadingNode {

    // time - O(N)
    // space - O(1)
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        for (int i = 0; i <= n; i++) {
            if (fast != null) {
                fast = fast.next;
            }
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
}
