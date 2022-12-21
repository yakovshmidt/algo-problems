package kz.home.ys.algo.google.googleInterviewLeetCodePremium.linkedList.copyListWithRandomPointer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class CopyListWithRandomPointerWithExtraSpaceTest {

    @Test
    public void testCopyRandomList() {
        Node first = new Node(1);
        Node second = new Node(2);
        first.next = second;
        first.random = second;
        second.random = second;
        Node copy = new CopyListWithRandomPointerWithExtraSpace().copyRandomList(first);

        assertEquals(first.val, copy.val);
        assertEquals(first.next.val, copy.next.val);
        assertNull(copy.next.next);
        assertEquals(first.random.val, copy.random.val);
        assertEquals(second.random.val, copy.next.random.val);
    }
}