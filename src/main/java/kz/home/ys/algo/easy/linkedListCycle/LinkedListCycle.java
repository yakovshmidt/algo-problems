package kz.home.ys.algo.easy.linkedListCycle;

public class LinkedListCycle {

    // time - O(N)
    // space - O(1)
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        
        ListNode slow = head;
        ListNode fast = head.next;
        
        while (slow != null && fast != null) {
            if (slow == fast) return true;
            
            slow = slow.next;
            
            if (fast.next == null) return false;
            fast = fast.next.next;
        }
        
        return false;
    }
}