package kz.home.ys.algo.medium.capacityToShipPackagesWithinDDays;

class CapacityToShipPackagesWithinDDays {
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int weight : weights) {
            sum += weight;
            max = Math.max(max, weight);
        }

        return binarySearch(weights, days, max, sum);
    }
    
    private int binarySearch(int[] weights, int days, int start, int end) {
        while (start < end) {
            int mid = start + (end - start) / 2;
            boolean canShip = canShip(weights, days, mid);
            if (canShip) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    private boolean canShip(int[] weights, int days, int dailyMax) {
        int daysNeeded = 1, currSum = 0;
        for (int weight : weights) {
            currSum += weight;
            if (currSum > dailyMax) {
                daysNeeded++;
                currSum = weight;
            }
        }

        return daysNeeded <= days;
    }
}