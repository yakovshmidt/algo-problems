package kz.home.ys.algo.medium.findDistanceInABinaryTree;

import kz.home.ys.algo.helper.TreeNode;

class FindDistanceInABinaryTreeUsingLCA {

    public int findDistance(TreeNode root, int p, int q) {
        TreeNode lca = findLowerCommonAncestor(root, p, q);
        int pDepth = getDepth(lca, p, 0);
        int qDepth = getDepth(lca, q, 0);
        return pDepth + qDepth;
    }

    private int getDepth(TreeNode lca, int p, int idx) {
        if (lca == null) return 0;
        if (lca.val == p) return idx;
        int depth = getDepth(lca.left, p, idx + 1);
        if (depth != 0) return depth;
        else {
            depth = getDepth(lca.right, p, idx + 1);
            return depth;
        }
    }

    private TreeNode findLowerCommonAncestor(TreeNode node, int p, int q) {
        if (node == null || node.val == p || node.val == q) return node;

        TreeNode left = findLowerCommonAncestor(node.left, p, q);
        TreeNode right = findLowerCommonAncestor(node.right, p, q);

        if (left != null && right != null) return node;
        return left != null ? left : right;
    }
}