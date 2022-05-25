package kz.home.ys.algo.medium.houseRobber;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HouseRobberTest   {

    @Test
    public void testRob() {
        int rob = new HouseRobber().rob(new int[]{1, 2, 3, 1});

        assertEquals(4, rob);
    }
}