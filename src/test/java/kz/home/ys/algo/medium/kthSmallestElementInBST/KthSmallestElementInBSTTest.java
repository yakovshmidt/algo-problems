package kz.home.ys.algo.medium.kthSmallestElementInBST;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KthSmallestElementInBSTTest {

    @Test
    public void kthSmallest() {
        int kthSmallest = new KthSmallestElementInBST().kthSmallest(
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
                        new TreeNode(6)
                ),
                3
        );

        assertEquals(3, kthSmallest);
    }
}