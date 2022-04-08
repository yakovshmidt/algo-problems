package kz.home.ys.algo.easy.sameTree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class SameTree {

    // time - O(N)
    // space - O(N) - if we consider stack space, O(1) - if not
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q != null) return false;
        else if (p != null && q == null) return false;
        else if (p == null && q == null) return true;
        else if (p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        } else return false;
    }
}