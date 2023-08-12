package kz.home.ys.algo.medium.convertBinarySearchTreeToSortedDoublyLinkedList;

class ConvertBinarySearchTreeToSortedDoublyLinkedListWithoutQueue {

    private Node first = null;
    private Node last = null;

    public Node treeToDoublyList(Node root) {
        if (root == null) return null;

        inorder(root);

        first.left = last;
        last.right = first;

        return first;
    }

    private void inorder(Node node) {
        if (node == null) return;

        inorder(node.left);

        if (last != null) {
            last.right = node;
            node.left = last;
        } else {
            first = node;
        }
        last = node;

        inorder(node.right);
    }
}