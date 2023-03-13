package kz.home.ys.algo.medium.populatingNextRightPointersInEachNode;

import java.util.LinkedList;

class PopulatingNextRightPointersInEachNode {

    public Node connect(Node root) {
        /*
        
        1

        2 3

        4 5 6 7
        
        1. put root onto the stack -> level 0 has 1 element
        2. get left and right of the root and put them onto the stack -> link elements which are onto the stack

        time - O(V + N)
        space - O(LEAFS)

        */

        if (root == null) return null;

        LinkedList<Node> queue = new LinkedList<>();
        queue.addFirst(root);

        while (!queue.isEmpty()) {
            int size = queue.size() - 1;
            Node prev = queue.removeLast();
            if (prev.left != null) queue.addFirst(prev.left);
            if (prev.right != null) queue.addFirst(prev.right);
            while (size > 0) {
                Node curr = queue.removeLast();
                if (curr.left != null) queue.addFirst(curr.left);
                if (curr.right != null) queue.addFirst(curr.right);
                prev.next = curr;
                prev = curr;
                size--;
            }
        }

        return root;
    }
}