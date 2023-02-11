package kz.home.ys.algo.easy.symmetricTree;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SymmetricTreeIterativeTest {

    @Test
    public void testIsSymmetric() {
        boolean isSymmetric = new SymmetricTreeIterative().isSymmetric(
                new TreeNode(
                        1,
                        new TreeNode(
                                2,
                                new TreeNode(3),
                                new TreeNode(4)
                        ),
                        new TreeNode(
                                2,
                                new TreeNode(4),
                                new TreeNode(3)
                        )
                )
        );

        assertTrue(isSymmetric);
    }
}