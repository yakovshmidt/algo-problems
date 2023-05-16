package kz.home.ys.algo.medium.swapNodesInPairs;

class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        /*

        null -> 1 -> 2 -> 3 -> 4 -> null
        prev -> f -> s -> next

        null -> 1 -> 2 -> 3 -> null

        time - O(N)
        space - O(1)

        */

        if (head == null) return head;

        ListNode newHead = new ListNode(-1, head);
        ListNode prev = newHead;
        while (prev.next != null) {
            ListNode l;
            ListNode r;
            ListNode next;

            l = prev.next;
            r = l.next;

            if (r == null) break;

            next = r.next;
            r.next = l;
            prev.next = r;
            l.next = next;

            prev = l;
        }

        return newHead.next;
    }
}