package kz.home.ys.algo.medium.lowestCommonAncestorOfDeepestLeaves;

import kz.home.ys.algo.helper.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class LowestCommonAncestorOfDeepestLeavesLeetCode {

    // time - O(N^2)
    // space - O(D)
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        if (root == null) return null;
        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);
        if (leftDepth == rightDepth) return root;
        else if (leftDepth > rightDepth) {
            return lcaDeepestLeaves(root.left);
        } else {
            return lcaDeepestLeaves(root.right);
        }
    }

    private int depth(TreeNode node) {
        if (node == null) return 0;
        return Math.max(depth(node.left), depth(node.right)) + 1;
    }
}