package kz.home.ys.algo.hard.findLoop;

class FindLoopWithoutExtraSpace {

    // time - O(N)
    // space - O(1)
    public LinkedListWithoutExtraSpace findLoop(LinkedListWithoutExtraSpace head) {
        LinkedListWithoutExtraSpace first = head.next;
        LinkedListWithoutExtraSpace second = head.next.next;
        while (first != second) {
            first = first.next;
            second = second.next.next;
        }
        first = head;
        while (first != second) {
            first = first.next;
            second = second.next;
        }

        return first;
    }

    static class LinkedListWithoutExtraSpace {
        int value;
        LinkedListWithoutExtraSpace next = null;

        public LinkedListWithoutExtraSpace(int value) {
            this.value = value;
        }
    }
}

