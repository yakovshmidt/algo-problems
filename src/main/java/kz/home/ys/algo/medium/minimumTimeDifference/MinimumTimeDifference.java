package kz.home.ys.algo.medium.minimumTimeDifference;

import java.util.Arrays;
import java.util.List;

class MinimumTimeDifference {
    public int findMinDifference(List<String> timePoints) {
        /* 
        
        Constraints:

        "00:00" -> "00:00"
        
        time - O(N*Log(N))
        space - O(N)

        */

        int n = timePoints.size();
        int[] timePointsInMinutes = new int[n];
        for (int i = 0; i < n; i++) {
            String timePoint = timePoints.get(i);
            String[] hoursToMinutes = timePoint.split(":");
            Integer hoursInMinutes = Integer.parseInt(hoursToMinutes[0]) * 60;
            Integer minutes = Integer.parseInt(hoursToMinutes[1]);
            timePointsInMinutes[i] = hoursInMinutes + minutes;
        }

        Arrays.sort(timePointsInMinutes);

        int minMinutesDiff = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            minMinutesDiff = Math.min(timePointsInMinutes[i] - timePointsInMinutes[i - 1], minMinutesDiff);
        }
        minMinutesDiff = Math.min(timePointsInMinutes[0] + (24*60 - timePointsInMinutes[n - 1]), minMinutesDiff);

        return minMinutesDiff;
    }
}