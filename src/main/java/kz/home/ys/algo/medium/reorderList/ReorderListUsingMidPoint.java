package kz.home.ys.algo.medium.reorderList;

class ReorderListUsingMidPoint {

    // time - O(N)
    // space - O(1)
    public void reorderList(ListNode head) {
        // find mid
        // reverse second part of list
        // for loop first + second lists

        ListNode mid = getMid(head);
        ListNode midNext = mid.next;
        mid.next = null;

        ListNode curr1 = head;
        ListNode curr2 = reverse(midNext);
        while (curr1 != null && curr2 != null) {  // 1 5
            ListNode next1 = curr1.next;
            ListNode next2 = curr2.next;

            curr1.next = curr2;
            curr2.next = next1;

            curr1 = next1;
            curr2 = next2;
        }
    }

    private ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}