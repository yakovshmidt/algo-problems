package kz.home.ys.algo.medium.swappingNodesInALinkedList;

class SwappingNodesInALinkedList {
    public ListNode swapNodes(ListNode head, int k) {
        /*
        
        Constraints:
        1 <= k,n <= 10^5
        0 <= node.val <= 100

        Approach:
        1. calculate count of nodes
        2. two pointers

        time - O(N)
        space - O(1)

        */

        ListNode first = head;
        while (k > 1) {
            first = first.next;
            k--;
        }

        ListNode second = head;
        ListNode temp = first;
        while (temp.next != null) {
            second = second.next;
            temp = temp.next;
        }

        swap(first, second);

        return head;
    }

    private void swap(ListNode first, ListNode second) {
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
}