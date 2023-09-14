package kz.home.ys.algo.medium.networkDelayTime;

import kz.home.ys.algo.helper.Pair;

import java.util.*;

class NetworkDelayTimeDFS {

    private Map<Integer, List<Pair<Integer, Integer>>> adj;
    private int[] signalReceivedAt;

    public int networkDelayTime(int[][] times, int n, int k) {
        this.adj = new HashMap<>();
        this.signalReceivedAt = new int[n + 1];
        Arrays.fill(this.signalReceivedAt, Integer.MAX_VALUE);
        for (int[] time : times) {
            int source = time[0];
            int target = time[1];
            int timeToTravel = time[2];

            adj.putIfAbsent(source, new ArrayList<>());
            adj.get(source).add(new Pair<>(timeToTravel, target));
        }

        for (var list : adj.values()) {
            list.sort(Comparator.comparingInt(Pair::getKey));
        }

        dfs(k, 0);

        int answer = Integer.MIN_VALUE;
        for (int node = 1; node <= n; node++) {
            answer = Math.max(answer, signalReceivedAt[node]);
        }

        return answer == Integer.MAX_VALUE ? -1 : answer;
    }

    private void dfs(int source, int currTime) {
        if (currTime >= signalReceivedAt[source]) return;

        signalReceivedAt[source] = currTime;

        if (!adj.containsKey(source)) return;

        List<Pair<Integer, Integer>> timesToTargets = adj.getOrDefault(source, new ArrayList<>());
        for (var timeToTarget : timesToTargets) {
            int timeToTravel = timeToTarget.getKey();
            int target = timeToTarget.getValue();
            dfs(target, currTime + timeToTravel);
        }
    }
}