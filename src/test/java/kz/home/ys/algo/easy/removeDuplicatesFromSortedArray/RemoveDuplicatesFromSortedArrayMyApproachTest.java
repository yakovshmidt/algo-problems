package kz.home.ys.algo.easy.removeDuplicatesFromSortedArray;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesFromSortedArrayMyApproachTest {

    @Test
    public void testRemoveDuplicates() {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] expectedNums = new int[]{0, 1, 2, 3, 4};

        int actualLength = new RemoveDuplicatesFromSortedArrayMyApproach().removeDuplicates(nums);

        assertEquals(expectedNums.length, actualLength);
        for (int i = 0; i < actualLength; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }
}