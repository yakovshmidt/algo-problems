package kz.home.ys.algo.easy.closestBinarySearchTreeValue;

import junit.framework.TestCase;
import kz.home.ys.algo.helper.TreeNode;

public class ClosestBinarySearchTreeValueTest extends TestCase {

    public void testClosestValue() {
        int result = new ClosestBinarySearchTreeValue().closestValue(
                new TreeNode(1),
                4.428571
        );

        assertEquals(1, result);
    }
}