package kz.home.ys.algo.medium.spiralMatrix;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SpiralMatrixTest {

    @Test
    public void testSpiralOrder() {
        List<Integer> actual = new SpiralMatrix().spiralOrder(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}});

        List<Integer> expected = new ArrayList<>(actual.size());
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(8);
        expected.add(12);
        expected.add(11);
        expected.add(10);
        expected.add(9);
        expected.add(5);
        expected.add(6);
        expected.add(7);

        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }
    }
}