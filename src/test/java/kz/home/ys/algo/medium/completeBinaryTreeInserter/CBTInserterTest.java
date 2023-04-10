package kz.home.ys.algo.medium.completeBinaryTreeInserter;

import junit.framework.TestCase;

import java.util.Queue;

public class CBTInserterTest extends TestCase {

    public void testBinarySearchInserter() {
        CBTInserter cBTInserter = new CBTInserter(new TreeNode(1, new TreeNode(2), null));

        TreeNode expected = new TreeNode(
                1,
                new TreeNode(2, new TreeNode(4), null),
                new TreeNode(3)
        );

        TreeNode actual = cBTInserter.getRoot();

        assertEquals(1, cBTInserter.insert(3));
        assertEquals(2, cBTInserter.insert(4));

        assertEquals(expected.val, actual.val);
        assertEquals(expected.left.val, actual.left.val);
        assertEquals(expected.right.val, actual.right.val);
        assertEquals(expected.left.left.val, actual.left.left.val);
    }
}