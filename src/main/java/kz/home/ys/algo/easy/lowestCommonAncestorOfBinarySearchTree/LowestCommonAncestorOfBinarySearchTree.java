package kz.home.ys.algo.easy.lowestCommonAncestorOfBinarySearchTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class LowestCommonAncestorOfBinarySearchTree {

    // time - O(N)
    // space - O(N)
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        
        Map<TreeNode, TreeNode> nodeToParentMap = fillNodesToParents(root);  // time - O(N)
        
        int pDepth = getDepth(root, p, 0);  // time - O(N)
        int qDepth = getDepth(root, q, 0);  // time - O(N)
        
        while (pDepth < qDepth) {  // time - O(K) - where K is diff between p and q depths
            q = nodeToParentMap.get(q);
            qDepth--;
        }
        
        while (qDepth < pDepth) {
            p = nodeToParentMap.get(p);
            pDepth--;
        }
        
        int commonDepth = qDepth;
        
        while (commonDepth != 0 && p.val != q.val) {  // time - O(M) - where M is longest distance from p or q to common parent
            p = nodeToParentMap.get(p);
            q = nodeToParentMap.get(q);
            commonDepth--;
        }
        
        return p;
    }
    
    private Map<TreeNode, TreeNode> fillNodesToParents(TreeNode node) {
        Map<TreeNode, TreeNode> nodeToParentMap = new HashMap<>();
        nodeToParentMap.put(node, null);
        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            if (curr.left != null) {
                nodeToParentMap.put(curr.left, curr);
                stack.push(curr.left);
            }
            if (curr.right != null) {
                nodeToParentMap.put(curr.right, curr);
                stack.push(curr.right);
            }
        }
        return nodeToParentMap;
    }
    
    private int getDepth(TreeNode node, TreeNode searchingNode, int depth) {
        if (node == null) return -1;
        
        if (node.val == searchingNode.val) {
            return depth;
        }
        
        int leftDepth = getDepth(node.left, searchingNode, depth + 1);
        int rightDepth = getDepth(node.right, searchingNode, depth + 1);
        
        return Math.max(leftDepth, rightDepth);
    }
}