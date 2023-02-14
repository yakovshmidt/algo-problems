package kz.home.ys.algo.medium.oddEvenLinkedList;

class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        /*

        2 -> 1 -> 3 -> 5 -> 6 -> 4 -> 7
        |.   |.   |
        2 -> 3 prev.next = next
        1 -> 5 curr.next = next.next
        3 -> 1 next.next = prev.next
        
        2 -> 3 -> 1 -> 5 -> 6 -> 4 -> 7
             |.        |.   |
             3 -> 6 prev.next = next
             5 -> 4 curr.next = next.next
             6 -> 1 next.next -> prev.next

        2 -> 3 -> 6 -> 1 -> 5 -> 4 -> 7

        2 -> 3 -> 6 -> 7 -> 1 -> 5 -> 4
         
        time - O(N)
        space - O(1)

        */

        if (head == null) return null;

        ListNode prev = head;
        ListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
            
            ListNode next = curr.next;
            if (next == null) break;
  
            ListNode temp = prev.next;
            prev.next = next;
            curr.next = next.next;
            next.next = temp;

            prev = prev.next;
        }

        return head;
    }
}











