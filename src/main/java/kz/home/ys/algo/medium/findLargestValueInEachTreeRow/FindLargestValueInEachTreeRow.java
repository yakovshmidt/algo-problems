package kz.home.ys.algo.medium.findLargestValueInEachTreeRow;

import kz.home.ys.algo.helper.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class FindLargestValueInEachTreeRow {
    public List<Integer> largestValues(TreeNode root) {
        if (root == null) return new ArrayList<>();

        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        List<Integer> result = new ArrayList<>();

        while (!queue.isEmpty()) {
            int size = queue.size();
            int max = Integer.MIN_VALUE;
            while (size > 0) {
                size--;
                TreeNode node = queue.removeFirst();
                max = Math.max(max, node.val);
                if (node.left != null) queue.addLast(node.left);
                if (node.right != null) queue.addLast(node.right);
            }
            result.add(max);
        }

        return result;
    }
}