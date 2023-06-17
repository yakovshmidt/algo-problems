package kz.home.ys.algo.easy.teemoAttacking;

class TeemoAttacking {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int result = 0;
        for (int i = 0; i < timeSeries.length - 1; i++) {
            int startTime = timeSeries[i];
            int endTime = duration + startTime - 1;
            if (timeSeries[i + 1] <= endTime) {
                result += timeSeries[i + 1] - timeSeries[i];
            } else {
                result += duration;
            }
        }
        result += duration;
        return result;
    }
}