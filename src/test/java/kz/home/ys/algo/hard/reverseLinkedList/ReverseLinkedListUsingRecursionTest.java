package kz.home.ys.algo.hard.reverseLinkedList;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class ReverseLinkedListUsingRecursionTest {

    @Test
    public void testReverseLinkedList() {
        ReverseLinkedListUsingRecursion.LinkedList test = newLinkedList(new int[]{0, 1, 2, 3, 4, 5});
        int[] expected = new int[]{5, 4, 3, 2, 1, 0};

        List<Integer> actual = toArrayList(new ReverseLinkedListUsingRecursion().reverseLinkedList(test));

        assertTrue(arraysEqual(actual, expected));
    }

    public ReverseLinkedListUsingRecursion.LinkedList newLinkedList(int[] values) {
        ReverseLinkedListUsingRecursion.LinkedList ll = new ReverseLinkedListUsingRecursion.LinkedList(values[0]);
        ReverseLinkedListUsingRecursion.LinkedList current = ll;
        for (int i = 1; i < values.length; i++) {
            current.next = new ReverseLinkedListUsingRecursion.LinkedList(values[i]);
            current = current.next;
        }
        return ll;
    }

    public List<Integer> toArrayList(ReverseLinkedListUsingRecursion.LinkedList ll) {
        List<Integer> arr = new ArrayList<>();
        ReverseLinkedListUsingRecursion.LinkedList current = ll;
        while (current != null) {
            arr.add(current.value);
            current = current.next;
        }
        return arr;
    }

    public boolean arraysEqual(List<Integer> arr1, int[] arr2) {
        if (arr1.size() != arr2.length) return false;
        for (int i = 0; i < arr1.size(); i++) {
            if (arr1.get(i) != arr2[i]) return false;
        }
        return true;
    }
}