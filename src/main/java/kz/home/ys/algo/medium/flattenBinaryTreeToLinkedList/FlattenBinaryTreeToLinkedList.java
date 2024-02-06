package kz.home.ys.algo.medium.flattenBinaryTreeToLinkedList;

import kz.home.ys.algo.helper.TreeNode;

import java.util.Stack;

class FlattenBinaryTreeToLinkedList {
    public void flatten(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        inOrderTraversal(root, stack);
        
        TreeNode curr = null;
        TreeNode next = null;
        while (!stack.isEmpty()) {
            if (next == null) {
                next = stack.pop();
            } else if (curr == null) {
                curr = stack.pop();
                curr.right = next;
                curr.left = null;
            } else {
                next = curr;
                curr = stack.pop();
                curr.right = next;
                curr.left = null;
            }
        }
    }

    private void inOrderTraversal(TreeNode root, Stack<TreeNode> stack) {
        if (root == null) return;
        stack.push(root);
        inOrderTraversal(root.left, stack);
        inOrderTraversal(root.right, stack);
    }
}