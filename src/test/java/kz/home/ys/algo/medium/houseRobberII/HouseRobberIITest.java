package kz.home.ys.algo.medium.houseRobberII;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HouseRobberIITest   {

    @Test
    public void testRob() {
        int rob = new HouseRobberII().rob(new int[]{1, 2, 3, 1});

        assertEquals(4, rob);
    }
}