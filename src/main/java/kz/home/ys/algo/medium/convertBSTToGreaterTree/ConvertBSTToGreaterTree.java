package kz.home.ys.algo.medium.convertBSTToGreaterTree;

import kz.home.ys.algo.helper.TreeNode;

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
class ConvertBSTToGreaterTree {

    private int currSum = 0;

    public TreeNode convertBST(TreeNode root) {
        /*
        
        Constraints:
        * root can be null
        * sum of all vals fits into memory
        * -10^4 <= node.val <= 10^4
        * number of nodes is from 0 to 10^4
        * 10^4 * 10^4 = 10^(4+4) = 10^8

        Approach: Similar to Inorder Traversal, but we go right first (right, root, left)
        1. go right
            if it is a left -> return value

        Time: O(V+E) -> O(N)
        Space: O(V+E) -> O(N)

        */

        if (root == null) return root;
        convertBST(root.right);
        currSum = root.val + currSum; 
        root.val = currSum;
        convertBST(root.left);
        return root;
    }
}