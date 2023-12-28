package kz.home.ys.algo.medium.largestBSTSubtree;

import kz.home.ys.algo.helper.TreeNode;

class LargestBSTSubtreeWithPreOrderTraversal {

    private TreeNode previous;

    public int largestBSTSubtree(TreeNode root) {
        if (root == null) return 0;

        previous = null;

        if (isValidBST(root)) {
            return countNodes(root);
        }

        return Math.max(largestBSTSubtree(root.left), largestBSTSubtree(root.right));
    }

    private boolean isValidBST(TreeNode root) {
        if (root == null) return true;

        if (!isValidBST(root.left)) return false;

        if (previous != null && previous.val >= root.val) return false;

        previous = root;

        return isValidBST(root.right);
    }

    private int countNodes(TreeNode root) {
        if (root == null) return 0;

        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}