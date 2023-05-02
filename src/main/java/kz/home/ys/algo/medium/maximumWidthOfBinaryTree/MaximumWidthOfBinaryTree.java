package kz.home.ys.algo.medium.maximumWidthOfBinaryTree;

import java.util.LinkedList;

class MaximumWidthOfBinaryTree {

    // time - O(N)
    // space - O(N)
    public int widthOfBinaryTree(TreeNode root) {
        LinkedList<Pair<TreeNode, Integer>> deque = new LinkedList<>();
        deque.addFirst(new Pair<>(root, 0));
        int maxWidth = 0;
        while (!deque.isEmpty()) {
            Pair<TreeNode, Integer> head = deque.getFirst();
            int levelSize = deque.size();
            Pair<TreeNode, Integer> elem = null;
            for (int i = 0; i < levelSize; i++) {
                elem = deque.removeFirst();
                TreeNode node = elem.getKey();
                if (node.left != null) {
                    deque.addLast(new Pair<>(node.left, 2 * elem.getValue()));
                }
                if (node.right != null) {
                    deque.addLast(new Pair<>(node.right, 2 * elem.getValue() + 1));
                }
            }
            maxWidth = Math.max(maxWidth, elem.getValue() - head.getValue() + 1);
        }

        return maxWidth;
    }
}






