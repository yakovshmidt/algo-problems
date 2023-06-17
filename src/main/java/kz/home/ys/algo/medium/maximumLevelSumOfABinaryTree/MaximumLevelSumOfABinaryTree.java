package kz.home.ys.algo.medium.maximumLevelSumOfABinaryTree;

import java.util.LinkedList;

class MaximumLevelSumOfABinaryTree {
    public int maxLevelSum(TreeNode root) {
        LinkedList<TreeNode> deque = new LinkedList<>();
        deque.addFirst(root);
        int currSum = 0;
        int currSumLevel = 1;
        int maxSum = Integer.MIN_VALUE;
        int maxSumLevel = 0;
        while (!deque.isEmpty()) {
            int size = deque.size();
            while (size > 0) {
                TreeNode node = deque.removeLast();
                if (node.left != null) deque.addFirst(node.left);
                if (node.right != null) deque.addFirst(node.right);
                currSum += node.val;
                size--;
            }
            if (currSum > maxSum) {
                maxSum = currSum;
                maxSumLevel = currSumLevel;
            }
            currSumLevel++;
            currSum = 0;
        }
        return maxSumLevel;
    }
}