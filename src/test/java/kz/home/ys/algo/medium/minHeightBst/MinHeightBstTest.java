package kz.home.ys.algo.medium.minHeightBst;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MinHeightBstTest {

    @Test
    public void testMinHeightBst() {
        List<Integer> array = Arrays.asList(1, 2, 5, 7, 10, 13, 14, 15, 22);
        MinHeightBst.BST tree = new MinHeightBst().minHeightBst(array);

        assertTrue(validateBst(tree));
        assertEquals(4, getTreeHeight(tree));

        List<Integer> inOrder = inOrderTraverse(tree, new ArrayList<>());
        List<Integer> expected = Arrays.asList(1, 2, 5, 7, 10, 13, 14, 15, 22);
        assertEquals(expected, inOrder);
    }

    static boolean validateBst(MinHeightBst.BST tree) {
        return validateBst(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    static boolean validateBst(MinHeightBst.BST tree, int minValue, int maxValue) {
        if (tree.value < minValue || tree.value >= maxValue) {
            return false;
        }
        if (tree.left != null && !validateBst(tree.left, minValue, tree.value)) {
            return false;
        }
        return tree.right == null || validateBst(tree.right, tree.value, maxValue);
    }

    static List<Integer> inOrderTraverse(MinHeightBst.BST tree, List<Integer> array) {
        if (tree.left != null) {
            inOrderTraverse(tree.left, array);
        }
        array.add(tree.value);
        if (tree.right != null) {
            inOrderTraverse(tree.right, array);
        }
        return array;
    }

    static int getTreeHeight(MinHeightBst.BST tree) {
        return getTreeHeight(tree, 0);
    }

    static int getTreeHeight(MinHeightBst.BST tree, int height) {
        if (tree == null) return height;
        int leftTreeHeight = getTreeHeight(tree.left, height + 1);
        int rightTreeHeight = getTreeHeight(tree.right, height + 1);
        return Math.max(leftTreeHeight, rightTreeHeight);
    }
}