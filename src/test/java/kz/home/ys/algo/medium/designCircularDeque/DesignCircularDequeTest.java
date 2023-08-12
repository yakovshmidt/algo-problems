package kz.home.ys.algo.medium.designCircularDeque;

import junit.framework.TestCase;

public class DesignCircularDequeTest extends TestCase {

    public void testCircularDeque() {
        DesignCircularDeque myCircularDeque = new DesignCircularDeque(3);
        assertTrue(myCircularDeque.insertLast(1));  // return True
        assertTrue(myCircularDeque.insertLast(2));  // return True
        assertTrue(myCircularDeque.insertFront(3)); // return True
        assertFalse(myCircularDeque.insertFront(4)); // return False, the queue is full.
        assertEquals(2, myCircularDeque.getRear());      // return 2
        assertTrue(myCircularDeque.isFull());       // return True
        assertTrue(myCircularDeque.deleteLast());   // return True
        assertTrue(myCircularDeque.insertFront(4)); // return True
        assertEquals(4, myCircularDeque.getFront());     // return 4
    }
}