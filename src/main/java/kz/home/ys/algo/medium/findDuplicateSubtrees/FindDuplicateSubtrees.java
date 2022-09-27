package kz.home.ys.algo.medium.findDuplicateSubtrees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class FindDuplicateSubtrees {

    // time - O(N)
    // space - O(N)
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        Map<String, Integer> pathToCounts = new HashMap<>();
        List<TreeNode> result = new ArrayList<>();

        dfs(pathToCounts, root, result, "");

        return result;
    }

    private String dfs(Map<String, Integer> pathToCounts, TreeNode node, List<TreeNode> result, String path) {
        if (node == null) return "#";

        path = path + "," + node.val + "," + dfs(pathToCounts, node.left, result, path) + "," + dfs(pathToCounts, node.right, result, path);

        pathToCounts.put(path, pathToCounts.getOrDefault(path, 0) + 1);

        if (pathToCounts.get(path) == 2) result.add(node);

        return path;
    }
}