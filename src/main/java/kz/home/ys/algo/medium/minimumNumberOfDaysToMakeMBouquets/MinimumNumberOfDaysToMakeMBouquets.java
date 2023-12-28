package kz.home.ys.algo.medium.minimumNumberOfDaysToMakeMBouquets;

class MinimumNumberOfDaysToMakeMBouquets {

    // Time - O(N*log(N))
    // Space - O(1)
    public int minDays(int[] bloomDay, int m, int k) {
        if (bloomDay.length < (long) m * k) return -1;

        int l = Integer.MAX_VALUE, r = Integer.MIN_VALUE;
        for (int day : bloomDay) {
            r = Math.max(day, r);
            l = Math.min(day, l);
        }

        while (l < r) {
            int mid = l + (r - l) / 2;
            if (canMakeBouquets(bloomDay, m, k, mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }

        return l;
    }

    private boolean canMakeBouquets(int[] bloomDay, int m, int k, int day) {
        int currK = k;
        int currM = m;
        for (int d : bloomDay) {
            if (d <= day) {
                currK--;
                if (currK == 0) {
                    currM--;
                    if (currM == 0) return true;
                    currK = k;
                }
            } else {
                currK = k;
            }
        }
        return false;
    }
}