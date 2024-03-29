package kz.home.ys.algo.medium.binarySearchTreeIterator;


import java.util.Stack;

class BSTIterator {

    Stack<TreeNode> stack;

    public BSTIterator(TreeNode root) {
        stack = new Stack<>();
        leftmostInorder(root);
    }

    private void leftmostInorder(TreeNode node) {
        while (node != null) {
            stack.push(node);
            node = node.left;

        }
    }
    
    public int next() {
        TreeNode leftmostNode = stack.pop();

        leftmostInorder(leftmostNode.right);

        return leftmostNode.val;
    }
    
    public boolean hasNext() {
        return !stack.isEmpty();
    }
}