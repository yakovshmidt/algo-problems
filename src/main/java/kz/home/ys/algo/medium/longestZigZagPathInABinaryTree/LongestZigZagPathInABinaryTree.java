package kz.home.ys.algo.medium.longestZigZagPathInABinaryTree;

class LongestZigZagPathInABinaryTree {
    public int longestZigZag(TreeNode root) {
        /* 
        
        1. take some node and go left and right using recursion
        2. at the child node we:
            2.1 start from the begining and go left and right
            2.2 continue zig zag traversal 
        3. as only we can't go down -> retrurn number of visited nodes
        
        time - O(N)
        space - O(N)

        */
        int result = longestZigZag(root.left, true, 0);
        result = Math.max(result, longestZigZag(root.right, false, 0));
        return result;
    }

    private int longestZigZag(TreeNode node, boolean isLeftDirection, int curr) {
        if (node == null) return curr;

        if (isLeftDirection) {
            return Math.max(longestZigZag(node.right, false, curr + 1), longestZigZag(node.left, true, 0));
        } else {
            return Math.max(longestZigZag(node.left, true, curr + 1), longestZigZag(node.right, false, 0));
        }
    }
}













