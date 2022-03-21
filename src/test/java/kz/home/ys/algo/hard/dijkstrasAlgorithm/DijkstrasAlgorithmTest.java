package kz.home.ys.algo.hard.dijkstrasAlgorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DijkstrasAlgorithmTest {

    @Test
    public void testDijkstrasAlgorithm() {
        int start = 3;

        int[][][] edges = {
                {{1, 2}, {3, 3}, {4, 2}},
                {{0, 1}, {6, 3}},
                {{3, 9}},
                {{0, 3}, {1, 4}, {4, 4}, {8, 7}},
                {{0, 1}, {10, 3}},
                {{7, 1}, {8, 4}},
                {{8, 1}},
                {},
                {{7, 1}},
                {{10, 2}},
                {}
        };

        int[] expected = {3, 4, -1, 0, 4, -1, 7, 8, 7, -1, 7};
        int[] actual = new DijkstrasAlgorithm().dijkstrasAlgorithm(start, edges);
        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}