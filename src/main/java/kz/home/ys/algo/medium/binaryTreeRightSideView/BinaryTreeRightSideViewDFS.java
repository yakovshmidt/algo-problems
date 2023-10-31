package kz.home.ys.algo.medium.binaryTreeRightSideView;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeRightSideViewDFS {

    private final List<Integer> rightmost = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) return rightmost;
        dfs(root, 0);
        return rightmost;
    }

    private void dfs(TreeNode node, int level) {
        if (level == rightmost.size()) rightmost.add(node.val);
        if (node.right != null) dfs(node.right, level + 1);
        if (node.left != null) dfs(node.left, level + 1);
    }
}
