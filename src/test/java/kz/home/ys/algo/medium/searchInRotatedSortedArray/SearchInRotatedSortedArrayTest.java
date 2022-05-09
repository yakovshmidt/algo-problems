package kz.home.ys.algo.medium.searchInRotatedSortedArray;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SearchInRotatedSortedArrayTest {

    @Test
    public void testSearch() {
        int foundIdx1 = new SearchInRotatedSortedArray().search(new int[]{4, 5, 6, 7, 8, 1, 2, 3}, 2);

        assertEquals(6, foundIdx1);
    }
}