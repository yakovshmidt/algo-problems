package kz.home.ys.algo.hard.reverseLinkedList;

class ReverseLinkedListUsingRecursion {

    // time - O(N) - where N is number of nodes
    // space - O(N) - if we consider stack memory, O(1) - if we don't
    public LinkedList reverseLinkedList(LinkedList head) {
        if (head == null || head.next == null) return head;

        LinkedList rest = reverseLinkedList(head.next);
        head.next.next = head;
        head.next = null;
        return rest;
    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}