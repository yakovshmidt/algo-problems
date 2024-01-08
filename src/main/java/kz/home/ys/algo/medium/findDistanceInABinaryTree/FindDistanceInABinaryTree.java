package kz.home.ys.algo.medium.findDistanceInABinaryTree;

import kz.home.ys.algo.helper.TreeNode;

import java.util.HashMap;
import java.util.Map;

class FindDistanceInABinaryTree {

    private TreeNode pNode = null;
    private TreeNode qNode = null;
    private int pHeight = 0;
    private int qHeight = 0;
    private final Map<TreeNode, TreeNode> nodesToParents = new HashMap<>();

    public int findDistance(TreeNode root, int p, int q) {
        /*
        
        Approach:
        1. find height of both p and q
        2. make the heights the same
        3. move up until they are not equal to one another
        
        */

        addNodeToParentRelation(root, null);
        findPNodeAndQNode(root, p, q, 0);

        int result = 0;

        while (pHeight < qHeight) {
            qNode = nodesToParents.get(qNode);
            result++;
            qHeight--;
        }

        while (qHeight < pHeight) {
            pNode = nodesToParents.get(pNode);
            result++;
            pHeight--;
        }

        while (pNode != qNode) {
            pNode = nodesToParents.get(pNode);
            qNode = nodesToParents.get(qNode);
            result += 2;
        }

        return result;
    }

    private void addNodeToParentRelation(TreeNode node, TreeNode parent) {
        if (node == null) return;

        nodesToParents.put(node, parent);
        addNodeToParentRelation(node.left, node);
        addNodeToParentRelation(node.right, node);
    }

    private void findPNodeAndQNode(TreeNode node, int p, int q, int height) {
        if (node == null) return;
        if (node.val == p) {
            pNode = node;
            pHeight = height;
        }
        if (node.val == q) {
            qNode = node;
            qHeight = height;
        }

        if (pNode != null && qNode != null) return;

        findPNodeAndQNode(node.left, p, q, height + 1);
        findPNodeAndQNode(node.right, p, q, height + 1);
    }
}