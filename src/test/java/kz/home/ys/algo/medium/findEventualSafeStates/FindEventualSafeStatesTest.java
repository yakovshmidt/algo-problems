package kz.home.ys.algo.medium.findEventualSafeStates;

import junit.framework.TestCase;

import java.util.List;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertLists;

public class FindEventualSafeStatesTest extends TestCase {

    public void testEventualSafeNodes() {
        List<Integer> expected = List.of(2, 4, 5, 6);

        List<Integer> actual = new FindEventualSafeStates().eventualSafeNodes(new int[][]{{1, 2}, {2, 3}, {5}, {0}, {5}, {}, {}});

        assertLists(expected, actual);
    }
}