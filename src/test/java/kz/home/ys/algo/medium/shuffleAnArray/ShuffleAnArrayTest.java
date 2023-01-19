package kz.home.ys.algo.medium.shuffleAnArray;

import org.junit.Assert;
import org.junit.Test;

public class ShuffleAnArrayTest {

    @Test
    public void shuffleAndReset() {
        int[] nums = {1, 2, 3};

        ShuffleAnArray shuffleAnArray = new ShuffleAnArray(nums);

        Assert.assertNotEquals(nums, shuffleAnArray.shuffle());
        Assert.assertEquals(nums, shuffleAnArray.reset());
        Assert.assertNotEquals(nums, shuffleAnArray.shuffle());
    }
}