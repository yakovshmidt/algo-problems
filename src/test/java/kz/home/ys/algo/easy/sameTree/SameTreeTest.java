package kz.home.ys.algo.easy.sameTree;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class SameTreeTest {

    @Test
    public void testIsSameTree() {
        boolean isSameTree = new SameTree().isSameTree(
                new TreeNode(1, new TreeNode(2), new TreeNode(3)),
                new TreeNode(1, new TreeNode(2), new TreeNode(3))
        );

        assertTrue(isSameTree);

        boolean isNotSameTree = new SameTree().isSameTree(
                new TreeNode(1, new TreeNode(3), new TreeNode(3)),
                new TreeNode(1, new TreeNode(2), new TreeNode(2))
        );

        assertFalse(isNotSameTree);
    }
}