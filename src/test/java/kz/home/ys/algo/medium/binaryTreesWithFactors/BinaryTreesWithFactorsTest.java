package kz.home.ys.algo.medium.binaryTreesWithFactors;

import junit.framework.TestCase;

public class BinaryTreesWithFactorsTest extends TestCase {

    public void testNumFactoredBinaryTrees() {
        int result = new BinaryTreesWithFactors().numFactoredBinaryTrees(new int[]{2, 4, 5, 10});

        assertEquals(7, result);
    }

    public static void main(String[] args) {
        System.out.println(11157 / 62);
        System.out.println(179 / 62);
    }
}