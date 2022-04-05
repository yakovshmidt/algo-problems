package kz.home.ys.algo.hard.shiftLinkedList;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class ShiftLinkedListTest {

    @Test
    public void testShiftLinkedList() {
        var head = new ShiftLinkedList.LinkedList(0);
        head.next = new ShiftLinkedList.LinkedList(1);
        head.next.next = new ShiftLinkedList.LinkedList(2);
        head.next.next.next = new ShiftLinkedList.LinkedList(3);
        head.next.next.next.next = new ShiftLinkedList.LinkedList(4);
        head.next.next.next.next.next = new ShiftLinkedList.LinkedList(5);
        var expected = Arrays.asList(4, 5, 0, 1, 2, 3);

        var result = new ShiftLinkedList().shiftLinkedList(head, 2);
        var actual = this.linkedListToArray(result);

        assertEquals(expected, actual);
    }

    private List<Integer> linkedListToArray(ShiftLinkedList.LinkedList head) {
        var array = new ArrayList<Integer>();
        var current = head;
        while (current != null) {
            array.add(current.value);
            current = current.next;
        }
        return array;
    }
}