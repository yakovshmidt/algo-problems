package kz.home.ys.algo.medium.inorderSuccessorInBST;

class InorderSuccessorInBST {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
       /* 
       
       Approach 1:
       1. Iterate over BST and store all the successors

        time - O(N)
        space - O(N) 

        Approach 2: BST

        1. root == p -> rightest

        time - O(log(N))
        space - O(1)
       
       */

        TreeNode parent = null;
        TreeNode curr = root;
        while (curr != null && curr != p) {
            if (curr.val > p.val) {
                parent = curr;
                curr = curr.left;
            } else if (curr.val < p.val) {
                curr = curr.right;
            }
        }

        if (parent == null) {
            return curr.right;
        } else {
            if (curr.right == null) {
                return parent;
            } else {
                TreeNode nextGreater = curr.right;
                while (nextGreater.left != null) {
                    nextGreater = nextGreater.left;
                }
                return nextGreater;
            }
        }
    }
}