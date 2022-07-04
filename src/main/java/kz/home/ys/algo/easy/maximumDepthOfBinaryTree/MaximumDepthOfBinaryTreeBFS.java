package kz.home.ys.algo.easy.maximumDepthOfBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

class MaximumDepthOfBinaryTreeBFS {
    
    // time - O(N)
    // space - O(N)
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        int depth = 0;
        if (root != null) queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                TreeNode node = queue.poll();
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
                size--;
            }
            depth++;
        }
        return depth;
    }
}