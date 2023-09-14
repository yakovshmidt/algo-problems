package kz.home.ys.algo.medium.friendsOfAppropriateAges;

import junit.framework.TestCase;

public class FriendsOfAppropriateAgesTest extends TestCase {

    public void testNumFriendRequests() {
        int result = new FriendsOfAppropriateAges().numFriendRequests(new int[]{16, 17, 18});

        assertEquals(2, result);
    }
}