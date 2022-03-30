package kz.home.ys.algo.hard.findLoop;

class FindLoopUsingExtraSpace {

    // time - O(N)
    // space - O(N)
    public LinkedListUsingExtraSpace findLoop(LinkedListUsingExtraSpace head) {
        LinkedListUsingExtraSpace curr = head;
        while (curr != null) {
            if (curr.visited) return curr;
            curr.visited = true;
            curr = curr.next;
        }
        return null;
    }

    static class LinkedListUsingExtraSpace {
        int value;
        LinkedListUsingExtraSpace next = null;
        boolean visited = false;

        public LinkedListUsingExtraSpace(int value) {
            this.value = value;
        }
    }
}

