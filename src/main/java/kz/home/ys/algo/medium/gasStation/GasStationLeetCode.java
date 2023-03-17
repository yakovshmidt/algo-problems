package kz.home.ys.algo.medium.gasStation;

public class GasStationLeetCode {

    // time - O(N)
    // space - O(1)
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalTank = 0;
        int currTank = 0;
        int startingStation = 0;
        for (int i = 0; i < gas.length; i++) {
            int diff = gas[i] - cost[i];
            currTank += diff;
            totalTank += diff;
            if (currTank < 0) {
                startingStation = i + 1;
                currTank = 0;
            }
        }
        return (totalTank < 0) ? -1 : startingStation;
    }
}