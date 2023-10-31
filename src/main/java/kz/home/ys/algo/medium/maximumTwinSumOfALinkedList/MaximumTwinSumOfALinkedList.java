package kz.home.ys.algo.medium.maximumTwinSumOfALinkedList;
class MaximumTwinSumOfALinkedList {
    public int pairSum(ListNode head) {
        /*
        
        1. create a map<Index, Number> -> [0, 5] -> n - i - 1 = 0

        time - O(2*N) = O(N)
        space - O(N/2) = O(N)
        

        Approach 2: REVERSE SECOND PART OF A LINKED LIST
        1. find number of nodes
        2. find last element of left part
        3. reverse second part
        4. iterate from the begining with two pointers

        time - O(N)
        space - O(1)

        */

        int n = getLinkedListSize(head);
        ListNode right = getRight(head, n);
        return getMaxSumOfTwins(head, n, right);
    }

    private int getMaxSumOfTwins(ListNode head, int n, ListNode right) {
        ListNode left = head;
        ListNode reversedRight = reverse(right);
        int maxSumOfTwins = Integer.MIN_VALUE;
        int j = (n / 2);
        while (j > 0) {
            maxSumOfTwins = Math.max(maxSumOfTwins, left.val + reversedRight.val);
            left = left.next;
            reversedRight = reversedRight.next;
            j--;
        }
        return maxSumOfTwins;
    }

    private static ListNode getRight(ListNode head, int n) {
        ListNode right = head;
        int i = (n / 2);
        while (i > 0) {
            right = right.next;
            i--;
        }
        return right;
    }

    private static int getLinkedListSize(ListNode head) {
        int n = 0;
        ListNode curr = head;
        while (curr != null) {
            n++;
            curr = curr.next;
        }
        return n;
    }

    private ListNode reverse(ListNode node) {
        if (node == null || node.next == null) return node;

        ListNode rest = reverse(node.next);
        node.next.next = node;
        node.next = null;
        return rest;
    }
}



















