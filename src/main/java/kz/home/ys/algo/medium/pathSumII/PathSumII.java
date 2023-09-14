package kz.home.ys.algo.medium.pathSumII;

import kz.home.ys.algo.helper.TreeNode;

import java.util.ArrayList;
import java.util.List;

class PathSumII {

    private final List<List<Integer>> paths = new ArrayList<>();
    

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root != null) pathSum(root, targetSum, 0, new ArrayList<>());
        return paths;
    }

    private void pathSum(TreeNode curr, int targetSum, int currSum, List<Integer> path) {
      path.add(curr.val);

      if (currSum + curr.val == targetSum && curr.left == null && curr.right == null) {
        paths.add(path);
        return;
      }

      if (curr.left != null) pathSum(curr.left, targetSum, curr.val + currSum, new ArrayList<>(path));
      if (curr.right != null) pathSum(curr.right, targetSum, curr.val + currSum, new ArrayList<>(path));
    }
}