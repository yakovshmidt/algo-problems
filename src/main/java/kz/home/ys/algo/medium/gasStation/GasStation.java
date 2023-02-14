package kz.home.ys.algo.medium.gasStation;

class GasStation {

    // time - O(N^2)
    // space - O(1)
    public int canCompleteCircuit(int[] gas, int[] cost) {
        for (int i = 0; i < gas.length; i++) {
            int n = gas.length;
            int prevIdx = i;
            int currIdx;
            if (i + 1 >= n) currIdx = 0; else currIdx = i + 1;
            int remainingTank = gas[prevIdx];
            boolean canAchieve = true;
            while (n > 0) {
                remainingTank = remainingTank - cost[prevIdx];
                if (remainingTank > 0) {
                    remainingTank += gas[currIdx];
                    if (currIdx + 1 >= gas.length) currIdx = 0; else currIdx += 1;
                    if (prevIdx + 1 >= gas.length) prevIdx = 0; else prevIdx += 1;
                } else {
                    canAchieve = false;
                    break;
                }
                n--;
            }
            if (!canAchieve) continue;
            if (remainingTank >= 0) return i;
        }
        return -1;        
    }
}