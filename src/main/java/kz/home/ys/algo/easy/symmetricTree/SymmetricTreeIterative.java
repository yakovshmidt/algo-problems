package kz.home.ys.algo.easy.symmetricTree;

import java.util.Stack;

class SymmetricTreeIterative {

    // time - O(N)
    // space - O(N)
    public boolean isSymmetric(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode first = stack.pop();
            TreeNode second = stack.pop();
            if (first == null && second == null) continue;
            if (first == null || second == null) return false;
            if (first.val != second.val) return false;
            stack.push(first.left);
            stack.push(second.right);
            stack.push(first.right);
            stack.push(second.left);
        }
        return true;
    }
}