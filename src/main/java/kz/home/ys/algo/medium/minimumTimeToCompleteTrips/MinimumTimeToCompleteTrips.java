package kz.home.ys.algo.medium.minimumTimeToCompleteTrips;

class MinimumTimeToCompleteTrips {
    public long minimumTime(int[] time, int totalTrips) {
        int maxTime = 0;
        for (int t : time) {
            maxTime = Math.max(maxTime, t);
        }
        long left = 1, right = (long) maxTime * totalTrips;
        
        while (left < right) {
            long mid = left + (right - left) / 2;
            if (timeEnough(time, mid, totalTrips)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private boolean timeEnough(int[] time, long givenTime, long totalTrips) {
        long actualTrips = 0;
        for (int t : time) {
            actualTrips += givenTime / t;
        }
        return actualTrips >= totalTrips;
    }
}