package kz.home.ys.algo.medium.friendsOfAppropriateAges;

class FriendsOfAppropriateAges {
    public int numFriendRequests(int[] ages) {
        int[] ageCounts = new int[121];
        int friendReqCount = 0;

        for (int age : ages) {
            ageCounts[age]++;
        }

        for (int a = 0; a <= 120; a++) {
            for (int b = (int) (0.5 * a) + 8; b <= a; b++) {
                friendReqCount += ageCounts[a] * ageCounts[b];

                if (a == b) {
                    friendReqCount -= ageCounts[a];
                }
            }
        }

        return friendReqCount;
    }
}