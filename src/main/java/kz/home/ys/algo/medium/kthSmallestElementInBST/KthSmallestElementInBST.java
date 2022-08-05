package kz.home.ys.algo.medium.kthSmallestElementInBST;

import java.util.ArrayList;
import java.util.List;

class KthSmallestElementInBST {

    // time - O(N)
    // space - O(N)
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> inorder = new ArrayList<>();
        inorderTraversal(root, inorder);

        return inorder.get(k - 1);
    }

    private void inorderTraversal(TreeNode root, List<Integer> inorder) {
        if (root == null) return;

        inorderTraversal(root.left, inorder);
        inorder.add(root.val);
        inorderTraversal(root.right, inorder);
    }
}