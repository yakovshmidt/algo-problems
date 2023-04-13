package kz.home.ys.algo.medium.deleteNodesAndReturnForest;

import java.util.*;

class DeleteNodesAndReturnForest {
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        if (root == null) return new ArrayList<>();

        LinkedList<TreeNode> deque = new LinkedList<>();
        deque.addFirst(root);

        Set<Integer> toDelete = new HashSet<>();
        for (int val : to_delete) {
            toDelete.add(val);
        }

        Map<Integer, TreeNode> result = new HashMap<>();
        result.put(root.val, root);
        while (!deque.isEmpty()) {
            TreeNode node = deque.removeLast();
            if (toDelete.contains(node.val)) {
                result.remove(node.val);
                if (node.left != null) result.put(node.left.val, node.left);
                if (node.right != null) result.put(node.right.val, node.right);
            }
            if (node.left != null) {
                deque.addFirst(node.left);
                if (toDelete.contains(node.left.val)) node.left = null;
            }
            if (node.right != null) {
                deque.addLast(node.right);
                if (toDelete.contains(node.right.val)) node.right = null;
            }
        }

        return new ArrayList<>(result.values());
    }
}