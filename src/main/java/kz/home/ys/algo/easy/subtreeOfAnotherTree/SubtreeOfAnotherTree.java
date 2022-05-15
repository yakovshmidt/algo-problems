package kz.home.ys.algo.easy.subtreeOfAnotherTree;

public class SubtreeOfAnotherTree {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null || subRoot == null) {
            return root == null && subRoot == null;
        } else if (isSameSubtree(root, subRoot)) {
            return true;
        } else {
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }
    }

    private boolean isSameSubtree(TreeNode node, TreeNode subNode) {
        if (node == null || subNode == null) {
            return node == null && subNode == null;
        } else if (node.val == subNode.val) {
            return isSameSubtree(node.left, subNode.left) && isSameSubtree(node.right, subNode.right);
        } else {
            return false;
        }
    }
}