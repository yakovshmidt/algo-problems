package kz.home.ys.algo.medium.binaryTreeLongestConsecutiveSequence;

import kz.home.ys.algo.helper.TreeNode;

class BinaryTreeLongestConsecutiveSequenceUsingBottomUp {
    
    private int maxPath = 0;
    
    public int longestConsecutive(TreeNode root) {
        dfs(root);
        return maxPath;
    }

    private int dfs(TreeNode node) {
        if (node == null) return 0;
        int left = dfs(node.left) + 1;
        int right = dfs(node.right) + 1;
        if (node.left != null && node.val + 1 != node.left.val) left = 1;
        if (node.right != null && node.val + 1 != node.right.val) right = 1;

        int length = Math.max(left, right);
        maxPath = Math.max(maxPath, length);
        return length;        
    }
}