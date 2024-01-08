package kz.home.ys.algo.medium.convertSortedListToBinarySearchTree;

import kz.home.ys.algo.helper.ListNode;
import kz.home.ys.algo.helper.TreeNode;

import java.util.ArrayList;
import java.util.List;

class ConvertSortedListToBinarySearchTree {
    public TreeNode sortedListToBST(ListNode head) {
        /*
        
        Approach:
        1. Convert the linked list to an array list
        2. Using binary search create binary search tree

        */

        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        return createBST(list, 0, list.size() - 1);
    }

    private TreeNode createBST(List<Integer> list, int l, int r) {
        if (l > r) return null;
        int m = l + (r - l) / 2;
        TreeNode node = new TreeNode(list.get(m));
        node.left = createBST(list, l, m - 1);
        node.right = createBST(list, m + 1, r);
        return node;
    } 
}