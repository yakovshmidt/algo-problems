package kz.home.ys.algo.easy.maximumDepthOfBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

class MaximumDepthOfBinaryTreeIterativeDFS {

    // time - O(N)
    // space - O(N)
    public int maxDepth(TreeNode root) {
        Queue<Pair> queue = new LinkedList<>();
        if (root != null) queue.add(new Pair(root, 1));
        int maxDepth = 0;
        while (!queue.isEmpty()) {
            Pair nodeToDepth = queue.poll();
            TreeNode node = nodeToDepth.node;
            int depth = nodeToDepth.depth;
            maxDepth = depth;
            if (node.left != null) queue.add(new Pair(node.left, depth + 1));
            if (node.right != null) queue.add(new Pair(node.right, depth + 1));
        }
        return maxDepth;
    }

    static class Pair {
        TreeNode node;
        int depth;

        public Pair(TreeNode node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }
}