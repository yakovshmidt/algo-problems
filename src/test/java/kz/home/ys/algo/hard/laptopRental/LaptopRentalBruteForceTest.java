package kz.home.ys.algo.hard.laptopRental;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class LaptopRentalBruteForceTest   {

    @Test
    public void testLaptopRentals() {
        int[][] times = new int[][] {{0, 5}, {2, 4}, {4, 7}, {5, 7}, {9, 20}, {3, 15}, {6, 10}};
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        for (int[] time : times) {
            input.add(new ArrayList<>(Arrays.asList(time[0], time[1])));
        }
        int expected = 4;

        int actual = new LaptopRentalBruteForce().laptopRentals(input);

        assertEquals(expected, actual);
    }
}