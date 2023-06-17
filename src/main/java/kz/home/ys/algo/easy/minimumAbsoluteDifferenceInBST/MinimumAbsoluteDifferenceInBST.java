package kz.home.ys.algo.easy.minimumAbsoluteDifferenceInBST;

import java.util.Stack;
import java.util.TreeSet;

class MinimumAbsoluteDifferenceInBST {

    /* 
    
            543
    384                652
        445                 699
    
    */
    public int getMinimumDifference(TreeNode root) {
        TreeSet<Integer> allPossibleValues = new TreeSet<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            allPossibleValues.add(node.val);
            if (node.left != null) stack.push(node.left);
            if (node.right != null) stack.push(node.right);
        }

        int min = Integer.MAX_VALUE;

        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            Integer higher = allPossibleValues.higher(node.val);
            Integer lower = allPossibleValues.lower(node.val);

            if (higher != null) min = Math.min(min, Math.abs(higher - node.val));
            if (lower != null) min = Math.min(min, Math.abs(lower - node.val));

            if (node.left != null) stack.push(node.left);
            if (node.right != null) stack.push(node.right);
        }

        return min;
    }
}