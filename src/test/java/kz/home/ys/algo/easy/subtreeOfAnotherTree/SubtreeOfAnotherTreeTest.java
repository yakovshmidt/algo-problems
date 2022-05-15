package kz.home.ys.algo.easy.subtreeOfAnotherTree;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;

public class SubtreeOfAnotherTreeTest {

    @Test
    public void testIsSubtree() {
        boolean isSubtree = new SubtreeOfAnotherTree().isSubtree(
                new TreeNode(
                        3,
                        new TreeNode(
                                4,
                                new TreeNode(1),
                                new TreeNode(
                                        2,
                                        new TreeNode(0),
                                        null)
                        ),
                        new TreeNode(5)),
                new TreeNode(
                        4,
                        new TreeNode(1),
                        new TreeNode(2)
                )
        );

        assertFalse(isSubtree);
    }
}