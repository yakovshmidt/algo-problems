package kz.home.ys.algo.easy.removeDuplicatesFromLinkedList;

class RemoveDuplicatesFromLinkedList {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode curr = head;
        while (curr.next != null) {
            ListNode next = curr.next;
            if (curr.val == next.val) {
                curr.next = next.next;
            } else {
                curr = curr.next;
            }
        }

        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}