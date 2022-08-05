package kz.home.ys.algo.medium.constructBinaryTreeFromPreorderAndInorderTraversal;

import java.util.HashMap;
import java.util.Map;

class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    
    private int preorderIdx = 0;
    private final Map<Integer, Integer> inorderValuesToIndices = new HashMap<>();
    
    // time - O(N)
    // space - O(N)
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            inorderValuesToIndices.put(inorder[i], i);
        }
        
        return buildTree(preorder, 0, preorder.length - 1);
    }
    
    private TreeNode buildTree(int[] preorder, int left, int right) {
        if (left > right) return null;
        
        int val = preorder[preorderIdx++];
        TreeNode root = new TreeNode(val);
        
        root.left = buildTree(preorder, left, inorderValuesToIndices.get(val) - 1);
        root.right = buildTree(preorder, inorderValuesToIndices.get(val) + 1, right);
        
        return root;
    }
}