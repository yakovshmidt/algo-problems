package kz.home.ys.algo.easy.searchInsertPosition;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchInsertPositionTest {

    @Test
    public void testSearchInsert() {
        int expected = 1;

        int actual = new SearchInsertPosition().searchInsert(new int[]{1, 3, 5, 6}, 2);

        assertEquals(expected, actual);
    }
}