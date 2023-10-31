package kz.home.ys.algo.medium.binaryTreeRightSideView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeRightSideViewBFS {
    public List<Integer> rightSideView(TreeNode root) {
        /*

        Approach:
        1) iterate using BFS
        2) add last element of each level

        Time: O(N)
        Space: O(H)

        */

        List<Integer> result = new ArrayList<>();

        if (root == null) return result;

        LinkedList<TreeNode> deque = new LinkedList<>();
        deque.addLast(root);

        while (!deque.isEmpty()) {
            int size = deque.size();
            int idx = 1;
            while (idx <= size) {
                TreeNode node = deque.removeFirst();
                if (idx == size) result.add(node.val);

                if (node.left != null) deque.addLast(node.left);
                if (node.right != null) deque.addLast(node.right);

                idx++;
            }
        }

        return result;
    }
}
