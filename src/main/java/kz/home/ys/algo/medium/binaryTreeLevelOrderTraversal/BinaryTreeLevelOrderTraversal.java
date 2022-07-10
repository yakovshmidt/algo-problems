package kz.home.ys.algo.medium.binaryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class BinaryTreeLevelOrderTraversal {
    
    // time - O(N) - length of all nodes
    // space - O(L) - length of all leafs
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<List<Integer>> result = new ArrayList<>();
        int counter = 1;
        while (!queue.isEmpty()) {
            int nextCounter = 0;
            List<Integer> currLevel = new ArrayList<>();
            for (int i = 0; i < counter; i++) {
                TreeNode curr = queue.pollFirst();
                currLevel.add(curr.val);
                if (curr.left != null) {
                    queue.offerLast(curr.left);
                    nextCounter++;
                }
                if (curr.right != null) {
                    queue.offerLast(curr.right);
                    nextCounter++;
                }
            }
            counter = nextCounter;
            if (!currLevel.isEmpty()) {
                result.add(currLevel);
            }
        }
        
        return result;
    }
}