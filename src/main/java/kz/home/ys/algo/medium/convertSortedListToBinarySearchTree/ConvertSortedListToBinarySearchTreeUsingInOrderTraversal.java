package kz.home.ys.algo.medium.convertSortedListToBinarySearchTree;

import kz.home.ys.algo.helper.ListNode;
import kz.home.ys.algo.helper.TreeNode;

class ConvertSortedListToBinarySearchTreeUsingInOrderTraversal {

    private ListNode head;

    public TreeNode sortedListToBST(ListNode head) {
        int size = getSize(head);

        this.head = head;

        return createBST(0, size - 1);
    }

    private int getSize(ListNode node) {
        int size = 0;
        while (node != null) {
            size++;
            node = node.next;
        }
        return size;
    }

    private TreeNode createBST(int l, int r) {
        if (l > r) return null;

        int m = l + (r - l) / 2;

        TreeNode left = createBST(l, m - 1);
        TreeNode node = new TreeNode(this.head.val);
        node.left = left;

        this.head = this.head.next;

        TreeNode right = createBST(m + 1, r);
        node.right = right;

        return node;
    }
}