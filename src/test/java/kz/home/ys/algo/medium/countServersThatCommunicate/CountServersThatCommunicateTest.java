package kz.home.ys.algo.medium.countServersThatCommunicate;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountServersThatCommunicateTest {

    @Test
    public void testCountServers() {
        int serversCount = new CountServersThatCommunicate().countServers(
                new int[][]{{1, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}}
        );

        assertEquals(4, serversCount);
    }
}