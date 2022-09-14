package kz.home.ys.algo.hard.binaryTreeMaxPathSum;

class BinaryTreeMaxPathSumWithoutGlobalVariable {

    public int maxPathSum(TreeNode root) {
        int[] maxPathSum = new int[]{Integer.MIN_VALUE};
        findMaxPathSum(root, maxPathSum);
        return maxPathSum[0];
    }

    private int findMaxPathSum(TreeNode node, int[] maxPathSum) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) {
            maxPathSum[0] = Math.max(maxPathSum[0], node.val);
            return node.val;
        }

        int left = Math.max(findMaxPathSum(node.left, maxPathSum), 0);
        int right = Math.max(findMaxPathSum(node.right, maxPathSum), 0);

        maxPathSum[0] = Math.max(maxPathSum[0], node.val + left + right);

        return node.val + Math.max(left, right);
    }
}