package kz.home.ys.algo.medium.deleteNodesAndReturnForest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class DeleteNodesAndReturnForestRecursive {

    private List<TreeNode> result;
    private Set<Integer> toDelete;

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        result = new ArrayList<>();
        toDelete = new HashSet<>();

        for (int val : to_delete) {
            toDelete.add(val);
        } 

        helper(root);

        if (!toDelete.contains(root.val)) result.add(root);

        return result;
    }

    private TreeNode helper(TreeNode node) {
        if (node == null) return null;

        node.left = helper(node.left);
        node.right = helper(node.right);

        if (toDelete.contains(node.val)) {
            if (node.left != null) {
                result.add(node.left);
            }
            if (node.right != null) {
                result.add(node.right);
            }
            return null;
        }
        return node;
    }
}