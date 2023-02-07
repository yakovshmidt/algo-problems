package kz.home.ys.algo.medium.binaryTreeZigzagOrderTraversal;

import java.util.*;

class BinaryTreeZigzagOrderTraversal {

    // time - O(N) - N is number of nodes
    // space - O(L) - L is number of leafs
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        /*
        
        Approach: Queue?

        1. Level 1 -> order from left to right
        add 3
        put 9 and 20

        2. Level 2 -> order from right to left
        pop 9
        pop 20

        push null
        push null 
        push 15
        push 7


        3. Level 3 -> order from left to right
        */
        if (root == null) return new ArrayList<>();

        Deque<TreeNode> deque = new LinkedList<>();
        deque.addFirst(root);
        List<List<Integer>> result = new ArrayList<>();

        boolean isReverseOrder = false;
        while (!deque.isEmpty()) {
            int size = deque.size();
            LinkedList<Integer> levelNodes = new LinkedList<>();
            while (size > 0) {
                TreeNode curr = deque.removeLast();
                if (isReverseOrder) {
                    levelNodes.addFirst(curr.val);
                } else {
                    levelNodes.addLast(curr.val);
                }
                if (curr.left != null) deque.addFirst(curr.left);
                if (curr.right != null) deque.addFirst(curr.right);
                size--;
            }

            result.add(levelNodes);
            isReverseOrder = !isReverseOrder;
        }

        return result;
    }
}