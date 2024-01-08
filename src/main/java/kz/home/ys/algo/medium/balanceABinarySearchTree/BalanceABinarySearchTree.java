package kz.home.ys.algo.medium.balanceABinarySearchTree;

import kz.home.ys.algo.helper.TreeNode;

import java.util.ArrayList;
import java.util.List;

class BalanceABinarySearchTree {
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> inorderList = new ArrayList<>();
        inorder(root, inorderList);

        return constructBST(inorderList, 0, inorderList.size() - 1);
    }

    private void inorder(TreeNode node, List<Integer> inorderList) {
        if (node == null) return;

        inorder(node.left, inorderList);
        inorderList.add(node.val);
        inorder(node.right, inorderList);
    }

    private TreeNode constructBST(List<Integer> inorderList, int l, int r) {
        if (l > r) return null;

        int m = l + (r - l) / 2;
        TreeNode node = new TreeNode(inorderList.get(m));
        node.left = constructBST(inorderList, l, m - 1);
        node.right = constructBST(inorderList, m + 1, r);

        return node;
    }
}