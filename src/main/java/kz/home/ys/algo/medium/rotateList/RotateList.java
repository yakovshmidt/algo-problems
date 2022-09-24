package kz.home.ys.algo.medium.rotateList;

class RotateList {

    // time - O(N)
    // space - O(1)
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        
        int numberOfNodes = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            numberOfNodes++;
        }
        tail.next = head;
        
        int numberOfMovements = numberOfNodes - (k % numberOfNodes);
        while (numberOfMovements > 0) {
            head = head.next;
            tail = tail.next;
            numberOfMovements--;
        }
        tail.next = null;
        
        return head;
    }
}