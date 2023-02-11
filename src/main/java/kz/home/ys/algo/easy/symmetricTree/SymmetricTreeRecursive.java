package kz.home.ys.algo.easy.symmetricTree;

class SymmetricTreeRecursive {
    public boolean isSymmetric(TreeNode root) {
        if (root.left == null && root.right == null) return true;
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;

        if (left.val == right.val) {
            return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
        } else {
            return false;
        }
    }
}