package kz.home.ys.algo.medium.countNodesEqualToAverageOfSubtree;

import kz.home.ys.algo.helper.TreeNode;

class CountNodesEqualToAverageOfSubtree {

    private int result = 0;

    public int averageOfSubtree(TreeNode root) {
        recursive(root);
        return result;
    }

    private int[] recursive(TreeNode node) {
        if (node == null) return null;

        int val = node.val;
        int count = 1;

        if (node.left != null) {
            int[] left = recursive(node.left);
            int leftValSum = left[0];
            int leftCount = left[1];

            val += leftValSum;
            count += leftCount;
        }

        if (node.right != null) {
            int[] right = recursive(node.right);

            int rightValSum = right[0];
            int rightCount = right[1];

            val += rightValSum;
            count += rightCount;
        }

        if (val / count == node.val) this.result++;

        return new int[] {val, count};
    }
}