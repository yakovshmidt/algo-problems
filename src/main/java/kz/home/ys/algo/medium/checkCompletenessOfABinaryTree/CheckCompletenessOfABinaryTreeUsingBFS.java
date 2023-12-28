package kz.home.ys.algo.medium.checkCompletenessOfABinaryTree;

import kz.home.ys.algo.helper.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

class CheckCompletenessOfABinaryTreeUsingBFS {
    public boolean isCompleteTree(TreeNode root) {
        if (root == null) return true;

        boolean nullNodeFound = false;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode node = q.poll();

            if (node == null) {
                nullNodeFound = true;
            } else {
                if (nullNodeFound) return false;
                q.offer(node.left);
                q.offer(node.right);
            }
        }
        return true;
    }
}