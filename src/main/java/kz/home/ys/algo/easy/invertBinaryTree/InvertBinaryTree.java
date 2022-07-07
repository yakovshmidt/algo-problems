package kz.home.ys.algo.easy.invertBinaryTree;

class InvertBinaryTree {

    // time - O(N)
    // space - O(1)
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
        
        invertTree(root.left);
        invertTree(root.right);
        
        return root;
    }
}