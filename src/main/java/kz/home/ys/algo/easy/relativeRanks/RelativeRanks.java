package kz.home.ys.algo.easy.relativeRanks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class RelativeRanks {

    // time - O(N*Log(N))
    // space - O(N)
    public String[] findRelativeRanks(int[] score) {
        Map<Integer, Integer> ranksToIndices = new HashMap<>();
        for (int i = 0; i < score.length; i++) {
            ranksToIndices.put(score[i], i);
        }
        Arrays.sort(score);
        String[] answer = new String[score.length];
        int placeNumber = 4;
        for (int i = score.length - 1; i >= 0; i--) {
            int rank = score[i];
            int index = ranksToIndices.get(rank);

            if (i == score.length - 1) {
                answer[index] = "Gold Medal";
            } else if (i == score.length - 2) {
                answer[index] = "Silver Medal";
            } else if (i == score.length - 3) {
                answer[index] = "Bronze Medal";
            } else {
                answer[index] = String.valueOf(placeNumber++);
            }
        }
        return answer;
    }
}