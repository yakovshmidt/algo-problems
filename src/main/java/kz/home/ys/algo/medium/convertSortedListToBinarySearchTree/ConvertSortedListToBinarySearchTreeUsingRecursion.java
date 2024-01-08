package kz.home.ys.algo.medium.convertSortedListToBinarySearchTree;

import kz.home.ys.algo.helper.ListNode;
import kz.home.ys.algo.helper.TreeNode;

class ConvertSortedListToBinarySearchTreeUsingRecursion {

    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;

        ListNode mid = findMiddle(head);

        TreeNode node = new TreeNode(mid.val);

        if (head == mid) return node;

        node.left = sortedListToBST(head);
        node.right = sortedListToBST(mid.next);

        return node;
    }

    private ListNode findMiddle(ListNode head) {
        ListNode prevSlow = head;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            prevSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if (prevSlow != null) {
            prevSlow.next = null;
        }

        return slow;
    }
}