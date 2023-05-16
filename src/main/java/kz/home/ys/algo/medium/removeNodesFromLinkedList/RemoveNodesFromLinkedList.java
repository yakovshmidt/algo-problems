package kz.home.ys.algo.medium.removeNodesFromLinkedList;

class RemoveNodesFromLinkedList {

    private ListNode newHead;

    public ListNode removeNodes(ListNode head) {
        reverse(head, head);
        int max = Integer.MIN_VALUE;
        ListNode dummy = new ListNode(Integer.MAX_VALUE);
        ListNode curr = dummy;
        while (newHead != null && newHead.next != null) {
            if (newHead.val > newHead.next.val) {
                curr.next = new ListNode(newHead.val);
                curr = curr.next;
                max = Math.max(newHead.val, max);
            }
            newHead = newHead.next;
        }
        return dummy.next;
    }

    private ListNode reverse(ListNode curr, ListNode head) {
        if (curr == null) return null;
        if (curr.next == null) {
            newHead = curr;
            return curr;
        }

        ListNode next = reverse(curr.next, head);
        next.next = curr;
        if (curr == head) curr.next = null;
        return curr;
    }
}