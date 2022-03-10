package kz.home.ys.algo.hard.diskStacking;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class DiskStackingTest {

    @Test
    public void testDiskStacking() {
        List<Integer[]> input = new ArrayList<>();
        input.add(new Integer[] {2, 1, 2});
        input.add(new Integer[] {3, 2, 3});
        input.add(new Integer[] {2, 2, 8});
        input.add(new Integer[] {2, 3, 4});
        input.add(new Integer[] {2, 2, 1});
        input.add(new Integer[] {4, 4, 5});
        List<Integer[]> expected = new ArrayList<>();
        expected.add(new Integer[] {2, 1, 2});
        expected.add(new Integer[] {3, 2, 3});
        expected.add(new Integer[] {4, 4, 5});

        List<Integer[]> actual = new DiskStacking().diskStacking(input);

        assertTrue(compare(actual, expected));
    }

    private static boolean compare(List<Integer[]> arr1, List<Integer[]> arr2) {
        if (arr1.size() != arr2.size()) {
            return false;
        }
        for (int i = 0; i < arr1.size(); i++) {
            for (int j = 0; j < arr1.get(i).length; j++) {
                if (!arr1.get(i)[j].equals(arr2.get(i)[j])) {
                    return false;
                }
            }
        }
        return true;
    }
}