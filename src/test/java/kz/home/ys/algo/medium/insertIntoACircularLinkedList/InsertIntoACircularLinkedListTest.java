package kz.home.ys.algo.medium.insertIntoACircularLinkedList;

import junit.framework.TestCase;

public class InsertIntoACircularLinkedListTest extends TestCase {

    public void testInsert() {
        Node head = new Node(3);
        head.next = new Node(4, new Node(1, head));

        Node result = new InsertIntoACircularLinkedList().insert(head, 2);

        assertEquals(3, result.val);
        assertEquals(4, result.next.val);
        assertEquals(1, result.next.next.val);
        assertEquals(2, result.next.next.next.val);
        assertEquals(3, result.next.next.next.next.val);
    }
}