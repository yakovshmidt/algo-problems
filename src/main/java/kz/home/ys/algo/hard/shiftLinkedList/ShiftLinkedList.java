package kz.home.ys.algo.hard.shiftLinkedList;

class ShiftLinkedList {

    // time - O(N)
    // space - O(1)
    public LinkedList shiftLinkedList(LinkedList head, int k) {
        int length = 1;
        LinkedList listTail = head;
        while (listTail.next != null) {
            listTail = listTail.next;
            length++;
        }

        int offset = Math.abs(k) % length;
        if (offset == 0) return head;
        int newTailIndex = k > 0 ? length - offset : offset;
        LinkedList newTail = head;
        for (int i = 1; i < newTailIndex; i++) {
            newTail = newTail.next;
        }

        LinkedList newHead = newTail.next;
        newTail.next = null;
        listTail.next = head;

        return newHead;
    }

    static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            next = null;
        }
    }
}

