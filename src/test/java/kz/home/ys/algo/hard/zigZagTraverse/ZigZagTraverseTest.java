package kz.home.ys.algo.hard.zigZagTraverse;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ZigZagTraverseTest {

    @Test
    public void testZigzagTraverse() {
        List<List<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(Arrays.asList(1, 3, 4, 10)));
        input.add(new ArrayList<>(Arrays.asList(2, 5, 9, 11)));
        input.add(new ArrayList<>(Arrays.asList(6, 8, 12, 15)));
        input.add(new ArrayList<>(Arrays.asList(7, 13, 14, 16)));
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16));

        List<Integer> actual = new ZigZagTraverse().zigzagTraverse(input);

        assertEquals(expected, actual);
    }
}