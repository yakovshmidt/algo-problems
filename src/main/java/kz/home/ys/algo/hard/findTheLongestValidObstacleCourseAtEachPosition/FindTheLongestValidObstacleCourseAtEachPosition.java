package kz.home.ys.algo.hard.findTheLongestValidObstacleCourseAtEachPosition;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

class FindTheLongestValidObstacleCourseAtEachPosition {

    private int bisectRight(int[] arr, int target, int right) {
        if (right == 0) return 0;
        int left = 0;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public int[] longestObstacleCourseAtEachPosition(int[] obstacles) {
        int n = obstacles.length, lisLength = 0;
        int[] answer = new int[n], lis = new int[n];

        for (int i = 0; i < n; i++) {
            int height = obstacles[i];

            int idx = bisectRight(lis, height, lisLength);
            if (idx == lisLength) lisLength++;

            lis[idx] = height;
            answer[i] = idx + 1;
        }

        return answer;
    }
}