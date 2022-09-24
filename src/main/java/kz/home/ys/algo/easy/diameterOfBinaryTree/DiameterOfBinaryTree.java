package kz.home.ys.algo.easy.diameterOfBinaryTree;

class DiameterOfBinaryTree {

    // time - O(N)
    // space - O(N)
    public int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];
        diameterOfBinaryTree(root, diameter);
        return diameter[0];
    }

    private int diameterOfBinaryTree(TreeNode node, int[] diameter) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) return 1;

        int leftDiameter = diameterOfBinaryTree(node.left, diameter);
        int rightDiameter = diameterOfBinaryTree(node.right, diameter);

        diameter[0] = Math.max(diameter[0], leftDiameter + rightDiameter);

        return 1 + Math.max(leftDiameter, rightDiameter);
    }
}