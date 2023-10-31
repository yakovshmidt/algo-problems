package kz.home.ys.algo.medium.onlineElection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class OnlineElection {

    static class Vote {
        public int time;
        public int person;

        public Vote(int time, int person) {
            this.time = time;
            this.person = person;
        }
    }

    private final List<Vote> timesToLeaders;

    // time - O(N)
    // space - O(V)
    public OnlineElection(int[] persons, int[] times) {
        /*

        [[[0, 1, 1, 0, 0, 1, 0], [0, 5, 10, 15, 20, 25, 30]], [3], [12], [25], [15], [24], [8]]

        0 -> [0->1vote]
        5 -> [0->1vote, 1->1vote]
        10
        15
        20
        25
        30

        */
        this.timesToLeaders = new ArrayList<>();
        int leaderVotes = 0;
        int leader = -1;
        Map<Integer, Integer> personsToVotes = new HashMap<>();
        for (int i = 0; i < times.length; i++) {
            int time = times[i];
            int person = persons[i];
            int votes = personsToVotes.getOrDefault(person, 0) + 1;
            personsToVotes.put(person, votes);

            if (votes >= leaderVotes) {
                leaderVotes = votes;

                if (person != leader) {
                    leader = person;
                    timesToLeaders.add(new Vote(time, leader));
                }
            }
        }
    }

    // time - O(N*log(V))
    // space - O(1)
    public int q(int t) {
        int l = 1;
        int r = timesToLeaders.size();
        while (l < r) {
            int m = l + (r - l) / 2;
            if (timesToLeaders.get(m).time <= t) l = m + 1;
            else r = m;
        }
        return timesToLeaders.get(l - 1).person;
    }
}

/**
 * Your TopVotedCandidate object will be instantiated and called as such:
 * TopVotedCandidate obj = new TopVotedCandidate(persons, times);
 * int param_1 = obj.q(t);
 */