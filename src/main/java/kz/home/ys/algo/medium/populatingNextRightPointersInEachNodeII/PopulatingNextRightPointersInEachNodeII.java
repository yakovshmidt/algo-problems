package kz.home.ys.algo.medium.populatingNextRightPointersInEachNodeII;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersInEachNodeII {
    
    // time - O(N)
    // space - O(M) - where M is max level nodes length
    public Node connect(Node root) {
        if (root == null) return null;
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node curr = queue.poll();
                if (i != size - 1) {
                    // is not last node on this level
                    curr.next = queue.peek();
                }
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
        }
        return root;
    }
}