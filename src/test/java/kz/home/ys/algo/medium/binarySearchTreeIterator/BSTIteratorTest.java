package kz.home.ys.algo.medium.binarySearchTreeIterator;

import junit.framework.TestCase;

public class BSTIteratorTest extends TestCase {

    public void testBSTIterator() {
        BSTIterator bSTIterator = new BSTIterator(
                new TreeNode(
                        7,
                        new TreeNode(3),
                        new TreeNode(
                                15,
                                new TreeNode(9),
                                new TreeNode(20)
                        )
                )
        );
        assertEquals(3, bSTIterator.next());
        assertEquals(7, bSTIterator.next());
        assertTrue(bSTIterator.hasNext());
        assertEquals(9, bSTIterator.next());
        assertTrue(bSTIterator.hasNext());
        assertEquals(15, bSTIterator.next());
        assertTrue(bSTIterator.hasNext());
        assertEquals(20, bSTIterator.next());
        assertFalse(bSTIterator.hasNext());
    }
}