package kz.home.ys.algo.medium.rotateList;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class RotateListTest {

    @Test
    public void testRotateRight() {
        ListNode rotatedList = new RotateList().rotateRight(new ListNode(0, new ListNode(1, new ListNode(2))), 4);

        assertEquals(2, rotatedList.val);
        assertEquals(0, rotatedList.next.val);
        assertEquals(1, rotatedList.next.next.val);
        assertNull(rotatedList.next.next.next);
    }
}