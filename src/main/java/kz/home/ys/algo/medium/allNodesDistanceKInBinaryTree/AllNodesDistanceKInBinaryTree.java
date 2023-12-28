package kz.home.ys.algo.medium.allNodesDistanceKInBinaryTree;

import kz.home.ys.algo.helper.Pair;
import kz.home.ys.algo.helper.TreeNode;

import java.util.*;

class AllNodesDistanceKInBinaryTree {

    // Time - O(N)
    // Space - O(N)
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode, TreeNode> nodesToParents = new HashMap<>();
        fillNodesToParents(nodesToParents, root, null);

        List<Integer> result = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();

        Queue<Pair<TreeNode, Integer>> queue = new ArrayDeque<>();
        queue.offer(new Pair<>(target, k));
        while (!queue.isEmpty()) {
            Pair<TreeNode, Integer> pair = queue.remove();
            TreeNode node = pair.getKey();
            int currK = pair.getValue();

            if (visited.contains(node.val)) continue;
            visited.add(node.val);

            if (currK == 0) {
                result.add(node.val);
                continue;
            }
            
            TreeNode left = node.left;
            if (left != null) queue.offer(new Pair<>(left, currK - 1));
            TreeNode right = node.right;
            if (right != null) queue.offer(new Pair<>(right, currK - 1));
            TreeNode parent = nodesToParents.get(node);
            if (parent != null) queue.offer(new Pair<>(parent, currK - 1));
        }

        return result;
    }

    private void fillNodesToParents(Map<TreeNode, TreeNode> nodesToParents, TreeNode curr, TreeNode parent) {
        if (curr == null) return;
        nodesToParents.put(curr, parent);
        fillNodesToParents(nodesToParents, curr.left, curr);
        fillNodesToParents(nodesToParents, curr.right, curr);
    }
}