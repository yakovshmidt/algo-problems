package kz.home.ys.algo.easy.nearestSmallerElement;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertLists;

public class NearestSmallerElementTest extends TestCase {

    public void testPrevSmaller() {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(4);
        A.add(5);
        A.add(2);
        A.add(10);
        A.add(8);

        List<Integer> expected = List.of(-1, 4, -1, 2, 2);

        ArrayList<Integer> actual = new NearestSmallerElement().prevSmaller(A);

        assertLists(expected, actual);
    }
}