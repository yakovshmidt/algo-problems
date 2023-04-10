package kz.home.ys.algo.medium.completeBinaryTreeInserter;

import java.util.Deque;
import java.util.LinkedList;

class CBTInserter {

    private final TreeNode root;

    public CBTInserter(TreeNode root) {
        this.root = root;
    }
    
    // bfs
    // time - O(N)
    // space - O(N)
    public int insert(int val) {
        Deque<TreeNode> q = new LinkedList<>();
        q.addFirst(root);
        while (!q.isEmpty()) {
            TreeNode curr = q.removeLast();
            if (curr.left == null) {
                curr.left = new TreeNode(val);
                return curr.val;
            } else if (curr.right == null) {
                curr.right = new TreeNode(val);
                return curr.val;
            } else {
                q.addFirst(curr.left);
                q.addFirst(curr.right);
            }
        }
        return -1;
    }
    
    public TreeNode getRoot() {
        return root;
    }
}

/**
 * Your CBTInserter object will be instantiated and called as such:
 * CBTInserter obj = new CBTInserter(root);
 * int param_1 = obj.insert(val);
 * TreeNode param_2 = obj.get_root();
 */