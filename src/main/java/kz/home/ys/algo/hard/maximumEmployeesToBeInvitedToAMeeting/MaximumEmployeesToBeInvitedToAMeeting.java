package kz.home.ys.algo.hard.maximumEmployeesToBeInvitedToAMeeting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MaximumEmployeesToBeInvitedToAMeeting {

    /*

    */
    public int maximumInvitations(int[] favorite) {
        int n = favorite.length;
        Map<Integer, List<Integer>> graph = new HashMap<>();
        boolean[] mutual = new boolean[n];
        for (int i = 0; i < n; i++) {
            mutual[i] = favorite[favorite[i]] == i;
            graph.computeIfAbsent(favorite[i], o -> new ArrayList<>()).add(i);
        }

        int[] seen = new int[n];
        int optionA = 0;
        for (int i = 0; i < n; i++) {
            if (mutual[i]) {
                optionA += chainLen(i, mutual, seen, graph);
            }
        }

        int optionB = 0;
        for (int i = 0; i < n; i++) {
            optionB = Math.max(optionB, cycleLen(i, i + 2, seen, graph));
        }

        return Math.max(optionA, optionB);
    }

    private int chainLen(int idx, boolean[] mutual, int[] seen, Map<Integer, List<Integer>> graph) {
        seen[idx] = 1;
        int ans = 0;
        for (int next : graph.getOrDefault(idx, new ArrayList<>())) {
            if (!mutual[next]) {
                ans = Math.max(chainLen(next, mutual, seen, graph), ans);
            }
        }

        return ans + 1;
    }

    private int cycleLen(int idx, int visited, int[] seen, Map<Integer, List<Integer>> graph) {
        if (seen[idx] == visited) return 0;
        if (seen[idx] > 0) return -1_000_000;
        int ans = -1_000_000;
        seen[idx] = visited;
        for (int next : graph.getOrDefault(idx, new ArrayList<>())) {
            ans = Math.max(ans, cycleLen(next, visited, seen, graph));
        }
        return ans + 1;
    }
}