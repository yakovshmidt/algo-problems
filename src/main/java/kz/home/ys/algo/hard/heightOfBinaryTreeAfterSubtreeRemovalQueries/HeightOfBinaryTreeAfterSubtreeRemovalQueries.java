package kz.home.ys.algo.hard.heightOfBinaryTreeAfterSubtreeRemovalQueries;

import kz.home.ys.algo.helper.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class HeightOfBinaryTreeAfterSubtreeRemovalQueries {

    private final Map<Integer, Integer> rightMap = new HashMap<>();
    private final Map<Integer, Integer> leftMap = new HashMap<>();
    private final Map<Integer, Integer> removedMap = new HashMap<>();

    public int[] treeQueries(TreeNode root, int[] queries) {
        populateHeights(root, 0);
        calculateRemoveHeights(root, 0);

        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            result[i] = removedMap.get(queries[i]);
        }
        return result;
    }

    private int populateHeights(TreeNode node, int height) {
        if (node == null) return height - 1;
    
        leftMap.put(node.val, populateHeights(node.left, height + 1));
        rightMap.put(node.val, populateHeights(node.right, height + 1));
    
        return Math.max(leftMap.get(node.val), rightMap.get(node.val));
    }
    

    private void calculateRemoveHeights(TreeNode node, int height) {
        if (node == null) return;
        removedMap.put(node.val, height);

        calculateRemoveHeights(node.left, Math.max(height, rightMap.get(node.val)));
        calculateRemoveHeights(node.right, Math.max(height, leftMap.get(node.val)));
    }
}