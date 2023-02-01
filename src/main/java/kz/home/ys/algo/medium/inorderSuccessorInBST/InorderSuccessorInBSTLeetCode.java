package kz.home.ys.algo.medium.inorderSuccessorInBST;

class InorderSuccessorInBSTLeetCode {

    // time - O(log(N))
    // space - O(1)
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        TreeNode successor = null;

        while (root != null) {
            if (p.val >= root.val) {
                root = root.right;
            } else {
                successor = root;
                root = root.left;
            }
        }

        return successor;
    }
}