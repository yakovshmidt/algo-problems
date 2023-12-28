package kz.home.ys.algo.medium.findLargestValueInEachTreeRow;

import junit.framework.TestCase;
import kz.home.ys.algo.helper.TreeNode;

import java.util.List;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertLists;

public class FindLargestValueInEachTreeRowTest extends TestCase {

    public void testLargestValues() {
        List<Integer> expected = List.of(1, 3);

        List<Integer> actual = new FindLargestValueInEachTreeRow().largestValues(new TreeNode(1, new TreeNode(2), new TreeNode(3)));

        assertLists(expected, actual);
    }
}