package kz.home.ys.algo.easy.lowestCommonAncestorOfBinarySearchTree;

class LowestCommonAncestorOfBinarySearchTreeLeetCode {

    // time - O(log(N))
    // space - O(1)
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        
        return root;
    }
}