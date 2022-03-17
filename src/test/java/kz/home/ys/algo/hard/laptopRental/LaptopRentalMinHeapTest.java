package kz.home.ys.algo.hard.laptopRental;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class LaptopRentalMinHeapTest {

    @Test
    public void testLaptopRentals() {
        int[][] times = new int[][]{{0, 2}, {1, 4}, {4, 6}, {0, 4}, {7, 8}, {9, 11}, {3, 10}};
        ArrayList<ArrayList<Integer>> input = new ArrayList<ArrayList<Integer>>();
        for (int[] time : times) {
            input.add(new ArrayList<>(Arrays.asList(time[0], time[1])));
        }
        int expected = 3;

        int actual = new LaptopRentalMinHeap().laptopRentals(input);

        assertEquals(expected, actual);
    }
}