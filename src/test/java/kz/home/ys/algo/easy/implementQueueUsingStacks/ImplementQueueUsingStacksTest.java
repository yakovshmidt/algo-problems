package kz.home.ys.algo.easy.implementQueueUsingStacks;

import junit.framework.TestCase;

public class ImplementQueueUsingStacksTest extends TestCase {

    public void testQueue() {

        ImplementQueueUsingStacks myQueue = new ImplementQueueUsingStacks();
        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        assertEquals(1, myQueue.peek()); // return 1
        assertEquals(1, myQueue.pop()); // return 1, queue is [2]
        assertFalse(myQueue.empty()); // return false
    }
}