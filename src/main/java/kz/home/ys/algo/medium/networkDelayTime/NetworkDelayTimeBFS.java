package kz.home.ys.algo.medium.networkDelayTime;

import kz.home.ys.algo.helper.Pair;

import java.util.*;

class NetworkDelayTimeBFS {

    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, List<Pair<Integer, Integer>>> adj = new HashMap<>();
        int[] signalReceivedAt = new int[n + 1];
        Arrays.fill(signalReceivedAt, Integer.MAX_VALUE);
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

        Queue<Pair<Integer, Integer>> queue = new PriorityQueue<>(Comparator.comparingInt(Pair::getKey));
        queue.add(new Pair<>(0, k));
        while (!queue.isEmpty()) {
            Pair<Integer, Integer> currNodeToTime = queue.remove();
            int currTime = currNodeToTime.getKey();
            int currNode = currNodeToTime.getValue();

            if (currTime >= signalReceivedAt[currNode]) continue;

            signalReceivedAt[currNode] = currTime;

            if (!adj.containsKey(currNode)) continue;

            List<Pair<Integer, Integer>> timesToTargets = adj.getOrDefault(currNode, new ArrayList<>());
            for (var timeToTarget : timesToTargets) {
                int timeToTravel = timeToTarget.getKey();
                int target = timeToTarget.getValue();
                queue.add(new Pair<>(timeToTravel + currTime, target));
            }
        }

        int answer = Integer.MIN_VALUE;
        for (int node = 1; node <= n; node++) {
            answer = Math.max(answer, signalReceivedAt[node]);
        }

        return answer == Integer.MAX_VALUE ? -1 : answer;
    }
}