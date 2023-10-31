package kz.home.ys.algo.medium.binaryTreeVerticalOrderTraversal;

import kz.home.ys.algo.medium.maximumWidthOfBinaryTree.Pair;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class BinaryTreeVerticalOrderTraversal {
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) return result;

        int startIdx = findStartIdx(root);
        int mostRightIdx = findMostRightIdx(root);

        for (int i = 0; i <= (startIdx + mostRightIdx); i++) {
            result.add(new ArrayList<>());
        }

        LinkedList<Pair<TreeNode, Integer>> deque = new LinkedList<>();
        deque.addFirst(new Pair<>(root, startIdx));
        while (!deque.isEmpty()) {
            Pair<TreeNode, Integer> pair = deque.removeLast();
            TreeNode node = pair.getKey();
            Integer idx = pair.getValue();
            
            result.get(idx).add(node.val);
            
            if (node.left != null) deque.addFirst(new Pair<>(node.left, idx - 1));
            if (node.right != null) deque.addFirst(new Pair<>(node.right, idx + 1));
        }
        return result;
    }

    private int findStartIdx(TreeNode root) {
        int mostLeftIdx = 0;
        Stack<Pair<TreeNode, Integer>> stack = new Stack<>();
        stack.push(new Pair<>(root, 0));

        while (!stack.isEmpty()) {
            Pair<TreeNode, Integer> pair = stack.pop();
            TreeNode node = pair.getKey();
            int idx = pair.getValue();

            if (node.left != null) stack.push(new Pair<>(node.left, idx - 1));
            if (node.right != null) stack.push(new Pair<>(node.right, idx + 1));

            while (node.left != null) {
                node = node.left;
                idx--;
            }
            if (idx < 0) {
                mostLeftIdx = Math.max(mostLeftIdx, -idx);
            }
        }
        return mostLeftIdx;
    }

    private int findMostRightIdx(TreeNode root) {
        int mostRightIdx = 0;
        Stack<Pair<TreeNode, Integer>> stack = new Stack<>();
        stack.push(new Pair<>(root, 0));

        while (!stack.isEmpty()) {
            Pair<TreeNode, Integer> pair = stack.pop();
            TreeNode node = pair.getKey();
            int idx = pair.getValue();

            if (node.left != null) stack.push(new Pair<>(node.left, idx - 1));
            if (node.right != null) stack.push(new Pair<>(node.right, idx + 1));

            while (node.right != null) {
                node = node.right;
                idx--;
            }
            if (idx > 0) {
                mostRightIdx = Math.max(mostRightIdx, idx);
            }
        }
        return mostRightIdx;
    }
}