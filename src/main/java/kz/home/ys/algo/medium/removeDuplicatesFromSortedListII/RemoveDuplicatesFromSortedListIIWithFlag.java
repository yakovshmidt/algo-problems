package kz.home.ys.algo.medium.removeDuplicatesFromSortedListII;

public class RemoveDuplicatesFromSortedListIIWithFlag {

    // time - O(N)
    // space - O(1)
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode curr = new ListNode(Integer.MIN_VALUE, head);
        ListNode f = curr;
        ListNode s = curr.next;
        boolean needToDelete = false;
        while (f != null && s != null && s.next != null) {
            if (s.val == s.next.val) {
                s = s.next;
                needToDelete = true;
            } else {
                s = s.next;
                if (needToDelete) {
                    f.next = s;
                    needToDelete = false;
                } else {
                    f = f.next;
                }
            }
        }

        if (needToDelete) {
            f.next = s.next;
        }

        return curr.next;
    }
}