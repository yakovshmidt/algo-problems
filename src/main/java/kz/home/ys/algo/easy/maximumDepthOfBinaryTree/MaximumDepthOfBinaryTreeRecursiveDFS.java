package kz.home.ys.algo.easy.maximumDepthOfBinaryTree;

class MaximumDepthOfBinaryTreeRecursiveDFS {
    
    // time - O(N)
    // space - O(N)
    public int maxDepth(TreeNode root) {
        return maxDepth(root, 0);
    }
    
    private int maxDepth(TreeNode node, int depth) {
        if (node == null) return depth;
        
        int leftDepth = maxDepth(node.left, depth + 1);
        int rightDepth = maxDepth(node.right, depth + 1);
        
        return Math.max(leftDepth, rightDepth);
    }
}