package kz.home.ys.algo.medium.lowestCommonAncestorOfDeepestLeaves;

import kz.home.ys.algo.helper.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LowestCommonAncestorOfDeepestLeaves {

    private final Map<Integer, List<TreeNode>> depths = new HashMap<>();
    private int maxDepth = 0;
    private final Map<TreeNode, TreeNode> childrenToParents = new HashMap<>();

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        calculate(null, root, 0);

        return getLCA();
    }

    private void calculate(TreeNode parent, TreeNode node, int depth) {
        if (node == null) return;
        maxDepth = Math.max(maxDepth, depth);

        depths.putIfAbsent(depth, new ArrayList<>());
        depths.get(depth).add(node);

        if (parent != null) childrenToParents.put(node, parent);

        calculate(node, node.left, depth + 1);
        calculate(node, node.right, depth + 1);
    }

    private TreeNode getLCA() {
        List<TreeNode> maxDepthNodes = depths.get(maxDepth);

        if (maxDepthNodes.size() == 1) return maxDepthNodes.get(0);

        maxDepthNodes.replaceAll(childrenToParents::get);
        TreeNode nodeToCompare = maxDepthNodes.get(0);
        boolean allTheSame = true;
        for (int i = 1; i < maxDepthNodes.size(); i++) {
            if (nodeToCompare != maxDepthNodes.get(i)) {
                allTheSame = false;
                break;
            }
        }
        if (allTheSame) {
            return nodeToCompare;
        } else {
            return getLCA();
        }
    }
}
