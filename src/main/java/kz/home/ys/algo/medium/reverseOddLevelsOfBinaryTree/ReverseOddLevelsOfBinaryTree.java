package kz.home.ys.algo.medium.reverseOddLevelsOfBinaryTree;

import kz.home.ys.algo.helper.Pair;
import kz.home.ys.algo.helper.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

class ReverseOddLevelsOfBinaryTree {

    public TreeNode reverseOddLevels(TreeNode root) {
        if (root == null) return null;
        if (root.left == null && root.right == null) return root;

        Deque<Pair<TreeNode, TreeNode>> deque = new ArrayDeque<>();
        deque.add(new Pair<>(root.left, root.right));
        int level = 2;

        while (!deque.isEmpty()) {
            int size = deque.size();

            while (size > 0) {
                Pair<TreeNode, TreeNode> curr = deque.poll();
                TreeNode left = curr.getKey();
                TreeNode right = curr.getValue();
                if (level % 2 == 0) {
                    int temp = left.val;
                    left.val = right.val;
                    right.val = temp;
                }
                if (left.left != null) {
                    deque.add(new Pair<>(left.left, right.right));
                    deque.add(new Pair<>(left.right, right.left));
                }
                size--;
            }
            level++;
        }

        return root;
    }
}