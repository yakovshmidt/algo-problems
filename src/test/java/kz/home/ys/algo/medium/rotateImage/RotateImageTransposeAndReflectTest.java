package kz.home.ys.algo.medium.rotateImage;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RotateImageTransposeAndReflectTest {

    @Test
    public void testRotate() {
        int[][] expected = new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        int[][] actual = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        new RotateImageTransposeAndReflect().rotate(actual);

        for (int row = 0; row < actual.length; row++) {
            for (int column = 0; column < actual[row].length; column++) {
                assertEquals(expected[row][column], actual[row][column]);
            }
        }
    }
}