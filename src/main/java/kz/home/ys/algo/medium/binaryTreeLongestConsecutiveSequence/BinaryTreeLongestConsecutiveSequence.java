package kz.home.ys.algo.medium.binaryTreeLongestConsecutiveSequence;

import kz.home.ys.algo.helper.TreeNode;

class BinaryTreeLongestConsecutiveSequence {
    
    private int maxPath = 0;
    
    public int longestConsecutive(TreeNode root) {
        findLCP(root, 1);
        return maxPath;
    }

    private void findLCP(TreeNode node, int length) {
        maxPath = Math.max(length, maxPath);
        
        TreeNode left = node.left;
        if (left != null) {
            findLCP(left, (node.val + 1 == left.val) ? length + 1 : 1);
        }
        TreeNode right = node.right;
        if (right != null) {
            findLCP(right, (node.val + 1 == right.val) ? length + 1 : 1);
        }
    }
}