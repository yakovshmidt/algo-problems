package kz.home.ys.algo.google.googleInterviewLeetCodePremium.treesAndGraphs.binaryTreeMaximumPathSum;


class BinaryTreeMaximumPathSum {
    
    private int maxSum = Integer.MIN_VALUE;

    // time - O(N)
    // space - O(N)
    public int maxPathSum(TreeNode root) {
        findMaxPathSum(root);
        return maxSum;
    }
    
    private int findMaxPathSum(TreeNode root) {
        if (root == null) return 0;
        
        int curr = root.val;
        if (root.left == null && root.right == null) {
            maxSum = Math.max(maxSum, curr);
            return curr;
        }
        
        int left = Math.max(findMaxPathSum(root.left), 0);
        int right = Math.max(findMaxPathSum(root.right), 0);
        
        maxSum = Math.max(maxSum, curr + left + right);
        
        return curr + Math.max(left, right);
    }
}