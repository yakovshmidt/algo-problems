package kz.home.ys.algo.easy.findTheHighestAltitude;

class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int max = 0;
        for (int i = 0; i < gain.length; i++) {
            if (i == 0) {
                max = Math.max(max, gain[i]);
                continue;
            }
            gain[i] += gain[i - 1];
            max = Math.max(max, gain[i]);
        }
        return max;
    }
}