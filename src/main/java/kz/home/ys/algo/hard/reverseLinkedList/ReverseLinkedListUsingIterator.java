package kz.home.ys.algo.hard.reverseLinkedList;

class ReverseLinkedListUsingIterator {

    // time - O(N) - where N is number of nodes
    // space - O(1)
    public LinkedList reverseLinkedList(LinkedList head) {
        LinkedList curr = head;
        LinkedList prev = null;
        while (curr != null) {
            LinkedList next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}