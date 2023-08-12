package kz.home.ys.algo.medium.convertBinarySearchTreeToSortedDoublyLinkedList;

import junit.framework.TestCase;

public class ConvertBinarySearchTreeToSortedDoublyLinkedListWithoutQueueTest extends TestCase {

    public void testTreeToDoublyList() {
        Node result = new ConvertBinarySearchTreeToSortedDoublyLinkedListWithoutQueue().treeToDoublyList(
                new Node(
                        4,
                        new Node(
                                2,
                                new Node(1),
                                new Node(3)
                        ),
                        new Node(5)
                )
        );

        assertEquals(1, result.val);
        assertEquals(2, result.right.val);
        assertEquals(5, result.left.val);
        assertEquals(3, result.right.right.val);
        assertEquals(1, result.right.left.val);
        assertEquals(4, result.right.right.right.val);
        assertEquals(2, result.right.right.left.val);
        assertEquals(5, result.right.right.right.right.val);
        assertEquals(3, result.right.right.right.left.val);
        assertEquals(1, result.right.right.right.right.right.val);
        assertEquals(4, result.right.right.right.right.left.val);
    }
}