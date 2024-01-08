package kz.home.ys.algo.medium.lowestCommonAncestorOfABinaryTree;

import kz.home.ys.algo.helper.TreeNode;

class LowestCommonAncestorOfABinaryTree {

    public TreeNode lowestCommonAncestor(TreeNode node, TreeNode p, TreeNode q) {
        if (node == null || node == p || node == q)
            return node;
        TreeNode left = lowestCommonAncestor(node.left, p, q);
        TreeNode right = lowestCommonAncestor(node.right, p, q);
        if (left != null && right != null)
            return node;
        else if (left != null)
            return left;
        else
            return right;
    }
}