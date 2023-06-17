package kz.home.ys.algo.medium.lowestCommonAncestorOfABinaryTreeIV;

import java.util.*;

public class LowestCommonAncestorOfABinaryTreeIV {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode[] nodes) {
        Set<TreeNode> nodesAsSet = new HashSet<>();
        Collections.addAll(nodesAsSet, nodes);
        return lcaHelper(root, nodesAsSet);
    }

    private TreeNode lcaHelper(TreeNode root, Set<TreeNode> nodes) {
        if (root == null) return null;
        if (nodes.contains(root)) return root;
        TreeNode left = lcaHelper(root.left, nodes);
        TreeNode right = lcaHelper(root.right, nodes);
        if (left != null && right != null) return root;
        return left == null ? right : left;
    }
}