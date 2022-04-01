package kz.home.ys.algo.hard.reverseLinkedList;

import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static kz.home.ys.algo.hard.reverseLinkedList.ReverseLinkedListUtils.*;

public class ReverseLinkedListUsingIteratorTest {

    @Test
    public void testReverseLinkedList() {
        LinkedList test = newLinkedList(new int[]{0, 1, 2, 3, 4, 5});
        int[] expected = new int[]{5, 4, 3, 2, 1, 0};

        List<Integer> actual = toArrayList(new ReverseLinkedListUsingIterator().reverseLinkedList(test));

        assertTrue(arraysEqual(actual, expected));
    }
}