package kz.home.ys.algo.medium.onlineElection;

import junit.framework.TestCase;

public class OnlineElectionTest extends TestCase {

    public void testOnlineElection1() {
        OnlineElection onlineElection = new OnlineElection(new int[]{0, 1, 1, 0, 0, 1, 0}, new int[]{0, 5, 10, 15, 20, 25, 30});

        assertEquals(0, onlineElection.q(3)); // return 0, At time 3, the votes are [0], and 0 is leading.
        assertEquals(1, onlineElection.q(12)); // return 1, At time 12, the votes are [0,1,1], and 1 is leading.
        assertEquals(1, onlineElection.q(25)); // return 1, At time 25, the votes are [0,1,1,0,0,1], and 1 is leading (as ties go to the most recent vote.)
        assertEquals(0, onlineElection.q(15)); // return 0
        assertEquals(0, onlineElection.q(24)); // return 0
        assertEquals(1, onlineElection.q(8)); // return 1
    }

    public void testOnlineElection2() {
        OnlineElection onlineElection = new OnlineElection(new int[]{0, 1, 0, 1, 1}, new int[]{24, 29, 31, 76, 81});

        assertEquals(0, onlineElection.q(28));
        assertEquals(0, onlineElection.q(24));
        assertEquals(1, onlineElection.q(29));
        assertEquals(1, onlineElection.q(77));
        assertEquals(1, onlineElection.q(30));
        assertEquals(0, onlineElection.q(25));
        assertEquals(1, onlineElection.q(76));
        assertEquals(0, onlineElection.q(75));
        assertEquals(1, onlineElection.q(81));
        assertEquals(1, onlineElection.q(80));
    }
}