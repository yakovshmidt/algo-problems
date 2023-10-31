package kz.home.ys.algo.easy.constructStringFromBinaryTree;

import kz.home.ys.algo.helper.TreeNode;

class ConstructStringFromBinaryTree {

    private final StringBuilder sb = new StringBuilder();

    public String tree2str(TreeNode root) {
        if (root == null) return "";

        sb.append(root.val);

        if (root.left == null) {
            if (root.right != null) sb.append("()");
        } else {
            sb.append("(");
            tree2str(root.left);
            sb.append(")");
        }

        if (root.right != null) {
            sb.append("(");
            tree2str(root.right);
            sb.append(")");
        }

        return sb.toString();
    }
}