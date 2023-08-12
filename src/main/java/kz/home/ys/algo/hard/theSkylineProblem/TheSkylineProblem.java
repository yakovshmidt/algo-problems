package kz.home.ys.algo.hard.theSkylineProblem;

import java.util.*;

class TheSkylineProblem {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        SortedSet<Integer> edgeSet = new TreeSet<>();
        for (int[] building : buildings) {
            edgeSet.add(building[0]);
            edgeSet.add(building[1]);
        }

        List<Integer> positions = new ArrayList<>(edgeSet);

        List<List<Integer>> answer = new ArrayList<>();
        int maxHeight, left, right, height;

        for (int position : positions) {
            maxHeight = 0;

            for (int[] building : buildings) {
                left = building[0];
                right = building[1];
                height = building[2];

                if (left <= position && position < right) {
                    maxHeight = Math.max(maxHeight, height);
                }
            }

            if (answer.isEmpty() || answer.get(answer.size() - 1).get(1) != maxHeight) {
                answer.add(Arrays.asList(position, maxHeight));
            }
        }

        return answer;
    }
}