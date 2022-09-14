package kz.home.ys.algo.hard.binaryTreeMaxPathSum;

class BinaryTreeMaxPathSum {

    private int maxPathSum = Integer.MIN_VALUE;

    // time - O(N)
    // space - O(N)
    public int maxPathSum(TreeNode root) {
        findMaxPathSum(root);
        return maxPathSum;
    }

    private int findMaxPathSum(TreeNode node) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) {
            maxPathSum = Math.max(maxPathSum, node.val);
            return node.val;
        }

        int left = Math.max(findMaxPathSum(node.left), 0);
        int right = Math.max(findMaxPathSum(node.right), 0);

        maxPathSum = Math.max(maxPathSum, node.val + left + right);

        return node.val + Math.max(left, right);
    }
}