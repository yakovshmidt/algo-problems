package kz.home.ys.algo.medium.findKClosestElements;

import junit.framework.TestCase;

import java.util.List;

public class FindKClosestElementsTest extends TestCase {

    public void testFindClosestElements() {
        List<Integer> expected = List.of(1, 2, 3, 4);

        List<Integer> actual = new FindKClosestElements().findClosestElements(new int[]{1, 2, 3, 4, 5}, 4, 3);

        assertEquals(expected, actual);
    }
}