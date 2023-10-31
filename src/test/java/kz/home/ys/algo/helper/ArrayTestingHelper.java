package kz.home.ys.algo.helper;

import java.util.List;

import static org.junit.Assert.*;

public class ArrayTestingHelper {

    public static void assertArrays(int[] expected, int[] actual) {
        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    public static void assertArrays(double[] expected, double[] actual) {
        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i], 0);
        }
    }

    public static void assertMatrices(int[][] expected, int[][] actual) {
        assertEquals(expected.length, actual.length);
        assertEquals(expected[0].length, actual[0].length);
        for (int i = 0; i < expected.length; i++) {
            for (int j = 0; j < expected[i].length; j++) {
                assertEquals(expected[i][j], actual[i][j]);
            }
        }
    }

    public static void assertMatrices(List<List<Integer>> expected, List<List<Integer>> actual) {
        assertEquals(expected.size(), actual.size());
        assertEquals(expected.get(0).size(), actual.get(0).size());
        for (int i = 0; i < expected.size(); i++) {
            for (int j = 0; j < expected.get(i).size(); j++) {
                assertEquals(expected.get(i).get(j), actual.get(i).get(j));
            }
        }
    }

    public static <T> void assertLists(List<T> expected, List<T> actual) {
        assertEquals(expected.size(), actual.size());
        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }
    }

    public static void assertLinkedLists(ListNode expected, ListNode actual) {
        while (expected != null && actual != null) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
        assertNull(expected);
        assertNull(actual);
    }

    public static void assertTrees(TreeNode expected, TreeNode actual) {
        if (expected != null && actual != null) {
            assertEquals(expected.val, actual.val);
            assertTrees(expected.left, actual.left);
            assertTrees(expected.right, actual.right);
        } else {
            assertNull(expected);
            assertNull(actual);
        }
    }
}
