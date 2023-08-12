package kz.home.ys.algo.hard.theSkylineProblem;

import java.util.*;

class TheSkylineProblemAnotherApproach {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        SortedSet<Integer> edgeSet = new TreeSet<>();
        for (int[] building : buildings) {
            edgeSet.add(building[0]);
            edgeSet.add(building[1]);
        }

        List<Integer> edges = new ArrayList<>(edgeSet);

        Map<Integer, Integer> edgeIndexMap = new HashMap<>();
        for (int i = 0; i < edges.size(); i++) {
            edgeIndexMap.put(edges.get(i), i);
        }

        int[] heights = new int[edges.size()];

        for (int[] building : buildings) {
            int left = building[0], right = building[1], height = building[2];
            int leftIdx = edgeIndexMap.get(left), rightIdx = edgeIndexMap.get(right);

            for (int i = leftIdx; i < rightIdx; i++) {
                heights[i] = Math.max(heights[i], height);
            }
        }

        List<List<Integer>> answer = new ArrayList<>();
        for (int i = 0; i < heights.length; i++) {
            int currHeight = heights[i], currPos = edges.get(i);
            if (answer.isEmpty() || answer.get(answer.size() - 1).get(1) != currHeight) {
                answer.add(List.of(currPos, currHeight));
            }
        }

        return answer;
    }
}