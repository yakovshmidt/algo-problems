package kz.home.ys.algo.medium.inorderSuccessorInBST;

import org.junit.Test;

import static org.junit.Assert.assertNull;

public class InorderSuccessorInBSTTest {

    @Test
    public void testInorderSuccessor() {
        TreeNode p = new TreeNode(6);
        TreeNode inorderSuccessor = new InorderSuccessorInBST().inorderSuccessor(
                new TreeNode(
                        5,
                        new TreeNode(
                                3,
                                new TreeNode(
                                        2,
                                        new TreeNode(1),
                                        null
                                ),
                                new TreeNode(4)
                        ),
                        p
                ),
                p
        );

        assertNull(inorderSuccessor);
    }
}