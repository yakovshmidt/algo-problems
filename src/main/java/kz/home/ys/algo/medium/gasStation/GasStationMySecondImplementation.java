package kz.home.ys.algo.medium.gasStation;

class GasStationMySecondImplementation {

    // time - O(N^2)
    // space - O(1)
    public int canCompleteCircuit(int[] gas, int[] cost) {
        for (int i = 0; i < gas.length; i++) {
            if (canDoCircularRoute(i, gas, cost)) {
                return i;
            }
        }

        return -1;
    }

    private boolean canDoCircularRoute(int idx, int[] gas, int[] cost) {
        int gasTank = 0;
        int numberOfGasStations = gas.length;
        while (numberOfGasStations > 0) {
            gasTank += gas[idx];
            gasTank -= cost[idx];
            if (gasTank < 0) return false;
            idx = (idx == gas.length - 1) ? 0 : idx + 1;
            numberOfGasStations--;
        }
        return true;
    }
}