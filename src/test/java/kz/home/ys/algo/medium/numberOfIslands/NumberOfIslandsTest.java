package kz.home.ys.algo.medium.numberOfIslands;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NumberOfIslandsTest {

    @Test
    public void testNumIslands() {
        int numberOfIslands = new NumberOfIslands().numIslands(
                new char[][]{
                        {'1', '1', '1', '1', '0'},
                        {'1', '1', '0', '1', '0'},
                        {'1', '1', '0', '0', '0'},
                        {'0', '0', '0', '0', '0'}
                }
        );

        assertEquals(1, numberOfIslands);
    }
}