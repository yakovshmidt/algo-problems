package kz.home.ys.algo.medium.validateBinarySearchTree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class ValidateBinarySearchTree {

    // time - O(N)
    // space - O(1)
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValidBST(TreeNode node, long leftLimit, long rightLimit) {
        if (node == null) return true;

        if (node.val <= leftLimit || node.val >= rightLimit) return false;

        boolean isValidLeft = isValidBST(node.left, leftLimit, node.val);
        boolean isValidRight = isValidBST(node.right, node.val, rightLimit);
        return isValidLeft && isValidRight;
    }
}