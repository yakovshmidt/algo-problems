package kz.home.ys.algo.medium.reorderList;

import java.util.LinkedList;

class ReorderListUsingDeque {

    // time - O(N)
    // space - O(N)
    public void reorderList(ListNode head) {
        LinkedList<ListNode> deque = new LinkedList<>();
        ListNode curr = head;
        while (curr != null) {
            deque.add(curr);
            curr = curr.next;
        }

        ListNode dummy = new ListNode(0);
        while (!deque.isEmpty()) {
            dummy.next = deque.removeFirst();
            dummy = dummy.next;

            if (!deque.isEmpty()) {
                dummy.next = deque.removeLast();
                dummy = dummy.next;
            }
        }

        dummy.next = null;
    }
}