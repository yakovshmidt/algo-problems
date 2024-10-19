package kz.home.ys.algo.easy.balancedBinaryTree;

import kz.home.ys.algo.helper.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        int highestDepth = -1;
        int lowestDepth = -1;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.addFirst(root);
        int depth = 1;
        while (!deque.isEmpty()) {
            int size = deque.size();
            while (size > 0) {
                TreeNode node = deque.removeLast();
                if ((node.left == null || node.right == null) && highestDepth == -1) {
                    highestDepth = depth;
                }
                if (node.left == null && node.right == null) {
                    lowestDepth = depth;
                }

                if (node.left != null) deque.addFirst(node.left);
                if (node.right != null) deque.addFirst(node.right);
                size--;
            }
            depth++;
        }

        return lowestDepth == -1 || lowestDepth - highestDepth <= 1;
    }
}