package kz.home.ys.algo.medium.largestBSTSubtree;

import kz.home.ys.algo.helper.TreeNode;

class LargestBSTSubtreeWithPostOrderTraversal {
    public int largestBSTSubtree(TreeNode root) {
        return largestBSTSubtreeHelper(root)[2];
    }

    private int[] largestBSTSubtreeHelper(TreeNode root) {
        if (root == null) return new int[] {Integer.MAX_VALUE, Integer.MIN_VALUE, 0};

        int[] left = largestBSTSubtreeHelper(root.left);
        int[] right = largestBSTSubtreeHelper(root.right);
    
        if (left[1] < root.val && root.val < right[0]) {
            return new int[] {Math.min(root.val, left[0]), Math.max(root.val, right[1]), left[2] + right[2] + 1};
        } else {
            return new int[] {Integer.MIN_VALUE, Integer.MAX_VALUE, Math.max(left[2], right[2])};
        }
    }
}