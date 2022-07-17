package kz.home.ys.algo.easy.linkedListCycle;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LinkedListCycleTest {

    @Test
    public void testHasCycle() {
        ListNode three = new ListNode(3);
        ListNode two = new ListNode(2);
        ListNode zero = new ListNode(0);
        ListNode minusFour = new ListNode(-4);

        three.next = two;
        two.next = zero;
        zero.next = minusFour;
        minusFour.next = two;

        boolean hasCycle = new LinkedListCycle().hasCycle(three);

        assertTrue(hasCycle);
    }
}