package kz.home.ys.algo.medium.convertBinarySearchTreeToSortedDoublyLinkedList;

import java.util.LinkedList;

public class ConvertBinarySearchTreeToSortedDoublyLinkedList {

    private final LinkedList<Node> deque = new LinkedList<>();

    public Node treeToDoublyList(Node root) {
        inorder(root);

        Node dummy = new Node(-1001);
        Node curr = dummy;
        Node prev = dummy;
        while (!deque.isEmpty()) {
            Node node = deque.removeFirst();
            curr.right = node;
            prev = curr;
            curr = curr.right;
            curr.left = prev;
        }
        dummy = dummy.right;
        dummy.left = curr;
        curr.right = dummy;

        return dummy;
    }

    private void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        deque.addLast(node);
        inorder(node.right);
    }
}
