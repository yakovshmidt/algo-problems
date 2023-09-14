package kz.home.ys.algo.medium.pathSumII;

import junit.framework.TestCase;
import kz.home.ys.algo.helper.TreeNode;

import java.util.ArrayList;
import java.util.List;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertMatrices;

public class PathSumIITest extends TestCase {

    public void testPathSum() {
        List<List<Integer>> expected = List.of(
                List.of(1, 2)
        );

        List<List<Integer>> actual = new PathSumII().pathSum(
                new TreeNode(
                        1,
                        new TreeNode(2),
                        new TreeNode(3)
                ),
                3
        );

        assertMatrices(expected, actual);
    }
}