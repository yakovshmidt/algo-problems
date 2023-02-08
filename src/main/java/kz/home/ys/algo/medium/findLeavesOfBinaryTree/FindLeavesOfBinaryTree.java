package kz.home.ys.algo.medium.findLeavesOfBinaryTree;

import java.util.*;

class FindLeavesOfBinaryTree {

    // time - O(N) + O(N * D) - where N is number of nodes and D is depth of the tree
    // space - O(N) + O(N) -> O(N)
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Map<TreeNode, TreeNode> relationships = new HashMap<>();
        relationships.put(root, null);
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.left != null) {
                relationships.put(node.left, node);
                stack.push(node.left);
            }
            if (node.right != null) {
                relationships.put(node.right, node);
                stack.push(node.right);
            }
        }

        findLeaves(root, result, relationships);

        return result;
    }

    private void findLeaves(TreeNode root, List<List<Integer>> result, Map<TreeNode, TreeNode> relationships) {
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);
            LinkedList<Integer> leafs = new LinkedList<>();
            while (!stack.isEmpty()) {
                TreeNode curr = stack.pop();
                if (curr.left != null || curr.right != null) {
                    if (curr.left != null) stack.push(curr.left);
                    if (curr.right != null) stack.push(curr.right);
                } else {
                    leafs.addFirst(curr.val);
                    TreeNode parent = relationships.get(curr);
                    if (parent == null) {
                        result.add(leafs);
                       return;
                    } else {
                        if (parent.left == curr) {
                            parent.left = null;
                        } else {
                            parent.right = null;
                        }
                    }
                }
            }
            result.add(leafs);
            findLeaves(root, result, relationships);
    }
}