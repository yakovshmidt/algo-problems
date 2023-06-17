package kz.home.ys.algo.easy.shift2DGrid;

import junit.framework.TestCase;

import java.util.List;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertMatrices;

public class Shift2DGridTest extends TestCase {

    public void testShiftGrid() {
        List<List<Integer>> expected = List.of(
                List.of(12,0,21,13),
                List.of(3,8,1,9),
                List.of(19,7,2,5),
                List.of(4,6,11,10)
        );

        List<List<Integer>> actual = new Shift2DGrid().shiftGrid(new int[][]{{3, 8, 1, 9}, {19, 7, 2, 5}, {4, 6, 11, 10}, {12, 0, 21, 13}}, 4);

        assertMatrices(expected, actual);
    }

    public void testShiftGrid2() {
        List<List<Integer>> expected = List.of(
                List.of(9,1,2),
                List.of(3,4,5),
                List.of(6,7,8)
        );

        List<List<Integer>> actual = new Shift2DGrid().shiftGrid(new int[][]{{1,2,3}, {4,5,6}, {7,8,9}}, 1);

        assertMatrices(expected, actual);
    }
}